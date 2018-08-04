DROP TABLE IF EXISTS `event`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `article` (
  `id` bigint(11) NOT NULL auto_increment,  
  `name` varchar(255) default NULL,
  `description` text default NULL,
  `address` text default NULL,
  `event_date` datetime default NULL,  
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1160 DEFAULT CHARSET=utf8;
SET character_set_client = @saved_cs_client;
