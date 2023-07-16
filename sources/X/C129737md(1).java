package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: X.7md  reason: invalid class name and case insensitive filesystem */
public final class C129737md implements C143928hX {
    public final C143928hX A00;

    public C129737md(C143928hX r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object DBu() {
        String string;
        Context context = ((C129727mc) this.A00).A00.A00;
        if (context != null) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (!(bundle == null || (string = bundle.getString("local_testing_dir")) == null)) {
                    return C86154wM.A0U(context.getExternalFilesDir((String) null), string);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return null;
        }
        throw C18210wN.A0W("Cannot return null from a non-@Nullable @Provides method");
    }
}
