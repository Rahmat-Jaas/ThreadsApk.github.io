package X;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1iX  reason: invalid class name */
public final class AnonymousClass1iX extends C63873iU {
    public Fragment A00;
    public AnonymousClass3GB A01;
    public C82164pB A02;
    public UserSession A03;
    public User A04;
    public C12560m7 A05;

    public AnonymousClass1iX(Fragment fragment, C12560m7 r2, AnonymousClass3GB r3, C82164pB r4, UserSession userSession, User user) {
        this.A03 = userSession;
        this.A04 = user;
        this.A00 = fragment;
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void onFail(AnonymousClass3XX r7) {
        AnonymousClass01V r1;
        short s;
        String string;
        List list;
        int A032 = C14030oh.A03(1425106417);
        Fragment fragment = this.A00;
        if (fragment.isResumed()) {
            Context requireContext = fragment.requireContext();
            Object obj = r7.A00;
            AnonymousClass1j3 r12 = (AnonymousClass1j3) obj;
            if (r12 != null && (list = r12.mErrorStrings) != null && !list.isEmpty()) {
                string = C18190wL.A0p(r12.mErrorStrings, 0);
            } else if (obj == null || r12.getErrorMessage() == null) {
                string = requireContext.getString(2131824428);
            } else {
                string = r12.getErrorMessage();
            }
            C25828Dsm A002 = C62973bE.A00(requireContext);
            A002.A0p(string);
            AnonymousClass0wJ.A1K(A002);
            AnonymousClass4Aj.A0E.post(new C72914Qf(this, string));
            r1 = AnonymousClass01V.A0p;
            s = 3;
        } else {
            r1 = AnonymousClass01V.A0p;
            s = 4;
        }
        r1.markerEnd(18297178, s);
        C14030oh.A0A(2095535907, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(1642530851);
        AnonymousClass4Aj.A02(this.A00, this.A05);
        C14030oh.A0A(-1844983327, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(640364563);
        AnonymousClass4Aj.A03(this.A00, this.A05);
        C14030oh.A0A(19953916, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-47451057);
        C21711Rw r8 = (C21711Rw) obj;
        int A033 = C14030oh.A03(-2005810350);
        Fragment fragment = this.A00;
        if (fragment.isResumed()) {
            AnonymousClass4Aj.A04(fragment, this.A01, this.A02, this.A03, r8.A00);
        } else {
            AnonymousClass01V.A0p.markerEnd(18297178, 4);
        }
        C14030oh.A0A(-147287802, A033);
        C14030oh.A0A(-432608067, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = C14030oh.A03(-1418940736);
        int A033 = C14030oh.A03(1402074663);
        User user = this.A04;
        Bitmap A002 = C37744K2e.A00(C37744K2e.A01(), user.B4M(), (String) null, false);
        String id = user.getId();
        C04220Ms.A0B(id, 0);
        ShortcutManager shortcutManager = (ShortcutManager) C10600ic.A00.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (ShortcutInfo id2 : shortcutManager.getPinnedShortcuts()) {
                String id3 = id2.getId();
                C04220Ms.A06(id3);
                if (id3.equals(AnonymousClass00U.A0M("'pinned_account_shortcut_", id, '\''))) {
                    ShortcutInfo.Builder builder = new ShortcutInfo.Builder(C10600ic.A00, id3);
                    if (A002 != null) {
                        builder.setIcon(Icon.createWithAdaptiveBitmap(A002));
                        ShortcutInfo build = builder.build();
                        C04220Ms.A06(build);
                        A0v.add(build);
                    }
                }
            }
            if (C18250wR.A1K(A0v)) {
                shortcutManager.updateShortcuts(A0v);
            }
        }
        C14030oh.A0A(-2033945477, A033);
        C14030oh.A0A(337487938, A032);
    }
}
