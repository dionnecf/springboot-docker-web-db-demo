use tododb;

CREATE TABLE `to_do_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `completed` bit(1) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `item_desc` varchar(255) DEFAULT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into to_do_item (item_name, item_desc, created_date, completed) values('Train Travel','Remember to purchase your train ticket', STR_TO_DATE('04/06/2017', '%m/%d/%Y'),false);
insert into to_do_item (item_name, item_desc, created_date, completed) values('Tube Travel','Remember to purchase your travelcard for tube', STR_TO_DATE('04/06/2017', '%m/%d/%Y'),false);
insert into to_do_item (item_name, item_desc, created_date, completed) values('Snacks','Remember to purchase some snacks for your journey', STR_TO_DATE('04/06/2017', '%m/%d/%Y'),false);
insert into to_do_item (item_name, item_desc, created_date, completed) values('Dry Cleaning','Remember to pick up your dry cleaning before you go', STR_TO_DATE('04/06/2017', '%m/%d/%Y'),false);
