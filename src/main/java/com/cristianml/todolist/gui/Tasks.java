package com.cristianml.todolist.gui;

import com.cristianml.todolist.logic.EditTaskListener;
import com.cristianml.todolist.logic.LogicController;
import com.cristianml.todolist.logic.Task;
import java.awt.Component;
import java.util.LinkedList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class Tasks extends javax.swing.JFrame implements EditTaskListener{
    LinkedList<Task> taskList;
    DefaultTableModel tableModel;
    LogicController control = null;

    public Tasks() {
        initComponents();
        this.control = new LogicController();
        this.taskList = new LinkedList<>();
        
        loadDatas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTask = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(150, 20, 6));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TASK MANAGER");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Task List:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Write a Task:");

        btnAdd.setText("Add Task");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit Task");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Task");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTask, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(txtTask))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String description = txtTask.getText();
        Task task = new Task(1, description);
        control.createTask(task);
        tableModel.setRowCount(0);
        loadDatas();
        
    }//GEN-LAST:event_btnAddActionPerformed

    // Delete a task
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        if (tblTable.getRowCount() > 0) {
            if (tblTable.getSelectedRow()!= -1) {
                int index = tblTable.getSelectedRow();
                Task task = taskList.get(index);
                control.deleteTask(task.getId());
                showMassage("Deleted succesfully.", "inf", "Delete taks.");
                tableModel.setRowCount(0);
                loadDatas();
            } else {
                showMassage("None row selected.", "error", "Selected error.");
            }
        } else {
            showMassage("The table is empty.", "error", "Table empty.");
        }
            
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (tblTable.getRowCount() > 0) {
            if (tblTable.getSelectedRow() != -1) {
                int index = tblTable.getSelectedRow();
                Task task = taskList.get(index);
                EditTask editWindow = new EditTask(task);
                // Set this listener to notify
                editWindow.setEditTaskListener(this);
                editWindow.setVisible(true);
                editWindow.setLocationRelativeTo(null);
                
            } else { 
                showMassage("None row selected.", "error", "Selected error.");
                }
             } else {
                showMassage("The table is empty.", "error", "Table empty.");
             }
        
    }//GEN-LAST:event_btnEditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtTask;
    // End of variables declaration//GEN-END:variables

    // Create the Table Model
    public void loadDatas() {
        tableModel = new DefaultTableModel(){
            // Columns not editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };
        
        
        // We create the name columns of the table
        String[] nameColumns = {"Task","Done"};
        tableModel.setColumnIdentifiers(nameColumns);
        
        // We added the tasks to the modelTable
        taskList = control.bringTaskList();
        
        for (Task task : taskList) {
            Object[] taskObj = {task.getDescription(), task.isStatus()};
            tableModel.addRow(taskObj);
        }
        
        tblTable.setModel(tableModel);
        
        // Define the renderer and the editor of the column where you want to have the checkboxes.
        TableColumn checkboxColumn = tblTable.getColumnModel().getColumn(1);
        checkboxColumn.setCellRenderer(tblTable.getDefaultRenderer(Boolean.class));
        checkboxColumn.setCellEditor(tblTable.getDefaultEditor(Boolean.class));
        
        // Agregar un listener al modelo de la tabla para detectar cambios en las celdas
        tblTable.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int row = e.getFirstRow();
                int column = e.getColumn();
                if (column == 1) { // Verificar si se modificó la columna de los checkboxes
                    TableModel model = (TableModel)e.getSource();
                    boolean isChecked = (Boolean)model.getValueAt(row, column); // Obtener el nuevo estado del checkbox
                    Task task = taskList.get(row); // Obtener la tarea correspondiente a la fila
                    task.setStatus(isChecked); // Actualizar el estado de la tarea
                    control.editTask(task);
                    loadDatas(); // we call the same method so that the task is crossed out
                }
            }
        });
        // Aplicar el renderizador personalizado a la columna "Task"
        tblTable.getColumnModel().getColumn(0).setCellRenderer(new TaskCellRenderer());
        // Block the columns
        tblTable.getTableHeader().setReorderingAllowed(false);
        
        }
        
        public void showMassage(String message, String type, String title) {
            JOptionPane optionPane = new JOptionPane(message);
            if (type.equals("inf")) {
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            } else if (type.equals("error")) {
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
            JDialog dialog = optionPane.createDialog(title);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

        // interface Method to refresh the table
        @Override
        public void editTaskClosed() {
            loadDatas();
        }
        
        
      
    // Crear el renderizador personalizado para la columna "Task"
    class TaskCellRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            boolean isDone = (boolean) table.getValueAt(row, 1); // Verificar si el checkbox está marcado
            if (isDone) {
                // Tachar el texto si el checkbox está marcado
                ((JLabel) cellComponent).setText("<html><strike>" + value.toString() + "</strike></html>");
            } else {
                // Mostrar el texto sin tachar si el checkbox no está marcado
                ((JLabel) cellComponent).setText(value.toString());
            }
            return cellComponent;
        }
    }
    }


    
    

