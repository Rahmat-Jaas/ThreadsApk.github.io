package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.56K  reason: invalid class name */
public final class AnonymousClass56K extends Fragment implements C146168ll {
    public static final WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public final Map A02 = Collections.synchronizedMap(new C013306f());

    public final void A5i(LifecycleCallback lifecycleCallback, String str) {
        Map map = this.A02;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new C86864zF(Looper.getMainLooper()).post(new AnonymousClass82P(lifecycleCallback, this, str));
                return;
            }
            return;
        }
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 59);
        A0s.append("LifecycleCallback with tag ");
        A0s.append(str);
        throw C18190wL.A0a(C18180wK.A0i(" already added to this fragment.", A0s));
    }

    public final LifecycleCallback AV4(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.A02.get(str));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            Iterator A0z = AnonymousClass0wJ.A0z(this.A02);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Bundle A06 = C18180wK.A06();
                ((LifecycleCallback) A0o.getValue()).A07(A06);
                bundle.putBundle(C18200wM.A0p(A0o), A06);
            }
        }
    }

    public final /* synthetic */ Activity Arv() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator A14 = C86104wH.A14(this.A02);
        while (A14.hasNext()) {
            ((LifecycleCallback) A14.next()).A08(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator A14 = C86104wH.A14(this.A02);
        while (A14.hasNext()) {
            ((LifecycleCallback) A14.next()).A05(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int A022 = C14030oh.A02(-544826621);
        super.onCreate(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        Iterator A0z = AnonymousClass0wJ.A0z(this.A02);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            LifecycleCallback lifecycleCallback = (LifecycleCallback) A0o.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(C18200wM.A0p(A0o));
            } else {
                bundle2 = null;
            }
            lifecycleCallback.A06(bundle2);
        }
        C14030oh.A09(-958236405, A022);
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1576057034);
        super.onDestroy();
        this.A00 = 5;
        Iterator A14 = C86104wH.A14(this.A02);
        while (A14.hasNext()) {
            A14.next();
        }
        C14030oh.A09(-1150198533, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1059664708);
        super.onResume();
        this.A00 = 3;
        Iterator A14 = C86104wH.A14(this.A02);
        while (A14.hasNext()) {
            ((LifecycleCallback) A14.next()).A02();
        }
        C14030oh.A09(2018005250, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(1474959548);
        super.onStart();
        this.A00 = 2;
        Iterator A14 = C86104wH.A14(this.A02);
        while (A14.hasNext()) {
            ((LifecycleCallback) A14.next()).A03();
        }
        C14030oh.A09(1912662489, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-949417288);
        super.onStop();
        this.A00 = 4;
        Iterator A14 = C86104wH.A14(this.A02);
        while (A14.hasNext()) {
            ((LifecycleCallback) A14.next()).A04();
        }
        C14030oh.A09(2003769891, A022);
    }
}
