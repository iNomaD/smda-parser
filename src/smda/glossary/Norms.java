package smda.glossary;


/**
 * Cache' Java Class Generated for class smda.glossary.Norms on version Cache for Windows (x86-64) 2016.1 (Build 617U) Mon Dec 14 2015 10:59:36 EST.<br>
 *
 * @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms</A>
**/

public class Norms extends com.intersys.classes.SerialObject implements java.io.Serializable {
    private static final long serialVersionUID = 6070;
    private static String CACHE_CLASS_NAME = "smda.glossary.Norms";
    /**
           <p>NB: DO NOT USE IN APPLICATION(!!!).
           <br>Use <code>smda.glossary.Norms.open</code> instead!</br></p>
           <p>
           Used to construct a Java object, corresponding to existing object
           in Cache database.
           </p>
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
    */
    public Norms (com.intersys.cache.CacheObject ref) throws com.intersys.objects.CacheException {
        super (ref);
    }
    public Norms (com.intersys.objects.Database db, String initstr) throws com.intersys.objects.CacheException {
        super (((com.intersys.cache.SysDatabase)db).newCacheObject (CACHE_CLASS_NAME,initstr));
    }
    public static com.intersys.classes.RegisteredObject createClientObject (com.intersys.objects.Database db)throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).newClientObject(CACHE_CLASS_NAME));
        return new Norms (cobj);
    }
    public static com.intersys.classes.SerialObject open (com.intersys.objects.Database db, byte[] serialState) throws com.intersys.objects.CacheException {
         com.intersys.cache.CacheObject cobj = ((com.intersys.cache.SysDatabase)db).deserializeObject (CACHE_CLASS_NAME, serialState);
         return (com.intersys.classes.SerialObject) cobj.newJavaInstance();
    }
    /**
       Creates a new instance of object "smda.glossary.Norms" in Cache
       database and corresponding object of class
       <code>smda.glossary.Norms</code>.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @throws com.intersys.objects.CacheException in case of error.

              @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
              @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
     */
    public Norms (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        super (((com.intersys.cache.SysDatabase)db).newCacheObject (CACHE_CLASS_NAME));
    }
    /**
       Runs method <code> %OpenId </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>smda.glossary.Norms</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>smda.glossary.Norms</code> or of
      any of its subclasses. Cast to <code>smda.glossary.Norms</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
      <code>Id</code>.

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Norms
     */
    public static com.intersys.classes.RegisteredObject _open (com.intersys.objects.Database db, com.intersys.objects.Id id) throws com.intersys.objects.CacheException {
        return open(db, id);
    }
    /**
       Runs method <code> %OpenId </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>smda.glossary.Norms</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>smda.glossary.Norms</code> or of
      any of its subclasses. Cast to <code>smda.glossary.Norms</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
      <code>Id</code>.

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Norms
     */
    public static com.intersys.classes.RegisteredObject open (com.intersys.objects.Database db, com.intersys.objects.Id id) throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).openCacheObject(CACHE_CLASS_NAME, id.toString()));
        return (com.intersys.classes.RegisteredObject)(cobj.newJavaInstance());
    }
    /**
       Runs method <code> %OpenId </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>smda.glossary.Norms</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>smda.glossary.Norms</code> or of
      any of its subclasses. Cast to <code>smda.glossary.Norms</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
      <code>Id</code>.
      @param concurrency Concurrency level.  represented as
      <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://Denis-PC:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Norms
     */
    public static com.intersys.classes.RegisteredObject _open (com.intersys.objects.Database db, com.intersys.objects.Id id, int concurrency) throws com.intersys.objects.CacheException {
        return open(db, id, concurrency);
    }
    /**
       Runs method <code> %OpenId </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>smda.glossary.Norms</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>smda.glossary.Norms</code> or of
      any of its subclasses. Cast to <code>smda.glossary.Norms</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
      <code>Id</code>.
      @param concurrency Concurrency level.  represented as
      <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://Denis-PC:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Norms
     */
    public static com.intersys.classes.RegisteredObject open (com.intersys.objects.Database db, com.intersys.objects.Id id, int concurrency) throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).openCacheObject(CACHE_CLASS_NAME, id.toString(), concurrency));
        return (com.intersys.classes.RegisteredObject)(cobj.newJavaInstance());
    }
    /**
       Runs method <code> %Open </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>smda.glossary.Norms</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>smda.glossary.Norms</code> or of
      any of its subclasses. Cast to <code>smda.glossary.Norms</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.
       @param oid Object ID as specified in Cache. represented as
      <code>Oid</code>.


       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Norms(com.intersys.objects.Database)
     */
    public static com.intersys.classes.RegisteredObject _open (com.intersys.objects.Database db, com.intersys.objects.Oid oid) throws com.intersys.objects.CacheException {
        return open(db, oid);
    }
    /**
       Runs method <code> %Open </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>smda.glossary.Norms</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>smda.glossary.Norms</code> or of
      any of its subclasses. Cast to <code>smda.glossary.Norms</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.
       @param oid Object ID as specified in Cache. represented as
      <code>Oid</code>.


       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Norms(com.intersys.objects.Database)
     */
    public static com.intersys.classes.RegisteredObject open (com.intersys.objects.Database db, com.intersys.objects.Oid oid) throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).openCacheObject(CACHE_CLASS_NAME, oid.getData()));
        return (com.intersys.classes.RegisteredObject)(cobj.newJavaInstance());
    }
    /**
       Runs method <code> %Open </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>smda.glossary.Norms</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>smda.glossary.Norms</code> or of
      any of its subclasses. Cast to <code>smda.glossary.Norms</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.
       @param oid Object ID as specified in Cache. represented as
      <code>Oid</code>.
      @param concurrency Concurrency level.  represented as
      <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://Denis-PC:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>

      @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Norms(com.intersys.objects.Database)
     */
    public static com.intersys.classes.RegisteredObject _open (com.intersys.objects.Database db, com.intersys.objects.Oid oid, int concurrency) throws com.intersys.objects.CacheException {
        return open(db, oid, concurrency);
    }
    /**
       Runs method <code> %Open </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>smda.glossary.Norms</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>smda.glossary.Norms</code> or of
      any of its subclasses. Cast to <code>smda.glossary.Norms</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.
       @param oid Object ID as specified in Cache. represented as
      <code>Oid</code>.
      @param concurrency Concurrency level.  represented as
      <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://Denis-PC:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>

      @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Norms(com.intersys.objects.Database)
     */
    public static com.intersys.classes.RegisteredObject open (com.intersys.objects.Database db, com.intersys.objects.Oid oid, int concurrency) throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).openCacheObject(CACHE_CLASS_NAME, oid.getData(), concurrency));
        return (com.intersys.classes.RegisteredObject)(cobj.newJavaInstance());
    }
    /**
       Runs method <code> %Delete </code> in Cache to delete an object
       from Cache database.

       Deletes the stored version of the object with OID <var>oid</var> from the database.
       It does not remove any in-memory versions of the object that may be present.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
       <code>Id</code>.

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_deleteId(com.intersys.objects.Database, com.intersys.objects.Id)
           @see #Norms
     */
    public static void delete (com.intersys.objects.Database db, com.intersys.objects.Id id) throws com.intersys.objects.CacheException {
        ((com.intersys.cache.SysDatabase)db).deleteObject(CACHE_CLASS_NAME, id);
    }
    /**
       Runs method <code> %Delete </code> in Cache to delete an object
       from Cache database.

       Deletes the stored version of the object with OID <var>oid</var> from the database.
       It does not remove any in-memory versions of the object that may be present.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
       <code>Id</code>.
       @param concurrency Concurrency level.  represented as
       <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://Denis-PC:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>


       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_deleteId(com.intersys.objects.Database, com.intersys.objects.Id)
           @see #Norms
     */
    public static void delete (com.intersys.objects.Database db, com.intersys.objects.Id id, int concurrency) throws com.intersys.objects.CacheException {
        ((com.intersys.cache.SysDatabase)db).deleteObject(CACHE_CLASS_NAME, id, concurrency);
    }
    /**
       Runs method <code> %Delete </code> in Cache to delete an object
       from Cache database.

       Deletes the stored version of the object with OID <var>oid</var> from the database.
       It does not remove any in-memory versions of the object that may be present.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
       <code>Id</code>.

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_deleteId(com.intersys.objects.Database, com.intersys.objects.Id)
           @see #Norms
     */
    public static void _deleteId (com.intersys.objects.Database db, com.intersys.objects.Id id) throws com.intersys.objects.CacheException {
        delete(db, id);
    }
    /**
       Runs method <code> %Delete </code> in Cache to delete an object
       from Cache database.

       Deletes the stored version of the object with OID <var>oid</var> from the database.
       It does not remove any in-memory versions of the object that may be present.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
       <code>Id</code>.
       @param concurrency Concurrency level.  represented as
       <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://Denis-PC:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>


       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_deleteId(com.intersys.objects.Database, com.intersys.objects.Id)
           @see #Norms
     */
    public static void _deleteId (com.intersys.objects.Database db, com.intersys.objects.Id id, int concurrency) throws com.intersys.objects.CacheException {
        delete(db, id, concurrency);
    }
    /**
       Returns class name of the class smda.glossary.Norms as it is in
      Cache Database. Note, that this is a static method, so no
      object specific information can be returned. Use
      <code>getCacheClass().getName()</code> to get the class name
      for specific object.
       @return Cache class name as a <code>String</code>
      @see #getCacheClass()
      @see com.intersys.objects.reflect.CacheClass#getName()
     */
    public static String getCacheClassName( ) {
        return CACHE_CLASS_NAME;
    }

   /**
           Allows access metadata information about type of this object
           in Cache database. Also can be used for dynamic binding (accessing
           properties and calling methods without particular class known).

           @return <code>CacheClass</code> object for this object type.
   */
    public com.intersys.objects.reflect.CacheClass getCacheClass( ) throws com.intersys.objects.CacheException {
        return mInternal.getCacheClass();
    }

    public static void checkAllFieldsValid(com.intersys.objects.Database db ) throws com.intersys.objects.CacheException {
    }

    /**
       Verifies that all fields from Cache class are exposed with
       accessor methods in Java class and that values for indexes in
       zObjVal are the same as in Cache. It does not return anything
       but it throws an exception in case of inconsistency.

       <p>But if there is any inconsistency in zObjVal indexes this is fatal and class can not work correctly and must be regenerated

       @param db Database used for connection. Note that if you are
       using multiple databases the class can be consistent with one
       and inconsistent with another.
       @throws com.intersys.objects.InvalidClassException if any inconsistency is found.
       @throws com.intersys.objects.CacheException if any error occurred during
       verification, e.g. communication error with Database.
       @see com.intersys.objects.InvalidPropertyException

     */
    public static void checkAllMethods(com.intersys.objects.Database db ) throws com.intersys.objects.CacheException {
        checkAllMethods(db, CACHE_CLASS_NAME, Norms.class);
    }
    public static void checkBefore3MonthsMaxValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>Before3MonthsMax</code>.
       <Description>
       @return current value of <code>Before3MonthsMax</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMax"> Before3MonthsMax</A>
    */
    public java.lang.Double getBefore3MonthsMax()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("Before3MonthsMax",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>Before3MonthsMax</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMax"> Before3MonthsMax</A>
    */
    public void setBefore3MonthsMax(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("Before3MonthsMax", dh);
        return;
    }

    public static void checkBefore3MonthsMinValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>Before3MonthsMin</code>.
       <Description>
       @return current value of <code>Before3MonthsMin</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMin"> Before3MonthsMin</A>
    */
    public java.lang.Double getBefore3MonthsMin()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("Before3MonthsMin",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>Before3MonthsMin</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMin"> Before3MonthsMin</A>
    */
    public void setBefore3MonthsMin(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("Before3MonthsMin", dh);
        return;
    }

    public static void checkChildrenMaxValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>ChildrenMax</code>.
       <Description>
       @return current value of <code>ChildrenMax</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMax"> ChildrenMax</A>
    */
    public java.lang.Double getChildrenMax()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("ChildrenMax",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>ChildrenMax</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMax"> ChildrenMax</A>
    */
    public void setChildrenMax(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("ChildrenMax", dh);
        return;
    }

    public static void checkChildrenMinValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>ChildrenMin</code>.
       <Description>
       @return current value of <code>ChildrenMin</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMin"> ChildrenMin</A>
    */
    public java.lang.Double getChildrenMin()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("ChildrenMin",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>ChildrenMin</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMin"> ChildrenMin</A>
    */
    public void setChildrenMin(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("ChildrenMin", dh);
        return;
    }

    public static void checkManMaxValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>ManMax</code>.
       <Description>
       @return current value of <code>ManMax</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMax"> ManMax</A>
    */
    public java.lang.Double getManMax()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("ManMax",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>ManMax</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMax"> ManMax</A>
    */
    public void setManMax(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("ManMax", dh);
        return;
    }

    public static void checkManMinValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>ManMin</code>.
       <Description>
       @return current value of <code>ManMin</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMin"> ManMin</A>
    */
    public java.lang.Double getManMin()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("ManMin",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>ManMin</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMin"> ManMin</A>
    */
    public void setManMin(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("ManMin", dh);
        return;
    }

    public static void checkNewbornMaxValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>NewbornMax</code>.
       <Description>
       @return current value of <code>NewbornMax</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMax"> NewbornMax</A>
    */
    public java.lang.Double getNewbornMax()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("NewbornMax",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>NewbornMax</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMax"> NewbornMax</A>
    */
    public void setNewbornMax(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("NewbornMax", dh);
        return;
    }

    public static void checkNewbornMinValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>NewbornMin</code>.
       <Description>
       @return current value of <code>NewbornMin</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMin"> NewbornMin</A>
    */
    public java.lang.Double getNewbornMin()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("NewbornMin",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>NewbornMin</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMin"> NewbornMin</A>
    */
    public void setNewbornMin(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("NewbornMin", dh);
        return;
    }

    public static void checkWomanMaxValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>WomanMax</code>.
       <Description>
       @return current value of <code>WomanMax</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMax"> WomanMax</A>
    */
    public java.lang.Double getWomanMax()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("WomanMax",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>WomanMax</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMax"> WomanMax</A>
    */
    public void setWomanMax(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("WomanMax", dh);
        return;
    }

    public static void checkWomanMinValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>WomanMin</code>.
       <Description>
       @return current value of <code>WomanMin</code> represented as
       <code>java.lang.Double</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMin"> WomanMin</A>
    */
    public java.lang.Double getWomanMin()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("WomanMin",false);
       return dh.getDouble();
    }

    /**
       Sets new value for <code>WomanMin</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.Double</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMin"> WomanMin</A>
    */
    public void setWomanMin(java.lang.Double value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("WomanMin", dh);
        return;
    }

    /**
     <p>Runs method %ClassName in Cache.</p>
     <p>Description: Returns the object's class name. The <var>fullname</var> determines how the
class name is represented. If it is 1 then it returns the full class name
including any package qualifier. If it is 0 (the default) then it returns the
name of the class without the package, this is mainly for backward compatibility
with the pre-package behaviour of %ClassName.</p>
     @param db represented as com.intersys.objects.Database
     @param fullname represented as java.lang.Boolean
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#%ClassName"> Method %ClassName</A>
    */
    public static java.lang.String sys_ClassName (com.intersys.objects.Database db, java.lang.Boolean fullname) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(fullname);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%ClassName",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method %Delete in Cache.</p>
     <p>Description: Deletes streams referenced by this object and calls %Delete on any embedded objects

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.
</p>
     @param db represented as com.intersys.objects.Database
     default argument oid set to ""
     default argument concurrency set to -1
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #sys_Delete(com.intersys.objects.Database,com.intersys.objects.Oid,java.lang.Integer)
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#%Delete"> Method %Delete</A>
    */
    public static void sys_Delete (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%Delete",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %Delete in Cache.</p>
     <p>Description: Deletes streams referenced by this object and calls %Delete on any embedded objects

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.
</p>
     @param db represented as com.intersys.objects.Database
     @param oid represented as com.intersys.objects.Oid
     default argument concurrency set to -1
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #sys_Delete(com.intersys.objects.Database,com.intersys.objects.Oid,java.lang.Integer)
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#%Delete"> Method %Delete</A>
    */
    public static void sys_Delete (com.intersys.objects.Database db, com.intersys.objects.Oid oid) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(oid);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%Delete",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %Delete in Cache.</p>
     <p>Description: Deletes streams referenced by this object and calls %Delete on any embedded objects

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.
</p>
     @param db represented as com.intersys.objects.Database
     @param oid represented as com.intersys.objects.Oid
     @param concurrency represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#%Delete"> Method %Delete</A>
    */
    public static void sys_Delete (com.intersys.objects.Database db, com.intersys.objects.Oid oid, java.lang.Integer concurrency) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[2];
        args[0] = new com.intersys.cache.Dataholder(oid);
        args[1] = new com.intersys.cache.Dataholder(concurrency);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%Delete",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %DeleteId in Cache.</p>
     <p>Description: Deletes the stored version of the object with ID <var>id</var> from the database. 

<p><METHOD>%DeleteId</METHOD> is identical in operation to the <METHOD>%Delete</METHOD> method except 
that it uses and Id value instead of an OID value to find an object.

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.</p>
     @param db represented as com.intersys.objects.Database
     @param id represented as java.lang.String
     default argument concurrency set to -1
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #sys_DeleteId(com.intersys.objects.Database,java.lang.String,java.lang.Integer)
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#%DeleteId"> Method %DeleteId</A>
    */
    public static void sys_DeleteId (com.intersys.objects.Database db, java.lang.String id) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(id);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%DeleteId",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %DeleteId in Cache.</p>
     <p>Description: Deletes the stored version of the object with ID <var>id</var> from the database. 

<p><METHOD>%DeleteId</METHOD> is identical in operation to the <METHOD>%Delete</METHOD> method except 
that it uses and Id value instead of an OID value to find an object.

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.</p>
     @param db represented as com.intersys.objects.Database
     @param id represented as java.lang.String
     @param concurrency represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#%DeleteId"> Method %DeleteId</A>
    */
    public static void sys_DeleteId (com.intersys.objects.Database db, java.lang.String id, java.lang.Integer concurrency) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[2];
        args[0] = new com.intersys.cache.Dataholder(id);
        args[1] = new com.intersys.cache.Dataholder(concurrency);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%DeleteId",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %IsA in Cache.</p>
     <p>Description: Returns true (1) if instances of this class are also instances of the isclass parameter.
That is 'isclass' is a primary superclass of this object.</p>
     @param db represented as com.intersys.objects.Database
     @param isclass represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#%IsA"> Method %IsA</A>
    */
    public static java.lang.Integer sys_IsA (com.intersys.objects.Database db, java.lang.String isclass) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(isclass);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%IsA",args,com.intersys.objects.Database.RET_PRIM);
        return res.getInteger();
    }
    /**
     <p>Runs method %ObjectIsNull in Cache.</p>
     <p>Description: Return true if pOID is a null object and false if the object is not null</p>
     @param db represented as com.intersys.objects.Database
     @param pOID represented as com.intersys.objects.Oid
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#%ObjectIsNull"> Method %ObjectIsNull</A>
    */
    public static java.lang.Boolean sys_ObjectIsNull (com.intersys.objects.Database db, com.intersys.objects.Oid pOID) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(pOID);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%ObjectIsNull",args,com.intersys.objects.Database.RET_PRIM);
        return res.getBoolean();
    }
    /**
     <p>Runs method Before3MonthsMaxDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMaxDisplayToLogical"> Method Before3MonthsMaxDisplayToLogical</A>
    */
    public static java.lang.Double Before3MonthsMaxDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"Before3MonthsMaxDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method Before3MonthsMaxIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMaxIsValid"> Method Before3MonthsMaxIsValid</A>
    */
    public static void Before3MonthsMaxIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"Before3MonthsMaxIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method Before3MonthsMaxLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMaxLogicalToDisplay"> Method Before3MonthsMaxLogicalToDisplay</A>
    */
    public static java.lang.String Before3MonthsMaxLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"Before3MonthsMaxLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method Before3MonthsMinDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMinDisplayToLogical"> Method Before3MonthsMinDisplayToLogical</A>
    */
    public static java.lang.Double Before3MonthsMinDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"Before3MonthsMinDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method Before3MonthsMinIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMinIsValid"> Method Before3MonthsMinIsValid</A>
    */
    public static void Before3MonthsMinIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"Before3MonthsMinIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method Before3MonthsMinLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#Before3MonthsMinLogicalToDisplay"> Method Before3MonthsMinLogicalToDisplay</A>
    */
    public static java.lang.String Before3MonthsMinLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"Before3MonthsMinLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method ChildrenMaxDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMaxDisplayToLogical"> Method ChildrenMaxDisplayToLogical</A>
    */
    public static java.lang.Double ChildrenMaxDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ChildrenMaxDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method ChildrenMaxIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMaxIsValid"> Method ChildrenMaxIsValid</A>
    */
    public static void ChildrenMaxIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ChildrenMaxIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method ChildrenMaxLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMaxLogicalToDisplay"> Method ChildrenMaxLogicalToDisplay</A>
    */
    public static java.lang.String ChildrenMaxLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ChildrenMaxLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method ChildrenMinDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMinDisplayToLogical"> Method ChildrenMinDisplayToLogical</A>
    */
    public static java.lang.Double ChildrenMinDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ChildrenMinDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method ChildrenMinIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMinIsValid"> Method ChildrenMinIsValid</A>
    */
    public static void ChildrenMinIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ChildrenMinIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method ChildrenMinLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ChildrenMinLogicalToDisplay"> Method ChildrenMinLogicalToDisplay</A>
    */
    public static java.lang.String ChildrenMinLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ChildrenMinLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method LogicalToOdbc in Cache.</p>
     <p>Description: 	LogicalToOdbc()
		Construct a string delimited by ODBCDELIMITER from an object's serialized state.</p>
     @param db represented as com.intersys.objects.Database
     default argument val set to ""
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #LogicalToOdbc(com.intersys.objects.Database,java.lang.String)
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#LogicalToOdbc"> Method LogicalToOdbc</A>
    */
    public static java.lang.String LogicalToOdbc (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"LogicalToOdbc",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method LogicalToOdbc in Cache.</p>
     <p>Description: 	LogicalToOdbc()
		Construct a string delimited by ODBCDELIMITER from an object's serialized state.</p>
     @param db represented as com.intersys.objects.Database
     @param val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#LogicalToOdbc"> Method LogicalToOdbc</A>
    */
    public static java.lang.String LogicalToOdbc (com.intersys.objects.Database db, java.lang.String val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"LogicalToOdbc",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method ManMaxDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMaxDisplayToLogical"> Method ManMaxDisplayToLogical</A>
    */
    public static java.lang.Double ManMaxDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ManMaxDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method ManMaxIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMaxIsValid"> Method ManMaxIsValid</A>
    */
    public static void ManMaxIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ManMaxIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method ManMaxLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMaxLogicalToDisplay"> Method ManMaxLogicalToDisplay</A>
    */
    public static java.lang.String ManMaxLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ManMaxLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method ManMinDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMinDisplayToLogical"> Method ManMinDisplayToLogical</A>
    */
    public static java.lang.Double ManMinDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ManMinDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method ManMinIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMinIsValid"> Method ManMinIsValid</A>
    */
    public static void ManMinIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ManMinIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method ManMinLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#ManMinLogicalToDisplay"> Method ManMinLogicalToDisplay</A>
    */
    public static java.lang.String ManMinLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ManMinLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method NewbornMaxDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMaxDisplayToLogical"> Method NewbornMaxDisplayToLogical</A>
    */
    public static java.lang.Double NewbornMaxDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NewbornMaxDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method NewbornMaxIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMaxIsValid"> Method NewbornMaxIsValid</A>
    */
    public static void NewbornMaxIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NewbornMaxIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method NewbornMaxLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMaxLogicalToDisplay"> Method NewbornMaxLogicalToDisplay</A>
    */
    public static java.lang.String NewbornMaxLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NewbornMaxLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method NewbornMinDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMinDisplayToLogical"> Method NewbornMinDisplayToLogical</A>
    */
    public static java.lang.Double NewbornMinDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NewbornMinDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method NewbornMinIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMinIsValid"> Method NewbornMinIsValid</A>
    */
    public static void NewbornMinIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NewbornMinIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method NewbornMinLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#NewbornMinLogicalToDisplay"> Method NewbornMinLogicalToDisplay</A>
    */
    public static java.lang.String NewbornMinLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NewbornMinLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method OdbcToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     default argument val set to ""
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #OdbcToLogical(com.intersys.objects.Database,java.lang.String)
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#OdbcToLogical"> Method OdbcToLogical</A>
    */
    public static java.lang.String OdbcToLogical (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"OdbcToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method OdbcToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#OdbcToLogical"> Method OdbcToLogical</A>
    */
    public static java.lang.String OdbcToLogical (com.intersys.objects.Database db, java.lang.String val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"OdbcToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method WomanMaxDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMaxDisplayToLogical"> Method WomanMaxDisplayToLogical</A>
    */
    public static java.lang.Double WomanMaxDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"WomanMaxDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method WomanMaxIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMaxIsValid"> Method WomanMaxIsValid</A>
    */
    public static void WomanMaxIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"WomanMaxIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method WomanMaxLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMaxLogicalToDisplay"> Method WomanMaxLogicalToDisplay</A>
    */
    public static java.lang.String WomanMaxLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"WomanMaxLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method WomanMinDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMinDisplayToLogical"> Method WomanMinDisplayToLogical</A>
    */
    public static java.lang.Double WomanMinDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"WomanMinDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getDouble();
    }
    /**
     <p>Runs method WomanMinIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMinIsValid"> Method WomanMinIsValid</A>
    */
    public static void WomanMinIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"WomanMinIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method WomanMinLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.Double
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://Denis-PC:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=DENIS&CLASSNAME=smda.glossary.Norms#WomanMinLogicalToDisplay"> Method WomanMinLogicalToDisplay</A>
    */
    public static java.lang.String WomanMinLogicalToDisplay (com.intersys.objects.Database db, java.lang.Double _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"WomanMinLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
}
