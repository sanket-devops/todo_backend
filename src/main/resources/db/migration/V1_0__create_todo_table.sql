CREATE TABLE IF NOT EXISTS `todo`
(
    `id`          int(11) unsigned NOT NULL AUTO_INCREMENT,
    `title`       varchar(255)     NOT NULL,
    `description` varchar(255)     NOT NULL,
    `created_at`  timestamp        NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  AUTO_INCREMENT = 1;
