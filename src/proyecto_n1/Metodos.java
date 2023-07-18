package proyecto_n1;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Metodos {
    public void actualizarTabla(JTable table, int id, String nombre, int maquinas, boolean cross, int clientes, int fila) {
        table.getModel().setValueAt(id, fila, 0);
        table.getModel().setValueAt(nombre, fila, 1);
        table.getModel().setValueAt(maquinas, fila, 2);
        table.getModel().setValueAt(cross, fila, 3);
        table.getModel().setValueAt(clientes, fila, 4);
    }
    
    public void mostrarPanel(JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JPanel panel5) {
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(true);
    }
    
    public void vaciarRows(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    //Codigo obtenido, modificado y utilizado de lawebdelprogramador
    public Object[][] ordenarMaquinasInserccion(ArrayList list) {
        Object[][] copiarRegistros = new Object[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            RegistrarGS registro = (RegistrarGS) list.get(i);
            Object[] copiarRegistro = new Object[]{registro.getId(), registro.getNombre(), registro.getCanMaquinas(), registro.getCross(), registro.getCanClientes()};
            copiarRegistros[i] = copiarRegistro;
        }

        for (int i = 1; i < copiarRegistros.length; i++) {
            Object[] recorrer = copiarRegistros[i];
            int j = i - 1;
            while (j >= 0 && (int) recorrer[2] < (int) copiarRegistros[j][2]) {
                copiarRegistros[j + 1] = copiarRegistros[j];
                j--;
            }
            copiarRegistros[j + 1] = recorrer;
        }

        return copiarRegistros;
    }
    //lawebdelprogramador. (10 de febrero del 2021). Código de Java - Ordenar un array utilizando el método de inserción en Java. www.lawebdelprogramador.com https://www.lawebdelprogramador.com/codigo/Java/6874-Ordenar-un-array-utilizando-el-metodo-de-insercion-en-Java.html#:~:text=%2A%20Funcion%20para%20ordenar%20un%20array%20por%20el,1%29%20%26%26%20%28array%20%5B%20j%5D%20%3E%20current%29%29%20%7B
    
    //Codigo obtenido, modificado y utilizado de lawebdelprogramador
    public Object[][] ordenarNombreInserccion(ArrayList list) {
        Object[][] copiarRegistros = new Object[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            RegistrarGS registro = (RegistrarGS) list.get(i);
            Object[] copiarRegistro = new Object[]{registro.getId(), registro.getNombre(), registro.getCanMaquinas(), registro.getCross(), registro.getCanClientes()};
            copiarRegistros[i] = copiarRegistro;
        }

        for (int i = 1; i < copiarRegistros.length; i++) {
            Object[] recorrer = copiarRegistros[i];
            int j = i - 1;
            while (j >= 0 && ((String) recorrer[1]).compareTo((String) copiarRegistros[j][1]) < 0) {
                copiarRegistros[j + 1] = copiarRegistros[j];
                j--;
            }
            copiarRegistros[j + 1] = recorrer;
        }
        return copiarRegistros;
    }
    //lawebdelprogramador. (10 de febrero del 2021). Código de Java - Ordenar un array utilizando el método de inserción en Java. www.lawebdelprogramador.com https://www.lawebdelprogramador.com/codigo/Java/6874-Ordenar-un-array-utilizando-el-metodo-de-insercion-en-Java.html#:~:text=%2A%20Funcion%20para%20ordenar%20un%20array%20por%20el,1%29%20%26%26%20%28array%20%5B%20j%5D%20%3E%20current%29%29%20%7B
    
    public Object[][] copiarDatos(ArrayList list) {
        Object[][] copiarRegistros = new Object[list.size()][];
        
        for (int i = 0; i < list.size(); i++) {
            RegistrarGS registro = (RegistrarGS) list.get(i);
            Object[] copiarRegistro = new Object[]{registro.getId(), registro.getNombre(), registro.getCanMaquinas(), registro.getCross(), registro.getCanClientes()};
            copiarRegistros[i] = copiarRegistro;
        }
        
        return copiarRegistros;
    }
    
    //Codigo obtenido, modificado y utilizado de Platzi
    public void mergeSortByName(Object[][] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSortByName(arr, left, middle);
            mergeSortByName(arr, middle + 1, right);
            mergeByName(arr, left, middle, right);
        }
    }

    private void mergeByName(Object[][] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Object[][] leftArr = new Object[n1][];
        Object[][] rightArr = new Object[n2][];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (((String) leftArr[i][1]).compareTo((String) rightArr[j][1]) <= 0) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    //Platzi. (s.f). Merge sort en Java. platzi.com https://platzi.com/tutoriales/1469-algoritmos-practico/4260-merge-sort-en-java/
    
    //Codigo obtenido, modificado y utilizado de Platzi
    public void mergeSortByMaquinas(Object[][] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSortByMaquinas(arr, left, middle);
            mergeSortByMaquinas(arr, middle + 1, right);
            mergeByMaquinas(arr, left, middle, right);
        }
    }
   
    private void mergeByMaquinas(Object[][] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Object[][] leftArr = new Object[n1][];
        Object[][] rightArr = new Object[n2][];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if ((int) leftArr[i][2] <= (int) rightArr[j][2]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    //Platzi. (s.f). Merge sort en Java. platzi.com https://platzi.com/tutoriales/1469-algoritmos-practico/4260-merge-sort-en-java/
}
