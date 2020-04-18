# RoomDataBaseKotlin
<p><b>Best Sample of Persisitance database Room with Kotlin.</p></b>
<h1>Room</h1>
<p><b>Room is a Persistance library that provides an abstraction layer over the top of SqlLite Database.It is robust SQL object mapping library.</b></p>

<h2>Consist of three components.</h2>
<p><b>1. @Entity</b></p>
<p><b> It represent entity in a table. By using this annotation above any dataclass then the name of class becomes TableName and its Data Members becomes name of columns.

<p><b>2. @Dao</b></p>
<p><b> Contains the methods used for accessing the database. like all sql queries.</b></p>
<p><b> @Dao should either be an interface or an abstract class. At compile time, Room will generate an implementation of this class when it is referenced by a Database.</b></p>
<p><b>3. @Database</b></p>
<p><b> We create an abstract class which extends RoomDatabase.It is database layer above SqlLite database.</b></p>


<h2>Room supported queries are :-</h2>
<p><b>1. @Insert </b></p>
<p><b>2. @Update </b></p>
<p><b>3. @Delete </b></p>
<p><b>4. @Query </b></p>
<p><b>5. @RawQuery </b></p>



<h2>Advantages of Room database over SqlLite Database</h2>
<p><b>1. It has extended its support for RxJava , Coroutines , Viewmodel and Paging libraries that makes the work really very easy thus removing huge boilerplate code.</b></p>
<p><b>2. All the queries except the @RawQuery are checked at compile time that means if you write any wrong query then it will throw an complile time exception and the issue will get caught there only.</b></p>
<p><b>3. It will throw IllegalStateException if you try to access database from MainThread.</b></p>


<h2>Steps to update Room Database</h2>
<p><b>1. Update the database version.</b></p>
<p><b>2. Implement migration class.</b></p>
<code>
 val Migration_1_2 : Migration = Object : Migration(1,2){
       override fun migrate(database : SupportSQLiteDataBase){
            database.execSQL("ALTER TABLE users "+ "ADD COLUMN address STRING")
       }
    }
</code>
<p><b> 3. Add the migration class as a parameter to database filter </b></p>
<code>
    Room.databaseBuilder(context.getApplicationContext(),
                        UserDatabase::class.java,"Sample.db")
                        .addMigrations(Migration_1_2)
                        .build();
</code>
<p><b>* if you dont want to handle the migration and dont want to preserve data on database then add fallbackToDestructiveMigrations() method to database filter</b></p>
<code>
    Room.databaseBuilder(context.getApplicationContext(),
                        UserDatabase::class.java,"Sample.db")
                        .fallbackToDestructiveMigrations() // you can define verions inside this function like fallbackToDestructiveMigrations(5) if you want to recreate from particular version.
                        .build();
</code>





