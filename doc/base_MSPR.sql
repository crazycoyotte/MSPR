-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3307
-- Généré le : mar. 28 fév. 2023 à 15:19
-- Version du serveur : 10.10.2-MariaDB
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `mspr`
--

-- --------------------------------------------------------

--
-- Structure de la table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `idProduct` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `brand` varchar(50) DEFAULT NULL,
  `category` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idProduct`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `products`
--

INSERT INTO `products` (`idProduct`, `name`, `price`, `brand`, `category`) VALUES
(1, 'My Best Friend\'s Wife', 9.45, 'Bode Inc', 'Comedy'),
(2, 'Legend of Rita, The (Stille nach dem Schuß, Die)', 14.78, 'King-Doyle', 'Drama'),
(3, 'Urban Menace', 17.12, 'Lockman, Miller and Hyatt', 'Action|Horror'),
(4, 'Get Educated: Paathshaala', 11.07, 'Rosenbaum and Sons', 'Drama'),
(5, 'Shriek of the Mutilated', 16.9, 'Leffler Group', 'Horror'),
(6, 'Proof', 18.45, 'Watsica and Sons', 'Drama'),
(7, 'Welcome to Mooseport', 10.74, 'Krajcik, MacGyver and Quitzon', 'Comedy'),
(8, 'Return to Oz', 11.81, 'Jaskolski, Keebler and Marvin', 'Adventure|Children|Fantasy'),
(9, 'Atomic Brain, The', 13.96, 'Yundt and Sons', 'Horror|Sci-Fi'),
(10, 'Bend It Like Beckham', 7.31, 'Towne-Beier', 'Comedy|Drama|Romance'),
(12, 'Employees Leaving the Lumière Factory', 12.02, 'West-Kozey', 'Documentary'),
(13, 'Balls Out: Gary the Tennis Coach', 5.26, 'Lindgren-Heidenreich', 'Comedy'),
(14, 'Hidden (a.k.a. Cache) (Caché)', 8.68, 'Tillman-Rohan', 'Drama|Mystery|Thriller'),
(15, 'Dealer', 9.21, 'Davis and Sons', 'Drama'),
(16, 'Slingshot Hip Hop', 14.96, 'Prohaska, Mayer and Christiansen', '(no genres listed)'),
(17, 'Yellow Handkerchief, The', 9.9, 'Erdman, Medhurst and Metz', 'Drama|Romance'),
(18, 'Love Wrecked', 13, 'Brakus-King', 'Comedy|Romance'),
(19, 'Driven', 14.06, 'Orn Inc', 'Action|Thriller'),
(21, 'Going to Kansas City', 12.88, 'Kerluke-Walker', 'Drama|Romance|Thriller'),
(22, 'Show of Force, A', 10.79, 'Corkery-Ryan', 'Drama|Thriller'),
(23, 'Scream', 5.76, 'Morissette and Sons', 'Comedy|Horror|Mystery|Thriller'),
(24, 'Casper\'s Haunted Christmas', 19.5, 'Tremblay, Kovacek and Carroll', 'Animation|Children'),
(25, 'Young at Heart (a.k.a. Young@Heart)', 18.4, 'Hayes-McLaughlin', 'Documentary|Musical'),
(26, 'Witchfinder General (Conquerer Worm, The)', 10.65, 'Block-Rippin', 'Horror'),
(27, 'Christmas in Connecticut', 5.28, 'Pouros, Kulas and Howe', 'Comedy|Romance'),
(28, 'Tyson', 18.48, 'Lind, Harvey and Lind', 'Drama'),
(29, 'Bear, The (Ours, L\')', 10.22, 'Fisher-Mohr', 'Adventure|Children|Drama'),
(31, 'Angriest Man in Brooklyn, The', 19.57, 'Wiza Inc', 'Comedy|Drama'),
(32, 'Money Pit, The', 19.25, 'Kiehn-Stroman', 'Comedy'),
(33, 'Justice League: Throne of Atlantis', 9.21, 'Murphy, Hodkiewicz and Hermiston', 'Action|Animation'),
(34, 'Dreamworlds II: Desire, Sex, Power in Music Video', 16.75, 'Kautzer, Lebsack and Jakubowski', 'Documentary'),
(35, 'Atomic Twister', 5.19, 'Funk LLC', 'Action|Drama|Sci-Fi'),
(36, 'See No Evil', 9.66, 'Stiedemann-Heathcote', 'Horror'),
(37, '8 Women', 14.09, 'Oberbrunner and Sons', 'Comedy|Crime|Musical|Mystery'),
(38, 'Flaming Star', 15.19, 'Grady-Corkery', 'Western'),
(39, 'Hound of the Baskervilles, The', 15.59, 'Koepp, Graham and Dibbert', 'Crime|Mystery'),
(41, '$5 a Day', 19.42, 'Schmitt-Schneider', 'Comedy|Drama'),
(42, 'Dr. Terror\'s House of Horrors', 13.41, 'Dibbert, Considine and Lehner', 'Horror|Sci-Fi'),
(43, 'How the Grinch Stole Christmas!', 9.54, 'Pollich Inc', 'Animation|Comedy|Fantasy|Musical'),
(44, 'Chocolate Soldier, The', 11.77, 'Okuneva-Lueilwitz', 'Comedy|Musical'),
(45, 'På sista versen', 18.22, 'Blick, Ratke and Dickens', 'Comedy'),
(47, 'Blood of the Vampire', 18.13, 'Morar-Waters', 'Horror|Sci-Fi'),
(48, 'Here Comes the Devil (Ahí va el diablo)', 9.2, 'Lind Group', 'Horror|Thriller'),
(49, 'Yossi & Jagger', 19.08, 'Mohr-Gutmann', 'Drama|Romance'),
(50, 'Member of the Wedding, The', 10.72, 'Skiles-Wisozk', 'Drama'),
(51, 'Judgement Day', 12.72, 'Hammes-Krajcik', '(no genres listed)'),
(11, 'NATO\'s Secret Armies (Gladio: L\'esercito segreto della Nato)', 5.41, 'Smith, Farrell and Rosenbaum', 'Documentary'),
(20, 'Disney Princess Collection: Jasmine\'s Enchanted Tales: Jasmine\'s Wish', 18.36, 'Weimann, Rowe and Rohan', 'Animation'),
(30, 'Zero de conduite (Zero for Conduct) (Zéro de conduite: Jeunes diables au collège)', 14.85, 'Jast LLC', 'Comedy|Drama'),
(40, 'Television Under the Swastika (Das Fernsehen unter dem Hakenkreuz)', 14.85, 'Bogisich-Stokes', 'Documentary'),
(46, 'I am Von Höfler (Variation on Werther - Private Hungary 15)', 10.82, 'Okuneva-Wilkinson', 'Documentary');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
