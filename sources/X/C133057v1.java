package X;

import android.content.Context;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.search.SearchScreenViewModel;
import java.util.List;

/* renamed from: X.7v1  reason: invalid class name and case insensitive filesystem */
public final class C133057v1 implements L5G {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SearchScreenViewModel A01;

    public final void C2S(ILj iLj) {
        C04220Ms.A0B(iLj, 0);
        String str = iLj.A02;
        if (str != null) {
            C10650ih.A06(this.A00, C15430rJ.A01(str));
        }
    }

    public C133057v1(Context context, SearchScreenViewModel searchScreenViewModel) {
        this.A00 = context;
        this.A01 = searchScreenViewModel;
    }

    public final void CJA(ILj iLj) {
        String str;
        Object value;
        SearchScreenViewModel searchScreenViewModel = this.A01;
        ILj iLj2 = ((AnonymousClass5IV) searchScreenViewModel.A0D.getValue()).A00;
        if (iLj2 != null) {
            str = iLj2.A05;
            if (str == null) {
                str = iLj2.A06;
            }
        } else {
            str = null;
        }
        searchScreenViewModel.A09.A02(str);
        C86074wE r2 = searchScreenViewModel.A0C;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IV.A00((AnonymousClass5IV) value, (ILj) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (List) null, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, true)));
    }

    public final boolean Ct5(ILj iLj) {
        Integer num = iLj.A01;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
