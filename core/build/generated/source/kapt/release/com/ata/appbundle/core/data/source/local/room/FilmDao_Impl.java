package com.ata.appbundle.core.data.source.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ata.appbundle.core.data.source.local.model.FilmEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FilmDao_Impl implements FilmDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FilmEntity> __insertionAdapterOfFilmEntity;

  private final EntityDeletionOrUpdateAdapter<FilmEntity> __deletionAdapterOfFilmEntity;

  private final EntityDeletionOrUpdateAdapter<FilmEntity> __updateAdapterOfFilmEntity;

  public FilmDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFilmEntity = new EntityInsertionAdapter<FilmEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `film_entities` (`title`,`poster`,`genre`,`running_time`,`original_language`,`overview`,`type`,`status`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FilmEntity value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPoster());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGenre());
        }
        if (value.getRunning_time() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRunning_time());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOriginal_language());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOverview());
        }
        stmt.bindLong(7, value.getType());
        final int _tmp;
        _tmp = value.getStatus() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__deletionAdapterOfFilmEntity = new EntityDeletionOrUpdateAdapter<FilmEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `film_entities` WHERE `title` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FilmEntity value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
      }
    };
    this.__updateAdapterOfFilmEntity = new EntityDeletionOrUpdateAdapter<FilmEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `film_entities` SET `title` = ?,`poster` = ?,`genre` = ?,`running_time` = ?,`original_language` = ?,`overview` = ?,`type` = ?,`status` = ? WHERE `title` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FilmEntity value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPoster());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGenre());
        }
        if (value.getRunning_time() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRunning_time());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOriginal_language());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOverview());
        }
        stmt.bindLong(7, value.getType());
        final int _tmp;
        _tmp = value.getStatus() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
      }
    };
  }

  @Override
  public Object insertMovies(final List<FilmEntity> filmEntities,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFilmEntity.insert(filmEntities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void deleteMovie(final FilmEntity filmEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFilmEntity.handle(filmEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateMovie(final FilmEntity filmEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfFilmEntity.handle(filmEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<FilmEntity>> getMovies() {
    final String _sql = "SELECT * FROM film_entities WHERE type = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"film_entities"}, new Callable<List<FilmEntity>>() {
      @Override
      public List<FilmEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRunningTime = CursorUtil.getColumnIndexOrThrow(_cursor, "running_time");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<FilmEntity> _result = new ArrayList<FilmEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FilmEntity _item;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final String _tmpRunning_time;
            _tmpRunning_time = _cursor.getString(_cursorIndexOfRunningTime);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            _item = new FilmEntity(_tmpTitle,_tmpPoster,_tmpGenre,_tmpRunning_time,_tmpOriginal_language,_tmpOverview,_tmpType,_tmpStatus);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<FilmEntity> getMovieByTitle(final String title) {
    final String _sql = "SELECT * FROM film_entities WHERE type = 1 AND title = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"film_entities"}, new Callable<FilmEntity>() {
      @Override
      public FilmEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRunningTime = CursorUtil.getColumnIndexOrThrow(_cursor, "running_time");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final FilmEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final String _tmpRunning_time;
            _tmpRunning_time = _cursor.getString(_cursorIndexOfRunningTime);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            _result = new FilmEntity(_tmpTitle,_tmpPoster,_tmpGenre,_tmpRunning_time,_tmpOriginal_language,_tmpOverview,_tmpType,_tmpStatus);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<FilmEntity>> getTvShows() {
    final String _sql = "SELECT * FROM film_entities WHERE type = 2";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"film_entities"}, new Callable<List<FilmEntity>>() {
      @Override
      public List<FilmEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRunningTime = CursorUtil.getColumnIndexOrThrow(_cursor, "running_time");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<FilmEntity> _result = new ArrayList<FilmEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FilmEntity _item;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final String _tmpRunning_time;
            _tmpRunning_time = _cursor.getString(_cursorIndexOfRunningTime);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            _item = new FilmEntity(_tmpTitle,_tmpPoster,_tmpGenre,_tmpRunning_time,_tmpOriginal_language,_tmpOverview,_tmpType,_tmpStatus);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<FilmEntity> getTvShowByTitle(final String title) {
    final String _sql = "SELECT * FROM film_entities WHERE type = 2 AND title = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"film_entities"}, new Callable<FilmEntity>() {
      @Override
      public FilmEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRunningTime = CursorUtil.getColumnIndexOrThrow(_cursor, "running_time");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final FilmEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final String _tmpRunning_time;
            _tmpRunning_time = _cursor.getString(_cursorIndexOfRunningTime);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            _result = new FilmEntity(_tmpTitle,_tmpPoster,_tmpGenre,_tmpRunning_time,_tmpOriginal_language,_tmpOverview,_tmpType,_tmpStatus);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<FilmEntity>> getFavoriteMovies() {
    final String _sql = "SELECT * FROM film_entities WHERE type = 1 AND status = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"film_entities"}, new Callable<List<FilmEntity>>() {
      @Override
      public List<FilmEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRunningTime = CursorUtil.getColumnIndexOrThrow(_cursor, "running_time");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<FilmEntity> _result = new ArrayList<FilmEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FilmEntity _item;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final String _tmpRunning_time;
            _tmpRunning_time = _cursor.getString(_cursorIndexOfRunningTime);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            _item = new FilmEntity(_tmpTitle,_tmpPoster,_tmpGenre,_tmpRunning_time,_tmpOriginal_language,_tmpOverview,_tmpType,_tmpStatus);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<FilmEntity>> getFavoriteTvShows() {
    final String _sql = "SELECT * FROM film_entities WHERE type = 2 AND status = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"film_entities"}, new Callable<List<FilmEntity>>() {
      @Override
      public List<FilmEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRunningTime = CursorUtil.getColumnIndexOrThrow(_cursor, "running_time");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<FilmEntity> _result = new ArrayList<FilmEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FilmEntity _item;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final String _tmpRunning_time;
            _tmpRunning_time = _cursor.getString(_cursorIndexOfRunningTime);
            final String _tmpOriginal_language;
            _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            _item = new FilmEntity(_tmpTitle,_tmpPoster,_tmpGenre,_tmpRunning_time,_tmpOriginal_language,_tmpOverview,_tmpType,_tmpStatus);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
