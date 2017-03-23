-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 23 Mars 2017 à 16:31
-- Version du serveur :  5.7.9
-- Version de PHP :  5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `ppe4`
--

-- --------------------------------------------------------

--
-- Structure de la table `domaine`
--

DROP TABLE IF EXISTS `domaine`;
CREATE TABLE IF NOT EXISTS `domaine` (
  `id_dom` int(11) NOT NULL AUTO_INCREMENT,
  `lib_dom` varchar(30) NOT NULL,
  PRIMARY KEY (`id_dom`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `experience`
--

DROP TABLE IF EXISTS `experience`;
CREATE TABLE IF NOT EXISTS `experience` (
  `id_exp` int(11) NOT NULL AUTO_INCREMENT,
  `entreprise` int(11) NOT NULL,
  `ville_exp` varchar(30) NOT NULL,
  `pays_exp` varchar(30) NOT NULL,
  `date_debut` date NOT NULL,
  `date_fin` date NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`id_exp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

DROP TABLE IF EXISTS `formation`;
CREATE TABLE IF NOT EXISTS `formation` (
  `id_form` int(11) NOT NULL AUTO_INCREMENT,
  `ecole` varchar(100) NOT NULL,
  `ville_ecole` varchar(30) NOT NULL,
  `pays_ecole` varchar(30) NOT NULL,
  `diplome` varchar(100) NOT NULL,
  `annee_debut` int(11) NOT NULL,
  `annee_fin` int(11) NOT NULL,
  `id_util` int(11) NOT NULL,
  PRIMARY KEY (`id_form`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `interet`
--

DROP TABLE IF EXISTS `interet`;
CREATE TABLE IF NOT EXISTS `interet` (
  `id_int` int(11) NOT NULL AUTO_INCREMENT,
  `lib_int` varchar(30) NOT NULL,
  PRIMARY KEY (`id_int`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `type_interet`
--

DROP TABLE IF EXISTS `type_interet`;
CREATE TABLE IF NOT EXISTS `type_interet` (
  `id_type_int` int(11) NOT NULL AUTO_INCREMENT,
  `lib_type_int` varchar(30) NOT NULL,
  PRIMARY KEY (`id_type_int`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_util` int(11) NOT NULL AUTO_INCREMENT,
  `nom_util` varchar(30) NOT NULL,
  `prenom_util` int(30) NOT NULL,
  `dna_util` date NOT NULL,
  `sexe` varchar(1) NOT NULL,
  `situation` varchar(30) NOT NULL,
  `secteur_util` int(11) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `photo` varchar(250) NOT NULL,
  `pays` varchar(30) NOT NULL,
  `ville` varchar(30) NOT NULL,
  `cp` varchar(10) NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`id_util`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `util_int`
--

DROP TABLE IF EXISTS `util_int`;
CREATE TABLE IF NOT EXISTS `util_int` (
  `id_util` int(11) NOT NULL,
  `id_int` int(11) NOT NULL,
  PRIMARY KEY (`id_util`,`id_int`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
