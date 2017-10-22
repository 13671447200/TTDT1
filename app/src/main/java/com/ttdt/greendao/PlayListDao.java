package com.ttdt.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.ttdt.modle.PlayList;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PLAY_LIST".
*/
public class PlayListDao extends AbstractDao<PlayList, Long> {

    public static final String TABLENAME = "PLAY_LIST";

    /**
     * Properties of entity PlayList.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property PlayListName = new Property(1, String.class, "playListName", false, "PLAY_LIST_NAME");
        public final static Property Image = new Property(2, String.class, "image", false, "IMAGE");
        public final static Property PlayCount = new Property(3, int.class, "playCount", false, "PLAY_COUNT");
        public final static Property UserId = new Property(4, int.class, "userId", false, "USER_ID");
        public final static Property Number = new Property(5, int.class, "number", false, "NUMBER");
    };


    public PlayListDao(DaoConfig config) {
        super(config);
    }
    
    public PlayListDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PLAY_LIST\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"PLAY_LIST_NAME\" TEXT," + // 1: playListName
                "\"IMAGE\" TEXT," + // 2: image
                "\"PLAY_COUNT\" INTEGER NOT NULL ," + // 3: playCount
                "\"USER_ID\" INTEGER NOT NULL ," + // 4: userId
                "\"NUMBER\" INTEGER NOT NULL );"); // 5: number
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PLAY_LIST\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PlayList entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String playListName = entity.getPlayListName();
        if (playListName != null) {
            stmt.bindString(2, playListName);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(3, image);
        }
        stmt.bindLong(4, entity.getPlayCount());
        stmt.bindLong(5, entity.getUserId());
        stmt.bindLong(6, entity.getNumber());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PlayList entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String playListName = entity.getPlayListName();
        if (playListName != null) {
            stmt.bindString(2, playListName);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(3, image);
        }
        stmt.bindLong(4, entity.getPlayCount());
        stmt.bindLong(5, entity.getUserId());
        stmt.bindLong(6, entity.getNumber());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public PlayList readEntity(Cursor cursor, int offset) {
        PlayList entity = new PlayList( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // playListName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // image
            cursor.getInt(offset + 3), // playCount
            cursor.getInt(offset + 4), // userId
            cursor.getInt(offset + 5) // number
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PlayList entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setPlayListName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImage(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPlayCount(cursor.getInt(offset + 3));
        entity.setUserId(cursor.getInt(offset + 4));
        entity.setNumber(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PlayList entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PlayList entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
