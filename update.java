/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database01;

import javax.swing.JOptionPane;

/**
 *
 * @author iqbal
 */
public class update {

    Koneksi konek = new Koneksi();

    public void update(int nim, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_nama = "update identitas set nama = '" + nama + "'where nim = '" + nim + "'";
            String sql_alamat = "update identitas set alamat = '" + alamat + "'where nim = '" + nim + "'";
            String sql_jk = "update identitas set jeniskelamin = '" + jk + "'where nim = '" + nim + "'";
            String sql_nim1 = "update identitas set nim = '" + nim + "'where nama = '" + nama + "'";
            String sql_nim2 = "update identitas set nim = '" + nim + "'where alamat = '" + alamat + "'";

            statement.executeUpdate(sql_nim1);
            statement.executeUpdate(sql_nim2);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jk);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
