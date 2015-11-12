package pack; /*	указывает пакет "pack", в котором находится файл класса
Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов.
 */

import java.awt.*;
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете j ava.
подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
В отличие от java.awt, javax.swing имеет более гибкую систему управления
и более широкий набор функций 
*/	
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

public class Interface extends JFrame { 
	/*	(Public)модификатор доступа, который позволяет программисту управлять видимостью любого метода и любой переменной. 
	В данном случае модификатор доступа public означает, что класс Interface виден и доступен любому классу.
	В этой строке использовано зарезервированное слово class. 
	Оно говорит транслятору, что мы собираемся описать новый класс Interface.
	Описываем Interface как класс, доступный другим классам (public)
	Класс наследует функции элемента JFrame, который определён где-то в стандартной библиотеке awt (вот зачем 
	мы её подключали). Этот самый JFrame уже содержит в себе всё необходимое для создания и функционирования 
	окна программы - нам остаётся только использовать его методы в своей программе.
	{ <- Полное описание класса располагается между открывающей
	фигурной скобкой в первой строке и парной ей закрывающей фигурной скобкой -> } 
	*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Interface frame = new Interface();
	
	public static void main(String[] args) {/*  Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
				С помощью static объявляются методы и переменные класса, используемые для работы с классом в целом. 
				Эти методы могут непосредственно работать только с локальными и статическими переменными.
				void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
				Программа может состоять из нескольких классов, но только один из них содержит метод main().
				Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
				начинают свою работу с вызова метода main. 
				*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {/* public - модификатор доступа, означающий, что метод run()виден и доступен любому классу.
				void означает, что метод run()не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)	 
				*/
				try { /*Для задания блока программного кода, который требуется защитить от исключений, исполь­зуется ключевое слово try. 
					 Сразу же после try-блока помещается блок catch, задающий тип исключения которое необходимо обрабатывать  */
					
					frame.setVisible(true); /* Устанавливаем видимость окна Зарплатный калькулятор */
					
				} catch (Exception e) { /* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
					Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
					Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Для ловли этих исключений
					и существует специальная конструкция try {} catch {}				 
						*/
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public static JTabbedPane JTP1; /* Модификатор доступа public означает,что переменная --JTP1-- доступна любому классу. 
	 JTabbedPane – панель вкладок Java Swing. */

	public Interface() {/* Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		С помощью static объявляются методы и переменные класса, используемые для работы с классом в целом. 
		Эти методы могут непосредственно работать только с локальными и статическими переменными.  */
		
		setTitle("Зарплатный калькулятор"); //устанавливает название окна 
		setSize(400, 550); // указывает ширину и высоту.
		setLocationRelativeTo(null);//установить посередине экрана

		//по закрытию формы - закрывать приложение
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTP1 = new JTabbedPane(JTabbedPane.TOP);
        getContentPane().add(JTP1);
        /* Для добавления новой вкладки на панель используется метод addTab. При добавлении новой вкладки 
        необходимо передать строку, которая будет являться заголовком вкладки, то есть отображаться на 
        самом ярлычке. Кроме этого вторым параметром необходимо указать панель или контейнер, 
        который будет располагаться уже на самой вкладке  */ 

        Zarpl zarpl = new Zarpl();
        JTP1.addTab("Заработная плата", zarpl);

        Bolnic boln = new Bolnic();
        JTP1.addTab("Больничный", boln);
        
        Otp otp = new Otp();
        JTP1.addTab("Отпуск", otp);

 
	}

	  //проверка данных, введенных пользователем
    public static boolean isValidInput(JTextField jtxt, String description) {

        JDialog D = new JDialog();
		//если был введен какой-либо текст
        if (jtxt.getText().trim().length() > 0) {
            //проверка на ввод только целого числа
            try { /* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Для ловли этих исключений
				и существует специальная конструкция try {} catch {}				 
					*/
                //попытка преобразовать текст в целое число
                //int num = Integer.parseInt(jtxt.getText());

                //если все нормально - возвращаем true
                return true;

            } catch (NumberFormatException e) {

                //предупреждение - неверный формат числа
                JOptionPane.showMessageDialog(D, "Вы должны ввести целое число!", "Ошибка", JOptionPane.WARNING_MESSAGE);

                //расположить курсор в текстово окне, чтобы пользователь еще раз ввел число
                jtxt.requestFocus();
                jtxt.setText("");

                //ошибка - возвращаем false
                return false;
            }

        } else {// если пользователь не ввели никаких данных

            //предупреждение, что нужно ввести данные
            JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);

            //расположить курсор в текстово окне, чтобы пользователь еще раз ввел число
            jtxt.requestFocus();
            jtxt.selectAll();

            //ошибка - возвращаем false
            return false;
        }
    }
    

}


