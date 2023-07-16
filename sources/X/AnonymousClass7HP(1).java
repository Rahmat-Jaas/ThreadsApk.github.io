package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.List;

/* renamed from: X.7HP  reason: invalid class name */
public final class AnonymousClass7HP {
    public KtCSuperShape0S2100000_I2 A00;
    public KtCSuperShape0S2100000_I2 A01;
    public KtCSuperShape0S3100000_I2 A02;
    public AnonymousClass5KU A03;
    public C1535598i A04;
    public C1535598i A05;
    public C90135Kq A06;
    public TrackData A07;
    public C27986Ewa A08;
    public AnonymousClass9A0 A09;
    public MusicSearchArtist A0A;
    public C133757wI A0B;
    public MusicSearchPlaylist A0C;
    public C20111BOv A0D;
    public Integer A0E;
    public EK6 A0F;
    public C20111BOv A0G;

    public AnonymousClass7HP(C145898lI r4) {
        C04220Ms.A0B(r4, 1);
        this.A08 = r4.AvV();
        C23 Az7 = r4.Az7();
        if (Az7 != null) {
            C10450iM.A03("unexpected_original_sound", "OriginalSound found as search item for browse request");
            this.A0D = new C20111BOv(Az7);
        }
        C28019Ex9 BHm = r4.BHm();
        if (BHm != null) {
            this.A0F = new EK6(BHm);
        }
        A02();
    }

    public final C22 A00() {
        C22 c22 = this.A0F;
        if (c22 == null && (c22 = this.A0D) == null) {
            c22 = this.A0G;
        }
        return c22;
    }

    public final String A01() {
        int intValue;
        String str;
        KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2;
        Integer num = this.A0E;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        switch (intValue) {
            case 1:
                C22 A002 = A00();
                if (A002 != null) {
                    str = A002.B3G();
                    break;
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            case 2:
                ktCSuperShape0S2100000_I2 = this.A01;
                if (ktCSuperShape0S2100000_I2 == null) {
                    throw C18180wK.A0a("Required value was null.");
                }
                break;
            case 3:
                ktCSuperShape0S2100000_I2 = this.A00;
                if (ktCSuperShape0S2100000_I2 == null) {
                    throw C18180wK.A0a("Required value was null.");
                }
                break;
            case 5:
            case 6:
                MusicSearchPlaylist musicSearchPlaylist = this.A0C;
                if (musicSearchPlaylist != null) {
                    str = musicSearchPlaylist.getId();
                    break;
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            case 7:
                C133757wI r0 = this.A0B;
                if (r0 != null) {
                    str = r0.A00.getId();
                    break;
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            case 8:
                MusicSearchArtist musicSearchArtist = this.A0A;
                if (musicSearchArtist != null) {
                    str = musicSearchArtist.A01.A03;
                    break;
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            default:
                str = null;
                break;
        }
        str = ktCSuperShape0S2100000_I2.A01;
        String str2 = null;
        if (str == null) {
            return null;
        }
        Integer num2 = this.A0E;
        if (num2 != null) {
            str2 = C102056Tq.A00(num2);
        }
        return AnonymousClass00U.A0N(str, str2, '_');
    }

    public final void A02() {
        Integer num;
        Boolean BZJ;
        TrackData trackData = this.A07;
        if (trackData != null) {
            this.A0F = new EK6(trackData);
        }
        C1535598i r1 = this.A04;
        if (r1 != null) {
            this.A0D = new C20111BOv(r1);
        }
        C1535598i r12 = this.A05;
        if (r12 != null) {
            this.A0G = new C20111BOv(r12);
        }
        KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2 = this.A02;
        Integer num2 = null;
        if (ktCSuperShape0S3100000_I2 != null) {
            this.A0A = new MusicSearchArtist(ktCSuperShape0S3100000_I2);
        }
        C90135Kq r13 = this.A06;
        if (r13 != null) {
            this.A0C = new MusicSearchPlaylist(r13);
        }
        AnonymousClass5KU r14 = this.A03;
        if (r14 != null) {
            this.A0B = new C133757wI(r14);
        }
        EK6 ek6 = this.A0F;
        if (ek6 != null) {
            C27986Ewa ewa = this.A08;
            if (!(ewa == null || (BZJ = ewa.BZJ()) == null)) {
                ek6.A03 = BZJ.booleanValue();
            }
            ek6.A00 = this.A09;
        }
        if (A00() != null) {
            num = AnonymousClass006.A01;
        } else if (this.A01 != null) {
            num = AnonymousClass006.A0C;
        } else if (this.A00 != null) {
            num = AnonymousClass006.A0N;
        } else {
            MusicSearchPlaylist musicSearchPlaylist = this.A0C;
            if (musicSearchPlaylist != null) {
                List B2y = musicSearchPlaylist.B2y();
                if (B2y == null || !B2y.isEmpty()) {
                    MusicSearchPlaylist musicSearchPlaylist2 = this.A0C;
                    if (musicSearchPlaylist2 != null) {
                        num2 = musicSearchPlaylist2.A00();
                    }
                    if (num2 == AnonymousClass006.A00) {
                        num = AnonymousClass006.A0Y;
                    } else {
                        num = AnonymousClass006.A0j;
                    }
                } else {
                    num = AnonymousClass006.A0u;
                }
            } else if (this.A0B != null) {
                num = AnonymousClass006.A15;
            } else if (this.A0A != null) {
                num = AnonymousClass006.A1C;
            } else {
                num = AnonymousClass006.A00;
            }
        }
        this.A0E = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18190wL.A1Y(this, obj)) {
            return false;
        }
        return C04220Ms.A0I(A01(), ((AnonymousClass7HP) obj).A01());
    }

    public final int hashCode() {
        return C86124wJ.A0F(A01());
    }

    public AnonymousClass7HP(C145458kX r3) {
        C04220Ms.A0B(r3, 1);
        C27954Ew4 B1z = r3.B1z();
        if (B1z != null) {
            this.A0C = new MusicSearchPlaylist(B1z);
        }
        C145888lH AWt = r3.AWt();
        if (AWt != null) {
            this.A0B = new C133757wI(AWt);
        }
        A02();
    }

    public AnonymousClass7HP(C27954Ew4 ew4) {
        C04220Ms.A0B(ew4, 1);
        this.A0C = new MusicSearchPlaylist(ew4);
        A02();
    }

    public AnonymousClass7HP() {
    }
}
