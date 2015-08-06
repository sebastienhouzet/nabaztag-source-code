CREATE DATABASE `rfid`;

CREATE TABLE  `rfid`.`rfid_fab` (
  `rfid_fab_id` int(10) unsigned NOT NULL auto_increment,
  `rfid_fab_name` varchar(45) NOT NULL,
  `rfid_fab_type` varchar(45) NOT NULL,
  `rfid_fab_creation` timestamp NOT NULL default '0000-00-00 00:00:00',
  `rfid_fab_last_use` timestamp NOT NULL default '0000-00-00 00:00:00',
  PRIMARY KEY  (`rfid_fab_id`),
  UNIQUE KEY `rfid_fab_name_uniq` (`rfid_fab_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE  `rfid`.`rfid_tag` (
  `rfid_tag_id` int(10) unsigned NOT NULL auto_increment,
  `rfid_tag_serial` varchar(45) NOT NULL,
  `rfid_tag_creation_date` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `rfid_tag_color` int(10) unsigned NOT NULL,
  `rfid_tag_recolored` tinyint(1) NOT NULL default '0',
  `rfid_tag_mod_date` timestamp NOT NULL default '0000-00-00 00:00:00',
  `rfid_tag_mod_count` int(10) unsigned NOT NULL default '0',
  `rfid_tag_fab` int(10) unsigned default NULL,
  PRIMARY KEY  (`rfid_tag_id`),
  UNIQUE KEY `rfid_tag_serial_uniq` USING BTREE (`rfid_tag_serial`),
  KEY `FK_rfid_tag_fab` (`rfid_tag_fab`),
  KEY `FK_rfid_tag_color` (`rfid_tag_color`),
  CONSTRAINT `FK_rfid_tag_fab` FOREIGN KEY (`rfid_tag_fab`) REFERENCES `rfid_fab` (`rfid_fab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
