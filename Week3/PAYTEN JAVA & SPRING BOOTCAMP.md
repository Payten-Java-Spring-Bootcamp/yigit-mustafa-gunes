# <u>**PAYTEN JAVA & SPRING BOOTCAMP**</u>

## **Bölüm Sonu Ödev 2 / ARAŞTIRMA**

- #### **Imperative ve Declarative Kavramları**

Programlama paradigmaları temel bir kodlama stilidir. Çok kullanılan 4 tane programlama paradigması var; object-oriented, imperative, declarative, fonksiyonel (declarative programlamanın bir alt kümesi olarak görülebilir).

Declarative programlama;

Ne yapılacağını içeren, nasıl yapılacağınının mantığını pek de içermeyen paradigmadır. CSS veya HTML’i düşünün. Bir şeyin blur olacağını ifade edersiniz browser blur yapar. O şeyin nasıl blurlaştırılacağı hakkındaki fizik mantığını kurgulamaya çalışmazsınız. Veya border atadığınızda, onun aslında bir piksellik bir çizgi olduğunu, çizginin aslında noktalardan meydana geldiğini filan açıklamaya çalışmazsınız. Ne yapılacağını söylersiniz, yapılır.

```
function createWidget(type, txt) {
  return new Element(type, txt);
}
```

Mesela burada fonksiyon bir widget yaratıp geri döndürmüş. Widget’ın nasıl yaratıldığı hakkında çok fazla bilgimiz yok. Belki gerek de yok. Widget istedik widget’ı aldık. Önemli olan bu değil mi?

Imperative programlama;

Bu da Declarative programlamanın tam tersi, neyin nasıl olacağını, flow’u detaylıca yazdığınız programlama stili. Aynı örnekten gidelim;

```
function createWidget(options) {
  const element = document.createElement('div');
  element.style.backgroundColor = options.bgColor;
  element.style.width = options.width;
  element.style.height = options.height;
  element.textContent = options.txt;
  return element;
}
```

Gördüğünüz gibi burada, fonksiyonun adına yaraşır şekilde *widget*‘ı *yaratmış* ve geri döndürmüş.

- #### **Veritabanlarında Index Oluşturmak**

Indeks, veritabanında sorguların sonuçlarının daha hızlı bir şekilde gelmesi için kullanılan bir nesnedir. Sütunlardaki verilerin belirli bir düzene göre sıralanmasını sağlar. Primary Key olan sütunlar için index kullanımına ihtiyaç yoktur. Indeks kullanmak insert, update, delete işlemlerini yavaşlatır. Bir diğer önemli nokta indexler sorgu performansını arttırabilirler ancak ek veri alanına ihtiyaç duyarlar. Örneğin bir tabloda 5 non-clustered olursa her veri için ekstra 5 birim alan veri saklama alanına ihtiyaç duyulur.

- #### **Veritabanlarında Normalizasyon**

Normalizasyonun iki temel amacı vardır. Veri tabanında veri tekrarlarını ortadan kaldırmak ve veri tutarlılığını (doğruluğunu) artırmak. Normalizasyon, veri tabanlarına seviyelerle (normal formlar) uygulanır. Bir veri tabanının bu normal formlardan herhangi birine uygun olduğunu söyleyebilmek için, söz konusu normal formun tüm kriterlerini eksiksiz yerine getiriyor olması şarttır.

Başarılı bir şekilde uygulandığında normalizasyon işlemi veri tabanının süratini büyük oranda artırır. Veri tabanının sabit diskteki boyutunu azaltır. Ayrıca veri tutarlılığını artırarak veri tekrarlarını engeller.

**Normal Formlar**

Basitçe tanımlamak gerekirse, normal formlar normalizasyon seviyeleridir. Bu seviyeler gereksiz veri tekrarlarını ne derecede engellediği ve tutarlılığı ne kadar sağladığına bağlı olarak derecelendirilir. Seviye yükseldikçe veri tutarlılığı artar, veri tekrarı düşer.

**1NF (1. Normal Form);**

Normalizasyon seviyeleri 1NF (Birinci Normal Form), 2NF, 3NF, BCNF(Boyce-Codd Normal Form, 3.5NF'de denir), 4NF şeklinde adlandırılır ve yukarı doğru devam eder. Ancak daha yukarı normalizasyon seviyeleri çok nadiren kullanılır çünkü çoğu zaman uygulanması mümkün olmayabilir.

Konuyu detaylandırabilmek için bir veri tabanı oluşturalım ve normalizasyonunu yapalım. 

![Ekran Alıntısı](https://user-images.githubusercontent.com/84538553/149008310-134b544a-83c0-4cd8-983a-d84ec291e0ac.JPG)

Bir veri tabanının 1NF olabilmesi için aşağıdaki özellikleri karşılayabilmesi gerekir: 

•Aynı tablo içinde tekrarlayan kolonlar bulunamaz

•Her kolonda yalnızca bir değer tanımlanmalıdır

•Her satır bir eşsiz anahtarla tanımlanmalıdır (Unique Key - Primary Key)

**Satır Ekleme:** Yeni bir kullanıcı tanımlandığında ders kodu girilmesi zorunludur. 

**Satır Silme:** Kullanıcı silersek tablodan bir bölümde silmiş oluruz, örnek vermek gerekirse eğer 26365 numaralı öğrenciyi silersek ve sadece bir öğrenci kayıtlıysa o bölüme doğal olarak o bölümde silinecektir. 

**Satır Güncelleme:** Bir öğrencinin bölümü değiştiğinde birden fazla alanın güncelleştirilmesi gerekecektir.

**2NF (2. Normal Form);**

İkinci normal formun ilk normal form üzerinde tek kuralı vardır. O da anahtar olarak tanımlanabilecek bir anahtara bütün diğer kolonların tam bağlı olması ve herhangi bir alt kümesine bağlı olmamasıdır.

![Ekran Alıntısı](https://user-images.githubusercontent.com/84538553/149008845-79fb5bcd-84da-48a2-8c81-320824d706c1.JPG)

**Satır Silme:** Bazı durumlarda bir bölümde bir kayıt bulunur. O sütundaki başka bir kayıtta sadece bir veri içeriyorsa silinen bölümle beraber diğer veri de silinecektir. Örneğin Öğrenci tablosunda ki öğrencinin bölümünü ele alalım. Öğrenci silinirse ve sadece bir öğrenci o bölümdeyse öğrenci ile beraber bölümde silinecektir.

**3NF (3. Normal Form);**

Bir veri tabanının 3NF olabilmesi için aşağıdaki özellikleri karşılayabilmesi gerekir:

Veri tabanı 2NF olmalıdır.

Anahtar olmayan hiç bir kolon bir diğerine (anahtar olmayan başka bir kolona) bağıl olmamalı ya da geçişken fonksiyonel bir bağımlılığı (transitional functional dependency) olmamalıdır. Başka bir deyişle her kolon eşsiz anahtara tam bağımlı olmak zorundadır.

Veri tekrarını azaltmak için tanım tabloları oluşturulur. 

Veri tabanımızı 3NF şartlarına uydurabilmek için anahtar olmayan ve eşsiz anahtara tam bağımlı olmayan tüm kolonları kaldırmalıyız.

- #### **ORM Kütüphaneleri**

ORM ve ya Object Relational Mapping denilen kavram aslında bizim kod bloklarımız ile veritabanımız arasında oluşan bir köprüdür. İlişkisel Veritabanımız, bizim katmanlara ayırdığımız programımız arasında (OOP) veri alışverişini sağlar. ORM veritabanımızda ki tablolarımızı class’lara çevirir. Bu class yapısı ile bizim programlama işleminde ki veritabanı  bölümlerinde daha az zaman harcamamıza olanak sağlamakta. ORM ile işlemlerin daha kısalması ve daha düzenli bir şekilde devam etmesini sağlamaktadır.

ORM bizim veritabanımızı bir harita olarak önümüze koyar. Karmaşık bir veritabanı yapısını daha rahat görmemize olanak sağlamaktadır.

Örnek olarak Hibernate Java’da kullanılan bir ORM dir.

##### ORM Tekniğinin Dezavantajları

- ORM teorisini ve tekniğini öğrenmek zaman alabilir. ORM kütüphaneleri oldukça karmaşık kütüphanelerdir.
- ORM araçlarının, konfigurasyonlarının yapılması ve uygulamaya entegre edilmeleri gereklidir. (Bu entegre işlemi başka frameworkler ile hızlı ve kolayca halledebilebilir. Örnek olarak, Java için Spring Framework özellikle Spring Boot ve Spring Data kullanılabilir)
- Yüksek performans gerektiren veya kompleks sorgular barındıran uygulamalarda, ORM sorguları optimize edilmezse düşük performans sunabilir.



- #### **Thread Pool Nedir**?

Büyük sistemlerde ve framework’lerde (mesela Spring Framework) Thread Pool isminde çeşitli yapılar bulunur. Thread Pool’un amacı sistemdeki Thread sayısını kontrol altında tutmak ve yaratılan belirli sayıdaki Thread’leri işi bitince sonlandırmak yerine gelecekteki olası işler için bekletmektir. Bir Thread Pool yaratıldığında belirli sayıda Thread’i yaratır ve yapılacak işler gelene kadar bu Thread’leri bekletir. Yapılacak işler sıraya girdikçe boşta bulunan Thread’lerden birisi uyanıp işi yapar ve tekrar bekleme durumuna geçer.

- #### **Scalability Nedir?**

Büyüyen, gelişen, artan isteklere yanıt vermesi gereken bir sistemin, çalışmanın, işlemin veya yazılımın bu isteklere cevap verme, yönetme ve sorunlarla başa çıkmak yeteneğini scalability olarak tanımlayabiliriz.  Ölçeklenebilirlik, web uygulamalarında kullanıcıların aynı anda bir işlemi yapmak istemelerine karşı bu istekleri gerçekleştirme durumu, oranıdır.

Esas olarak ne kadar kaynağa sahip olunursa olsun, belirli bir noktadan sonra yüksek average response time, yada düşük throughput gibi performans sorunları ile karşılaşılmaktadır. Bu noktada, daha fazla donanım eklenerek (scaling), sorunlar çözümlenebiliyorsa bu yaklaşım uygulanmalıdır. Eğer çözümlenemiyor ise, ölçeklenme sorunları yaşandığı söylenebilir.

##### **Vertical Scaling**

Mecutta var olan bir sunucuya daha fazla kaynak aktarılması ile gerçekleştirilmektedir. Bu yaklaşım genellikle sanallaştırılmış ortamlarda daha yaygın olarak kullanılabilmektedir. Sanallaştırma çözümleri üzerinde (Vmware, Hyper-V vb.) CPU, Memory gibi kaynakların arttırılması ile mümkün olmaktadır. En büyük avantajı, mevcut uygulama mimarisi üzerinde değişiklik gerektirmemesi iken, var olan baz donanım her zaman kısıtlayıcı bir unsur olmaktadır.

##### Horizontal Scaling

Kullanıcılardan gelen isteklerin, farklı uygulama sunucularına yönlendirilmesinin var olan sunucuların kapasitesini arttırmaktan daha kolay olduğu durumlarda tercih edilmektedir. Özellikle cloud ortamlarda kolaylıkla gerçekleştirilebilmektedir. Ayrıca vertical scaling ile erişilebilecek maksimum bir kapasite olduğu için, bir noktadan sonra horizontal scaling yapılması zorunlu hale gelmektedir. Ayrıca, düşük maliyetli sunucular ile kapasitenin arttırımı ve availability açısından da avantaj sağlamaktadır. Ancak bu tarz bir yaklaşım için, uygulamanın uygun bir mimari ile geliştirilmiş olması gerekmektedir.

- #### **Sharding Nedir?**

Sharding, yatay bölümleme olarak da tanımlanan bir veri tabanı bölümleme şekline verilen isimdir.

İşlem performansını iyileştirme ve sorgu yanıt süresini kısaltma fikri üzerine kurulu olan sharding, çok büyük veri tabanını daha küçük ve daha kolay yönetilebilir bölümlere ayırmayı sağlar.

- #### **Data Replication Nedir?**

 Tüm kullanıcılar için, yapılan işlemler adına herhangi bir tutarsızlık veya sapma gibi bir durum oluşmadan veritabanında biriken verileri kaynaklardan alıp, diğer birden farklı kaynaklara taşıma olayıdır. Dağıtılmış veri tabanı olarak oluşturulan bu sistemde, veriler kişinin isteğine göre hareket eder ve iki farklı kullanıcı birbirlerinin çalışmalarına müdahale etmeden görevlerini yerine getirebilirler. Kısacası veri replikasyonu, internet ortamında bir karışıklık oluşmadan verilerin rahatça hareket edebilmesidir.

Bu işlemler sırasında tüm biriken veriler replike edilebilir. Veri Replikasyonu, yapılan işlemlerin çoğalmasının farkına vararak saptar. Böylece çoğalan veriler düzgün bir şekilde güncelleme alır ve senkronize işlemi kusursuz şekilde tamamlanır.