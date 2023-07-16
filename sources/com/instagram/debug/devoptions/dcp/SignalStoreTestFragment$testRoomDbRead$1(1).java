package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass00J;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C02260Al;
import X.C03700Kj;
import X.C04220Ms;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C209916z;
import X.C25599DoZ;
import X.C27219EgD;
import X.C39142Kno;
import X.C83224qz;
import X.D0E;
import X.E5N;
import android.widget.TextView;
import com.facebook.dcp.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbRead$1", f = "SignalStoreTestFragment.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class SignalStoreTestFragment$testRoomDbRead$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ C03700Kj $clock;
    public final /* synthetic */ RoomSignalsDatabase $db;
    public final /* synthetic */ List $listOfIds;
    public final /* synthetic */ long $now;
    public int label;
    public final /* synthetic */ SignalStoreTestFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbRead$1$1", f = "SignalStoreTestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbRead$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r10) {
            return new AnonymousClass1(A0v, currentTimeMillis2, currentTimeMillis, signalStoreTestFragment, r10);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0OU.A00(obj);
                StringBuilder A0s = C18190wL.A0s("Read size: ");
                A0s.append(C02260Al.A10(A0v.values()).size());
                A0s.append(": ");
                A0s.append(currentTimeMillis2 - currentTimeMillis);
                String A0i = C18180wK.A0i(" ms", A0s);
                TextView textView = signalStoreTestFragment.responseText;
                if (textView == null) {
                    C04220Ms.A0E("responseText");
                    throw null;
                }
                textView.setText(A0i);
                return Unit.A00;
            }
            throw AnonymousClass0wJ.A0a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalStoreTestFragment$testRoomDbRead$1(C03700Kj r2, RoomSignalsDatabase roomSignalsDatabase, List list, long j, SignalStoreTestFragment signalStoreTestFragment, C146958n9 r8) {
        super(2, r8);
        this.$clock = r2;
        this.$db = roomSignalsDatabase;
        this.$listOfIds = list;
        this.$now = j;
        this.this$0 = signalStoreTestFragment;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        return new SignalStoreTestFragment$testRoomDbRead$1(this.$clock, this.$db, this.$listOfIds, this.$now, this.this$0, r10);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((SignalStoreTestFragment$testRoomDbRead$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            final long currentTimeMillis = System.currentTimeMillis();
            List A01 = this.$db.A00().A01(this.$listOfIds, this.$now);
            LinkedHashMap A0y = C18220wO.A0y();
            for (Object next : A01) {
                String str = ((C209916z) next).A08;
                Object obj2 = A0y.get(str);
                if (obj2 == null) {
                    obj2 = AnonymousClass0wJ.A0v();
                    A0y.put(str, obj2);
                }
                ((List) obj2).add(next);
            }
            final LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(A0y.size()));
            Iterator it = A0y.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                A0v.put(A0o.getKey(), AnonymousClass00J.A0Z(AnonymousClass00J.A0W((Iterable) A0o.getValue(), new SignalStoreTestFragment$testRoomDbRead$1$invokeSuspend$lambda$2$$inlined$sortedBy$1()), 500));
            }
            final long currentTimeMillis2 = System.currentTimeMillis();
            final SignalStoreTestFragment signalStoreTestFragment = this.this$0;
            C27219EgD egD = ((E5N) signalStoreTestFragment.dispatcherProvider).A03;
            AnonymousClass1 r6 = new AnonymousClass1((C146958n9) null);
            this.label = 1;
            if (C25599DoZ.A00(this, egD, r6) == d0e) {
                return d0e;
            }
        } else if (i == 1) {
            AnonymousClass0OU.A00(obj);
        } else {
            throw AnonymousClass0wJ.A0a();
        }
        return Unit.A00;
    }
}
