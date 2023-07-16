package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;

/* renamed from: X.4Tw  reason: invalid class name */
public final class AnonymousClass4Tw implements Callable {
    public final /* synthetic */ ContentResolver A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;

    public AnonymousClass4Tw(ContentResolver contentResolver, File file, File file2) {
        this.A02 = file;
        this.A01 = file2;
        this.A00 = contentResolver;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        File file = this.A02;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        File file2 = this.A01;
        AnonymousClass0hL.A09(file2, bufferedInputStream);
        file.delete();
        ContentResolver contentResolver = this.A00;
        String name = file2.getName();
        String substring = TextUtils.substring(name, 0, name.length() - 3);
        ContentValues contentValues = new ContentValues();
        contentValues.put(DialogModule.KEY_TITLE, substring);
        contentValues.put("_display_name", name);
        contentValues.put("datetaken", C18200wM.A0c());
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("_data", file2.getPath());
        try {
            contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            return file2;
        } catch (Exception unused) {
            AnonymousClass0LU.A0B("BuiltInCameraUtil", "Unable to insert media into media store");
            return file2;
        }
    }
}
