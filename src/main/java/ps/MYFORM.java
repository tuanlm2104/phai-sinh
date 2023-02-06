package ps;

/* - Neu check option Ban DUOI (KHONG AUTO) ==>chi thuc hien BAN khi gia < gia tri 
  
   - Neu check option Mua DUOI (KHONG AUTO) ==>chi thuc hien MUA khi gia > gia tri
   
   - Truong hop chi check BAN TREN ==> cat lo gia > vi the BAN (n[1]) Gia tri
   
   - Truong hop chi check MUA TREN ==> cat lo gia < vi the MUA (n[1]) Gia tri
   
   - CHECK BREAK : MUA khi gia > option mua va  BAN khi gia < option ban
   
   */
/*
 *  Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside : " + Thread.currentThread().getName());
            }
        };
 * Thread thread = new Thread(runnable);

        System.out.println("Starting Thread...");
        thread.start();
 * 
 * 
 * 
 * */

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.StdCallLibrary;

//import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Graphics;

import org.apache.log4j.Logger;

//import org.apache.commons.io.FileUtils;
//import org.apache.http.message.BasicListHeaderIterator;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import org.jnativehook.mouse.NativeMouseMotionListener;
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.google.common.base.Function;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.DecimalFormat;
import com.ibm.icu.text.SimpleDateFormat;
import javax.swing.JRadioButton;

import javax.swing.JSeparator;

import javax.swing.BorderFactory;
import javax.swing.Box;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Insets;

import java.awt.Point;
import java.awt.PointerInfo;

import javax.swing.event.ChangeListener;

import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.event.ChangeEvent;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JToggleButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

@SuppressWarnings("unused")
public class MYFORM implements NativeKeyListener, NativeMouseMotionListener, NativeMouseWheelListener {
	boolean retryNeeded_SL = false, confirm = false, switchStep = false;
	int countme = 0, counterror, Mfixed_X, Mfixed_Y, MStart_X, MStart_Y, MEnd_X, MEnd_Y, Bfixed_X, Bfixed_Y, BStart_X,
			BStart_Y, CountAction = 0, TimeCheck = 1;;
	String checkme1, checkme2, actionChoice = "Mua";
	String Muaxpath = "//*[@id=\"orderPS\"]/div/div[1]/div[1]/button";
	String Banxpath = "//*[@id=\"orderPS\"]/div/div[1]/div[2]/button";
	String Huyxpath = "//*[@id=\"orderPS\"]/div/div[3]/button";
	String ATOxpath = "//*[@id=\"right_btnordertype\"]/div/span[1]";
	String ATCxpath = "//*[@id=\"right_btnordertype\"]/div/span[2]";
	String MTLxpath = "//*[@id=\"right_btnordertype\"]/div/span[3]";
	String MAKxpath = "//*[@id=\"right_btnordertype\"]/div/span[5]";

	@SuppressWarnings("rawtypes")
	Vector colunm_HeadHistory = new Vector();

	int showme = 3, typeChart = 1, typeColor = 1;
	Process process = null;
	String[] lenhhistory1;
	String[] lenhhistory2;
	String[] lenhhistory3;

	Thread threadstock, threadinfo;
	@SuppressWarnings("rawtypes")
	Vector colunm_HeadStock, StockList;

	@SuppressWarnings("rawtypes")
	Vector newRecordHistory = null;

	Thread threadStock, threadHD;
	WebElement span;
	Runnable countDownThread, HistoryThread, StockInfo;
	JPanel panelKey = new JPanel();
	boolean isPresent = true, showtradeview = true;
	boolean fixme = false, showlist = false, BAN_ATC = false, MUA_ATC = false, BAN_ATO = false, MUA_ATO = false;
	// ----------------------------------------------------------------
	int PID, PID1;
	JLabel lblVN30 = new JLabel("VN30");
	JButton btnMAK_MUA = new JButton("MAK");
	Date date;
	int CENTER_X, CENTER_Y;
	boolean enableKeyBoard = false, dongbang = false, dongbangBreak = false, loadDriver = false;
	int cuongdo, countvn30 = 0, tontaiHD = 0, codinhY, codinhX, count1 = 0, count2 = 0, mx, my, mx1 = 215, my1 = 281,
			widthleft1 = 580, widthriht1 = 740, widthleft2 = 2, widthriht2 = 680, heightL = 600, heightR = 600;
	WebElement hdchuaK, Igia, hdkhop, stype, time, status, Igiadat, modal_price, MuaButton, ButtonATO, ButtonATC,
			BanButton, BanButtonATC, vn30, vn30New, connect;
	String gia, giadat;
	int sohd_daonguoc, countvn30new = 1, countvn30newMax = 3;

	JavascriptExecutor js, jss, jsStock;
	String String_sohd_daonguoc;
	// ----------------------
	Thread threadKhop, thread, threadH;
	Runnable threadVN30, threadHistory;
	javax.swing.Timer timerLB;

	@SuppressWarnings("rawtypes")
	JComboBox comboBox = new JComboBox();
	JRadioButton CL_M_TREN = new JRadioButton("M");
	JRadioButton CL_B_TREN = new JRadioButton("B");
	JRadioButton CL_N_TREN = new JRadioButton("");
	// ---------------------------------------------
	JRadioButton CL_N_DUOI = new JRadioButton("");
	JRadioButton CL_B_DUOI = new JRadioButton("B");
	JRadioButton CL_M_DUOI = new JRadioButton("M");
	JButton btnshow = new JButton("hide");
	JLabel lblTB1 = new JLabel("TB");
	ButtonGroup buttonGroupBN = new ButtonGroup();
	ButtonGroup buttonGroupK = new ButtonGroup();
	ButtonGroup buttonGroupCL_TREN = new ButtonGroup();
	ButtonGroup buttonGroupCL_DUOI = new ButtonGroup();
	ButtonGroup buttonGroup_Mua_Ban = new ButtonGroup();
	ButtonGroup buttonGroupTTL = new ButtonGroup();
	JTextField textGiaKhop = new JTextField();
	JPanel panel_info = new JPanel();
	final JToggleButton tglbtnAuto = new JToggleButton("Auto");
	// ObjectHistory[] ArrObjectHistory;
	ObjectHistory[] ArrObjectHistory = new ObjectHistory[100];

	float ItotalTrade, ItotalTradeKhop, ItotalTradeTempKhop, ItotalTradeTemp, Itotal;
	WebElement totalTrade, totalTradeKhop, totalTradeTempKhop, totalTradeTemp;
	String currentURL;
	WebDriver driverVPS, driver, driverNew;
	Boolean MK = false, flagvn30 = true;
//	FirefoxDriver driver;
	FirefoxDriver driverDownFuture;
	FirefoxDriver driverRagon;
	List<WebElement> rowsNumber;
	Boolean AutoMK = false, hien_danhSach_lenh = false, layhdtest = false, retryNeeded, retryNeeded1 = false,
			retryNeededHis = false, check = true, autock = false, showchart = true;
	Boolean setGiakhop = false, mua_break_count = false, ban_break_count = false;
	Boolean CL_Mua = false, CL_Ban = false, CL_NONE = false, disKhop = false, setgia = false;
	float LGCL;
	Double GIA_CL, tong_tang = 0.0, tong_giam = 0.0;
	WebDriver driverSSI, DriverSSIF30, driverStock, DriverStockList;
	WebElement Mua_1806 = null, hdk, sm, lenh;
	WebElement Ban_1806 = null;
	WebElement Gia_khop = null;
	float GIA_MUA, GIA_BAN, GIA_KHOP, GIA_TRUA = 0, tempbreak;
	Double GIA_KHOP1, Count_Step, Action_Price;
	float GIA_MUA_REAL, GIA_BAN_REAL;
	Boolean dn = false, laygia_Break = false, action_break = false;
	String HDmonth = "", txtAction_Price;
	String HDDay = "VN30F23";
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	float GIA_VN30, GIA_VN30New, temp1;
	Integer Tong, count_tang = 0, count_giam = 0;

	boolean c = true;
	String HD, HD1, HDCLOSE, baseUrl, itemvn30, itemvn30New, tinhtrang;
	float GIA_AUTO;
	float GIA_AUTO_Compare;
	// ----------------------
	private static JFrame frmRubbyMoney;

	boolean AutoMb = false, flagMua_break = false, flagBan_break = false;
	boolean RL = false;
	private boolean start = false;

	boolean AUTO = true;
	double CUONGDO = 2.5;
	double M1, M2;
	boolean MUA = false;
	boolean BAN = false;
	boolean initHD = true;
	// -----------------------
	int GIA_X = 0;
	int GIA_Y = 0;

	int MUA_X = 0;
	int MUA_Y = 0;

	int CFM_X = 0;
	int CFM_Y = 0;

	int CFB_X = 0;
	int CFB_Y = 0;

	int CFH_X = 0;
	int CFH_Y = 0;

	int CFH1_X = 0;
	int CFH1_Y = 0;

	int CF_X = 0;
	int CF_Y = 0;

	int ACTION_MUA_X = 0;
	int ACTION_MUA_Y = 0;

	int BAN_X = 0, BAN_Y = 0;
	int ACTION_BAN_X = 0, ACTION_BAN_Y = 0;
	String fT_pointString;
	int PIN_X = 0;
	int PIN_Y = 0;
	int PINPASS_X = 0, PINPASS_Y = 0;
	int XACNHAN_X = 0;
	int XACNHAN_Y = 0;
	boolean mk = false;
	int KL_X = 415, KL_Y = 513;
	int countPin = 0;
	boolean KHOP = false;

	float GiaClose;
	Boolean fixvalue = false, HeadLess = true;
	WebElement GIA_TEMP;

	JLabel lblTB = new JLabel("TB");

	boolean flag = false;
	DecimalFormat df = new DecimalFormat("000.0");
	DecimalFormat dl = new DecimalFormat("0.0");
	DecimalFormat dr = new DecimalFormat("0");
	JLabel conn = new JLabel("conn");
	private JTextField txtCL_TREN;
	private final JButton Refresh = new JButton("");
	JLabel lblCheck = new JLabel("Check");
	JButton btnDong = new JButton("CL");
	JLabel lblinfo = new JLabel("info");
	JButton btnClear = new JButton("clear");
	JLabel lblHDK = new JLabel("So HD");
	JLabel lblSM = new JLabel("suc mua");
	JCheckBox chckBreak = new JCheckBox("");

	private final JTextField SHD = new JTextField();
	private JButton btnMuaK;
	private JTextField txtCL_DUOI;
	private JTextField txtBreak;
	private JTextField txtAuto;
	JToggleButton tglbtnShowChart = new JToggleButton("S");

	private final JPanel panel = new JPanel();
	private final JTable tableHistory = new JTable();
	final DefaultTableModel tableModel = (DefaultTableModel) tableHistory.getModel();
	private final JScrollPane scrollPaneHistory = new JScrollPane();
	private final JLabel lblShow = new JLabel("lblShow");

	private final JToggleButton tglbtnShowList = new JToggleButton("H");
	JButton btnAction = new JButton("");
	JButton btnHuyHD = new JButton(new ImageIcon("C:\\jar\\icons8-cancel-16.png"));
	JToggleButton tglbtnShowHistory = new JToggleButton("PS OFF");
	private final JPopupMenu popupMenu = new JPopupMenu();
	private final JMenuItem MenuItem_mua = new JMenuItem("Mua");
	private final JMenuItem MenuItem_Ban = new JMenuItem("Ban");

	// -----------------------
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingUtilities.invokeLater(new Runnable() {
						@SuppressWarnings("static-access")
						public void run() {
							MYFORM window = new MYFORM();

							try {

								GlobalScreen.registerNativeHook();
								GlobalScreen.addNativeKeyListener(window);
								GlobalScreen.addNativeMouseMotionListener(window);
								GlobalScreen.addNativeMouseWheelListener(window);
								window.frmRubbyMoney.setVisible(true);

							} catch (NativeHookException e) {

								e.printStackTrace();
							}

						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public interface User32 extends StdCallLibrary {
		@SuppressWarnings("deprecation")
		User32 INSTANCE = (MYFORM.User32) Native.loadLibrary("user32", User32.class);

		boolean EnumWindows(WinUser.WNDENUMPROC lpEnumFunc, Pointer data);

		int GetWindowTextW(WinDef.HWND hWnd, char[] lpString, int nMaxCount);

		boolean ShowWindow(WinDef.HWND hWnd, int nCmdShow);

		int GetWindowThreadProcessId(HWND hwnd, IntByReference lpdwProcessId);
	}

	public MYFORM() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {

		frmRubbyMoney = new JFrame();

		frmRubbyMoney.getContentPane().addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				driverStock.switchTo().defaultContent();
				JavascriptExecutor jss = (JavascriptExecutor) driverStock;
				double steps = e.getWheelRotation();
				if (typeChart == 1) {

					WebElement left = driverStock.findElement(By.xpath("//*[@id=\"left\"]"));

					WebElement right = driverStock.findElement(By.xpath("//*[@id=\"right\"]"));

					if (steps == 1) {

						widthleft1 = widthleft1 + 50;
						widthriht1 = widthriht1 - 50;

						jss.executeScript("arguments[0].style.width = '" + String.valueOf(widthleft1) + "px'", left);
						jss.executeScript("arguments[0].style.width = '" + String.valueOf(widthriht1) + "px'", right);

					} else {
						widthleft1 = widthleft1 - 50;
						widthriht1 = widthriht1 + 50;

						jss.executeScript("arguments[0].style.width = '" + String.valueOf(widthleft1) + "px'", left);
						jss.executeScript("arguments[0].style.width = '" + String.valueOf(widthriht1) + "px'", right);

					}

				}
				if (typeChart == 2) {

					WebElement left = driverStock.findElement(By.xpath("//*[@id=\"Mleft\"]"));

					WebElement right = driverStock.findElement(By.xpath("//*[@id=\"Mright\"]"));

					if (steps == 1) {
						if (widthleft2 <= 680 && widthriht2 > 51) {

							widthleft2 = widthleft2 + 50;
							widthriht2 = widthriht2 - 50;

							jss.executeScript("arguments[0].style.width = '" + String.valueOf(widthleft2) + "px'",
									left);
							jss.executeScript("arguments[0].style.width = '" + String.valueOf(widthriht2) + "px'",
									right);

						}
					} else {
						if (widthleft2 >= 51 && widthriht2 < 680) {
							widthleft2 = widthleft2 - 50;
							widthriht2 = widthriht2 + 50;

							jss.executeScript("arguments[0].style.width = '" + String.valueOf(widthleft2) + "px'",
									left);
							jss.executeScript("arguments[0].style.width = '" + String.valueOf(widthriht2) + "px'",
									right);
						}
					}

				}

			}
		});

		frmRubbyMoney.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (System.getProperty("os.name").contains("Windows")) {

					try {

						process = Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
						process = Runtime.getRuntime().exec("taskkill /f /im firefox.exe");
						process = Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");
						process = Runtime.getRuntime().exec("taskkill /f /im msedge.exe");
						process = Runtime.getRuntime().exec("taskkill /f /im msedgedriver.exe");
						process = Runtime.getRuntime().exec("Taskkill /PID" + PID + " /F");
						// Taskkill /PID 26356 /F
					} catch (IOException e1) {

						e1.printStackTrace();
					}
					process.destroy();
				}
			}

			@Override
			public void windowOpened(WindowEvent e) {

				File file = new File("C:\\jar\\month.txt");

				BufferedReader br;
				try {
					br = new BufferedReader(new FileReader(file));
					HDmonth = br.readLine();
					System.out.println("HDmonth :" + HDmonth);

					comboBox.setSelectedItem(HDmonth);
					SHD.setText("1");
					br.close();

				} catch (IOException e1) {

					e1.printStackTrace();
				}

			}
		});

		frmRubbyMoney.getContentPane().setBackground(Color.BLACK);
		frmRubbyMoney.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\jar\\ruby2.jpg"));
		frmRubbyMoney.setBounds(100, 100, 503, 329);
		frmRubbyMoney.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRubbyMoney.getContentPane().setLayout(null);
		final String title = "";
		frmRubbyMoney.setTitle(title);
		frmRubbyMoney.setLocation(870, 450);

		ImageIcon iconeStart = new ImageIcon(Toolkit.getDefaultToolkit().getImage("C:\\jar\\Start.png"));

		panel.setBackground(Color.BLACK);
		panel.setBounds(1, 0, 479, 253);

		frmRubbyMoney.getContentPane().add(panel);

		panel.setLayout(null);

		colunm_HeadHistory.addElement("Khop");
		colunm_HeadHistory.addElement("Type");
		colunm_HeadHistory.addElement("Status");
		colunm_HeadHistory.addElement("Price");
		colunm_HeadHistory.addElement("ChuaK");
		colunm_HeadHistory.addElement("Time");

		tglbtnShowHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Runnable runnable = new Runnable() {
					@SuppressWarnings({ "deprecation" })
					public void run() {

						hien_danhSach_lenh = !hien_danhSach_lenh;

						if (hien_danhSach_lenh) {
							tglbtnShowHistory.setSelected(true);
							tglbtnShowHistory.setText("PS ON");
						} else {
							tglbtnShowHistory.setSelected(false);
							tglbtnShowHistory.setText("PS OFF");
						}

						if (hien_danhSach_lenh == false) {
							if (threadHD.isAlive()) {
								threadHD.stop();
							}
						}

						if (hien_danhSach_lenh) {
							showlist = false;
							tglbtnShowList.setSelected(false);

							while (hien_danhSach_lenh) {
								do {
									try {
										rowsNumber = driverVPS
												.findElements(By.xpath("//*[@id=\"op-order-status\"]/tr"));
										countme = rowsNumber.size();

										if (countme > 0) {
											Vector total_recordHistory = new Vector();
											if (rowsNumber.size() > 3) {
												countme = 3;
											}
											for (int k = 1; k < countme + 1; k++) {

												newRecordHistory = new Vector();
												time = driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[1]"));
												stype = driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[4]"));

												Igiadat = driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[5]"));

												// khop

												hdkhop = driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[7]")); // hd
																														// khop
												hdchuaK = driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[8]")); // hd
																														// chua
																														// khop
												status = driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[9]"));

												newRecordHistory.addElement(hdkhop.getText());
												newRecordHistory.addElement(stype.getText());
												newRecordHistory.addElement(status.getText());
												newRecordHistory.addElement(Igiadat.getText());
												newRecordHistory.addElement(hdchuaK.getText());
												newRecordHistory.addElement(time.getText());
												total_recordHistory.addElement(newRecordHistory);
												frmRubbyMoney.setTitle("history   " + total_recordHistory.get(0)
														+ ", rows : " + rowsNumber.size());
											}

											SwingUtilities.invokeLater(new Runnable() {
												public void run() {
													tableHistory.setModel(new DefaultTableModel(total_recordHistory,
															colunm_HeadHistory));
													tableModel.fireTableDataChanged();
													frmRubbyMoney.setTitle("history..." + total_recordHistory.get(0)
															+ ", rows : " + rowsNumber.size());

												}
											});

											// ------------------------- tableHistory

											if (time.getText() != "") {

												tableHistory.setEnabled(false);
												tableHistory.setForeground(Color.BLACK);
												tableHistory.setBackground(new Color(242, 245, 249));

												tableHistory.setDefaultRenderer(Object.class, new StockPSRenderer());

											}

										}
										retryNeededHis = false;
										counterror = 0;
									} catch (StaleElementReferenceException staleElementReferenceException) {
										retryNeededHis = true;
										counterror = counterror + 1;
										frmRubbyMoney.setTitle("counterror 1:" + counterror);
										if (counterror == 4) {
											Refresh.doClick();
											frmRubbyMoney.setTitle(">>> Do refresh action 1");

										}
										frmRubbyMoney.setTitle("history..." + ": " + staleElementReferenceException);

									} catch (Exception eh) {
										counterror = counterror + 1;
										frmRubbyMoney.setTitle("counterror 2:" + counterror);
										frmRubbyMoney.setTitle("history error..." + ": " + eh);
										retryNeededHis = true;
										if (counterror == 4) {
											Refresh.doClick();
											frmRubbyMoney.setTitle(">>> Do refresh action 2");

										}
									}
								} while (retryNeededHis);
							}

						}

					}
				};
				threadHD = new Thread(runnable);

				threadHD.start();
			}

		});
		tglbtnShowHistory.setBounds(76, 101, 77, 20);
		panel.add(tglbtnShowHistory);

		btnMuaK = new JButton("");
		btnMuaK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (enableKeyBoard) {

					try {
						if (MUA_ATC == false && MUA_ATO == false) {
							txtCL_TREN.setText("");
							CL_N_TREN.setSelected(true);
							if (!tglbtnShowHistory.isSelected()) {
								tglbtnShowHistory.doClick();
							}
							Mua_1806 = driverVPS.findElement(By.id(HD));
							Ban_1806 = driverVPS.findElement(By.id(HD1));
							Gia_khop = driverVPS.findElement(By.id(HDCLOSE));

							js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

							js.executeScript("document.getElementById('right_price').value="
									+ Double.valueOf(lblShow.getText()) + ";");

							MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
							js.executeScript("arguments[0].click();", MuaButton);

						} else {
							if (MUA_ATC) {
								ButtonATC = driverVPS.findElement(By.xpath(ATCxpath));
								js.executeScript("arguments[0].click();", ButtonATC);

								MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
								js.executeScript("arguments[0].click();", MuaButton);
							} else {
								System.out.println("go to ato mua ...");
								ButtonATO = driverVPS.findElement(By.xpath(ATOxpath));
								js.executeScript("arguments[0].click();", ButtonATO);

								MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
								js.executeScript("arguments[0].click();", MuaButton);
							}
						}
					} catch (StaleElementReferenceException eMua) {
						frmRubbyMoney.setTitle("refresh...");
						driverVPS.navigate().refresh();
					} catch (Exception eMua2) {
						frmRubbyMoney.setTitle(eMua2.toString());

					}
					if (!tglbtnShowHistory.isSelected()) {
						hien_danhSach_lenh = false;
						tglbtnShowHistory.doClick();
					}
				} else {
					lblTB.setText("Keyboard disable");
				}

			}
		});
		btnMuaK.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if (fixme) {
					snapto(btnMuaK);
				}
			}
		});
		btnMuaK.setBounds(146, 44, 70, 23);
		panel.add(btnMuaK);

		btnMuaK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dongbang = true;
				btnMuaK.setBackground(Color.PINK);
				lblTB1.setForeground(new Color(245, 247, 227));
				lblTB1.setText("Dong bang");
				lblShow.setBounds(137, 3, 60, 14);
				lblShow.setForeground(Color.GREEN);
				lblShow.setText(btnMuaK.getText());
				textGiaKhop.setBounds(313, 19, 56, 21);
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				textGiaKhop.setBorder(border);

				textGiaKhop.setBackground(Color.WHITE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				dongbang = false;
				btnMuaK.setBackground(Color.WHITE);
				lblTB1.setForeground(Color.ORANGE);
				lblTB1.setText("khong Dong bang");
				lblShow.setText("");
				textGiaKhop.setBackground(Color.WHITE);
				textGiaKhop.setBounds(313, 19, 56, 21);

			}

		});
		btnMuaK.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				dongbang = true;
				lblTB1.setForeground(new Color(245, 247, 227));
				lblTB1.setText("Dong Bang");
				if (steps == 1) {
					btnMuaK.setText(String.valueOf(df.format(Double.valueOf(btnMuaK.getText()) - 0.1)));
				} else {
					btnMuaK.setText(String.valueOf(df.format(Double.valueOf(btnMuaK.getText()) + 0.1)));
				}
				lblShow.setForeground(Color.GREEN);
				lblShow.setText(btnMuaK.getText());
			}
		});
		btnMuaK.setMargin(new Insets(2, 5, 2, 5));
		btnMuaK.setBackground(new Color(255, 255, 255));
		btnMuaK.setToolTipText("Mua Khá»›p");

		btnMuaK.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMuaK.setForeground(new Color(0, 100, 0));

		JPopupMenu popupMenu_MUA_ATC = new JPopupMenu();
		addPopup(btnMuaK, popupMenu_MUA_ATC);

		JMenuItem mnItem_Mua_ATC = new JMenuItem("ATC");
		final JButton btnBanK = new JButton("");
		mnItem_Mua_ATC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MUA_ATC = true;
				BAN_ATC = true;

				btnMuaK.setText("ATC");
				btnBanK.setText("ATC");

			}
		});
		popupMenu_MUA_ATC.add(mnItem_Mua_ATC);

		JMenuItem mnItem_Mua_ATC_NONE = new JMenuItem("NONE");
		mnItem_Mua_ATC_NONE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MUA_ATC = false;
				MUA_ATO = false;
			}
		});

		JMenuItem mnItem_Mua_ATO = new JMenuItem("ATO");

		mnItem_Mua_ATO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MUA_ATO = true;
				BAN_ATO = true;
				MUA_ATC = false;
				BAN_ATC = false;
				btnMuaK.setText("ATO");
				btnBanK.setText("ATO");

			}
		});
		popupMenu_MUA_ATC.add(mnItem_Mua_ATO);
		popupMenu_MUA_ATC.add(mnItem_Mua_ATC_NONE);

		btnBanK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (enableKeyBoard) {
					BanButton = driverVPS.findElement(By.xpath(Banxpath));
					try {
						if (BAN_ATC == false && BAN_ATO == false) {
							txtCL_TREN.setText("");
							CL_N_TREN.setSelected(true);

							if (!tglbtnShowHistory.isSelected()) {
								tglbtnShowHistory.doClick();
							}
							Mua_1806 = driverVPS.findElement(By.id(HD));
							Ban_1806 = driverVPS.findElement(By.id(HD1));
							Gia_khop = driverVPS.findElement(By.id(HDCLOSE));

							js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

							js.executeScript("document.getElementById('right_price').value="
									+ Double.valueOf(lblShow.getText()) + ";");

							js.executeScript("arguments[0].click();", BanButton);

						} else {
							if (BAN_ATC) {

								ButtonATC = driverVPS.findElement(By.xpath(ATCxpath));
								js.executeScript("arguments[0].click();", ButtonATC);
								js.executeScript("arguments[0].click();", BanButton);
							} else {
								System.out.println("go to ato ban ...");
								ButtonATO = driverVPS.findElement(By.xpath(ATOxpath));
								js.executeScript("arguments[0].click();", ButtonATO);
								js.executeScript("arguments[0].click();", BanButton);
							}

						}
					} catch (StaleElementReferenceException eBan) {
						frmRubbyMoney.setTitle("Refresh");
						driverVPS.navigate().refresh();
					} catch (Exception eBan2) {
						frmRubbyMoney.setTitle(eBan2.toString());

					}
					if (!tglbtnShowHistory.isSelected()) {
						hien_danhSach_lenh = false;
						tglbtnShowHistory.doClick();
					}
				} else {
					lblTB.setText("Keyboard disable");
				}

			}
		});
		btnBanK.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if (fixme) {
					snapto(btnBanK);
				}
			}
		});
		btnBanK.setBounds(247, 44, 70, 23);
		panel.add(btnBanK);
		btnBanK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dongbang = true;
				btnBanK.setBackground(Color.PINK);
				lblTB1.setForeground(new Color(245, 247, 227));
				lblTB1.setText("Dong bang");
				lblShow.setBounds(193, 3, 60, 14);
				lblShow.setForeground(Color.RED);
				lblShow.setText(btnMuaK.getText());
				textGiaKhop.setBounds(313, 19, 56, 21);
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				textGiaKhop.setBorder(border);

				textGiaKhop.setBackground(Color.WHITE);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				dongbang = false;
				btnBanK.setBackground(Color.WHITE);
				lblTB1.setForeground(Color.ORANGE);
				lblTB1.setText("khong Dong bang");
				lblShow.setText("");
				textGiaKhop.setBackground(Color.WHITE);
				textGiaKhop.setBounds(313, 19, 56, 21);
				textGiaKhop.setVisible(true);
			}

		});

		btnBanK.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				dongbang = true;
				lblTB1.setText("Dong Bang");

				if (steps == 1) {
					btnBanK.setText(String.valueOf(df.format(Double.valueOf(btnBanK.getText()) - 0.1)));
				} else {
					btnBanK.setText(String.valueOf(df.format(Double.valueOf(btnBanK.getText()) + 0.1)));
				}
				lblShow.setForeground(Color.RED);
				lblShow.setText(btnBanK.getText());
			}
		});

		btnBanK.setMargin(new Insets(2, 5, 2, 5));
		btnBanK.setBackground(new Color(255, 255, 255));
		btnBanK.setToolTipText("BÃ¡n Khá»›p");

		btnBanK.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBanK.setForeground(new Color(255, 0, 0));

		JPopupMenu popupMenu_BAN_ATC = new JPopupMenu();
		addPopup(btnBanK, popupMenu_BAN_ATC);

		JMenuItem mnItem_Ban_ATC = new JMenuItem("ATC");
		mnItem_Ban_ATC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BAN_ATC = true;
				MUA_ATC = true;

				btnBanK.setText("ATC");
				btnMuaK.setText("ATC");

			}

		});
		popupMenu_BAN_ATC.add(mnItem_Ban_ATC);

		JMenuItem mnItem_Ban_ATC_NONE = new JMenuItem("NONE");
		mnItem_Ban_ATC_NONE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BAN_ATC = false;
				BAN_ATO = false;
			}
		});

		JMenuItem mnItem_Ban_ATO = new JMenuItem("ATO");
		mnItem_Ban_ATO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BAN_ATO = true;
				MUA_ATO = true;
				MUA_ATC = false;
				BAN_ATC = false;
				btnMuaK.setText("ATO");
				btnBanK.setText("ATO");

			}
		});
		popupMenu_BAN_ATC.add(mnItem_Ban_ATO);
		popupMenu_BAN_ATC.add(mnItem_Ban_ATC_NONE);
		btnMAK_MUA.setBounds(146, 70, 70, 23);
		panel.add(btnMAK_MUA);
		btnMAK_MUA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMAK_MUA.setBackground(Color.PINK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMAK_MUA.setBackground(Color.WHITE);
			}
		});
		btnMAK_MUA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (enableKeyBoard) {
					Logger logger = Logger.getLogger(MYFORM.class);
					logger.warn("mua.");
					try {
						Order_special("M", "MTL");

						if (!tglbtnShowHistory.isSelected()) {
							hien_danhSach_lenh = false;
							tglbtnShowHistory.doClick();
						}
					} catch (Exception eMua) {

					}
				} else {
					lblTB.setText("Keyboard disable");
				}
			}
		});

		btnMAK_MUA.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMAK_MUA.setForeground(new Color(0, 128, 0));

		final JButton btnMAK_BAN = new JButton("MAK");
		btnMAK_BAN.setBounds(247, 69, 70, 23);
		panel.add(btnMAK_BAN);

		btnMAK_BAN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMAK_BAN.setBackground(Color.PINK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMAK_BAN.setBackground(Color.WHITE);
			}
		});
		btnMAK_BAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (enableKeyBoard) {
					Logger logger = Logger.getLogger(MYFORM.class);
					logger.warn("ban.");

					try {
						Order_special("B", "MTL");
						if (!tglbtnShowHistory.isSelected()) {
							hien_danhSach_lenh = false;
							tglbtnShowHistory.doClick();
						}
						;
					} catch (Exception eBan) {

					}
				} else {
					lblTB.setText("Keyboard disable");
				}
			}
		});
		btnMAK_BAN.setForeground(Color.RED);
		btnMAK_BAN.setFont(new Font("Tahoma", Font.BOLD, 10));

		txtCL_TREN = new JTextField();
		txtCL_TREN.setBounds(299, 95, 61, 20);
		panel.add(txtCL_TREN);
		txtCL_TREN.setEditable(false);

		txtCL_TREN.setBackground(new Color(255, 239, 213));
		txtCL_TREN.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				if (!txtCL_TREN.getText().isEmpty()) {
					if (steps == 1) {
						txtCL_TREN.setText(String.valueOf(df.format(Double.valueOf(txtCL_TREN.getText()) - 0.1)));
						if (buttonGroupCL_TREN.getSelection().getActionCommand().equals("CLMua_TREN")) {
							frmRubbyMoney.setTitle(title + " - CAT LO VI THE MUA GIA <=:" + "[ "
									+ String.valueOf(dl.format(Double.valueOf(txtCL_TREN.getText())) + " ]"));
						}
						if (buttonGroupCL_TREN.getSelection().getActionCommand().equals("CLBan_TREN")) {
							frmRubbyMoney.setTitle(title + "- CAT LO VI THE BAN GIA >=:" + "[ "
									+ String.valueOf(dl.format(Double.valueOf(txtCL_TREN.getText())) + " ]"));

						}

					} else {
						txtCL_TREN.setText(String.valueOf(df.format(Double.valueOf(txtCL_TREN.getText()) + 0.1)));
						if (buttonGroupCL_TREN.getSelection().getActionCommand().equals("CLMua_TREN")) {
							frmRubbyMoney.setTitle(title + " - CAT LO VI THE MUA GIA <=:" + "[ "
									+ String.valueOf(dl.format(Double.valueOf(txtCL_TREN.getText())) + " ]"));

						}
						if (buttonGroupCL_TREN.getSelection().getActionCommand().equals("CLBan_TREN")) {
							frmRubbyMoney.setTitle(title + " - CAT LO VI THE BAN GIA >=:" + "[ "
									+ String.valueOf(dl.format(Double.valueOf(txtCL_TREN.getText())) + " ]"));

						}

					}
				}

			}
		});
		txtCL_TREN.setColumns(10);
		CL_M_TREN.setBounds(272, 95, 20, 20);
		panel.add(CL_M_TREN);
		CL_M_TREN.setBackground(Color.GREEN);

		CL_M_TREN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtCL_TREN.setText(df.format(GIA_KHOP - 1.2));
				if (!chckBreak.isSelected()) {
					frmRubbyMoney.setTitle(title + "- CAT LO VI THE MUA GIA <=:" + "[ " + txtCL_TREN.getText() + " ]");
				}
			}
		});

		CL_M_TREN.setFont(new Font("Tahoma", Font.BOLD, 11));
		CL_M_TREN.setForeground(new Color(0, 128, 0));
		CL_M_TREN.setActionCommand("CLMua_TREN");
		buttonGroupCL_TREN.add(CL_M_TREN);
		CL_B_TREN.setBounds(246, 95, 20, 20);
		panel.add(CL_B_TREN);
		CL_B_TREN.setBackground(Color.RED);

		CL_B_TREN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtCL_TREN.setText(df.format(GIA_KHOP + 1.2));
				if (!chckBreak.isSelected()) {

					frmRubbyMoney.setTitle(title + "- CAT LO VI THE BAN GIA >=:" + "[ " + txtCL_TREN.getText() + " ]");
				}
			}
		});
		CL_B_TREN.setFont(new Font("Tahoma", Font.BOLD, 11));
		CL_B_TREN.setForeground(new Color(255, 0, 0));
		CL_B_TREN.setActionCommand("CLBan_TREN");
		buttonGroupCL_TREN.add(CL_B_TREN);
		CL_N_TREN.setBounds(220, 95, 20, 20);
		panel.add(CL_N_TREN);
		CL_N_TREN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCL_TREN.setText("");
				lblTB.setText("");
			}
		});
		CL_N_TREN.setActionCommand("CLNone_TREN");
		buttonGroupCL_TREN.add(CL_N_TREN);

		CL_N_TREN.setSelected(true);

		CL_N_TREN.setForeground(Color.BLACK);
		CL_N_TREN.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDong.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();

				if (tontaiHD != 0) {
					textGiaKhop.setBounds(30, 19, 56, 21);
					Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
					textGiaKhop.setBorder(border);

					textGiaKhop.setBackground(Color.BLACK);

					if (tontaiHD == 1) { // short,vi the long

						if (steps == 1) {
							btnBanK.setText(String.valueOf(df.format(Double.valueOf(btnBanK.getText()) - 0.1)));
						} else {
							btnBanK.setText(String.valueOf(df.format(Double.valueOf(btnBanK.getText()) + 0.1)));
						}
						lblShow.setForeground(Color.GREEN);
						lblShow.setText(btnBanK.getText());

					}
					if (tontaiHD == 2) {// long, vi the short

						if (steps == 1) {
							btnMuaK.setText(String.valueOf(df.format(Double.valueOf(btnMuaK.getText()) - 0.1)));
						} else {
							btnMuaK.setText(String.valueOf(df.format(Double.valueOf(btnMuaK.getText()) + 0.1)));
						}
						lblShow.setForeground(Color.RED);
						lblShow.setText(btnMuaK.getText());

					}
					if (tontaiHD == 0) {

						lblTB.setText("Khong ton tai");
					}

					hien_danhSach_lenh = true;
				} else {
					lblTB.setText("Khong ton tai HD");
				}

			}
		});
		btnDong.setBounds(320, 44, 47, 24);
		panel.add(btnDong);
		btnDong.setFont(new Font("Tahoma", Font.PLAIN, 8));

		btnDong.setBackground(Color.PINK);
		btnDong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if (enableKeyBoard) {
						hien_danhSach_lenh = true;
						tglbtnShowHistory.setText("PS ON");
						dongbang = true;

						if (tontaiHD != 0) {

							js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

							if (tontaiHD == 1) { // short,vi the long
								js.executeScript("document.getElementById('right_price').value="
										+ df.format(Double.valueOf(lblShow.getText())) + ";");

								MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
								js.executeScript("arguments[0].click();", MuaButton);
							}
							if (tontaiHD == 2) {// long, vi the short
								js.executeScript("document.getElementById('right_price').value="
										+ df.format(Double.valueOf(btnMuaK.getText())) + ";");

								BanButton = driverVPS.findElement(By.xpath(Banxpath));
								js.executeScript("arguments[0].click();", BanButton);
							}
							if (tontaiHD == 0) {

								lblTB.setText("Khong ton tai");
							}

							hien_danhSach_lenh = true;
						} else {
							lblTB.setText("Khong ton tai HD");
						}
					}
				} catch (Exception eDong) {

				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnDong.setBackground(Color.WHITE);
				dongbang = true;
				lblTB1.setForeground(new Color(245, 247, 227));
				lblTB1.setText("Dong bang");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				dongbang = false;

				btnDong.setBackground(Color.PINK);
				lblTB1.setForeground(Color.ORANGE);
				lblTB1.setText("khong Dong bang");
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				textGiaKhop.setBorder(border);
				textGiaKhop.setBackground(Color.WHITE);
				textGiaKhop.setBounds(313, 19, 56, 21);
				lblShow.setText("");
				textGiaKhop.setVisible(true);
			}
		});
		btnDong.setToolTipText("DONG MUA - BAN");

		final JButton btnDongMK = new JButton("CL");
		btnDongMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (enableKeyBoard) {
						if (!tglbtnShowHistory.isSelected()) {
							hien_danhSach_lenh = false;
							tglbtnShowHistory.doClick();
						}
						if (tontaiHD != 0) {

							js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

							if (tontaiHD == 1) { // vi the short, long
								Order_special("M", "MTL");
								lblTB.setText("MUA MK");
							}
							if (tontaiHD == 2) {// vi the long, short
								Order_special("B", "MTL");
								lblTB.setText("BAN MK");
							}

							// WebElement Click =
							// driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));

							// js.executeScript("arguments[0].click();", Click);
							hien_danhSach_lenh = true;
						} else {
							lblTB.setText("khong ton tai HD");
						}
					}
				} catch (Exception eDong) {

				}

			}
		});
		btnDongMK.setBounds(320, 70, 47, 24);
		panel.add(btnDongMK);
		btnDongMK.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnDongMK.setBackground(Color.PINK);
		btnDongMK.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				btnDongMK.setBackground(Color.WHITE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDongMK.setBackground(Color.PINK);
			}
		});
		btnDongMK.setToolTipText("DONG HOP DONG MK");
		SHD.setBounds(371, 94, 30, 20);
		panel.add(SHD);
		SHD.setFont(new Font("Tahoma", Font.BOLD, 11));
		SHD.setEditable(false);
		SHD.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}

			public void inputMethodTextChanged(InputMethodEvent event) {
				SHD.setText(SHD.getText().replaceAll("[^a-zA-Z]", ""));
				System.out.println(SHD.getText());
			}
		});
		SHD.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				if (!SHD.getText().isEmpty()) {
					if (steps == 1) {
						if (Integer.valueOf(SHD.getText()) >= 2) {
							SHD.setText(String.valueOf(Integer.valueOf(SHD.getText()) - 1));
						}

					} else {
						SHD.setText(String.valueOf(Integer.valueOf(SHD.getText()) + 1));
					}
				}
			}
		});
		SHD.setHorizontalAlignment(SwingConstants.CENTER);

		btnHuyHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (!tglbtnShowHistory.isSelected()) {
					hien_danhSach_lenh = false;
					tglbtnShowHistory.doClick();
				}
				WebElement element = driverVPS.findElement(By.xpath(Huyxpath));
				js.executeScript("arguments[0].click();", element);
				if (!tglbtnShowHistory.isSelected()) {
					hien_danhSach_lenh = false;
					tglbtnShowHistory.doClick();
				}
				// WebElement confirm = modal_price
				// .findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
				// js.executeScript("arguments[0].click();", confirm);
				// WebElement close =
				// driverVPS.findElement(By.xpath("//*[@id=\"confirmModal\"]/div/div/div[1]/button"));
				// js.executeScript("arguments[0].click();", close);

			}
		});
		btnHuyHD.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
			}
		});
		btnHuyHD.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if (fixme) {
					snapto(btnHuyHD);
				}
			}
		});
		btnHuyHD.setBounds(219, 44, 25, 48);
		panel.add(btnHuyHD);
		btnHuyHD.setMaximumSize(new Dimension(33, 23));
		btnHuyHD.setMargin(new Insets(2, 2, 2, 14));
		btnHuyHD.setBackground(Color.LIGHT_GRAY);
		btnHuyHD.setToolTipText("HUY HOP DONG");
		btnHuyHD.setHorizontalAlignment(SwingConstants.LEADING);

		final JButton btnDaoNguoc = new JButton("RV");
		btnDaoNguoc.setBounds(95, 44, 47, 24);
		panel.add(btnDaoNguoc);
		btnDaoNguoc.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnDaoNguoc.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if (enableKeyBoard) {
						if (!tglbtnShowHistory.isSelected()) {
							hien_danhSach_lenh = false;
							tglbtnShowHistory.doClick();
						}

						if (tontaiHD == 1) {

							sohd_daonguoc = Math.abs(Integer.parseInt(hdk.getText())) * 2;
							String_sohd_daonguoc = String.valueOf(sohd_daonguoc);
						}
						if (tontaiHD == 2) {
							sohd_daonguoc = Integer.parseInt(hdk.getText()) * 2;
							String_sohd_daonguoc = String.valueOf(sohd_daonguoc);
						}

						if (tontaiHD != 0) {

							js.executeScript(
									"document.getElementById('sohopdong').value=" + String_sohd_daonguoc + ";");
							try {
								if (textGiaKhop.getText() != "") {
									js.executeScript("document.getElementById('right_price').value="
											+ df.format(Double.valueOf(lblShow.getText())) + ";");

								}
							} catch (NumberFormatException e1) {

							}
							if (tontaiHD == 1) { // vi the short, long
								MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
								js.executeScript("arguments[0].click();", MuaButton);
								hien_danhSach_lenh = true;
							}
							if (tontaiHD == 2) {// vi the long, short
								BanButton = driverVPS.findElement(By.xpath(Banxpath));
								js.executeScript("arguments[0].click();", BanButton);
								hien_danhSach_lenh = true;
							}

						} else {
							lblTB.setText("Khong ton tai HD");
						}
					}
				} catch (Exception eRV) {

				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				dongbang = true;
				btnDaoNguoc.setBackground(Color.WHITE);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDaoNguoc.setBackground(Color.PINK);
				dongbang = false;
			}
		});
		btnDaoNguoc.setToolTipText("DAO NGUOC MUA - BAN");
		btnDaoNguoc.setBackground(Color.PINK);

		final JButton btnDong_DaoNguocMK = new JButton("RV");
		btnDong_DaoNguocMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (enableKeyBoard) {
						if (!tglbtnShowHistory.isSelected()) {
							hien_danhSach_lenh = false;
							tglbtnShowHistory.doClick();
						}
						if (tontaiHD == 1) {

							sohd_daonguoc = Math.abs(Integer.parseInt(hdk.getText())) * 2;
							String_sohd_daonguoc = String.valueOf(sohd_daonguoc);
						}
						if (tontaiHD == 2) {
							sohd_daonguoc = Integer.parseInt(hdk.getText()) * 2;
							String_sohd_daonguoc = String.valueOf(sohd_daonguoc);
						}
						lblTB.setText("shd" + String_sohd_daonguoc + " tontaihd" + tontaiHD);

						if (tontaiHD != 0) {

							js.executeScript(
									"document.getElementById('sohopdong').value=" + String_sohd_daonguoc + ";");
							try {
								if (textGiaKhop.getText() != "") {
									js.executeScript("document.getElementById('right_price').value="
											+ df.format(Double.valueOf(textGiaKhop.getText())) + ";");

								}
							} catch (NumberFormatException e1) {

							}
							if (tontaiHD == 1) { // vi the short, long
								WebElement elementMTL = driverVPS.findElement(By.xpath(MTLxpath));

								js.executeScript("arguments[0].click();", elementMTL);

								MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
								js.executeScript("arguments[0].click();", MuaButton);

							}
							if (tontaiHD == 2) {// vi the long, short
								WebElement elementMTL = driverVPS.findElement(By.xpath(MTLxpath));

								js.executeScript("arguments[0].click();", elementMTL);
								BanButton = driverVPS.findElement(By.xpath(Banxpath));
								js.executeScript("arguments[0].click();", BanButton);

							}

						} else {
							lblTB.setText("Khong ton tai HD");
						}

					}
				} catch (Exception eRV) {

				}

			}
		});
		btnDong_DaoNguocMK.setBounds(95, 70, 47, 24);
		panel.add(btnDong_DaoNguocMK);
		btnDong_DaoNguocMK.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnDong_DaoNguocMK.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseExited(MouseEvent e) {
				btnDong_DaoNguocMK.setBackground(Color.PINK);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnDong_DaoNguocMK.setBackground(Color.WHITE);
			}
		});
		btnDong_DaoNguocMK.setToolTipText("DAO NGUOC MK");
		btnDong_DaoNguocMK.setBackground(Color.PINK);
		chckBreak.setBounds(195, 95, 23, 22);
		panel.add(chckBreak);
		chckBreak.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				if (!txtCL_DUOI.getText().isEmpty()) {
					if (steps == 1) {

						txtCL_TREN.setText(String.valueOf(df.format(Double.valueOf(txtCL_TREN.getText()) - 0.1)));
						txtCL_DUOI.setText(String.valueOf(df.format(Double.valueOf(txtCL_DUOI.getText()) + 0.1)));

					} else {
						txtCL_TREN.setText(String.valueOf(df.format(Double.valueOf(txtCL_TREN.getText()) + 0.1)));
						txtCL_DUOI.setText(String.valueOf(df.format(Double.valueOf(txtCL_DUOI.getText()) - 0.1)));
					}

				}
			}
		});

		// ----------------------------------------------------------

		chckBreak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckBreak.setBackground(Color.PINK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (chckBreak.isSelected()) {
					chckBreak.setBackground(Color.PINK);
				} else {
					chckBreak.setBackground(Color.BLACK);
				}

			}
		});
		chckBreak.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckBreak.isSelected()) {
					CL_M_TREN.setSelected(true);
					CL_B_DUOI.setSelected(true);
					chckBreak.setBackground(Color.PINK);
					if (GIA_KHOP > 0) {

						txtCL_TREN.setText(df.format(GIA_KHOP + Double.valueOf(txtBreak.getText())));
						txtCL_DUOI.setText(df.format(GIA_KHOP - Double.valueOf(txtBreak.getText())));

					}
				} else {
					chckBreak.setBackground(Color.BLACK);
					CL_N_TREN.setSelected(true);
					CL_N_DUOI.setSelected(true);

					if (GIA_KHOP > 0) {
						txtCL_TREN.setText("");
						txtCL_DUOI.setText("");
					}
				}

			}

		});
		chckBreak.setToolTipText("BREAK");
		chckBreak.setSelected(true);
		chckBreak.setHorizontalAlignment(SwingConstants.CENTER);
		chckBreak.setForeground(Color.DARK_GRAY);
		chckBreak.setBackground(Color.BLACK);

		chckBreak.setSelected(false);
		buttonGroupCL_DUOI.add(CL_N_DUOI);
		CL_N_DUOI.setBounds(220, 120, 20, 20);
		panel.add(CL_N_DUOI);
		CL_N_DUOI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (CL_N_DUOI.isSelected()) {
					lblTB.setText("");

				}
			}
		});
		CL_N_DUOI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAuto.setBackground(Color.WHITE);
				txtCL_DUOI.setText("");

			}
		});
		CL_N_DUOI.setSelected(true);

		CL_N_DUOI.setSelected(true);
		CL_N_DUOI.setForeground(Color.BLACK);
		CL_N_DUOI.setFont(new Font("Tahoma", Font.BOLD, 11));
		CL_N_DUOI.setActionCommand("CLNone_DUOI");
		buttonGroupCL_DUOI.add(CL_B_DUOI);
		CL_B_DUOI.setToolTipText("Neu khong co auto, chi thuc hien ban");
		CL_B_DUOI.setBounds(246, 120, 20, 20);
		panel.add(CL_B_DUOI);
		CL_B_DUOI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				// BN.setForeground(Color.RED);
				if (CL_B_DUOI.isSelected()) {
					AutoMK = false;
					txtAuto.setBackground(Color.PINK);

					lblTB.setForeground(Color.RED);
					if (chckBreak.isSelected()) {
						frmRubbyMoney.setTitle(title + " - Check Break");
					} else {
						frmRubbyMoney.setTitle(title + " -ONLY BAN khi gia giam :" + "[ " + txtAuto.getText() + " ]");
					}

				}
			}
		});
		CL_B_DUOI.setBackground(Color.RED);

		CL_B_DUOI.setForeground(Color.RED);
		CL_B_DUOI.setFont(new Font("Tahoma", Font.BOLD, 11));
		CL_B_DUOI.setActionCommand("CLBan_DUOI");

		buttonGroupCL_DUOI.add(CL_M_DUOI);
		CL_M_DUOI.setToolTipText("Neu khong co auto, chi thuc hien mua");
		CL_M_DUOI.setBounds(272, 120, 20, 20);
		panel.add(CL_M_DUOI);
		CL_M_DUOI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (CL_M_DUOI.isSelected()) {
					if (chckBreak.isSelected()) {
						frmRubbyMoney.setTitle(title + "- Check Break");
					} else {
						frmRubbyMoney.setTitle(title + " - ONLY MUA khi gia TANG :" + "[ " + txtAuto.getText() + " ]");
					}
					AutoMK = false;
					txtAuto.setBackground(Color.GREEN);

					lblTB.setForeground(Color.GREEN);
				}
			}
		});
		CL_M_DUOI.setBackground(Color.GREEN);

		CL_M_DUOI.setForeground(new Color(0, 128, 0));
		CL_M_DUOI.setFont(new Font("Tahoma", Font.BOLD, 11));
		CL_M_DUOI.setActionCommand("CLMua_DUOI");

		txtCL_DUOI = new JTextField();
		txtCL_DUOI.setBounds(299, 120, 61, 20);
		panel.add(txtCL_DUOI);
		txtCL_DUOI.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				if (!txtCL_DUOI.getText().isEmpty()) {
					if (steps == 1) {
						txtCL_DUOI.setText(String.valueOf(df.format(Double.valueOf(txtCL_DUOI.getText()) - 0.1)));
					} else {
						txtCL_DUOI.setText(String.valueOf(df.format(Double.valueOf(txtCL_DUOI.getText()) + 0.1)));
					}
				}
			}
		});
		txtCL_DUOI.setEditable(false);
		txtCL_DUOI.setColumns(10);
		txtCL_DUOI.setBackground(new Color(255, 239, 213));

		txtBreak = new JTextField();
		txtBreak.setEditable(false);
		txtBreak.setBounds(162, 96, 30, 20);
		panel.add(txtBreak);
		txtBreak.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				if (!txtBreak.getText().isEmpty()) {
					if (steps == 1) {

						txtBreak.setText(String.valueOf(dl.format(Double.valueOf(txtBreak.getText()) - 0.1)));

					} else {
						txtBreak.setText(String.valueOf(dl.format(Double.valueOf(txtBreak.getText()) + 0.1)));
					}
				}
			}
		});
		txtBreak.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtBreak.setAlignmentY(Component.TOP_ALIGNMENT);
		txtBreak.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtBreak.setHorizontalAlignment(SwingConstants.CENTER);
		txtBreak.setText("1.2");

		txtAuto = new JTextField();
		txtAuto.setBounds(371, 119, 30, 20);
		panel.add(txtAuto);
		txtAuto.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();

				if (!txtAuto.getText().isEmpty()) {
					if (steps == 1) {

						txtAuto.setText(String.valueOf(dl.format(Double.valueOf(txtAuto.getText()) - 0.1)));

					} else {
						txtAuto.setText(String.valueOf(dl.format(Double.valueOf(txtAuto.getText()) + 0.1)));
					}
				}
				if (CL_B_DUOI.isSelected()) {

					frmRubbyMoney.setTitle(title + " - ONLY BAN khi gia giam :" + "[ " + txtAuto.getText() + " ]");
				}
				if (CL_M_DUOI.isSelected()) {

					frmRubbyMoney.setTitle(title + " - ONLY MUA khi gia TANG :" + "[ " + txtAuto.getText() + " ]");
				}
				if (AutoMK) {

					frmRubbyMoney.setTitle(title + " - MUA / BAN khi gia tang/giam:" + "[ " + txtAuto.getText() + " ]");
				}
			}
		});
		txtAuto.setText("1.2");
		txtAuto.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtAuto.setAlignmentY(0.0f);
		txtAuto.setAlignmentX(0.0f);
		txtAuto.setHorizontalAlignment(SwingConstants.CENTER);
		txtAuto.setText("1");
		lblShow.setHorizontalAlignment(SwingConstants.CENTER);
		lblShow.setHorizontalTextPosition(SwingConstants.CENTER);
		lblShow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblShow.setForeground(Color.RED);
		lblShow.setBounds(238, 3, 60, 14);

		panel.add(lblShow);

		final JButton btnDong_1 = new JButton("CL");
		btnDong_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDong_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if (fixme) {
					snapto(btnDong_1);
				}
			}
		});
		btnDong_1.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				String t = "không tồn tại";
				double steps = e.getWheelRotation();

				if (tontaiHD != 0) {
					textGiaKhop.setBounds(30, 19, 56, 21);
					Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
					textGiaKhop.setBorder(border);

					textGiaKhop.setBackground(Color.BLACK);
					if (tontaiHD == 1) { // short,vi the long

						if (steps == 1) {
							textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) - 0.1)));
						} else {
							textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) + 0.1)));
						}
						lblShow.setForeground(Color.GREEN);
						lblShow.setText(textGiaKhop.getText());

					}
					if (tontaiHD == 2) {// long, vi the short

						if (steps == 1) {
							textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) - 0.1)));
						} else {
							textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) + 0.1)));
						}
						lblShow.setForeground(Color.RED);
						lblShow.setText(textGiaKhop.getText());

					}
					if (tontaiHD == 0) {

						lblTB.setText(t);
					}

					hien_danhSach_lenh = true;
				} else {
					lblTB.setText(t);
				}

			}
		});
		btnDong_1.setBounds(151, 22, 50, 20);
		panel.add(btnDong_1);
		btnDong_1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (enableKeyBoard) {

					if (tontaiHD != 0) {

						js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");
						js.executeScript("document.getElementById('right_price').value="
								+ Double.valueOf(textGiaKhop.getText()) + ";");

						if (tontaiHD == 1) { // short,vi the long

							MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
							js.executeScript("arguments[0].click();", MuaButton);
						}
						if (tontaiHD == 2) {// long, vi the short

							BanButton = driverVPS.findElement(By.xpath(Banxpath));
							js.executeScript("arguments[0].click();", BanButton);
						}
						if (tontaiHD == 0) {

							lblTB.setText("Khong ton tai");
						}

						hien_danhSach_lenh = true;
					} else {
						lblTB.setText("Khong ton tai HD");
					}
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				dongbang = false;
				textGiaKhop.setVisible(true);
				btnDong_1.setBackground(Color.PINK);
				lblTB1.setForeground(Color.ORANGE);
				lblTB1.setText("khong Dong bang");
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				textGiaKhop.setBorder(border);
				textGiaKhop.setBackground(Color.WHITE);
				textGiaKhop.setBounds(313, 19, 56, 21);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				dongbang = true;
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				textGiaKhop.setBorder(border);
				textGiaKhop.setBackground(Color.WHITE);
				textGiaKhop.setBounds(313, 19, 56, 21);

				btnDong_1.setBackground(Color.WHITE);
				lblTB1.setForeground(new Color(245, 247, 227));
				lblTB1.setText("Dong bang");
			}
		});
		btnDong_1.setToolTipText("DONG MUA - BAN");
		btnDong_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnDong_1.setBackground(Color.PINK);
		lblTB1.setBounds(1, 6, 84, 14);
		panel.add(lblTB1);
		lblTB1.setFont(new Font("Tahoma", Font.PLAIN, 9));

		lblTB1.setToolTipText("");
		lblTB1.setForeground(Color.ORANGE);

		final JLabel lblVN30New = new JLabel("VN30");
		lblVN30New.setBounds(376, 21, 35, 14);
		panel.add(lblVN30New);
		lblVN30New.setForeground(Color.WHITE);
		lblVN30New.setFont(new Font("Tahoma", Font.PLAIN, 15));
		conn.setBounds(391, 3, 50, 14);
		panel.add(conn);

		conn.setForeground(Color.WHITE);
		conn.setFont(new Font("Tahoma", Font.PLAIN, 10));

		final JLabel Iconn = new JLabel("conn");
		Iconn.setForeground(Color.WHITE);
		Iconn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Iconn.setBounds(445, 3, 24, 14);
		panel.add(Iconn);

		tglbtnShowChart.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (tglbtnShowChart.isSelected()) {
					tglbtnShowChart.setText("S");
					showtradeview = true;
				} else {
					showtradeview = false;
					tglbtnShowChart.setText("H");
				}

			}
		});
		tglbtnShowChart.setSelected(true);
		tglbtnShowChart.setBounds(95, 21, 49, 23);
		panel.add(tglbtnShowChart);
		tglbtnShowList.setBounds(76, 124, 65, 20);
		panel.add(tglbtnShowList);

		tglbtnAuto.setBounds(147, 124, 70, 21);
		panel.add(tglbtnAuto);

		final JButton btnType = new JButton("1");
		btnType.setBounds(0, 100, 44, 23);
		panel.add(btnType);
		btnType.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();

				if (steps == 1) {
					if (TimeCheck == 5) {
						TimeCheck = 1;
					}
				} else {
					if (TimeCheck == 1) {
						TimeCheck = 5;
					}
				}

				btnType.setText(String.valueOf(TimeCheck));

			}
		});
		btnType.setFont(new Font("Tahoma", Font.PLAIN, 9));
		panelKey.setBounds(0, 54, 29, 33);
		panel.add(panelKey);

		panelKey.add(new JLabel(new ImageIcon("c:/jar/keyboard.png")));
		lblTB.setBounds(1, 30, 77, 14);
		panel.add(lblTB);
		lblTB.setFont(new Font("Tahoma", Font.PLAIN, 9));

		lblTB.setToolTipText("");

		lblTB.setForeground(Color.ORANGE);
		lblVN30.setBounds(10, 126, 43, 14);
		panel.add(lblVN30);
		lblVN30.setVisible(false);
		lblVN30.setForeground(Color.WHITE);
		lblVN30.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnAction.setToolTipText("ngfnmchmcgh");
		btnAction.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));

		btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (CountAction == 4)
					CountAction = 0;

				CountAction = CountAction + 1;
				System.out.println("CountAction :" + CountAction);
				PointerInfo a = MouseInfo.getPointerInfo();
				Point b = a.getLocation();
				btnAction.setBackground(Color.WHITE);
				if (CountAction == 1) {

					btnAction.setForeground(Color.BLACK);
					MStart_X = (int) b.getX();
					MStart_Y = (int) b.getY();
					BStart_X = btnAction.getBounds().x;
					BStart_Y = btnAction.getBounds().y;
					txtAction_Price = textGiaKhop.getText();
					btnAction.setText("start");
					System.out.println("MStart_X :" + MStart_X + "MStart_Y :" + MStart_Y);
					System.out.println("BStart_X :" + BStart_X + "BStart_Y :" + BStart_Y);
					System.out.println("txtAction_Price :" + txtAction_Price);
				}
				if (CountAction == 2) {
					Mfixed_X = (int) b.getX();
					Mfixed_Y = (int) b.getY();
					Bfixed_X = btnAction.getBounds().x;
					Bfixed_Y = btnAction.getBounds().y;
					btnAction.setForeground(Color.BLUE);
					System.out.println("Mfixed_X :" + Mfixed_X + "Mfixed_Y :" + Mfixed_Y);
					System.out.println("Bfixed_X :" + Bfixed_X + "Bfixed_Y :" + Bfixed_Y);

					if (actionChoice.equals("Mua")) {

						btnAction.setText("fix-M");
					}
					if (actionChoice.equals("Ban")) {
						btnAction.setText("fix-B");
					}

				}

				if (CountAction == 3) {
					if (enableKeyBoard) {
						if (actionChoice.equals("Mua")) {
							lblTB1.setText("MUA");
							btnAction.setText("Mua");
							btnAction.setForeground(Color.BLUE);
							// -------------

							if (!tglbtnShowHistory.isSelected()) {
								tglbtnShowHistory.doClick();
							}
							try {

								txtCL_TREN.setText("");
								CL_N_TREN.setSelected(true);

								Mua_1806 = driverVPS.findElement(By.id(HD));
								Ban_1806 = driverVPS.findElement(By.id(HD1));
								Gia_khop = driverVPS.findElement(By.id(HDCLOSE));

								js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

								js.executeScript("document.getElementById('right_price').value="
										+ Double.valueOf(lblShow.getText()) + ";");

								MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
								js.executeScript("arguments[0].click();", MuaButton);

							} catch (Exception eMua) {

							}

							// -------------

						}
						if (actionChoice.equals("Ban")) {
							btnAction.setText("Ban");
							btnAction.setForeground(Color.RED);
							// -----------------

							try {
								txtCL_TREN.setText("");
								CL_N_TREN.setSelected(true);

								Mua_1806 = driverVPS.findElement(By.id(HD));
								Ban_1806 = driverVPS.findElement(By.id(HD1));
								Gia_khop = driverVPS.findElement(By.id(HDCLOSE));

								js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

								js.executeScript("document.getElementById('right_price').value="
										+ Double.valueOf(lblShow.getText()) + ";");

								BanButton = driverVPS.findElement(By.xpath(Banxpath));
								js.executeScript("arguments[0].click();", BanButton);

							} catch (Exception eBan) {

							}

							// -----------------
						}
						if (!tglbtnShowHistory.isSelected()) {
							hien_danhSach_lenh = false;

							tglbtnShowHistory.doClick();

						}
						btnAction.setLocation(BStart_X, BStart_Y);
						btnAction.setForeground(Color.BLACK);
						btnAction.setText("reset");
						CountAction = 0;

					} else {
						lblTB1.setText("keyboard disabled");
					}
				}
				if (CountAction == 4) {
					btnAction.setLocation(BStart_X, BStart_Y);
					btnAction.setForeground(Color.BLACK);
					lblShow.setText("");
					btnAction.setText("reset");
					CountAction = 0;
				}
			}
		});
		;
		btnAction.setBounds(96, 1, 66, 20);
		panel.add(btnAction);

		addPopup(btnAction, popupMenu);
		MenuItem_mua.setForeground(Color.BLUE);
		MenuItem_mua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				actionChoice = "Mua";
				btnAction.setForeground(Color.BLUE);
				btnAction.setText("Mua");
			}

		});

		popupMenu.add(MenuItem_mua);
		MenuItem_Ban.setForeground(new Color(139, 0, 0));
		MenuItem_Ban.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionChoice = "Ban";
				btnAction.setForeground(new Color(139, 0, 0));
				btnAction.setText("Ban");
			}
		});

		popupMenu.add(MenuItem_Ban);
		textGiaKhop.setBounds(313, 21, 56, 21);
		panel.add(textGiaKhop);

		textGiaKhop.setHorizontalAlignment(SwingConstants.CENTER);
		textGiaKhop.setEditable(false);
		textGiaKhop.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();

				if (steps == 1) {
					textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) - 0.1)));
				} else {
					textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) + 0.1)));
				}

			}
		});

		textGiaKhop.setFont(new Font("Tahoma", Font.BOLD, 12));
		textGiaKhop.setColumns(10);

		final JButton btnMuaK_1 = new JButton("");
		btnMuaK_1.setBounds(203, 21, 50, 21);
		panel.add(btnMuaK_1);
		btnMuaK_1.setIcon(new ImageIcon("C:\\jar\\buffalo.png"));
		btnMuaK_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if (fixme) {
					snapto(btnMuaK_1);
				}
			}
		});
		btnMuaK_1.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				if (steps == 1) {
					textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) - 0.1)));
				} else {
					textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) + 0.1)));
				}
				lblShow.setForeground(Color.GREEN);
				lblShow.setText(textGiaKhop.getText());
			}
		});

		btnMuaK_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dongbang = true;
				lblTB1.setForeground(new Color(245, 247, 227));
				btnMuaK_1.setBackground(Color.PINK);
				lblTB1.setText("Dong bang");
				lblShow.setBounds(137, 3, 60, 14);
				lblShow.setForeground(Color.GREEN);
				lblShow.setText(btnMuaK.getText());
				textGiaKhop.setBounds(313, 19, 56, 21);
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				textGiaKhop.setBorder(border);

				textGiaKhop.setBackground(Color.WHITE);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				dongbang = false;
				btnMuaK_1.setBackground(Color.WHITE);
				lblTB1.setForeground(Color.ORANGE);
				lblTB1.setText("khong Dong bang");
				textGiaKhop.setBackground(Color.WHITE);
				lblShow.setText("");
				textGiaKhop.setBounds(313, 19, 56, 21);
				textGiaKhop.setVisible(true);

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				if (enableKeyBoard) {
					if (!tglbtnShowHistory.isSelected()) {
						hien_danhSach_lenh = false;
						tglbtnShowHistory.doClick();
					}
					try {

						js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

						js.executeScript("document.getElementById('right_price').value="
								+ Double.valueOf(textGiaKhop.getText()) + ";");

						MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
						js.executeScript("arguments[0].click();", MuaButton);
						hien_danhSach_lenh = true;

					} catch (Exception eMua) {

					}
				} else {
					lblTB.setText("Keyboard disable");

				}
			}

		});

		btnMuaK_1.setToolTipText("Mua Khá»›p");
		btnMuaK_1.setMargin(new Insets(2, 5, 2, 5));
		btnMuaK_1.setHorizontalTextPosition(SwingConstants.LEADING);
		btnMuaK_1.setForeground(new Color(0, 100, 0));
		btnMuaK_1.setFont(new Font("Tahoma", Font.BOLD, 12));

		final JButton btnBanK_1 = new JButton("");
		btnBanK_1.setBounds(255, 21, 50, 21);
		panel.add(btnBanK_1);
		btnBanK_1.setIcon(new ImageIcon("C:\\jar\\bear.png"));
		btnBanK_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if (fixme) {
					snapto(btnBanK_1);
				}
			}
		});
		btnBanK_1.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();
				if (steps == 1) {
					textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) - 0.1)));
				} else {
					textGiaKhop.setText(String.valueOf(df.format(Double.valueOf(textGiaKhop.getText()) + 0.1)));
				}
				lblShow.setForeground(Color.RED);
				lblShow.setText(textGiaKhop.getText());
			}
		});

		btnBanK_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dongbang = true;
				btnBanK_1.setBackground(Color.PINK);
				lblTB1.setForeground(new Color(245, 247, 227));
				lblTB1.setText("Dong bang");
				lblShow.setBounds(193, 3, 60, 14);
				lblShow.setForeground(Color.RED);
				lblShow.setText(btnMuaK.getText());
				lblShow.setVisible(true);
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				textGiaKhop.setBorder(border);
				textGiaKhop.setBackground(Color.WHITE);
				textGiaKhop.setBounds(313, 19, 56, 21);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				dongbang = false;
				btnBanK_1.setBackground(Color.WHITE);
				lblTB1.setForeground(Color.ORANGE);
				lblTB1.setText("khong Dong bang");

				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				textGiaKhop.setBorder(border);
				textGiaKhop.setBackground(Color.WHITE);
				textGiaKhop.setBounds(313, 19, 56, 21);
				lblShow.setText("");
				textGiaKhop.setVisible(true);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (enableKeyBoard) {
					if (!tglbtnShowHistory.isSelected()) {
						hien_danhSach_lenh = false;
						tglbtnShowHistory.doClick();
					}
					try {
						js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

						js.executeScript("document.getElementById('right_price').value="
								+ Double.valueOf(textGiaKhop.getText()) + ";");

						BanButton = driverVPS.findElement(By.xpath(Banxpath));
						js.executeScript("arguments[0].click();", BanButton);

						hien_danhSach_lenh = true;
					} catch (Exception eBan) {

					}
				} else {
					lblTB.setText("Keyboard disable");
				}
			}
		});

		btnBanK_1.setToolTipText("BÃ¡n Khá»›p");
		btnBanK_1.setMargin(new Insets(2, 5, 2, 5));
		btnBanK_1.setForeground(Color.RED);
		btnBanK_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBanK_1.setBackground(Color.WHITE);
		Refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hien_danhSach_lenh = true;
				tglbtnShowHistory.doClick();
				driverVPS.navigate().refresh();

				js = (JavascriptExecutor) driverVPS;

				MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
				BanButton = driverVPS.findElement(By.xpath(Banxpath));

				try {

					js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");
					js.executeScript("document.body.style.zoom = '50%';");

					frmRubbyMoney.setTitle(" check page loaded,");
					untilPageLoadComplete(driverVPS, 20);
					frmRubbyMoney.setTitle(frmRubbyMoney.getTitle() + " click show history ...");
					WebElement showhd = driverVPS.findElement(By.xpath("//*[@id=\"miniIndex\"]/div[2]/span/a[2]/img"));
					js.executeScript("arguments[0].click();", showhd);

				} catch (NoSuchElementException e1) {
				}

			}
		});
		Refresh.setBounds(130, 229, 16, 17);
		panel.add(Refresh);
		Refresh.setBackground(new Color(144, 238, 144));
		Refresh.setToolTipText("Refresh");

		Refresh.setFont(new Font("Tahoma", Font.PLAIN, 6));

		JLabel lblDong_1_2_1 = new JLabel("refresh");
		lblDong_1_2_1.setBounds(78, 230, 49, 14);
		panel.add(lblDong_1_2_1);
		lblDong_1_2_1.setForeground(Color.WHITE);

		final JButton btnStart = new JButton("Start");
		btnStart.setBounds(277, 230, 20, 20);
		panel.add(btnStart);
		btnStart.setIcon(iconeStart);
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnStart.setForeground(new Color(0, 153, 0));
		comboBox.setBounds(224, 230, 47, 20);
		panel.add(comboBox);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				FileWriter fw = null;
				try {
					fw = new FileWriter("C:\\Jar\\month.txt");
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				PrintWriter pw = new PrintWriter(fw);
				HDmonth = comboBox.getSelectedItem().toString();
				pw.write(HDmonth);
				pw.flush();
				pw.close();
			}
		});

		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		tableHistory.setFillsViewportHeight(true);
		tableHistory.setFont(new Font("Tahoma", Font.PLAIN, 11));
		scrollPaneHistory.setBounds(83, 145, 309, 74);
		panel.add(scrollPaneHistory);
		scrollPaneHistory.setViewportView(tableHistory);

		// tableHistory.setSelectionBackground(Color.WHITE);
		tableHistory.setSelectionForeground(Color.WHITE);

		tableHistory.setModel(new DefaultTableModel(
				new Object[][] { { "", "-", "-", "-", "-", "-" }, { "", "-", "-", "-", "-", "-" },
						{ "", "-", "-", "-", "-", "-" }, },
				new String[] { "Khop", "Type", "Status", "Price", "ChuaK", "Time" }));

		JButton btnNewButton_1 = new JButton("start");
		btnNewButton_1.setBounds(6, 156, 71, 23);
		panel.add(btnNewButton_1);

		final JButton btnSetup = new JButton("setup");
		btnSetup.setBounds(6, 183, 71, 23);
		panel.add(btnSetup);
		btnshow.setBounds(6, 209, 71, 23);
		panel.add(btnshow);
		btnshow.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {

				JavascriptExecutor js = ((JavascriptExecutor) driverStock);
				System.out.println("scroll ok");
				double steps = e.getWheelRotation();

				if (steps == 1) {

					js.executeScript("window.scrollBy(0,50)", "");

				} else {

					js.executeScript("window.scrollBy(0,-50)", "");

				}

			}
		});

		btnshow.setText("sroll");

		final JToggleButton tglbtnNewToggleButton_HLess = new JToggleButton("N");
		tglbtnNewToggleButton_HLess.setBounds(158, 230, 56, 20);
		panel.add(tglbtnNewToggleButton_HLess);
		tglbtnNewToggleButton_HLess.setText("HL");
		tglbtnNewToggleButton_HLess.setToolTipText("HEADLESS");
		tglbtnNewToggleButton_HLess.setSelected(true);

		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setBounds(302, 230, 20, 20);
		panel.add(btnNewButton_4_1);
		btnNewButton_4_1.setIcon(iconeStart);
		btnClear.setBounds(326, 229, 56, 20);
		panel.add(btnClear);
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnClear.setBackground(Color.PINK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnClear.setBackground(Color.WHITE);
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// driverVPS.findElement(By.xpath("//*[@id=\"header-toolbar-fullscreen\"]"));
				dn = !dn;
				if (!dn) {
					btnClear.setForeground(Color.BLUE);
				} else {
					btnClear.setForeground(Color.RED);
				}
				lblTB.setText("");
				lblTB1.setText("");
				txtCL_TREN.setText("");
				txtCL_DUOI.setText("");
				lblTB.setText("");

			}
		});

		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 8));

		panel_info.setBackground(Color.BLACK);
		panel_info.setBounds(400, 201, 79, 48);
		panel.add(panel_info);
		panel_info.setLayout(null);
		lblHDK.setBounds(16, 0, 46, 14);
		panel_info.add(lblHDK);
		lblHDK.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHDK.setForeground(Color.WHITE);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(0, 19, 76, 7);
		panel_info.add(btnNewButton_2);
		lblSM.setBounds(0, 34, 76, 14);
		panel_info.add(lblSM);
		lblSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblSM.setForeground(Color.WHITE);

		lblCheck.setForeground(new Color(255, 255, 255));
		lblCheck.setBounds(10, 234, 46, 14);
		panel.add(lblCheck);

		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				driverStock.switchTo().defaultContent();

				JavascriptExecutor jss = (JavascriptExecutor) driverStock;

				WebElement left = driverStock.findElement(By.xpath("//*[@id=\"left\"]"));

				WebElement right = driverStock.findElement(By.xpath("//*[@id=\"right\"]"));
				jss.executeScript("arguments[0].style.height = '" + String.valueOf(600) + "px'", right);

				jss.executeScript("arguments[0].style.height = '" + String.valueOf(600) + "px'", left);
			}
		});
		btnF.setBounds(29, 131, 47, 23);
		panel.add(btnF);
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Runnable runnable = new Runnable() {
					public void run() {
						
						StockList = new Vector();

						colunm_HeadStock = new Vector();
						colunm_HeadStock.addElement("ten");
						colunm_HeadStock.addElement("gia");
						colunm_HeadStock.addElement("ch");
						colunm_HeadStock.addElement("%");
						colunm_HeadStock.addElement("gia_m");
						colunm_HeadStock.addElement("kl_m");
						colunm_HeadStock.addElement("gia_b");
						colunm_HeadStock.addElement("kl_b");
						frmRubbyMoney.setTitle("start loading list");
						File file = new File("E:\\mystock.txt");
						System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
						ChromeOptions chromeOptionList = new ChromeOptions();
						chromeOptionList.setHeadless(HeadLess);
						DriverStockList = new ChromeDriver(chromeOptionList);
						DriverStockList.get("https://iboard.ssi.com.vn/");
						frmRubbyMoney.setTitle("start loading list....");
						Actions action = new Actions(DriverStockList);
						WebElement we = DriverStockList.findElement(By
								.xpath("//*[@id=\"main-wrapper\"]/div[1]/section[2]/div[2]/div[1]/ul/li[1]/div/span"));
						action.moveToElement(we).build().perform();

						BufferedReader br;
						String ma;
						if (DriverStockList.findElement(By.xpath(
								"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
								.isDisplayed()) {
							DriverStockList.findElement(By.xpath(
									"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
									.sendKeys("TUAN");
							DriverStockList.findElement(By.xpath(
									"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
									.sendKeys(Keys.ENTER);
						}

						try {
							br = new BufferedReader(new FileReader(file));

							while ((ma = br.readLine()) != null && !ma.isEmpty()) {
								frmRubbyMoney.setTitle("input : " + ma);
								DriverStockList.findElement(By.xpath("//*[@id=\"downshift-0-input\"]")).sendKeys(ma);
								DriverStockList.findElement(By.xpath("//*[@id=\"downshift-0-input\"]"))
										.sendKeys(Keys.ENTER);
								StockList.addElement(ma);
							}
							frmRubbyMoney.setTitle("done ...");
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {

						}

					}

				};

				Thread thread = new Thread(runnable);

				thread.start();
			}
		});

		// frmRubbyMoney.getContentPane().add(scroll);

		tglbtnNewToggleButton_HLess.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (tglbtnNewToggleButton_HLess.isSelected()) {
					HeadLess = true;
					tglbtnNewToggleButton_HLess.setText("HL");

				} else {
					HeadLess = false;
					tglbtnNewToggleButton_HLess.setText("N");
				}
			}

		});
		btnshow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flagvn30 = !flagvn30;

				btnshow.setText(flagvn30 ? "old" : "new");
				if (flagvn30) {
					lblVN30.setBounds(308, 21, 43, 14);
					lblVN30.setVisible(true);
					lblVN30New.setBounds(23, 131, 43, 14);
					lblVN30New.setVisible(false);

				} else {
					lblVN30.setBounds(23, 131, 43, 14);
					lblVN30.setVisible(false);
					lblVN30New.setBounds(308, 21, 43, 14);
					lblVN30New.setVisible(true);

				}

			}

		});
		btnSetup.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = e.getWheelRotation();

				if (steps == 1) {

					typeColor = typeColor - 1;
					if (typeColor < 1)
						typeColor = 3;
				} else {

					typeColor = typeColor + 1;
					if (typeColor > 3)
						typeColor = 1;
				}

				btnSetup.setText(String.valueOf(typeColor));
			}
		});

		btnSetup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Runnable StockThread = new Runnable() {

					public void run() {

						driverStock.switchTo().defaultContent();

						try {
							JavascriptExecutor jss = (JavascriptExecutor) driverStock;

							WebElement left = driverStock.findElement(By.xpath("//*[@id=\"left\"]"));

							WebElement right = driverStock.findElement(By.xpath("//*[@id=\"right\"]"));
							jss.executeScript("arguments[0].style.height = '" + String.valueOf(heightL - 300) + "px'",
									left);
							jss.executeScript("arguments[0].style.height = '" + String.valueOf(heightR - 400) + "px'",
									right);

							jss.executeScript("arguments[0].style.height = '" + String.valueOf(heightL - 300) + "px'",
									left);
							jss.executeScript("arguments[0].style.height = '" + String.valueOf(heightR - 400) + "px'",
									left);
							if (CheckOK()) {

								setupChart("iframe_left", 0, typeColor);
								Thread.sleep(200);
								setupChart("iframe_right", 0, typeColor);
							} else {
								lblCheck.setText("Refresh");
							}
							// Thread.sleep(300);
							// setupChart("iframe_bottom", 0, typeColor);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}

					}// run
				};// runable
				threadstock = new Thread(StockThread);
				threadstock.start();
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Runnable StockThread = new Runnable() {

					public void run() {
						// WebDriverManager.chromedriver().setup();
						// System.out.println("done");
						System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver.exe");
						System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
						System.setProperty("webdriver.edge.driver", "C://drivers//msedgedriver.exe");

						driverStock = new ChromeDriver();

						driverStock.get("file:///E:/ps/src/main/resources/index.html");
						org.openqa.selenium.Dimension n = new org.openqa.selenium.Dimension(1590, 700);
						driverStock.manage().window().setSize(n);
						;

						// driverStock.switchTo().frame(driverStock.findElement(By.xpath("//*[contains(@id,'tradingview')]")));
					} // Thread
				};
				threadstock = new Thread(StockThread);
				threadstock.start();
			}

		});

		// display(tableHistory,driverVPS);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thread t = new Thread() {

					public void run() {
						try {
							frmRubbyMoney.setTitle("Clicked ...");
							File file = new File("C:\\jar\\month.txt");

							BufferedReader br;
							try {
								br = new BufferedReader(new FileReader(file));
								HDmonth = br.readLine();
								System.out.println("HDmonth :" + HDmonth);

								br.close();

							} catch (IOException e1) {

								e1.printStackTrace();
							}

							System.out.println("Thang la : " + HDmonth);

							comboBox.setSelectedItem(HDmonth);
							chckBreak.setSelected(false);
							/* CONNECTION */
							if (c) {
								// itemvn30 = "divVnIndex_30";

								itemvn30 = "divVnIndex_30";
								// * HD="VN30F1910best1Offer"; HD1="VN30F1910closePrice";
								/*
								 * HD = HDDay + HDmonth + "best1Offer"; HD1 = HDDay + HDmonth + "best1Bid";
								 * HDCLOSE = HDDay + HDmonth + "closePrice";
								 */
								HD = HDDay + HDmonth + "oP1";
								HD1 = HDDay + HDmonth + "bP1";
								HDCLOSE = HDDay + HDmonth + "pri";
								System.out.println("- HD : " + HD + " - HD1 : " + HD1 + "- HDCLOSE : " + HDCLOSE);
								// HD1 = HDDay + HDmonth + "closePrice";
								// baseUrl = "http://phaisinhprice.bsc.com.vn/";
								baseUrl = "http://priceboard.bsc.com.vn/";

							} else {
								itemvn30 = "spIdxPoint2";
								HD = "VN30F19108"; // ben ban
								HD1 = "VN30F191016"; // ben mua
								baseUrl = "https://livedragon.vdsc.com.vn/fos/fos.rv";

							}
							itemvn30New = "//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div[1]/div[2]/div[1]/div[2]/span[1]";
							// itemvn30New =
							// "//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div[1]/div[2]/div[1]/div[2]/span[1]";
							TimeUnit.SECONDS.sleep(1);

						} catch (InterruptedException e1) {

							e1.printStackTrace();
						}

						start = !start;
						if (start) {
							btnStart.setText("Stop");
						} else {
							btnStart.setText("Start");

						}

						try {

							System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver.exe");
							System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
							System.setProperty("webdriver.edge.driver", "C://drivers//msedgedriver.exe");

							frmRubbyMoney.setTitle(title + " - Driver chrome");
							// FirefoxBinary firefoxBinary = new FirefoxBinary();
							// firefoxBinary.addCommandLineOptions("--headless");
							// FirefoxOptions firefoxOptions = new FirefoxOptions();

							ChromeOptions chromeOptionVN30 = new ChromeOptions();
							chromeOptionVN30.setHeadless(true);

							ChromeOptions chromeOptionVPS = new ChromeOptions();
							chromeOptionVPS.setHeadless(HeadLess);
							/// firefoxOptions.setBinary(firefoxBinary);

							// driverDownFuture = new FirefoxDriver(firefoxOptions);
							// driverRagon = new FirefoxDriver(firefoxOptions);

							driverNew = new ChromeDriver(chromeOptionVN30);

							driverVPS = new ChromeDriver(chromeOptionVPS);

							driverVPS.get("https://smartpro.vps.com.vn");
							frmRubbyMoney.setTitle("vps.com.vn loading ...");

							frmRubbyMoney.setTitle(" - VN30 loading ...");
							driverNew.get("https://www.investing.com/indices/vn-30");

							// ---------------expire
							// Select select = new Select(driverVPS.findElement(By.id("slExpire")));
							// select.selectByValue("720");
							// ---------------
							driverVPS.findElement(By.xpath("//*[@id=\"form-login\"]/div[2]/div[2]/input"))
									.sendKeys("163170");
							driverVPS.findElement(By.xpath("//*[@id=\"form-login\"]/div[2]/div[3]/input"))
									.sendKeys("Nh@ngoc123");

							driverVPS.findElement(By.xpath("//*[@id=\"form-login\"]/div[2]/div[7]/button[1]")).click();
							js = (JavascriptExecutor) driverVPS;
							frmRubbyMoney.setTitle(" pass login input...");
							untilPageLoadComplete(driverVPS, 20);
							frmRubbyMoney.setTitle(" page loaded ...");
							// -----------
							Thread.sleep(200);
							do {
								try {

									Mua_1806 = driverVPS.findElement(By.id(HD));
									Ban_1806 = driverVPS.findElement(By.id(HD1));
									Gia_khop = driverVPS.findElement(By.id(HDCLOSE));

									retryNeeded1 = false;
									frmRubbyMoney.setTitle(">>> Loading vps .. ");
								} catch (NoSuchElementException e) {

									frmRubbyMoney.setTitle(">>> Loading vps ....  ");
									retryNeeded1 = true;
								}
							} while (retryNeeded1);
							frmRubbyMoney.setTitle(">>> Load completed ...");
							// vn30 = driver.findElement(By.id(itemvn30));
							vn30New = driverNew.findElement(By.xpath(itemvn30New));
							/*
							 * if (!vn30.getText().isEmpty()) {
							 * 
							 * GIA_VN30 = (Float.valueOf(Float.parseFloat((String)
							 * vn30.getText().replaceAll(",", "")))) .floatValue(); }
							 */
							GIA_VN30New = (Float
									.valueOf(Float.parseFloat((String) vn30New.getText().replaceAll(",", ""))))
									.floatValue();

							try {

								GIA_MUA = (Float
										.valueOf(Float.parseFloat((String) Mua_1806.getText().replaceAll(",", ""))))
										.floatValue();
								GIA_BAN = (Float
										.valueOf(Float.parseFloat((String) Ban_1806.getText().replaceAll(",", ""))))
										.floatValue();
								GIA_KHOP = (Float
										.valueOf(Float.parseFloat((String) Gia_khop.getText().replaceAll(",", ""))))
										.floatValue();

							} catch (NumberFormatException e) {

							}

							try {
								js.executeScript("document.body.style.zoom = '50%';");

								WebElement config = driverVPS
										.findElement(By.xpath("/html/body/div[1]/aside/ul/li[2]/a"));

								WebElement element = config.findElement(By.xpath("/html/body/div[1]/aside/ul/li[1]/a"));
								js.executeScript("arguments[0].click();", element);

								WebElement xnl = driverVPS
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[1]/label[2]/span"));
								WebElement elementxnl = xnl
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[1]/label[2]/span"));
								js.executeScript("arguments[0].click();", elementxnl);

								WebElement tb = driverVPS
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[2]/label[2]/span"));
								WebElement elementtb = tb
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[2]/label[2]/span"));
								js.executeScript("arguments[0].click();", elementtb);

								WebElement tb1 = driverVPS
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[3]/label[2]/span"));
								WebElement elementtb1 = tb1
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[3]/label[2]/span"));
								js.executeScript("arguments[0].click();", elementtb1);

								WebElement tb2 = driverVPS
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[3]/label[2]/span"));
								WebElement elementtb2 = tb2
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[3]/label[2]/span"));
								js.executeScript("arguments[0].click();", elementtb2);

								WebElement savecf = driverVPS.findElement(By.xpath("//*[@id=\"btnSaveConfig\"]"));
								WebElement elementsavecf = savecf.findElement(By.xpath("//*[@id=\"btnSaveConfig\"]"));
								js.executeScript("arguments[0].click();", elementsavecf);

								js.executeScript("arguments[0].click();", element);

								js = (JavascriptExecutor) driverVPS;
								driverVPS.navigate().refresh();
								js.executeScript("document.body.style.zoom = '50%';");

								WebElement PIN = driverVPS.findElement(By.xpath("//*[@id=\"account_pin_cd\"]"));
								PIN.sendKeys("Nh@ngoc123");

								WebElement save = modal_price.findElement(By.xpath("//*[@id=\"account_save_pin\"]"));
								js.executeScript("arguments[0].click();", save);

								frmRubbyMoney.setTitle("Finish config ....");

							} catch (NoSuchElementException e1) {

							} catch (IllegalThreadStateException e) {
								frmRubbyMoney.setTitle("IllegalThreadStateException");
							}
							// -----------

							// driver.get(baseUrl);

						} catch (Exception eDriver) {

							eDriver.printStackTrace();
						}
						WebElement showhd = driverVPS
								.findElement(By.xpath("//*[@id=\"miniIndex\"]/div[2]/span/a[2]/img"));
						js.executeScript("arguments[0].click();", showhd);

						frmRubbyMoney.setTitle(" click show history ...");

						frmRubbyMoney.setTitle(title + " - for ....");
						// js.executeScript("document.body.style.zoom = '30%';");
						// -------------------------------------------

						countDownThread = new Runnable() {
							public void run() {
								try {
									connect = driverVPS.findElement(By.xpath("//*[@id=\"status-connect\"]/span/span"));
									if (connect.getText().equals("Connected")) {
										conn.setForeground(Color.GREEN);
									} else {
										conn.setForeground(Color.RED);
									}
									conn.setText(connect.getText());
								} catch (NoSuchElementException e1) {

								}
								// vn30 = driver.findElement(By.id(itemvn30));

								vn30New = driverNew.findElement(By.xpath(itemvn30New));
								if (!vn30New.getText().isEmpty()) {

									GIA_VN30New = (Float
											.valueOf(Float.parseFloat((String) vn30New.getText().replaceAll(",", ""))))
											.floatValue();

								}

								/*
								 * if (!vn30.getText().isEmpty()) {
								 * 
								 * GIA_VN30 = (Float .valueOf(Float.parseFloat((String)
								 * vn30.getText().replaceAll(",", "")))) .floatValue();
								 * 
								 * }
								 */

								float temp1New, temp2 = 0, temp2New = 0;

								float total = 0;

								while (true) {

									// --------------------------------------------------- vn30
									retryNeeded = false;
									do {
										try {
											URL u = new URL("https://smartpro.vps.com.vn");

											URLConnection iconn = u.openConnection();
											iconn.connect();
											Iconn.setForeground(Color.GREEN);
											Iconn.setText("Ic");

										} catch (Exception e) {
											Iconn.setForeground(Color.RED);
											Iconn.setText("Id");

										}

										try {
											connect = driverVPS
													.findElement(By.xpath("//*[@id=\"status-connect\"]/span/span"));
											if (connect.getText().equals("Connected")) {

												conn.setForeground(Color.GREEN);
											} else {
												conn.setForeground(Color.RED);

											}
											conn.setText(connect.getText());
										} catch (NoSuchElementException e1) {

											e1.printStackTrace();
										}
										// -----------

										try {
											WebElement info = null;

											WebElement Gia_khop = driverVPS.findElement(By.id(HDCLOSE));

											WebElement Mua_1806 = driverVPS.findElement(By.id(HD));
											WebElement Ban_1806 = driverVPS.findElement(By.id(HD1));

											String Mua = Mua_1806.getText();
											String Ban = Ban_1806.getText();
											String Khop = Gia_khop.getText();

											if (Mua.isEmpty() && !Ban.isEmpty()) {
												Mua = Ban;

												lblCheck.setText("mua empty");

											}
											if (Ban.isEmpty() && !Mua.isEmpty()) {
												Ban = Mua;
											}
											lblCheck.setText("out ok..");

											/*
											 * System.out.println("Gia_khop : "+Gia_khop.getText());
											 * System.out.println("-----"); System.out.println("Mua_1806 : "+Mua);
											 * System.out.println("-----"); System.out.println("Ban_1806 : "+Ban);
											 */

											GIA_KHOP = (Float
													.valueOf(Float.parseFloat((String) Khop.replaceAll(",", ""))))
													.floatValue();
											if (dongbang == false) {

												textGiaKhop.setText(String.valueOf(df.format(GIA_KHOP)));
											}

											if ((!Mua.equals("ATO")) && (!Mua.equals("ATC"))) {

												GIA_BAN_REAL = (Float
														.valueOf(Float.parseFloat((String) Mua.replaceAll(",", ""))))
														.floatValue();

												GIA_MUA_REAL = (Float
														.valueOf(Float.parseFloat((String) Ban.replaceAll(",", ""))))
														.floatValue();
												if (MUA_ATC == false && MUA_ATO == false) {
													if (!dongbang) {
														btnMuaK.setText(String.valueOf(df.format(GIA_BAN_REAL)));
													}
												}
												if (BAN_ATC == false && BAN_ATO == false) {
													if (!dongbang) {

														btnBanK.setText(String.valueOf(df.format(GIA_MUA_REAL)));

													}
												}

											}

											info = driverVPS.findElement(By.xpath("//*[@id=\"unrelizeVMAccInfo\"]"));

											lblinfo.setText(info.getText());

											hdk = driverVPS.findElement(
													By.xpath("//*[@id=\"danhmuc_" + HDDay + HDmonth + "\"]/td[2]"));

											sm = driverVPS.findElement(By.xpath("//*[@id=\"sucmua-int\"]"));

											if (!hdk.getAttribute("style").isEmpty()) { // isBlank

												if (hdk.getAttribute("style").toString().substring(19, 20)
														.compareTo("4") == 0) {
													lblHDK.setForeground(Color.GREEN);

													tontaiHD = 2;
												} else {
													lblHDK.setForeground(Color.RED);
													tontaiHD = 1;

												}
												lblHDK.setText("HD :" + hdk.getText());
											} else {
												lblHDK.setText("HD :" + hdk.getText());
												tontaiHD = 0;

											}
											lblHDK.setText("HD :" + hdk.getText());
											lblCheck.setText("out ok.....");
											/*
											 * if (hien_danhSach_lenh) { // js.executeScript( //
											 * "document.getElementById('footerPanel').style.display='block';");
											 * 
											 * } else { js.executeScript(
											 * "document.getElementById('footerPanel').style.display='none';"); }
											 */

											try {

												if (tontaiHD == 1) {
													btnDong.setBackground(new Color(152, 251, 152));
													btnDong.setForeground(Color.BLUE);

													btnDongMK.setBackground(new Color(152, 251, 152));
													btnDongMK.setForeground(Color.BLUE);

													btnDong_DaoNguocMK.setBackground(new Color(152, 251, 152));
													btnDong_DaoNguocMK.setForeground(Color.BLUE);

													btnDaoNguoc.setBackground(new Color(152, 251, 152));
													btnDaoNguoc.setForeground(Color.BLUE);

												}
												if (tontaiHD == 2) {
													btnDong.setBackground(Color.PINK);
													btnDong.setForeground(Color.RED);

													btnDongMK.setBackground(Color.PINK);
													btnDongMK.setForeground(Color.RED);

													btnDong_DaoNguocMK.setBackground(Color.PINK);
													btnDong_DaoNguocMK.setForeground(Color.RED);

													btnDaoNguoc.setBackground(Color.PINK);
													btnDaoNguoc.setForeground(Color.RED);

												}
												if (tontaiHD == 0) {

												}

											} catch (NoSuchElementException e) {
												gia = "0";
												giadat = "0";
											}
											lblSM.setText(sm.getText());
											/*
											 * if (!showchart) { frmRubbyMoney.setTitle("Java loading .... Suc mua : ["
											 * + sm.getText() + "]" + " HD khop : [" + hdk.getText() + "]"); }
											 */
											// if HD
											temp1 = GIA_VN30;
											temp1New = GIA_VN30New;
											// Thread.sleep(5);
											// vn30 = driver.findElement(By.id(itemvn30));
											vn30New = driverNew.findElement(By.xpath(itemvn30New));
											/*
											 * if (!vn30.getText().isEmpty()) {
											 * 
											 * GIA_VN30 = (Float.valueOf( Float.parseFloat((String)
											 * vn30.getText().replaceAll(",", "")))) .floatValue();
											 * 
											 * }
											 */
											if (!vn30New.getText().isEmpty()) {

												GIA_VN30New = (Float.valueOf(Float
														.parseFloat((String) vn30New.getText().replaceAll(",", ""))))
														.floatValue();

											}

											if (GIA_VN30New != temp1New) {
												countvn30new = countvn30new + 1;
												if ((GIA_VN30New > temp1New)) {
													lblVN30New.setForeground(Color.GREEN);
													temp2New = GIA_VN30New - temp1New;

												} else {
													temp2New = temp1New - GIA_VN30New;
													lblVN30New.setForeground(Color.RED);
												}
												// if(countvn30new==countvn30newMax) {
												lblVN30New.setText((new DecimalFormat("0.00").format(temp2New)));
												// countvn30new=1;
												// }
												/*
												 * System.out.println("countvn30newMax :"
												 * +countvn30newMax+" countvn30new :"+countvn30new);
												 * if(countvn30new>countvn30newMax) { countvn30new=countvn30newMax; }
												 */

											}

											if (GIA_VN30New != temp1New) {

												if ((GIA_VN30New > temp1New)) {
													cuongdo = cuongdo + 1;

													// lblVN30.setForeground(new Color(0, 143, 0));
													lblVN30.setForeground(Color.GREEN);
													temp2 = GIA_VN30New - temp1New;
													total = total + temp2;

													if (temp2 >= Double.valueOf(txtAuto.getText()) && AutoMK
															&& buttonGroupCL_DUOI.getSelection().getActionCommand()
																	.equals("CLNone_DUOI")) {
														// buy only value >1
														AutoMK = !AutoMK;
														lblTB.setText("Mua Nhanh");
														timerLB = new javax.swing.Timer(500,
																new MYFORM.LbBlink(lblTB, "green"));

														timerLB.start();

														Order_special("M", "MTL");

														txtCL_TREN.setText(df.format(GIA_KHOP - 1.2));
														CL_M_TREN.setSelected(true);

														txtCL_TREN.setForeground(Color.BLUE);
														FileWriter fw = null;

														try {
															fw = new FileWriter("C:\\jar\\trade.txt");
															fw.append("-MUA-:");
															fw.append(textGiaKhop.getText() + time.getText());
															fw.close();
														} catch (IOException e) {

															e.printStackTrace();
														}

													}
													// only buy , mua theo chieu tang
													if (buttonGroupCL_DUOI.getSelection().getActionCommand()
															.equals("CLMua_DUOI")
															&& (temp2 >= Double.valueOf(txtAuto.getText()))) {
														Order_special("M", "MTL");
													}

												}
												if (GIA_VN30New < temp1New) {

													cuongdo = cuongdo - 1;
													temp2 = temp1New - GIA_VN30New;
													total = total - temp2;

													// lblVN30.setForeground(new Color(181, 0, 0));
													lblVN30.setForeground(Color.RED);
													// sell only value > 1 ..
													if (temp2 >= Double.valueOf(txtAuto.getText()) && AutoMK
															&& buttonGroupCL_DUOI.getSelection().getActionCommand()
																	.equals("CLNone_DUOI")) {
														AutoMK = !AutoMK;
														lblTB.setText("Ban Nhanh");

														timerLB = new javax.swing.Timer(500,
																new MYFORM.LbBlink(lblTB, "red"));
														timerLB.start();

														Order_special("B", "MTL");

														txtCL_TREN.setText(df.format(GIA_KHOP + 1.2));
														CL_B_TREN.setSelected(true);

														txtCL_TREN.setForeground(Color.BLUE);

													}
													// only sell, ban theo chieu giam
													if (buttonGroupCL_DUOI.getSelection().getActionCommand()
															.equals("CLBan_DUOI")
															&& (temp2 >= Double.valueOf(txtAuto.getText()))) {
														Order_special("B", "MTL");
													}
												}
												countvn30 = countvn30 + 1;
												lblVN30.setText((new DecimalFormat("0.00").format(temp2)));

												if (countvn30 == 5) {
													countvn30 = 0;
													total = 0;
												}

											}

											// -------------CAT LO

											if (buttonGroupCL_TREN.getSelection().getActionCommand()
													.equals("CLMua_TREN") && (txtCL_TREN.getText().length() > 1)) {

												if (Double.valueOf(btnBanK.getText()) <= Double
														.valueOf(txtCL_TREN.getText()) && tontaiHD == 2) {
													Order_special("B", "MTL");
													CL_N_TREN.setSelected(true);
													lblTB.setText("CAT LO - " + time.getText());

													timerLB = new javax.swing.Timer(500,
															new MYFORM.LbBlink(lblTB, "red"));

													timerLB.start();

													txtCL_TREN.setText("");

												}
											}

											if (buttonGroupCL_TREN.getSelection().getActionCommand()
													.equals("CLBan_TREN") && (txtCL_TREN.getText().length() > 1)) {

												if (Double.valueOf(btnMuaK.getText()) >= Double
														.valueOf(txtCL_TREN.getText()) && tontaiHD == 1) {
													Order_special("M", "MTL");
													CL_N_TREN.setSelected(true);
													lblTB.setText("CAT LO - " + time.getText());

													timerLB = new javax.swing.Timer(500,
															new MYFORM.LbBlink(lblTB, "green"));

													timerLB.start();

													txtCL_TREN.setText("");

												}
											}

											// -------------------BREAK ------------------------------
											if (chckBreak.isSelected()) {
												// -------------------------TREN

												if (buttonGroupCL_TREN.getSelection().getActionCommand()
														.equals("CLMua_TREN") && (txtCL_TREN.getText().length() > 1)) {

													if (Double.valueOf(textGiaKhop.getText()) >= Double
															.valueOf(txtCL_TREN.getText())) {
														Order_special("M", "MTL");
														CL_N_TREN.setSelected(true);
														lblTB.setText("MUA BRAEK - ");
														chckBreak.setSelected(false);
														timerLB = new javax.swing.Timer(500,
																new MYFORM.LbBlink(lblTB, "red"));

														timerLB.start();

														txtCL_TREN.setText("");
														System.out.println(">>mua break");
													}
												}

												if (buttonGroupCL_DUOI.getSelection().getActionCommand()
														.equals("CLBan_DUOI") && (txtCL_DUOI.getText().length() > 1)) {

													if (Double.valueOf(textGiaKhop.getText()) <= Double
															.valueOf(txtCL_DUOI.getText())) {
														Order_special("B", "MTL");
														CL_N_TREN.setSelected(true);
														lblTB.setText("BAN BREAK - ");
														chckBreak.setSelected(false);
														timerLB = new javax.swing.Timer(500,
																new MYFORM.LbBlink(lblTB, "green"));

														timerLB.start();

														txtCL_TREN.setText("");

													}
												}
												// -----------------------------DUOI

												if (buttonGroupCL_DUOI.getSelection().getActionCommand()
														.equals("CLMua_DUOI") && (txtCL_DUOI.getText().length() > 1)) {

													if (GIA_KHOP >= Double.valueOf(txtCL_DUOI.getText())) {
														Order_special("M", "MTL");
														//
														CL_N_DUOI.setSelected(true);
														chckBreak.setSelected(false);
														lblTB.setText("MUA BRAEK - " + time.getText());

														timerLB = new javax.swing.Timer(500,
																new MYFORM.LbBlink(lblTB, "red"));

														timerLB.start();

														txtCL_DUOI.setText("");

													}
												}

												if (buttonGroupCL_DUOI.getSelection().getActionCommand()
														.equals("CLBan_DUOI") && (txtCL_DUOI.getText().length() > 1)) {

													if (GIA_KHOP <= Double.valueOf(txtCL_DUOI.getText())) {
														Order_special("B", "MTL");

														CL_N_DUOI.setSelected(true);
														chckBreak.setSelected(false);
														lblTB.setText("BAN BREAK - " + time.getText());

														timerLB = new javax.swing.Timer(500,
																new MYFORM.LbBlink(lblTB, "green"));

														timerLB.start();

														txtCL_DUOI.setText("");

													}
												}
											}

										} catch (StaleElementReferenceException eStaleElementReferenceException) {
											frmRubbyMoney.setTitle("main_StaleElement");

											retryNeeded = true;

										} catch (Exception ex) {
											frmRubbyMoney.setTitle("main_Error");

											retryNeeded = true;

										}

									} while (retryNeeded);

									// ---------------

								}

							}
						};

						Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
							public void uncaughtException(Thread thread, Throwable exception) {

								// stop thread if still running thread.interrupt();

								thread.start();
							}
						};

						thread = new Thread(countDownThread);

						thread.start();

						thread.setUncaughtExceptionHandler(h);

						// -----------------------------------

						threadVN30 = new Runnable() {

							public void run() {
								while (true) {

									if (!thread.isAlive()) {

										thread = new Thread(countDownThread);
										frmRubbyMoney.setTitle("restart thread");
										thread.start();
									}

								}

							}
						};
						Thread thread30 = new Thread(threadVN30);
						thread30.start();

					}

				};

				t.start();

			}
		});
		panelKey.setVisible(false);
		btnType.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Str_1Minute = "//*[@id=\"__outside-render-0\"]/div/div/div/div/div/div/div[1]/div/div[1]";
				String Str_5Minute = "//*[@id=\"__outside-render-0\"]/div/div/div/div/div/div/div[2]/div/div[1]";

				if (TimeCheck == 1) {

					driverStock.switchTo().defaultContent();
					driverStock.switchTo().frame("iframe_right");
					driverStock.switchTo().frame(0);
					driverStock.findElement(By.id("header-toolbar-intervals")).click();

				}
				if (TimeCheck == 5) {
					driverStock.switchTo().defaultContent();
					driverStock.switchTo().frame("iframe_right");
					driverStock.switchTo().frame(0);
					driverStock.findElement(By.id("header-toolbar-intervals")).click();
				}

			}
		});
		tglbtnAuto.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {

				if (tglbtnAuto.isSelected()) {
					tglbtnAuto.setText("Auto on");
					tglbtnAuto.setForeground(Color.RED);

					AutoMK = true;
				} else {
					tglbtnAuto.setText("Auto off");
					tglbtnAuto.setForeground(Color.BLACK);

					AutoMK = false;
				}
			}

		});

		tglbtnShowList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Runnable runnable = new Runnable() {
					@SuppressWarnings("deprecation")
					public void run() {
						showlist = !showlist;
						if (showlist == false) {
							if (threadStock.isAlive()) {
								threadStock.stop();

							}
						}
						if (showlist) {
							tglbtnShowList.setSelected(true);

							hien_danhSach_lenh = false;
							tglbtnShowHistory.setSelected(false);

							// -----------------------------

							System.out.println("");
							while (showlist) {
								final Vector total_recordStock = new Vector();
								String StrB = "//*[@id=\"main-wrapper\"]/div[1]/section[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[";
								Vector newRecordStock = null;
								tableHistory.setDefaultRenderer(Object.class, new StockListRenderer());
								for (int i = 0; i < StockList.size(); i++) {

									newRecordStock = new Vector();

									newRecordStock.addElement(StockList.get(i));

									newRecordStock.addElement(DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[11]"))
											.getText());
									newRecordStock.addElement(DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[13]"))
											.getText());
									newRecordStock.addElement(DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[14]"))
											.getText());
									newRecordStock.addElement(DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[9]"))
											.getText());
									newRecordStock.addElement(DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[10]"))
											.getText());
									newRecordStock.addElement(DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[17]"))
											.getText());
									newRecordStock.addElement(DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[18]"))
											.getText());

									total_recordStock.addElement(newRecordStock);

								}
								final DefaultTableModel tableModel = (DefaultTableModel) tableHistory.getModel();

								SwingUtilities.invokeLater(new Runnable() {
									public void run() {

										tableHistory
												.setModel(new DefaultTableModel(total_recordStock, colunm_HeadStock));
										// tableHistory.getColumnModel().getColumn(7).setPreferredWidth(0);

										tableModel.fireTableDataChanged();

										System.out.println(">>update stock list>>");
										TableColumnModel model = tableHistory.getColumnModel();
									//	if (model.getColumnCount() > 1) {
									//		model.removeColumn(model.getColumn(7));
									//	}

										tableModel.fireTableDataChanged();
										frmRubbyMoney.setTitle(">>Update list...");
									}

								}); // luong

								// ban
							}

							// -----------------------------
							tglbtnShowHistory.setText("PS OFF");
						}
						if (!showlist) {
							tglbtnShowList.setSelected(false);
						}

					}
				};
				threadStock = new Thread(runnable);

				threadStock.start();
			}

		});
		tglbtnShowList.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (tglbtnShowList.isSelected()) {
					tglbtnShowList.setText("S");
				} else {
					tglbtnShowList.setText("H");
				}

			}
		});

		tglbtnShowHistory.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {

				tglbtnShowHistory.setSelected(true);
				double steps = e.getWheelRotation();

				if (steps == 1) {

					if (showme >= 4) {
						showme = showme - 1;
					}
				} else {

					showme = showme + 1;
					if (showme > 6) {
						showme = 3;
					}
				}
				hien_danhSach_lenh = true;
				tglbtnShowHistory.setText("PS ON " + String.valueOf(showme));
			}
		});
		tglbtnShowHistory.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				try {

					if (tglbtnShowHistory.isSelected()) {

						tglbtnShowHistory.setText("PS ON");

					}

					else {
						tglbtnShowHistory.setText("PS OFF");

						/*
						 * if (!layhd) { js.executeScript(
						 * "document.getElementById('footerPanel').style.display='none';"); }
						 */
					}
				} catch (Exception eLayHD) {

				}
			}

		});
		btnHuyHD.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				btnHuyHD.setBackground(Color.PINK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnHuyHD.setBackground(Color.WHITE);
			}
		});

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setForeground(Color.WHITE);
		verticalStrut.setBounds(246, 94, -64, 118);
		frmRubbyMoney.getContentPane().add(verticalStrut);
		mua_break_count = true;
		ban_break_count = true;

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.WHITE);
		separator.setForeground(Color.ORANGE);
		separator.setBounds(450, 167, 109, -10);
		frmRubbyMoney.getContentPane().add(separator);
		action_break = true;
		lblinfo.setBounds(394, 339, 99, 20);
		frmRubbyMoney.getContentPane().add(lblinfo);
		lblinfo.setHorizontalAlignment(SwingConstants.CENTER);

		lblinfo.setForeground(Color.BLACK);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockList = new Vector();

				colunm_HeadStock = new Vector();
				colunm_HeadStock.addElement("ten");
				colunm_HeadStock.addElement("gia_HT");
				colunm_HeadStock.addElement("thay_d");
				colunm_HeadStock.addElement("%");
				colunm_HeadStock.addElement("gia_m");
				colunm_HeadStock.addElement("kl_m");
				colunm_HeadStock.addElement("gia_b");
				colunm_HeadStock.addElement("kl_b");
				File file = new File("E:\\mystock.txt");
				System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
				ChromeOptions chromeOptionList = new ChromeOptions();
				chromeOptionList.setHeadless(HeadLess);
				DriverStockList = new ChromeDriver(chromeOptionList);
				DriverStockList.get("https://iboard.ssi.com.vn/");
				frmRubbyMoney.setTitle("Clicked ...");
				Actions action = new Actions(DriverStockList);
				WebElement we = DriverStockList.findElement(
						By.xpath("//*[@id=\"main-wrapper\"]/div[1]/section[2]/div[2]/div[1]/ul/li[1]/div/span"));
				action.moveToElement(we).build().perform();

				BufferedReader br;
				String ma;
				if (DriverStockList.findElement(By.xpath(
						"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
						.isDisplayed()) {
					DriverStockList.findElement(By.xpath(
							"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
							.sendKeys("TUAN");
					DriverStockList.findElement(By.xpath(
							"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
							.sendKeys(Keys.ENTER);
				}

				try {
					br = new BufferedReader(new FileReader(file));

					while ((ma = br.readLine()) != null && !ma.isEmpty()) {
						frmRubbyMoney.setTitle("input : " + ma);
						DriverStockList.findElement(By.xpath("//*[@id=\"downshift-0-input\"]")).sendKeys(ma);
						DriverStockList.findElement(By.xpath("//*[@id=\"downshift-0-input\"]")).sendKeys(Keys.ENTER);
						StockList.addElement(ma);
					}
					frmRubbyMoney.setTitle("done ...");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {

				}

			}
		});
		btnNewButton.setBounds(11, 264, 89, 23);
		frmRubbyMoney.getContentPane().add(btnNewButton);
		M1 = 1.5;

	}

	public void ActionMua() throws AWTException {
		try {
			Robot r = new Robot();
			r.mouseMove(CFB_X + 90, CFB_Y);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.delay(50);

		} catch (AWTException e1) {

			e1.printStackTrace();
		}

	}

	public void ActionMuaKhop() throws AWTException {
		Robot r;
		try {
			r = new Robot();
			r.mouseMove(GIA_X, GIA_Y);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.delay(50);
			r.mouseMove(MUA_X, MUA_Y + 16);
			r.delay(50);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.delay(50);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.delay(50);
			r.mouseMove(CFM_X, CFM_Y);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		} catch (AWTException e1) {

			e1.printStackTrace();
		}
	}

	public void ActionBan() throws AWTException {
		Robot r;
		try {
			r = new Robot();
			r.mouseMove(CFB_X, CFB_Y);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		} catch (AWTException e1) {

			e1.printStackTrace();
		}

	}

	public void ActionBanKhop() throws AWTException {
		Robot r;
		try {
			r = new Robot();
			r.mouseMove(GIA_X, GIA_Y);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.delay(50);
			r.mouseMove(BAN_X, BAN_Y + 16);
			r.delay(50);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.delay(50);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.delay(50);
			r.mouseMove(CFB_X, CFB_Y);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		} catch (AWTException e1) {

			e1.printStackTrace();
		}
	}

	public double kiemtra(Vector<Info> v, int stepback, double level) {
		int a = v.size();
		Vector<Float> contain = new Vector<Float>();
		int c = 0;
		Double sum = 0.0;

		do {

			a--;
			if (a == 0) {
				break;
			}
			if (v.elementAt(a).getVn30() - (v.elementAt(a - 1).getVn30()) != 0) {

				c = c + 1;
				sum = sum + v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30();
				contain.add(v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30());
				if (c == stepback) {

					break;
				}

			}

		}

		while (a >= 0);
		if (sum >= level) {
			for (int i = 0; i < contain.size(); i++) {
				if (contain.get(i) < 0) {
					return 0;
				}
				;
				if (contain.get(i) >= level) {
					return 0;
				}
				;

			}

			return 1;

		}
		if (sum <= -level) {
			for (int i = 0; i < contain.size(); i++) {
				if (contain.get(i) > 0) {
					return 0;
				}
				;
				if (contain.get(i) <= -level) {
					return 0;
				}
				;
			}
			return -1;
		}
		return 0;

	}

	public double kiemtra2(Vector<Info> v, int stepback) {
		int a = v.size();

		int c = 0;
		boolean check1 = false, check2 = false, check3 = false, check4 = false;

		do {

			a--;
			if (a == 0) {
				break;
			}
			if (v.elementAt(a).getVn30() - (v.elementAt(a - 1).getVn30()) != 0) {

				c = c + 1;

				if (c == 1) {
					if ((v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30() >= -60)
							&& (v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30() <= -45)) {
						check1 = true;
					}
				}
				if (c == 2) {
					if ((v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30() >= 16)
							&& (v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30() <= 20)) {
						check2 = true;
					}
				}

				// ----------
				if (c == 1) {
					if ((v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30() >= 45)
							&& (v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30() <= 60)) {
						check3 = true;
					}
				}
				if (c == 2) {
					if ((v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30() >= -20)
							&& (v.elementAt(a).getVn30() - v.elementAt(a - 1).getVn30() <= -16)) {
						check4 = true;
					}
				}
				// ----------
				if (c == stepback) {

					break;
				}

			}

		}

		while (a >= 0);
		if (check1 && check2) {

			return -1;
		}

		if (check3 && check4) {

			return 1;
		}

		return 0;

	}

	public static double kiemtra3(Vector<Info> v, int stepback, Double level) {
		int a = v.size(), t = v.size() - 1;

		int c = 0;

		do {

			a--;
			if (a == 0) {
				break;
			}
			if (v.elementAt(a).getVn30() - (v.elementAt(a - 1).getVn30()) != 0) {

				c = c + 1;

				if (c == stepback) {

					if ((v.elementAt(t).getVn30() - v.elementAt(a).getVn30() <= -level)) {

						if (v.elementAt(t).getVn30() - v.elementAt(t - 1).getVn30() < 0) {

							if (v.elementAt(t).getGMua() == v.elementAt(a - 1).getGMua()) {
								return -1;
							}
						}
					}
					if (v.elementAt(t).getVn30() - v.elementAt(a).getVn30() >= level) {

						if (v.elementAt(t).getVn30() - v.elementAt(t - 1).getVn30() > 0) {

							if (v.elementAt(t).getGBan() == v.elementAt(a - 1).getGBan()) {
								return 1;
							}
						}
					}
					break;
				}

			}

		}

		while (a >= 0);

		return 0;

	}

	public void Order(String Action, float Gia, Double Num) {

		js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");

		if (Action == "M") {
			System.out.println("mua");
			js.executeScript("document.getElementById('right_price').value=" + df.format(Gia + Num) + ";");

			js.executeScript("arguments[0].click();", MuaButton);
			System.out.println("GIA_BAN :" + df.format(GIA_MUA_REAL));

			WebElement Click = driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
			js.executeScript("arguments[0].click();", Click);

		}
		if (Action == "B") {
			System.out.println("ban");
			js.executeScript("document.getElementById('right_price').value=" + df.format(Gia - Num) + ";");
			js.executeScript("arguments[0].click();", BanButton);
			System.out.println("GIA_BAN :" + df.format(GIA_MUA_REAL));

			WebElement Click = driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
			js.executeScript("arguments[0].click();", Click);

		}

	}

	public void Order_special(String Action, String lenh) {
		MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
		BanButton = driverVPS.findElement(By.xpath(Banxpath));
		WebElement elementMAK = driverVPS.findElement(By.xpath(MAKxpath));
		// WebElement elementMTL = driverVPS.findElement(By.xpath(MAKxpath));
		js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");
		if (Action == "M") {
			System.out.println("mua dac biet");
			if (lenh == "MAK") {

				// WebElement elementMAK = driverVPS.findElement(By.xpath(MAKxpath));
				js.executeScript("arguments[0].click();", elementMAK);

				js.executeScript("arguments[0].click();", MuaButton);

			}
			if (lenh == "MTL") {

				// WebElement elementMTL = driverVPS.findElement(By.xpath(MTLxpath));
				js.executeScript("arguments[0].click();", elementMAK);

				js.executeScript("arguments[0].click();", MuaButton);

			}
		}
		if (Action == "B") {
			System.out.println("ban lenh dac biet");
			if (lenh == "MAK") {
				// WebElement elementMAK = driverVPS.findElement(By.xpath(MAKxpath));

				js.executeScript("arguments[0].click();", elementMAK);

				js.executeScript("arguments[0].click();", BanButton);

			}
			if (lenh == "MTL") {
				// WebElement elementMTL = driverVPS.findElement(By.xpath(MTLxpath));
				// WebElement elementMTL = driverVPS.findElement(By.xpath(MAKxpath));
				js.executeScript("arguments[0].click();", elementMAK);
				js.executeScript("arguments[0].click();", BanButton);

			}
		}
		MK = !MK;
	}

	public void Order_Rai(String Action, float Gia, Double Num) {

		WebElement gia_VPS = driverVPS.findElement(By.xpath("//*[@id=\"modal_price\"]"));

		js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");
		if (Action == "MR") {
			System.out.println("mua rai");
			js.executeScript("document.getElementById('right_price').value=" + df.format(Gia - Num) + ";");

			WebElement element = gia_VPS.findElement(By.xpath("//*[@id=\"orderPS\"]/div[2]/button"));
			js.executeScript("arguments[0].click();", element);
			System.out.println("GIA_BAN :" + df.format(GIA_MUA_REAL));

			WebElement Click = driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
			js.executeScript("arguments[0].click();", Click);

		} else {
			System.out.println("ban rai");
			js.executeScript("document.getElementById('right_price').value=" + df.format(Gia + Num) + ";");
			WebElement element = gia_VPS.findElement(By.xpath("//*[@id=\"orderPS\"]/div[1]/button"));
			js.executeScript("arguments[0].click();", element);
			System.out.println("GIA_BAN :" + df.format(GIA_MUA_REAL));

			WebElement Click = driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
			js.executeScript("arguments[0].click();", Click);

		}
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

	public void nativeKeyPressed(NativeKeyEvent e) {

		if (e.getKeyCode() == NativeKeyEvent.VC_CONTROL_L) { // add list filter

			File file = new File("C:\\filename.txt");
			List<String> listckfilter = new ArrayList<String>();
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
				String ma;
				while ((ma = br.readLine()) != null) {
					listckfilter.add(ma);
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

					bw.flush();
					bw.close();
				} catch (IOException e1) {

					e1.printStackTrace();
				}

				// Close connection

			}
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_SHIFT_L) { // STOP - UN STOP

			autock = !autock;
			if (autock) {
				lblTB.setText("AUTO");
			} else {
				lblTB.setText("UN_AUTO");
			}

		}

		if (e.getKeyCode() == NativeKeyEvent.VC_SPACE && enableKeyBoard) { // MUA Q Q Q
			if (enableKeyBoard) {
				lblTB.setForeground(Color.GREEN);
				lblTB.setText("MUA");
				js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");
				try {
					if (textGiaKhop.getText() != "") {
						js.executeScript("document.getElementById('right_price').value="
								+ df.format(Double.valueOf(textGiaKhop.getText())) + ";");
					}
				} catch (NumberFormatException e1) {
				}
				// WebElement element =
				// gia_VPS.findElement(By.xpath("//*[@id=\"orderPS\"]/div[2]/button"));
				MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
				js.executeScript("arguments[0].click();", MuaButton);

				// WebElement Click =
				// driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));

				// js.executeScript("arguments[0].click();", Click);
				hien_danhSach_lenh = true;
				lblTB.setForeground(Color.ORANGE);
			} else {
				lblTB.setText("Keyboard disable");
			}
		}

		if (e.getKeyCode() == NativeKeyEvent.VC_Q && enableKeyBoard) { // LEN
			JavascriptExecutor js = ((JavascriptExecutor) driverStock);
			frmRubbyMoney.setTitle("Java loading ....");
			frmRubbyMoney.setBounds(100, 100, 484, 130);
			frmRubbyMoney.setLocation(900, 600);
			SHD.setBounds(303, 42, 30, 20);
			txtAuto.setBounds(303, 68, 30, 20);
			WebElement pic = driverStock.findElement(By.xpath("//*[@id=\"pic\"]"));
			js.executeScript("arguments[0].style.display='block'", pic);
			js.executeScript("arguments[0].scrollIntoView();", pic);

		}

		if (e.getKeyCode() == NativeKeyEvent.VC_W && enableKeyBoard) { // LEN
			JavascriptExecutor js = ((JavascriptExecutor) driverStock);

			js.executeScript("window.scrollBy(0,50)", "");
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_TAB && enableKeyBoard) { // LEN
			showtradeview = !showtradeview;
			if (showtradeview) {
				tglbtnShowChart.setText("S");
				tglbtnShowChart.setSelected(true);
			} else {
				showtradeview = false;
				tglbtnShowChart.setSelected(false);
				tglbtnShowChart.setText("H");
			}
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_D && enableKeyBoard) { // CHECK , UNCHECK CAP CAP CAP
			btnAction.setLocation(BStart_X, BStart_Y);
			btnAction.setForeground(Color.BLACK);
			if (actionChoice.equals("Mua")) {
				btnAction.setForeground(Color.BLUE);
				btnAction.setText("Reset");
			}
			if (actionChoice.equals("Ban")) {
				btnAction.setForeground(new Color(139, 0, 0));
				btnAction.setText("Reset");
			}

			CountAction = 0;
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_ALT_L && enableKeyBoard) { // HUY
			btnHuyHD.doClick();
			if (!tglbtnShowHistory.isSelected()) {
				tglbtnShowHistory.doClick();
			}
		}

		if (e.getKeyCode() == NativeKeyEvent.VC_CAPS_LOCK && enableKeyBoard) {
			WebElement element = null;
			WebElement pic = null;
			WebElement cRight = null;
			WebElement MRight = null;
			showchart = !showchart;
			// CHECK , UNCHECK CAP CAP CAP

			try {
				if (showtradeview) {

					JavascriptExecutor js = (JavascriptExecutor) driverStock;

					element = driverStock.findElement(By.id("parent"));
					pic = driverStock.findElement(By.id("pic"));

					if (showchart) {
						if (typeChart == 1) {
							frmRubbyMoney.setTitle("Rubby money");

							frmRubbyMoney.setBounds(100, 100, 484, 288);
							frmRubbyMoney.setLocation(550, 350);
							SHD.setBounds(303, 95, 30, 20);

							lblTB.setLocation(1, 30);
							tglbtnAuto.setLocation(147, 124);
							SHD.setLocation(371, 95);
							txtAuto.setLocation(371, 119);
							panel_info.setLocation(400, 201);
							js.executeScript("window.scrollBy(0,-50)", "");
						} else {
							frmRubbyMoney.setTitle("Rubby money");

							frmRubbyMoney.setBounds(100, 250, 484, 288);
							frmRubbyMoney.setLocation(700, 250);
							lblTB.setLocation(1, 30);
							tglbtnAuto.setLocation(147, 124);
							SHD.setLocation(371, 95);
							txtAuto.setLocation(371, 119);
							panel_info.setLocation(400, 201);
						}
					} else {

						frmRubbyMoney.setTitle("Java loading ...."); // MINIMIZE
						frmRubbyMoney.setBounds(100, 100, 484, 130);
						frmRubbyMoney.setLocation(888, 603);
						lblTB.setLocation(14, 61);
						tglbtnAuto.setLocation(23, 30);
						SHD.setLocation(371, 44);
						txtAuto.setLocation(371, 65);

						panel_info.setLocation(400, 38);

					}

					if (showchart) {
						if (typeChart == 1) {
							js.executeScript("arguments[0].style.visibility='visible'", element);
							js.executeScript("arguments[0].style.display='none'", pic);
							js.executeScript("arguments[0].scrollIntoView();", element);
							js.executeScript("window.scrollBy(0,-50)", "");
						}

						if (typeChart == 2) {
							js.executeScript("arguments[0].style.visibility='visible'", element);
							js.executeScript("arguments[0].style.display='none'", pic);
							js.executeScript("arguments[0].scrollIntoView();", MRight);
						}
						if (typeChart == 3) {
							js.executeScript("arguments[0].style.visibility='visible'", element);
							js.executeScript("arguments[0].style.display='none'", pic);
							js.executeScript("arguments[0].scrollIntoView();", MRight);
						}
						btnshow.setText(showchart ? "hide" : "show");

					} else {
						js.executeScript("arguments[0].style.visibility='hidden'", element);
						js.executeScript("arguments[0].style.display='block'", pic);
						js.executeScript("arguments[0].scrollIntoView();", pic);
					}
				} else {
					if (!showchart) { // khong show tradeview chart , miniz
						System.out.println("2");
						frmRubbyMoney.setTitle("Java loading ....");
						frmRubbyMoney.setBounds(100, 100, 484, 130);
						frmRubbyMoney.setLocation(888, 603);
						lblTB.setLocation(14, 61);
						tglbtnAuto.setLocation(23, 30);
						SHD.setLocation(371, 44);
						txtAuto.setLocation(371, 65);

						panel_info.setLocation(400, 38);

					} else {
						frmRubbyMoney.setTitle("Rubby money"); // khong show tradeview chart , max

						frmRubbyMoney.setBounds(100, 250, 484, 288);
						frmRubbyMoney.setLocation(870, 450);
						lblTB.setLocation(1, 30);
						tglbtnAuto.setLocation(147, 124);
						SHD.setLocation(371, 95);
						txtAuto.setLocation(371, 119);
						panel_info.setLocation(400, 201);

					}

				}
			} catch (NoSuchElementException e1) {

				e1.printStackTrace();
			}

		} // if
		if (e.getKeyCode() == NativeKeyEvent.VC_ALT_R) {
			enableKeyBoard = !enableKeyBoard;
			if (enableKeyBoard) {
				lblTB.setText("keyboard active");

				panelKey.setVisible(true);
				frmRubbyMoney.addWindowFocusListener(new WindowAdapter() {
					public void windowGainedFocus(WindowEvent e) {
						System.out.println("WindowFocusListener method called: windowGainedFocus.");
					}

					@SuppressWarnings("static-access")
					public void windowLostFocus(WindowEvent e) {
						if (e.getNewState() != e.WINDOW_CLOSED) {
							// toFront();
							// requestFocus();
							frmRubbyMoney.setAlwaysOnTop(false);
							frmRubbyMoney.setAlwaysOnTop(true);
							// requestFocusInWindow();
							System.out.println("focus lost");
						}
					}
				});

			} else {

				lblTB.setText("dis-keyboard ");
				panelKey.setVisible(false);
			}

		}
		if (e.getKeyCode() == NativeKeyEvent.VC_E && enableKeyBoard) {
			int x = frmRubbyMoney.getLocation().x;
			int y = frmRubbyMoney.getLocation().y;

			PointerInfo a = MouseInfo.getPointerInfo();
			Point b = a.getLocation();
			int mx = (int) b.getX();
			int my = (int) b.getY();
			if ((mx >= x + 95) && (my >= y + 31)) {

				btnAction.setForeground(Color.BLACK);
				btnAction.setText("clear");
				System.out.println("reset");
				CountAction = 1;
			}
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_A && enableKeyBoard) { // DONG BANG A A
			dongbang = !dongbang;
			Robot r;
			if (dongbang) {
				lblTB1.setForeground(new Color(245, 247, 227));
				lblTB1.setText("Dong Bang");

			} else {
				lblTB1.setForeground(Color.ORANGE);
				lblTB1.setText("Khong Dong Bang");
			}
		}

		if (e.getKeyCode() == NativeKeyEvent.VC_S && enableKeyBoard) { // DONG
			lblTB.setText("Dong");
			if (tontaiHD != 0) {
				js.executeScript("document.getElementById('sohopdong').value=" + SHD.getText() + ";");
				try {
					if (textGiaKhop.getText() != "") {
						js.executeScript("document.getElementById('right_price').value="
								+ df.format(Double.valueOf(textGiaKhop.getText())) + ";");

					}
				} catch (NumberFormatException e1) {
				}
				if (tontaiHD == 1) { // vi the short, long
					MuaButton = driverVPS.findElement(By.xpath(Muaxpath));
					js.executeScript("arguments[0].click();", MuaButton);
					lblTB.setText("long line : 2630");
				}
				if (tontaiHD == 2) {// vi the long, short
					BanButton = driverVPS.findElement(By.xpath(Banxpath));
					js.executeScript("arguments[0].click();", BanButton);
					lblTB.setText("short line : 2635");

				}

				if (!tglbtnShowHistory.isSelected()) {
					hien_danhSach_lenh = false;

					tglbtnShowHistory.doClick();

				}

			} else {
				lblTB.setText("Khong ton tai");

			}

		}

	}

	public void nativeMouseWheelMoved(NativeMouseWheelEvent arg0) {

	}

	public void nativeMouseMoved(NativeMouseEvent arg0) {

		int MIN = 79, MAX = 329;
		boolean next = false, back = false;
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int khoan_cach, chieudai = 64;
		Double cuongDo;

		if (CountAction == 1) {
			if (!switchStep) {
				// if ((int) b.getX() > MStart_X) {

				try {
					khoan_cach = ((int) b.getX() - MStart_X);
					if (khoan_cach < 400 && khoan_cach > 0) {
						cuongDo = (Double) b.getX() - MStart_X;

						btnAction.setLocation(BStart_X + khoan_cach, BStart_Y);
						lblShow.setLocation(BStart_X + khoan_cach + chieudai, BStart_Y + 1);

						Count_Step = cuongDo / 7;
						Count_Step = Count_Step / 10;

						if (actionChoice.equals("Mua")) {
							lblShow.setForeground(Color.GREEN);
							Action_Price = Double.parseDouble(txtAction_Price) - Count_Step;
						}
						if (actionChoice.equals("Ban")) {
							Action_Price = Double.parseDouble(txtAction_Price) + Count_Step;
							lblShow.setForeground(Color.RED);
						}

						// btnAction.setText(String.valueOf(df.format(Action_Price)));
						lblShow.setVisible(true);
						lblShow.setText(String.valueOf(df.format(Action_Price)));

					}
				} catch (NumberFormatException e) {
					txtAction_Price = "0.0";
				}
				// }
			}
		}

		if (btnAction.getBounds().x > MAX) {

			switchStep = true;
			next = true;
			MEnd_X = (int) b.getX();
			MEnd_Y = (int) b.getY();
			txtAction_Price = lblShow.getText();

			btnAction.setLocation(BStart_X, BStart_Y);

			lblTB1.setText("next round");

			lblShow.setLocation(BStart_X + chieudai, BStart_Y);

			try {

				Robot r = new Robot();
				r.mouseMove(MStart_X, MStart_Y);
			} catch (Exception e) {

			}
			switchStep = false;
		}

	}

	public void nativeKeyReleased(NativeKeyEvent arg0) {

	}

	public void nativeKeyTyped(NativeKeyEvent arg0) {

	}

	public void nativeMouseDragged(NativeMouseEvent arg0) {

	}

	class LbBlink implements ActionListener {
		private javax.swing.JLabel label;
		// private java.awt.Color cor1 = java.awt.Color.YELLOW;
		String mau;

		public String getMau() {
			return mau;
		}

		public void setMau(String mau) {
			this.mau = mau;
		}

		private java.awt.Color cor2 = java.awt.Color.WHITE;
		private int count = 1;

		public LbBlink(javax.swing.JLabel label, String mau) {
			this.label = label;
			this.mau = mau;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public void actionPerformed(ActionEvent e) {

			count++;

			if (count > 4) {// 3 = YOUR MAX

				label.setForeground(Color.ORANGE);
				lblTB.setText("");
				timerLB.stop();
			}

			if (count % 2 == 0) {
				if (mau == "green") {

					label.setForeground(Color.GREEN);
				}
				if (mau == "red") {

					label.setForeground(Color.RED);
				}

			} else {

				label.setForeground(cor2);

			}

		}
	}

	private static void activate(int pid) throws IOException {
		String pathname = System.getProperty("java.io.tmpdir") + "WindowSwintcherAppActivate.vbs";

		File file = new File(pathname);
		if (!file.exists()) {
			String content = "set WshShell = CreateObject(\"WScript.Shell\")\n"
					+ "WshShell.AppActivate Wscript.Arguments(0)";
			// FileUtils.writeStringToFile(file, content);
		}
		Runtime.getRuntime().exec("cscript " + pathname + " " + pid);
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
				return new Color(241, 243, 246);
			}
			return color;
		}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			Color color = getCellColor(row, column);
			setBackground(color);
			Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

			if (isSelected) {
				c.setBackground(Color.WHITE);
			}

			return this;
		}
	}

	class StockPSRenderer extends DefaultTableCellRenderer {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		// You should override getTableCellRendererComponent
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {

			Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

			Object obj = tableHistory.getModel().getValueAt(row, column);
			if (obj.toString().equalsIgnoreCase("SHORT")) {
				c.setForeground(Color.RED);

			} else {
				if (obj.toString().equalsIgnoreCase("LONG")) {
					c.setForeground(Color.GREEN);
				} else {
					c.setForeground(Color.BLACK);
				}
			}
			c.setFont(new Font("Helvetica Bold", Font.PLAIN, 9));
			c.setBackground(Color.WHITE);
			return c;
		}
	}

	class StockListRenderer extends DefaultTableCellRenderer {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		// You should override getTableCellRendererComponent
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {

			Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

			Object obj = tableHistory.getModel().getValueAt(row, 2);
			if (Double.valueOf(obj.toString()) < 0) {
				c.setForeground(Color.RED);

			} else {
				if (Double.valueOf(obj.toString()) == 0) {
					c.setForeground(Color.YELLOW);
				} else {
					if (Double.valueOf(obj.toString()) > 0) {
						c.setForeground(Color.GREEN);
					}
				}
			}
			c.setFont(new Font("Helvetica Bold", Font.PLAIN, 9));
			c.setBackground(Color.BLACK);
			return c;
		}
	}

	Boolean CheckOK() {
		String StrInput = "/html/body/div[4]/div[2]/div[2]/div[1]/input";
		String StrMACD = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div/div/div[42]/div";
		String StrRSI = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div/div/div[60]/div";
		String StrParabolSAR = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div/div/div[53]/div";

		String StrMAROSS = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div/div/div[40]/div";

		String StrClose = "/html/body/div[4]/div[3]";
		String Str_1Minute = "//*[@id=\"__outside-render-0\"]/div/div/div/div/div/div/div[1]/div/div[1]";
		String Str_5Minute = "//*[@id=\"__outside-render-0\"]/div/div/div/div/div/div/div[2]/div/div[1]";
		Boolean Result = true;

		try {
			if (!driverStock.findElement(By.xpath(StrInput)).isDisplayed()) {
				lblCheck.setText("StrInput");
				Result = false;
			}
			;
			if (!driverStock.findElement(By.xpath(StrMACD)).isDisplayed()) {
				lblCheck.setText("StrMACD");
				Result = false;
			}
			;
			if (!driverStock.findElement(By.xpath(StrRSI)).isDisplayed()) {
				lblCheck.setText("StrRSI");
				Result = false;
			}
			;
			if (!driverStock.findElement(By.xpath(StrMAROSS)).isDisplayed()) {
				lblCheck.setText("StrMAROSS");
				Result = false;
			}
			;
			if (!driverStock.findElement(By.xpath(StrClose)).isDisplayed()) {
				lblCheck.setText("StrClose");
				Result = false;
			}
		} catch (NoSuchElementException e) {
			lblCheck.setText("NoElement");
			driverStock.navigate().refresh();
			JavascriptExecutor jss = (JavascriptExecutor) driverStock;

			WebElement left = driverStock.findElement(By.xpath("//*[@id=\"left\"]"));

			WebElement right = driverStock.findElement(By.xpath("//*[@id=\"right\"]"));
			jss.executeScript("arguments[0].style.height = '" + String.valueOf(heightL - 300) + "px'", left);
			jss.executeScript("arguments[0].style.height = '" + String.valueOf(heightR - 300) + "px'", right);

			jss.executeScript("arguments[0].style.height = '" + String.valueOf(heightL - 300) + "px'", left);
			jss.executeScript("arguments[0].style.height = '" + String.valueOf(heightR - 300) + "px'", left);
		}

		return Result;
	}

	private void setupChart(String F1, int F2, int typeColor) {
		String StrInput = "/html/body/div[4]/div[2]/div[2]/div[1]/input";
		String StrMACD = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div/div/div[42]/div";
		String StrRSI = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div/div/div[60]/div";
		String StrParabolSAR = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div/div/div[53]/div";

		String StrMAROSS = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div/div/div[40]/div";

		String StrClose = "/html/body/div[4]/div[3]";
		String Str_1Minute = "//*[@id=\"__outside-render-0\"]/div/div/div/div/div/div/div[1]/div/div[1]";
		String Str_5Minute = "//*[@id=\"__outside-render-0\"]/div/div/div/div/div/div/div[2]/div/div[1]";
		driverStock.switchTo().defaultContent();
		driverStock.switchTo().frame(F1);

		driverStock.switchTo().frame(F2);

		setupBackground(typeColor);

		driverStock.findElement(By.id("header-toolbar-indicators")).click();
		try {
			// jsStock = (JavascriptExecutor) driverStock;

			Thread.sleep(100);
			driverStock.findElement(By.xpath(StrInput)).click();
			Thread.sleep(100);
			driverStock.findElement(By.xpath(StrMACD)).click(); // MACD
			Thread.sleep(50);
			driverStock.findElement(By.xpath(StrRSI)).click(); // RSI
			// Thread.sleep(50);
			// driverStock.findElement(By.xpath(StrParabolSAR)).click(); // SAR
			Thread.sleep(50);
			driverStock.findElement(By.xpath(StrMAROSS)).click(); // Ross
			Thread.sleep(50);
			driverStock.findElement(By.xpath(StrClose)).click();
			Thread.sleep(50);

			if (F1 == "iframe_left") {

				driverStock.findElement(By.id("header-toolbar-intervals")).click();
				driverStock.findElement(By.xpath(Str_5Minute)).click();
			}
			if (F1 == "iframe_right") {

				driverStock.findElement(By.id("header-toolbar-intervals")).click();
				driverStock.findElement(By.xpath(Str_1Minute)).click();
			}
			driverStock.switchTo().defaultContent();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	private void setupBackground(int typeColor) {

		driverStock.findElement(By.id("header-toolbar-properties")).click();
		driverStock.switchTo().activeElement();
		try {
			Thread.sleep(500);

			driverStock.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/a[3]")).click();
			driverStock
					.findElement(
							By.xpath("/html/body/div[4]/div[4]/div[4]/div/div[1]/table/tbody/tr[1]/td[2]/span/input"))
					.click();

			driverStock.findElement(By.xpath("/html/body/div[5]/div[1]/table[1]/tbody/tr/td[1]")).click();

			Thread.sleep(500);

			driverStock
					.findElement(
							By.xpath("/html/body/div[4]/div[4]/div[4]/div/div[1]/table/tbody/tr[2]/td[2]/span/input"))
					.click();
			driverStock.findElement(By.xpath("/html/body/div[5]/div[1]/table[1]/tbody/tr/td[1]")).click();

			Thread.sleep(500);

			driverStock
					.findElement(
							By.xpath("/html/body/div[4]/div[4]/div[4]/div/div[1]/table/tbody/tr[3]/td[2]/span/input"))
					.click();
			driverStock.findElement(By.xpath("/html/body/div[5]/div[1]/table[1]/tbody/tr/td[1]")).click();

			Thread.sleep(500);

			driverStock.findElement(By.xpath("/html/body/div[4]/div[4]/div[6]/div/a[2]")).click();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	private static void snapto(JButton b) {
		try {
			Point p = b.getLocationOnScreen();
			Point q = b.getLocationOnScreen();
			p.x = b.getWidth() / 2;
			p.y = b.getHeight() / 2;
			Robot r = new Robot();
			r.mouseMove(q.x + p.x, q.y + p.y);
		} catch (Exception e) {

		}
	}

	public class ImagePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		private BufferedImage image;

		public ImagePanel(BufferedImage image) {
			this.image = image;
		}

		public BufferedImage getImage() {
			return image;
		}

		public void paint(Graphics g) {
			g.drawImage(image, 0, 0, this);
		}

		public void loadOriginalImage(File file) {
			try {
				image = ImageIO.read(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void createArtWork(String path) {
			// "/home/mano/Pictures/cartoons/blob.jpg"
			if (image == null)
				return;
			try {
				Graphics g = image.getGraphics();
				g.setColor(Color.red);
				g.drawString("Picture speaks thousand words", 50, 50);
				g.drawImage(ImageIO.read(new File(path)), 120, 100, null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	@SuppressWarnings("deprecation")
	private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, int timeoutInSeconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		try {
			webDriverWait.until(waitCondition);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void untilPageLoadComplete(WebDriver driver, int i) {
		until(driver, (d) -> {
			Boolean isPageLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript("return document.readyState")
					.equals("complete");
			if (!isPageLoaded)
				try {
					frmRubbyMoney.setTitle("Document is loading");
				} catch (Exception e) {

					e.printStackTrace();
				}
			return isPageLoaded;
		}, i);
	}
}
