-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2024 at 08:45 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `buku`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(10) NOT NULL,
  `judul_buku` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `harga` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul_buku`, `penerbit`, `harga`) VALUES
(1, 'Pemograman Web 2', 'Erlangga', '162500'),
(3, 'Tereliye', 'Agus Subekti', '15000'),
(4, 'malam jadi siang', 'Junaidi', '15000'),
(5, 'Laskar Pelangi', 'Santoso', '20000'),
(6, 'Bukan Untuk MU', 'Rajawali Cetak', '192000'),
(7, 'Mencari Islam di Negri Barat', 'Erlanga', '143000'),
(8, 'Jendela Dunia', 'PT. Persero', '193000'),
(12, 'Sinar kehidupan', 'Borneo Cetak', '75400');

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `id_pembeli` int(3) NOT NULL,
  `nama_pembeli` varchar(50) NOT NULL,
  `alamat_pembeli` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`id_pembeli`, `nama_pembeli`, `alamat_pembeli`) VALUES
(1, 'evis', 'Jl. Kenanga'),
(3, 'Arif', 'Jl. Kmerdekaan'),
(4, 'Amelia', 'Jl. Anggrek'),
(5, 'Denis', 'Jl. Manggis'),
(6, 'Arman', 'banjarmasin'),
(7, 'aflah', 'dompu'),
(8, 'Sajali', 'Lombok');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(5) NOT NULL,
  `Nama_pembeli` varchar(10) NOT NULL,
  `tanggal` date NOT NULL,
  `harga` varchar(30) NOT NULL,
  `jumlah` varchar(10) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `Nama_pembeli`, `tanggal`, `harga`, `jumlah`, `total`) VALUES
(1, 'wajarman', '2024-01-01', '100000', '5', '500000'),
(2, 'fikri', '2024-01-01', '162500', '2', '325000'),
(3, 'Arman', '2024-01-05', '162500', '3', '487500'),
(4, 'pahrul', '2024-01-02', '162500', '1', '162500');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`id_pembeli`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `id_buku` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `pembeli`
--
ALTER TABLE `pembeli`
  MODIFY `id_pembeli` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
