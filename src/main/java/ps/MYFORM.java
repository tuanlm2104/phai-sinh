/* Decompiler 3239ms, total 5487ms, lines 4281 */
package ck;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.DecimalFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser.WNDENUMPROC;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.StdCallLibrary;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.UncaughtExceptionHandler;
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
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.apache.log4j.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseMotionListener;
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MYFORM implements NativeKeyListener, NativeMouseMotionListener, NativeMouseWheelListener {
	boolean retryNeeded_SL = false;
	boolean confirm = false;
	boolean switchStep = false;
	int countme = 0;
	int counterror;
	int Mfixed_X;
	int Mfixed_Y;
	int MStart_X;
	int MStart_Y;
	int MEnd_X;
	int MEnd_Y;
	int Bfixed_X;
	int Bfixed_Y;
	int BStart_X;
	int BStart_Y;
	int CountAction = 0;
	int TimeCheck = 1;
	String checkme1;
	String checkme2;
	String actionChoice = "Mua";
	String Muaxpath = "//*[@id=\"orderPS\"]/div/div[1]/div[1]/button";
	String Banxpath = "//*[@id=\"orderPS\"]/div/div[1]/div[2]/button";
	String Huyxpath = "//*[@id=\"orderPS\"]/div/div[3]/button";
	String ATOxpath = "//*[@id=\"right_btnordertype\"]/div/span[1]";
	String ATCxpath = "//*[@id=\"right_btnordertype\"]/div/span[2]";
	String MTLxpath = "//*[@id=\"right_btnordertype\"]/div/span[3]";
	String MAKxpath = "//*[@id=\"right_btnordertype\"]/div/span[5]";
	Vector colunm_HeadHistory = new Vector();
	Vector colunm_HeadStock;
	Vector StockList;
	Vector newRecordHistory = null;
	int showme = 3;
	int typeChart = 1;
	int typeColor = 1;
	Process process = null;
	String[] lenhhistory1;
	String[] lenhhistory2;
	String[] lenhhistory3;
	String showrun = "";
	Thread threadstock;
	Thread threadinfo;

	Thread threadStock;
	Thread threadHD;
	WebElement span;
	Runnable countDownThread;
	Runnable HistoryThread;
	Runnable StockInfo;
	JPanel panelKey = new JPanel();
	boolean isPresent = true;
	boolean showtradeview = true;
	boolean fixme = false;
	boolean showlist = false;
	boolean BAN_ATC = false;
	boolean MUA_ATC = false;
	boolean BAN_ATO = false;
	boolean MUA_ATO = false;
	int PID;
	int PID1;
	JLabel lblVN30 = new JLabel("VN30");
	JButton btnMAK_MUA = new JButton("MAK");
	Date date;
	int CENTER_X;
	int CENTER_Y;
	boolean enableKeyBoard = false;
	boolean dongbang = false;
	boolean dongbangBreak = false;
	boolean loadDriver = false;
	int cuongdo;
	int countvn30 = 0;
	int tontaiHD = 0;
	int codinhY;
	int codinhX;
	int count1 = 0;
	int count2 = 0;
	int mx;
	int my;
	int mx1 = 215;
	int my1 = 281;
	int widthleft1 = 580;
	int widthriht1 = 740;
	int widthleft2 = 2;
	int widthriht2 = 680;
	int heightL = 600;
	int heightR = 600;
	WebElement hdchuaK;
	WebElement Igia;
	WebElement hdkhop;
	WebElement stype;
	WebElement time;
	WebElement status;
	WebElement Igiadat;
	WebElement modal_price;
	WebElement MuaButton;
	WebElement ButtonATO;
	WebElement ButtonATC;
	WebElement BanButton;
	WebElement BanButtonATC;
	WebElement vn30;
	WebElement vn30New;
	WebElement connect;
	String gia;
	String giadat;
	int sohd_daonguoc;
	int countvn30new = 1;
	int countvn30newMax = 3;
	JavascriptExecutor js;
	JavascriptExecutor jss;
	JavascriptExecutor jsStock;
	String String_sohd_daonguoc;
	Thread threadKhop;
	Thread thread;
	Thread threadH;
	Runnable threadVN30;
	Runnable threadHistory;
	Timer timerLB;
	JComboBox comboBox = new JComboBox();
	JRadioButton CL_M_TREN = new JRadioButton("M");
	JRadioButton CL_B_TREN = new JRadioButton("B");
	JRadioButton CL_N_TREN = new JRadioButton("");
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
	ObjectHistory[] ArrObjectHistory = new ObjectHistory[100];
	float ItotalTrade;
	float ItotalTradeKhop;
	float ItotalTradeTempKhop;
	float ItotalTradeTemp;
	float Itotal;
	WebElement totalTrade;
	WebElement totalTradeKhop;
	WebElement totalTradeTempKhop;
	WebElement totalTradeTemp;
	String currentURL;
	WebDriver driverVPS;
	WebDriver driver;
	WebDriver driverNew;
	Boolean MK = false;
	Boolean flagvn30 = true;
	FirefoxDriver driverDownFuture;
	FirefoxDriver driverRagon;
	List<WebElement> rowsNumber;
	Boolean AutoMK = false;
	Boolean hien_danhSach_lenh = false;
	Boolean layhdtest = false;
	Boolean retryNeeded;
	Boolean retryNeeded1 = false;
	Boolean retryNeededHis = false;
	Boolean check = true;
	Boolean autock = false;
	Boolean showchart = true;
	Boolean setGiakhop = false;
	Boolean mua_break_count = false;
	Boolean ban_break_count = false;
	Boolean CL_Mua = false;
	Boolean CL_Ban = false;
	Boolean CL_NONE = false;
	Boolean disKhop = false;
	Boolean setgia = false;
	float LGCL;
	Double GIA_CL;
	Double tong_tang = 0.0D;
	Double tong_giam = 0.0D;
	WebDriver driverSSI;
	WebDriver DriverSSIF30;
	WebDriver driverStock;
	WebDriver DriverStockList;
	WebElement Mua_1806 = null;
	WebElement hdk;
	WebElement sm;
	WebElement lenh;
	WebElement Ban_1806 = null;
	WebElement Gia_khop = null;
	float GIA_MUA;
	float GIA_BAN;
	float GIA_KHOP;
	float GIA_TRUA = 0.0F;
	float tempbreak;
	Double GIA_KHOP1;
	Double Count_Step;
	Double Action_Price;
	float GIA_MUA_REAL;
	float GIA_BAN_REAL;
	Boolean dn = false;
	Boolean laygia_Break = false;
	Boolean action_break = false;
	String HDmonth = "";
	String txtAction_Price;
	String HDDay = "VN30F23";
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	float GIA_VN30;
	float GIA_VN30New;
	float temp1;
	Integer Tong;
	Integer count_tang = 0;
	Integer count_giam = 0;
	boolean c = true;
	String HD;
	String HD1;
	String HDCLOSE;
	String baseUrl;
	String itemvn30;
	String itemvn30New;
	String tinhtrang;
	float GIA_AUTO;
	float GIA_AUTO_Compare;
	private static JFrame frmRubbyMoney;
	boolean AutoMb = false;
	boolean flagMua_break = false;
	boolean flagBan_break = false;
	boolean RL = false;
	private boolean start = false;
	boolean AUTO = true;
	double CUONGDO = 2.5D;
	double M1;
	double M2;
	boolean MUA = false;
	boolean BAN = false;
	boolean initHD = true;
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
	int BAN_X = 0;
	int BAN_Y = 0;
	int ACTION_BAN_X = 0;
	int ACTION_BAN_Y = 0;
	String fT_pointString;
	int PIN_X = 0;
	int PIN_Y = 0;
	int PINPASS_X = 0;
	int PINPASS_Y = 0;
	int XACNHAN_X = 0;
	int XACNHAN_Y = 0;
	boolean mk = false;
	int KL_X = 415;
	int KL_Y = 513;
	int countPin = 0;
	boolean KHOP = false;
	float GiaClose;
	Boolean fixvalue = false;
	Boolean HeadLess = true;
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
	final DefaultTableModel tableModel;
	private final JScrollPane scrollPaneHistory;
	private final JLabel lblShow;
	private final JToggleButton tglbtnShowList;
	JButton btnAction;
	JButton btnHuyHD;
	JToggleButton tglbtnShowHistory;
	private final JPopupMenu popupMenu;
	private final JMenuItem MenuItem_mua;
	private final JMenuItem MenuItem_Ban;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							MYFORM window = new MYFORM();

							try {
								GlobalScreen.registerNativeHook();
								GlobalScreen.addNativeKeyListener(window);
								GlobalScreen.addNativeMouseMotionListener(window);
								GlobalScreen.addNativeMouseWheelListener(window);
								MYFORM.frmRubbyMoney.setVisible(true);
							} catch (NativeHookException var3) {
								var3.printStackTrace();
							}

						}
					});
				} catch (Exception var2) {
					var2.printStackTrace();
				}

			}
		});
	}

	public MYFORM() {
		this.tableModel = (DefaultTableModel) this.tableHistory.getModel();
		this.scrollPaneHistory = new JScrollPane();
		this.lblShow = new JLabel("lblShow");
		this.tglbtnShowList = new JToggleButton("H");
		this.btnAction = new JButton("");
		this.btnHuyHD = new JButton(new ImageIcon("C:\\jar\\icons8-cancel-16.png"));
		this.tglbtnShowHistory = new JToggleButton("PS OFF");
		this.popupMenu = new JPopupMenu();
		this.MenuItem_mua = new JMenuItem("Mua");
		this.MenuItem_Ban = new JMenuItem("Ban");
		this.initialize();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frmRubbyMoney = new JFrame();
		frmRubbyMoney.getContentPane().addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				MYFORM.this.driverStock.switchTo().defaultContent();
				JavascriptExecutor jss = (JavascriptExecutor) MYFORM.this.driverStock;
				double steps = (double) e.getWheelRotation();
				MYFORM var10000;
				WebElement left;
				WebElement right;
				if (MYFORM.this.typeChart == 1) {
					left = MYFORM.this.driverStock.findElement(By.xpath("//*[@id=\"left\"]"));
					right = MYFORM.this.driverStock.findElement(By.xpath("//*[@id=\"right\"]"));
					if (steps == 1.0D) {
						var10000 = MYFORM.this;
						var10000.widthleft1 += 50;
						var10000 = MYFORM.this;
						var10000.widthriht1 -= 50;
						jss.executeScript(
								"arguments[0].style.width = '" + String.valueOf(MYFORM.this.widthleft1) + "px'",
								new Object[] { left });
						jss.executeScript(
								"arguments[0].style.width = '" + String.valueOf(MYFORM.this.widthriht1) + "px'",
								new Object[] { right });
					} else {
						var10000 = MYFORM.this;
						var10000.widthleft1 -= 50;
						var10000 = MYFORM.this;
						var10000.widthriht1 += 50;
						jss.executeScript(
								"arguments[0].style.width = '" + String.valueOf(MYFORM.this.widthleft1) + "px'",
								new Object[] { left });
						jss.executeScript(
								"arguments[0].style.width = '" + String.valueOf(MYFORM.this.widthriht1) + "px'",
								new Object[] { right });
					}
				}

				if (MYFORM.this.typeChart == 2) {
					left = MYFORM.this.driverStock.findElement(By.xpath("//*[@id=\"Mleft\"]"));
					right = MYFORM.this.driverStock.findElement(By.xpath("//*[@id=\"Mright\"]"));
					if (steps == 1.0D) {
						if (MYFORM.this.widthleft2 <= 680 && MYFORM.this.widthriht2 > 51) {
							var10000 = MYFORM.this;
							var10000.widthleft2 += 50;
							var10000 = MYFORM.this;
							var10000.widthriht2 -= 50;
							jss.executeScript(
									"arguments[0].style.width = '" + String.valueOf(MYFORM.this.widthleft2) + "px'",
									new Object[] { left });
							jss.executeScript(
									"arguments[0].style.width = '" + String.valueOf(MYFORM.this.widthriht2) + "px'",
									new Object[] { right });
						}
					} else if (MYFORM.this.widthleft2 >= 51 && MYFORM.this.widthriht2 < 680) {
						var10000 = MYFORM.this;
						var10000.widthleft2 -= 50;
						var10000 = MYFORM.this;
						var10000.widthriht2 += 50;
						jss.executeScript(
								"arguments[0].style.width = '" + String.valueOf(MYFORM.this.widthleft2) + "px'",
								new Object[] { left });
						jss.executeScript(
								"arguments[0].style.width = '" + String.valueOf(MYFORM.this.widthriht2) + "px'",
								new Object[] { right });
					}
				}

			}
		});
		frmRubbyMoney.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if (System.getProperty("os.name").contains("Windows")) {
					try {
						MYFORM.this.process = Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
						MYFORM.this.process = Runtime.getRuntime().exec("taskkill /f /im firefox.exe");
						MYFORM.this.process = Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");
						MYFORM.this.process = Runtime.getRuntime().exec("taskkill /f /im msedge.exe");
						MYFORM.this.process = Runtime.getRuntime().exec("taskkill /f /im msedgedriver.exe");
						MYFORM.this.process = Runtime.getRuntime().exec("Taskkill /PID" + MYFORM.this.PID + " /F");
					} catch (IOException var3) {
						var3.printStackTrace();
					}

					MYFORM.this.process.destroy();
				}

			}

			public void windowOpened(WindowEvent e) {
				File file = new File("C:\\jar\\month.txt");

				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					MYFORM.this.HDmonth = br.readLine();
					System.out.println("HDmonth :" + MYFORM.this.HDmonth);
					MYFORM.this.comboBox.setSelectedItem(MYFORM.this.HDmonth);
					MYFORM.this.SHD.setText("1");
					br.close();
				} catch (IOException var5) {
					var5.printStackTrace();
				}

			}
		});
		frmRubbyMoney.getContentPane().setBackground(Color.BLACK);
		frmRubbyMoney.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\jar\\ruby2.jpg"));
		frmRubbyMoney.setBounds(100, 100, 503, 288);
		frmRubbyMoney.setDefaultCloseOperation(3);
		frmRubbyMoney.getContentPane().setLayout((LayoutManager) null);
		String title = "";
		frmRubbyMoney.setTitle("");
		frmRubbyMoney.setLocation(870, 450);
		ImageIcon iconeStart = new ImageIcon(Toolkit.getDefaultToolkit().getImage("C:\\jar\\Start.png"));
		this.panel.setBackground(Color.BLACK);
		this.panel.setBounds(1, 0, 479, 253);
		frmRubbyMoney.getContentPane().add(this.panel);
		this.panel.setLayout((LayoutManager) null);
		this.colunm_HeadHistory.addElement("Khop");
		this.colunm_HeadHistory.addElement("Type");
		this.colunm_HeadHistory.addElement("Status");
		this.colunm_HeadHistory.addElement("Price");
		this.colunm_HeadHistory.addElement("ChuaK");
		this.colunm_HeadHistory.addElement("Time");
		this.tglbtnShowHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Runnable runnable = new Runnable() {
					public void run() {
						MYFORM.this.hien_danhSach_lenh = !MYFORM.this.hien_danhSach_lenh;
						if (MYFORM.this.hien_danhSach_lenh) {
							MYFORM.this.tglbtnShowHistory.setSelected(true);
							MYFORM.this.tglbtnShowHistory.setText("PS ON");
						} else {
							MYFORM.this.tglbtnShowHistory.setSelected(false);
							MYFORM.this.tglbtnShowHistory.setText("PS OFF");
						}

						if (!MYFORM.this.hien_danhSach_lenh && MYFORM.this.threadHD.isAlive()) {
							MYFORM.this.threadHD.stop();
						}

						if (MYFORM.this.hien_danhSach_lenh) {
							MYFORM.this.showlist = false;
							MYFORM.this.tglbtnShowList.setSelected(false);

							while (MYFORM.this.hien_danhSach_lenh) {
								while (true) {
									try {
										MYFORM.this.rowsNumber = MYFORM.this.driverVPS
												.findElements(By.xpath("//*[@id=\"op-order-status\"]/tr"));
										MYFORM.this.countme = MYFORM.this.rowsNumber.size();
										if (MYFORM.this.countme > 0) {
											final Vector total_recordHistory = new Vector();
											if (MYFORM.this.rowsNumber.size() > 3) {
												MYFORM.this.countme = 3;
											}

											for (int k = 1; k < MYFORM.this.countme + 1; ++k) {
												MYFORM.this.newRecordHistory = new Vector();
												MYFORM.this.time = MYFORM.this.driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[1]"));
												MYFORM.this.stype = MYFORM.this.driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[4]"));
												MYFORM.this.Igiadat = MYFORM.this.driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[5]"));
												MYFORM.this.hdkhop = MYFORM.this.driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[7]"));
												MYFORM.this.hdchuaK = MYFORM.this.driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[8]"));
												MYFORM.this.status = MYFORM.this.driverVPS.findElement(
														By.xpath("//*[@id=\"op-order-status\"]/tr[" + k + "]/td[9]"));
												MYFORM.this.newRecordHistory.addElement(MYFORM.this.hdkhop.getText());
												MYFORM.this.newRecordHistory.addElement(MYFORM.this.stype.getText());
												MYFORM.this.newRecordHistory.addElement(MYFORM.this.status.getText());
												MYFORM.this.newRecordHistory.addElement(MYFORM.this.Igiadat.getText());
												MYFORM.this.newRecordHistory.addElement(MYFORM.this.hdchuaK.getText());
												MYFORM.this.newRecordHistory.addElement(MYFORM.this.time.getText());
												total_recordHistory.addElement(MYFORM.this.newRecordHistory);
												MYFORM.frmRubbyMoney.setTitle("history   " + total_recordHistory.get(0)
														+ ", rows : " + MYFORM.this.rowsNumber.size());
											}

											SwingUtilities.invokeLater(new Runnable() {
												public void run() {
													MYFORM.this.tableHistory.setModel(new DefaultTableModel(
															total_recordHistory, MYFORM.this.colunm_HeadHistory));
													MYFORM.this.tableModel.fireTableDataChanged();
													MYFORM.frmRubbyMoney
															.setTitle("history..." + total_recordHistory.get(0)
																	+ ", rows : " + MYFORM.this.rowsNumber.size());
												}
											});
											if (MYFORM.this.time.getText() != "") {
												MYFORM.this.tableHistory.setEnabled(false);
												MYFORM.this.tableHistory.setForeground(Color.BLACK);
												MYFORM.this.tableHistory.setBackground(new Color(242, 245, 249));
												MYFORM.this.tableHistory.setDefaultRenderer(Object.class,
														MYFORM.this.new StockPSRenderer());
											}
										}

										MYFORM.this.retryNeededHis = false;
										MYFORM.this.counterror = 0;
									} catch (StaleElementReferenceException var3) {
										MYFORM.this.retryNeededHis = true;
										++MYFORM.this.counterror;
										MYFORM.frmRubbyMoney.setTitle("counterror 1:" + MYFORM.this.counterror);
										if (MYFORM.this.counterror == 4) {
											MYFORM.this.Refresh.doClick();
											MYFORM.frmRubbyMoney.setTitle(">>> Do refresh action 1");
										}

										MYFORM.frmRubbyMoney.setTitle("history...: " + var3);
									} catch (Exception var4) {
										++MYFORM.this.counterror;
										MYFORM.frmRubbyMoney.setTitle("counterror 2:" + MYFORM.this.counterror);
										MYFORM.frmRubbyMoney.setTitle("history error...: " + var4);
										MYFORM.this.retryNeededHis = true;
										if (MYFORM.this.counterror == 4) {
											MYFORM.this.Refresh.doClick();
											MYFORM.frmRubbyMoney.setTitle(">>> Do refresh action 2");
										}
									}

									if (!MYFORM.this.retryNeededHis) {
										break;
									}
								}
							}
						}

					}
				};
				MYFORM.this.threadHD = new Thread(runnable);
				MYFORM.this.threadHD.start();
			}
		});
		this.tglbtnShowHistory.setBounds(76, 101, 77, 20);
		this.panel.add(this.tglbtnShowHistory);
		this.btnMuaK = new JButton("");
		this.btnMuaK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (MYFORM.this.enableKeyBoard) {
					try {
						if (!MYFORM.this.MUA_ATC && !MYFORM.this.MUA_ATO) {
							MYFORM.this.txtCL_TREN.setText("");
							MYFORM.this.CL_N_TREN.setSelected(true);
							if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
								MYFORM.this.tglbtnShowHistory.doClick();
							}

							MYFORM.this.Mua_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD));
							MYFORM.this.Ban_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD1));
							MYFORM.this.Gia_khop = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HDCLOSE));
							MYFORM.this.js.executeScript(
									"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
									new Object[0]);
							MYFORM.this.js.executeScript("document.getElementById('right_price').value="
									+ Double.valueOf(MYFORM.this.lblShow.getText()) + ";", new Object[0]);
							MYFORM.this.MuaButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Muaxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.MuaButton });
						} else if (MYFORM.this.MUA_ATC) {
							MYFORM.this.ButtonATC = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.ATCxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.ButtonATC });
							MYFORM.this.MuaButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Muaxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.MuaButton });
						} else {
							System.out.println("go to ato mua ...");
							MYFORM.this.ButtonATO = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.ATOxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.ButtonATO });
							MYFORM.this.MuaButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Muaxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.MuaButton });
						}
					} catch (StaleElementReferenceException var3) {
						MYFORM.frmRubbyMoney.setTitle("refresh...");
						MYFORM.this.driverVPS.navigate().refresh();
					} catch (Exception var4) {
						MYFORM.frmRubbyMoney.setTitle(var4.toString());
					}

					if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
						MYFORM.this.hien_danhSach_lenh = false;
						MYFORM.this.tglbtnShowHistory.doClick();
					}
				} else {
					MYFORM.this.lblTB.setText("Keyboard disable");
				}

			}
		});
		this.btnMuaK.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				if (MYFORM.this.fixme) {
					MYFORM.snapto(MYFORM.this.btnMuaK);
				}

			}
		});
		this.btnMuaK.setBounds(146, 44, 70, 23);
		this.panel.add(this.btnMuaK);
		this.btnMuaK.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				MYFORM.this.dongbang = true;
				MYFORM.this.btnMuaK.setBackground(Color.PINK);
				MYFORM.this.lblTB1.setForeground(new Color(245, 247, 227));
				MYFORM.this.lblTB1.setText("Dong bang");
				MYFORM.this.lblShow.setBounds(137, 3, 60, 14);
				MYFORM.this.lblShow.setForeground(Color.GREEN);
				MYFORM.this.lblShow.setText(MYFORM.this.btnMuaK.getText());
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				MYFORM.this.textGiaKhop.setBorder(border);
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.dongbang = false;
				MYFORM.this.btnMuaK.setBackground(Color.WHITE);
				MYFORM.this.lblTB1.setForeground(Color.ORANGE);
				MYFORM.this.lblTB1.setText("khong Dong bang");
				MYFORM.this.lblShow.setText("");
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
			}
		});
		this.btnMuaK.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				MYFORM.this.dongbang = true;
				MYFORM.this.lblTB1.setForeground(new Color(245, 247, 227));
				MYFORM.this.lblTB1.setText("Dong Bang");
				if (steps == 1.0D) {
					MYFORM.this.btnMuaK.setText(String
							.valueOf(MYFORM.this.df.format(Double.valueOf(MYFORM.this.btnMuaK.getText()) - 0.1D)));
				} else {
					MYFORM.this.btnMuaK.setText(String
							.valueOf(MYFORM.this.df.format(Double.valueOf(MYFORM.this.btnMuaK.getText()) + 0.1D)));
				}

				MYFORM.this.lblShow.setForeground(Color.GREEN);
				MYFORM.this.lblShow.setText(MYFORM.this.btnMuaK.getText());
			}
		});
		this.btnMuaK.setMargin(new Insets(2, 5, 2, 5));
		this.btnMuaK.setBackground(new Color(255, 255, 255));
		this.btnMuaK.setToolTipText("Mua Khá»›p");
		this.btnMuaK.setFont(new Font("Tahoma", 1, 11));
		this.btnMuaK.setForeground(new Color(0, 100, 0));
		JPopupMenu popupMenu_MUA_ATC = new JPopupMenu();
		addPopup(this.btnMuaK, popupMenu_MUA_ATC);
		JMenuItem mnItem_Mua_ATC = new JMenuItem("ATC");
		final JButton btnBanK = new JButton("");
		mnItem_Mua_ATC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.MUA_ATC = true;
				MYFORM.this.BAN_ATC = true;
				MYFORM.this.btnMuaK.setText("ATC");
				btnBanK.setText("ATC");
			}
		});
		popupMenu_MUA_ATC.add(mnItem_Mua_ATC);
		JMenuItem mnItem_Mua_ATC_NONE = new JMenuItem("NONE");
		mnItem_Mua_ATC_NONE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.MUA_ATC = false;
				MYFORM.this.MUA_ATO = false;
			}
		});
		JMenuItem mnItem_Mua_ATO = new JMenuItem("ATO");
		mnItem_Mua_ATO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.MUA_ATO = true;
				MYFORM.this.BAN_ATO = true;
				MYFORM.this.MUA_ATC = false;
				MYFORM.this.BAN_ATC = false;
				MYFORM.this.btnMuaK.setText("ATO");
				btnBanK.setText("ATO");
			}
		});
		popupMenu_MUA_ATC.add(mnItem_Mua_ATO);
		popupMenu_MUA_ATC.add(mnItem_Mua_ATC_NONE);
		btnBanK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MYFORM.this.enableKeyBoard) {
					MYFORM.this.BanButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Banxpath));

					try {
						if (!MYFORM.this.BAN_ATC && !MYFORM.this.BAN_ATO) {
							MYFORM.this.txtCL_TREN.setText("");
							MYFORM.this.CL_N_TREN.setSelected(true);
							if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
								MYFORM.this.tglbtnShowHistory.doClick();
							}

							MYFORM.this.Mua_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD));
							MYFORM.this.Ban_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD1));
							MYFORM.this.Gia_khop = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HDCLOSE));
							MYFORM.this.js.executeScript(
									"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
									new Object[0]);
							MYFORM.this.js.executeScript("document.getElementById('right_price').value="
									+ Double.valueOf(MYFORM.this.lblShow.getText()) + ";", new Object[0]);
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.BanButton });
						} else if (MYFORM.this.BAN_ATC) {
							MYFORM.this.ButtonATC = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.ATCxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.ButtonATC });
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.BanButton });
						} else {
							System.out.println("go to ato ban ...");
							MYFORM.this.ButtonATO = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.ATOxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.ButtonATO });
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.BanButton });
						}
					} catch (StaleElementReferenceException var3) {
						MYFORM.frmRubbyMoney.setTitle("Refresh");
						MYFORM.this.driverVPS.navigate().refresh();
					} catch (Exception var4) {
						MYFORM.frmRubbyMoney.setTitle(var4.toString());
					}

					if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
						MYFORM.this.hien_danhSach_lenh = false;
						MYFORM.this.tglbtnShowHistory.doClick();
					}
				} else {
					MYFORM.this.lblTB.setText("Keyboard disable");
				}

			}
		});
		btnBanK.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				if (MYFORM.this.fixme) {
					MYFORM.snapto(btnBanK);
				}

			}
		});
		btnBanK.setBounds(247, 44, 70, 23);
		this.panel.add(btnBanK);
		btnBanK.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				MYFORM.this.dongbang = true;
				btnBanK.setBackground(Color.PINK);
				MYFORM.this.lblTB1.setForeground(new Color(245, 247, 227));
				MYFORM.this.lblTB1.setText("Dong bang");
				MYFORM.this.lblShow.setBounds(193, 3, 60, 14);
				MYFORM.this.lblShow.setForeground(Color.RED);
				MYFORM.this.lblShow.setText(MYFORM.this.btnMuaK.getText());
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				MYFORM.this.textGiaKhop.setBorder(border);
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.dongbang = false;
				btnBanK.setBackground(Color.WHITE);
				MYFORM.this.lblTB1.setForeground(Color.ORANGE);
				MYFORM.this.lblTB1.setText("khong Dong bang");
				MYFORM.this.lblShow.setText("");
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
				MYFORM.this.textGiaKhop.setVisible(true);
			}
		});
		btnBanK.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				MYFORM.this.dongbang = true;
				MYFORM.this.lblTB1.setText("Dong Bang");
				if (steps == 1.0D) {
					btnBanK.setText(String.valueOf(MYFORM.this.df.format(Double.valueOf(btnBanK.getText()) - 0.1D)));
				} else {
					btnBanK.setText(String.valueOf(MYFORM.this.df.format(Double.valueOf(btnBanK.getText()) + 0.1D)));
				}

				MYFORM.this.lblShow.setForeground(Color.RED);
				MYFORM.this.lblShow.setText(btnBanK.getText());
			}
		});
		btnBanK.setMargin(new Insets(2, 5, 2, 5));
		btnBanK.setBackground(new Color(255, 255, 255));
		btnBanK.setToolTipText("BÃ¡n Khá»›p");
		btnBanK.setFont(new Font("Tahoma", 1, 11));
		btnBanK.setForeground(new Color(255, 0, 0));
		JPopupMenu popupMenu_BAN_ATC = new JPopupMenu();
		addPopup(btnBanK, popupMenu_BAN_ATC);
		JMenuItem mnItem_Ban_ATC = new JMenuItem("ATC");
		mnItem_Ban_ATC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.BAN_ATC = true;
				MYFORM.this.MUA_ATC = true;
				btnBanK.setText("ATC");
				MYFORM.this.btnMuaK.setText("ATC");
			}
		});
		popupMenu_BAN_ATC.add(mnItem_Ban_ATC);
		JMenuItem mnItem_Ban_ATC_NONE = new JMenuItem("NONE");
		mnItem_Ban_ATC_NONE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.BAN_ATC = false;
				MYFORM.this.BAN_ATO = false;
			}
		});
		JMenuItem mnItem_Ban_ATO = new JMenuItem("ATO");
		mnItem_Ban_ATO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.BAN_ATO = true;
				MYFORM.this.MUA_ATO = true;
				MYFORM.this.MUA_ATC = false;
				MYFORM.this.BAN_ATC = false;
				MYFORM.this.btnMuaK.setText("ATO");
				btnBanK.setText("ATO");
			}
		});
		popupMenu_BAN_ATC.add(mnItem_Ban_ATO);
		popupMenu_BAN_ATC.add(mnItem_Ban_ATC_NONE);
		this.btnMAK_MUA.setBounds(146, 70, 70, 23);
		this.panel.add(this.btnMAK_MUA);
		this.btnMAK_MUA.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				MYFORM.this.btnMAK_MUA.setBackground(Color.PINK);
			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.btnMAK_MUA.setBackground(Color.WHITE);
			}
		});
		this.btnMAK_MUA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MYFORM.this.enableKeyBoard) {
					Logger logger = Logger.getLogger(MYFORM.class);
					logger.warn("mua.");

					try {
						MYFORM.this.Order_special("M", "MTL");
						if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
							MYFORM.this.hien_danhSach_lenh = false;
							MYFORM.this.tglbtnShowHistory.doClick();
						}
					} catch (Exception var4) {
					}
				} else {
					MYFORM.this.lblTB.setText("Keyboard disable");
				}

			}
		});
		this.btnMAK_MUA.setFont(new Font("Tahoma", 1, 10));
		this.btnMAK_MUA.setForeground(new Color(0, 128, 0));
		final JButton btnMAK_BAN = new JButton("MAK");
		btnMAK_BAN.setBounds(247, 69, 70, 23);
		this.panel.add(btnMAK_BAN);
		btnMAK_BAN.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnMAK_BAN.setBackground(Color.PINK);
			}

			public void mouseExited(MouseEvent e) {
				btnMAK_BAN.setBackground(Color.WHITE);
			}
		});
		btnMAK_BAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MYFORM.this.enableKeyBoard) {
					Logger logger = Logger.getLogger(MYFORM.class);
					logger.warn("ban.");

					try {
						MYFORM.this.Order_special("B", "MTL");
						if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
							MYFORM.this.hien_danhSach_lenh = false;
							MYFORM.this.tglbtnShowHistory.doClick();
						}
					} catch (Exception var4) {
					}
				} else {
					MYFORM.this.lblTB.setText("Keyboard disable");
				}

			}
		});
		btnMAK_BAN.setForeground(Color.RED);
		btnMAK_BAN.setFont(new Font("Tahoma", 1, 10));
		this.txtCL_TREN = new JTextField();
		this.txtCL_TREN.setBounds(299, 95, 61, 20);
		this.panel.add(this.txtCL_TREN);
		this.txtCL_TREN.setEditable(false);
		this.txtCL_TREN.setBackground(new Color(255, 239, 213));
		this.txtCL_TREN.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (!MYFORM.this.txtCL_TREN.getText().isEmpty()) {
					if (steps == 1.0D) {
						MYFORM.this.txtCL_TREN.setText(String.valueOf(
								MYFORM.this.df.format(Double.valueOf(MYFORM.this.txtCL_TREN.getText()) - 0.1D)));
						if (MYFORM.this.buttonGroupCL_TREN.getSelection().getActionCommand().equals("CLMua_TREN")) {
							MYFORM.frmRubbyMoney.setTitle(" - CAT LO VI THE MUA GIA <=:[ "
									+ MYFORM.this.dl.format(Double.valueOf(MYFORM.this.txtCL_TREN.getText())) + " ]");
						}

						if (MYFORM.this.buttonGroupCL_TREN.getSelection().getActionCommand().equals("CLBan_TREN")) {
							MYFORM.frmRubbyMoney.setTitle("- CAT LO VI THE BAN GIA >=:[ "
									+ MYFORM.this.dl.format(Double.valueOf(MYFORM.this.txtCL_TREN.getText())) + " ]");
						}
					} else {
						MYFORM.this.txtCL_TREN.setText(String.valueOf(
								MYFORM.this.df.format(Double.valueOf(MYFORM.this.txtCL_TREN.getText()) + 0.1D)));
						if (MYFORM.this.buttonGroupCL_TREN.getSelection().getActionCommand().equals("CLMua_TREN")) {
							MYFORM.frmRubbyMoney.setTitle(" - CAT LO VI THE MUA GIA <=:[ "
									+ MYFORM.this.dl.format(Double.valueOf(MYFORM.this.txtCL_TREN.getText())) + " ]");
						}

						if (MYFORM.this.buttonGroupCL_TREN.getSelection().getActionCommand().equals("CLBan_TREN")) {
							MYFORM.frmRubbyMoney.setTitle(" - CAT LO VI THE BAN GIA >=:[ "
									+ MYFORM.this.dl.format(Double.valueOf(MYFORM.this.txtCL_TREN.getText())) + " ]");
						}
					}
				}

			}
		});
		this.txtCL_TREN.setColumns(10);
		this.CL_M_TREN.setBounds(272, 95, 20, 20);
		this.panel.add(this.CL_M_TREN);
		this.CL_M_TREN.setBackground(Color.GREEN);
		this.CL_M_TREN.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MYFORM.this.txtCL_TREN.setText(MYFORM.this.df.format((double) MYFORM.this.GIA_KHOP - 1.2D));
				if (!MYFORM.this.chckBreak.isSelected()) {
					MYFORM.frmRubbyMoney
							.setTitle("- CAT LO VI THE MUA GIA <=:[ " + MYFORM.this.txtCL_TREN.getText() + " ]");
				}

			}
		});
		this.CL_M_TREN.setFont(new Font("Tahoma", 1, 11));
		this.CL_M_TREN.setForeground(new Color(0, 128, 0));
		this.CL_M_TREN.setActionCommand("CLMua_TREN");
		this.buttonGroupCL_TREN.add(this.CL_M_TREN);
		this.CL_B_TREN.setBounds(246, 95, 20, 20);
		this.panel.add(this.CL_B_TREN);
		this.CL_B_TREN.setBackground(Color.RED);
		this.CL_B_TREN.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MYFORM.this.txtCL_TREN.setText(MYFORM.this.df.format((double) MYFORM.this.GIA_KHOP + 1.2D));
				if (!MYFORM.this.chckBreak.isSelected()) {
					MYFORM.frmRubbyMoney
							.setTitle("- CAT LO VI THE BAN GIA >=:[ " + MYFORM.this.txtCL_TREN.getText() + " ]");
				}

			}
		});
		this.CL_B_TREN.setFont(new Font("Tahoma", 1, 11));
		this.CL_B_TREN.setForeground(new Color(255, 0, 0));
		this.CL_B_TREN.setActionCommand("CLBan_TREN");
		this.buttonGroupCL_TREN.add(this.CL_B_TREN);
		this.CL_N_TREN.setBounds(220, 95, 20, 20);
		this.panel.add(this.CL_N_TREN);
		this.CL_N_TREN.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MYFORM.this.txtCL_TREN.setText("");
				MYFORM.this.lblTB.setText("");
			}
		});
		this.CL_N_TREN.setActionCommand("CLNone_TREN");
		this.buttonGroupCL_TREN.add(this.CL_N_TREN);
		this.CL_N_TREN.setSelected(true);
		this.CL_N_TREN.setForeground(Color.BLACK);
		this.CL_N_TREN.setFont(new Font("Tahoma", 1, 11));
		this.btnDong.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (MYFORM.this.tontaiHD != 0) {
					MYFORM.this.textGiaKhop.setBounds(30, 19, 56, 21);
					Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
					MYFORM.this.textGiaKhop.setBorder(border);
					MYFORM.this.textGiaKhop.setBackground(Color.BLACK);
					if (MYFORM.this.tontaiHD == 1) {
						if (steps == 1.0D) {
							btnBanK.setText(
									String.valueOf(MYFORM.this.df.format(Double.valueOf(btnBanK.getText()) - 0.1D)));
						} else {
							btnBanK.setText(
									String.valueOf(MYFORM.this.df.format(Double.valueOf(btnBanK.getText()) + 0.1D)));
						}

						MYFORM.this.lblShow.setForeground(Color.GREEN);
						MYFORM.this.lblShow.setText(btnBanK.getText());
					}

					if (MYFORM.this.tontaiHD == 2) {
						if (steps == 1.0D) {
							MYFORM.this.btnMuaK.setText(String.valueOf(
									MYFORM.this.df.format(Double.valueOf(MYFORM.this.btnMuaK.getText()) - 0.1D)));
						} else {
							MYFORM.this.btnMuaK.setText(String.valueOf(
									MYFORM.this.df.format(Double.valueOf(MYFORM.this.btnMuaK.getText()) + 0.1D)));
						}

						MYFORM.this.lblShow.setForeground(Color.RED);
						MYFORM.this.lblShow.setText(MYFORM.this.btnMuaK.getText());
					}

					if (MYFORM.this.tontaiHD == 0) {
						MYFORM.this.lblTB.setText("Khong ton tai");
					}

					MYFORM.this.hien_danhSach_lenh = true;
				} else {
					MYFORM.this.lblTB.setText("Khong ton tai HD");
				}

			}
		});
		this.btnDong.setBounds(320, 44, 47, 24);
		this.panel.add(this.btnDong);
		this.btnDong.setFont(new Font("Tahoma", 0, 8));
		this.btnDong.setBackground(Color.PINK);
		this.btnDong.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					if (MYFORM.this.enableKeyBoard) {
						MYFORM.this.hien_danhSach_lenh = true;
						MYFORM.this.tglbtnShowHistory.setText("PS ON");
						MYFORM.this.dongbang = true;
						if (MYFORM.this.tontaiHD != 0) {
							MYFORM.this.js.executeScript(
									"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
									new Object[0]);
							if (MYFORM.this.tontaiHD == 1) {
								MYFORM.this.js.executeScript("document.getElementById('right_price').value="
										+ MYFORM.this.df.format(Double.valueOf(MYFORM.this.lblShow.getText())) + ";",
										new Object[0]);
								MYFORM.this.MuaButton = MYFORM.this.driverVPS
										.findElement(By.xpath(MYFORM.this.Muaxpath));
								MYFORM.this.js.executeScript("arguments[0].click();",
										new Object[] { MYFORM.this.MuaButton });
							}

							if (MYFORM.this.tontaiHD == 2) {
								MYFORM.this.js.executeScript("document.getElementById('right_price').value="
										+ MYFORM.this.df.format(Double.valueOf(MYFORM.this.btnMuaK.getText())) + ";",
										new Object[0]);
								MYFORM.this.BanButton = MYFORM.this.driverVPS
										.findElement(By.xpath(MYFORM.this.Banxpath));
								MYFORM.this.js.executeScript("arguments[0].click();",
										new Object[] { MYFORM.this.BanButton });
							}

							if (MYFORM.this.tontaiHD == 0) {
								MYFORM.this.lblTB.setText("Khong ton tai");
							}

							MYFORM.this.hien_danhSach_lenh = true;
						} else {
							MYFORM.this.lblTB.setText("Khong ton tai HD");
						}
					}
				} catch (Exception var3) {
				}

			}

			public void mouseEntered(MouseEvent e) {
				MYFORM.this.btnDong.setBackground(Color.WHITE);
				MYFORM.this.dongbang = true;
				MYFORM.this.lblTB1.setForeground(new Color(245, 247, 227));
				MYFORM.this.lblTB1.setText("Dong bang");
			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.dongbang = false;
				MYFORM.this.btnDong.setBackground(Color.PINK);
				MYFORM.this.lblTB1.setForeground(Color.ORANGE);
				MYFORM.this.lblTB1.setText("khong Dong bang");
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				MYFORM.this.textGiaKhop.setBorder(border);
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
				MYFORM.this.lblShow.setText("");
				MYFORM.this.textGiaKhop.setVisible(true);
			}
		});
		this.btnDong.setToolTipText("DONG MUA - BAN");
		final JButton btnDongMK = new JButton("CL");
		btnDongMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (MYFORM.this.enableKeyBoard) {
						if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
							MYFORM.this.hien_danhSach_lenh = false;
							MYFORM.this.tglbtnShowHistory.doClick();
						}

						if (MYFORM.this.tontaiHD != 0) {
							MYFORM.this.js.executeScript(
									"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
									new Object[0]);
							if (MYFORM.this.tontaiHD == 1) {
								MYFORM.this.Order_special("M", "MTL");
								MYFORM.this.lblTB.setText("MUA MK");
							}

							if (MYFORM.this.tontaiHD == 2) {
								MYFORM.this.Order_special("B", "MTL");
								MYFORM.this.lblTB.setText("BAN MK");
							}

							MYFORM.this.hien_danhSach_lenh = true;
						} else {
							MYFORM.this.lblTB.setText("khong ton tai HD");
						}
					}
				} catch (Exception var3) {
				}

			}
		});
		btnDongMK.setBounds(320, 70, 47, 24);
		this.panel.add(btnDongMK);
		btnDongMK.setFont(new Font("Tahoma", 0, 8));
		btnDongMK.setBackground(Color.PINK);
		btnDongMK.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnDongMK.setBackground(Color.WHITE);
			}

			public void mouseExited(MouseEvent e) {
				btnDongMK.setBackground(Color.PINK);
			}
		});
		btnDongMK.setToolTipText("DONG HOP DONG MK");
		this.SHD.setBounds(371, 94, 30, 20);
		this.panel.add(this.SHD);
		this.SHD.setFont(new Font("Tahoma", 1, 11));
		this.SHD.setEditable(false);
		this.SHD.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}

			public void inputMethodTextChanged(InputMethodEvent event) {
				MYFORM.this.SHD.setText(MYFORM.this.SHD.getText().replaceAll("[^a-zA-Z]", ""));
				System.out.println(MYFORM.this.SHD.getText());
			}
		});
		this.SHD.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (!MYFORM.this.SHD.getText().isEmpty()) {
					if (steps == 1.0D) {
						if (Integer.valueOf(MYFORM.this.SHD.getText()) >= 2) {
							MYFORM.this.SHD.setText(String.valueOf(Integer.valueOf(MYFORM.this.SHD.getText()) - 1));
						}
					} else {
						MYFORM.this.SHD.setText(String.valueOf(Integer.valueOf(MYFORM.this.SHD.getText()) + 1));
					}
				}

			}
		});
		this.SHD.setHorizontalAlignment(0);
		this.btnHuyHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
					MYFORM.this.hien_danhSach_lenh = false;
					MYFORM.this.tglbtnShowHistory.doClick();
				}

				WebElement element = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Huyxpath));
				MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { element });
				if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
					MYFORM.this.hien_danhSach_lenh = false;
					MYFORM.this.tglbtnShowHistory.doClick();
				}

			}
		});
		this.btnHuyHD.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
			}
		});
		this.btnHuyHD.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				if (MYFORM.this.fixme) {
					MYFORM.snapto(MYFORM.this.btnHuyHD);
				}

			}
		});
		this.btnHuyHD.setBounds(219, 44, 25, 48);
		this.panel.add(this.btnHuyHD);
		this.btnHuyHD.setMaximumSize(new Dimension(33, 23));
		this.btnHuyHD.setMargin(new Insets(2, 2, 2, 14));
		this.btnHuyHD.setBackground(Color.LIGHT_GRAY);
		this.btnHuyHD.setToolTipText("HUY HOP DONG");
		this.btnHuyHD.setHorizontalAlignment(10);
		final JButton btnDaoNguoc = new JButton("RV");
		btnDaoNguoc.setBounds(95, 44, 47, 24);
		this.panel.add(btnDaoNguoc);
		btnDaoNguoc.setFont(new Font("Tahoma", 0, 8));
		btnDaoNguoc.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					if (MYFORM.this.enableKeyBoard) {
						if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
							MYFORM.this.hien_danhSach_lenh = false;
							MYFORM.this.tglbtnShowHistory.doClick();
						}

						if (MYFORM.this.tontaiHD == 1) {
							MYFORM.this.sohd_daonguoc = Math.abs(Integer.parseInt(MYFORM.this.hdk.getText())) * 2;
							MYFORM.this.String_sohd_daonguoc = String.valueOf(MYFORM.this.sohd_daonguoc);
						}

						if (MYFORM.this.tontaiHD == 2) {
							MYFORM.this.sohd_daonguoc = Integer.parseInt(MYFORM.this.hdk.getText()) * 2;
							MYFORM.this.String_sohd_daonguoc = String.valueOf(MYFORM.this.sohd_daonguoc);
						}

						if (MYFORM.this.tontaiHD != 0) {
							MYFORM.this.js.executeScript("document.getElementById('sohopdong').value="
									+ MYFORM.this.String_sohd_daonguoc + ";", new Object[0]);

							try {
								if (MYFORM.this.textGiaKhop.getText() != "") {
									MYFORM.this.js.executeScript(
											"document.getElementById('right_price').value=" + MYFORM.this.df
													.format(Double.valueOf(MYFORM.this.lblShow.getText())) + ";",
											new Object[0]);
								}
							} catch (NumberFormatException var3) {
							}

							if (MYFORM.this.tontaiHD == 1) {
								MYFORM.this.MuaButton = MYFORM.this.driverVPS
										.findElement(By.xpath(MYFORM.this.Muaxpath));
								MYFORM.this.js.executeScript("arguments[0].click();",
										new Object[] { MYFORM.this.MuaButton });
								MYFORM.this.hien_danhSach_lenh = true;
							}

							if (MYFORM.this.tontaiHD == 2) {
								MYFORM.this.BanButton = MYFORM.this.driverVPS
										.findElement(By.xpath(MYFORM.this.Banxpath));
								MYFORM.this.js.executeScript("arguments[0].click();",
										new Object[] { MYFORM.this.BanButton });
								MYFORM.this.hien_danhSach_lenh = true;
							}
						} else {
							MYFORM.this.lblTB.setText("Khong ton tai HD");
						}
					}
				} catch (Exception var4) {
				}

			}

			public void mouseEntered(MouseEvent e) {
				MYFORM.this.dongbang = true;
				btnDaoNguoc.setBackground(Color.WHITE);
			}

			public void mouseExited(MouseEvent e) {
				btnDaoNguoc.setBackground(Color.PINK);
				MYFORM.this.dongbang = false;
			}
		});
		btnDaoNguoc.setToolTipText("DAO NGUOC MUA - BAN");
		btnDaoNguoc.setBackground(Color.PINK);
		final JButton btnDong_DaoNguocMK = new JButton("RV");
		btnDong_DaoNguocMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (MYFORM.this.enableKeyBoard) {
						if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
							MYFORM.this.hien_danhSach_lenh = false;
							MYFORM.this.tglbtnShowHistory.doClick();
						}

						if (MYFORM.this.tontaiHD == 1) {
							MYFORM.this.sohd_daonguoc = Math.abs(Integer.parseInt(MYFORM.this.hdk.getText())) * 2;
							MYFORM.this.String_sohd_daonguoc = String.valueOf(MYFORM.this.sohd_daonguoc);
						}

						if (MYFORM.this.tontaiHD == 2) {
							MYFORM.this.sohd_daonguoc = Integer.parseInt(MYFORM.this.hdk.getText()) * 2;
							MYFORM.this.String_sohd_daonguoc = String.valueOf(MYFORM.this.sohd_daonguoc);
						}

						MYFORM.this.lblTB
								.setText("shd" + MYFORM.this.String_sohd_daonguoc + " tontaihd" + MYFORM.this.tontaiHD);
						if (MYFORM.this.tontaiHD != 0) {
							MYFORM.this.js.executeScript("document.getElementById('sohopdong').value="
									+ MYFORM.this.String_sohd_daonguoc + ";", new Object[0]);

							try {
								if (MYFORM.this.textGiaKhop.getText() != "") {
									MYFORM.this.js.executeScript(
											"document.getElementById('right_price').value=" + MYFORM.this.df
													.format(Double.valueOf(MYFORM.this.textGiaKhop.getText())) + ";",
											new Object[0]);
								}
							} catch (NumberFormatException var3) {
							}

							WebElement elementMTL;
							if (MYFORM.this.tontaiHD == 1) {
								elementMTL = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.MTLxpath));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { elementMTL });
								MYFORM.this.MuaButton = MYFORM.this.driverVPS
										.findElement(By.xpath(MYFORM.this.Muaxpath));
								MYFORM.this.js.executeScript("arguments[0].click();",
										new Object[] { MYFORM.this.MuaButton });
							}

							if (MYFORM.this.tontaiHD == 2) {
								elementMTL = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.MTLxpath));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { elementMTL });
								MYFORM.this.BanButton = MYFORM.this.driverVPS
										.findElement(By.xpath(MYFORM.this.Banxpath));
								MYFORM.this.js.executeScript("arguments[0].click();",
										new Object[] { MYFORM.this.BanButton });
							}
						} else {
							MYFORM.this.lblTB.setText("Khong ton tai HD");
						}
					}
				} catch (Exception var4) {
				}

			}
		});
		btnDong_DaoNguocMK.setBounds(95, 70, 47, 24);
		this.panel.add(btnDong_DaoNguocMK);
		btnDong_DaoNguocMK.setFont(new Font("Tahoma", 0, 8));
		btnDong_DaoNguocMK.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				btnDong_DaoNguocMK.setBackground(Color.PINK);
			}

			public void mouseEntered(MouseEvent e) {
				btnDong_DaoNguocMK.setBackground(Color.WHITE);
			}
		});
		btnDong_DaoNguocMK.setToolTipText("DAO NGUOC MK");
		btnDong_DaoNguocMK.setBackground(Color.PINK);
		this.chckBreak.setBounds(195, 95, 23, 22);
		this.panel.add(this.chckBreak);
		this.chckBreak.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (!MYFORM.this.txtCL_DUOI.getText().isEmpty()) {
					if (steps == 1.0D) {
						MYFORM.this.txtCL_TREN.setText(String.valueOf(
								MYFORM.this.df.format(Double.valueOf(MYFORM.this.txtCL_TREN.getText()) - 0.1D)));
						MYFORM.this.txtCL_DUOI.setText(String.valueOf(
								MYFORM.this.df.format(Double.valueOf(MYFORM.this.txtCL_DUOI.getText()) + 0.1D)));
					} else {
						MYFORM.this.txtCL_TREN.setText(String.valueOf(
								MYFORM.this.df.format(Double.valueOf(MYFORM.this.txtCL_TREN.getText()) + 0.1D)));
						MYFORM.this.txtCL_DUOI.setText(String.valueOf(
								MYFORM.this.df.format(Double.valueOf(MYFORM.this.txtCL_DUOI.getText()) - 0.1D)));
					}
				}

			}
		});
		this.chckBreak.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				MYFORM.this.chckBreak.setBackground(Color.PINK);
			}

			public void mouseExited(MouseEvent e) {
				if (MYFORM.this.chckBreak.isSelected()) {
					MYFORM.this.chckBreak.setBackground(Color.PINK);
				} else {
					MYFORM.this.chckBreak.setBackground(Color.BLACK);
				}

			}
		});
		this.chckBreak.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (MYFORM.this.chckBreak.isSelected()) {
					MYFORM.this.CL_M_TREN.setSelected(true);
					MYFORM.this.CL_B_DUOI.setSelected(true);
					MYFORM.this.chckBreak.setBackground(Color.PINK);
					if (MYFORM.this.GIA_KHOP > 0.0F) {
						MYFORM.this.txtCL_TREN.setText(MYFORM.this.df.format(
								(double) MYFORM.this.GIA_KHOP + Double.valueOf(MYFORM.this.txtBreak.getText())));
						MYFORM.this.txtCL_DUOI.setText(MYFORM.this.df.format(
								(double) MYFORM.this.GIA_KHOP - Double.valueOf(MYFORM.this.txtBreak.getText())));
					}
				} else {
					MYFORM.this.chckBreak.setBackground(Color.BLACK);
					MYFORM.this.CL_N_TREN.setSelected(true);
					MYFORM.this.CL_N_DUOI.setSelected(true);
					if (MYFORM.this.GIA_KHOP > 0.0F) {
						MYFORM.this.txtCL_TREN.setText("");
						MYFORM.this.txtCL_DUOI.setText("");
					}
				}

			}
		});
		this.chckBreak.setToolTipText("BREAK");
		this.chckBreak.setSelected(true);
		this.chckBreak.setHorizontalAlignment(0);
		this.chckBreak.setForeground(Color.DARK_GRAY);
		this.chckBreak.setBackground(Color.BLACK);
		this.chckBreak.setSelected(false);
		this.buttonGroupCL_DUOI.add(this.CL_N_DUOI);
		this.CL_N_DUOI.setBounds(220, 120, 20, 20);
		this.panel.add(this.CL_N_DUOI);
		this.CL_N_DUOI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (MYFORM.this.CL_N_DUOI.isSelected()) {
					MYFORM.this.lblTB.setText("");
				}

			}
		});
		this.CL_N_DUOI.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MYFORM.this.txtAuto.setBackground(Color.WHITE);
				MYFORM.this.txtCL_DUOI.setText("");
			}
		});
		this.CL_N_DUOI.setSelected(true);
		this.CL_N_DUOI.setSelected(true);
		this.CL_N_DUOI.setForeground(Color.BLACK);
		this.CL_N_DUOI.setFont(new Font("Tahoma", 1, 11));
		this.CL_N_DUOI.setActionCommand("CLNone_DUOI");
		this.buttonGroupCL_DUOI.add(this.CL_B_DUOI);
		this.CL_B_DUOI.setToolTipText("Neu khong co auto, chi thuc hien ban");
		this.CL_B_DUOI.setBounds(246, 120, 20, 20);
		this.panel.add(this.CL_B_DUOI);
		this.CL_B_DUOI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (MYFORM.this.CL_B_DUOI.isSelected()) {
					MYFORM.this.AutoMK = false;
					MYFORM.this.txtAuto.setBackground(Color.PINK);
					MYFORM.this.lblTB.setForeground(Color.RED);
					if (MYFORM.this.chckBreak.isSelected()) {
						MYFORM.frmRubbyMoney.setTitle(" - Check Break");
					} else {
						MYFORM.frmRubbyMoney
								.setTitle(" -ONLY BAN khi gia giam :[ " + MYFORM.this.txtAuto.getText() + " ]");
					}
				}

			}
		});
		this.CL_B_DUOI.setBackground(Color.RED);
		this.CL_B_DUOI.setForeground(Color.RED);
		this.CL_B_DUOI.setFont(new Font("Tahoma", 1, 11));
		this.CL_B_DUOI.setActionCommand("CLBan_DUOI");
		this.buttonGroupCL_DUOI.add(this.CL_M_DUOI);
		this.CL_M_DUOI.setToolTipText("Neu khong co auto, chi thuc hien mua");
		this.CL_M_DUOI.setBounds(272, 120, 20, 20);
		this.panel.add(this.CL_M_DUOI);
		this.CL_M_DUOI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (MYFORM.this.CL_M_DUOI.isSelected()) {
					if (MYFORM.this.chckBreak.isSelected()) {
						MYFORM.frmRubbyMoney.setTitle("- Check Break");
					} else {
						MYFORM.frmRubbyMoney
								.setTitle(" - ONLY MUA khi gia TANG :[ " + MYFORM.this.txtAuto.getText() + " ]");
					}

					MYFORM.this.AutoMK = false;
					MYFORM.this.txtAuto.setBackground(Color.GREEN);
					MYFORM.this.lblTB.setForeground(Color.GREEN);
				}

			}
		});
		this.CL_M_DUOI.setBackground(Color.GREEN);
		this.CL_M_DUOI.setForeground(new Color(0, 128, 0));
		this.CL_M_DUOI.setFont(new Font("Tahoma", 1, 11));
		this.CL_M_DUOI.setActionCommand("CLMua_DUOI");
		this.txtCL_DUOI = new JTextField();
		this.txtCL_DUOI.setBounds(299, 120, 61, 20);
		this.panel.add(this.txtCL_DUOI);
		this.txtCL_DUOI.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (!MYFORM.this.txtCL_DUOI.getText().isEmpty()) {
					if (steps == 1.0D) {
						MYFORM.this.txtCL_DUOI.setText(String.valueOf(
								MYFORM.this.df.format(Double.valueOf(MYFORM.this.txtCL_DUOI.getText()) - 0.1D)));
					} else {
						MYFORM.this.txtCL_DUOI.setText(String.valueOf(
								MYFORM.this.df.format(Double.valueOf(MYFORM.this.txtCL_DUOI.getText()) + 0.1D)));
					}
				}

			}
		});
		this.txtCL_DUOI.setEditable(false);
		this.txtCL_DUOI.setColumns(10);
		this.txtCL_DUOI.setBackground(new Color(255, 239, 213));
		this.txtBreak = new JTextField();
		this.txtBreak.setEditable(false);
		this.txtBreak.setBounds(162, 96, 30, 20);
		this.panel.add(this.txtBreak);
		this.txtBreak.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (!MYFORM.this.txtBreak.getText().isEmpty()) {
					if (steps == 1.0D) {
						MYFORM.this.txtBreak.setText(String
								.valueOf(MYFORM.this.dl.format(Double.valueOf(MYFORM.this.txtBreak.getText()) - 0.1D)));
					} else {
						MYFORM.this.txtBreak.setText(String
								.valueOf(MYFORM.this.dl.format(Double.valueOf(MYFORM.this.txtBreak.getText()) + 0.1D)));
					}
				}

			}
		});
		this.txtBreak.setAlignmentX(0.0F);
		this.txtBreak.setAlignmentY(0.0F);
		this.txtBreak.setFont(new Font("Tahoma", 1, 11));
		this.txtBreak.setHorizontalAlignment(0);
		this.txtBreak.setText("1.2");
		this.txtAuto = new JTextField();
		this.txtAuto.setBounds(371, 119, 30, 20);
		this.panel.add(this.txtAuto);
		this.txtAuto.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (!MYFORM.this.txtAuto.getText().isEmpty()) {
					if (steps == 1.0D) {
						MYFORM.this.txtAuto.setText(String
								.valueOf(MYFORM.this.dl.format(Double.valueOf(MYFORM.this.txtAuto.getText()) - 0.1D)));
					} else {
						MYFORM.this.txtAuto.setText(String
								.valueOf(MYFORM.this.dl.format(Double.valueOf(MYFORM.this.txtAuto.getText()) + 0.1D)));
					}
				}

				if (MYFORM.this.CL_B_DUOI.isSelected()) {
					MYFORM.frmRubbyMoney
							.setTitle(" - ONLY BAN khi gia giam :[ " + MYFORM.this.txtAuto.getText() + " ]");
				}

				if (MYFORM.this.CL_M_DUOI.isSelected()) {
					MYFORM.frmRubbyMoney
							.setTitle(" - ONLY MUA khi gia TANG :[ " + MYFORM.this.txtAuto.getText() + " ]");
				}

				if (MYFORM.this.AutoMK) {
					MYFORM.frmRubbyMoney
							.setTitle(" - MUA / BAN khi gia tang/giam:[ " + MYFORM.this.txtAuto.getText() + " ]");
				}

			}
		});
		this.txtAuto.setText("1.2");
		this.txtAuto.setFont(new Font("Tahoma", 1, 11));
		this.txtAuto.setAlignmentY(0.0F);
		this.txtAuto.setAlignmentX(0.0F);
		this.txtAuto.setHorizontalAlignment(0);
		this.txtAuto.setText("1");
		this.lblShow.setHorizontalAlignment(0);
		this.lblShow.setHorizontalTextPosition(0);
		this.lblShow.setFont(new Font("Tahoma", 0, 18));
		this.lblShow.setForeground(Color.RED);
		this.lblShow.setBounds(238, 3, 60, 14);
		this.panel.add(this.lblShow);
		final JButton btnDong_1 = new JButton("CL");
		btnDong_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDong_1.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				if (MYFORM.this.fixme) {
					MYFORM.snapto(btnDong_1);
				}

			}
		});
		btnDong_1.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				String t = "không tồn tại";
				double steps = (double) e.getWheelRotation();
				if (MYFORM.this.tontaiHD != 0) {
					MYFORM.this.textGiaKhop.setBounds(30, 19, 56, 21);
					Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
					MYFORM.this.textGiaKhop.setBorder(border);
					MYFORM.this.textGiaKhop.setBackground(Color.BLACK);
					if (MYFORM.this.tontaiHD == 1) {
						if (steps == 1.0D) {
							MYFORM.this.textGiaKhop.setText(String.valueOf(
									MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) - 0.1D)));
						} else {
							MYFORM.this.textGiaKhop.setText(String.valueOf(
									MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) + 0.1D)));
						}

						MYFORM.this.lblShow.setForeground(Color.GREEN);
						MYFORM.this.lblShow.setText(MYFORM.this.textGiaKhop.getText());
					}

					if (MYFORM.this.tontaiHD == 2) {
						if (steps == 1.0D) {
							MYFORM.this.textGiaKhop.setText(String.valueOf(
									MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) - 0.1D)));
						} else {
							MYFORM.this.textGiaKhop.setText(String.valueOf(
									MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) + 0.1D)));
						}

						MYFORM.this.lblShow.setForeground(Color.RED);
						MYFORM.this.lblShow.setText(MYFORM.this.textGiaKhop.getText());
					}

					if (MYFORM.this.tontaiHD == 0) {
						MYFORM.this.lblTB.setText(t);
					}

					MYFORM.this.hien_danhSach_lenh = true;
				} else {
					MYFORM.this.lblTB.setText(t);
				}

			}
		});
		btnDong_1.setBounds(151, 22, 50, 20);
		this.panel.add(btnDong_1);
		btnDong_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (MYFORM.this.enableKeyBoard) {
					if (MYFORM.this.tontaiHD != 0) {
						MYFORM.this.js.executeScript(
								"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
								new Object[0]);
						MYFORM.this.js.executeScript("document.getElementById('right_price').value="
								+ Double.valueOf(MYFORM.this.textGiaKhop.getText()) + ";", new Object[0]);
						if (MYFORM.this.tontaiHD == 1) {
							MYFORM.this.MuaButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Muaxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.MuaButton });
						}

						if (MYFORM.this.tontaiHD == 2) {
							MYFORM.this.BanButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Banxpath));
							MYFORM.this.js.executeScript("arguments[0].click();",
									new Object[] { MYFORM.this.BanButton });
						}

						if (MYFORM.this.tontaiHD == 0) {
							MYFORM.this.lblTB.setText("Khong ton tai");
						}

						MYFORM.this.hien_danhSach_lenh = true;
					} else {
						MYFORM.this.lblTB.setText("Khong ton tai HD");
					}
				}

			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.dongbang = false;
				MYFORM.this.textGiaKhop.setVisible(true);
				btnDong_1.setBackground(Color.PINK);
				MYFORM.this.lblTB1.setForeground(Color.ORANGE);
				MYFORM.this.lblTB1.setText("khong Dong bang");
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				MYFORM.this.textGiaKhop.setBorder(border);
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
			}

			public void mouseEntered(MouseEvent e) {
				MYFORM.this.dongbang = true;
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				MYFORM.this.textGiaKhop.setBorder(border);
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
				btnDong_1.setBackground(Color.WHITE);
				MYFORM.this.lblTB1.setForeground(new Color(245, 247, 227));
				MYFORM.this.lblTB1.setText("Dong bang");
			}
		});
		btnDong_1.setToolTipText("DONG MUA - BAN");
		btnDong_1.setFont(new Font("Tahoma", 0, 8));
		btnDong_1.setBackground(Color.PINK);
		this.lblTB1.setBounds(1, 6, 84, 14);
		this.panel.add(this.lblTB1);
		this.lblTB1.setFont(new Font("Tahoma", 0, 9));
		this.lblTB1.setToolTipText("");
		this.lblTB1.setForeground(Color.ORANGE);
		final JLabel lblVN30New = new JLabel("VN30");
		lblVN30New.setBounds(376, 21, 35, 14);
		this.panel.add(lblVN30New);
		lblVN30New.setForeground(Color.WHITE);
		lblVN30New.setFont(new Font("Tahoma", 0, 15));
		this.conn.setBounds(391, 3, 50, 14);
		this.panel.add(this.conn);
		this.conn.setForeground(Color.WHITE);
		this.conn.setFont(new Font("Tahoma", 0, 10));
		final JLabel Iconn = new JLabel("conn");
		Iconn.setForeground(Color.WHITE);
		Iconn.setFont(new Font("Tahoma", 0, 10));
		Iconn.setBounds(445, 3, 24, 14);
		this.panel.add(Iconn);
		this.tglbtnShowChart.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (MYFORM.this.tglbtnShowChart.isSelected()) {
					MYFORM.this.tglbtnShowChart.setText("S");
					MYFORM.this.showtradeview = true;
				} else {
					MYFORM.this.showtradeview = false;
					MYFORM.this.tglbtnShowChart.setText("H");
				}

			}
		});
		this.tglbtnShowChart.setSelected(true);
		this.tglbtnShowChart.setBounds(95, 21, 49, 23);
		this.panel.add(this.tglbtnShowChart);
		this.tglbtnShowList.setBounds(76, 124, 65, 20);
		this.panel.add(this.tglbtnShowList);
		this.tglbtnAuto.setBounds(147, 124, 70, 21);
		this.panel.add(this.tglbtnAuto);
		final JButton btnType = new JButton("1");
		btnType.setBounds(0, 100, 44, 23);
		this.panel.add(btnType);
		btnType.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (steps == 1.0D) {
					if (MYFORM.this.TimeCheck == 5) {
						MYFORM.this.TimeCheck = 1;
					}
				} else if (MYFORM.this.TimeCheck == 1) {
					MYFORM.this.TimeCheck = 5;
				}

				btnType.setText(String.valueOf(MYFORM.this.TimeCheck));
			}
		});
		btnType.setFont(new Font("Tahoma", 0, 9));
		this.panelKey.setBounds(0, 54, 29, 33);
		this.panel.add(this.panelKey);
		this.panelKey.add(new JLabel(new ImageIcon("c:/jar/keyboard.png")));
		this.lblTB.setBounds(1, 30, 77, 14);
		this.panel.add(this.lblTB);
		this.lblTB.setFont(new Font("Tahoma", 0, 9));
		this.lblTB.setToolTipText("");
		this.lblTB.setForeground(Color.ORANGE);
		this.lblVN30.setBounds(10, 126, 43, 14);
		this.panel.add(this.lblVN30);
		this.lblVN30.setVisible(false);
		this.lblVN30.setForeground(Color.WHITE);
		this.lblVN30.setFont(new Font("Tahoma", 0, 15));
		this.btnAction.setToolTipText("ngfnmchmcgh");
		this.btnAction.setFont(new Font("Trebuchet MS", 0, 11));
		this.btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (MYFORM.this.CountAction == 4) {
					MYFORM.this.CountAction = 0;
				}

				++MYFORM.this.CountAction;
				System.out.println("CountAction :" + MYFORM.this.CountAction);
				PointerInfo a = MouseInfo.getPointerInfo();
				Point b = a.getLocation();
				MYFORM.this.btnAction.setBackground(Color.WHITE);
				if (MYFORM.this.CountAction == 1) {
					MYFORM.this.btnAction.setForeground(Color.BLACK);
					MYFORM.this.MStart_X = (int) b.getX();
					MYFORM.this.MStart_Y = (int) b.getY();
					MYFORM.this.BStart_X = MYFORM.this.btnAction.getBounds().x;
					MYFORM.this.BStart_Y = MYFORM.this.btnAction.getBounds().y;
					MYFORM.this.txtAction_Price = MYFORM.this.textGiaKhop.getText();
					MYFORM.this.btnAction.setText("start");
					System.out.println("MStart_X :" + MYFORM.this.MStart_X + "MStart_Y :" + MYFORM.this.MStart_Y);
					System.out.println("BStart_X :" + MYFORM.this.BStart_X + "BStart_Y :" + MYFORM.this.BStart_Y);
					System.out.println("txtAction_Price :" + MYFORM.this.txtAction_Price);
				}

				if (MYFORM.this.CountAction == 2) {
					MYFORM.this.Mfixed_X = (int) b.getX();
					MYFORM.this.Mfixed_Y = (int) b.getY();
					MYFORM.this.Bfixed_X = MYFORM.this.btnAction.getBounds().x;
					MYFORM.this.Bfixed_Y = MYFORM.this.btnAction.getBounds().y;
					MYFORM.this.btnAction.setForeground(Color.BLUE);
					System.out.println("Mfixed_X :" + MYFORM.this.Mfixed_X + "Mfixed_Y :" + MYFORM.this.Mfixed_Y);
					System.out.println("Bfixed_X :" + MYFORM.this.Bfixed_X + "Bfixed_Y :" + MYFORM.this.Bfixed_Y);
					if (MYFORM.this.actionChoice.equals("Mua")) {
						MYFORM.this.btnAction.setText("fix-M");
					}

					if (MYFORM.this.actionChoice.equals("Ban")) {
						MYFORM.this.btnAction.setText("fix-B");
					}
				}

				if (MYFORM.this.CountAction == 3) {
					if (MYFORM.this.enableKeyBoard) {
						if (MYFORM.this.actionChoice.equals("Mua")) {
							MYFORM.this.lblTB1.setText("MUA");
							MYFORM.this.btnAction.setText("Mua");
							MYFORM.this.btnAction.setForeground(Color.BLUE);
							if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
								MYFORM.this.tglbtnShowHistory.doClick();
							}

							try {
								MYFORM.this.txtCL_TREN.setText("");
								MYFORM.this.CL_N_TREN.setSelected(true);
								MYFORM.this.Mua_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD));
								MYFORM.this.Ban_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD1));
								MYFORM.this.Gia_khop = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HDCLOSE));
								MYFORM.this.js.executeScript(
										"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
										new Object[0]);
								MYFORM.this.js.executeScript("document.getElementById('right_price').value="
										+ Double.valueOf(MYFORM.this.lblShow.getText()) + ";", new Object[0]);
								MYFORM.this.MuaButton = MYFORM.this.driverVPS
										.findElement(By.xpath(MYFORM.this.Muaxpath));
								MYFORM.this.js.executeScript("arguments[0].click();",
										new Object[] { MYFORM.this.MuaButton });
							} catch (Exception var6) {
							}
						}

						if (MYFORM.this.actionChoice.equals("Ban")) {
							MYFORM.this.btnAction.setText("Ban");
							MYFORM.this.btnAction.setForeground(Color.RED);

							try {
								MYFORM.this.txtCL_TREN.setText("");
								MYFORM.this.CL_N_TREN.setSelected(true);
								MYFORM.this.Mua_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD));
								MYFORM.this.Ban_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD1));
								MYFORM.this.Gia_khop = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HDCLOSE));
								MYFORM.this.js.executeScript(
										"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
										new Object[0]);
								MYFORM.this.js.executeScript("document.getElementById('right_price').value="
										+ Double.valueOf(MYFORM.this.lblShow.getText()) + ";", new Object[0]);
								MYFORM.this.BanButton = MYFORM.this.driverVPS
										.findElement(By.xpath(MYFORM.this.Banxpath));
								MYFORM.this.js.executeScript("arguments[0].click();",
										new Object[] { MYFORM.this.BanButton });
							} catch (Exception var5) {
							}
						}

						if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
							MYFORM.this.hien_danhSach_lenh = false;
							MYFORM.this.tglbtnShowHistory.doClick();
						}

						MYFORM.this.btnAction.setLocation(MYFORM.this.BStart_X, MYFORM.this.BStart_Y);
						MYFORM.this.btnAction.setForeground(Color.BLACK);
						MYFORM.this.btnAction.setText("reset");
						MYFORM.this.CountAction = 0;
					} else {
						MYFORM.this.lblTB1.setText("keyboard disabled");
					}
				}

				if (MYFORM.this.CountAction == 4) {
					MYFORM.this.btnAction.setLocation(MYFORM.this.BStart_X, MYFORM.this.BStart_Y);
					MYFORM.this.btnAction.setForeground(Color.BLACK);
					MYFORM.this.lblShow.setText("");
					MYFORM.this.btnAction.setText("reset");
					MYFORM.this.CountAction = 0;
				}

			}
		});
		this.btnAction.setBounds(96, 1, 66, 20);
		this.panel.add(this.btnAction);
		addPopup(this.btnAction, this.popupMenu);
		this.MenuItem_mua.setForeground(Color.BLUE);
		this.MenuItem_mua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MYFORM.this.actionChoice = "Mua";
				MYFORM.this.btnAction.setForeground(Color.BLUE);
				MYFORM.this.btnAction.setText("Mua");
			}
		});
		this.popupMenu.add(this.MenuItem_mua);
		this.MenuItem_Ban.setForeground(new Color(139, 0, 0));
		this.MenuItem_Ban.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.actionChoice = "Ban";
				MYFORM.this.btnAction.setForeground(new Color(139, 0, 0));
				MYFORM.this.btnAction.setText("Ban");
			}
		});
		this.popupMenu.add(this.MenuItem_Ban);
		this.textGiaKhop.setBounds(313, 21, 56, 21);
		this.panel.add(this.textGiaKhop);
		this.textGiaKhop.setHorizontalAlignment(0);
		this.textGiaKhop.setEditable(false);
		this.textGiaKhop.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (steps == 1.0D) {
					MYFORM.this.textGiaKhop.setText(String
							.valueOf(MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) - 0.1D)));
				} else {
					MYFORM.this.textGiaKhop.setText(String
							.valueOf(MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) + 0.1D)));
				}

			}
		});
		this.textGiaKhop.setFont(new Font("Tahoma", 1, 12));
		this.textGiaKhop.setColumns(10);
		final JButton btnMuaK_1 = new JButton("");
		btnMuaK_1.setBounds(203, 21, 50, 21);
		this.panel.add(btnMuaK_1);
		btnMuaK_1.setIcon(new ImageIcon("C:\\jar\\buffalo.png"));
		btnMuaK_1.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				if (MYFORM.this.fixme) {
					MYFORM.snapto(btnMuaK_1);
				}

			}
		});
		btnMuaK_1.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (steps == 1.0D) {
					MYFORM.this.textGiaKhop.setText(String
							.valueOf(MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) - 0.1D)));
				} else {
					MYFORM.this.textGiaKhop.setText(String
							.valueOf(MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) + 0.1D)));
				}

				MYFORM.this.lblShow.setForeground(Color.GREEN);
				MYFORM.this.lblShow.setText(MYFORM.this.textGiaKhop.getText());
			}
		});
		btnMuaK_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				MYFORM.this.dongbang = true;
				MYFORM.this.lblTB1.setForeground(new Color(245, 247, 227));
				btnMuaK_1.setBackground(Color.PINK);
				MYFORM.this.lblTB1.setText("Dong bang");
				MYFORM.this.lblShow.setBounds(137, 3, 60, 14);
				MYFORM.this.lblShow.setForeground(Color.GREEN);
				MYFORM.this.lblShow.setText(MYFORM.this.btnMuaK.getText());
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				MYFORM.this.textGiaKhop.setBorder(border);
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.dongbang = false;
				btnMuaK_1.setBackground(Color.WHITE);
				MYFORM.this.lblTB1.setForeground(Color.ORANGE);
				MYFORM.this.lblTB1.setText("khong Dong bang");
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
				MYFORM.this.lblShow.setText("");
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
				MYFORM.this.textGiaKhop.setVisible(true);
			}

			public void mouseClicked(MouseEvent e) {
				if (MYFORM.this.enableKeyBoard) {
					if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
						MYFORM.this.hien_danhSach_lenh = false;
						MYFORM.this.tglbtnShowHistory.doClick();
					}

					try {
						MYFORM.this.js.executeScript(
								"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
								new Object[0]);
						MYFORM.this.js.executeScript("document.getElementById('right_price').value="
								+ Double.valueOf(MYFORM.this.textGiaKhop.getText()) + ";", new Object[0]);
						MYFORM.this.MuaButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Muaxpath));
						MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { MYFORM.this.MuaButton });
						MYFORM.this.hien_danhSach_lenh = true;
					} catch (Exception var3) {
					}
				} else {
					MYFORM.this.lblTB.setText("Keyboard disable");
				}

			}
		});
		btnMuaK_1.setToolTipText("Mua Khá»›p");
		btnMuaK_1.setMargin(new Insets(2, 5, 2, 5));
		btnMuaK_1.setHorizontalTextPosition(10);
		btnMuaK_1.setForeground(new Color(0, 100, 0));
		btnMuaK_1.setFont(new Font("Tahoma", 1, 12));
		final JButton btnBanK_1 = new JButton("");
		btnBanK_1.setBounds(255, 21, 50, 21);
		this.panel.add(btnBanK_1);
		btnBanK_1.setIcon(new ImageIcon("C:\\jar\\bear.png"));
		btnBanK_1.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				if (MYFORM.this.fixme) {
					MYFORM.snapto(btnBanK_1);
				}

			}
		});
		btnBanK_1.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (steps == 1.0D) {
					MYFORM.this.textGiaKhop.setText(String
							.valueOf(MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) - 0.1D)));
				} else {
					MYFORM.this.textGiaKhop.setText(String
							.valueOf(MYFORM.this.df.format(Double.valueOf(MYFORM.this.textGiaKhop.getText()) + 0.1D)));
				}

				MYFORM.this.lblShow.setForeground(Color.RED);
				MYFORM.this.lblShow.setText(MYFORM.this.textGiaKhop.getText());
			}
		});
		btnBanK_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				MYFORM.this.dongbang = true;
				btnBanK_1.setBackground(Color.PINK);
				MYFORM.this.lblTB1.setForeground(new Color(245, 247, 227));
				MYFORM.this.lblTB1.setText("Dong bang");
				MYFORM.this.lblShow.setBounds(193, 3, 60, 14);
				MYFORM.this.lblShow.setForeground(Color.RED);
				MYFORM.this.lblShow.setText(MYFORM.this.btnMuaK.getText());
				MYFORM.this.lblShow.setVisible(true);
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				MYFORM.this.textGiaKhop.setBorder(border);
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.dongbang = false;
				btnBanK_1.setBackground(Color.WHITE);
				MYFORM.this.lblTB1.setForeground(Color.ORANGE);
				MYFORM.this.lblTB1.setText("khong Dong bang");
				Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
				MYFORM.this.textGiaKhop.setBorder(border);
				MYFORM.this.textGiaKhop.setBackground(Color.WHITE);
				MYFORM.this.textGiaKhop.setBounds(313, 19, 56, 21);
				MYFORM.this.lblShow.setText("");
				MYFORM.this.textGiaKhop.setVisible(true);
			}

			public void mouseClicked(MouseEvent e) {
				if (MYFORM.this.enableKeyBoard) {
					if (!MYFORM.this.tglbtnShowHistory.isSelected()) {
						MYFORM.this.hien_danhSach_lenh = false;
						MYFORM.this.tglbtnShowHistory.doClick();
					}

					try {
						MYFORM.this.js.executeScript(
								"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
								new Object[0]);
						MYFORM.this.js.executeScript("document.getElementById('right_price').value="
								+ Double.valueOf(MYFORM.this.textGiaKhop.getText()) + ";", new Object[0]);
						MYFORM.this.BanButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Banxpath));
						MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { MYFORM.this.BanButton });
						MYFORM.this.hien_danhSach_lenh = true;
					} catch (Exception var3) {
					}
				} else {
					MYFORM.this.lblTB.setText("Keyboard disable");
				}

			}
		});
		btnBanK_1.setToolTipText("BÃ¡n Khá»›p");
		btnBanK_1.setMargin(new Insets(2, 5, 2, 5));
		btnBanK_1.setForeground(Color.RED);
		btnBanK_1.setFont(new Font("Tahoma", 1, 12));
		btnBanK_1.setBackground(Color.WHITE);
		this.Refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.hien_danhSach_lenh = true;
				MYFORM.this.tglbtnShowHistory.doClick();
				MYFORM.this.driverVPS.navigate().refresh();
				MYFORM.this.js = (JavascriptExecutor) MYFORM.this.driverVPS;
				MYFORM.this.MuaButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Muaxpath));
				MYFORM.this.BanButton = MYFORM.this.driverVPS.findElement(By.xpath(MYFORM.this.Banxpath));

				try {
					MYFORM.this.js.executeScript(
							"document.getElementById('sohopdong').value=" + MYFORM.this.SHD.getText() + ";",
							new Object[0]);
					MYFORM.this.js.executeScript("document.body.style.zoom = '50%';", new Object[0]);
					MYFORM.frmRubbyMoney.setTitle(" check page loaded,");
					MYFORM.untilPageLoadComplete(MYFORM.this.driverVPS, 20);
					MYFORM.frmRubbyMoney.setTitle(MYFORM.frmRubbyMoney.getTitle() + " click show history ...");
					WebElement showhd = MYFORM.this.driverVPS
							.findElement(By.xpath("//*[@id=\"miniIndex\"]/div[2]/span/a[2]/img"));
					MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { showhd });
				} catch (NoSuchElementException var3) {
				}

			}
		});
		this.Refresh.setBounds(130, 229, 16, 17);
		this.panel.add(this.Refresh);
		this.Refresh.setBackground(new Color(144, 238, 144));
		this.Refresh.setToolTipText("Refresh");
		this.Refresh.setFont(new Font("Tahoma", 0, 6));
		JLabel lblDong_1_2_1 = new JLabel("refresh");
		lblDong_1_2_1.setBounds(78, 230, 49, 14);
		this.panel.add(lblDong_1_2_1);
		lblDong_1_2_1.setForeground(Color.WHITE);
		final JButton btnStart = new JButton("Start");
		btnStart.setBounds(277, 230, 20, 20);
		this.panel.add(btnStart);
		btnStart.setIcon(iconeStart);
		btnStart.setFont(new Font("Tahoma", 1, 13));
		btnStart.setForeground(new Color(0, 153, 0));
		this.comboBox.setBounds(224, 230, 47, 20);
		this.panel.add(this.comboBox);
		this.comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				FileWriter fw = null;

				try {
					fw = new FileWriter("C:\\Jar\\month.txt");
				} catch (IOException var4) {
					var4.printStackTrace();
				}

				PrintWriter pw = new PrintWriter(fw);
				MYFORM.this.HDmonth = MYFORM.this.comboBox.getSelectedItem().toString();
				pw.write(MYFORM.this.HDmonth);
				pw.flush();
				pw.close();
			}
		});
		this.comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		this.tableHistory.setFillsViewportHeight(true);
		this.tableHistory.setFont(new Font("Tahoma", 0, 10));
		this.scrollPaneHistory.setBounds(83, 145, 309, 74);
		this.panel.add(this.scrollPaneHistory);
		this.scrollPaneHistory.setViewportView(this.tableHistory);
		this.tableHistory.setSelectionForeground(Color.WHITE);
		this.tableHistory.setModel(new DefaultTableModel(
				new Object[][] { { "", "-", "-", "-", "-", "-" }, { "", "-", "-", "-", "-", "-" },
						{ "", "-", "-", "-", "-", "-" } },
				new String[] { "Khop", "Type", "Status", "Price", "ChuaK", "Time" }));
		JButton btnNewButton_1 = new JButton("start");
		btnNewButton_1.setBounds(6, 156, 71, 23);
		this.panel.add(btnNewButton_1);
		final JButton btnSetup = new JButton("setup");
		btnSetup.setBounds(6, 183, 71, 23);
		this.panel.add(btnSetup);
		this.btnshow.setBounds(6, 209, 71, 23);
		this.panel.add(this.btnshow);
		this.btnshow.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				JavascriptExecutor js = (JavascriptExecutor) MYFORM.this.driverStock;
				System.out.println("scroll ok");
				double steps = (double) e.getWheelRotation();
				if (steps == 1.0D) {
					js.executeScript("window.scrollBy(0,50)", new Object[] { "" });
				} else {
					js.executeScript("window.scrollBy(0,-50)", new Object[] { "" });
				}

			}
		});
		this.btnshow.setText("sroll");
		final JToggleButton tglbtnNewToggleButton_HLess = new JToggleButton("N");
		tglbtnNewToggleButton_HLess.setBounds(158, 230, 56, 20);
		this.panel.add(tglbtnNewToggleButton_HLess);
		tglbtnNewToggleButton_HLess.setText("HL");
		tglbtnNewToggleButton_HLess.setToolTipText("HEADLESS");
		tglbtnNewToggleButton_HLess.setSelected(true);
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setBounds(302, 230, 20, 20);
		this.panel.add(btnNewButton_4_1);
		btnNewButton_4_1.setIcon(iconeStart);
		this.btnClear.setBounds(326, 229, 56, 20);
		this.panel.add(this.btnClear);
		this.btnClear.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				MYFORM.this.btnClear.setBackground(Color.PINK);
			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.btnClear.setBackground(Color.WHITE);
			}
		});
		this.btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.dn = !MYFORM.this.dn;
				if (!MYFORM.this.dn) {
					MYFORM.this.btnClear.setForeground(Color.BLUE);
				} else {
					MYFORM.this.btnClear.setForeground(Color.RED);
				}

				MYFORM.this.lblTB.setText("");
				MYFORM.this.lblTB1.setText("");
				MYFORM.this.txtCL_TREN.setText("");
				MYFORM.this.txtCL_DUOI.setText("");
				MYFORM.this.lblTB.setText("");
			}
		});
		this.btnClear.setForeground(Color.RED);
		this.btnClear.setFont(new Font("Tahoma", 1, 8));
		this.panel_info.setBackground(Color.BLACK);
		this.panel_info.setBounds(400, 201, 79, 48);
		this.panel.add(this.panel_info);
		this.panel_info.setLayout((LayoutManager) null);
		this.lblHDK.setBounds(16, 0, 46, 14);
		this.panel_info.add(this.lblHDK);
		this.lblHDK.setFont(new Font("Tahoma", 1, 12));
		this.lblHDK.setForeground(Color.WHITE);
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(0, 19, 76, 7);
		this.panel_info.add(btnNewButton_2);
		this.lblSM.setBounds(0, 34, 76, 14);
		this.panel_info.add(this.lblSM);
		this.lblSM.setHorizontalAlignment(0);
		this.lblSM.setForeground(Color.WHITE);
		this.lblCheck.setForeground(new Color(255, 255, 255));
		this.lblCheck.setBounds(10, 234, 46, 14);
		this.panel.add(this.lblCheck);
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MYFORM.this.driverStock.switchTo().defaultContent();
				JavascriptExecutor jss = (JavascriptExecutor) MYFORM.this.driverStock;
				WebElement left = MYFORM.this.driverStock.findElement(By.xpath("//*[@id=\"left\"]"));
				WebElement right = MYFORM.this.driverStock.findElement(By.xpath("//*[@id=\"right\"]"));
				jss.executeScript("arguments[0].style.height = '" + String.valueOf(600) + "px'",
						new Object[] { right });
				jss.executeScript("arguments[0].style.height = '" + String.valueOf(600) + "px'", new Object[] { left });
			}
		});
		btnF.setBounds(29, 131, 47, 23);
		this.panel.add(btnF);
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Runnable runnable = new Runnable() {
					public void run() {
						MYFORM.this.StockList = new Vector();
						MYFORM.this.colunm_HeadStock = new Vector();
						MYFORM.this.colunm_HeadStock.addElement("ten");
						MYFORM.this.colunm_HeadStock.addElement("gia");
						MYFORM.this.colunm_HeadStock.addElement("ch");
						MYFORM.this.colunm_HeadStock.addElement("%");
						MYFORM.this.colunm_HeadStock.addElement("gia_m");
						MYFORM.this.colunm_HeadStock.addElement("kl_m");
						MYFORM.this.colunm_HeadStock.addElement("gia_b");
						MYFORM.this.colunm_HeadStock.addElement("kl_b");
						MYFORM.frmRubbyMoney.setTitle("start loading list");
						File file = new File("E:\\mystock.txt");
						System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
						ChromeOptions chromeOptionList = new ChromeOptions();
						chromeOptionList.setHeadless(MYFORM.this.HeadLess);
						MYFORM.this.DriverStockList = new ChromeDriver(chromeOptionList);
						MYFORM.this.DriverStockList.get("https://iboard.ssi.com.vn/");
						MYFORM.frmRubbyMoney.setTitle("start loading list....");
						Actions action = new Actions(MYFORM.this.DriverStockList);
						WebElement we = MYFORM.this.DriverStockList.findElement(By
								.xpath("//*[@id=\"main-wrapper\"]/div[1]/section[2]/div[2]/div[1]/ul/li[1]/div/span"));
						action.moveToElement(we).build().perform();
						if (MYFORM.this.DriverStockList.findElement(By.xpath(
								"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
								.isDisplayed()) {
							MYFORM.this.DriverStockList.findElement(By.xpath(
									"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
									.sendKeys(new CharSequence[] { "TUAN" });
							MYFORM.this.DriverStockList.findElement(By.xpath(
									"/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"))
									.sendKeys(new CharSequence[] { Keys.ENTER });
						}

						try {
							BufferedReader br = new BufferedReader(new FileReader(file));

							String ma;
							while ((ma = br.readLine()) != null && !ma.isEmpty()) {
								MYFORM.frmRubbyMoney.setTitle("input : " + ma);
								MYFORM.this.DriverStockList.findElement(By.xpath("//*[@id=\"downshift-0-input\"]"))
										.sendKeys(new CharSequence[] { ma });
								MYFORM.this.DriverStockList.findElement(By.xpath("//*[@id=\"downshift-0-input\"]"))
										.sendKeys(new CharSequence[] { Keys.ENTER });
								MYFORM.this.StockList.addElement(ma);
							}

							MYFORM.frmRubbyMoney.setTitle("done ...");
						} catch (FileNotFoundException var8) {
							var8.printStackTrace();
						} catch (IOException var9) {
						}

					}
				};
				Thread thread = new Thread(runnable);
				thread.start();
			}
		});
		tglbtnNewToggleButton_HLess.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (tglbtnNewToggleButton_HLess.isSelected()) {
					MYFORM.this.HeadLess = true;
					tglbtnNewToggleButton_HLess.setText("HL");
				} else {
					MYFORM.this.HeadLess = false;
					tglbtnNewToggleButton_HLess.setText("N");
				}

			}
		});
		this.btnshow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MYFORM.this.flagvn30 = !MYFORM.this.flagvn30;
				MYFORM.this.btnshow.setText(MYFORM.this.flagvn30 ? "old" : "new");
				if (MYFORM.this.flagvn30) {
					MYFORM.this.lblVN30.setBounds(308, 21, 43, 14);
					MYFORM.this.lblVN30.setVisible(true);
					lblVN30New.setBounds(23, 131, 43, 14);
					lblVN30New.setVisible(false);
				} else {
					MYFORM.this.lblVN30.setBounds(23, 131, 43, 14);
					MYFORM.this.lblVN30.setVisible(false);
					lblVN30New.setBounds(308, 21, 43, 14);
					lblVN30New.setVisible(true);
				}

			}
		});
		btnSetup.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				double steps = (double) e.getWheelRotation();
				if (steps == 1.0D) {
					--MYFORM.this.typeColor;
					if (MYFORM.this.typeColor < 1) {
						MYFORM.this.typeColor = 3;
					}
				} else {
					++MYFORM.this.typeColor;
					if (MYFORM.this.typeColor > 3) {
						MYFORM.this.typeColor = 1;
					}
				}

				btnSetup.setText(String.valueOf(MYFORM.this.typeColor));
			}
		});
		btnSetup.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Runnable StockThread = new Runnable() {
					public void run() {
						MYFORM.this.driverStock.switchTo().defaultContent();

						try {
							JavascriptExecutor jss = (JavascriptExecutor) MYFORM.this.driverStock;
							WebElement left = MYFORM.this.driverStock.findElement(By.xpath("//*[@id=\"left\"]"));
							WebElement right = MYFORM.this.driverStock.findElement(By.xpath("//*[@id=\"right\"]"));
							jss.executeScript(
									"arguments[0].style.height = '" + String.valueOf(MYFORM.this.heightL - 300) + "px'",
									new Object[] { left });
							jss.executeScript(
									"arguments[0].style.height = '" + String.valueOf(MYFORM.this.heightR - 400) + "px'",
									new Object[] { right });
							jss.executeScript(
									"arguments[0].style.height = '" + String.valueOf(MYFORM.this.heightL - 300) + "px'",
									new Object[] { left });
							jss.executeScript(
									"arguments[0].style.height = '" + String.valueOf(MYFORM.this.heightR - 400) + "px'",
									new Object[] { left });
							if (MYFORM.this.CheckOK()) {
								MYFORM.this.setupChart("iframe_left", 0, MYFORM.this.typeColor);
								Thread.sleep(200L);
								MYFORM.this.setupChart("iframe_right", 0, MYFORM.this.typeColor);
							} else {
								MYFORM.this.lblCheck.setText("Refresh");
							}
						} catch (InterruptedException var4) {
							var4.printStackTrace();
						}

					}
				};
				MYFORM.this.threadstock = new Thread(StockThread);
				MYFORM.this.threadstock.start();
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Runnable StockThread = new Runnable() {
					public void run() {
						System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver.exe");
						System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
						System.setProperty("webdriver.edge.driver", "C://drivers//msedgedriver.exe");
						MYFORM.this.driverStock = new ChromeDriver();
						MYFORM.this.driverStock.get("file:///E:/ps/src/main/resources/index.html");
						org.openqa.selenium.Dimension n = new org.openqa.selenium.Dimension(1590, 700);
						MYFORM.this.driverStock.manage().window().setSize(n);
					}
				};
				MYFORM.this.threadstock = new Thread(StockThread);
				MYFORM.this.threadstock.start();
			}
		});
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thread t = new Thread() {
					public void run() {
						try {
							MYFORM.frmRubbyMoney.setTitle("Clicked ...");
							File file = new File("C:\\jar\\month.txt");

							try {
								BufferedReader br = new BufferedReader(new FileReader(file));
								MYFORM.this.HDmonth = br.readLine();
								System.out.println("HDmonth :" + MYFORM.this.HDmonth);
								br.close();
							} catch (IOException var21) {
								var21.printStackTrace();
							}

							System.out.println("Thang la : " + MYFORM.this.HDmonth);
							MYFORM.this.comboBox.setSelectedItem(MYFORM.this.HDmonth);
							MYFORM.this.chckBreak.setSelected(false);
							if (MYFORM.this.c) {
								MYFORM.this.itemvn30 = "divVnIndex_30";
								MYFORM.this.HD = MYFORM.this.HDDay + MYFORM.this.HDmonth + "oP1";
								MYFORM.this.HD1 = MYFORM.this.HDDay + MYFORM.this.HDmonth + "bP1";
								MYFORM.this.HDCLOSE = MYFORM.this.HDDay + MYFORM.this.HDmonth + "pri";
								System.out.println("- HD : " + MYFORM.this.HD + " - HD1 : " + MYFORM.this.HD1
										+ "- HDCLOSE : " + MYFORM.this.HDCLOSE);
								MYFORM.this.baseUrl = "http://priceboard.bsc.com.vn/";
							} else {
								MYFORM.this.itemvn30 = "spIdxPoint2";
								MYFORM.this.HD = "VN30F19108";
								MYFORM.this.HD1 = "VN30F191016";
								MYFORM.this.baseUrl = "https://livedragon.vdsc.com.vn/fos/fos.rv";
							}

							MYFORM.this.itemvn30New = "//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div[1]/div[2]/div[1]/div[2]/span[1]";
							TimeUnit.SECONDS.sleep(1L);
						} catch (InterruptedException var22) {
							var22.printStackTrace();
						}

						MYFORM.this.start = !MYFORM.this.start;
						if (MYFORM.this.start) {
							btnStart.setText("Stop");
						} else {
							btnStart.setText("Start");
						}

						try {
							System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver.exe");
							System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
							System.setProperty("webdriver.edge.driver", "C://drivers//msedgedriver.exe");
							MYFORM.frmRubbyMoney.setTitle(" - Driver chrome");
							ChromeOptions chromeOptionVN30 = new ChromeOptions();
							chromeOptionVN30.setHeadless(true);
							ChromeOptions chromeOptionVPS = new ChromeOptions();
							chromeOptionVPS.setHeadless(MYFORM.this.HeadLess);
							MYFORM.this.driverNew = new ChromeDriver(chromeOptionVN30);
							MYFORM.this.driverVPS = new ChromeDriver(chromeOptionVPS);
							MYFORM.this.driverVPS.get("https://smartpro.vps.com.vn");
							MYFORM.frmRubbyMoney.setTitle("vps.com.vn loading ...");
							MYFORM.frmRubbyMoney.setTitle(" - VN30 loading ...");
							MYFORM.this.driverNew.get("https://www.investing.com/indices/vn-30");
							MYFORM.this.driverVPS.findElement(By.xpath("//*[@id=\"form-login\"]/div[2]/div[2]/input"))
									.sendKeys(new CharSequence[] { "163170" });
							MYFORM.this.driverVPS.findElement(By.xpath("//*[@id=\"form-login\"]/div[2]/div[3]/input"))
									.sendKeys(new CharSequence[] { "Nh@ngoc123" });
							MYFORM.this.driverVPS
									.findElement(By.xpath("//*[@id=\"form-login\"]/div[2]/div[7]/button[1]")).click();
							MYFORM.this.js = (JavascriptExecutor) MYFORM.this.driverVPS;
							MYFORM.frmRubbyMoney.setTitle(" pass login input...");
							MYFORM.untilPageLoadComplete(MYFORM.this.driverVPS, 20);
							MYFORM.frmRubbyMoney.setTitle(" page loaded ...");
							Thread.sleep(200L);

							do {
								try {
									MYFORM.this.Mua_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD));
									MYFORM.this.Ban_1806 = MYFORM.this.driverVPS.findElement(By.id(MYFORM.this.HD1));
									MYFORM.this.Gia_khop = MYFORM.this.driverVPS
											.findElement(By.id(MYFORM.this.HDCLOSE));
									MYFORM.this.retryNeeded1 = false;
									MYFORM.frmRubbyMoney.setTitle(">>> Loading vps .. ");
								} catch (NoSuchElementException var20) {
									MYFORM.frmRubbyMoney.setTitle(">>> Loading vps ....  ");
									MYFORM.this.retryNeeded1 = true;
								}
							} while (MYFORM.this.retryNeeded1);

							MYFORM.frmRubbyMoney.setTitle(">>> Load completed ...");
							MYFORM.this.vn30New = MYFORM.this.driverNew.findElement(By.xpath(MYFORM.this.itemvn30New));
							MYFORM.this.GIA_VN30New = Float
									.valueOf(Float.parseFloat(MYFORM.this.vn30New.getText().replaceAll(",", "")));

							try {
								MYFORM.this.GIA_MUA = Float
										.valueOf(Float.parseFloat(MYFORM.this.Mua_1806.getText().replaceAll(",", "")));
								MYFORM.this.GIA_BAN = Float
										.valueOf(Float.parseFloat(MYFORM.this.Ban_1806.getText().replaceAll(",", "")));
								MYFORM.this.GIA_KHOP = Float
										.valueOf(Float.parseFloat(MYFORM.this.Gia_khop.getText().replaceAll(",", "")));
							} catch (NumberFormatException var19) {
							}

							try {
								MYFORM.this.js.executeScript("document.body.style.zoom = '50%';", new Object[0]);
								WebElement config = MYFORM.this.driverVPS
										.findElement(By.xpath("/html/body/div[1]/aside/ul/li[2]/a"));
								WebElement element = config.findElement(By.xpath("/html/body/div[1]/aside/ul/li[1]/a"));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { element });
								WebElement xnl = MYFORM.this.driverVPS
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[1]/label[2]/span"));
								WebElement elementxnl = xnl
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[1]/label[2]/span"));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { elementxnl });
								WebElement tb = MYFORM.this.driverVPS
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[2]/label[2]/span"));
								WebElement elementtb = tb
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[2]/label[2]/span"));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { elementtb });
								WebElement tb1 = MYFORM.this.driverVPS
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[3]/label[2]/span"));
								WebElement elementtb1 = tb1
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[3]/label[2]/span"));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { elementtb1 });
								WebElement tb2 = MYFORM.this.driverVPS
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[3]/label[2]/span"));
								WebElement elementtb2 = tb2
										.findElement(By.xpath("//*[@id=\"config_setting\"]/div[3]/label[2]/span"));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { elementtb2 });
								WebElement savecf = MYFORM.this.driverVPS
										.findElement(By.xpath("//*[@id=\"btnSaveConfig\"]"));
								WebElement elementsavecf = savecf.findElement(By.xpath("//*[@id=\"btnSaveConfig\"]"));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { elementsavecf });
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { element });
								MYFORM.this.js = (JavascriptExecutor) MYFORM.this.driverVPS;
								MYFORM.this.driverVPS.navigate().refresh();
								MYFORM.this.js.executeScript("document.body.style.zoom = '50%';", new Object[0]);
								WebElement PIN = MYFORM.this.driverVPS
										.findElement(By.xpath("//*[@id=\"account_pin_cd\"]"));
								PIN.sendKeys(new CharSequence[] { "Nh@ngoc123" });
								WebElement save = MYFORM.this.modal_price
										.findElement(By.xpath("//*[@id=\"account_save_pin\"]"));
								MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { save });
								MYFORM.frmRubbyMoney.setTitle("Finish config ....");
							} catch (NoSuchElementException var17) {
							} catch (IllegalThreadStateException var18) {
								MYFORM.frmRubbyMoney.setTitle("IllegalThreadStateException");
							}
						} catch (Exception var23) {
							var23.printStackTrace();
						}

						WebElement showhd = MYFORM.this.driverVPS
								.findElement(By.xpath("//*[@id=\"miniIndex\"]/div[2]/span/a[2]/img"));
						MYFORM.this.js.executeScript("arguments[0].click();", new Object[] { showhd });
						MYFORM.frmRubbyMoney.setTitle(" click show history ...");
						MYFORM.frmRubbyMoney.setTitle(" - for ....");
						MYFORM.this.countDownThread = new Runnable() {
							public void run() {
								try {
									MYFORM.this.connect = MYFORM.this.driverVPS
											.findElement(By.xpath("//*[@id=\"status-connect\"]/span/span"));
									if (MYFORM.this.connect.getText().equals("Connected")) {
										MYFORM.this.conn.setForeground(Color.GREEN);
									} else {
										MYFORM.this.conn.setForeground(Color.RED);
									}

									MYFORM.this.conn.setText(MYFORM.this.connect.getText());
								} catch (NoSuchElementException var20) {
								}

								MYFORM.this.vn30New = MYFORM.this.driverNew
										.findElement(By.xpath(MYFORM.this.itemvn30New));
								if (!MYFORM.this.vn30New.getText().isEmpty()) {
									MYFORM.this.GIA_VN30New = Float.valueOf(
											Float.parseFloat(MYFORM.this.vn30New.getText().replaceAll(",", "")));
								}

								float temp2 = 0.0F;
								float temp2New = 0.0F;
								float total = 0.0F;

								while (true) {
									MYFORM.this.retryNeeded = false;

									while (true) {
										URL info;
										try {
											info = new URL("https://smartpro.vps.com.vn");
											URLConnection iconn = info.openConnection();
											iconn.connect();
											Iconn.setForeground(Color.GREEN);
											Iconn.setText("Ic");
										} catch (Exception var19) {
											Iconn.setForeground(Color.RED);
											Iconn.setText("Id");
										}

										try {
											MYFORM.this.connect = MYFORM.this.driverVPS
													.findElement(By.xpath("//*[@id=\"status-connect\"]/span/span"));
											if (MYFORM.this.connect.getText().equals("Connected")) {
												MYFORM.this.conn.setForeground(Color.GREEN);
											} else {
												MYFORM.this.conn.setForeground(Color.RED);
											}

											MYFORM.this.conn.setText(MYFORM.this.connect.getText());
										} catch (NoSuchElementException var18) {
											var18.printStackTrace();
										}

										try {
											info = null;
											WebElement Gia_khop = MYFORM.this.driverVPS
													.findElement(By.id(MYFORM.this.HDCLOSE));
											WebElement Mua_1806 = MYFORM.this.driverVPS
													.findElement(By.id(MYFORM.this.HD));
											WebElement Ban_1806 = MYFORM.this.driverVPS
													.findElement(By.id(MYFORM.this.HD1));
											String Mua = Mua_1806.getText();
											String Ban = Ban_1806.getText();
											String Khop = Gia_khop.getText();
											if (Mua.isEmpty() && !Ban.isEmpty()) {
												Mua = Ban;
												MYFORM.this.lblCheck.setText("mua empty");
											}

											if (Ban.isEmpty() && !Mua.isEmpty()) {
												Ban = Mua;
											}

											MYFORM.this.lblCheck.setText("out ok..");
											MYFORM.this.GIA_KHOP = Float
													.valueOf(Float.parseFloat(Khop.replaceAll(",", "")));
											if (!MYFORM.this.dongbang) {
												MYFORM.this.textGiaKhop.setText(String
														.valueOf(MYFORM.this.df.format((double) MYFORM.this.GIA_KHOP)));
											}

											if (!Mua.equals("ATO") && !Mua.equals("ATC")) {
												MYFORM.this.GIA_BAN_REAL = Float
														.valueOf(Float.parseFloat(Mua.replaceAll(",", "")));
												MYFORM.this.GIA_MUA_REAL = Float
														.valueOf(Float.parseFloat(Ban.replaceAll(",", "")));
												if (!MYFORM.this.MUA_ATC && !MYFORM.this.MUA_ATO
														&& !MYFORM.this.dongbang) {
													MYFORM.this.btnMuaK.setText(String.valueOf(
															MYFORM.this.df.format((double) MYFORM.this.GIA_BAN_REAL)));
												}

												if (!MYFORM.this.BAN_ATC && !MYFORM.this.BAN_ATO
														&& !MYFORM.this.dongbang) {
													btnBanK.setText(String.valueOf(
															MYFORM.this.df.format((double) MYFORM.this.GIA_MUA_REAL)));
												}
											}

											WebElement infox = MYFORM.this.driverVPS
													.findElement(By.xpath("//*[@id=\"unrelizeVMAccInfo\"]"));
											MYFORM.this.lblinfo.setText(infox.getText());
											MYFORM.this.hdk = MYFORM.this.driverVPS
													.findElement(By.xpath("//*[@id=\"danhmuc_" + MYFORM.this.HDDay
															+ MYFORM.this.HDmonth + "\"]/td[2]"));
											MYFORM.this.sm = MYFORM.this.driverVPS
													.findElement(By.xpath("//*[@id=\"sucmua-int\"]"));
											if (!MYFORM.this.hdk.getAttribute("style").isEmpty()) {
												if (MYFORM.this.hdk.getAttribute("style").toString().substring(19, 20)
														.compareTo("4") == 0) {
													MYFORM.this.lblHDK.setForeground(Color.GREEN);
													MYFORM.this.tontaiHD = 2;
												} else {
													MYFORM.this.lblHDK.setForeground(Color.RED);
													MYFORM.this.tontaiHD = 1;
												}

												MYFORM.this.lblHDK.setText("HD :" + MYFORM.this.hdk.getText());
											} else {
												MYFORM.this.lblHDK.setText("HD :" + MYFORM.this.hdk.getText());
												MYFORM.this.tontaiHD = 0;
											}

											MYFORM.this.lblHDK.setText("HD :" + MYFORM.this.hdk.getText());
											MYFORM.this.lblCheck.setText("out ok.....");

											try {
												if (MYFORM.this.tontaiHD == 1) {
													MYFORM.this.btnDong.setBackground(new Color(152, 251, 152));
													MYFORM.this.btnDong.setForeground(Color.BLUE);
													btnDongMK.setBackground(new Color(152, 251, 152));
													btnDongMK.setForeground(Color.BLUE);
													btnDong_DaoNguocMK.setBackground(new Color(152, 251, 152));
													btnDong_DaoNguocMK.setForeground(Color.BLUE);
													btnDaoNguoc.setBackground(new Color(152, 251, 152));
													btnDaoNguoc.setForeground(Color.BLUE);
												}

												if (MYFORM.this.tontaiHD == 2) {
													MYFORM.this.btnDong.setBackground(Color.PINK);
													MYFORM.this.btnDong.setForeground(Color.RED);
													btnDongMK.setBackground(Color.PINK);
													btnDongMK.setForeground(Color.RED);
													btnDong_DaoNguocMK.setBackground(Color.PINK);
													btnDong_DaoNguocMK.setForeground(Color.RED);
													btnDaoNguoc.setBackground(Color.PINK);
													btnDaoNguoc.setForeground(Color.RED);
												}
											} catch (NoSuchElementException var15) {
												MYFORM.this.gia = "0";
												MYFORM.this.giadat = "0";
											}

											MYFORM.this.lblSM.setText(MYFORM.this.sm.getText());
											MYFORM.this.temp1 = MYFORM.this.GIA_VN30;
											float temp1New = MYFORM.this.GIA_VN30New;
											MYFORM.this.vn30New = MYFORM.this.driverNew
													.findElement(By.xpath(MYFORM.this.itemvn30New));
											if (!MYFORM.this.vn30New.getText().isEmpty()) {
												MYFORM.this.GIA_VN30New = Float.valueOf(Float
														.parseFloat(MYFORM.this.vn30New.getText().replaceAll(",", "")));
											}

											if (MYFORM.this.GIA_VN30New != temp1New) {
												++MYFORM.this.countvn30new;
												if (MYFORM.this.GIA_VN30New > temp1New) {
													lblVN30New.setForeground(Color.GREEN);
													temp2New = MYFORM.this.GIA_VN30New - temp1New;
												} else {
													temp2New = temp1New - MYFORM.this.GIA_VN30New;
													lblVN30New.setForeground(Color.RED);
												}

												lblVN30New
														.setText((new DecimalFormat("0.00")).format((double) temp2New));
											}

											if (MYFORM.this.GIA_VN30New != temp1New) {
												if (MYFORM.this.GIA_VN30New > temp1New) {
													++MYFORM.this.cuongdo;
													MYFORM.this.lblVN30.setForeground(Color.GREEN);
													temp2 = MYFORM.this.GIA_VN30New - temp1New;
													total += temp2;
													if ((double) temp2 >= Double.valueOf(MYFORM.this.txtAuto.getText())
															&& MYFORM.this.AutoMK
															&& MYFORM.this.buttonGroupCL_DUOI.getSelection()
																	.getActionCommand().equals("CLNone_DUOI")) {
														MYFORM.this.AutoMK = !MYFORM.this.AutoMK;
														MYFORM.this.lblTB.setText("Mua Nhanh");
														MYFORM.this.timerLB = new Timer(500,
																MYFORM.this.new LbBlink(MYFORM.this.lblTB, "green"));
														MYFORM.this.timerLB.start();
														MYFORM.this.Order_special("M", "MTL");
														MYFORM.this.txtCL_TREN.setText(MYFORM.this.df
																.format((double) MYFORM.this.GIA_KHOP - 1.2D));
														MYFORM.this.CL_M_TREN.setSelected(true);
														MYFORM.this.txtCL_TREN.setForeground(Color.BLUE);
														FileWriter fw = null;

														try {
															fw = new FileWriter("C:\\jar\\trade.txt");
															fw.append("-MUA-:");
															fw.append(MYFORM.this.textGiaKhop.getText()
																	+ MYFORM.this.time.getText());
															fw.close();
														} catch (IOException var14) {
															var14.printStackTrace();
														}
													}

													if (MYFORM.this.buttonGroupCL_DUOI.getSelection().getActionCommand()
															.equals("CLMua_DUOI")
															&& (double) temp2 >= Double
																	.valueOf(MYFORM.this.txtAuto.getText())) {
														MYFORM.this.Order_special("M", "MTL");
													}
												}

												if (MYFORM.this.GIA_VN30New < temp1New) {
													--MYFORM.this.cuongdo;
													temp2 = temp1New - MYFORM.this.GIA_VN30New;
													total -= temp2;
													MYFORM.this.lblVN30.setForeground(Color.RED);
													if ((double) temp2 >= Double.valueOf(MYFORM.this.txtAuto.getText())
															&& MYFORM.this.AutoMK
															&& MYFORM.this.buttonGroupCL_DUOI.getSelection()
																	.getActionCommand().equals("CLNone_DUOI")) {
														MYFORM.this.AutoMK = !MYFORM.this.AutoMK;
														MYFORM.this.lblTB.setText("Ban Nhanh");
														MYFORM.this.timerLB = new Timer(500,
																MYFORM.this.new LbBlink(MYFORM.this.lblTB, "red"));
														MYFORM.this.timerLB.start();
														MYFORM.this.Order_special("B", "MTL");
														MYFORM.this.txtCL_TREN.setText(MYFORM.this.df
																.format((double) MYFORM.this.GIA_KHOP + 1.2D));
														MYFORM.this.CL_B_TREN.setSelected(true);
														MYFORM.this.txtCL_TREN.setForeground(Color.BLUE);
													}

													if (MYFORM.this.buttonGroupCL_DUOI.getSelection().getActionCommand()
															.equals("CLBan_DUOI")
															&& (double) temp2 >= Double
																	.valueOf(MYFORM.this.txtAuto.getText())) {
														MYFORM.this.Order_special("B", "MTL");
													}
												}

												++MYFORM.this.countvn30;
												MYFORM.this.lblVN30
														.setText((new DecimalFormat("0.00")).format((double) temp2));
												if (MYFORM.this.countvn30 == 5) {
													MYFORM.this.countvn30 = 0;
													total = 0.0F;
												}
											}

											if (MYFORM.this.buttonGroupCL_TREN.getSelection().getActionCommand()
													.equals("CLMua_TREN")
													&& MYFORM.this.txtCL_TREN.getText().length() > 1
													&& Double.valueOf(btnBanK.getText()) <= Double
															.valueOf(MYFORM.this.txtCL_TREN.getText())
													&& MYFORM.this.tontaiHD == 2) {
												MYFORM.this.Order_special("B", "MTL");
												MYFORM.this.CL_N_TREN.setSelected(true);
												MYFORM.this.lblTB.setText("CAT LO - " + MYFORM.this.time.getText());
												MYFORM.this.timerLB = new Timer(500,
														MYFORM.this.new LbBlink(MYFORM.this.lblTB, "red"));
												MYFORM.this.timerLB.start();
												MYFORM.this.txtCL_TREN.setText("");
											}

											if (MYFORM.this.buttonGroupCL_TREN.getSelection().getActionCommand()
													.equals("CLBan_TREN")
													&& MYFORM.this.txtCL_TREN.getText().length() > 1
													&& Double.valueOf(MYFORM.this.btnMuaK.getText()) >= Double
															.valueOf(MYFORM.this.txtCL_TREN.getText())
													&& MYFORM.this.tontaiHD == 1) {
												MYFORM.this.Order_special("M", "MTL");
												MYFORM.this.CL_N_TREN.setSelected(true);
												MYFORM.this.lblTB.setText("CAT LO - " + MYFORM.this.time.getText());
												MYFORM.this.timerLB = new Timer(500,
														MYFORM.this.new LbBlink(MYFORM.this.lblTB, "green"));
												MYFORM.this.timerLB.start();
												MYFORM.this.txtCL_TREN.setText("");
											}

											if (MYFORM.this.chckBreak.isSelected()) {
												if (MYFORM.this.buttonGroupCL_TREN.getSelection().getActionCommand()
														.equals("CLMua_TREN")
														&& MYFORM.this.txtCL_TREN.getText().length() > 1
														&& Double.valueOf(MYFORM.this.textGiaKhop.getText()) >= Double
																.valueOf(MYFORM.this.txtCL_TREN.getText())) {
													MYFORM.this.Order_special("M", "MTL");
													MYFORM.this.CL_N_TREN.setSelected(true);
													MYFORM.this.lblTB.setText("MUA BRAEK - ");
													MYFORM.this.chckBreak.setSelected(false);
													MYFORM.this.timerLB = new Timer(500,
															MYFORM.this.new LbBlink(MYFORM.this.lblTB, "red"));
													MYFORM.this.timerLB.start();
													MYFORM.this.txtCL_TREN.setText("");
													System.out.println(">>mua break");
												}

												if (MYFORM.this.buttonGroupCL_DUOI.getSelection().getActionCommand()
														.equals("CLBan_DUOI")
														&& MYFORM.this.txtCL_DUOI.getText().length() > 1
														&& Double.valueOf(MYFORM.this.textGiaKhop.getText()) <= Double
																.valueOf(MYFORM.this.txtCL_DUOI.getText())) {
													MYFORM.this.Order_special("B", "MTL");
													MYFORM.this.CL_N_TREN.setSelected(true);
													MYFORM.this.lblTB.setText("BAN BREAK - ");
													MYFORM.this.chckBreak.setSelected(false);
													MYFORM.this.timerLB = new Timer(500,
															MYFORM.this.new LbBlink(MYFORM.this.lblTB, "green"));
													MYFORM.this.timerLB.start();
													MYFORM.this.txtCL_TREN.setText("");
												}

												if (MYFORM.this.buttonGroupCL_DUOI.getSelection().getActionCommand()
														.equals("CLMua_DUOI")
														&& MYFORM.this.txtCL_DUOI.getText().length() > 1
														&& (double) MYFORM.this.GIA_KHOP >= Double
																.valueOf(MYFORM.this.txtCL_DUOI.getText())) {
													MYFORM.this.Order_special("M", "MTL");
													MYFORM.this.CL_N_DUOI.setSelected(true);
													MYFORM.this.chckBreak.setSelected(false);
													MYFORM.this.lblTB
															.setText("MUA BRAEK - " + MYFORM.this.time.getText());
													MYFORM.this.timerLB = new Timer(500,
															MYFORM.this.new LbBlink(MYFORM.this.lblTB, "red"));
													MYFORM.this.timerLB.start();
													MYFORM.this.txtCL_DUOI.setText("");
												}

												if (MYFORM.this.buttonGroupCL_DUOI.getSelection().getActionCommand()
														.equals("CLBan_DUOI")
														&& MYFORM.this.txtCL_DUOI.getText().length() > 1
														&& (double) MYFORM.this.GIA_KHOP <= Double
																.valueOf(MYFORM.this.txtCL_DUOI.getText())) {
													MYFORM.this.Order_special("B", "MTL");
													MYFORM.this.CL_N_DUOI.setSelected(true);
													MYFORM.this.chckBreak.setSelected(false);
													MYFORM.this.lblTB
															.setText("BAN BREAK - " + MYFORM.this.time.getText());
													MYFORM.this.timerLB = new Timer(500,
															MYFORM.this.new LbBlink(MYFORM.this.lblTB, "green"));
													MYFORM.this.timerLB.start();
													MYFORM.this.txtCL_DUOI.setText("");
												}
											}
										} catch (StaleElementReferenceException var16) {
											MYFORM.frmRubbyMoney.setTitle("main_StaleElement");
											MYFORM.this.retryNeeded = true;
										} catch (Exception var17) {
											MYFORM.frmRubbyMoney.setTitle("main_Error");
											MYFORM.this.retryNeeded = true;
										}

										if (!MYFORM.this.retryNeeded) {
											break;
										}
									}
								}
							}
						};
						UncaughtExceptionHandler h = new UncaughtExceptionHandler() {
							public void uncaughtException(Thread thread, Throwable exception) {
								thread.start();
							}
						};
						MYFORM.this.thread = new Thread(MYFORM.this.countDownThread);
						MYFORM.this.thread.start();
						MYFORM.this.thread.setUncaughtExceptionHandler(h);
						MYFORM.this.threadVN30 = new Runnable() {
							public void run() {
								while (true) {
									if (!MYFORM.this.thread.isAlive()) {
										MYFORM.this.thread = new Thread(MYFORM.this.countDownThread);
										MYFORM.frmRubbyMoney.setTitle("restart thread");
										MYFORM.this.thread.start();
									}
								}
							}
						};
						Thread thread30 = new Thread(MYFORM.this.threadVN30);
						thread30.start();
					}
				};
				t.start();
			}
		});
		this.panelKey.setVisible(false);
		btnType.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String Str_1Minute = "//*[@id=\"__outside-render-0\"]/div/div/div/div/div/div/div[1]/div/div[1]";
				String Str_5Minute = "//*[@id=\"__outside-render-0\"]/div/div/div/div/div/div/div[2]/div/div[1]";
				if (MYFORM.this.TimeCheck == 1) {
					MYFORM.this.driverStock.switchTo().defaultContent();
					MYFORM.this.driverStock.switchTo().frame("iframe_right");
					MYFORM.this.driverStock.switchTo().frame(0);
					MYFORM.this.driverStock.findElement(By.id("header-toolbar-intervals")).click();
				}

				if (MYFORM.this.TimeCheck == 5) {
					MYFORM.this.driverStock.switchTo().defaultContent();
					MYFORM.this.driverStock.switchTo().frame("iframe_right");
					MYFORM.this.driverStock.switchTo().frame(0);
					MYFORM.this.driverStock.findElement(By.id("header-toolbar-intervals")).click();
				}

			}
		});
		this.tglbtnAuto.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (MYFORM.this.tglbtnAuto.isSelected()) {
					MYFORM.this.tglbtnAuto.setText("Auto on");
					MYFORM.this.tglbtnAuto.setForeground(Color.RED);
					MYFORM.this.AutoMK = true;
				} else {
					MYFORM.this.tglbtnAuto.setText("Auto off");
					MYFORM.this.tglbtnAuto.setForeground(Color.BLACK);
					MYFORM.this.AutoMK = false;
				}

			}
		});
		this.tglbtnShowList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Runnable runnable = new Runnable() {
					@SuppressWarnings("deprecation")
					public void run() {
						MYFORM.this.showlist = !MYFORM.this.showlist;
						if (!MYFORM.this.showlist && MYFORM.this.threadStock.isAlive()) {
							MYFORM.this.threadStock.stop();
						}

						if (MYFORM.this.showlist) {
							MYFORM.this.tglbtnShowList.setSelected(true);
							MYFORM.this.hien_danhSach_lenh = false;
							MYFORM.this.tglbtnShowHistory.setSelected(false);

							while (MYFORM.this.showlist) {
								final Vector total_recordStock = new Vector();
								String StrB = "//*[@id=\"main-wrapper\"]/div[1]/section[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[";
								Vector newRecordStock = null;
								MYFORM.this.tableHistory.setDefaultRenderer(Object.class,
										MYFORM.this.new StockListRenderer());

								for (int i = 0; i < MYFORM.this.StockList.size(); ++i) {
									newRecordStock = new Vector();
									newRecordStock.addElement(MYFORM.this.StockList.get(i));
									newRecordStock.addElement(MYFORM.this.DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[11]"))
											.getText());
									newRecordStock.addElement(MYFORM.this.DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[13]"))
											.getText());
									newRecordStock.addElement(MYFORM.this.DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[14]"))
											.getText());
									newRecordStock.addElement(MYFORM.this.DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[9]"))
											.getText());
									newRecordStock.addElement(MYFORM.this.DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[10]"))
											.getText());
									newRecordStock.addElement(MYFORM.this.DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[15]"))
											.getText());
									newRecordStock.addElement(MYFORM.this.DriverStockList
											.findElement(By.xpath(StrB + String.valueOf(i + 1) + "]/div[16]"))
											.getText());
									total_recordStock.addElement(newRecordStock);
								}

								final DefaultTableModel tableModel = (DefaultTableModel) MYFORM.this.tableHistory
										.getModel();
								SwingUtilities.invokeLater(new Runnable() {
									public void run() {
										MYFORM.frmRubbyMoney.setTitle(".....");
										MYFORM.this.tableHistory.setModel(
												new DefaultTableModel(total_recordStock, MYFORM.this.colunm_HeadStock));
										tableModel.fireTableDataChanged();
										TableColumnModel model = MYFORM.this.tableHistory.getColumnModel();
										tableModel.fireTableDataChanged();
									}
								});
							}

							MYFORM.this.tglbtnShowHistory.setText("PS OFF");
						}

						if (!MYFORM.this.showlist) {
							MYFORM.this.tglbtnShowList.setSelected(false);
						}

					}
				};
				MYFORM.this.threadStock = new Thread(runnable);
				MYFORM.this.threadStock.start();
			}
		});
		this.tglbtnShowList.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (MYFORM.this.tglbtnShowList.isSelected()) {
					MYFORM.this.tglbtnShowList.setText("S");
				} else {
					MYFORM.this.tglbtnShowList.setText("H");
				}

			}
		});
		this.tglbtnShowHistory.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				MYFORM.this.tglbtnShowHistory.setSelected(true);
				double steps = (double) e.getWheelRotation();
				if (steps == 1.0D) {
					if (MYFORM.this.showme >= 4) {
						--MYFORM.this.showme;
					}
				} else {
					++MYFORM.this.showme;
					if (MYFORM.this.showme > 6) {
						MYFORM.this.showme = 3;
					}
				}

				MYFORM.this.hien_danhSach_lenh = true;
				MYFORM.this.tglbtnShowHistory.setText("PS ON " + String.valueOf(MYFORM.this.showme));
			}
		});
		this.tglbtnShowHistory.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				try {
					if (MYFORM.this.tglbtnShowHistory.isSelected()) {
						MYFORM.this.tglbtnShowHistory.setText("PS ON");
					} else {
						MYFORM.this.tglbtnShowHistory.setText("PS OFF");
					}
				} catch (Exception var3) {
				}

			}
		});
		this.btnHuyHD.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				MYFORM.this.btnHuyHD.setBackground(Color.PINK);
			}

			public void mouseExited(MouseEvent e) {
				MYFORM.this.btnHuyHD.setBackground(Color.WHITE);
			}
		});
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setForeground(Color.WHITE);
		verticalStrut.setBounds(246, 94, -64, 118);
		frmRubbyMoney.getContentPane().add(verticalStrut);
		this.mua_break_count = true;
		this.ban_break_count = true;
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.WHITE);
		separator.setForeground(Color.ORANGE);
		separator.setBounds(450, 167, 109, -10);
		frmRubbyMoney.getContentPane().add(separator);
		this.action_break = true;
		this.lblinfo.setBounds(394, 339, 99, 20);
		frmRubbyMoney.getContentPane().add(this.lblinfo);
		this.lblinfo.setHorizontalAlignment(0);
		this.lblinfo.setForeground(Color.BLACK);
		this.M1 = 1.5D;
	}

	public void ActionMua() throws AWTException {
		try {
			Robot r = new Robot();
			r.mouseMove(this.CFB_X + 90, this.CFB_Y);
			r.mousePress(1024);
			r.mouseRelease(1024);
			r.delay(50);
		} catch (AWTException var2) {
			var2.printStackTrace();
		}

	}

	public void ActionMuaKhop() throws AWTException {
		try {
			Robot r = new Robot();
			r.mouseMove(this.GIA_X, this.GIA_Y);
			r.mousePress(1024);
			r.mouseRelease(1024);
			r.delay(50);
			r.mouseMove(this.MUA_X, this.MUA_Y + 16);
			r.delay(50);
			r.mousePress(1024);
			r.delay(50);
			r.mouseRelease(1024);
			r.delay(50);
			r.mouseMove(this.CFM_X, this.CFM_Y);
			r.mousePress(1024);
			r.mouseRelease(1024);
		} catch (AWTException var3) {
			var3.printStackTrace();
		}

	}

	public void ActionBan() throws AWTException {
		try {
			Robot r = new Robot();
			r.mouseMove(this.CFB_X, this.CFB_Y);
			r.mousePress(1024);
			r.mouseRelease(1024);
		} catch (AWTException var3) {
			var3.printStackTrace();
		}

	}

	public void ActionBanKhop() throws AWTException {
		try {
			Robot r = new Robot();
			r.mouseMove(this.GIA_X, this.GIA_Y);
			r.mousePress(1024);
			r.mouseRelease(1024);
			r.delay(50);
			r.mouseMove(this.BAN_X, this.BAN_Y + 16);
			r.delay(50);
			r.mousePress(1024);
			r.delay(50);
			r.mouseRelease(1024);
			r.delay(50);
			r.mouseMove(this.CFB_X, this.CFB_Y);
			r.mousePress(1024);
			r.mouseRelease(1024);
		} catch (AWTException var3) {
			var3.printStackTrace();
		}

	}

	public void Order(String Action, float Gia, Double Num) {
		this.js.executeScript("document.getElementById('sohopdong').value=" + this.SHD.getText() + ";", new Object[0]);
		WebElement Click;
		if (Action == "M") {
			System.out.println("mua");
			this.js.executeScript(
					"document.getElementById('right_price').value=" + this.df.format((double) Gia + Num) + ";",
					new Object[0]);
			this.js.executeScript("arguments[0].click();", new Object[] { this.MuaButton });
			System.out.println("GIA_BAN :" + this.df.format((double) this.GIA_MUA_REAL));
			Click = this.driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
			this.js.executeScript("arguments[0].click();", new Object[] { Click });
		}

		if (Action == "B") {
			System.out.println("ban");
			this.js.executeScript(
					"document.getElementById('right_price').value=" + this.df.format((double) Gia - Num) + ";",
					new Object[0]);
			this.js.executeScript("arguments[0].click();", new Object[] { this.BanButton });
			System.out.println("GIA_BAN :" + this.df.format((double) this.GIA_MUA_REAL));
			Click = this.driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
			this.js.executeScript("arguments[0].click();", new Object[] { Click });
		}

	}

	public void Order_special(String Action, String lenh) {
		this.MuaButton = this.driverVPS.findElement(By.xpath(this.Muaxpath));
		this.BanButton = this.driverVPS.findElement(By.xpath(this.Banxpath));
		WebElement elementMAK = this.driverVPS.findElement(By.xpath(this.MAKxpath));
		this.js.executeScript("document.getElementById('sohopdong').value=" + this.SHD.getText() + ";", new Object[0]);
		if (Action == "M") {
			System.out.println("mua dac biet");
			if (lenh == "MAK") {
				this.js.executeScript("arguments[0].click();", new Object[] { elementMAK });
				this.js.executeScript("arguments[0].click();", new Object[] { this.MuaButton });
			}

			if (lenh == "MTL") {
				this.js.executeScript("arguments[0].click();", new Object[] { elementMAK });
				this.js.executeScript("arguments[0].click();", new Object[] { this.MuaButton });
			}
		}

		if (Action == "B") {
			System.out.println("ban lenh dac biet");
			if (lenh == "MAK") {
				this.js.executeScript("arguments[0].click();", new Object[] { elementMAK });
				this.js.executeScript("arguments[0].click();", new Object[] { this.BanButton });
			}

			if (lenh == "MTL") {
				this.js.executeScript("arguments[0].click();", new Object[] { elementMAK });
				this.js.executeScript("arguments[0].click();", new Object[] { this.BanButton });
			}
		}

		this.MK = !this.MK;
	}

	public void Order_Rai(String Action, float Gia, Double Num) {
		WebElement gia_VPS = this.driverVPS.findElement(By.xpath("//*[@id=\"modal_price\"]"));
		this.js.executeScript("document.getElementById('sohopdong').value=" + this.SHD.getText() + ";", new Object[0]);
		WebElement element;
		WebElement Click;
		if (Action == "MR") {
			System.out.println("mua rai");
			this.js.executeScript(
					"document.getElementById('right_price').value=" + this.df.format((double) Gia - Num) + ";",
					new Object[0]);
			element = gia_VPS.findElement(By.xpath("//*[@id=\"orderPS\"]/div[2]/button"));
			this.js.executeScript("arguments[0].click();", new Object[] { element });
			System.out.println("GIA_BAN :" + this.df.format((double) this.GIA_MUA_REAL));
			Click = this.driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
			this.js.executeScript("arguments[0].click();", new Object[] { Click });
		} else {
			System.out.println("ban rai");
			this.js.executeScript(
					"document.getElementById('right_price').value=" + this.df.format((double) Gia + Num) + ";",
					new Object[0]);
			element = gia_VPS.findElement(By.xpath("//*[@id=\"orderPS\"]/div[1]/button"));
			this.js.executeScript("arguments[0].click();", new Object[] { element });
			System.out.println("GIA_BAN :" + this.df.format((double) this.GIA_MUA_REAL));
			Click = this.driverVPS.findElement(By.xpath("//*[@id=\"acceptCreateOrder\"]"));
			this.js.executeScript("arguments[0].click();", new Object[] { Click });
		}

	}

	public void inputNum(Robot robot, String number) throws AWTException {
		char c;
		int i = 0;

		for (int n = number.length(); i < n; ++i) {
			c = number.charAt(i);
			switch (c) {
			case '.':
				robot.keyPress(46);
			case '/':
			case ':':
			case ';':
			case '<':
			case '=':
			case '>':
			case '?':
			case '@':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case '[':
			case '\\':
			case ']':
			case '^':
			case '_':
			case '`':
			default:
				break;
			case '0':
				robot.keyPress(48);
				robot.keyRelease(48);
				break;
			case '1':
				robot.keyPress(49);
				robot.keyRelease(49);
				break;
			case '2':
				robot.keyPress(50);
				robot.keyRelease(50);
				break;
			case '3':
				robot.keyPress(51);
				robot.keyRelease(51);
				break;
			case '4':
				robot.keyPress(52);
				break;
			case '5':
				robot.keyPress(53);
				break;
			case '6':
				robot.keyPress(54);
				break;
			case '7':
				robot.keyPress(55);
				break;
			case '8':
				robot.keyPress(56);
				break;
			case '9':
				robot.keyPress(57);
				break;
			case 'a':
				robot.keyPress(65);
				robot.keyRelease(65);
				break;
			case 'b':
				robot.keyPress(66);
				robot.keyRelease(66);
				break;
			case 'c':
				robot.keyPress(67);
				robot.keyRelease(67);
				break;
			case 'd':
				robot.keyPress(68);
				robot.keyRelease(68);
				break;
			case 'e':
				robot.keyPress(69);
				robot.keyRelease(69);
				break;
			case 'f':
				robot.keyPress(70);
				robot.keyRelease(70);
				break;
			case 'g':
				robot.keyPress(71);
				robot.keyRelease(71);
				break;
			case 'h':
				robot.keyPress(72);
				robot.keyRelease(72);
				break;
			case 'i':
				robot.keyPress(73);
				robot.keyRelease(73);
				break;
			case 'j':
				robot.keyPress(74);
				robot.keyRelease(74);
				break;
			case 'k':
				robot.keyPress(75);
				robot.keyRelease(75);
				break;
			case 'l':
				robot.keyPress(76);
				robot.keyRelease(76);
				break;
			case 'm':
				robot.keyPress(77);
				robot.keyRelease(77);
				break;
			case 'n':
				robot.keyPress(78);
				robot.keyRelease(78);
				break;
			case 'o':
				robot.keyPress(79);
				robot.keyRelease(79);
				break;
			case 'p':
				robot.keyPress(80);
				robot.keyRelease(80);
				break;
			case 'q':
				robot.keyPress(81);
				robot.keyRelease(81);
				break;
			case 'r':
				robot.keyPress(82);
				robot.keyRelease(82);
				break;
			case 's':
				robot.keyPress(83);
				robot.keyRelease(83);
				break;
			case 't':
				robot.keyPress(84);
				robot.keyRelease(84);
				break;
			case 'u':
				robot.keyPress(85);
				robot.keyRelease(85);
				break;
			case 'v':
				robot.keyPress(86);
				robot.keyRelease(86);
				break;
			case 'w':
				robot.keyPress(87);
				robot.keyRelease(87);
				break;
			case 'x':
				robot.keyPress(88);
				robot.keyRelease(88);
				break;
			case 'y':
				robot.keyPress(89);
				robot.keyRelease(89);
			}
		}

	}

	public void nativeKeyPressed(NativeKeyEvent e) {
		File element;

		BufferedReader cRight;
		String MRight;
		int my;

		if (e.getKeyCode() == 42) {
			this.autock = !this.autock;
			if (this.autock) {
				this.lblTB.setText("AUTO");
			} else {
				this.lblTB.setText("UN_AUTO");
			}
		}

		if (e.getKeyCode() == 57 && this.enableKeyBoard) {
			if (this.enableKeyBoard) {
				this.lblTB.setForeground(Color.GREEN);
				this.lblTB.setText("MUA");
				this.js.executeScript("document.getElementById('sohopdong').value=" + this.SHD.getText() + ";",
						new Object[0]);

				try {
					if (this.textGiaKhop.getText() != "") {
						this.js.executeScript(
								"document.getElementById('right_price').value="
										+ this.df.format(Double.valueOf(this.textGiaKhop.getText())) + ";",
								new Object[0]);
					}
				} catch (NumberFormatException var10) {
				}

				this.MuaButton = this.driverVPS.findElement(By.xpath(this.Muaxpath));
				this.js.executeScript("arguments[0].click();", new Object[] { this.MuaButton });
				this.hien_danhSach_lenh = true;
				this.lblTB.setForeground(Color.ORANGE);
			} else {
				this.lblTB.setText("Keyboard disable");
			}
		}

		JavascriptExecutor js;

		if (e.getKeyCode() == 16 && this.enableKeyBoard) {
			js = (JavascriptExecutor) this.driverStock;
			frmRubbyMoney.setTitle("Java loading ....");
			frmRubbyMoney.setBounds(100, 100, 484, 130);
			frmRubbyMoney.setLocation(900, 600);
			this.SHD.setBounds(303, 42, 30, 20);
			this.txtAuto.setBounds(303, 68, 30, 20);
			WebElement pic = this.driverStock.findElement(By.xpath("//*[@id=\"pic\"]"));
			js.executeScript("arguments[0].style.display='block'", new Object[] { pic });
			js.executeScript("arguments[0].scrollIntoView();", new Object[] { pic });
		}

		if (e.getKeyCode() == 17 && this.enableKeyBoard) {
			js = (JavascriptExecutor) this.driverStock;
			js.executeScript("window.scrollBy(0,50)", new Object[] { "" });
		}

		if (e.getKeyCode() == 15 && this.enableKeyBoard) {
			this.showtradeview = !this.showtradeview;
			if (this.showtradeview) {
				this.tglbtnShowChart.setText("S");
				this.tglbtnShowChart.setSelected(true);
			} else {
				this.showtradeview = false;
				this.tglbtnShowChart.setSelected(false);
				this.tglbtnShowChart.setText("H");
			}
		}

		if (e.getKeyCode() == 32 && this.enableKeyBoard) {
			this.btnAction.setLocation(this.BStart_X, this.BStart_Y);
			this.btnAction.setForeground(Color.BLACK);
			if (this.actionChoice.equals("Mua")) {
				this.btnAction.setForeground(Color.BLUE);
				this.btnAction.setText("Reset");
			}

			if (this.actionChoice.equals("Ban")) {
				this.btnAction.setForeground(new Color(139, 0, 0));
				this.btnAction.setText("Reset");
			}

			this.CountAction = 0;
		}

		if (e.getKeyCode() == 56 && this.enableKeyBoard) {
			this.btnHuyHD.doClick();
			if (!this.tglbtnShowHistory.isSelected()) {
				this.tglbtnShowHistory.doClick();
			}
		}

		if (e.getKeyCode() == 58 && this.enableKeyBoard) {

			WebElement pic = null;

			cRight = null;
			MRight = null;
			this.showchart = !this.showchart;

			try {
				if (this.showtradeview) {
					js = (JavascriptExecutor) this.driverStock;
					WebElement element1 = this.driverStock.findElement(By.id("parent"));
					pic = this.driverStock.findElement(By.id("pic"));
					if (this.showchart) {
						if (this.typeChart == 1) {
							frmRubbyMoney.setTitle("Rubby money");
							frmRubbyMoney.setBounds(100, 100, 484, 288);
							frmRubbyMoney.setLocation(550, 350);
							this.SHD.setBounds(303, 95, 30, 20);
							this.lblTB.setLocation(1, 30);
							this.tglbtnAuto.setLocation(147, 124);
							this.SHD.setLocation(371, 95);
							this.txtAuto.setLocation(371, 119);
							this.panel_info.setLocation(400, 201);
							js.executeScript("window.scrollBy(0,-50)", new Object[] { "" });
						} else {
							frmRubbyMoney.setTitle("Rubby money");
							frmRubbyMoney.setBounds(100, 250, 484, 288);
							frmRubbyMoney.setLocation(700, 250);
							this.lblTB.setLocation(1, 30);
							this.tglbtnAuto.setLocation(147, 124);
							this.SHD.setLocation(371, 95);
							this.txtAuto.setLocation(371, 119);
							this.panel_info.setLocation(400, 201);
						}
					} else {
						frmRubbyMoney.setTitle("Java loading ....");
						frmRubbyMoney.setBounds(100, 100, 484, 130);
						frmRubbyMoney.setLocation(888, 603);
						this.lblTB.setLocation(14, 61);
						this.tglbtnAuto.setLocation(23, 30);
						this.SHD.setLocation(371, 44);
						this.txtAuto.setLocation(371, 65);
						this.panel_info.setLocation(400, 38);
					}

					if (this.showchart) {
						if (this.typeChart == 1) {
							js.executeScript("arguments[0].style.visibility='visible'", new Object[] { element1 });
							js.executeScript("arguments[0].style.display='none'", new Object[] { pic });
							js.executeScript("arguments[0].scrollIntoView();", new Object[] { element1 });
							js.executeScript("window.scrollBy(0,-50)", new Object[] { "" });
						}

						if (this.typeChart == 2) {
							js.executeScript("arguments[0].style.visibility='visible'", new Object[] { element1 });
							js.executeScript("arguments[0].style.display='none'", new Object[] { pic });
							js.executeScript("arguments[0].scrollIntoView();", new Object[] { MRight });
						}

						if (this.typeChart == 3) {
							js.executeScript("arguments[0].style.visibility='visible'", new Object[] { element1 });
							js.executeScript("arguments[0].style.display='none'", new Object[] { pic });
							js.executeScript("arguments[0].scrollIntoView();", new Object[] { MRight });
						}

						this.btnshow.setText(this.showchart ? "hide" : "show");
					} else {
						js.executeScript("arguments[0].style.visibility='hidden'", new Object[] { element1 });
						js.executeScript("arguments[0].style.display='block'", new Object[] { pic });
						js.executeScript("arguments[0].scrollIntoView();", new Object[] { pic });
					}
				} else if (!this.showchart) {
					System.out.println("2");
					frmRubbyMoney.setTitle("Java loading ....");
					frmRubbyMoney.setBounds(100, 100, 484, 130);
					frmRubbyMoney.setLocation(888, 603);
					this.lblTB.setLocation(14, 61);
					this.tglbtnAuto.setLocation(23, 30);
					this.SHD.setLocation(371, 44);
					this.txtAuto.setLocation(371, 65);
					this.panel_info.setLocation(400, 38);
				} else {
					frmRubbyMoney.setTitle("Rubby money");
					frmRubbyMoney.setBounds(100, 250, 484, 288);
					frmRubbyMoney.setLocation(870, 450);
					this.lblTB.setLocation(1, 30);
					this.tglbtnAuto.setLocation(147, 124);
					this.SHD.setLocation(371, 95);
					this.txtAuto.setLocation(371, 119);
					this.panel_info.setLocation(400, 201);
				}
			} catch (NoSuchElementException var9) {
				var9.printStackTrace();
			}
		}

		if (e.getKeyCode() == 3640) {
			this.enableKeyBoard = !this.enableKeyBoard;
			if (this.enableKeyBoard) {
				this.lblTB.setText("keyboard active");
				this.panelKey.setVisible(true);
				frmRubbyMoney.addWindowFocusListener(new WindowAdapter() {
					public void windowGainedFocus(WindowEvent e) {
						System.out.println("WindowFocusListener method called: windowGainedFocus.");
					}

					public void windowLostFocus(WindowEvent e) {
						if (e.getNewState() != 202) {
							MYFORM.frmRubbyMoney.setAlwaysOnTop(false);
							MYFORM.frmRubbyMoney.setAlwaysOnTop(true);
							System.out.println("focus lost");
						}

					}
				});
			} else {
				this.lblTB.setText("dis-keyboard ");
				this.panelKey.setVisible(false);
			}
		}

		if (e.getKeyCode() == 18 && this.enableKeyBoard) {
			int x = frmRubbyMoney.getLocation().x;
			int y = frmRubbyMoney.getLocation().y;
			PointerInfo a = MouseInfo.getPointerInfo();
			Point b = a.getLocation();
			int mx = (int) b.getX();
			my = (int) b.getY();
			if (mx >= x + 95 && my >= y + 31) {
				this.btnAction.setForeground(Color.BLACK);
				this.btnAction.setText("clear");
				System.out.println("reset");
				this.CountAction = 1;
			}
		}

		if (e.getKeyCode() == 30 && this.enableKeyBoard) {
			this.dongbang = !this.dongbang;
			if (this.dongbang) {
				this.lblTB1.setForeground(new Color(245, 247, 227));
				this.lblTB1.setText("Dong Bang");
			} else {
				this.lblTB1.setForeground(Color.ORANGE);
				this.lblTB1.setText("Khong Dong Bang");
			}
		}

		if (e.getKeyCode() == 31 && this.enableKeyBoard) {
			this.lblTB.setText("Dong");
			if (this.tontaiHD != 0) {
				this.js.executeScript("document.getElementById('sohopdong').value=" + this.SHD.getText() + ";",
						new Object[0]);

				try {
					if (this.textGiaKhop.getText() != "") {
						this.js.executeScript(
								"document.getElementById('right_price').value="
										+ this.df.format(Double.valueOf(this.textGiaKhop.getText())) + ";",
								new Object[0]);
					}
				} catch (NumberFormatException var8) {
				}

				if (this.tontaiHD == 1) {
					this.MuaButton = this.driverVPS.findElement(By.xpath(this.Muaxpath));
					this.js.executeScript("arguments[0].click();", new Object[] { this.MuaButton });
					this.lblTB.setText("long line : 2630");
				}

				if (this.tontaiHD == 2) {
					this.BanButton = this.driverVPS.findElement(By.xpath(this.Banxpath));
					this.js.executeScript("arguments[0].click();", new Object[] { this.BanButton });
					this.lblTB.setText("short line : 2635");
				}

				if (!this.tglbtnShowHistory.isSelected()) {
					this.hien_danhSach_lenh = false;
					this.tglbtnShowHistory.doClick();
				}
			} else {
				this.lblTB.setText("Khong ton tai");
			}
		}

	}

	public void nativeMouseWheelMoved(NativeMouseWheelEvent arg0) {
	}

	public void nativeMouseMoved(NativeMouseEvent arg0) {
		int MIN = 29;
		int MAX = 329;
		boolean next = false;
		boolean back = false;
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int chieudai = 64;
		if (this.CountAction == 1 && !this.switchStep) {
			try {
				int khoan_cach = (int) b.getX() - this.MStart_X;
				if (khoan_cach < 400 && khoan_cach > 0) {
					Double cuongDo = Double.valueOf(b.getX()) - (double) this.MStart_X;
					this.btnAction.setLocation(this.BStart_X + khoan_cach, this.BStart_Y);
					this.lblShow.setLocation(this.BStart_X + khoan_cach + chieudai, this.BStart_Y + 1);
					this.Count_Step = cuongDo / 7.0D;
					this.Count_Step = this.Count_Step / 10.0D;
					if (this.actionChoice.equals("Mua")) {
						this.lblShow.setForeground(Color.GREEN);
						this.Action_Price = Double.parseDouble(this.txtAction_Price) - this.Count_Step;
					}

					if (this.actionChoice.equals("Ban")) {
						this.Action_Price = Double.parseDouble(this.txtAction_Price) + this.Count_Step;
						this.lblShow.setForeground(Color.RED);
					}

					this.lblShow.setVisible(true);
					this.lblShow.setText(String.valueOf(this.df.format(this.Action_Price)));
				}
			} catch (NumberFormatException var13) {
				this.txtAction_Price = "0.0";
			}
		}

		if (this.btnAction.getBounds().x > MAX) {
			this.switchStep = true;
			next = true;
			this.MEnd_X = (int) b.getX();
			this.MEnd_Y = (int) b.getY();
			this.txtAction_Price = this.lblShow.getText();
			this.btnAction.setLocation(this.BStart_X, this.BStart_Y);
			this.lblTB1.setText("next round");
			this.lblShow.setLocation(this.BStart_X + chieudai, this.BStart_Y);

			try {
				Robot r = new Robot();
				r.mouseMove(this.MStart_X, this.MStart_Y);
			} catch (Exception var12) {
			}

			this.switchStep = false;
		}

	}

	public void nativeKeyReleased(NativeKeyEvent arg0) {
	}

	public void nativeKeyTyped(NativeKeyEvent arg0) {
	}

	public void nativeMouseDragged(NativeMouseEvent arg0) {
	}

	private static void activate(int pid) throws IOException {
		String pathname = System.getProperty("java.io.tmpdir") + "WindowSwintcherAppActivate.vbs";
		File file = new File(pathname);
		if (!file.exists()) {
			String var3 = "set WshShell = CreateObject(\"WScript.Shell\")\nWshShell.AppActivate Wscript.Arguments(0)";
		}

		Runtime.getRuntime().exec("cscript " + pathname + " " + pid);
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
			if (!this.driverStock.findElement(By.xpath(StrInput)).isDisplayed()) {
				this.lblCheck.setText("StrInput");
				Result = false;
			}

			if (!this.driverStock.findElement(By.xpath(StrMACD)).isDisplayed()) {
				this.lblCheck.setText("StrMACD");
				Result = false;
			}

			if (!this.driverStock.findElement(By.xpath(StrRSI)).isDisplayed()) {
				this.lblCheck.setText("StrRSI");
				Result = false;
			}

			if (!this.driverStock.findElement(By.xpath(StrMAROSS)).isDisplayed()) {
				this.lblCheck.setText("StrMAROSS");
				Result = false;
			}

			if (!this.driverStock.findElement(By.xpath(StrClose)).isDisplayed()) {
				this.lblCheck.setText("StrClose");
				Result = false;
			}
		} catch (NoSuchElementException var14) {
			this.lblCheck.setText("NoElement");
			this.driverStock.navigate().refresh();
			JavascriptExecutor jss = (JavascriptExecutor) this.driverStock;
			WebElement left = this.driverStock.findElement(By.xpath("//*[@id=\"left\"]"));
			WebElement right = this.driverStock.findElement(By.xpath("//*[@id=\"right\"]"));
			jss.executeScript("arguments[0].style.height = '" + String.valueOf(this.heightL - 300) + "px'",
					new Object[] { left });
			jss.executeScript("arguments[0].style.height = '" + String.valueOf(this.heightR - 300) + "px'",
					new Object[] { right });
			jss.executeScript("arguments[0].style.height = '" + String.valueOf(this.heightL - 300) + "px'",
					new Object[] { left });
			jss.executeScript("arguments[0].style.height = '" + String.valueOf(this.heightR - 300) + "px'",
					new Object[] { left });
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
		this.driverStock.switchTo().defaultContent();
		this.driverStock.switchTo().frame(F1);
		this.driverStock.switchTo().frame(F2);
		this.setupBackground(typeColor);
		this.driverStock.findElement(By.id("header-toolbar-indicators")).click();

		try {
			Thread.sleep(100L);
			this.driverStock.findElement(By.xpath(StrInput)).click();
			Thread.sleep(100L);
			this.driverStock.findElement(By.xpath(StrMACD)).click();
			Thread.sleep(50L);
			this.driverStock.findElement(By.xpath(StrRSI)).click();
			Thread.sleep(50L);
			this.driverStock.findElement(By.xpath(StrMAROSS)).click();
			Thread.sleep(50L);
			this.driverStock.findElement(By.xpath(StrClose)).click();
			Thread.sleep(50L);
			if (F1 == "iframe_left") {
				this.driverStock.findElement(By.id("header-toolbar-intervals")).click();
				this.driverStock.findElement(By.xpath(Str_5Minute)).click();
			}

			if (F1 == "iframe_right") {
				this.driverStock.findElement(By.id("header-toolbar-intervals")).click();
				this.driverStock.findElement(By.xpath(Str_1Minute)).click();
			}

			this.driverStock.switchTo().defaultContent();
		} catch (InterruptedException var13) {
			var13.printStackTrace();
		}

	}

	private void setupBackground(int typeColor) {
		this.driverStock.findElement(By.id("header-toolbar-properties")).click();
		this.driverStock.switchTo().activeElement();

		try {
			Thread.sleep(500L);
			this.driverStock.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/a[3]")).click();
			this.driverStock
					.findElement(
							By.xpath("/html/body/div[4]/div[4]/div[4]/div/div[1]/table/tbody/tr[1]/td[2]/span/input"))
					.click();
			this.driverStock.findElement(By.xpath("/html/body/div[5]/div[1]/table[1]/tbody/tr/td[1]")).click();
			Thread.sleep(500L);
			this.driverStock
					.findElement(
							By.xpath("/html/body/div[4]/div[4]/div[4]/div/div[1]/table/tbody/tr[2]/td[2]/span/input"))
					.click();
			this.driverStock.findElement(By.xpath("/html/body/div[5]/div[1]/table[1]/tbody/tr/td[1]")).click();
			Thread.sleep(500L);
			this.driverStock
					.findElement(
							By.xpath("/html/body/div[4]/div[4]/div[4]/div/div[1]/table/tbody/tr[3]/td[2]/span/input"))
					.click();
			this.driverStock.findElement(By.xpath("/html/body/div[5]/div[1]/table[1]/tbody/tr/td[1]")).click();
			Thread.sleep(500L);
			this.driverStock.findElement(By.xpath("/html/body/div[4]/div[4]/div[6]/div/a[2]")).click();
		} catch (InterruptedException var3) {
			var3.printStackTrace();
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
		} catch (Exception var4) {
		}

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					this.showMenu(e);
				}

			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					this.showMenu(e);
				}

			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, int timeoutInSeconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, (long) timeoutInSeconds);
		webDriverWait.withTimeout((long) timeoutInSeconds, TimeUnit.SECONDS);

		try {
			webDriverWait.until(waitCondition);
		} catch (Exception var5) {
			System.out.println(var5.getMessage());
		}

	}

	public static void untilPageLoadComplete(WebDriver driver, int i) {
		until(driver, (d) -> {
			Boolean isPageLoaded = ((JavascriptExecutor) driver)
					.executeScript("return document.readyState", new Object[0]).equals("complete");
			if (!isPageLoaded) {
				try {
					frmRubbyMoney.setTitle("Document is loading");
				} catch (Exception var4) {
					var4.printStackTrace();
				}
			}

			return isPageLoaded;
		}, i);
	}

	class ColoringCellRenderer extends DefaultTableCellRenderer {
		private final Map<Point, Color> cellColors = new HashMap();

		void setCellColor(int r, int c, Color color) {
			if (color == null) {
				this.cellColors.remove(new Point(r, c));
			} else {
				this.cellColors.put(new Point(r, c), color);
			}

		}

		private Color getCellColor(int r, int c) {
			Color color = (Color) this.cellColors.get(new Point(r, c));
			return color == null ? new Color(241, 243, 246) : color;
		}

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			Color color = this.getCellColor(row, column);
			this.setBackground(color);
			Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			if (isSelected) {
				c.setBackground(Color.WHITE);
			}

			return this;
		}
	}

	class ColumnColorRenderer extends DefaultTableCellRenderer {
		private static final long serialVersionUID = 1L;
		Color backgroundColor;
		Color foregroundColor;

		public ColumnColorRenderer(Color backgroundColor, Color foregroundColor) {
			this.backgroundColor = backgroundColor;
			this.foregroundColor = foregroundColor;
		}

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			cell.setBackground(this.backgroundColor);
			cell.setForeground(this.foregroundColor);
			return cell;
		}
	}

	public class ImagePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		private BufferedImage image;

		public ImagePanel(BufferedImage image) {
			this.image = image;
		}

		public BufferedImage getImage() {
			return this.image;
		}

		public void paint(Graphics g) {
			g.drawImage(this.image, 0, 0, this);
		}

		public void loadOriginalImage(File file) {
			try {
				this.image = ImageIO.read(file);
			} catch (IOException var3) {
				var3.printStackTrace();
			}

		}

		public void createArtWork(String path) {
			if (this.image != null) {
				try {
					Graphics g = this.image.getGraphics();
					g.setColor(Color.red);
					g.drawString("Picture speaks thousand words", 50, 50);
					g.drawImage(ImageIO.read(new File(path)), 120, 100, (ImageObserver) null);
				} catch (IOException var3) {
					var3.printStackTrace();
				}

			}
		}
	}

	class LbBlink implements ActionListener {
		private JLabel label;
		String mau;
		private Color cor2;
		private int count;

		public String getMau() {
			return this.mau;
		}

		public void setMau(String mau) {
			this.mau = mau;
		}

		public LbBlink(JLabel label, String mau) {
			this.cor2 = Color.WHITE;
			this.count = 1;
			this.label = label;
			this.mau = mau;
		}

		public int getCount() {
			return this.count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public void actionPerformed(ActionEvent e) {
			++this.count;
			if (this.count > 4) {
				this.label.setForeground(Color.ORANGE);
				MYFORM.this.lblTB.setText("");
				MYFORM.this.timerLB.stop();
			}

			if (this.count % 2 == 0) {
				if (this.mau == "green") {
					this.label.setForeground(Color.GREEN);
				}

				if (this.mau == "red") {
					this.label.setForeground(Color.RED);
				}
			} else {
				this.label.setForeground(this.cor2);
			}

		}
	}

	class StockListRenderer extends DefaultTableCellRenderer {
		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			TableColumn tColumn1 = MYFORM.this.tableHistory.getColumnModel().getColumn(1);
			TableColumn tColumn2 = MYFORM.this.tableHistory.getColumnModel().getColumn(2);
			TableColumn tColumn3 = MYFORM.this.tableHistory.getColumnModel().getColumn(3);
			TableColumn tColumn4 = MYFORM.this.tableHistory.getColumnModel().getColumn(4);
			TableColumn tColumn5 = MYFORM.this.tableHistory.getColumnModel().getColumn(5);
			TableColumn tColumn6 = MYFORM.this.tableHistory.getColumnModel().getColumn(6);
			TableColumn tColumn7 = MYFORM.this.tableHistory.getColumnModel().getColumn(7);
			tColumn1.setCellRenderer(MYFORM.this.new ColumnColorRenderer(Color.BLACK, Color.WHITE));
			tColumn2.setCellRenderer(MYFORM.this.new ColumnColorRenderer(Color.BLACK, Color.WHITE));
			tColumn4.setCellRenderer(MYFORM.this.new ColumnColorRenderer(Color.BLACK, Color.WHITE));
			tColumn5.setCellRenderer(MYFORM.this.new ColumnColorRenderer(Color.BLACK, Color.WHITE));
			tColumn6.setCellRenderer(MYFORM.this.new ColumnColorRenderer(new Color(105, 105, 105), Color.WHITE));
			tColumn7.setCellRenderer(MYFORM.this.new ColumnColorRenderer(new Color(105, 105, 105), Color.WHITE));
			Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			Object obj = MYFORM.this.tableHistory.getModel().getValueAt(row, 2);
			if (Double.valueOf(obj.toString()) < 0.0D) {
				c.setForeground(Color.RED);
			} else if (Double.valueOf(obj.toString()) == 0.0D) {
				c.setForeground(Color.YELLOW);
			} else if (Double.valueOf(obj.toString()) > 0.0D) {
				c.setForeground(Color.GREEN);
			}

			c.setFont(new Font("Helvetica Bold", 0, 9));
			c.setBackground(Color.BLACK);
			return c;
		}
	}

	class StockPSRenderer extends DefaultTableCellRenderer {
		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			Object obj = MYFORM.this.tableHistory.getModel().getValueAt(row, column);
			if (obj.toString().equalsIgnoreCase("SHORT")) {
				c.setForeground(Color.RED);
			} else if (obj.toString().equalsIgnoreCase("LONG")) {
				c.setForeground(Color.GREEN);
			} else {
				c.setForeground(Color.BLACK);
			}

			c.setFont(new Font("Helvetica Bold", 0, 9));
			c.setBackground(Color.WHITE);
			return c;
		}
	}

	public interface User32 extends StdCallLibrary {
		MYFORM.User32 INSTANCE = (MYFORM.User32) Native.loadLibrary("user32", MYFORM.User32.class);

		boolean EnumWindows(WNDENUMPROC var1, Pointer var2);

		int GetWindowTextW(HWND var1, char[] var2, int var3);

		boolean ShowWindow(HWND var1, int var2);

		int GetWindowThreadProcessId(HWND var1, IntByReference var2);
	}
}