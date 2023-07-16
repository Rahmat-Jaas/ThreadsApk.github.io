package X;

/* renamed from: X.8DL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8DL extends AnonymousClass019 implements AnonymousClass0ZU {
    public final /* synthetic */ C04180Mo A00;
    public final /* synthetic */ AnonymousClass0MJ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8DL(C04180Mo r7, AnonymousClass0MJ r8) {
        super(0, C04250Mv.class, "getState", "createStore$getState(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Object;", 0);
        this.A00 = r7;
        this.A01 = r8;
    }

    public final Object invoke() {
        C04180Mo r0 = this.A00;
        AnonymousClass0MJ r1 = this.A01;
        if (!r0.A00) {
            return r1.A00;
        }
        throw C18180wK.A0a("You may not call store.getState() while the reducer is executing.\nThe reducer has already received the state as an argument.\nPass it down from the top reducer instead of reading it from the \nstore.\nYou may be accessing getState while dispatching from another\nthread.  Try createThreadSafeStore().\nhttps://reduxkotlin.org/introduction/threading");
    }
}
