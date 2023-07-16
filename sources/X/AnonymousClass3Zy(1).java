package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import java.io.File;

/* renamed from: X.3Zy  reason: invalid class name */
public final class AnonymousClass3Zy {
    public static Intent A00(File file) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT", (Uri) null);
        intent.setType("image/*");
        if (file != null) {
            intent.putExtra("output", Uri.fromFile(file));
            intent.putExtra(C28174Ezk.A00(679), Bitmap.CompressFormat.JPEG.name());
        }
        return intent;
    }

    public static Uri A01(Intent intent, File file) {
        Uri data = intent.getData();
        if ((file == null || data != null) && data.toString().length() != 0) {
            return data;
        }
        file.getClass();
        return Uri.fromFile(file);
    }

    public static void A02(Activity activity, File file, int i) {
        C10650ih.A00(activity, Intent.createChooser(A00(file), activity.getResources().getString(2131823111)), i);
    }

    public static void A03(Fragment fragment, File file, int i) {
        C10650ih.A07(fragment, Intent.createChooser(A00(file), AnonymousClass0wJ.A0B(fragment).getString(2131823111)), i);
    }
}
