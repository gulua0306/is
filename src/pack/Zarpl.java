package pack; //название пакета pack
/*	указывает пакет "pack", в котором находится файл класса
Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов.*/

// класс для создания интерфейса  РАСЧЕТ ЗАРПЛАТЫ

import javax.swing.*; // библиотека для графического интерфейса
import java.awt.event.*; 
import java.awt.*; 
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете j ava.
Подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
В отличие от java.awt, javax.swing имеет более гибкую систему управления
и более широкий набор функций  	
Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
*/

public class Zarpl extends JPanel { /*	(Public)модификатор доступа, который позволяет программисту управлять видимостью любого метода и любой переменной. 
	В данном случае модификатор доступа public означает, что класс Zarpl виден и доступен любому классу.
		В этой строке использовано зарезервированное слово class. 
		Оно говорит транслятору, что мы собираемся описать новый класс Zarpl.
		описываем Otp как класс доступный другим классам (public)
	класс наследует функции элемента JPanel (extends jpanel)
	{ <- Полное описание класса располагается между открывающей
	фигурной скобкой в первой строке и парной ей закрывающей фигурной скобкой -> } 
		 */
	
	
    // объявление компонентов на уровне класса
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel DanZarp, PokazZarp; /* 	объявляем Панели (JPanel), доступные только внутри класса (private). 
	DanZarp - панель которая содержит надписи и строки: .......
	в которые пользователь должен ввести данные. 
 	PokazOtp - панель которая содержит внутри кнопку 
 	"Рассчитать зарплату" которая описанная ниже
 	*/   
	private JButton PokazRasBut; /* объявляем кнопку (будет находится на панел PokazZarp).
    Кнопка PokazRasBut - для показа расчетов о зарплате (при нажатии открывается новое окно 
    в котором можно будет увидеть расчет зарплаты) Доступно только внутри класса (private)*/
	private JLabel Label_1,Label_2,Label_3,Label_4, Label_5,Label_6,Label_7,Label_8,Label_9,Label_10,Label_11,Label_12; /* Объявляем label. Используется для показа текста. Данные поля доступны только внутри класса (private).*/
	public static JTextField Text_oklad,Text_kol_det,Text_do_18,Text_prem, Text_dni, Text_rab_dni; // текстовые поля в которые пользователь вводит данные
	public static JCheckBox Box_3000, Box_500; /* JCheckBox - это название класса Java Swing, который представляет компонент-флажок или чекбокс. 
  	Это компонент, который имеет два состояния включен и выключен. 
  	Причем одно состояние естественно исключает другое. 
  	Соответствующее состояние компонента JCheckBox показывается галочкой. 
  	Если JCheckBox находится во включенном состоянии – галочка отображается, 
  	если в выключенном – галочки нет. 
  	Box_3000 - для обозначения есть ли стандартный вычет в размере 3000руб. Box_500 - в размере 500руб. */
   
    
	public Zarpl()  {  
		/*	Описание метода Zarpl
		метод видим и доступен для других классов (public)
		круглые скобки говорят о том что мы описываем метод и перед ними идет его название
		Внутри скобок можно указать данные (аргумерты или параметры), которые передаются методу
		*/
		
		setLayout (new BorderLayout());/*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.
 		*/
	
		//создаем остальные панели
        DanZarp = new JPanel(); /* панель содержит поля в которые следует ввести данные необходимые для расчета зарплаты 
          = new JPanel():  "=" - оператор присваивания переменной DanZarp функций класса JPanel.
      	Оператор new создает экземпляр указанного класса 
      	JPanel() - класс. Является компонентом-контейнером для содержания других частей интерфейса.*/
        PokazZarp = new JPanel(); // панель содержит кнопку Рассчитать (отдельная панель для кнопки нужна для того чтобы кнопка была посередине)
        
        //установливаем менеджера расположения для панелей
        DanZarp.setLayout(new FlowLayout(FlowLayout.LEFT, 7, 15)); /*setLayout-Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере DanZarp.
      	Менеджер размещения FlowLayout размещает компоненты подобно тому как текстовый редактор располагает слова. 
      	Компоненты располагаются друг за другом слева направо и сверху вниз, начиная с левого верхнего угла. 
      	Если строка заполнена и следующий компонент в ней не помещается, то он переносится на новую строку. 
      	Вокруг каждого компонента оставляется небольшое свободное пространство.
       	Оператор new создает экземпляр указанного класса 
       	7 - горизонтальный отступ, 15 - вертикальный
     	*/
        PokazZarp.setLayout(new GridLayout(1, 1)); /*	setLayout-Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере PokazZarp.
      	Менеджер размещения GridLayout расставляет компоненты в таблицу
      	с заданным в конструкторе числом строк rows и столбцов columns
      	на панели будет 1 строка, 1 столбец,           
       	Это нужно для того чтобы разместить кнопку по центру в плане широты. 
       	Оператор new создает экземпляр указанного класса
     	*/
        
        //добавляем панели DanZarp и PokazZarp на главную панель
        add(DanZarp, BorderLayout.CENTER); /*	add - добавляет указанный компонент DanZarp в контейнер Zarp
      	панель DanZarp, на которой находятся поля ввода текста и поля подписей,
        BorderLayout функция размещения в одной из 5 частей (EAST, WEST, NORTH, SOUTH, CENTER)  
        панель DanZarp находится в центре
    	*/
        add(PokazZarp, BorderLayout.SOUTH);  /*	add - добавляет указанный компонент PokazZarp в контейнер Zarp 
  		панель PokazZarp, на которой находятся поля ввода текста и поля подписей,
    	BorderLayout функция размещения в одной из 5 частей (EAST, WEST, NORTH, SOUTH, CENTER)  
    	панель PokazZarp находится в центре
     	*/
     
        //добавить кнопки и текстовые поля на панели
        //описываем метод добавления кнопок и других компонентов на панели. Метод доступен только в данном классе
        
        //создаем кнопку
    	PokazRasBut = new JButton("Рассчитать заработную плату"); /*	PokazRasBut - кнопка "расчитать данные" 
      	= new JButton():  "=" - оператор присваивания переменной DanZarp функций класса JButton.
      	Оператор new создает экземпляр указанного класса 
      	JButton() - класс. Является компонентом-кнопкой. В скобках указана надпись содержащаяся на кнопке. 
     	*/
    	
        //создать текстовые метки
    	Label_1 = new JLabel("1. Оклад (тарифная ставка):", JLabel.LEFT); 
    	/*	Label_1 - лейбл содержащий надпись "оклад(тарифная ставка)" рядом с текстовым полем
	  	= new JLabel():  "=" - оператор присваивания переменной KolvoLabel функций класса JLabel.
      	Оператор new создает экземпляр указанного класса 
      	JLabel() - класс. Является компонентом-лейблом-областью с обычным текстом. 
      	В скобках указана надпись содержащаяся в этой области. 
	 	*/
    	Label_2 = new JLabel("рублей", JLabel.LEFT); //текст внутри компонента label находится слева
    	Label_3 = new JLabel("2. Количество отработанных дней: ", JLabel.LEFT);
    	Label_4 = new JLabel("3. Количество рабочих дней в месяце: ", JLabel.LEFT);
    	Label_5 = new JLabel("4. Стандартные вычеты", JLabel.LEFT);
    	Label_6 = new JLabel("    5.1. Стандартный вычет на ребенка:", JLabel.LEFT);
    	Label_7 = new JLabel("           Количество детей:", JLabel.LEFT);
    	Label_8 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;из них в возрасте до 18 лет и учащиеся<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; очной формы обучения до 24 лет:</html>", JLabel.LEFT);/*текст в Label написан с помощью html кода. Тег &nbsp; - пробел в html (для отображения отступов). Тег <br> - переход на след.строку*/
    	Label_9 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;4.2. Стандартный вычет в размере 3 000 рублей<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; для лиц, получивших инвалидность</html>", JLabel.LEFT);
    	Label_9.setToolTipText("Подробнее в Налоговом кодексе РФ, статья 218");// всплывающая подсказка при наведении на текст "Стандартный вычет в размере 3000 руб..."
    	Label_10 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;4.3. Стандартный вычет в размере 500 рублей &nbsp;&nbsp; <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  для участников войны, пострадавших от<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  радиации и т.д.", JLabel.LEFT);
    	Label_10.setToolTipText("Подробнее в Налоговом кодексе РФ, статья 218");// всплывающая подсказка при наведении на текст "Стандартный вычет в размере 500 руб..."
    	Label_11 = new JLabel("5. Премиальные в размере ", JLabel.LEFT);
    	Label_12 = new JLabel("%", JLabel.LEFT);
    	/*= new JLabel():  "=" - оператор присваивания переменной KolvoLabel функций класса JLabel.
      	Оператор new создает экземпляр указанного класса 
      	JLabel() - класс. Является компонентом-лейблом-областью с обычным текстом. 
      	В скобках указана надпись содержащаяся в этой области. 
	 	*/
    	
    	
        //создать текстовые поля
    	Text_oklad = new JTextField("", 4);
    	/*	Text_oklad - текстовое поле в которое мы будем вводить размер оклада
		new JTextField():  "=" - оператор присваивания переменной Text_oklad функций класса JTextField.
		Оператор new создает экземпляр указанного класса 
		JTextField() - класс. Является компонентом-текстовым полем.
		4 - размер тектового поля, "" - обозначаем что в данном поле не бует никаких записей 
 		*/
    	Text_oklad.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
    	Text_oklad.setToolTipText("Введите размер оклада в рублях");//всплывающая подсказка при наведении на текстовое поле
    	
    	Text_dni = new JTextField("", 2);    	
    	/*	Text_oklad - текстовое поле в которое мы будем вводить количество отработанных дней
		new JTextField():  "=" - оператор присваивания переменной Text_oklad функций класса JTextField.
		Оператор new создает экземпляр указанного класса 
		JTextField() - класс. Является компонентом-текстовым полем.
		2 - размер тектового поля, "" - обозначаем что в данном поле не бует никаких записей 
 		*/
    	Text_dni.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
    	Text_dni.setToolTipText("Введите количество отработанных дней");//всплывающая подсказка при наведении на текстовое поле
    	
    	Text_rab_dni = new JTextField("", 2);    	
    	/*	Text_oklad - текстовое поле в которое мы будем вводить количество рабочих дней в месяце
		new JTextField():  "=" - оператор присваивания переменной Text_oklad функций класса JTextField.
		Оператор new создает экземпляр указанного класса 
		JTextField() - класс. Является компонентом-текстовым полем.
		2 - размер тектового поля, "" - обозначаем что в данном поле не бует никаких записей 
 		*/
    	Text_rab_dni.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
    	Text_rab_dni.setToolTipText("Введите количество рабочих дней в месяце");//всплывающая подсказка при наведении на текстовое поле
    	
    	Text_kol_det = new JTextField("", 4);    	
    	/*	Text_oklad - текстовое поле в которое мы будем вводить количество детей
		new JTextField():  "=" - оператор присваивания переменной Text_oklad функций класса JTextField.
		Оператор new создает экземпляр указанного класса 
		JTextField() - класс. Является компонентом-текстовым полем.
		4 - размер тектового поля, "" - обозначаем что в данном поле не бует никаких записей 
 		*/
    	Text_kol_det.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
    	Text_kol_det.setToolTipText("<html>Введите количество детей. <br>Если детей нет - введите 0</html>");//всплывающая подсказка при наведении на текстовое поле
    	
    	Text_do_18 = new JTextField("", 4);
    	/*	Text_oklad - текстовое поле в которое мы будем вводить количество дете	 до 18 лет
		new JTextField():  "=" - оператор присваивания переменной Text_oklad функций класса JTextField.
		Оператор new создает экземпляр указанного класса 
		JTextField() - класс. Является компонентом-текстовым полем.
		4 - размер тектового поля, "" - обозначаем что в данном поле не бует никаких записей 
 		*/
    	Text_do_18.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
    	Text_do_18.setToolTipText("<html>Введите количество детей. <br>Если детей нет - введите 0</html>");//всплывающая подсказка при наведении на текстовое поле
    	
    	Text_prem = new JTextField("", 2);    	/*	Text_oklad - текстовое поле в которое мы будем вводить размер премии
		new JTextField():  "=" - оператор присваивания переменной Text_oklad функций класса JTextField.
		Оператор new создает экземпляр указанного класса 
		JTextField() - класс. Является компонентом-текстовым полем.
		4 - размер тектового поля, "" - обозначаем что в данном поле не бует никаких записей 
 		*/
    	Text_prem.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
    	Text_prem.setToolTipText("<html>Введите размер премии. <br>Если премии нет - введите 0</html>");//всплывающая подсказка при наведении на текстовое поле

    	Box_3000 = new JCheckBox(""); /* Создание компонента флажка для стандартного вычета в размере 3000 руб. */
    	Box_3000.setToolTipText("Подробнее в Налоговом кодексе РФ, статья 218"); // всплывающая подсказка при наведении на компонент флажок.
    	Box_500 = new JCheckBox("");  /* Создание компонента флажка для стандартного вычета в размере 500 руб. */
    	Box_500.setToolTipText("Подробнее в Налоговом кодексе РФ, статья 218");// всплывающая подсказка при наведении на компонент флажок.
    	
        // слушатели для кнопок
        //добавить кнопки на панели
    	PokazZarp.add(PokazRasBut);  	/* 	PokazZarp - кнопка "Рассчитать заработную плату"
	  	add - метод добавления компоненты в контейнер.
	  	PokazZarp - панель содержащая только кнопку
	  	*/
    	
        //добавить метки и текстовые поля на панели
    	DanZarp.add(Label_1);   /*  add - метод добавления компоненты в контейнер. */
    	DanZarp.add(Text_oklad);
    	DanZarp.add(Label_2);
    	DanZarp.add(Label_3);
    	DanZarp.add(Text_dni);
    	DanZarp.add(Label_4);
    	DanZarp.add(Text_rab_dni);
    	DanZarp.add(Label_5);
    	DanZarp.add(Label_6);
    	DanZarp.add(Label_7);/*  add - метод добавления компоненты в контейнер. */
    	DanZarp.add(Text_kol_det);
    	DanZarp.add(Label_8);
    	DanZarp.add(Text_do_18);
    	DanZarp.add(Label_9);
    	DanZarp.add(Box_3000);
    	DanZarp.add(Label_10);
    	DanZarp.add(Box_500);
    	DanZarp.add(Label_11);
    	DanZarp.add(Text_prem);
    	DanZarp.add(Label_12);/*  add - метод добавления компоненты в контейнер. */
    	
    	PokazRasBut.addActionListener(new ActionListener()   /* 	PokazRasBut - кнопка "Рассчитать зарплату"
    		 	"."  - указывает к какой переменной (кнопке) следует применить слушателя.
    		 	addActionListener - добавление слушателя ActionListener к кнопке
    		  	new - Оператор new создает экземпляр указанного класса 
    		  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
    		  	который будет отвечать за реагирование на события. 
    		  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
    		  	Поэтому будет использоваться интерфейс "ActionListener", 
    		  	предназначенный для обработки событий "ActionEvent".
    		  	тело интерфейса указывается ниже после фигурной скобки "{"
    		  	*/                
        	   {                                                         
    	    public void actionPerformed(ActionEvent e)   /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/            
    	    {   
    	    	if ((Interface.isValidInput(Text_oklad, "размер оклада")) &&
    	    		(Interface.isValidInput(Text_dni, "количество отработанных дней"))&&
    	    		(Interface.isValidInput(Text_rab_dni, "количество рабочих дней в месяце"))&&
    	    		(Interface.isValidInput(Text_kol_det, "количество детей"))&&
    	    		(Interface.isValidInput(Text_do_18, "количество детей"))&&
    	    		(Interface.isValidInput(Text_prem, "размер премии")) ) 
    	    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
	    		 	если в текстовые поля Text_oklad, Text_dni, Text_rab_dni, Text_kol_det, Text_do_18, Text_prem введены 
	    		 	буквы или символы (текст, который невозможно преобразовать в цифры).
	    		   	Если введены некорректные данные, то выдает ошибку "Введите размер оклада"....	    		 
	    		 	*/
    	    	{ 	
    	    		if (Integer.parseInt(Zarpl.Text_kol_det.getText())>20) {//если количество детей  больше 20, parseInt - преобразование введенного текста в цифры
    	    			JDialog D=new JDialog();
    	    			JOptionPane.showMessageDialog(D, "Введите правильные данные!", "Ошибка", JOptionPane.WARNING_MESSAGE);
    	    			/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
   	    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
   	    		 "Введите правильные данные!"  это сообщение отображаемые в диалоге
   	               */
    	    			Zarpl.Text_kol_det.requestFocus();//ставит фокус на строчке Text_rab_dni
    	    			Zarpl.Text_kol_det.setText("");  
    	    			/* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит текстовое поле будет пустым
				    	*/  
	                } else if (Integer.parseInt(Zarpl.Text_do_18.getText())>20) { //если количество детей до 18 лет больше 20, parseInt - преобразование введенного текста в цифры
	                	JDialog D=new JDialog();
	                	JOptionPane.showMessageDialog(D, "Введите правильные данные!", "Ошибка", JOptionPane.WARNING_MESSAGE);
	                	/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
		    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
		    		 "Введите правильные данные!"  это сообщение отображаемые в диалоге
		               */
	                	Zarpl.Text_do_18.requestFocus();//ставит фокус на строчке Text_rab_dni
		    			Zarpl.Text_do_18.setText("");  
		    			/* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит текстовое поле будет пустым
				    	*/  
		            } else if (Integer.parseInt(Zarpl.Text_do_18.getText())>Integer.parseInt(Zarpl.Text_kol_det.getText())){ //если количество детей до 18 лет больше чем количество детей, parseInt - преобразование введенного текста в цифры
		            	JDialog D=new JDialog();
	                	JOptionPane.showMessageDialog(D, "Введите правильные данные!", "Ошибка", JOptionPane.WARNING_MESSAGE);
	                	/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
		    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
		    		 "Введите правильные данные!"  это сообщение отображаемые в диалоге
		               */
	                	Zarpl.Text_kol_det.requestFocus();//ставит фокус на строчке Text_rab_dni
		    			Zarpl.Text_kol_det.setText(""); 
		    			/* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит текстовое поле будет пустым
				    	*/  
		    			Zarpl.Text_do_18.setText("");    
		            } else if (Integer.parseInt(Zarpl.Text_dni.getText())>31) {//если количество дней больше чем 31, parseInt - преобразование введенного текста в цифры
    	    			JDialog D=new JDialog();
    	    			JOptionPane.showMessageDialog(D, "Введите правильные данные!", "Ошибка", JOptionPane.WARNING_MESSAGE);
    	    			/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
   	    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
   	    		 "Введите правильные данные!"  это сообщение отображаемые в диалоге
   	               */
    	    			Zarpl.Text_dni.requestFocus();//ставит фокус на строчке Text_rab_dni
    	    			Zarpl.Text_dni.setText("");    /* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит текстовое поле будет пустым
				    	*/  
	                } else if (Integer.parseInt(Zarpl.Text_rab_dni.getText())>31) {//если количество рабочих дней больше чем 31, parseInt - преобразование введенного текста в цифры
	                	JDialog D=new JDialog();
	                	JOptionPane.showMessageDialog(D, "Введите правильные данные!", "Ошибка", JOptionPane.WARNING_MESSAGE);
	                	/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
		    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
		    		 "Введите правильные данные!"  это сообщение отображаемые в диалоге
		               */
	                	Zarpl.Text_rab_dni.requestFocus();//ставит фокус на строчке Text_rab_dni
	                	Zarpl.Text_rab_dni.setText("");    
	                	/* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит текстовое поле будет пустым
				    	*/  
		            } else if (Integer.parseInt(Zarpl.Text_dni.getText())>Integer.parseInt(Zarpl.Text_rab_dni.getText())){ //если количество отработанных дней больше чем рабочих, parseInt - преобразование введенного текста в цифры
		            	JDialog D=new JDialog();
	                	JOptionPane.showMessageDialog(D, "Введите правильные данные!", "Ошибка", JOptionPane.WARNING_MESSAGE);
	                	/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
		    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
		    		 "Введите правильные данные!"  это сообщение отображаемые в диалоге
		               */
	                	Zarpl.Text_dni.requestFocus();//ставит фокус на строчке Text_rab_dni
		    			Zarpl.Text_dni.setText("");    
		    			/* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит текстовое поле будет пустым
				    	*/  
		    			Zarpl.Text_rab_dni.setText("");    
		            }  {
		            Rasch.RacZarDanPer();/*	данные которые записаны в текстовые поля преобразовываются в тип Integer и сохраняются в переменные.
	    		  	методRacZarDanPer записан в классе Rasch
	    		  	Слева от точки указывается класс содержащий метод указанный после точки.
	    		  	*/
		            Interface_Zarpl.main(null); 
		            /* 	что будет происходить при нажатии на кнопку 
    				(открывается новая оконная форма класса Interface_Zarpl - Расчет зарплаты) 
    				программа передает в метод main класса Interface_Zarpl null. 
    				Тем самым происходит запуск метода без передачи переменных 
    				*/
		            Interface.frame.setVisible(false); //Окно Зарплатный калькулятор становится невидимым
		            }
    	    	} 
    	    	
    	    	
    	    }                                                        
    	   });  	
    	
    	
    	}
}
