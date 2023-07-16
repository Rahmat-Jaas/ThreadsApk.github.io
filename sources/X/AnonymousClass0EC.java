package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.0EC  reason: invalid class name */
public final class AnonymousClass0EC {
    public ArrayList A00 = null;
    public ArrayList A01 = null;
    public final Intent A02 = new Intent("android.intent.action.VIEW");

    public final Intent A00() {
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            this.A02.putParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS", arrayList);
        }
        ArrayList arrayList2 = this.A00;
        if (arrayList2 != null) {
            this.A02.putParcelableArrayListExtra("BrowserLiteIntent.EXTRA_COOKIES", arrayList2);
        }
        return this.A02;
    }

    public final void A01(int i, int i2, int i3, int i4) {
        this.A02.putExtra("BrowserLiteIntent.EXTRA_ANIMATION", new int[]{i, i2, i3, i4});
    }

    public final void A02(String str, String str2, int i) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        Bundle bundle = new Bundle();
        bundle.putString("KEY_LABEL", str);
        bundle.putInt("KEY_ICON_RES", i);
        bundle.putString("action", str2);
        this.A01.add(bundle);
    }

    public final void A03(String str, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putString("KEY_URL", str);
            bundle.putStringArrayList("KEY_STRING_ARRAY", arrayList);
            ArrayList arrayList2 = this.A00;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.A00 = arrayList2;
            }
            arrayList2.add(bundle);
        }
    }
}
