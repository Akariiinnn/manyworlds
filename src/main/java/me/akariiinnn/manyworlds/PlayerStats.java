package me.akariiinnn.manyworlds;

import org.bukkit.entity.Player;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PlayerStats {

    public static SQLConnect sql = new SQLConnect();

    public static void createStats(Player player)
    {
        try {
            Connection connection = sql.getConnection();
            Statement statement = connection.createStatement();
            String sql = "INSERT IGNORE INTO PlayerStatsSpeed VALUES (\"" + player.getName() + "\", null, null, null, null);";
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveStats(Player player)
    {
        try {
            Connection connection = sql.getConnection();
            Statement statement = connection.createStatement();
            String sql = "UPDATE PlayerStatsSpeed SET last_x = " + player.getLocation().getBlockX() + ", last_y = " + player.getLocation().getBlockY() + ", last_z = " + player.getLocation().getBlockZ() + ", last_world = \"" + player.getWorld().getName() + "\" WHERE username = \"" + player.getName() + "\";";
            statement.execute(sql);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
