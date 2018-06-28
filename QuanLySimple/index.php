<?php
require_once 'dbconfig.php';
  
try {
    $pdo = new PDO("mysql:host=$host;dbname=$dbname", $username, $password);
  
    $sql = 'SELECT id,
                    name,
                    school
               FROM dulieu
              ORDER BY id';
  
    $q = $pdo->query($sql);
    $q->setFetchMode(PDO::FETCH_ASSOC);
} catch (PDOException $e) {
    die("Could not connect to the database $dbname :" . $e->getMessage());
}
?>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Trang quản lý</title>
  
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>

  <h1>  <span>Trang quản lý</span> </h1>

<table class="responstable">
  
  <tr>
   
    <th>ID</th>
    <th>Name</th>
    <th>School</th>
  </tr>
  
   <?php while ($row = $q->fetch()): ?>
                        <tr>
                            <td><?php echo htmlspecialchars($row['id']) ?></td>
                            <td><?php echo htmlspecialchars($row['name']); ?></td>
                            <td><?php echo htmlspecialchars($row['school']); ?></td>
                        </tr>
                    <?php endwhile; ?>
  
</table>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js'></script>

  

</body>

</html>
