package com.ata.appbundle.core.data.source.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FilmDatabase_Impl extends FilmDatabase {
  private volatile FilmDao _filmDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `film_entities` (`title` TEXT NOT NULL, `poster` TEXT NOT NULL, `genre` TEXT NOT NULL, `running_time` TEXT NOT NULL, `original_language` TEXT NOT NULL, `overview` TEXT NOT NULL, `type` INTEGER NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`title`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eead632a41fb8872dffbd083d8527529')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `film_entities`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFilmEntities = new HashMap<String, TableInfo.Column>(8);
        _columnsFilmEntities.put("title", new TableInfo.Column("title", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmEntities.put("poster", new TableInfo.Column("poster", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmEntities.put("genre", new TableInfo.Column("genre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmEntities.put("running_time", new TableInfo.Column("running_time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmEntities.put("original_language", new TableInfo.Column("original_language", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmEntities.put("overview", new TableInfo.Column("overview", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmEntities.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilmEntities.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFilmEntities = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFilmEntities = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFilmEntities = new TableInfo("film_entities", _columnsFilmEntities, _foreignKeysFilmEntities, _indicesFilmEntities);
        final TableInfo _existingFilmEntities = TableInfo.read(_db, "film_entities");
        if (! _infoFilmEntities.equals(_existingFilmEntities)) {
          return new RoomOpenHelper.ValidationResult(false, "film_entities(com.ata.appbundle.core.data.source.local.model.FilmEntity).\n"
                  + " Expected:\n" + _infoFilmEntities + "\n"
                  + " Found:\n" + _existingFilmEntities);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "eead632a41fb8872dffbd083d8527529", "5f0168f1b7c5ff1db8ff2c9bbdfec060");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "film_entities");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `film_entities`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FilmDao filmDao() {
    if (_filmDao != null) {
      return _filmDao;
    } else {
      synchronized(this) {
        if(_filmDao == null) {
          _filmDao = new FilmDao_Impl(this);
        }
        return _filmDao;
      }
    }
  }
}
