package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.messaging.encryptedbackups.encryptedbackupsmanager.model.OneTimeCodeDevice;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.10w  reason: invalid class name and case insensitive filesystem */
public final class C196410w extends C41030Luu {
    public final List A00;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        Long A02;
        AnonymousClass124 r8 = (AnonymousClass124) m5o;
        C04220Ms.A0B(r8, 0);
        OneTimeCodeDevice oneTimeCodeDevice = (OneTimeCodeDevice) this.A00.get(i);
        IgdsListCell igdsListCell = r8.A00;
        igdsListCell.A05(R.drawable.instagram_device_phone_pano_outline_24);
        Context A0B = C18240wQ.A0B(r8);
        String str = oneTimeCodeDevice.A01;
        if (str == null) {
            str = oneTimeCodeDevice.A00;
        }
        igdsListCell.A0H(str);
        C04220Ms.A06(A0B);
        String str2 = oneTimeCodeDevice.A02;
        String str3 = null;
        if (!(str2 == null || (A02 = AnonymousClass4n2.A02(str2)) == null)) {
            str3 = C19591Ayr.A04(A0B, (double) A02.longValue());
        }
        List A17 = C06750aI.A17(str3, oneTimeCodeDevice.A03);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A17) {
            String str4 = (String) next;
            if (str4 != null && !AnonymousClass8bQ.A0n(str4)) {
                A0v.add(next);
            }
        }
        igdsListCell.A0G(C18200wM.A0l(" • ", A0v));
    }

    public C196410w(List list) {
        this.A00 = list;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1139896456);
        int size = this.A00.size();
        C14030oh.A0A(1351761601, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C18240wQ.A1H(viewGroup);
        return new AnonymousClass124(C18240wQ.A0T(C18190wL.A0A(viewGroup)));
    }
}
