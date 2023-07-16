package X;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape5S0500000_I2;

/* renamed from: X.8DO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8DO extends AnonymousClass019 implements AnonymousClass0YY {
    public final /* synthetic */ C04180Mo A00;
    public final /* synthetic */ AnonymousClass0MJ A01;
    public final /* synthetic */ AnonymousClass0MJ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8DO(C04180Mo r7, AnonymousClass0MJ r8, AnonymousClass0MJ r9) {
        super(1, C04250Mv.class, "subscribe", "createStore$subscribe(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", 0);
        this.A00 = r7;
        this.A02 = r8;
        this.A01 = r9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        C04220Ms.A0B(obj, 0);
        C04180Mo r3 = this.A00;
        AnonymousClass0MJ r4 = this.A02;
        AnonymousClass0MJ r7 = this.A01;
        if (!r3.A00) {
            C04180Mo r5 = new C04180Mo();
            r5.A00 = true;
            Object obj3 = r4.A00;
            Object obj4 = r7.A00;
            if (obj3 == obj4) {
                Collection collection = (Collection) obj4;
                C04220Ms.A0B(collection, 0);
                obj3 = C18200wM.A0s(collection);
                r4.A00 = obj3;
            }
            ((List) obj3).add(obj);
            return new KtLambdaShape5S0500000_I2(12, r3, r4, r5, obj2, r7);
        }
        throw C18180wK.A0a("You may not call store.subscribe() while the reducer is executing.\nIf you would like to be notified after the store has been updated, \nsubscribe from a component and invoke store.getState() in the \ncallback to access the latest state. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.\nYou may be seeing this due accessing the store from multiplethreads.\nTry createThreadSafeStore()\nhttps://reduxkotlin.org/introduction/threading");
    }
}
