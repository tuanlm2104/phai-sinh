package ps;


import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.awt.Point;

import javax.swing.JFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.TableView.TableCell;

import java.awt.Color;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Children extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int frx, fry;
	private TableColumn col0, col2;
	@SuppressWarnings("deprecation")
	private TableCell cell;
	JLabel lblTB = new JLabel("New label");
	boolean autock = false;
	int mx1 = 215, my1 = 281;
	int ick = 0;
	WebDriver driverStock;
	@SuppressWarnings("rawtypes")
	JComboBox ComList1 = new JComboBox();
	@SuppressWarnings("rawtypes")
	JComboBox ComList2 = new JComboBox();
	List<String> listck = new ArrayList<String>();
	List<String> listckfilter = new ArrayList<String>();
	Thread threadstock;
	Runnable StockThread;
	JFrame frame;

	private JTable table;

	public Children() {
		initializeForm();

	}

	private void initializeForm() {

		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);

		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\jar\\ruby2.jpg"));
		frame.setBounds(100, 100, 450, 189);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnStartPreview = new JButton("");
		btnStartPreview.setToolTipText("start");
		btnStartPreview.addMouseListener(new MouseAdapter() {
			private Scanner sc;
			private Scanner scfilter;

			@SuppressWarnings("unchecked")
			@Override
			public void mouseClicked(MouseEvent e) {
				System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver.exe");
				System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
				System.setProperty("webdriver.edge.driver", "C://drivers//msedgedriver.exe");

				driverStock = new ChromeDriver();

				// ChromeDriver driverStock = new ChromeDriver();

				driverStock.get("https://ta.vietstock.vn/");

				driverStock.switchTo().frame(driverStock.findElement(By.xpath("//*[contains(@id,'tradingview')]")));

				File file = new File("c:\\list.txt");
				File filefilter = new File("c:\\filename.txt");

				try {
					sc = new Scanner(file);
					scfilter = new Scanner(filefilter);

					while (sc.hasNextLine()) {
						String requestedSeat = sc.nextLine();
						listck.add(requestedSeat);
						ComList1.addItem(requestedSeat);

					}

					while (scfilter.hasNextLine()) {
						String requestedSeat = scfilter.nextLine();
						System.out.println("go here");
						listckfilter.add(requestedSeat);
						ComList2.addItem(requestedSeat);

					}

				} catch (FileNotFoundException e1) {

					e1.printStackTrace();
				}

				// jse.executeScript("arguments[0].value='AAA';", element);
				// driverStock.findElement(By.xpath("//input[@id='library-container'])).setAttribute("value",
				// "your value");

				threadstock = new Thread(StockThread);
				threadstock.start();
			}

		});
		// -----------------
		JButton btnTang = new JButton("");
		btnTang.setToolTipText("toi");
		btnTang.setBackground(new Color(144, 238, 144));
		btnTang.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void mouseClicked(MouseEvent e) {
				Robot r;
				int index;
				try {
					index = listck.indexOf(ick);
					if (index < listck.size()) {

						index = index + 1;
						r = new Robot();
						r.delay(2000);
						r.mouseMove(mx1, my1);
						r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						r.delay(1000);
						r.keyPress(KeyEvent.VK_DELETE);
						r.keyRelease(KeyEvent.VK_DELETE);
						inputNum(r, listck.get(index).toLowerCase());
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
						ComList1.setSelectedIndex(index);
						ick = ick + 1;
					}
				} catch (AWTException e1) {

					e1.printStackTrace();
				}

			}

		});
//-------------------
		JButton btnGiam = new JButton("");
		btnGiam.setToolTipText("lui");
		btnGiam.setBackground(new Color(255, 0, 0));
		btnGiam.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("ma : " + "size :" + listck.size() + listck.get(ick).toLowerCase());
				Robot r;
				int index;
				try {
					r = new Robot();
					index = listck.indexOf(ick);
					if (index >= 1) {
						index = index - 1;
						r.delay(2000);
						r.mouseMove(mx1, my1);
						r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						r.delay(1000);
						r.keyPress(KeyEvent.VK_DELETE);
						r.keyRelease(KeyEvent.VK_DELETE);
						inputNum(r, listck.get(index).toLowerCase());
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
						ComList1.setSelectedIndex(index);
					}
				} catch (AWTException e2) {

					e2.printStackTrace();
				}

				ick = ick - 1;
			}
		});

		JButton btnAuto = new JButton("");
		btnAuto.setToolTipText("auto");
		btnAuto.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				autock = true;

				StockThread = new Runnable() {

					public void run() {

						int index = 1;
						Object Object = new Object();
						try {

							synchronized (Object) {
								while (autock == true && index < listck.size()) {
									// Robot r = new Robot();
									/*
									 * r.delay(2000); r.mouseMove(mx1, my1);
									 * r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
									 * r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); r.delay(1000);
									 * r.keyPress(KeyEvent.VK_DELETE); r.keyRelease(KeyEvent.VK_DELETE);
									 */
									// inputNum(r, listck.get(index).toLowerCase());
									ComList1.setSelectedIndex(index);

									driverStock.findElement(By.xpath(
											"//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
											.clear();

									driverStock.findElement(By.xpath(
											"//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
											.sendKeys(ComList1.getItemAt(index).toString());
									driverStock.findElement(By.xpath(
											"//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
											.sendKeys(Keys.ENTER);
									Object.wait(3000);
									// r.keyPress(KeyEvent.VK_ENTER);
									// r.keyRelease(KeyEvent.VK_ENTER);

									ick = index;

									index = index + 1;
								}
							}
						} catch (InterruptedException e) {

							e.printStackTrace();
						}

					} // Thread
				};
				threadstock = new Thread(StockThread);
				threadstock.start();

			}
		});
		btnAuto.setBackground(new Color(255, 255, 0));

		JButton btnAuto_1 = new JButton("");
		btnAuto_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				StockThread = new Runnable() {
					@SuppressWarnings("static-access")
					public void run() {

						autock = true;
						// threadstock=new StockThread();

						int index;

						index = ick;

						while (autock == true && index < listck.size()) {

							try {

								index = index + 1;

								threadstock.sleep(1000);

								/*
								 * Robot r = new Robot(); r.delay(2000); r.mouseMove(mx1, my1);
								 * r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
								 * r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); r.delay(1000);
								 * r.keyPress(KeyEvent.VK_DELETE); r.keyRelease(KeyEvent.VK_DELETE); inputNum(r,
								 * listck.get(index).toLowerCase());
								 * System.out.println(listck.get(index).toLowerCase());
								 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
								 */
								driverStock.findElement(By.xpath(
										"//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
										.clear();

								driverStock.findElement(By.xpath(
										"//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
										.sendKeys(listck.get(index).toLowerCase());
								driverStock.findElement(By.xpath(
										"//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
										.sendKeys(Keys.ENTER);

								ComList1.setSelectedIndex(index);
								ick = index;

							} catch (InterruptedException e1) {

								e1.printStackTrace();
							}

						}

					} // Thread
				};
				threadstock = new Thread(StockThread);
				threadstock.start();

			}
		});
		btnAuto_1.setToolTipText("auto");
		btnAuto_1.setBackground(Color.YELLOW);

		// -----------------------------------------------------
		ComList1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				driverStock
						.findElement(By
								.xpath("//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
						.clear();

				driverStock
						.findElement(By
								.xpath("//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
						.sendKeys(ComList1.getSelectedItem().toString().toLowerCase());

				driverStock
						.findElement(By
								.xpath("//*[@id=\"library-container\"]/div[3]/div[1]/div[2]/div[1]/div/div/div/input"))
						.sendKeys(Keys.ENTER);

				ick = ick + 1;

			}
		});
		ComList2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Robot r;
				try {
					r = new Robot();
					r.delay(1000);
					r.mouseMove(mx1, my1);
					r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					r.delay(500);
					r.keyPress(KeyEvent.VK_DELETE);
					r.keyRelease(KeyEvent.VK_DELETE);
					inputNum(r, ComList2.getSelectedItem().toString().toLowerCase());
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);

					ick = ick + 1;

				} catch (AWTException e1) {

					e1.printStackTrace();
				}

			}
		});

		JButton btnBot = new JButton("");
		btnBot.setToolTipText("sub");
		btnBot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				File file = new File("C:\\filename.txt");
				if (!file.exists()) {

					try {
						file.createNewFile();
					} catch (IOException e1) {

						e1.printStackTrace();
					}
				}

				try {
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					ComList2.removeItem(ComList2.getSelectedItem().toString());
					for (int i = 0; i < ComList2.getItemCount(); i++) {
						bw.write(ComList2.getItemAt(i) + "\n");
					}
					bw.flush();
					bw.close();

				} catch (IOException e1) {

					e1.printStackTrace();
				}

			}
		});

		JButton btnThem = new JButton("");
		btnThem.setToolTipText("add");
		btnThem.setBackground(new Color(144, 238, 144));
		btnThem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File file = new File("C:\\filename.txt");
				List<String> listckfilter = new ArrayList<String>();
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(file));
					String ma;
					while ((ma = br.readLine()) != null) {
						listckfilter.add(ma);
					}
					if (listckfilter.indexOf(ComList1.getSelectedItem().toString()) == -1) {
						listckfilter.add(ComList1.getSelectedItem().toString());
					}

				} catch (FileNotFoundException e2) {

					e2.printStackTrace();
				} catch (IOException e1) {

					e1.printStackTrace();
				}

				if (!file.exists()) {
					try {
						file.createNewFile();

					} catch (IOException e1) {

						e1.printStackTrace();
					}
				} else {
					try {
						FileWriter fw = new FileWriter(file.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						for (int i = 0; i < listckfilter.size(); i++) {
							bw.write(listckfilter.get(i) + "\n");
						}
						ComList2.addItem(ComList1.getSelectedItem().toString());
						bw.flush();
						bw.close();
					} catch (IOException e1) {

						e1.printStackTrace();
					}

					// Close connection

				}
			}
		});
		btnBot.setBackground(new Color(255, 0, 0));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(btnStartPreview)
					.addGap(15)
					.addComponent(btnTang)
					.addGap(15)
					.addComponent(btnGiam, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addComponent(btnAuto)
					.addGap(15)
					.addComponent(btnAuto_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addComponent(ComList1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addComponent(ComList2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnBot, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(btnStartPreview, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnTang, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnGiam, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnAuto, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnAuto_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addComponent(ComList1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addComponent(ComList2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnBot, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
		);
		frame.getContentPane().setLayout(groupLayout);


	}

	public void inputNum(Robot robot, String number) throws AWTException {

		char c = 0;
		for (int i = 0, n = number.length(); i < n; i++) {
			c = number.charAt(i);

			switch (c) {
			case '.':
				robot.keyPress(KeyEvent.VK_PERIOD);
				break;
			case '0':
				robot.keyPress(KeyEvent.VK_0);
				robot.keyRelease(KeyEvent.VK_0);
				break;
			case '1':
				robot.keyPress(KeyEvent.VK_1);
				robot.keyRelease(KeyEvent.VK_1);
				break;
			case '2':
				robot.keyPress(KeyEvent.VK_2);
				robot.keyRelease(KeyEvent.VK_2);
				break;
			case '3':
				robot.keyPress(KeyEvent.VK_3);
				robot.keyRelease(KeyEvent.VK_3);
				break;
			case '4':
				robot.keyPress(KeyEvent.VK_4);
				break;
			case '5':
				robot.keyPress(KeyEvent.VK_5);
				break;
			case '6':
				robot.keyPress(KeyEvent.VK_6);
				break;
			case '7':
				robot.keyPress(KeyEvent.VK_7);
				break;
			case '8':
				robot.keyPress(KeyEvent.VK_8);
				break;
			case '9':
				robot.keyPress(KeyEvent.VK_9);
				break;
			case 'a':
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				break;
			case 'b':
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
				break;
			case 'c':
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				break;
			case 'd':
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
				break;
			case 'e':
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				break;
			case 'f':
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
				break;
			case 'g':
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_G);
				break;

			case 'h':
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				break;
			case 'i':
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
				break;

			case 'j':
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_J);
				break;
			case 'k':
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_K);
				break;
			case 'l':
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
				break;

			case 'm':
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				break;
			case 'n':
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				break;
			case 'o':
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				break;
			case 'p':
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				break;
			case 'q':
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
				break;
			case 'r':
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				break;

			case 's':
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				break;
			case 't':
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				break;
			case 'u':
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_U);
				break;
			case 'v':
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				break;
			case 'x':
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_X);
				break;
			case 'y':
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
				break;
			case 'w':
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
				break;

			}

		}

	}

	public int getFrx() {
		return frx;
	}

	public void setFrx(int frx) {
		this.frx = frx;
	}

	public int getFry() {
		return fry;
	}

	public void setFry(int fry) {
		this.fry = fry;
	}

	public void display(WebDriver driverVPS, Children c) {

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 68, 390, 100);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(Color.CYAN);
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[1]/td[4]")).getText(), driverVPS
								.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[1]/td[2]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[1]/td[8]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[1]/td[9]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[1]/td[11]")).getText() },
						{ driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[4]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[2]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[8]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[9]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[11]")).getText() },
						{ driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[3]/td[4]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[3]/td[2]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[3]/td[8]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[3]/td[9]")).getText(),
								driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[3]/td[11]"))
										.getText() }, },
				new String[] { "LOAI", "GIO", "GIA DAT", "GIA KHOP", "TINH TRANG" }));
		
		/*
		 * col0 = table.getColumnModel().getColumn(0);
		 * 
		 * col0.setCellRenderer(new MyRenderer(Color.lightGray, Color.blue));
		 * 
		 * col2 = table.getColumnModel().getColumn(2); col2.setCellRenderer(new
		 * MyRenderer(Color.lightGray, Color.blue));
		 */

		final ColoringCellRenderer cellRenderer = new ColoringCellRenderer();
		TableColumnModel columnModel = table.getColumnModel();
		int cc = columnModel.getColumnCount();
		for (int c1 = 0; c1 < cc; c1++) {
			TableColumn column = columnModel.getColumn(c1);
			column.setCellRenderer(cellRenderer);
		}
		for (int c2 = 0; c2 <3; c2++) {
			String str = table.getModel().getValueAt(c2, 0).toString();
			if (str.equalsIgnoreCase("short")) {
				cellRenderer.setCellColor(c2, 0, Color.RED);
			}
			if (str.equalsIgnoreCase("long")) {
				cellRenderer.setCellColor(c2, 0, Color.GREEN);
			}
		}
		
	
		frame.getContentPane().add(scrollPane);
		// model.addRow(new Object[]{
		// driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[1]/td[4]"))});
		// model.addRow(new Object[]{
		// driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[4]")),
		// driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[2]")),driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[3]/td[8]")),driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[9]")),driverVPS.findElement(By.xpath("//*[@id=\"tbodyContent\"]/tr[2]/td[11]"))});

	}

	class MyRenderer extends DefaultTableCellRenderer {
		Color bg, fg;
		private final Set<Point> highlightedCells = new HashSet<Point>();

		public MyRenderer(Color bg, Color fg) {
			super();
			this.bg = bg;
			this.fg = fg;
		}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			cell.setBackground(bg);
			cell.setForeground(fg);
			return cell;
		}
	}

	@SuppressWarnings("serial")
	class ColoringCellRenderer extends DefaultTableCellRenderer {
		private final Map<Point, Color> cellColors = new HashMap<Point, Color>();

		void setCellColor(int r, int c, Color color) {
			if (color == null) {
				cellColors.remove(new Point(r, c));
			} else {
				cellColors.put(new Point(r, c), color);
			}
		}

		private Color getCellColor(int r, int c) {
			Color color = cellColors.get(new Point(r, c));
			if (color == null) {
				return Color.WHITE;
			}
			return color;
		}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			Color color = getCellColor(row, column);
			setBackground(color);
			return this;
		}
	}
	public void hide() {
	//	frame.dispose();
		this.frame.setVisible(false);
		this.frame.dispose();
	}
}
