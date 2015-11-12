package pack;
/*	указывает пакет "pack", в котором находится файл класса
Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов.
Например, вы можете создать класс List, заключить его в пакет и не думать после этого о возможных конфликтах, 
которые могли бы возникнуть если бы кто-нибудь еще создал класс с именем List.
 */
import java.awt.*;
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете j ava.
подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
В отличие от java.awt, javax.swing имеет более гибкую систему управления
и более широкий набор функций 
*/	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения 
(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing Библиотека графического интерфейса (конкретный пакет), 
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
(точка) используется для выделения элементов из ссылки на объект.
"Звездочка" в конце java.awt.* означает "включить все методы", но она не распространяется на библиотеки-наследники 
(то есть содержащие классы, произведённые от классов библиотеки более высокого уровня).
Поэтому  библиотеки java.awt.event.ActionEvent и java.awt.event.ActionListener необходимо включить в нашу программу,
несмотря на её наличие в библиотеке более высокого уровня java.awt
	Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
	 */
public class Interface_Zarpl extends JDialog {/*	(Public)модификатор доступа, который позволяет программисту управлять видимостью любого метода и любой переменной. 
	В данном случае модификатор доступа public означает, что класс Interface_Zarpl виден и доступен любому классу.
	В этой строке использовано зарезервированное слово class. 
	Оно говорит транслятору, что мы собираемся описать новый класс Interface_Zarpl.
	Описываем Interface_Zarpl как класс, доступный другим классам (public)
	Класс наследует функции элемента JDialog, который определён где-то в стандартной библиотеке awt (вот зачем 
	мы её подключали). Этот самый JDialog уже содержит в себе всё необходимое для создания и функционирования 
	окна программы - нам остаётся только использовать его методы в своей программе.
	{ <- Полное описание класса располагается между открывающей
	фигурной скобкой в первой строке и парной ей закрывающей фигурной скобкой -> } 
	*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*  Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		С помощью static объявляются методы и переменные класса, используемые для работы с классом в целом. 
		Эти методы могут непосредственно работать только с локальными и статическими переменными.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		try {
			Interface_Zarpl dial = new Interface_Zarpl();
			dial.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			dial.setVisible(true);
			Rasch.Itog_zarpl();
		} catch (Exception e) {
			/*Для задания блока программного кода, который требуется защитить от исключений, исполь­зуется ключевое слово try. 
			 Сразу же после try-блока помещается блок catch, задающий тип исключения которое необходимо обрабатывать
			 */
			/*
			 Блок catch получает объект типа Exception,который содержит
короткое описание возникшей проблемы, а его метод  getMessage()возвращает это описание.
		*/
			e.printStackTrace();/* метод printStackTrace() более детальная информация об исключении
			 Он выведет последовательность вызовов,которая привела к возникновению исключения
		
			 */
		}
	}

	/**
	 * Create the dialog.
	 */
	public static JLabel Label_bez_nal, Label_nal_baza, Label_nalog,Label_premi, Label_zarpl;
	/*	Модификатор static служит для
	- данных, которые должны существовать в единственном экземпляре на всю программу, а не в каждом объекте. 
	- методов, которые не оперируют ни с какими данными (полями) объекта. 
	  Например, метод, который меняет все буквы в передаваемой ему строке с маленьких на большие.
  	Статические бывают:
	- поля
	- методы
	- классы
	
  	В данном случае модификатор доступа public означает, 
  	что переменные --Label_bez_nal, Label_nal_baza, Label_nalog,Label_premi, Label_zarpl-- доступны любому классу.
  	JLabel - С помощью JLabel можно показать текст с иконкой.
*/
	public Interface_Zarpl() {/*	Модификатор доступа public означает, что метод RascInterface()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта RascInterface в памяти, чтобы использовать этот метод.
		С помощью static объявляются методы и переменные класса, используемые для работы с классом в целом. 
		Эти методы могут непосредственно работать только с локальными и статическими переменными. 
		 */

		setTitle("Расчет заработной платы");
		setSize(400, 550); // указывает ширину и высоту.
		setLocationRelativeTo(null);//установить посередине экрана

		getContentPane().setLayout(new BorderLayout());
		
		//Панель с кнопками Рассчитать заново и Закрыть
		JPanel buttonPane = new JPanel();/*  Создание новой компоненты  панели  */
		getContentPane().add(buttonPane, BorderLayout.SOUTH);/* Добавление компоненты на панель. 
		добавление осуществляется при помощи метода add, но c двумя параметрами. 
		Первый параметр – это компонент, который хотим добавить. Второй параметр – константа класса BorderLayout, с помощью которой разработчик говорит BorderLayout’у контейнера, где расположить компонент,в данном случае снизу (юг).
		  */
		buttonPane.setLayout(new GridLayout(2, 1, 20, 5));/* 	setLayout-Вызов менеджера компоновки, который задает определенный порядок панели.
      	Менеджер размещения GridLayout расставляет компоненты в таблицу
      	с заданным в конструкторе числом строк rows и столбцов columns
      	на панели будет 2 строки, 1 столбец,           
       	расстояние между столбцами 20, расстояние между строками 5
       	Оператор new создает экземпляр указанного класса
     	*/
		
		JButton DrBut = new JButton("Рассчитать заново");/*  Создание кнопки "Рассчитать заново"	 */
		buttonPane.add(DrBut);/*  Добавление кнопки в панель		 */
			
		JButton ExitBut = new JButton("Закрыть");
		buttonPane.add(ExitBut);
		
		//Панель с рассчитанными данными по зарплате
		JPanel panel = new JPanel();/*  Создание новой компоненты  панели 		 */
		getContentPane().add(panel, BorderLayout.CENTER);
		/* Добавление компоненты на панель. 
		добавление осуществляется при помощи метода add, но c двумя параметрами. 
		Первый параметр – это компонент, который хотим добавить. 
		Второй параметр – константа класса BorderLayout, с помощью которой разработчик говорит BorderLayout’у контейнера, где расположить компонент,в данном случае в центре.
		  */
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 7, 15));
		/*setLayout-Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере DanZarp.
      	Менеджер размещения FlowLayout размещает компоненты подобно тому как текстовый редактор располагает слова. 
      	Компоненты располагаются друг за другом слева направо и сверху вниз, начиная с левого верхнего угла. 
      	Если строка заполнена и следующий компонент в ней не помещается, то он переносится на новую строку. 
      	Вокруг каждого компонента оставляется небольшое свободное пространство.
       	Оператор new создает экземпляр указанного класса 
       	7 - горизонтальный отступ, 15 - вертикальный
     	*/
		
		JLabel Label_1 = new JLabel("1. Начисленная зарплата:");
		/* С помощью JLabel показываем текст "Начисленная зарплата"
		 Текст, который показывает JLabel выделять нельзя, только смотреть. 
		 */
		Label_1.setToolTipText("Зарплата без вычета налога"); //всплывающая подсказка
		panel.add(Label_1);//добавить на панель, add - метод добавления компоненты в контейнер.
				
		Label_bez_nal = new JLabel(""); //сюда будет записываться рассчитанная начисленная зарплата
		panel.add(Label_bez_nal); //добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_2 = new JLabel("рублей");
		panel.add(Label_2);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_3 = new JLabel("2. Налогооблагаемая база:");
		Label_3.setToolTipText("Начисленная зарплата - вычеты");
		panel.add(Label_3);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		Label_nal_baza = new JLabel("");//сюда будет записываться рассчитанная налогооблагаемая база
		panel.add(Label_nal_baza);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_4 = new JLabel("рублей");
		panel.add(Label_4);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_5 = new JLabel("3. Сумма налога на доходы физ.лиц:");
		Label_5.setToolTipText("Налог на доходы физических лиц (13%)");//всплыв.подсказка
		panel.add(Label_5);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		Label_nalog = new JLabel("");//сюда будет записываться рассчитанный налог
		panel.add(Label_nalog);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_6 = new JLabel("рублей");
		panel.add(Label_6);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_7 = new JLabel("4. Сумма премиальных:");
		Label_7.setToolTipText("Сумма премиальных");//всплыв подсказка
		panel.add(Label_7);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		Label_premi = new JLabel("");//сюда будет записываться рассчитанные премиальные
		panel.add(Label_premi);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_8 = new JLabel("рублей");
		panel.add(Label_8);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_9 = new JLabel("5. Заработная плата к выдаче:");
		Label_9.setToolTipText("Сумма, которая выдается сотруднику (Оклад-налог+премия)");//всплыв подсказка
		panel.add(Label_9);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		Label_zarpl = new JLabel("");
		panel.add(Label_zarpl);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_10 = new JLabel("рублей");
		panel.add(Label_10);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		ExitBut.addActionListener(new ActionListener()               
		   {                                                         
		    public void actionPerformed(ActionEvent e)               
		    {   // что будет происходить при нажатии на кнопку Закрыть - программа завершит свою работу
	            System.exit(0);		    	
		    }                                                        
		   }); 
		

		
		DrBut.addActionListener(new ActionListener()               
		   {                                                         
		    public void actionPerformed(ActionEvent e)      
		    /*  
		    Когда произойдет событие, JVM вызовет метод вашего класса слушателя actionPerformed(ActionEvent),и передаст ему
необходимую информацию о событии в аргументе ActionEvent.
		    */
		    {   // что будет происходить при нажатии на кнопку Рассчитать заново - откроется окно Зарплатный калькулятор, все данные обнулятся
		    	setVisible(false);//данное окно станет невидимым
		    	Interface.frame.setVisible(true);
		    	Zarpl.Text_oklad.setText("");
		    	Zarpl.Text_dni.setText("");
		    	Zarpl.Text_rab_dni.setText("");
		    	Zarpl.Text_kol_det.setText("");
		    	Zarpl.Text_do_18.setText("");
		    	Zarpl.Text_prem.setText("");
		    	
		    	Bolnic.Text_2years.setText("");
		    	Bolnic.Text_dni_bol.setText("");
		    	Otp.Text_1year.setText("");
		    	Otp.Text_dni_otp.setText("");
		    	
			    Zarpl.Box_3000.setSelected(false);
			    Zarpl.Box_500.setSelected(false);

			    Interface.JTP1.setSelectedIndex(0);//устанавливаем что программа должна открыться на вкладке 0 (т.е. Зарплата)

		    }                                                        
		   }); 
	}
	}
