package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass00J;
import X.AnonymousClass0MZ;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbPurge$1", f = "SignalStoreTestFragment.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
public final class SignalStoreTestFragment$testRoomDbPurge$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ C03700Kj $clock;
    public final /* synthetic */ RoomSignalsDatabase $db;
    public final /* synthetic */ long $now;
    public int label;
    public final /* synthetic */ SignalStoreTestFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbPurge$1$3", f = "SignalStoreTestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbPurge$1$3  reason: invalid class name */
    public final class AnonymousClass3 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r10) {
            return new AnonymousClass3(currentTimeMillis2, currentTimeMillis, signalStoreTestFragment, r10);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0OU.A00(obj);
                StringBuilder A0s = C18190wL.A0s("Drop size: ");
                A0s.append(AnonymousClass0MZ.this.A00);
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
    public SignalStoreTestFragment$testRoomDbPurge$1(C03700Kj r2, RoomSignalsDatabase roomSignalsDatabase, long j, SignalStoreTestFragment signalStoreTestFragment, C146958n9 r7) {
        super(2, r7);
        this.$clock = r2;
        this.$db = roomSignalsDatabase;
        this.$now = j;
        this.this$0 = signalStoreTestFragment;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        return new SignalStoreTestFragment$testRoomDbPurge$1(this.$clock, this.$db, this.$now, this.this$0, r9);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((SignalStoreTestFragment$testRoomDbPurge$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            final long currentTimeMillis = System.currentTimeMillis();
            this.$db.A00().A02(this.$now);
            List A00 = this.$db.A00().A00(this.$now);
            LinkedHashMap A0y = C18220wO.A0y();
            for (Object next : A00) {
                String str = ((C209916z) next).A08;
                Object obj2 = A0y.get(str);
                if (obj2 == null) {
                    obj2 = AnonymousClass0wJ.A0v();
                    A0y.put(str, obj2);
                }
                ((List) obj2).add(next);
            }
            LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(A0y.size()));
            Iterator it = A0y.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                A0v.put(A0o.getKey(), AnonymousClass00J.A0Y(AnonymousClass00J.A0W((Iterable) A0o.getValue(), new SignalStoreTestFragment$testRoomDbPurge$1$invokeSuspend$lambda$2$$inlined$sortedBy$1()), 1));
            }
            final AnonymousClass0MZ r7 = new AnonymousClass0MZ();
            List<C209916z> A10 = C02260Al.A10(A0v.values());
            ArrayList A0w = AnonymousClass0wJ.A0w(A10);
            for (C209916z r0 : A10) {
                A0w.add(new Integer(r0.A00));
            }
            final RoomSignalsDatabase roomSignalsDatabase = this.$db;
            AnonymousClass00J.A0i(A0w, new AnonymousClass0YY() {
                public final void invoke(List list) {
                    C04220Ms.A0B(list, 0);
                    AnonymousClass0MZ.this.A00 += list.size();
                    roomSignalsDatabase.A00().A04(list);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List) obj);
                    return Unit.A00;
                }
            }, 30000, 30000);
            final long currentTimeMillis2 = System.currentTimeMillis();
            final SignalStoreTestFragment signalStoreTestFragment = this.this$0;
            C27219EgD egD = ((E5N) signalStoreTestFragment.dispatcherProvider).A03;
            AnonymousClass3 r6 = new AnonymousClass3((C146958n9) null);
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
