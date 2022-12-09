<div dir=”rtl”>
 
 # آزمایش پنجم آزمایشگاه مهندسی نرم‌افزار
عنوان آزمایش:
کاربرد عملی الگوهای طراحی شی‌گرای Abstract Factory و Prototype با استفاده از روش Test Driven Development
 
 ## اعضای گروه
 یاسمن شیخان - 97101915 و امیرحسین علی‌محمدی - 97110166
 
 
## گزارش
  
### پیاده سازی الگوی طراحی Abstract factory:
ابتدا تست را طراحی می کنیم.
![abstract_Design_Pattern_UML](https://raw.githubusercontent.com/yasmansh/SE_LAB/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture11.jpg?token=GHSAT0AAAAAAB2RRMG3RBD7WJUG6YTESAQ2Y4TQPYQ)

حال زمان کد زدن است. ایتدا دو نوع Garden تعریف می کنیم. یکی درخت و دیگری گل

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture03.JPG)

سپس دو نوع مکان یکی ایرانی و دیگری ژاپنی را تعریف می کنیم.

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture04.JPG)

حال کد باغچه را می زنیم که مکان و نوع باغچه را می گیرد و همچنین برای آن set و get تعریف می کنیم.

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture08.JPG)

سپس کلاس Flower و Tree را می سازیم که از Garden ارث‌بری می کند.

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture09.JPG)

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture10.JPG)

سپس کد مربوط به ساخت باغچه ژاپنی را می زنیم که بر اساس نوع باغچه که گل است یا درخت یک گل یا درخت ژاپنی می سازد.

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture05.JPG)

به طریق مشابه باغچه ایرانی را هم می سازیم.

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture06.JPG)

سپس کد اصلی GardenCreator را می زنیم که بر اساس این که باغچه ایرانی است یا ژاپنی تابع مربوطه را صدا می کند.

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture07.JPG)

در آخر کد را کامپایل می کنیم و می بینیم یک مشکل دسترسی داریم که به خاطر پابلیک نبودن کد ما است.

![abstract_Design_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture01.JPG)

حال زمان ران کردن تست ها می رسد.

![abstract_Design_Pattern_UML](https://raw.githubusercontent.com/yasmansh/SE_LAB/main/Exp5/Part1%20-%20Abstract%20Factory/Pics/Capture12.jpg?token=GHSAT0AAAAAAB2RRMG3W3GVMTOAFVQ3U5ESY4TQQLQ)

 
 ### پیاده سازی الگوی طراحی Prototype: 
 
 مساله به این شکل است که در کلاسی دو نوع دانش آموز داریم: ایرانی و ژاپنی و حال قرار است با طراحی Prototype این سوال را حل کنیم.
 ابتدا تست را طراحی می کنیم.
 
 ![Prototype_Pattern_UML](https://raw.githubusercontent.com/yasmansh/SE_LAB/main/Exp5/Part2%20-%20Prototype/Pics/Capture05.jpg?token=GHSAT0AAAAAAB2RRMG3OS35BB5VVY6A2NZ4Y4TQODQ)
 
 ابتدا کلاس دانش آموز را ایجاد می کنیم و برای دنبال کردن pattern کلاس clonnable را implement می کنیم.
 
 ![Prototype_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part2%20-%20Prototype/Pics/Capture02.JPG)
 
 در این بخش دانش آموز ژاپنی را تعریف می کنیم و در آن nationality را به ژاپنی تغییر می دهیم.
 
 ![Prototype_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part2%20-%20Prototype/Pics/Capture03.JPG)
 
 به طریق مشابه دانش آموز ایرانی را تعریف می کنیم.
 
 ![Prototype_Pattern_UML](https://github.com/yasmansh/SE_LAB/blob/main/Exp5/Part2%20-%20Prototype/Pics/Capture04.JPG)
 
 همچنین این کد به مشکلی نخورد پس نیازی به تغییر آن نبود.
 
 حال زمان تست کردن است.
 
 ![Prototype_Pattern_UML](https://raw.githubusercontent.com/yasmansh/SE_LAB/main/Exp5/Part2%20-%20Prototype/Pics/Capture06.jpg?token=GHSAT0AAAAAAB2RRMG3WANVAA2AWEXRKXWGY4TQO3Q)
 

  ### پیاده‌سازی الگوی طراحی Builder:
الگوی طراحی Builder، در مواقعی که attribute های زیاد و شی پیچیده‌ای داریم  کاربرد دارد.
یدر این الگو، یک  اینترفیس Builder داریم و تعدادی ConcreateBuilder که آن اینترفیس را پیاده سازی میکنند و هرکدام مسئول ساخت یک نوع product میباشد. همچنین یک Director داریم که دارای builder بوده و از متدهای آن برای ساخت محصولات استفاده میکند. فراخوانی متدهای builder و ترتیب آن در اختیار director میباشد.
![2](https://user-images.githubusercontent.com/45336465/206543652-8f7c7b14-ac8a-4ed4-8731-1c131349a950.png)
![Builder_Design_Pattern_UML](https://user-images.githubusercontent.com/45336465/206544038-6a96dbfa-e40c-4caf-a926-168d5cf87964.jpg)

  
برای این بخش ما از مثال ارایه شده در فیلم آموزشی یعنی وسیله نقلیه در دو نوع اتومبیل و اتوبوس استفاده میکنیم.
هر وسیله در اینجا دارای ویژگی‌های نوع (اتومبیل یا اتوبوس)، موتور(حجم موتور و میزان مصرف بنزین برحسب مایل)، و تعداد صندلی میباشد.
 concreateBuilderهای ما در این مثال، CarBuilder و BusBuilder میباشد.
 Client نیز برای ساخت وسیله مدنظر خود، ابتدا باید یک director ایجاد کرده و سپس builder وسیله موردنظر را ساخته و به  متد سازنده director بدهد. مثلا constructCar
 سپس توسط متد getResult سازنده، وسیله نقلیه مدنظرش را دریافت میکند.
 ![7](https://user-images.githubusercontent.com/45336465/206543876-300d3759-b3a5-4cc5-bbd9-4c8b63154e68.png)
![8](https://user-images.githubusercontent.com/45336465/206543945-b4b1a809-3543-4c29-adf6-df4ec90805b4.png)

  
 با روش TDD به پیاده‌سازی و تست میپردازیم.
 ابتدا انتظارات برنامه را به صورت تست مینویسیم. که شامل بررسی صحت نوع وسیله نقلیه اتومبیل، صحت نوع وسیله نقلیه اتوبوس، صحت موتور اتومبیل، صحت موتور اتوبوس، صحت تعدادصندلی اتومبیل، صحت تعداد صندلی اتوبوس، صحت تعداد صندلی اتومبیل پس از تغییر آن و صحت تعداد صندلی اتوبوس پس از تغییر آن میباشد.چون نوع وسیله و موتور نباید تغییر کند به تغییر آنها نمیپردازیم.
 سپس تست هارا کامپایل کرده و به خطای زیر درباره assertEquals با دو double برخوردیم.
![5](https://user-images.githubusercontent.com/45336465/206543734-1ed715a9-6186-4dc5-bc12-6c15af5a639a.png)

  ایراد فوق را برطرف کرده و مجددا تست‌ها را اجرا میکنیم. مشاهده میشود که تست ها به درستی پاس شدند.
![6](https://user-images.githubusercontent.com/45336465/206543804-6c5314cb-c4f2-498d-9a62-83ed23ba580f.png)


 ## پرسش‌ها
 ### 1. در کتاب GoF سه دسته الگوی طراحی معرفی شده است. آنها را نام ببرید و در مورد هر دسته در حد دو خط توضیح دهید.
 دسته ایجادی یا   Creational Design Pattern:
تمرکز اصلی این دسته بر این است که  چگونه اشیا را ایجاد میکنیم.
درواقع به الگوهای طراحی نرم‌افزاری میگویند که با مکانیسم‌های ایجاد و خلق اشیاء سروکار دارند تا اشیاء را به روشی متناسب با موقعیت شیء مورد نظر، ایجاد نمایند.

 دسته ساختاری یا Structural Design Pattern:
هدف اصلی این دسته، جداسازی پیاده سازی از اینترفیس است.این ها الگوهای طراحی هستند که با شناسایی یک راه ساده برای تحقق روابط بین موجودیت ها، طراحی را آسان می کنند.

 دسته رفتاری یا Behavioral Design Pattern:
الگوهای طراحی رفتاری آن دسته از الگوهای طراحی هستند که الگوهای ارتباطی مشترک را بین اشیاء شناسایی کرده و آن‌ها را تحقق می‌بخشند. تمرکز اصلی  این دسته بر نحوه تعاملات و  دسترسی ها به اشیا در زمان اجرا میباشد و با انجام این کار، این الگوها انعطاف‌پذیری در برقراری این ارتباط را افزایش می‌دهند.

 ### 2. سه الگوی استفاده شده در این آزمایش جزو کدام دسته هستند؟
هر سه الگوی استفاده شده در این آزمایش، از دسته Creational pattern میباشد.
![1](https://user-images.githubusercontent.com/45336465/206543508-fdae3c51-63b1-41a9-bf02-8c4f594a46fb.png)

 
 ### 3. فرق اصلی پنج اصل SOLID با الگوهای طراحی مطرح‌شده در GoF چیست؟
 
 فرق اصلی این دو در سطح انتزاع آنهاست. سطح انتزاع اصول پنجگانه SOLID در سطح کلان‌تر و کامپوننت بوده درحالیکه سطح انتزاع الگوهای GoF در سطح سناریو میباشد. و (سناریو) ریزدانه‌تر از (اصل) میباشد.
 درواقع اصول دستورالعمل های کلی هستند درحالیکه الگوهای طراحی، راه حل‌های خاص‌منظوره‌تری برای مجموعه ای از مشکلات و مختص سناریوی خاصی میباشند.
 
 اصول SOLID مجموعه‌ای از دستورالعمل‌های کلی هستند که به طور گسترده و  در طول فرآیند طراحی ساختار کد قابل اجرا هستند
 الگوهای طراحی، معمولا خاص تر بوده و به یک راه حل خاص برای یک نوع رایج از نیازها و درسطح سناریو و ساختار کد میپردازند. 
 
 
 
  ### 4. الگوی طراحی Singleton کدام یک از اصول SOLID را نقض میکند؟
  الگوی Singleton دو مشکل را همزمان حل می کند و اصل مسئولیت واحد (Single-Responsibility)  را نقض می کند.
  
  مسیله اول اینکه اطمینان حاصل کنیم که یک کلاس فقط یک نمونه دارد.  و مسیله دوم اینکه یک global access point به آن نمونه داشته باشیم. درواقع الگوی Singleton به شما امکان می دهد از هر کجای برنامه به برخی از شی ها دسترسی داشته باشید. با این حال، آن نمونه را از بازنویسی شدن توسط کدهای دیگر نیز محافظت می کند.
  
  درنتیجه الگوی طراحی Singleton اصل مسئولیت واحد را نقض می کند زیرا اشیاء نحوه ایجاد و مدیریت life-cycle خود را کنترل می کنند. و این به وضوح با اصل مسئولیت واحد که می گوید یک کلاس باید یک و تنها یک دلیل برای تغییر داشته باشد در تضاد است.
 
 از طرف دیگر شاید بتوان گفت این الگو، اصل Open-Closed را نیز نقض میکند. زیرا در این الگوی طراحی، کلاس بر ایجاد نمونه کنترل دارد، در حالی که کاربران فقط به یک نمونه concreate از کلاس دسترسی دارند. و درنتیجه تغییر در آن بدون ایجاد تغییرات گسترده در سراسر برنامه غیرممکن است و کلاس editable میباشد که مخالف با اصل بیان شده است.
