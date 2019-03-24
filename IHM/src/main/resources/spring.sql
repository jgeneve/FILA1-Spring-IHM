-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 24 mars 2019 à 16:14
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `spring`
--

-- --------------------------------------------------------

--
-- Structure de la table `distance`
--

DROP TABLE IF EXISTS `distance`;
CREATE TABLE IF NOT EXISTS `distance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ville_depart_id` int(11) DEFAULT NULL,
  `ville_arrivee_id` int(11) DEFAULT NULL,
  `distance` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_distance_ville_depart_id_idx` (`ville_depart_id`),
  KEY `fk_distance_ville_arrivee_id_idx` (`ville_arrivee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `distance`
--

INSERT INTO `distance` (`id`, `ville_depart_id`, `ville_arrivee_id`, `distance`) VALUES
(1, 1, 2, 180),
(2, 2, 1, 180),
(3, 1, 3, 120),
(4, 3, 1, 120),
(5, 1, 4, 140),
(6, 4, 1, 140);

-- --------------------------------------------------------

--
-- Structure de la table `offre`
--

DROP TABLE IF EXISTS `offre`;
CREATE TABLE IF NOT EXISTS `offre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ville_depart_id` int(11) DEFAULT NULL,
  `ville_arrivee_id` int(11) DEFAULT NULL,
  `nombre_passagers` int(11) DEFAULT NULL,
  `date_offre` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_offre_ville_depart_id_idx` (`ville_depart_id`),
  KEY `fk_offre_ville_arrivee_id_idx` (`ville_arrivee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
CREATE TABLE IF NOT EXISTS `transactions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_transaction` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `transaction_id` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `transaction_offre`
--

DROP TABLE IF EXISTS `transaction_offre`;
CREATE TABLE IF NOT EXISTS `transaction_offre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `offre_id` int(11) DEFAULT NULL,
  `statut` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `date_transaction_offre` datetime DEFAULT NULL,
  `nombre_passagers` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_transaction_offre_id_idx` (`offre_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `transaction_sillon`
--

DROP TABLE IF EXISTS `transaction_sillon`;
CREATE TABLE IF NOT EXISTS `transaction_sillon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `statut` enum('reserver','annuler') COLLATE utf8_bin DEFAULT NULL,
  `distance_id` int(11) DEFAULT NULL,
  `date_transaction_sillon` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_transaction_sillon_distance_id_idx` (`distance_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `transaction_travaux`
--

DROP TABLE IF EXISTS `transaction_travaux`;
CREATE TABLE IF NOT EXISTS `transaction_travaux` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_travaux` datetime DEFAULT NULL,
  `numero_sillon` int(11) DEFAULT NULL,
  `cause` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

DROP TABLE IF EXISTS `ville`;
CREATE TABLE IF NOT EXISTS `ville` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `ville`
--

INSERT INTO `ville` (`id`, `nom`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C'),
(4, 'D');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `distance`
--
ALTER TABLE `distance`
  ADD CONSTRAINT `fk_distance_ville_arrivee_id` FOREIGN KEY (`ville_arrivee_id`) REFERENCES `ville` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_distance_ville_depart_id` FOREIGN KEY (`ville_depart_id`) REFERENCES `ville` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `offre`
--
ALTER TABLE `offre`
  ADD CONSTRAINT `fk_offre_ville_arrivee_id` FOREIGN KEY (`ville_arrivee_id`) REFERENCES `ville` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_offre_ville_depart_id` FOREIGN KEY (`ville_depart_id`) REFERENCES `ville` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `transaction_offre`
--
ALTER TABLE `transaction_offre`
  ADD CONSTRAINT `fk_transaction_offre_id` FOREIGN KEY (`offre_id`) REFERENCES `offre` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `transaction_sillon`
--
ALTER TABLE `transaction_sillon`
  ADD CONSTRAINT `fk_transaction_sillon_distance_id` FOREIGN KEY (`distance_id`) REFERENCES `distance` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
