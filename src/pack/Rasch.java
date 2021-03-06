package pack;
/*	��������� ����� "pack", � ������� ��������� ���� ������
����� (package) � ��� ����� ���������, ������� ������������ ��� ����, ����� ����������� ����� �������.
��������, �� ������ ������� ����� List, ��������� ��� � ����� � �� ������ ����� ����� � ��������� ����������, 
������� ����� �� ���������� ���� �� ���-������ ��� ������ ����� � ������ List.
 */

public class Rasch {
	/*	(Public)����������� �������, ������� ��������� ������������ ��������� ���������� ������ ������ � ����� ����������. 
    � ������ ������ ����������� ������� public ��������, ��� ����� Rasch ����� � �������� ������ ������.
	� ���� ������ ������������ ����������������� ����� class. 
	��� ������� �����������, ��� �� ���������� ������� ����� ����� Rasch.
	��������� Rasch ��� �����, ��������� ������ ������� (public)
	*/
	static double oklad, dni,rab_dni, kol_det, do_18, prem, doh2y,dni_bol, doh1y, dni_otp, bez_nal,vt_det,vt, nal_baza, nalog,premi,zarpl,sr_dn_bol,bol, bol_1, kof,k,sr_dn_otp,otp;
	static int box_3000_1,box_500_1;

	/*************** �������� **********************/
	public static void RacZarDanPer() {
		/*  ����������� ������� public ��������, ��� ����� RacZarDanPer() ����� � �������� ������ ������.
	    static ��������, ��� �� ����� ��������� ���������(�����) ������� Rasch � ������, ����� ������������ ���� �����.
	    void ��������, ��� ����� RacZarDanPer() �� ���������� ������ � ���������, ������� ��� �������.
	    ����� RacZarDanPer � ������� ��������, ��� ��������, ��� ����� �� ����� ����������(����������)
	    */
		oklad = Integer.parseInt(Zarpl.Text_oklad.getText());
		dni = Integer.parseInt(Zarpl.Text_dni.getText());
		rab_dni = Integer.parseInt(Zarpl.Text_rab_dni.getText());
		kol_det = Integer.parseInt(Zarpl.Text_kol_det.getText());
	    do_18 = Integer.parseInt(Zarpl.Text_do_18.getText());
	    prem = Integer.parseInt(Zarpl.Text_prem.getText());
		if (Zarpl.Box_3000.isSelected()){ box_3000_1=1; } else box_3000_1=0;
	    if (Zarpl.Box_500.isSelected()){ box_500_1=1; } else box_500_1=0;
	    }

	public static void Itog_zarpl() {/*  ����������� ������� public ��������, ��� ����� Itog() ����� � �������� ������ ������.
	    static ��������, ��� �� ����� ��������� ���������(�����) ������� Rasch � ������, ����� ������������ ���� �����.
	    void ��������, ��� ����� Itog() �� ���������� ������ � ���������, ������� ��� �������.
	    ����� Itog � ������� ��������, ��� ��������, ��� ����� �� ����� ����������(����������)
	    */	
		//���������  (���-�� �����*�����.������)
	    bez_nal=oklad/rab_dni*dni;
	    
	    //������
	    //����������� ����� �� �����. �� ������� ������� - 1400, ������� - 1400, �������� � ������ - 3000 ���.
	    if (do_18==0){vt_det=0;//���� ����� �� 18 ��� ��� - �� ����������� ����� �� �����=0
	    } else if ((kol_det-do_18)>=2){vt_det=3000*do_18;
	    } else if ((kol_det-do_18)==1){vt_det=1400+3000*(do_18-1);
	    } else if ((kol_det-do_18)==0){
	    	if (do_18==1){vt_det=1400;
	    	} else {vt_det=1400*2+3000*(do_18-2);}}
	    
	    vt=(3000*box_3000_1)+(500*box_500_1)+vt_det;//box_3000_1 - ����������� ����� 3000 (��� ��� ���������� �����.),box_500_1- ����������� ����� 500 ��� (���������� �����, ������������ �� ��������) 
	    
	    //���������������� ���� (�����- ������)
	    nal_baza= bez_nal - vt;
	    if (nal_baza<0) {nal_baza=0;}
	    
	    //����� �� ������ ���.��� 13%   ((�����.������.-������)*0.13) ��� ���������.����*0,13
	    nalog= nal_baza * 0.13;
	    if (nalog<0) {nalog=0;} //����� �� ����� ���� ������ 0
	    
	    //������((�������� ���������-�����)*������ ������ � ���������/100)
	    premi=(bez_nal-nalog) * prem/100;
	    
	    //�������� � ������ (�����.������.-������+������)
	    zarpl=bez_nal-nalog+premi;
	    
	    //��������������� �����
	    String bez_nal_1 = String.format("%.2f", bez_nal);
	    String nal_baza_1 = String.format("%.2f", nal_baza);
	    String nalog_1 = String.format("%.2f", nalog);
	    String premi_1 = String.format("%.2f", premi);
	    String zarpl_1 = String.format("%.2f", zarpl);	
	    /* ����������� ����� String.format()������������ ��� �������� ��������������� ������ ��� �� ������
		   "%.2f" - ����� ��������� 2 ����� ����� �������
		    */
	    // �������� ��������� � ��������� �����  � ���� "������ ��������"
	    Interface_Zarpl.Label_bez_nal.setText(bez_nal_1);
	    Interface_Zarpl.Label_nal_baza.setText(nal_baza_1);
	    Interface_Zarpl.Label_nalog.setText(nalog_1);
	    Interface_Zarpl.Label_premi.setText(premi_1);
	    Interface_Zarpl.Label_zarpl.setText(zarpl_1);
	    
	}
	
	/*************** ���������� **********************/
	public static void RacBolDanPer() {/*  ����������� ������� public ��������, ��� ����� RacZarDanPer() ����� � �������� ������ ������.
	    static ��������, ��� �� ����� ��������� ���������(�����) ������� Rasch � ������, ����� ������������ ���� �����.
	    void ��������, ��� ����� RacZarDanPer() �� ���������� ������ � ���������, ������� ��� �������.
	    ����� RacZarDanPer � ������� ��������, ��� ��������, ��� ����� �� ����� ����������(����������)
	    */
		doh2y = Integer.parseInt(Bolnic.Text_2years.getText());//�� ������ Bolnic ��������� ������ ������� ���� ������������ � ���� Text_2years
		dni_bol = Integer.parseInt(Bolnic.Text_dni_bol.getText()); 
		k=1;
		if (Bolnic.q==0) {k=0;kof=1;} //q-���������� ������� �������� �� ���������� ������.q=0 - ����� 6 �������, q=1- �� 5 ���, q=2-��5��8���, q=3-����� 8. 
		else if (Bolnic.q==1) {kof=0.6;} 
		else if (Bolnic.q==2) {kof=0.8;} 
		else {kof=1;} 
		}

	public static void Itog_bolnic() {/*  ����������� ������� public ��������, ��� ����� Itog() ����� � �������� ������ ������.
	    static ��������, ��� �� ����� ��������� ���������(�����) ������� Rasch � ������, ����� ������������ ���� �����.
	    void ��������, ��� ����� Itog() �� ���������� ������ � ���������, ������� ��� �������.
	    ����� Itog � ������� ��������, ��� ��������, ��� ����� �� ����� ����������(����������)
	    */	
		
	    //���������� (������������� ���������(����� �� 2 ����/730,���-�� ���� � 2 �����)* ����� ���� �� �������*%������ ����������� �����)
	    //������� ������� ��������� (����� �� 2 ����/730)
	    if ((doh2y<(5965*24))||(k==0)){doh2y=5965*24;} //5965-���� �� �������� �� �����(����������� ������ ������ �����), 24 ������ - 2 ����, ���� k=0-��������� �������� ������ 6 ���., ��� ����� ��������� �� ����. ���� ����� ���������� �� 2 ���� ������ ��� �� 2 ���� �� ����, �� ����� ��������� �� ����.
	    sr_dn_bol=doh2y/730;
	    
	    //������ 1 ��� �����������
	    bol_1=sr_dn_bol*kof;// ������ 1 ��� ����������� � ������ ���������� �����.q=0 - ����� 6 �������, q=1- �� 5 ���, q=2-��5��8���, q=3-����� 8. 
	    
	    //����� ����������� (������1��� ��������* ��� �������)
	    bol=bol_1* dni_bol;
	    
	    //��������������� �����
	    String sr_dn_bol_1 = String.format("%.2f", sr_dn_bol);
	    String bol_1_1 = String.format("%.2f", bol_1);
	    String bol_2 = String.format("%.2f", bol);
	    /* ����������� ����� String.format()������������ ��� �������� ��������������� ������ ��� �� ������
		   "%.2f" - ����� ��������� 2 ����� ����� �������
		    */
	    // �������� ��������� � ��������� ����� � ���� "������ �����������"
	    Interface_Bolnic.Label_sr_dn_bol.setText(sr_dn_bol_1);
	    Interface_Bolnic.Label_1_bol.setText(bol_1_1);
	    Interface_Bolnic.Label_bol.setText(bol_2);
	}	
	
	/*************** ��������� **********************/
	
	public static void RacOtpDanPer() { /*  ����������� ������� public ��������, ��� ����� RacZarDanPer() ����� � �������� ������ ������.
	    static ��������, ��� �� ����� ��������� ���������(�����) ������� Rasch � ������, ����� ������������ ���� �����.
	    void ��������, ��� ����� RacZarDanPer() �� ���������� ������ � ���������, ������� ��� �������.
	    ����� RacZarDanPer � ������� ��������, ��� ��������, ��� ����� �� ����� ����������(����������)
	    */   
		doh1y = Integer.parseInt(Otp.Text_1year.getText());
		dni_otp = Integer.parseInt(Otp.Text_dni_otp.getText()); 
		}
	
	public static void Itog_otp() {/*  ����������� ������� public ��������, ��� ����� Itog() ����� � �������� ������ ������.
	    static ��������, ��� �� ����� ��������� ���������(�����) ������� Rasch � ������, ����� ������������ ���� �����.
	    void ��������, ��� ����� Itog() �� ���������� ������ � ���������, ������� ��� �������.
	    ����� Itog � ������� ��������, ��� ��������, ��� ����� �� ����� ����������(����������)
	    */	

	    //������(�������� �� ���/12 ������� /29.3(������� ����� ���� � ������)* ���-�� ���� �������)
		//������� ������� ��������� (����� �� 1 ����/12 ���./29,3)
	    if ((doh1y<(5965*12))||(k==0)){doh1y=5965*12;} //5965-���� �� �������� �� �����(����������� ������ ������ �����), 24 ������ - 2 ����, ���� k=0-��������� �������� ������ 6 ���., ��� ����� ��������� �� ����. ���� ����� ���������� �� 2 ���� ������ ��� �� 2 ���� �� ����, �� ����� ��������� �� ����.
	    sr_dn_otp=doh1y/12/29.3;

	    //����� ��������� (��������.���.* ��� �������)
	    otp=sr_dn_otp* dni_otp;
	    
	    //��������������� �����
	    String sr_dn_otp_1 = String.format("%.2f", sr_dn_otp);
	    String otp_1 = String.format("%.2f", otp);
	    /* ����������� ����� String.format()������������ ��� �������� ��������������� ������ ��� �� ������
		   "%.2f" - ����� ��������� 2 ����� ����� �������
		    */
	    // �������� ��������� � ��������� ����� � ���� "������ ���������"
	    Interface_Otp.Label_sr_dn_otp.setText(sr_dn_otp_1);
	    Interface_Otp.Label_otp.setText(otp_1);
    
	}    
    
}    

