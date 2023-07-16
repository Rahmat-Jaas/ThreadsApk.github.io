package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass00J;
import X.AnonymousClass0IY;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.AnonymousClass4u2;
import X.AnonymousClass6UW;
import X.AnonymousClass7AM;
import X.AnonymousClass8bH;
import X.C04220Ms;
import X.C04530Oa;
import X.C120627Bu;
import X.C132487ty;
import X.C134017wt;
import X.C14030oh;
import X.C146958n9;
import X.C18180wK;
import X.C18250wR;
import X.C209916z;
import X.C25237DiI;
import X.C27952Ew2;
import X.C34640IcN;
import X.C41012LuB;
import X.C82034oy;
import X.C83224qz;
import X.C84874u0;
import X.C86104wH;
import X.C86134wK;
import X.C98726Gr;
import X.E5N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.dcp.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase;
import com.instagram.barcelona.R;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class SignalStoreTestFragment extends C34640IcN implements C82034oy {
    public final C83224qz coroutineScope;
    public final C84874u0 dispatcherProvider;
    public TextView responseText;
    public final Bundle sessionTokenBundle = C18180wK.A06();
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825126);
    }

    public String getModuleName() {
        return "device_compute_platform";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.responseText = (TextView) AnonymousClass0wJ.A0I(view, R.id.response_text);
        AnonymousClass0wJ.A0I(view, R.id.execute_button_1).setOnClickListener(new SignalStoreTestFragment$onViewCreated$1(this));
        AnonymousClass0wJ.A0I(view, R.id.execute_button_2).setOnClickListener(new SignalStoreTestFragment$onViewCreated$2(this));
        AnonymousClass0wJ.A0I(view, R.id.extract_button).setOnClickListener(new SignalStoreTestFragment$onViewCreated$3(this));
        AnonymousClass0wJ.A0I(view, R.id.roomdb_save_button).setOnClickListener(new SignalStoreTestFragment$onViewCreated$4(this));
        AnonymousClass0wJ.A0I(view, R.id.roomdb_read_button).setOnClickListener(new SignalStoreTestFragment$onViewCreated$5(this));
        AnonymousClass0wJ.A0I(view, R.id.roomdb_purge_button).setOnClickListener(new SignalStoreTestFragment$onViewCreated$6(this));
    }

    /* access modifiers changed from: private */
    public final void extract() {
        C132487ty A00 = C98726Gr.A00(requireContext(), AnonymousClass0wJ.A0X(this.userSession$delegate));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new SignalStoreTestFragment$extract$1(A00, this, (C146958n9) null), this.coroutineScope, 3);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void saveFloat() {
        String valueOf = String.valueOf(Long.parseLong("900000") + 1);
        String valueOf2 = String.valueOf(Long.parseLong("900000") + 2);
        C132487ty A00 = C98726Gr.A00(requireContext(), AnonymousClass0wJ.A0X(this.userSession$delegate));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new SignalStoreTestFragment$saveFloat$1(A00, "900000", valueOf, valueOf2, (C146958n9) null), this.coroutineScope, 3);
    }

    /* access modifiers changed from: private */
    public final void saveLong() {
        String valueOf = String.valueOf(Long.parseLong("600000") + 1);
        String valueOf2 = String.valueOf(Long.parseLong("600000") + 2);
        C132487ty A00 = C98726Gr.A00(requireContext(), AnonymousClass0wJ.A0X(this.userSession$delegate));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new SignalStoreTestFragment$saveLong$1(A00, "600000", valueOf, valueOf2, (C146958n9) null), this.coroutineScope, 3);
    }

    /* access modifiers changed from: private */
    public final void testRoomDbPurge() {
        AnonymousClass0IY r3 = AnonymousClass0IY.A00;
        long currentTimeMillis = System.currentTimeMillis();
        C134017wt r2 = RoomSignalsDatabase.A00;
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) A0X.A00(RoomSignalsDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (r2) {
                igRoomDatabase = C86104wH.A0X(r2, A0X);
            }
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new SignalStoreTestFragment$testRoomDbPurge$1(r3, (RoomSignalsDatabase) igRoomDatabase, currentTimeMillis, this, (C146958n9) null), this.coroutineScope, 3);
    }

    /* access modifiers changed from: private */
    public final void testRoomDbRead() {
        AnonymousClass0IY r3 = AnonymousClass0IY.A00;
        long currentTimeMillis = System.currentTimeMillis();
        List<Object> A0N = AnonymousClass00J.A0N(AnonymousClass8bH.A02(1, 30));
        ArrayList A0w = AnonymousClass0wJ.A0w(A0N);
        for (Object A04 : A0N) {
            A0w.add(String.valueOf(AnonymousClass0wJ.A04(A04)));
        }
        C134017wt r2 = RoomSignalsDatabase.A00;
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) A0X.A00(RoomSignalsDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (r2) {
                igRoomDatabase = C86104wH.A0X(r2, A0X);
            }
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new SignalStoreTestFragment$testRoomDbRead$1(r3, (RoomSignalsDatabase) igRoomDatabase, A0w, currentTimeMillis, this, (C146958n9) null), this.coroutineScope, 3);
    }

    public SignalStoreTestFragment() {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        this.dispatcherProvider = A0J;
        this.coroutineScope = C84874u0.A00(A0J, 675609327, 3);
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.Ew2, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* access modifiers changed from: private */
    public final void testRoomDbSave() {
        ? r10;
        boolean z;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass0IY r35 = AnonymousClass0IY.A00;
        long currentTimeMillis = System.currentTimeMillis();
        int i = 1;
        while (true) {
            AnonymousClass7AM r6 = AnonymousClass7AM.A01;
            int A04 = r6.A04(1, 100);
            long j = currentTimeMillis + ((long) 1000000000);
            if (A04 % 2 == 0) {
                r10 = 0;
                z = false;
                A0v.add(new C209916z((Float) null, (Integer) null, Long.valueOf(r6.A06(1, 100)), String.valueOf(A04), (String) null, (String) null, 0, 0, currentTimeMillis, j));
            } else {
                r10 = 0;
                z = false;
                A0v.add(new C209916z(Float.valueOf(r6.A00()), (Integer) null, (Long) null, String.valueOf(A04), (String) null, (String) null, 0, 1, currentTimeMillis, j));
            }
            if (i == 50000) {
                break;
            }
            i++;
        }
        C134017wt r8 = RoomSignalsDatabase.A00;
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        Class<RoomSignalsDatabase> cls = RoomSignalsDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) A0X.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r8) {
                igRoomDatabase = (IgRoomDatabase) A0X.A00(cls);
                if (igRoomDatabase == null) {
                    C41012LuB A00 = C120627Bu.A00(r8, A0X, cls);
                    AnonymousClass6UW.A00(A00, 439645738, 278132057, z);
                    A00.A01();
                    igRoomDatabase = (IgRoomDatabase) A00.A00();
                    A0X.A04(cls, igRoomDatabase);
                }
            }
        }
        C25237DiI.A00(r10, r10, new SignalStoreTestFragment$testRoomDbSave$1(r35, (RoomSignalsDatabase) igRoomDatabase, A0v, 50000, this, r10), this.coroutineScope, 3);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1305139557);
        super.onCreate(bundle);
        C86134wK.A15(this.sessionTokenBundle, AnonymousClass0wJ.A0X(this.userSession$delegate));
        C14030oh.A09(1168605384, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-593780443);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_dcp_signal_store, viewGroup, false);
        C14030oh.A09(1146415165, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
