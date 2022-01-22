# <u>**PAYTEN JAVA & SPRING BOOTCAMP**</u>

## **Bölüm Sonu Ödev 4 / ARAŞTIRMA**

- #### **Regresyon Testi**

Regresyon testi uygulama ortamındaki yapılan tüm değişiklikleri; uygulamaya yeni eklenen özellikler, daha önceki yaşanan hataların düzeltilmesinden sonra, mevcut problemlerin giderildiği ve yeni yapılan güncellemelerin, eklenen özelliklerin yeni bir hata üretip üretmediğini kontrol amaçlı olarak yapılan yazılım test türüdür.

Uygulama ve uygulama ortamlarında gerekli değişiklikler ve sabitlemeler yapıldıktan sonra yeniden yapılan testlere çekilme (regresyon) testi denilir. Böylece, önceki testlerde belirlenen sorunların giderildiğinden ve yeni eklenen özelliklerin sorunsuz çalıştığından ve yeni hatalar oluşmadığından emin olunur.

**Yazılım hataları** ya da gerilemelerin (performans düşüklüğü), fonksiyonel ve fonksiyonel olmayan geliştirmelerin, sistemin bazı alanlarına yapılan yamaların, yapılandırma değişiklilerinin **regresyon testi** ile etkileri izlenebilir.

- #### **A/B Testi**

A/B testi (bölme testi veya kova testi olarak da bilinir) hangisinin daha iyi performans gösterdiğini belirlemek için bir web sayfasının veya uygulamanın iki sürümünü birbiriyle karşılaştırmanın bir yöntemidir. A/B testi, esas olarak, bir sayfanın iki veya daha fazla varyantının rasgele kullanıcılara gösterildiği bir deneydir ve hangi varyasyonun belirli bir dönüşüm hedefi için daha iyi performans gösterdiğini belirlemek için istatistiksel analiz kullanılır.

Bir A / B testinde, bir web sayfası veya uygulama ekranı alıp aynı sayfanın ikinci bir sürümünü oluşturmak için onu değiştirirsiniz. Bu değişiklik, tek bir başlık veya düğme kadar basit olabilir veya sayfayı tamamen yeniden tasarlayabilir. Ardından, trafiğinizin yarısı sayfanın orijinal sürümünde gösterilir (kontrol olarak bilinir) ve yarısı sayfanın değiştirilmiş halini gösterir (varyasyon).

Ziyaretçilere kontrol veya varyasyon sunulduğunda, her bir deneyimle olan etkileşimleri ölçülür ve bir analiz tahtasında toplanır ve istatistiksel bir motorla analiz edilir. Daha sonra, deneyim değiştirmenin ziyaretçi davranışı üzerinde olumlu, olumsuz veya hiç bir etkisi olup olmadığını belirleyebilirsiniz.

- #### **Black Box ve White Box Testi**

Penetrasyon testi, firmaların Bilişim Sistemlerini oluşturan altyapı, donanım, yazılım ve uygulamalara öngörülen yöntemler kullanılarak yapılan saldırı sonucunda güvenlik açıklarının tespit edilip bu zafiyetlerin kullanılarak sistemlere sızılmaya çalışılması, bu açıkların nelere sebep olabileceğinin incelenmesi ve sonuçların raporlanmasıdır. Pentest çalışmalarındaki asıl amaç söz konusu güvenlik açıklıklarının sisteme zarar vermeyecek şekilde istismar etmek kötü niyetli kişiler tarafından istismar edilmesini önlemek ve sistemleri daha güvenli hale getirmek amacıyla yetkili kişiler tarafından ve yasal olarak gerçekleştirilen güvenlik testleridir.

Sızma testleri şirketin itibarına zarar verebilecek ve finansal kayba neden olabilecek siber olaylardan kaçınmanızı sağlar. Sızma testi BT kaynaklı riskleri azaltarak, sistemde oluşabilecek açıkları kapatır, sistemde yaşanabilecek kesintileri engeller. Bu şekilde firmanın imajı ve güvenilirliği korunmuş olur. Yasal zorunluluklara uyum sağlar özelikle son zamanlarda KVKK pentest zorunluğuyla firmalar pentest hizmetlerini almaya başlamıştır.

Penetrasyon Testi 3 farklı şekilde yapılabilir:

**1- Kara Kutu (Black Box) Yaklaşımı**

Bu yaklaşımda sızma testinin yapılacağı sistem ile ilgili bir bilgi önceden verilmez. Test edici bir bilgisayar korsanı gibi sisteme sızmaya çalışır. Hedef sisteme sızmak için sistemle ilgili bilgi toplanır; zafiyetler ve açıklar taranır. Harici veya son kullanıcı bakış açısından test etmeyi içerir. Test edicinin yanlışlıkla sisteme zarar verme ihtimali bulunmaktadır.

**2- Beyaz Kutu (White Box) Yaklaşımı**

Sızma testini yapacak ekibe firmada bulunan tüm sistemler hakkında bilgiler verilir. Black box yaklaşımına göre kuruma daha fayda sağlanır. Zafiyetleri bulmak kolaylaşır ve önlem alınması için geçen süre de azalmaktadır. Ekibin zarar verme riski çok azdır.

**3- Gri Kutu (Gray Box) Yaklaşımı**

Gray box testinde firma hakkında sınırlı bilgi verilerek sızma test gerçekleştirilir. Bu test ile firma içerisinde düşük ayrıcalıklara sahip kullanıcıların sistemlere ve firmaya verebileceği zararın test edilebilmesi hedeflenmektedir.

- #### **Mutaston Testi**

Mutasyon Testi, kaynak koddaki belirli ifadeleri değiştirdiğimiz(mutant) ve test senaryolarının hataları bulabildiğini kontrol ettiğimiz bir tür yazılım testidir. Temelde birim testi(unit test) için kullanılan bir beyaz kutu testi türüdür. Mutant programdaki değişiklikler son derece küçük tutulur, bu nedenle programın genel hedefini etkilemez.

Mutasyon testinin amacı, mutant kodunu kaldıracak kadar sağlam olması gereken test vakalarının kalitesini değerlendirmektir. Bu yöntem, programda bir hata oluşturmayı içerdiği için hata tabanlı test stratejisi olarak da adlandırılır.

- #### **Behaviour Driven Development (BDD)**

**Behavior Driven development** (BDD), yazılım süreçlerinin daha test odaklı gitmesini sağlayan bir yaklaşımdır. Aynı zamanda **müşteri ile aramızda yaşayan bir döküman** oluşmasını sağlayabilir. BDD, **Test Driven Development** (TDD) gibi prensip olarak öncelikle test kodları yazılsın daha sonrasında proje kodu yazılsın anlayışını benimsemektedir.

TDD (Test Driven Development) , Kent Back tarafından Extreme Programming’in bir parçası olarak bulunmuş bir programlama tekniğidir. Bu teknik kod yazılmadan önce test senaryoların belirlenmesi ve bu senaryolara bağlı kalınarak kodun yazılması ve Refactor edilmesini desteklemektedir. Bu yöntem aslında basit ve kısa adımlarla önceden tasarlanmış senaryoları hızlı bir şekilde koda dökmeyi hedeflemektedir.

BDD yaklaşımı ilk olarak 2009 yılında Dan North tarafından ortaya atılmıştır. Açılımı Behavior Driven Development olan BDD, TDD yaklaşımının karmaşıklığı gidermek amacıyla ortaya çıkmıştır. Yazılım süreçlerinin daha test odaklı gitmesini sağlayan bir yaklaşımdır. TDD yaklaşımında olduğu gibi burada da yazılım geliştirmeye başlamadan önce test senaryolarının yazılması desteklenmektedir.

**BDD’nin Avantajları :**

· İşbirliğini arttırır ve geliştirir. Konuşma dilinde test senaryoları yazıldığı için ekibe yeni katılan üyeler sürece çok çabuk adapte olabilir ve davranışsal senaryolar yazabilirler.

· Kodun kalitesini artırarak temelde bakım maliyetini düşürür ve proje riskleri en aza indirilir.

· Müşterinin ihtiyacına yönelik belirlenen user storyler aracılığıyla test senaryoları oluşturulup koda döküldüğü için belirlenen ihtiyaçlar daha iyi karşılanmaktadır.

· Geliştiriciler işleyişi daha iyi öngörebildikleri için yazdıkları koda daha fazla güvenirler.

- #### **Agile Test Nedir ?**

Agile metodolojisi, projenin yazılım geliştirme yaşam döngüsü boyunca **sürekli bir tekrar** geliştirme ve test **yinelemesine yardımcı** olan bir uygulamadır Agile bir modelde, her sürüm için test planı yazılır ve güncellenir. Agile test planı, test verisi gereksinimleri, altyapı, test ortamları ve test sonuçları gibi yinelemede yapılan test türlerini içerir.