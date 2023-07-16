package X;

/* renamed from: X.61P  reason: invalid class name */
public final class AnonymousClass61P extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass7EN A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61P(AnonymousClass7EN r2, Integer num, Integer num2, Long l) {
        super(789858355);
        this.A03 = l;
        this.A00 = r2;
        this.A01 = num;
        this.A02 = num2;
    }

    public final void run() {
        try {
            Long l = this.A03;
            if (l != null) {
                AnonymousClass7EN.A01(this.A00, "recent_time_on_story", l.longValue());
            }
            Integer num = this.A01;
            if (num != null) {
                AnonymousClass7EN.A01(this.A00, "ad_consumed_in_story_session", (long) num.intValue());
            }
            Integer num2 = this.A02;
            if (num2 != null) {
                AnonymousClass7EN.A01(this.A00, "item_consumed_in_story_session", (long) num2.intValue());
            }
            AnonymousClass7EN.A01(this.A00, "last_story_session_end_timestamp", System.currentTimeMillis());
        } catch (Exception e) {
            AnonymousClass7ES.A00(e, "error while collecting signals");
        }
    }
}
