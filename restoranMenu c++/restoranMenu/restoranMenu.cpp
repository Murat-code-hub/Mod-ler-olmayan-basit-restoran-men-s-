#include<iostream>
using namespace std;
string secimOnayYemek();
string icecekSecimOnay();
string anaYemekmenu()
{
	string yemek;
	int secim;
	cout << "Ana Yemekler ||Lahmacun 1: || Pide 2: ||Fasulye 3: seçiniz ---> ";
	cin >> secim;
	switch (secim)
	{
		char secimOnay;
	case 1: {
		cout << "Lahmacun sectiniz"<<endl;
		yemek = "Lahmacun"; 
		cout << "Seçiminizi Onalıyormusunuz(e/h) :";
		cin >> secimOnay;
		if (secimOnay == 'e') {
			break;
		}
		else if (secimOnay == 'h') {
			yemek = secimOnayYemek(); break;
		}
	}
	case 2: {
		cout << "Pide sectiniz"<<endl;
		yemek = "Pide";
		cout << "Seçiminizi Onalıyormusunuz(e/h) :";
		cin >> secimOnay;
		if (secimOnay == 'e') {
			break;
		}
		else if (secimOnay == 'h') {
			yemek = secimOnayYemek(); break;
		}
	}
	case 3: {
		cout << "Fasulye sectiniz"<<endl;
		yemek = "Fasulye";
		cout << "Seçiminizi Onalıyormusunuz(e/h) :";
		cin >> secimOnay;
		if (secimOnay == 'e') {
			break;
		}
		else if (secimOnay == 'h') {
			yemek = secimOnayYemek(); break;
		}
	}
	}
	return yemek;
}

string icecekMenu()
{
	string icecek;
	int secim;
	cout << "İçecekler ||Ayran :1 || Su :2 || Maden Suyu :3 seçiniz ---> ";
	cin >> secim;
	char secimOnay;
	switch (secim) {
	case 1: {
		
		cout << "Ayran sectiniz"<<endl;
		icecek = "Ayran";
		cout << "Seçiminizi onaylıyormusunuz(e/h) :";
		cin >> secimOnay;
		if (secimOnay == 'e') {
			break;
		}
		else if (secimOnay == 'h') {
			icecek = icecekSecimOnay(); break;
		}
	}
	case 2: {
		cout << "Su seçtiniz"<<endl;
		icecek = "Su";
		cout << "Seçiminizi onaylıyormusunuz(e/h) :";
		cin >> secimOnay;
		if (secimOnay == 'e') {
			break;
		}
		else if (secimOnay == 'h') {
			icecek = icecekSecimOnay(); break;
		}
	}
	case 3: {
		cout << "Maden Suyu seçtiniz"<<endl;
		icecek = "Maden Suyu";
		cout << "Seçiminizi onaylıyormusunuz(e/h) :";
		cin >> secimOnay;
		if (secimOnay == 'e') {
			break;
		}
		else if (secimOnay == 'h') {
			icecek = icecekSecimOnay(); break;
		}
	}
	}
	return icecek;
}
string secimOnayYemek() {
	string yemek;
	int secim;
	cout << "Ana Yemekler ||Lahmacun 1: || Pide 2: ||Fasulye 3: seçiniz ---> ";
	cin >> secim;
	switch (secim) {
	case 1: {
		cout << "Ana yemeğiniz Lahmacun olarak değiştirildi"<<endl;
		yemek = "Lahmacun"; break;
	}
	case 2: {
		cout << "Ana yemeğiniz pide olarak değiştirildi"<<endl;
		yemek = "Pide"; break;
	}
	case 3: {
		cout << "Ana yemeğiniz Fasulye olarak değiştirildi"<<endl;
		yemek = "Fasulye"; break;
	}

	}
	return yemek;

}
string icecekSecimOnay() {
	string icecek;
	int secim;
	cout << "İçecekler ||Ayran :1 || Su :2 || Maden Suyu :3 seçiniz ---> ";
	cin >> secim;
	switch (secim) {
	case 1: {
		cout << "İçeceğiniz Ayran olarak değiştirildi"<<endl;
		icecek = "Ayran"; break;
	}
	case 2: {
		cout << "İçeceğiniz Su olarak değiştirildi"<<endl;
		icecek = "Su"; break;
	}
	case 3: {
		cout << "İçeceğiniz Maden suyu olarak değiştirildi"<<endl;
		icecek = "Maden suyu"; break;
			
	}

	}
	return icecek;
}

int main()
{
	setlocale(LC_ALL, "turkish");
	int secim;
	string yemek, icecek;
	char kontrol = 'h';
	char sonKontrol;
	cout << "Ana yemekler 1: || İçecekler 2: seçiniz ---> ";
	cin >> secim;
	while (kontrol == 'h') {
		switch (secim) {
		case 1: { yemek = anaYemekmenu(); }
			  if (secim == 1) {
				  cout << "İçecek seçmek istiyormusunuz(e/h) :";
				  cin >> kontrol;
				  if (kontrol == 'h') {
					  break;
				  }
				  else if (kontrol == 'e') {
					  icecek = icecekMenu(); break;
				  }
			  }
		case 2: { icecek = icecekMenu(); }
			  if (secim == 2) {
				  cout << "Ana yemek seçmek istiyormusunuz(e/h) :";
				  cin >> kontrol;
				  if (kontrol == 'h') {
					  break;
				  }
				  else if (kontrol == 'e') {
					  yemek = anaYemekmenu(); break;
				  }
			  }
		}
		break;
	}
	cout << "Seçimleriniz ---> || Ana yemek :" << yemek << "|| İçecek :" << icecek << endl;
	char dongu = 'h'; char bitir;
	while (dongu == 'h') {
		cout << "Seçimlerinizi Onaylıyormusunuz(e/h) :";
		cin >> sonKontrol;
		if (sonKontrol == 'e') {
			cout << "Siparişleriniz || Ana yemek -----> " + yemek << "|| İçecek -----> " << icecek; return 0;
		}
		else if (sonKontrol == 'h') {
			cout << "Ana yemek değiştirmek için ---> 1 || İçecek değiştirmek için ---> 2 || giriniz ---> ";
			cin >> secim;
			switch (secim) {
			case 1: {
				yemek = secimOnayYemek(); break;
			}
			case 2: {
				icecek = icecekSecimOnay(); break;
			}
			}
		}
		cout << "Siparişleri  Onaylıyormusunuz(e/h) :";
		cin >> bitir;
		if (bitir == 'e') {
			cout << "Siparişleriniz || Ana yemek -----> " + yemek << "|| İçecek -----> " << icecek; return 0;
		}
		else {
			cout << "Siparişleriniz iptal edilmiştir iyi günler"; return 0;
			dongu == 'e';
		}
		
	}


	

	return 0;
}