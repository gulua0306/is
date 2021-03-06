package pack;
/*	указывает пакет "pack", в котором находится файл класса
Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов.
Например, вы можете создать класс List, заключить его в пакет и не думать после этого о возможных конфликтах, 
которые могли бы возникнуть если бы кто-нибудь еще создал класс с именем List.
 */
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения 
(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing Библиотека графического интерфейса (конкретный пакет), 
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
(точка) используется для выделения элементов из ссылки на объект.
	*/
import java.awt.event.*; 
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете j ava.
Подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
В отличие от java.awt, javax.swing имеет более гибкую систему управления
и более широкий набор функций  	
Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
	*/
import java.awt.*; 
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете j ava.
подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
В отличие от java.awt, javax.swing имеет более гибкую систему управления
и более широкий набор функций 
	*/

public class Bolnic extends JPanel {
	/*	(Public)модификатор доступа, который позволяет программисту управлять видимостью любого метода и любой переменной. 
	В данном случае модификатор доступа public означает, что класс Bolnic виден и доступен любому классу.
В этой строке использовано зарезервированное слово class. 
		Оно говорит транслятору, что мы собираемся описать новый класс Bolnic.
		описываем Otp как класс доступный другим классам (public)
	класс наследует функции элемента JPanel (extends jpanel
	{ <- Полное описание класса располагается между открывающей
	фигурной скобкой в первой строке и парной ей закрывающей фигурной скобкой -> } 
		*/

    // объявление компонентов на уровне класса
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JPanel DanBol, PokazBol; /* 	объявляем Панели, доступные только внутри класса. 
	DanBol содержит строки: Доход за 2 года, дни по болезни, стаж, и их соответствующие поля, 
	в которые нужно вводить текст
	PokazBol - панель которая будет содержать в себе кнопку 
	"Расчитать больничный", которая описана ниже. 
	*/   
	private JButton PokazBolBut; /* 	Объявляем кнопку (будет находится на панел PokazBol)
   	Кнопка PokazBolBut - для показа рассчетов о зарплате, С УЧЕТОМ БОЛЬНИЧНОГО 
	(при нажатии открывается новое окно в котором можно будет увидеть расчет зарплаты)
	Доступно только внутри класса (private)
    */
	private JLabel Label_1, Label_2,  Label_3, Label_4; // Объявляем label. Используется для показа текста. Данные поля доступны только внутри класса (private). 
	public static JTextField Text_2years, Text_dni_bol; // текстовые поля в которые пользователь вводит данные. Доступно для других классов 
	public static JComboBox Box_st; // JComboBox - Поле с выпадающим списком Доступно для других классов
    public static int q; /*  Переменная доступная для других классов
 	Модификатор static служит для
	- данных, которые должны существовать в единственном экземпляре на всю программу, а не в каждом объекте. 
	- методов, которые не оперируют ни с какими данными (полями) объекта. Например, метод, который меняет все буквы в передаваемой ему строке с маленьких на большие.
		int - тип целых чисел
		q Сохраняет в себя результат соответствующий варианту из выпадающего списка
	   	0 - меншье 6 месяцев
	   	1- меньше 5 лет
 	2 - от 5 до 8 лет
 	3 - более 8 лет
    */

    
    //конструктор
    
	public Bolnic()  {  /*	Описание метода Bolnic
		метод видим и доступен для других классов (public)
		круглые скобки говорят о том что мы описываем метод и перед ними идет его название
		Внутри скобок можно указать данные (аргумерты или параметры), которые передаются методу
		*/
		setLayout (new BorderLayout());/*	Оператор new создает экземпляр указанного класса
	  	setLayout-Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
	 	BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
	 	на пять частей. В каждой из этих частей располагается один компонент. 
	 	При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
	 	куда именно он хочет поместить компонент.
	 	*/
	
		//создаем остальные панели
        DanBol = new JPanel(); /* панель содержит поля в которые следует ввести данные необходимые для расчета зарплаты
        = new JPanel():  "=" - оператор присваивания переменной DanOtp функций класса JPanel.
          	Оператор new создает экземпляр указанного класса 
          	JPanel() - класс. Является компонентом-контейнером для содержания других частей интерфейса. 
         	*/
        PokazBol = new JPanel(); /* панель содержит кнопку Рассчитать (отдельная панель для кнопки нужна для того чтобы кнопка была посередине)
        = new JPanel():  "=" - оператор присваивания переменной DanOtp функций класса JPanel.
          		Оператор new создает экземпляр указанного класса 
          		JPanel() - класс. Является компонентом-контейнером для содержания других частей интерфейса. 
         		*/
        
        
        //установливаем менеджера расположения для панелей
        DanBol.setLayout(new FlowLayout(FlowLayout.LEFT, 7, 15));/*setLayout-Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере DanZarp.
      	Менеджер размещения FlowLayout размещает компоненты подобно тому как текстовый редактор располагает слова. 
      	Компоненты располагаются друг за другом слева направо и сверху вниз, начиная с левого верхнего угла. 
      	Если строка заполнена и следующий компонент в ней не помещается, то он переносится на новую строку. 
      	Вокруг каждого компонента оставляется небольшое свободное пространство.
       	Оператор new создает экземпляр указанного класса 
       	7 - горизонтальный отступ, 15 - вертикальный
     	*/
        PokazBol.setLayout(new GridLayout(1, 1)); /*	setLayout-Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере PokazZarp.
      	Менеджер размещения GridLayout расставляет компоненты в таблицу
      	с заданным в конструкторе числом строк rows и столбцов columns
      	на панели будет 1 строка, 1 столбец,           
       	Это нужно для того чтобы разместить кнопку по центру в плане широты. 
       	Оператор new создает экземпляр указанного класса
     	*/
        
        
        //добавляем панели на главную панель
        add(DanBol, BorderLayout.CENTER);  /*	add - добавляет указанный компонент DanBol в контейнер Bolnic 
  		панель DanBol, на которой находятся поля ввода текста и поля подписей,
    	BorderLayout функция размещения в одной из 5 частей (EAST, WEST, NORTH, SOUTH, CENTER)  
    	панель DanBolp находится в центре
     	*/
   
        add(PokazBol, BorderLayout.SOUTH); /*	add - добавляет указанный компонент PokazBol в контейнер Bol 
  		панель PokazBol, на которой находится кнопка. 
    	BorderLayout функция размещения в одной из 5 частей (EAST, WEST, NORTH, SOUTH, CENTER)  
    	панель PokazBol находится внизу
     	*/
     
        //добавить кнопки и текстовые поля на панели
        addButtonsAndTextFields(); // метод для добавления кнопок и т.д. на панель
       
		}
	

	//добавление кнопок и текстовых полей на панели
    private void addButtonsAndTextFields() { // описываем метод добавления кнопок и др.компонентов на панели. Метод доступен только в данном классе

        //создаем кнопку
    	PokazBolBut = new JButton("Рассчитать больничный"); PokazBolBut = new JButton("Рассчитать больничный");
    	/*	PokazBolBut - кнопка "расчитать больничный" 
  		= new JButton():  "=" - оператор присваивания переменной DanOtp функций класса JButton.
  		Оператор new создает экземпляр указанного класса 
  		JButton() - класс. Является компонентом-кнопкой. В скобках указана надпись содержащаяся на кнопке. 
 		*/

        //создать текстовые метки
    	Label_1 = new JLabel("1. Заработок за предыдущие 2 года:", JLabel.LEFT); //текст внутри компонента label находится справа
    	Label_2 = new JLabel("рублей", JLabel.LEFT);
    	Label_3 = new JLabel("2. Количество дней болезни: ", JLabel.LEFT);
    	Label_4 = new JLabel("3. Страховой стаж", JLabel.LEFT);
    	/*= new JLabel():  "=" - оператор присваивания переменной Dohod1yearLabel функций класса JLabel.
      		Оператор new создает экземпляр указанного класса 
      		JLabel() - класс. Является компонентом-лейблом-областью с обычным текстом. 
      		В скобках указана надпись содержащаяся в этой области. 
	 		*/
    	
        //создать текстовые поля
    	Text_2years = new JTextField("", 5);
    	/*	Text_2years - текстовое поле в которое мы будем вводить доход за 2 года
		new JTextField():  "=" - оператор присваивания переменной Text_2years функций класса JTextField.
		Оператор new создает экземпляр указанного класса 
		JTextField() - класс. Является компонентом-текстовым полем.
		5 - размер тектового поля, "" - обозначаем что в данном поле не бует никаких записей 
 		*/
    	Text_2years.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
    	Text_2years.setToolTipText("Введите доход за предыдущие 2 года в рублях");//всплывающая подсказка при наведении на текстовое поле
    	Text_dni_bol = new JTextField("", 4);/*	Text_dni_bol - текстовое поле в которое мы будем вводить количество дней болезни
		new JTextField():  "=" - оператор присваивания переменной Text_dni_bol функций класса JTextField.
		Оператор new создает экземпляр указанного класса 
		JTextField() - класс. Является компонентом-текстовым полем.
		5 - размер тектового поля, "" - обозначаем что в данном поле не бует никаких записей 
 		*/
    	Text_dni_bol.setMargin(new Insets(2, 7, 2, 7));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
    	Text_dni_bol.setToolTipText("Введите количество дней болезни");//всплывающая подсказка при наведении на текстовое поле
   	
   	    	Text_2years.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent comp) {
                JTextField textField = (JTextField) comp;
                try {
                    Integer.parseInt(textField.getText());
                    return true;
                } catch (NumberFormatException e) {
                    Toolkit.getDefaultToolkit().beep();
                }
                return false;
            }
        });
    	
    	Text_dni_bol.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent comp) {
                JTextField textField = (JTextField) comp;
                try {
                    Integer.parseInt(textField.getText());
                    return true;
                } catch (NumberFormatException e) {
                    Toolkit.getDefaultToolkit().beep();
                }
                return false;
            }
        });
        
    	String[] str = {
    			"Меньше 6 месяцев",
      			    "Меньше 5 лет",
      			    "От 5 до 8 лет",
      			    "Больше 8 лет"
      			};
    	/*	String[] str – класс с оператором приема строки
	  	В строке ниже мы будем использовать данный оператор для передачи строки в выпадающий список
	 	*/
    	Box_st = new JComboBox(str);   
    	/*	JComboBox - Поле с выпадающим списком
	   	Создаем переменную Box_st И присваиваем ей функции класса JComboBox
	   	Оператор new создает экземпляр указанного класса
	   	JComboBox(str) значит что мы в качестве строк
	   	выпадающего списка принимаем считанные строки параметром str
	 	*/
    	
        //добавить кнопки на панели
    	PokazBol.add(PokazBolBut); // добавляем кнопку PokazRasBut на панель PokazZarp
    	/* 	PokazBolBut - кнопка "Рассчитать больничный"
  		add - метод добавления компоненты в контейнер.
  		PokazBol - панель содержащая только кнопку
  		*/
    	
        //добавить метки и текстовые поля на панели
    	DanBol.add(Label_1);
    	DanBol.add(Text_2years);
    	DanBol.add(Label_2);
    	DanBol.add(Label_3);
    	DanBol.add(Text_dni_bol);
    	DanBol.add(Label_4);
    	DanBol.add(Box_st);
    	/* 	add - метод добавления компоненты в контейнер.*/
    	
    	PokazBolBut.addActionListener(new ActionListener()   
    			/* 	PokazOtpBut - кнопка "Рассчитать больничный"
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
    	    public void actionPerformed(ActionEvent e)   
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
      		который реализуется путем простого вызова обработчика событий ActionPerformed.
      		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
      		Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
      	*/
    	    {  
        	q=Box_st.getSelectedIndex();
        	/* 	Переменная q принимает значение 1,2,else. 
    	  	getSelectedIndex() преобразует выбранный вариант в порядковой 
    	  	последовательности заданной в StBox в 1,2,else.
    	  	*/      
    	    	if ((Interface.isValidInput(Text_2years, "доход за 2 года")) && 
    	    		(Interface.isValidInput(Text_dni_bol, "количество дней болезни")) )
    	    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    		 		если в текстовые поля Text_2years и Text_dni_bol введены буквы или символы 
    		 		(текст, который невозможно преобразовать в цифры).
    		   		Если введены некорректные данные, то выдает ошибку "Введите доход за 2 года"...
	    		 	*/	
    	    		{
    	    		Rasch.RacBolDanPer();/* 	Обращаемся в класс Rash к методу RacBolDanPer 	*/
    	    		Interface_Bolnic.main(null);/* 	что будет происходить при нажатии на кнопку 
    				(открывается новая оконная форма класса Interface_Bolnic - Расчет больничного) 
    				программа передает в метод main класса Interface_Bolnic null. 
    				Тем самым происходит запуск метода без передачи переменных 
    				*/
    	    		Interface.frame.setVisible(false);//Окно Зарплатный калькулятор становится невидимым
    	    	} 
    	     }                                                        
    	   });  	
    	
    	
    	}
    
 
		
	}
