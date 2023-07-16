package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0OU;
import X.AnonymousClass0Sf;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass3J5;
import X.C04220Ms;
import X.C111686o9;
import X.C134647y7;
import X.C146958n9;
import X.C147138nS;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C25237DiI;
import X.C27457Enn;
import X.C27952Ew2;
import X.C39142Kno;
import X.C62793ak;
import X.C83224qz;
import X.C86074wE;
import X.C86094wG;
import X.D0E;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RepositoryInfoViewModel extends C62793ak {
    public static final int $stable = 8;
    public final C86074wE _repositories;
    public final C86094wG repositories;
    public final UserSession session;

    @DebugMetadata(c = "com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel$1", f = "RepositoryInfoViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return new AnonymousClass1(r4).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            D0E d0e = D0E.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0OU.A00(obj);
                RepositoryInfoViewModel repositoryInfoViewModel = RepositoryInfoViewModel.this;
                C86074wE r6 = repositoryInfoViewModel._repositories;
                List A02 = repositoryInfoViewModel.session.A02();
                ArrayList<C134647y7> A0v = AnonymousClass0wJ.A0v();
                for (Object next : A02) {
                    if (next instanceof C134647y7) {
                        A0v.add(next);
                    }
                }
                ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
                for (C134647y7 r0 : A0v) {
                    String A0e = C18210wN.A0e(r0);
                    if (A0e == null) {
                        A0e = "unknown";
                    }
                    A0w.add(new RepositoryInfo(A0e, r0.A00, (MemoryCacheStats) null));
                }
                this.label = 1;
                if (r6.emit(A0w, this) == d0e) {
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

    public final class MemoryCacheStats extends AnonymousClass0Sf {
        public static final int $stable = 0;
        public final int evictionCount;
        public final int hitCount;
        public final int missCount;
        public final int putCount;

        public final int component1() {
            return this.hitCount;
        }

        public final int component2() {
            return this.missCount;
        }

        public final int component3() {
            return this.putCount;
        }

        public final int component4() {
            return this.evictionCount;
        }

        public final MemoryCacheStats copy(int i, int i2, int i3, int i4) {
            return new MemoryCacheStats(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MemoryCacheStats) {
                    MemoryCacheStats memoryCacheStats = (MemoryCacheStats) obj;
                    if (!(this.hitCount == memoryCacheStats.hitCount && this.missCount == memoryCacheStats.missCount && this.putCount == memoryCacheStats.putCount && this.evictionCount == memoryCacheStats.evictionCount)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((this.hitCount * 31) + this.missCount) * 31) + this.putCount) * 31) + this.evictionCount;
        }

        public String toString() {
            return super.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MemoryCacheStats(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, C18220wO.A00(i5, i3), (i5 & 8) != 0 ? 0 : i4);
        }

        public static /* synthetic */ MemoryCacheStats copy$default(MemoryCacheStats memoryCacheStats, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = memoryCacheStats.hitCount;
            }
            if ((i5 & 2) != 0) {
                i2 = memoryCacheStats.missCount;
            }
            if ((i5 & 4) != 0) {
                i3 = memoryCacheStats.putCount;
            }
            if ((i5 & 8) != 0) {
                i4 = memoryCacheStats.evictionCount;
            }
            return new MemoryCacheStats(i, i2, i3, i4);
        }

        public final int getEvictionCount() {
            return this.evictionCount;
        }

        public final int getHitCount() {
            return this.hitCount;
        }

        public final int getMissCount() {
            return this.missCount;
        }

        public final int getPutCount() {
            return this.putCount;
        }

        public MemoryCacheStats(int i, int i2, int i3, int i4) {
            this.hitCount = i;
            this.missCount = i2;
            this.putCount = i3;
            this.evictionCount = i4;
        }

        public MemoryCacheStats() {
            this(0, 0, 0, 0);
        }
    }

    public final class RepositoryInfo extends AnonymousClass0Sf {
        public static final int $stable = 0;
        public final String featureTag;
        public final MemoryCacheStats memoryCacheStats;
        public final String name;

        public static /* synthetic */ RepositoryInfo copy$default(RepositoryInfo repositoryInfo, String str, String str2, MemoryCacheStats memoryCacheStats2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = repositoryInfo.name;
            }
            if ((i & 2) != 0) {
                str2 = repositoryInfo.featureTag;
            }
            if ((i & 4) != 0) {
                memoryCacheStats2 = repositoryInfo.memoryCacheStats;
            }
            return repositoryInfo.copy(str, str2, memoryCacheStats2);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.featureTag;
        }

        public final MemoryCacheStats component3() {
            return this.memoryCacheStats;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RepositoryInfo) {
                    RepositoryInfo repositoryInfo = (RepositoryInfo) obj;
                    if (!C04220Ms.A0I(this.name, repositoryInfo.name) || !C04220Ms.A0I(this.featureTag, repositoryInfo.featureTag) || !C04220Ms.A0I(this.memoryCacheStats, repositoryInfo.memoryCacheStats)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public String toString() {
            return super.toString();
        }

        public final String getFeatureTag() {
            return this.featureTag;
        }

        public final MemoryCacheStats getMemoryCacheStats() {
            return this.memoryCacheStats;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean hasMemoryCache() {
            return AnonymousClass0wJ.A1W(this.memoryCacheStats);
        }

        public int hashCode() {
            return AnonymousClass0wJ.A07(this.featureTag, C18180wK.A03(this.name)) + AnonymousClass0wJ.A03(this.memoryCacheStats);
        }

        public RepositoryInfo(String str, String str2, MemoryCacheStats memoryCacheStats2) {
            AnonymousClass0wJ.A1O(str, str2);
            this.name = str;
            this.featureTag = str2;
            this.memoryCacheStats = memoryCacheStats2;
        }

        public final RepositoryInfo copy(String str, String str2, MemoryCacheStats memoryCacheStats2) {
            AnonymousClass0wJ.A1N(str, str2);
            return new RepositoryInfo(str, str2, memoryCacheStats2);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RepositoryInfo(String str, String str2, MemoryCacheStats memoryCacheStats2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : memoryCacheStats2);
        }
    }

    public RepositoryInfoViewModel(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.session = userSession;
        C27457Enn A0z = C18190wL.A0z(AnonymousClass0ZV.A00);
        this._repositories = A0z;
        this.repositories = C18230wP.A0x((C148838sG) null, A0z);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new AnonymousClass1((C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    public final class Factory implements C147138nS {
        public static final int $stable = 8;
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            C04220Ms.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        public /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
            return C147138nS.A00(this, cls);
        }

        public C62793ak create(Class cls) {
            return new RepositoryInfoViewModel(this.userSession);
        }
    }

    public final C86094wG getRepositories() {
        return this.repositories;
    }
}
