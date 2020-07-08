import java.sql.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import jpa_project.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class Sh200s {
	static Boolean INKC;
	static Boolean INKD;
	static Boolean INKE;
	static Boolean INKF;
	static Boolean INKG;
	static Boolean INKH;
	static Boolean INKI;
	static Boolean INKJ;
	static Boolean INKK;
	static Boolean INKL;
	static Boolean INKN;
	static Boolean INKP;
	static Boolean INKQ;
	static Boolean INKR;
	static Boolean INKS;
	static Boolean INKT;
	static Boolean INKU;
	static Boolean INLR;
	static Boolean IN02;
	static Boolean IN03;
	static Boolean IN20;
	static Boolean IN21;
	static Boolean IN23;
	static Boolean IN25;
	static Boolean IN26;
	static Boolean IN30;
	static Boolean IN31;
	static Boolean IN32;
	static Boolean IN33;
	static Boolean IN34;
	static Boolean IN35;
	static Boolean IN36;
	static Boolean IN37;
	static Boolean IN38;
	static Boolean IN39;
	static Boolean IN40;
	static Boolean IN41;
	static Boolean IN42;
	static Boolean IN44;
	static Boolean IN45;
	static Boolean IN46;
	static Boolean IN51;
	static Boolean IN52;
	static Boolean IN53;
	static Boolean IN54;
	static Boolean IN55;
	static Boolean IN56;
	static Boolean IN57;
	static Boolean IN58;
	static Boolean IN59;
	static Boolean IN60;
	static Boolean IN62;
	static Boolean IN63;
	static Boolean IN65;
	static Boolean IN66;
	static Boolean IN67;
	static Boolean IN69;
	static Boolean IN71;
	static Boolean IN72;
	static Boolean IN73;
	static Boolean IN74;
	static Boolean IN75;
	static Boolean IN76;
	static Boolean IN77;
	static Boolean IN78;
	static Boolean IN79;
	static Boolean IN80;
	static Boolean IN81;
	static Boolean IN82;
	static Boolean IN85;
	static Boolean IN86;
	static Boolean IN87;
	static Boolean IN88;
	static Boolean IN89;
	static Boolean IN90;
	static Boolean IN91;
	static Boolean IN92;
	static Boolean IN93;
	static Boolean IN94;
	static Boolean IN95;
	static Boolean IN96;
	static Boolean IN97;
	static Boolean IN98;
	static Sh200sfm rSh200sfm;
	static EntityManagerFactory emf;
	static SimpleDateFormat sdf;
	static EntityManager quhdr;
	static Quhdr rQuhdr;
	static QuhdrPK quhdrPK;
	static TypedQuery<Quhdr> qQuhdr;
	static List<Quhdr> rQuhdrList;
	static Integer rQuhdrPOS;
	static Boolean rQuhdrFOUND;
	static Boolean rQuhdrEOF;
	static EntityManager quhdre;
	static Quhdre rQuhdre;
	static QuhdrePK quhdrePK;
	static TypedQuery<Quhdre> qQuhdre;
	static List<Quhdre> rQuhdreList;
	static Integer rQuhdrePOS;
	static Boolean rQuhdreFOUND;
	static Boolean rQuhdreEOF;
	static EntityManager qudtl;
	static Qudtl rQudtl;
	static QudtlPK qudtlPK;
	static TypedQuery<Qudtl> qQudtl;
	static List<Qudtl> rQudtlList;
	static Integer rQudtlPOS;
	static Boolean rQudtlFOUND;
	static Boolean rQudtlEOF;
	static EntityManager qudtlla;
	static Qudtlla rQudtlla;
	static QudtllaPK qudtllaPK;
	static TypedQuery<Qudtlla> qQudtlla;
	static List<Qudtlla> rQudtllaList;
	static Integer rQudtllaPOS;
	static Boolean rQudtllaFOUND;
	static Boolean rQudtllaEOF;
	static EntityManager qusrvc;
	static Qusrvc rQusrvc;
	static QusrvcPK qusrvcPK;
	static TypedQuery<Qusrvc> qQusrvc;
	static List<Qusrvc> rQusrvcList;
	static Integer rQusrvcPOS;
	static Boolean rQusrvcFOUND;
	static Boolean rQusrvcEOF;
	static EntityManager entmasla;
	static Entmasla rEntmasla;
	static EntmaslaPK entmaslaPK;
	static TypedQuery<Entmasla> qEntmasla;
	static List<Entmasla> rEntmaslaList;
	static Integer rEntmaslaPOS;
	static Boolean rEntmaslaFOUND;
	static Boolean rEntmaslaEOF;
	static EntityManager market;
	static Market rMarket;
	static MarketPK marketPK;
	static TypedQuery<Market> qMarket;
	static List<Market> rMarketList;
	static Integer rMarketPOS;
	static Boolean rMarketFOUND;
	static Boolean rMarketEOF;
	static EntityManager auxadrla;
	static Auxadrla rAuxadrla;
	static AuxadrlaPK auxadrlaPK;
	static TypedQuery<Auxadrla> qAuxadrla;
	static List<Auxadrla> rAuxadrlaList;
	static Integer rAuxadrlaPOS;
	static Boolean rAuxadrlaFOUND;
	static Boolean rAuxadrlaEOF;
	static EntityManager pakmst;
	static Pakmst rPakmst;
	static PakmstPK pakmstPK;
	static TypedQuery<Pakmst> qPakmst;
	static List<Pakmst> rPakmstList;
	static Integer rPakmstPOS;
	static Boolean rPakmstFOUND;
	static Boolean rPakmstEOF;
	static EntityManager pakdtlla;
	static Pakdtlla rPakdtlla;
	static PakdtllaPK pakdtllaPK;
	static TypedQuery<Pakdtlla> qPakdtlla;
	static List<Pakdtlla> rPakdtllaList;
	static Integer rPakdtllaPOS;
	static Boolean rPakdtllaFOUND;
	static Boolean rPakdtllaEOF;
	static EntityManager pakprc;
	static Pakprc rPakprc;
	static PakprcPK pakprcPK;
	static TypedQuery<Pakprc> qPakprc;
	static List<Pakprc> rPakprcList;
	static Integer rPakprcPOS;
	static Boolean rPakprcFOUND;
	static Boolean rPakprcEOF;
	static EntityManager terafl;
	static Terafl rTerafl;
	static TeraflPK teraflPK;
	static TypedQuery<Terafl> qTerafl;
	static List<Terafl> rTeraflList;
	static Integer rTeraflPOS;
	static Boolean rTeraflFOUND;
	static Boolean rTeraflEOF;
	static EntityManager refer;
	static Refer rRefer;
	static ReferPK referPK;
	static TypedQuery<Refer> qRefer;
	static List<Refer> rReferList;
	static Integer rReferPOS;
	static Boolean rReferFOUND;
	static Boolean rReferEOF;
	static EntityManager itmast;
	static Itmast rItmast;
	static ItmastPK itmastPK;
	static TypedQuery<Itmast> qItmast;
	static List<Itmast> rItmastList;
	static Integer rItmastPOS;
	static Boolean rItmastFOUND;
	static Boolean rItmastEOF;
	static EntityManager itmdef;
	static Itmdef rItmdef;
	static ItmdefPK itmdefPK;
	static TypedQuery<Itmdef> qItmdef;
	static List<Itmdef> rItmdefList;
	static Integer rItmdefPOS;
	static Boolean rItmdefFOUND;
	static Boolean rItmdefEOF;
	static EntityManager itmprclb;
	static Itmprclb rItmprclb;
	static ItmprclbPK itmprclbPK;
	static TypedQuery<Itmprclb> qItmprclb;
	static List<Itmprclb> rItmprclbList;
	static Integer rItmprclbPOS;
	static Boolean rItmprclbFOUND;
	static Boolean rItmprclbEOF;
	static EntityManager annfee;
	static Annfee rAnnfee;
	static AnnfeePK annfeePK;
	static TypedQuery<Annfee> qAnnfee;
	static List<Annfee> rAnnfeeList;
	static Integer rAnnfeePOS;
	static Boolean rAnnfeeFOUND;
	static Boolean rAnnfeeEOF;
	static EntityManager warnty;
	static Warnty rWarnty;
	static WarntyPK warntyPK;
	static TypedQuery<Warnty> qWarnty;
	static List<Warnty> rWarntyList;
	static Integer rWarntyPOS;
	static Boolean rWarntyFOUND;
	static Boolean rWarntyEOF;
	static EntityManager qumgmt;
	static Qumgmt rQumgmt;
	static QumgmtPK qumgmtPK;
	static TypedQuery<Qumgmt> qQumgmt;
	static List<Qumgmt> rQumgmtList;
	static Integer rQumgmtPOS;
	static Boolean rQumgmtFOUND;
	static Boolean rQumgmtEOF;
	static EntityManager quprov;
	static Quprov rQuprov;
	static QuprovPK quprovPK;
	static TypedQuery<Quprov> qQuprov;
	static List<Quprov> rQuprovList;
	static Integer rQuprovPOS;
	static Boolean rQuprovFOUND;
	static Boolean rQuprovEOF;
	static EntityManager permitlb;
	static Permitlb rPermitlb;
	static PermitlbPK permitlbPK;
	static TypedQuery<Permitlb> qPermitlb;
	static List<Permitlb> rPermitlbList;
	static Integer rPermitlbPOS;
	static Boolean rPermitlbFOUND;
	static Boolean rPermitlbEOF;
	static EntityManager travella;
	static Travella rTravella;
	static TravellaPK travellaPK;
	static TypedQuery<Travella> qTravella;
	static List<Travella> rTravellaList;
	static Integer rTravellaPOS;
	static Boolean rTravellaFOUND;
	static Boolean rTravellaEOF;
	static EntityManager promstlb;
	static Promstlb rPromstlb;
	static PromstlbPK promstlbPK;
	static TypedQuery<Promstlb> qPromstlb;
	static List<Promstlb> rPromstlbList;
	static Integer rPromstlbPOS;
	static Boolean rPromstlbFOUND;
	static Boolean rPromstlbEOF;
	static EntityManager promst;
	static Promst rPromst;
	static PromstPK promstPK;
	static TypedQuery<Promst> qPromst;
	static List<Promst> rPromstList;
	static Integer rPromstPOS;
	static Boolean rPromstFOUND;
	static Boolean rPromstEOF;
	static EntityManager promstlc;
	static Promstlc rPromstlc;
	static PromstlcPK promstlcPK;
	static TypedQuery<Promstlc> qPromstlc;
	static List<Promstlc> rPromstlcList;
	static Integer rPromstlcPOS;
	static Boolean rPromstlcFOUND;
	static Boolean rPromstlcEOF;
	static EntityManager proext;
	static Proext rProext;
	static ProextPK proextPK;
	static TypedQuery<Proext> qProext;
	static List<Proext> rProextList;
	static Integer rProextPOS;
	static Boolean rProextFOUND;
	static Boolean rProextEOF;
	static EntityManager pritds;
	static Pritd rPritds;
	static PritdPK pritdsPK;
	static TypedQuery<Pritd> qPritds;
	static List<Pritd> rPritdsList;
	static Integer rPritdsPOS;
	static Boolean rPritdsFOUND;
	static Boolean rPritdsEOF;
	static EntityManager mktadd;
	static Mktadd rMktadd;
	static MktaddPK mktaddPK;
	static TypedQuery<Mktadd> qMktadd;
	static List<Mktadd> rMktaddList;
	static Integer rMktaddPOS;
	static Boolean rMktaddFOUND;
	static Boolean rMktaddEOF;
	static EntityManager schdft;
	static Schdft rSchdft;
	static SchdftPK schdftPK;
	static TypedQuery<Schdft> qSchdft;
	static List<Schdft> rSchdftList;
	static Integer rSchdftPOS;
	static Boolean rSchdftFOUND;
	static Boolean rSchdftEOF;
	static EntityManager taskms;
	static Taskm rTaskms;
	static TaskmPK taskmsPK;
	static TypedQuery<Taskm> qTaskms;
	static List<Taskm> rTaskmsList;
	static Integer rTaskmsPOS;
	static Boolean rTaskmsFOUND;
	static Boolean rTaskmsEOF;
	static EntityManager pkgsrv;
	static Pkgsrv rPkgsrv;
	static PkgsrvPK pkgsrvPK;
	static TypedQuery<Pkgsrv> qPkgsrv;
	static List<Pkgsrv> rPkgsrvList;
	static Integer rPkgsrvPOS;
	static Boolean rPkgsrvFOUND;
	static Boolean rPkgsrvEOF;
	static EntityManager catskd;
	static Catskd rCatskd;
	static CatskdPK catskdPK;
	static TypedQuery<Catskd> qCatskd;
	static List<Catskd> rCatskdList;
	static Integer rCatskdPOS;
	static Boolean rCatskdFOUND;
	static Boolean rCatskdEOF;
	static EntityManager qufdtl;
	static Qufdtl rQufdtl;
	static QufdtlPK qufdtlPK;
	static TypedQuery<Qufdtl> qQufdtl;
	static List<Qufdtl> rQufdtlList;
	static Integer rQufdtlPOS;
	static Boolean rQufdtlFOUND;
	static Boolean rQufdtlEOF;
	static EntityManager valsum;
	static Valsum rValsum;
	static ValsumPK valsumPK;
	static TypedQuery<Valsum> qValsum;
	static List<Valsum> rValsumList;
	static Integer rValsumPOS;
	static Boolean rValsumFOUND;
	static Boolean rValsumEOF;
	static EntityManager cmptwn;
	static Cmptwn rCmptwn;
	static CmptwnPK cmptwnPK;
	static TypedQuery<Cmptwn> qCmptwn;
	static List<Cmptwn> rCmptwnList;
	static Integer rCmptwnPOS;
	static Boolean rCmptwnFOUND;
	static Boolean rCmptwnEOF;
	static EntityManager adtitmo;
	static Adtitmo rAdtitmo;
	static AdtitmoPK adtitmoPK;
	static TypedQuery<Adtitmo> qAdtitmo;
	static List<Adtitmo> rAdtitmoList;
	static Integer rAdtitmoPOS;
	static Boolean rAdtitmoFOUND;
	static Boolean rAdtitmoEOF;
	static EntityManager adtqsp;
	static Adtqsp rAdtqsp;
	static AdtqspPK adtqspPK;
	static TypedQuery<Adtqsp> qAdtqsp;
	static List<Adtqsp> rAdtqspList;
	static Integer rAdtqspPOS;
	static Boolean rAdtqspFOUND;
	static Boolean rAdtqspEOF;
	static EntityManager zipsrvla;
	static Zipsrvla rZipsrvla;
	static ZipsrvlaPK zipsrvlaPK;
	static TypedQuery<Zipsrvla> qZipsrvla;
	static List<Zipsrvla> rZipsrvlaList;
	static Integer rZipsrvlaPOS;
	static Boolean rZipsrvlaFOUND;
	static Boolean rZipsrvlaEOF;
	static EntityManager schdetli;
	static Schdetli rSchdetli;
	static SchdetliPK schdetliPK;
	static TypedQuery<Schdetli> qSchdetli;
	static List<Schdetli> rSchdetliList;
	static Integer rSchdetliPOS;
	static Boolean rSchdetliFOUND;
	static Boolean rSchdetliEOF;
	static EntityManager schdetlc;
	static Schdetlc rSchdetlc;
	static SchdetlcPK schdetlcPK;
	static TypedQuery<Schdetlc> qSchdetlc;
	static List<Schdetlc> rSchdetlcList;
	static Integer rSchdetlcPOS;
	static Boolean rSchdetlcFOUND;
	static Boolean rSchdetlcEOF;
	static EntityManager repmst;
	static Repmst rRepmst;
	static RepmstPK repmstPK;
	static TypedQuery<Repmst> qRepmst;
	static List<Repmst> rRepmstList;
	static Integer rRepmstPOS;
	static Boolean rRepmstFOUND;
	static Boolean rRepmstEOF;
	static EntityManager sr0rsq05;
	static Sr0rsq05 rSr0rsq05;
	static Sr0rsq05PK sr0rsq05PK;
	static TypedQuery<Sr0rsq05> qSr0rsq05;
	static List<Sr0rsq05> rSr0rsq05List;
	static Integer rSr0rsq05POS;
	static Boolean rSr0rsq05FOUND;
	static Boolean rSr0rsq05EOF;
	static EntityManager valdetla;
	static Valdetla rValdetla;
	static ValdetlaPK valdetlaPK;
	static TypedQuery<Valdetla> qValdetla;
	static List<Valdetla> rValdetlaList;
	static Integer rValdetlaPOS;
	static Boolean rValdetlaFOUND;
	static Boolean rValdetlaEOF;
	static EntityManager propkg;
	static Propkg rPropkg;
	static PropkgPK propkgPK;
	static TypedQuery<Propkg> qPropkg;
	static List<Propkg> rPropkgList;
	static Integer rPropkgPOS;
	static Boolean rPropkgFOUND;
	static Boolean rPropkgEOF;
	static EntityManager procamp;
	static Procamp rProcamp;
	static ProcampPK procampPK;
	static TypedQuery<Procamp> qProcamp;
	static List<Procamp> rProcampList;
	static Integer rProcampPOS;
	static Boolean rProcampFOUND;
	static Boolean rProcampEOF;
	static EntityManager paktwn;
	static Paktwn rPaktwn;
	static PaktwnPK paktwnPK;
	static TypedQuery<Paktwn> qPaktwn;
	static List<Paktwn> rPaktwnList;
	static Integer rPaktwnPOS;
	static Boolean rPaktwnFOUND;
	static Boolean rPaktwnEOF;
	static EntityManager pakspcde;
	static Pakspcde rPakspcde;
	static PakspcdePK pakspcdePK;
	static TypedQuery<Pakspcde> qPakspcde;
	static List<Pakspcde> rPakspcdeList;
	static Integer rPakspcdePOS;
	static Boolean rPakspcdeFOUND;
	static Boolean rPakspcdeEOF;
	static EntityManager adt520;
	static Adt520 rAdt520;
	static Adt520PK adt520PK;
	static TypedQuery<Adt520> qAdt520;
	static List<Adt520> rAdt520List;
	static Integer rAdt520POS;
	static Boolean rAdt520FOUND;
	static Boolean rAdt520EOF;
	static EntityManager adtqspb;
	static Adtqspb rAdtqspb;
	static AdtqspbPK adtqspbPK;
	static TypedQuery<Adtqspb> qAdtqspb;
	static List<Adtqspb> rAdtqspbList;
	static Integer rAdtqspbPOS;
	static Boolean rAdtqspbFOUND;
	static Boolean rAdtqspbEOF;
	static EntityManager adt522la;
	static Adt522la rAdt522la;
	static Adt522laPK adt522laPK;
	static TypedQuery<Adt522la> qAdt522la;
	static List<Adt522la> rAdt522laList;
	static Integer rAdt522laPOS;
	static Boolean rAdt522laFOUND;
	static Boolean rAdt522laEOF;
	static EntityManager adt521lb;
	static Adt521lb rAdt521lb;
	static Adt521lbPK adt521lbPK;
	static TypedQuery<Adt521lb> qAdt521lb;
	static List<Adt521lb> rAdt521lbList;
	static Integer rAdt521lbPOS;
	static Boolean rAdt521lbFOUND;
	static Boolean rAdt521lbEOF;
	static EntityManager pmt002la;
	static Pmt002la rPmt002la;
	static Pmt002laPK pmt002laPK;
	static TypedQuery<Pmt002la> qPmt002la;
	static List<Pmt002la> rPmt002laList;
	static Integer rPmt002laPOS;
	static Boolean rPmt002laFOUND;
	static Boolean rPmt002laEOF;
	static EntityManager mp100;
	static Mp100 rMp100;
	static Mp100PK mp100PK;
	static TypedQuery<Mp100> qMp100;
	static List<Mp100> rMp100List;
	static Integer rMp100POS;
	static Boolean rMp100FOUND;
	static Boolean rMp100EOF;
	static EntityManager mp100la;
	static Mp100la rMp100la;
	static Mp100laPK mp100laPK;
	static TypedQuery<Mp100la> qMp100la;
	static List<Mp100la> rMp100laList;
	static Integer rMp100laPOS;
	static Boolean rMp100laFOUND;
	static Boolean rMp100laEOF;
	static EntityManager quhdrlb;
	static Quhdrlb rQuhdrlb;
	static QuhdrlbPK quhdrlbPK;
	static TypedQuery<Quhdrlb> qQuhdrlb;
	static List<Quhdrlb> rQuhdrlbList;
	static Integer rQuhdrlbPOS;
	static Boolean rQuhdrlbFOUND;
	static Boolean rQuhdrlbEOF;
	static EntityManager pkgmno;
	static Pkgmno rPkgmno;
	static PkgmnoPK pkgmnoPK;
	static TypedQuery<Pkgmno> qPkgmno;
	static List<Pkgmno> rPkgmnoList;
	static Integer rPkgmnoPOS;
	static Boolean rPkgmnoFOUND;
	static Boolean rPkgmnoEOF;
	static EntityManager pakcamp;
	static Pakcamp rPakcamp;
	static PakcampPK pakcampPK;
	static TypedQuery<Pakcamp> qPakcamp;
	static List<Pakcamp> rPakcampList;
	static Integer rPakcampPOS;
	static Boolean rPakcampFOUND;
	static Boolean rPakcampEOF;
	static EntityManager itmovr;
	static Itmovr rItmovr;
	static ItmovrPK itmovrPK;
	static TypedQuery<Itmovr> qItmovr;
	static List<Itmovr> rItmovrList;
	static Integer rItmovrPOS;
	static Boolean rItmovrFOUND;
	static Boolean rItmovrEOF;
	static EntityManager qudtllb;
	static Qudtllb rQudtllb;
	static QudtllbPK qudtllbPK;
	static TypedQuery<Qudtllb> qQudtllb;
	static List<Qudtllb> rQudtllbList;
	static Integer rQudtllbPOS;
	static Boolean rQudtllbFOUND;
	static Boolean rQudtllbEOF;
	static EntityManager qufdtlla;
	static Qufdtlla rQufdtlla;
	static QufdtllaPK qufdtllaPK;
	static TypedQuery<Qufdtlla> qQufdtlla;
	static List<Qufdtlla> rQufdtllaList;
	static Integer rQufdtllaPOS;
	static Boolean rQufdtllaFOUND;
	static Boolean rQufdtllaEOF;
	static EntityManager itmclr;
	static Itmclr rItmclr;
	static ItmclrPK itmclrPK;
	static TypedQuery<Itmclr> qItmclr;
	static List<Itmclr> rItmclrList;
	static Integer rItmclrPOS;
	static Boolean rItmclrFOUND;
	static Boolean rItmclrEOF;
	static EntityManager slstyp;
	static Slstyp rSlstyp;
	static SlstypPK slstypPK;
	static TypedQuery<Slstyp> qSlstyp;
	static List<Slstyp> rSlstypList;
	static Integer rSlstypPOS;
	static Boolean rSlstypFOUND;
	static Boolean rSlstypEOF;
	static EntityManager adtpo2;
	static Adtpo2 rAdtpo2;
	static Adtpo2PK adtpo2PK;
	static TypedQuery<Adtpo2> qAdtpo2;
	static List<Adtpo2> rAdtpo2List;
	static Integer rAdtpo2POS;
	static Boolean rAdtpo2FOUND;
	static Boolean rAdtpo2EOF;
	static EntityManager adtpo3;
	static Adtpo3 rAdtpo3;
	static Adtpo3PK adtpo3PK;
	static TypedQuery<Adtpo3> qAdtpo3;
	static List<Adtpo3> rAdtpo3List;
	static Integer rAdtpo3POS;
	static Boolean rAdtpo3FOUND;
	static Boolean rAdtpo3EOF;
	static EntityManager adt520x;
	static Adt520x rAdt520x;
	static Adt520xPK adt520xPK;
	static TypedQuery<Adt520x> qAdt520x;
	static List<Adt520x> rAdt520xList;
	static Integer rAdt520xPOS;
	static Boolean rAdt520xFOUND;
	static Boolean rAdt520xEOF;
	static EntityManager proextn;
	static Proextn rProextn;
	static ProextnPK proextnPK;
	static TypedQuery<Proextn> qProextn;
	static List<Proextn> rProextnList;
	static Integer rProextnPOS;
	static Boolean rProextnFOUND;
	static Boolean rProextnEOF;
	static EntityManager pkgcombf;
	static Pkgcombf rPkgcombf;
	static PkgcombfPK pkgcombfPK;
	static TypedQuery<Pkgcombf> qPkgcombf;
	static List<Pkgcombf> rPkgcombfList;
	static Integer rPkgcombfPOS;
	static Boolean rPkgcombfFOUND;
	static Boolean rPkgcombfEOF;
	static EntityManager prosls;
	static Prosl rProsls;
	static ProslPK proslsPK;
	static TypedQuery<Prosl> qProsls;
	static List<Prosl> rProslsList;
	static Integer rProslsPOS;
	static Boolean rProslsFOUND;
	static Boolean rProslsEOF;
	static EntityManager paksls;
	static Paksl rPaksls;
	static PakslPK pakslsPK;
	static TypedQuery<Paksl> qPaksls;
	static List<Paksl> rPakslsList;
	static Integer rPakslsPOS;
	static Boolean rPakslsFOUND;
	static Boolean rPakslsEOF;
	static EntityManager adtpspsh;
	static Adtpspsh rAdtpspsh;
	static AdtpspshPK adtpspshPK;
	static TypedQuery<Adtpspsh> qAdtpspsh;
	static List<Adtpspsh> rAdtpspshList;
	static Integer rAdtpspshPOS;
	static Boolean rAdtpspshFOUND;
	static Boolean rAdtpspshEOF;
	static EntityManager l1pdtl;
	static L1pdtl rL1pdtl;
	static L1pdtlPK l1pdtlPK;
	static TypedQuery<L1pdtl> qL1pdtl;
	static List<L1pdtl> rL1pdtlList;
	static Integer rL1pdtlPOS;
	static Boolean rL1pdtlFOUND;
	static Boolean rL1pdtlEOF;
	static EntityManager cpnacflb;
	static Cpnacflb rCpnacflb;
	static CpnacflbPK cpnacflbPK;
	static TypedQuery<Cpnacflb> qCpnacflb;
	static List<Cpnacflb> rCpnacflbList;
	static Integer rCpnacflbPOS;
	static Boolean rCpnacflbFOUND;
	static Boolean rCpnacflbEOF;
	static EntityManager qutrip;
	static Qutrip rQutrip;
	static QutripPK qutripPK;
	static TypedQuery<Qutrip> qQutrip;
	static List<Qutrip> rQutripList;
	static Integer rQutripPOS;
	static Boolean rQutripFOUND;
	static Boolean rQutripEOF;
	static EntityManager adtpteri;
	static Adtpteri rAdtpteri;
	static AdtpteriPK adtpteriPK;
	static TypedQuery<Adtpteri> qAdtpteri;
	static List<Adtpteri> rAdtpteriList;
	static Integer rAdtpteriPOS;
	static Boolean rAdtpteriFOUND;
	static Boolean rAdtpteriEOF;
	static EntityManager adtmmquot;
	static Adtmmquot rAdtmmquot;
	static AdtmmquotPK adtmmquotPK;
	static TypedQuery<Adtmmquot> qAdtmmquot;
	static List<Adtmmquot> rAdtmmquotList;
	static Integer rAdtmmquotPOS;
	static Boolean rAdtmmquotFOUND;
	static Boolean rAdtmmquotEOF;
	static EntityManager adtordtyp;
	static Adtordtyp rAdtordtyp;
	static AdtordtypPK adtordtypPK;
	static TypedQuery<Adtordtyp> qAdtordtyp;
	static List<Adtordtyp> rAdtordtypList;
	static Integer rAdtordtypPOS;
	static Boolean rAdtordtypFOUND;
	static Boolean rAdtordtypEOF;
	static EntityManager itmstef;
	static Itmstef rItmstef;
	static ItmstefPK itmstefPK;
	static TypedQuery<Itmstef> qItmstef;
	static List<Itmstef> rItmstefList;
	static Integer rItmstefPOS;
	static Boolean rItmstefFOUND;
	static Boolean rItmstefEOF;
	static EntityManager itmstf;
	static Itmstf rItmstf;
	static ItmstfPK itmstfPK;
	static TypedQuery<Itmstf> qItmstf;
	static List<Itmstf> rItmstfList;
	static Integer rItmstfPOS;
	static Boolean rItmstfFOUND;
	static Boolean rItmstfEOF;
	static EntityManager itm120v;
	static Itm120v rItm120v;
	static Itm120vPK itm120vPK;
	static TypedQuery<Itm120v> qItm120v;
	static List<Itm120v> rItm120vList;
	static Integer rItm120vPOS;
	static Boolean rItm120vFOUND;
	static Boolean rItm120vEOF;
	static EntityManager repmas;
	static Repma rRepmas;
	static RepmaPK repmasPK;
	static TypedQuery<Repma> qRepmas;
	static List<Repma> rRepmasList;
	static Integer rRepmasPOS;
	static Boolean rRepmasFOUND;
	static Boolean rRepmasEOF;
	static EntityManager usrpakgf;
	static Usrpakgf rUsrpakgf;
	static UsrpakgfPK usrpakgfPK;
	static TypedQuery<Usrpakgf> qUsrpakgf;
	static List<Usrpakgf> rUsrpakgfList;
	static Integer rUsrpakgfPOS;
	static Boolean rUsrpakgfFOUND;
	static Boolean rUsrpakgfEOF;
	static EntityManager ofrmntflb;
	static Ofrmntflb rOfrmntflb;
	static OfrmntflbPK ofrmntflbPK;
	static TypedQuery<Ofrmntflb> qOfrmntflb;
	static List<Ofrmntflb> rOfrmntflbList;
	static Integer rOfrmntflbPOS;
	static Boolean rOfrmntflbFOUND;
	static Boolean rOfrmntflbEOF;
	static EntityManager itmlin;
	static Itmlin rItmlin;
	static ItmlinPK itmlinPK;
	static TypedQuery<Itmlin> qItmlin;
	static List<Itmlin> rItmlinList;
	static Integer rItmlinPOS;
	static Boolean rItmlinFOUND;
	static Boolean rItmlinEOF;
	static EntityManager proqsrc;
	static Proqsrc rProqsrc;
	static ProqsrcPK proqsrcPK;
	static TypedQuery<Proqsrc> qProqsrc;
	static List<Proqsrc> rProqsrcList;
	static Integer rProqsrcPOS;
	static Boolean rProqsrcFOUND;
	static Boolean rProqsrcEOF;
	static EntityManager quphnd;
	static Quphnd rQuphnd;
	static QuphndPK quphndPK;
	static TypedQuery<Quphnd> qQuphnd;
	static List<Quphnd> rQuphndList;
	static Integer rQuphndPOS;
	static Boolean rQuphndFOUND;
	static Boolean rQuphndEOF;
	static EntityManager prointro;
	static Prointro rProintro;
	static ProintroPK prointroPK;
	static TypedQuery<Prointro> qProintro;
	static List<Prointro> rProintroList;
	static Integer rProintroPOS;
	static Boolean rProintroFOUND;
	static Boolean rProintroEOF;
	static EntityManager introffer;
	static Introffer rIntroffer;
	static IntrofferPK introfferPK;
	static TypedQuery<Introffer> qIntroffer;
	static List<Introffer> rIntrofferList;
	static Integer rIntrofferPOS;
	static Boolean rIntrofferFOUND;
	static Boolean rIntrofferEOF;
	static EntityManager quhneg;
	static Quhneg rQuhneg;
	static QuhnegPK quhnegPK;
	static TypedQuery<Quhneg> qQuhneg;
	static List<Quhneg> rQuhnegList;
	static Integer rQuhnegPOS;
	static Boolean rQuhnegFOUND;
	static Boolean rQuhnegEOF;
	static EntityManager qufinl;
	static Qufinl rQufinl;
	static QufinlPK qufinlPK;
	static TypedQuery<Qufinl> qQufinl;
	static List<Qufinl> rQufinlList;
	static Integer rQufinlPOS;
	static Boolean rQufinlFOUND;
	static Boolean rQufinlEOF;
	static EntityManager pritdse;
	static Pritdse rPritdse;
	static PritdsePK pritdsePK;
	static TypedQuery<Pritdse> qPritdse;
	static List<Pritdse> rPritdseList;
	static Integer rPritdsePOS;
	static Boolean rPritdseFOUND;
	static Boolean rPritdseEOF;
	static EntityManager itusneg;
	static Itusneg rItusneg;
	static ItusnegPK itusnegPK;
	static TypedQuery<Itusneg> qItusneg;
	static List<Itusneg> rItusnegList;
	static Integer rItusnegPOS;
	static Boolean rItusnegFOUND;
	static Boolean rItusnegEOF;
	static EntityManager usritmf;
	static Usritmf rUsritmf;
	static UsritmfPK usritmfPK;
	static TypedQuery<Usritmf> qUsritmf;
	static List<Usritmf> rUsritmfList;
	static Integer rUsritmfPOS;
	static Boolean rUsritmfFOUND;
	static Boolean rUsritmfEOF;
	static EntityManager lqgitmf;
	static Lqgitmf rLqgitmf;
	static LqgitmfPK lqgitmfPK;
	static TypedQuery<Lqgitmf> qLqgitmf;
	static List<Lqgitmf> rLqgitmfList;
	static Integer rLqgitmfPOS;
	static Boolean rLqgitmfFOUND;
	static Boolean rLqgitmfEOF;
	static EntityManager partofl;
	static Partofl rPartofl;
	static PartoflPK partoflPK;
	static TypedQuery<Partofl> qPartofl;
	static List<Partofl> rPartoflList;
	static Integer rPartoflPOS;
	static Boolean rPartoflFOUND;
	static Boolean rPartoflEOF;
	static EntityManager adtqspp;
	static Adtqspp rAdtqspp;
	static AdtqsppPK adtqsppPK;
	static TypedQuery<Adtqspp> qAdtqspp;
	static List<Adtqspp> rAdtqsppList;
	static Integer rAdtqsppPOS;
	static Boolean rAdtqsppFOUND;
	static Boolean rAdtqsppEOF;
	static EntityManager rsncpqcf;
	static Rsncpqcf rRsncpqcf;
	static RsncpqcfPK rsncpqcfPK;
	static TypedQuery<Rsncpqcf> qRsncpqcf;
	static List<Rsncpqcf> rRsncpqcfList;
	static Integer rRsncpqcfPOS;
	static Boolean rRsncpqcfFOUND;
	static Boolean rRsncpqcfEOF;
	static EntityManager rsncpqf;
	static Rsncpqf rRsncpqf;
	static RsncpqfPK rsncpqfPK;
	static TypedQuery<Rsncpqf> qRsncpqf;
	static List<Rsncpqf> rRsncpqfList;
	static Integer rRsncpqfPOS;
	static Boolean rRsncpqfFOUND;
	static Boolean rRsncpqfEOF;
	static String[] xTTL = { "N E W   Q U O T E   C R E A T I O N", "ANNUAL SERVICE / CREDIT", "QUALITY SERVICE PLAN", "Promotion Discount Select", "Q U O T E    S E L E C T I O N", "Q U O T E   I N Q U I R Y", "Q U O T E   D E L E T I O N"};
	static List<String> TTL = Arrays.asList(xTTL);
	static String[] xCMD = { "F3=Exit", "NOT USED", "NOT USED", "NOT USED", "NOT USED", "NOT USED", "F3=Exit   F14=Prom Discounts   F16=Reload Discounts", "F14=Prom Discounts   F16=Reload Discounts"};
	static List<String> CMD = Arrays.asList(xCMD);
	static String[] xERR = { "200-1) Package Code must be entered, '?' lookup is available", "200-2) Package Code entered is invalid, '?' lookup is available", "200-3) Monitored/Local must be 'M' or 'L'", "200-4) Invalid Pricing Category, '?' lookup is available", "200-5) Base Package", "200-6) Credit Card discount must be 'Y' or 'N'", "200-7) Errors occured, please correct", "200-8) Roll Up past last record", "200-9) Quality Service Plan must be 'Y' or 'N'", "200-10) Pricing Category is not set up for package", "200-11) LIne XXXX Invalid Option", "200-12) WARNING: Neg. Price set to Zero because of Quote price change", "200-13) Monitored/Local must be 'M' if Credit Card Dis.is equal to 'Y'", "200-14) WARNING: Neg. Monitor.Price set to Zero due to Mon. price chg.", "200-15) Annual Service Charges", "200-16) Installation Charges", "200-17) Item not found", "200-18) Total Discount $ exceed Promotion Maximum Dollars allowed", "200-19) Total Discount Selections exceed Maximum selections allowed", "200-20) Total Items Selected exceed Maximum selections allowed", "No Items Selected", "200-22) WARNING: Neg. Permit Fee set to Zero due to Permit Fee chg.", "200-23) The 'F5=Profile Window' must be completed before Quote.", "200-24) The account must be sourced USAA to select a USAA Package.", "200-25) Add-on Charges", "200-26) You can only finalize a maximum of two for this campaign.", "200-27) SW VIDEOVIEW should be ONE of the Package finalized.", "200-28) Exceeded maximum quantity allowed for this item.", "200-29) RELO source & promotion overrides price category to ORS.", "200-30) RELO source & promotion overrides price category to ADT.", "200-31) BA package must be completed before you can select VideoView Pack", "200-32) Pricing Category is not set up for Promotion.", "200-33) One of the bundled services must be selected.", "200-34) Option 'E' is only allowed for finalized quotes", "200-35) HV locked quote, select 'I' for inquiry.", "200-36) Invalid sale type.", "200-37) Invalid Package/Queried Source Combination.", "200-38) Invalid Package/Promotion Combination.", "200-39) Invalid Package/Generic Media Combination.", "200-40) Manual entry Restricted.Only '?' is allowed.", "200-41) Campaign does not match with Sales Type Campaign.", "200-42) BV Account - Invalid Package, please select a BV package.", "200-43) Selected Promotion Code is restricted for Coupon/Offer.", "200-44) Coupon/Offer for this Promotion has expired.", "200-45) No Trip Charges have been applied on this account.", "200-46) Invalid Sale Type Selected for Package.", "200-47) Promo cannot be applied to Sale Type.", "200-48) Package restricted for the Group ID.", "200-49) Invalid Responder Key value for COMPAN campaign.", "200-50) Promotion not valid this Queried Source.", "200-51) There is no Introductory Rate for this Promotion", "200-52) To select Optional Item Discount, kindly press F15.", "Package-Promotion mismatch. Please verify."};
	static List<String> ERR = Arrays.asList(xERR);
	static String[] xQCMD = { "OVRPRTF FILE(SH380SPT) HOLD(*YES)", "OVRPRTF FILE(SH381SPT) HOLD(*YES)", "DSPSPLF FILE(SH380SPT) SPLNBR(*LAST)", "DSPSPLF FILE(SH381SPT) SPLNBR(*LAST)", "DLTSPLF FILE(SH380SPT) SPLNBR(*LAST)", "DLTSPLF FILE(SH381SPT) SPLNBR(*LAST)", "DLTOVR FILE(*ALL)"};
	static List<String> QCMD = Arrays.asList(xQCMD);
	static String[] xCVID = { "12144 CAN", "12431 CAN", "12432 CAN", "12433 CAN", "12434 CAN", "12435 CAN", "12436 CAN"};
	static List<String> CVID = Arrays.asList(xCVID);
	static String[] xINTRO = { "Dollars Off Original ANSC", "% Off Original ANSC", "Fixed Monthly Monitoring"};
	static List<String> INTRO = Arrays.asList(xINTRO);
	static String[] xCOLOR = { "WN", "PN", "GN", "BN", "TN", "RN", "YN"};
	static List<String> COLOR = Arrays.asList(xCOLOR);
	static String[] xANC = new String[999];
	static List<String> ANC = Arrays.asList(xANC);
	static Float[] xANF = new Float[999];
		static List<Float> ANF = Arrays.asList(xANF);
	static Integer[] xANQ = new Integer[999];
	static List<Integer> ANQ = Arrays.asList(xANQ);
	static String[] xAND = new String[999];
	static List<String> AND = Arrays.asList(xAND);
	static String[] xAMS = new String[999];
	static List<String> AMS = Arrays.asList(xAMS);
	static String[] xANY = new String[999];
	static List<String> ANY = Arrays.asList(xANY);
	static String[] xANZ = new String[999];
	static List<String> ANZ = Arrays.asList(xANZ);
	static String[] xANFL = new String[999];
	static List<String> ANFL = Arrays.asList(xANFL);
	static String[] xWAC = new String[999];
	static List<String> WAC = Arrays.asList(xWAC);
	static String[] xWAD = new String[999];
	static List<String> WAD = Arrays.asList(xWAD);
	static Float[] xWAF = new Float[999];
		static List<Float> WAF = Arrays.asList(xWAF);
	static Float[] xWAT = new Float[999];
		static List<Float> WAT = Arrays.asList(xWAT);
	static Integer[] xWAQ = new Integer[999];
	static List<Integer> WAQ = Arrays.asList(xWAQ);
	static Integer[] xWAP = new Integer[999];
	static List<Integer> WAP = Arrays.asList(xWAP);
	static String[] xPIT = new String[100];
	static List<String> PIT = Arrays.asList(xPIT);
	static String[] xPDS = new String[100];
	static List<String> PDS = Arrays.asList(xPDS);
	static String[] xPAD = new String[100];
	static List<String> PAD = Arrays.asList(xPAD);
	static Integer[] xPMN = new Integer[100];
	static List<Integer> PMN = Arrays.asList(xPMN);
	static Float[] xPDO = new Float[100];
		static List<Float> PDO = Arrays.asList(xPDO);
	static Float[] xPPC = new Float[100];
		static List<Float> PPC = Arrays.asList(xPPC);
	static Integer[] xPMX = new Integer[100];
	static List<Integer> PMX = Arrays.asList(xPMX);
	static Integer[] xPQT = new Integer[100];
	static List<Integer> PQT = Arrays.asList(xPQT);
	static Float[] xPAM = new Float[100];
		static List<Float> PAM = Arrays.asList(xPAM);
	static String[] xPMS = new String[100];
	static List<String> PMS = Arrays.asList(xPMS);
	static Float[] xPSP = new Float[100];
		static List<Float> PSP = Arrays.asList(xPSP);
	static String[] xPO$ = new String[100];
	static List<String> PO$ = Arrays.asList(xPO$);
	static String[] xPOP = new String[100];
	static List<String> POP = Arrays.asList(xPOP);
	static String[] xPIE = new String[100];
	static List<String> PIE = Arrays.asList(xPIE);
	static String[] xPFB = new String[100];
	static List<String> PFB = Arrays.asList(xPFB);
	static String[] xXIT = new String[100];
	static List<String> XIT = Arrays.asList(xXIT);
	static String[] xXMS = new String[100];
	static List<String> XMS = Arrays.asList(xXMS);
	static String[] xPGR = new String[100];
	static List<String> PGR = Arrays.asList(xPGR);
	static String[] xPCHG = new String[100];
	static List<String> PCHG = Arrays.asList(xPCHG);
	static String[] xPGRP = new String[100];
	static List<String> PGRP = Arrays.asList(xPGRP);
	static Integer[] xPGRPI = new Integer[100];
	static List<Integer> PGRPI = Arrays.asList(xPGRPI);
	static String[] xPGRPS = new String[100];
	static List<String> PGRPS = Arrays.asList(xPGRPS);
	static String[] xWSL = new String[100];
	static List<String> WSL = Arrays.asList(xWSL);
	static String $CONST250 = "250";
	static String ATEMPMS = "";
	static Integer[] xQFLINE = new Integer[100];
	static List<Integer> QFLINE = Arrays.asList(xQFLINE);
	static Float[] xQFNEGP = new Float[100];
		static List<Float> QFNEGP = Arrays.asList(xQFNEGP);
	static String AMSFLAG = "0";
	static String $PRSRFLG = "0";
	static String $CPQWIN = "";
	static String $RTNMSG = "";
	static WsdsDS wsdsDS;
	static BinaryDS binaryDS;
	static PgmnamDS pgmnamDS;
	static SzerrmDS szerrmDS;
	static LdadsDS ldadsDS;
	static QuentdDS quentdDS;
	static MphoneDS mphoneDS;
	static MkactyDS mkactyDS;
	static final String DIGITS = " 1234567890";
	static ChsparmsDS chsparmsDS;
	static final String $CONSTUSAA = "USAA";
	static final String $CONSTX = "X";
	static final String $CONSTONE = "1";
	static final String $CONSTZRO = "0";
	static Integer $$ADAT = 0;
	static In2kx8DS in2kx8DS;
	static String $$ADTA = "";
	static String $CMD80 = "";
	static Integer $FDFLG = 0;
	static String $FLAG = "";
	static String $FLAG2 = "";
	static String $FLAG3 = "";
	static String $FLAG4 = "";
	static String $FLAG5 = "";
	static String $HD = "";
	static Integer $HLD = 0;
	static String $MANSL = "";
	static String $PAS1 = "";
	static String $QDATE = "";
	static String $TSKTP = "";
	static Integer _PTUSD = 0;
	static Integer _PTWRK = 0;
	static String AACAT;
	static float AAMINP = 0;
	static String AAOPTN = "";
	static String AAPKG;
	static float AASLSP = 0;
	static Integer A1 = 0;
	static Integer A2 = 0;
	static Integer A3 = 0;
	static Integer C = 0;
	static float CBFIR1;
	static Integer CBSEQ0 = 0;
	static String CKZIP = "";
	static Integer COUNT0 = 0;
	static Integer CPOS = 0;
	static String DESC20 = "";
	static String FRCANA = "";
	static String FRCDSA = "";
	static float HBITAMT;
	static float HBITPC;
	static Integer HBITQTY;
	static float HBITMX$;
	static float HBITMXP;
	static float HKITAM;
	static Integer HKITQT;
	static String HSUSP = "";
	static String ITEM00 = "";
	static Integer LINE00 = 0;
	static Integer NOITM0 = 0;
	static Integer NOSEL0 = 0;
	static Integer ONCE = 0;
	static String PGMSCR = "";
	static String PROCSS = "";
	static String PROMO0;
	static Integer PTDIF = 0;
	static float PVUSD = 0;
	static Integer P1 = 0;
	static Integer P2 = 0;
	static Integer P3 = 0;
	static Integer RCCOUT = 0;
	static String REPLY0 = "";
	static Integer ROW = 0;
	static Integer RR = 0;
	static Integer RRNA = 0;
	static Integer RRNB = 0;
	static Integer RRNC = 0;
	static Integer RRND = 0;
	static Integer RRNE = 0;
	static Integer RRNE1 = 0;
	static Integer $RRNE = 0;
	static String $GROUPS = "";
	static String $OGRPID = "";
	static Integer RRNY = 0;
	static Integer RRNZ = 0;
	static String SAMEPR = "";
	static String SCRNAM = "";
	static String SRTERR;
	static String SUBT99 = "";
	static float SVB$AD;
	static String SVCAT;
	static String SVCAT2;
	static float SVMFWT;
	static float SVPERM;
	static String SVMON;
	static String SVPKG;
	static Integer SVRRN = 0;
	static String SVWARC = "";
	static String S0ACCT;
	static String S0CAMP;
	static String S0ENT;
	static String S0PROM;
	static String S0TERR;
	static String S0ZIP;
	static String S5ZIP = "";
	static String S6ZIP = "";
	static String S9TERR;
	static String S9ZIP = "";
	static String TASK99 = "";
	static String TERR99 = "";
	static float TOTDS0 = 0;
	static Integer TOTMN0 = 0;
	static Integer TOTMN9 = 0;
	static Integer TOTSFB = 0;
	static String USR08A = "";
	static String VALSWT = "";
	static String WKCAT = "";
	static String WKCODE = "";
	static Integer WK2 = 0;
	static Integer WK3 = 0;
	static float WRKAD0 = 0;
	static Integer WRKDT0 = 0;
	static float WRKPC0 = 0;
	static float WRKPR0 = 0;
	static Integer WRKQT0 = 0;
	static Integer WRKRNE = 0;
	static Integer WRKTM0 = 0;
	static float WRK092 = 0;
	static Integer W1 = 0;
	static Integer W2 = 0;
	static Integer W9 = 0;
	static Integer X0 = 0;
	static Integer X1 = 0;
	static String YTERR;
	static String ZTERR;
	static String ZZTERR;
	static Integer Z0 = 0;
	static float $PDTTL = 0;
	static float $PDTTL2 = 0;
	static float $PDTEMP = 0;
	static Integer $FFLAG = 0;
	static String $FACCT = "";
	static Integer $FSEQ = 0;
	static String $PKG5 = "";
	static String $DATE6 = "";
	static String $PROFILE = "NEWRESI   ";
	static Integer $POS = 0;
	static Integer $POS2 = 0;
	static float $AMOUNT = 0;
	static String $ITEM = "ITEM           ";
	static String $PAK;
	static Integer $COUNTER = 0;
	static String $ACCT;
	static String $ATYP = "";
	static float $LAB = 0;
	static float $MAT = 0;
	static float $TAX = 0;
	static String $ADD1 = "";
	static String $ADD2 = "";
	static String $CITY25 = "";
	static String $STATE = "";
	static String $ZIP5 = "";
	static Date ISODATE = new Date();
	static Date STARTISO = new Date();
	static Boolean IPRCFOUND;
	static Integer TEMPDATE = 0;
	static String $ITMDESC = "";
	static String QSPCODE;
	static float QSPPRICE;
	static float PKGQSP;
	static Integer PKGQSPINT = 0;
	static Boolean RFITEMS;
	static Boolean ADDONPKG;
	static Boolean NPVERIFIED;
	static float SVNEGP;
	static float SVNGMP;
	static float TBASE;
	static Boolean CHS;
	static Boolean PASS1;
	static Date DISO = new Date();
	static Boolean PKGINLIST;
	static Boolean CMPINLIST;
	static String SVPROM;
	static Boolean LISTFINAL;
	static String T99999999;
	static String SCRSAVE = "";
	static String CHSSAVE = "";
	static Boolean FIRSTPASS;
	static Boolean USAAPOP;
	static Boolean $CHKRPT;
	static String NEWTOWN = "";
	static String NEWSUBT = "";
	static String SPCODE1 = "";
	static String SPCODE2 = "";
	static String DBCODE = "";
	static String DBCODE1 = "";
	static Integer LEN = 0;
	static Integer LEN1 = 0;
	static Integer STARTPOS = 0;
	static Integer STARTPOS1 = 0;
	static Integer EQUALSON = 0;
	static Integer EQUALSON1 = 0;
	static float ACBNEGP;
	static float ACBB$AD;
	static String ACBCAT;
	static Integer APRMFLG = 0;
	static float ADSCAMT;
	static Integer AQUSEQ;
	static Integer AFDSEQ;
	static float ACB$ADD;
	static float ACB$NEG;
	static Integer AFNDFLG = 0;
	static String AQUPKG;
	static Integer ATMPFLG = 0;
	static String COVVP1 = "";
	static String COVVP2 = "";
	static String $SUCS1 = "0";
	static String $SUCS2 = "0";
	static String $SBITEM = "";
	static Integer $SBADDQ = 0;
	static String $IMDSC1 = "";
	static String PSCODE1 = "";
	static String DBCOD = "";
	static String $NSUCSS = "0";
	static String $SUCSS = "1";
	static final String PSSTYP1 = "B";
	static final String PSSTYP2 = "C";
	static final String PSSTYP3 = "E";
	static Integer USAACHK = 0;
	static String MPKG;
	static String KPKG;
	static Boolean NOAPKG = true;
	static Boolean NOBPKG = true;
	static Boolean VVPKG;
	static Boolean NOBAPKG = true;
	static Boolean USAA_CC;
	static Boolean USAA10P;
	static float USAA_ADSC = 0;
	static float USAA_ITEM = 0;
	static float USAA_ANSC = 0;
	static Boolean FIRSTPASSB = true;
	static Boolean NOUPDATE;
	static String PTERR;
	static Boolean PAKLOCAL;
	static Date TODAY = new Date();
	static String CATSAVE;
	static Boolean MSGSWITCH;
	static String _DISP = "";
	static String[] xCIL = new String[20];
	static List<String> CIL = Arrays.asList(xCIL);
	static String[] xCIX = new String[20];
	static List<String> CIX = Arrays.asList(xCIX);
	static Integer CX = 0;
	static Boolean OVRPRC;
	static String OVFLAG = " ";
	static float OVRAMT = 0;
	static Integer TRRN = 0;
	static float ADDAMT = 0;
	static float EFFAMT = 0;
	static String TCOPKID = "";
	static Integer QNO = 0;
	static String SVST = "";
	static String DA = "";
	static String DAX = "";
	static Boolean PO;
	static Boolean GOLDOPT;
	static String SVPGM = "";
	static Integer FND = 0;
	static String DESCCAP;
	static Boolean CATEXP;
	static Boolean CATSCR;
	static float BASEITEMS = 0;
	static float FBITEMS = 0;
	static float FBITEMS2 = 0;
	static float ANSCPROM = 0;
	static Integer PROMBAL1 = 0;
	static String AAST;
	static float $FDBAL;
	static Boolean INSL;
	static Boolean INFI;
	static Boolean OVRTRIP;
	static String SLSTP = "";
	static float $ADSCA = 0;
	static float $TRIPA = 0;
	static Boolean $WRITE;
	static String $AFLAG = "Y";
	static Timestamp $TTIME = new Timestamp(0);
	static Integer $POS3 = 0;
	static Integer $POS4 = 0;
	static float $PHNDP = 0;
	static Integer $QUSEQ;
	static Boolean $FINAL;
	static String TMPSLS;
	static String TMPSLS1;
	static String TMPSLS2;
	static String TMPQSP1;
	static String TMPQSP;
	static float $ADAM = 0;
	static Boolean $ELECTRIC;
	static Boolean $EXCLUDED;
	static Boolean $OVERRIDE;
	static String $EITEM;
	static String $OITEM;
	static Boolean IN12;
	static Integer $NOITEM = 0;
	static Integer $POS1 = 0;
	static Integer $POS11 = 0;
	static String[] x$OITM = new String[9999];
	static List<String> $OITM = Arrays.asList(x$OITM);
	static final String LO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static final String UP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String SLSTRR;
	static String $$PROM;
	static String AADIS = "Y";
	static String TCBST;
	static Boolean AUTOREDIS;
	static Boolean $CHGFLG;
	static String $QPROM;
	static String $UPDPROM;
	static String AQSRC = "Y";
	static Date $DATEN = new Date();
	static Integer $DATEC = 0;
	static Integer $NUMD = 0;
	static Boolean AQERR;
	static Boolean AMMBMQ;
	static String SDTER9 = "99999999";
	static String QSRTRR;
	static String RTNEXIT = "0";
	static String MMJOBX;
	static String $FIRST = "Y";
	static float $ANSC;
	static String $PMSVAR = "";
	static Boolean $CHGST;
	static Timestamp $CDATTIM = new Timestamp(0);
	static Boolean $PRCNEG;
	static Boolean $PRCNEGU;
	static Boolean $NEWQUOTE;
	static Boolean $SAMEQUOTE;
	static Integer $GRPPOS = 0;
	static Integer $GRPPOS1 = 0;
	static Integer $GRPINS = 0;
	static Boolean $ONCE;
	static Boolean $DSPPROMD;
	static Boolean $DSPPROMW;
	static String $OGRP = "";
	static Boolean $ORDEXCP;
	static Boolean $ADDTN;
	static String $FNAME = "ULCORE";
	static String $FLPRV = " ";
	static Boolean $SLSTPE;
	static Boolean $PROME;
	static String FKEY = "";
	static String WEROR1 = "";
	static String WEROR2 = "";
	static String $_PROM;
	static String $CBPKG;
	static String CHSPCD = "";
	static String CHSPDS = "";
	static Time FKT = new Time(0);
	static Integer SECS = 0;
	static Integer RANDOM = 0;
	static Integer FK = 0;
	static float _ITNEG = 0;
	static float _ADSCLD = 0;
	static float _ADSCL = 0;
	static float _ADSCLI = 0;
	static float _ANSCL = 0;
	static Boolean $POFFER;
	static Boolean $POFFERDIS;
	static String $FNAME1 = "UFLPDS";
	static String $FLPDS = " ";
	static String $QSRC = " ";
	static String $GMED = " ";
	static float $HPDAMT = 0;
	static Date date;
	static DecimalFormat decfmt;
	static Calendar calendar = Calendar.getInstance();
	static String $ENT = "";
	static Integer C1 = 0;
	static float CMDLEN = 0;
	static String $PTNAME = "";
	static float $PMTAMT = 0;
	static String WTERR1 = "";
	static String $PKG2 = "";
	static float SBITAMT = 0;
	static String ADSCDIS = "";
	static String OPER = "";
	static Integer $CNT = 0;
	static String $RARPID = "";
	static String $RPUS06 = "";
	static String MSG1 = "";
	static String MSG2 = "";
	static String MSG3 = "";
	static String ITEM = "";
	static Integer SPOS = 0;
	static Integer TQUSEQ = 0;
	static String PKGCD = "";
	static String VALIDATE = "";
	static String CDATE = "";
	static String $MSGID = "";
	static String $MDESC = "";
	static String $MDATA = "";
	static float $ADSCP = 0;

	public static void main(String[] args) {
		rSh200sfm = new Sh200sfm();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_project");
		sdf = new SimpleDateFormat();
		EntityManager quhdr = emf.createEntityManager();
		rQuhdr = new Quhdr();
		quhdrPK = new QuhdrPK();
		EntityManager quhdre = emf.createEntityManager();
		rQuhdre = new Quhdre();
		quhdrePK = new QuhdrePK();
		EntityManager qudtl = emf.createEntityManager();
		rQudtl = new Qudtl();
		qudtlPK = new QudtlPK();
		EntityManager qudtlla = emf.createEntityManager();
		rQudtlla = new Qudtlla();
		qudtllaPK = new QudtllaPK();
		EntityManager qusrvc = emf.createEntityManager();
		rQusrvc = new Qusrvc();
		qusrvcPK = new QusrvcPK();
		EntityManager entmasla = emf.createEntityManager();
		rEntmasla = new Entmasla();
		entmaslaPK = new EntmaslaPK();
		EntityManager market = emf.createEntityManager();
		rMarket = new Market();
		marketPK = new MarketPK();
		EntityManager auxadrla = emf.createEntityManager();
		rAuxadrla = new Auxadrla();
		auxadrlaPK = new AuxadrlaPK();
		EntityManager pakmst = emf.createEntityManager();
		rPakmst = new Pakmst();
		pakmstPK = new PakmstPK();
		EntityManager pakdtlla = emf.createEntityManager();
		rPakdtlla = new Pakdtlla();
		pakdtllaPK = new PakdtllaPK();
		EntityManager pakprc = emf.createEntityManager();
		rPakprc = new Pakprc();
		pakprcPK = new PakprcPK();
		EntityManager terafl = emf.createEntityManager();
		rTerafl = new Terafl();
		teraflPK = new TeraflPK();
		EntityManager refer = emf.createEntityManager();
		rRefer = new Refer();
		referPK = new ReferPK();
		EntityManager itmast = emf.createEntityManager();
		rItmast = new Itmast();
		itmastPK = new ItmastPK();
		EntityManager itmdef = emf.createEntityManager();
		rItmdef = new Itmdef();
		itmdefPK = new ItmdefPK();
		EntityManager itmprclb = emf.createEntityManager();
		rItmprclb = new Itmprclb();
		itmprclbPK = new ItmprclbPK();
		EntityManager annfee = emf.createEntityManager();
		rAnnfee = new Annfee();
		annfeePK = new AnnfeePK();
		EntityManager warnty = emf.createEntityManager();
		rWarnty = new Warnty();
		warntyPK = new WarntyPK();
		EntityManager qumgmt = emf.createEntityManager();
		rQumgmt = new Qumgmt();
		qumgmtPK = new QumgmtPK();
		EntityManager quprov = emf.createEntityManager();
		rQuprov = new Quprov();
		quprovPK = new QuprovPK();
		EntityManager permitlb = emf.createEntityManager();
		rPermitlb = new Permitlb();
		permitlbPK = new PermitlbPK();
		EntityManager travella = emf.createEntityManager();
		rTravella = new Travella();
		travellaPK = new TravellaPK();
		EntityManager promstlb = emf.createEntityManager();
		rPromstlb = new Promstlb();
		promstlbPK = new PromstlbPK();
		EntityManager promst = emf.createEntityManager();
		rPromst = new Promst();
		promstPK = new PromstPK();
		EntityManager promstlc = emf.createEntityManager();
		rPromstlc = new Promstlc();
		promstlcPK = new PromstlcPK();
		EntityManager proext = emf.createEntityManager();
		rProext = new Proext();
		proextPK = new ProextPK();
		EntityManager pritds = emf.createEntityManager();
		rPritds = new Pritd();
		pritdsPK = new PritdPK();
		EntityManager mktadd = emf.createEntityManager();
		rMktadd = new Mktadd();
		mktaddPK = new MktaddPK();
		EntityManager schdft = emf.createEntityManager();
		rSchdft = new Schdft();
		schdftPK = new SchdftPK();
		EntityManager taskms = emf.createEntityManager();
		rTaskms = new Taskm();
		taskmsPK = new TaskmPK();
		EntityManager pkgsrv = emf.createEntityManager();
		rPkgsrv = new Pkgsrv();
		pkgsrvPK = new PkgsrvPK();
		EntityManager catskd = emf.createEntityManager();
		rCatskd = new Catskd();
		catskdPK = new CatskdPK();
		EntityManager qufdtl = emf.createEntityManager();
		rQufdtl = new Qufdtl();
		qufdtlPK = new QufdtlPK();
		EntityManager valsum = emf.createEntityManager();
		rValsum = new Valsum();
		valsumPK = new ValsumPK();
		EntityManager cmptwn = emf.createEntityManager();
		rCmptwn = new Cmptwn();
		cmptwnPK = new CmptwnPK();
		EntityManager adtitmo = emf.createEntityManager();
		rAdtitmo = new Adtitmo();
		adtitmoPK = new AdtitmoPK();
		EntityManager adtqsp = emf.createEntityManager();
		rAdtqsp = new Adtqsp();
		adtqspPK = new AdtqspPK();
		EntityManager zipsrvla = emf.createEntityManager();
		rZipsrvla = new Zipsrvla();
		zipsrvlaPK = new ZipsrvlaPK();
		EntityManager schdetli = emf.createEntityManager();
		rSchdetli = new Schdetli();
		schdetliPK = new SchdetliPK();
		EntityManager schdetlc = emf.createEntityManager();
		rSchdetlc = new Schdetlc();
		schdetlcPK = new SchdetlcPK();
		EntityManager repmst = emf.createEntityManager();
		rRepmst = new Repmst();
		repmstPK = new RepmstPK();
		EntityManager sr0rsq05 = emf.createEntityManager();
		rSr0rsq05 = new Sr0rsq05();
		sr0rsq05PK = new Sr0rsq05PK();
		EntityManager valdetla = emf.createEntityManager();
		rValdetla = new Valdetla();
		valdetlaPK = new ValdetlaPK();
		EntityManager propkg = emf.createEntityManager();
		rPropkg = new Propkg();
		propkgPK = new PropkgPK();
		EntityManager procamp = emf.createEntityManager();
		rProcamp = new Procamp();
		procampPK = new ProcampPK();
		EntityManager paktwn = emf.createEntityManager();
		rPaktwn = new Paktwn();
		paktwnPK = new PaktwnPK();
		EntityManager pakspcde = emf.createEntityManager();
		rPakspcde = new Pakspcde();
		pakspcdePK = new PakspcdePK();
		EntityManager adt520 = emf.createEntityManager();
		rAdt520 = new Adt520();
		adt520PK = new Adt520PK();
		EntityManager adtqspb = emf.createEntityManager();
		rAdtqspb = new Adtqspb();
		adtqspbPK = new AdtqspbPK();
		EntityManager adt522la = emf.createEntityManager();
		rAdt522la = new Adt522la();
		adt522laPK = new Adt522laPK();
		EntityManager adt521lb = emf.createEntityManager();
		rAdt521lb = new Adt521lb();
		adt521lbPK = new Adt521lbPK();
		EntityManager pmt002la = emf.createEntityManager();
		rPmt002la = new Pmt002la();
		pmt002laPK = new Pmt002laPK();
		EntityManager mp100 = emf.createEntityManager();
		rMp100 = new Mp100();
		mp100PK = new Mp100PK();
		EntityManager mp100la = emf.createEntityManager();
		rMp100la = new Mp100la();
		mp100laPK = new Mp100laPK();
		EntityManager quhdrlb = emf.createEntityManager();
		rQuhdrlb = new Quhdrlb();
		quhdrlbPK = new QuhdrlbPK();
		EntityManager pkgmno = emf.createEntityManager();
		rPkgmno = new Pkgmno();
		pkgmnoPK = new PkgmnoPK();
		EntityManager pakcamp = emf.createEntityManager();
		rPakcamp = new Pakcamp();
		pakcampPK = new PakcampPK();
		EntityManager itmovr = emf.createEntityManager();
		rItmovr = new Itmovr();
		itmovrPK = new ItmovrPK();
		EntityManager qudtllb = emf.createEntityManager();
		rQudtllb = new Qudtllb();
		qudtllbPK = new QudtllbPK();
		EntityManager qufdtlla = emf.createEntityManager();
		rQufdtlla = new Qufdtlla();
		qufdtllaPK = new QufdtllaPK();
		EntityManager itmclr = emf.createEntityManager();
		rItmclr = new Itmclr();
		itmclrPK = new ItmclrPK();
		EntityManager slstyp = emf.createEntityManager();
		rSlstyp = new Slstyp();
		slstypPK = new SlstypPK();
		EntityManager adtpo2 = emf.createEntityManager();
		rAdtpo2 = new Adtpo2();
		adtpo2PK = new Adtpo2PK();
		EntityManager adtpo3 = emf.createEntityManager();
		rAdtpo3 = new Adtpo3();
		adtpo3PK = new Adtpo3PK();
		EntityManager adt520x = emf.createEntityManager();
		rAdt520x = new Adt520x();
		adt520xPK = new Adt520xPK();
		EntityManager proextn = emf.createEntityManager();
		rProextn = new Proextn();
		proextnPK = new ProextnPK();
		EntityManager pkgcombf = emf.createEntityManager();
		rPkgcombf = new Pkgcombf();
		pkgcombfPK = new PkgcombfPK();
		EntityManager prosls = emf.createEntityManager();
		rProsls = new Prosl();
		proslsPK = new ProslPK();
		EntityManager paksls = emf.createEntityManager();
		rPaksls = new Paksl();
		pakslsPK = new PakslPK();
		EntityManager adtpspsh = emf.createEntityManager();
		rAdtpspsh = new Adtpspsh();
		adtpspshPK = new AdtpspshPK();
		EntityManager l1pdtl = emf.createEntityManager();
		rL1pdtl = new L1pdtl();
		l1pdtlPK = new L1pdtlPK();
		EntityManager cpnacflb = emf.createEntityManager();
		rCpnacflb = new Cpnacflb();
		cpnacflbPK = new CpnacflbPK();
		EntityManager qutrip = emf.createEntityManager();
		rQutrip = new Qutrip();
		qutripPK = new QutripPK();
		EntityManager adtpteri = emf.createEntityManager();
		rAdtpteri = new Adtpteri();
		adtpteriPK = new AdtpteriPK();
		EntityManager adtmmquot = emf.createEntityManager();
		rAdtmmquot = new Adtmmquot();
		adtmmquotPK = new AdtmmquotPK();
		EntityManager adtordtyp = emf.createEntityManager();
		rAdtordtyp = new Adtordtyp();
		adtordtypPK = new AdtordtypPK();
		EntityManager itmstef = emf.createEntityManager();
		rItmstef = new Itmstef();
		itmstefPK = new ItmstefPK();
		EntityManager itmstf = emf.createEntityManager();
		rItmstf = new Itmstf();
		itmstfPK = new ItmstfPK();
		EntityManager itm120v = emf.createEntityManager();
		rItm120v = new Itm120v();
		itm120vPK = new Itm120vPK();
		EntityManager repmas = emf.createEntityManager();
		rRepmas = new Repma();
		repmasPK = new RepmaPK();
		EntityManager usrpakgf = emf.createEntityManager();
		rUsrpakgf = new Usrpakgf();
		usrpakgfPK = new UsrpakgfPK();
		EntityManager ofrmntflb = emf.createEntityManager();
		rOfrmntflb = new Ofrmntflb();
		ofrmntflbPK = new OfrmntflbPK();
		EntityManager itmlin = emf.createEntityManager();
		rItmlin = new Itmlin();
		itmlinPK = new ItmlinPK();
		EntityManager proqsrc = emf.createEntityManager();
		rProqsrc = new Proqsrc();
		proqsrcPK = new ProqsrcPK();
		EntityManager quphnd = emf.createEntityManager();
		rQuphnd = new Quphnd();
		quphndPK = new QuphndPK();
		EntityManager prointro = emf.createEntityManager();
		rProintro = new Prointro();
		prointroPK = new ProintroPK();
		EntityManager introffer = emf.createEntityManager();
		rIntroffer = new Introffer();
		introfferPK = new IntrofferPK();
		EntityManager quhneg = emf.createEntityManager();
		rQuhneg = new Quhneg();
		quhnegPK = new QuhnegPK();
		EntityManager qufinl = emf.createEntityManager();
		rQufinl = new Qufinl();
		qufinlPK = new QufinlPK();
		EntityManager pritdse = emf.createEntityManager();
		rPritdse = new Pritdse();
		pritdsePK = new PritdsePK();
		EntityManager itusneg = emf.createEntityManager();
		rItusneg = new Itusneg();
		itusnegPK = new ItusnegPK();
		EntityManager usritmf = emf.createEntityManager();
		rUsritmf = new Usritmf();
		usritmfPK = new UsritmfPK();
		EntityManager lqgitmf = emf.createEntityManager();
		rLqgitmf = new Lqgitmf();
		lqgitmfPK = new LqgitmfPK();
		EntityManager partofl = emf.createEntityManager();
		rPartofl = new Partofl();
		partoflPK = new PartoflPK();
		EntityManager adtqspp = emf.createEntityManager();
		rAdtqspp = new Adtqspp();
		adtqsppPK = new AdtqsppPK();
		EntityManager rsncpqcf = emf.createEntityManager();
		rRsncpqcf = new Rsncpqcf();
		rsncpqcfPK = new RsncpqcfPK();
		EntityManager rsncpqf = emf.createEntityManager();
		rRsncpqf = new Rsncpqf();
		rsncpqfPK = new RsncpqfPK();
		wsdsDS = new WsdsDS();
		binaryDS = new BinaryDS();
		pgmnamDS = new PgmnamDS();
		szerrmDS = new SzerrmDS();
		ldadsDS = new LdadsDS();
		quentdDS = new QuentdDS();
		mphoneDS = new MphoneDS();
		mkactyDS = new MkactyDS();
		chsparmsDS = new ChsparmsDS();
		in2kx8DS = new In2kx8DS();
		//Z-ADD
		rSh200sfm.set_ansc(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		PMX.set(P1, (int) Integer.valueOf(String.valueOf(rPritds.getPrxqty())));
		// EVAL
		$DATEN =new Date(Integer.parseInt(rCpnacflb.getCexpdt()));
		// EVAL
		rQufdtlla.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
		decfmt = new DecimalFormat("       0.  ");
		// EVAL
		$MDATA = $MDATA.substring(0, $POS4-1) + $MDATA.substring($POS4-1, $POS3+$POS4-1) + decfmt.format($TRIPA).trim() + $MDATA.substring($POS3+$POS4-1,  70 - $POS3-1+$POS3+$POS4-1) + $MDATA.substring( 69, $MDATA.length());
		// EVAL
		DBCODE = String.valueOf(rPakspcde.getPakid().substring(0, rPakspcde.getFldlen()+0));
		// EVAL
		rSh200sfm.setCafon( String.valueOf(""));
		// EVAL
		PDO.set(P2,  Float.valueOf(String.valueOf(0)));
		// EVAL
		// EVAL
		QFLINE.set(QNO,  Integer.valueOf(String.valueOf(rQuhdr.getQuseq())));
		// EVAL
		indicatorFunc(String.valueOf(FK), false);
		// EVAL
		rAdtmmquot.setMdate(new Timestamp(new Date().getTime()));
		calendar = Calendar.getInstance();
		calendar.setTime(FKT);
		// EVAL
		SECS = Integer.valueOf(String.valueOf(calendar.get(Calendar.SECOND)));
		// EVAL
		rQuhneg.setQucrtm( String.valueOf(String.valueOf(new Time(new Date().getTime()))));
		// EVAL
		$NUMD = Integer.valueOf(String.valueOf(Integer.parseInt(String.valueOf($DATEN))));
		// EVAL
		rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
		// EVAL
		// CHAIN SETLL
		try {
			adtpteri.getTransaction().begin();
			qAdtpteri = adtpteri.createQuery("select c from Adtpteri c where c.SPTSTSK = '"+ldadsDS.laterr()+"'", Adtpteri.class);
			rAdtpteriList = qAdtpteri.getResultList();
			if (rAdtpteriList.size() >= 1) {
				rAdtpteri = new Adtpteri();
				rAdtpteriFOUND = true;
				rAdtpteriEOF = false;
			} else {
				rAdtpteriFOUND = false;
				rAdtpteriEOF = true;
			}
			rAdtpteriPOS = -1;
			adtpteri.getTransaction().commit();
		} catch (Exception e) {
			adtpteri.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAdtpteriFOUND = false;
		rAdtpteriEOF = true;
		while (rAdtpteriPOS < rAdtpteriList.size() || rAdtpteriFOUND) {
			rAdtpteri = rAdtpteriList.get(++rAdtpteriPOS);
				if (Objects.equals(String.valueOf(rAdtpteri.getSptstsk()), String.valueOf(ldadsDS.laterr()))) {
				rAdtpteriFOUND = true;
				rAdtpteriEOF = false;
			} else {
				rAdtpteriFOUND = false;
				rAdtpteriEOF = true;
			}

		}
		// IF STATEMENT
		if (! rAdtpteriFOUND || ldadsDS.lcamp().compareTo("COMPAN")==0) {
			// EVAL
		// ENDIF
		}
		// CHAIN SETLL
		try {
			qufdtl.getTransaction().begin();
			qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+ldadsDS.lmms()+"'", Qufdtl.class);
			rQufdtlList = qQufdtl.getResultList();
			if (rQufdtlList.size() >= 1) {
				rQufdtl = new Qufdtl();
				rQufdtlFOUND = true;
				rQufdtlEOF = false;
			} else {
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
			}
			rQufdtlPOS = -1;
			qufdtl.getTransaction().commit();
		} catch (Exception e) {
			qufdtl.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQufdtlFOUND = false;
		rQufdtlEOF = true;
		while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
			rQufdtl = rQufdtlList.get(++rQufdtlPOS);
				if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf(ldadsDS.lmms()))) {
				rQufdtlFOUND = true;
				rQufdtlEOF = false;
			} else {
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
			}

		}
		// IF STATEMENT
		if (! rQufdtlFOUND) {
			// EVAL
		// ENDIF
		}
		// CHAIN SETLL
		try {
			mktadd.getTransaction().begin();
			qMktadd = mktadd.createQuery("select c from Mktadd c where c.MKMMS = '"+ldadsDS.lmms()+"'", Mktadd.class);
			rMktaddList = qMktadd.getResultList();
			if (rMktaddList.size() >= 1) {
				rMktadd = new Mktadd();
				rMktaddFOUND = true;
				rMktaddEOF = false;
			} else {
				rMktaddFOUND = false;
				rMktaddEOF = true;
			}
			rMktaddPOS = -1;
			mktadd.getTransaction().commit();
		} catch (Exception e) {
			mktadd.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rMktaddFOUND = false;
		rMktaddEOF = true;
		while (rMktaddPOS < rMktaddList.size() || rMktaddFOUND) {
			rMktadd = rMktaddList.get(++rMktaddPOS);
				if (Objects.equals(String.valueOf(rMktadd.getMkmms()), String.valueOf(ldadsDS.lmms()))) {
				rMktaddFOUND = true;
				rMktaddEOF = false;
			} else {
				rMktaddFOUND = false;
				rMktaddEOF = true;
			}

		}
		// EVAL
		$FNAME = String.valueOf("UFCPQW");
		// EVAL
		$CPQWIN = String.valueOf(" ");
		// IF STATEMENT
		if ($CPQWIN.compareTo("Y") == 0 && rMktadd.getMkstat().compareTo("SLD") != 0 && rMktadd.getMkstat().compareTo("SLS") != 0 && rMktadd.getMkstat().compareTo("CLS") != 0 && rMktadd.getMkstat().compareTo("CLD") != 0) {
			// CHAIN SETLL
			try {
				rsncpqf.getTransaction().begin();
				qRsncpqf = rsncpqf.createQuery("select c from Rsncpqf c where c.RMCAMP = '"+ldadsDS.lcamp()+"'", Rsncpqf.class);
				rRsncpqfList = qRsncpqf.getResultList();
				if (rRsncpqfList.size() >= 1) {
					rRsncpqf = new Rsncpqf();
					rRsncpqfFOUND = true;
					rRsncpqfEOF = false;
				} else {
					rRsncpqfFOUND = false;
					rRsncpqfEOF = true;
				}
				rRsncpqfPOS = -1;
				rsncpqf.getTransaction().commit();
			} catch (Exception e) {
				rsncpqf.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rRsncpqfFOUND = false;
			rRsncpqfEOF = true;
			while (rRsncpqfPOS < rRsncpqfList.size() || rRsncpqfFOUND) {
				rRsncpqf = rRsncpqfList.get(++rRsncpqfPOS);
						if (Objects.equals(String.valueOf(rRsncpqf.getRmcamp()), String.valueOf(ldadsDS.lcamp()))) {
					rRsncpqfFOUND = true;
					rRsncpqfEOF = false;
				} else {
					rRsncpqfFOUND = false;
					rRsncpqfEOF = true;
				}

			}
			// IF STATEMENT
			if (rRsncpqfFOUND) {
				// IF STATEMENT
				if (INKC == Boolean.valueOf("1")) {
				// ENDIF
				}
				// CHAIN SETLL
				try {
					rsncpqcf.getTransaction().begin();
					qRsncpqcf = rsncpqcf.createQuery("select c from Rsncpqcf c where c.CQACCT = '"+ldadsDS.lmms()+"'", Rsncpqcf.class);
					rRsncpqcfList = qRsncpqcf.getResultList();
					if (rRsncpqcfList.size() >= 1) {
						rRsncpqcf = new Rsncpqcf();
						rRsncpqcfFOUND = true;
						rRsncpqcfEOF = false;
					} else {
						rRsncpqcfFOUND = false;
						rRsncpqcfEOF = true;
					}
					rRsncpqcfPOS = -1;
					rsncpqcf.getTransaction().commit();
				} catch (Exception e) {
					rsncpqcf.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rRsncpqcfFOUND = false;
				rRsncpqcfEOF = true;
				while (rRsncpqcfPOS < rRsncpqcfList.size() || rRsncpqcfFOUND) {
					rRsncpqcf = rRsncpqcfList.get(++rRsncpqcfPOS);
								if (Objects.equals(String.valueOf(rRsncpqcf.getCqacct()), String.valueOf(ldadsDS.lmms()))) {
						rRsncpqcfFOUND = true;
						rRsncpqcfEOF = false;
					} else {
						rRsncpqcfFOUND = false;
						rRsncpqcfEOF = true;
					}

				}
				// IF STATEMENT
				if (! rRsncpqcfFOUND) {
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// EVAL
		RTNEXIT = String.valueOf("0");
		// IF STATEMENT
		if (RTNEXIT.compareTo("1")==0) {
		// ENDIF
		}
		//EXSR
		$INTFZ();
		// EVAL
		$FNAME = String.valueOf("UFLPRV");
		// EVAL
		$FLPRV = String.valueOf(" ");
		//EXSR
		CHECKCHS();
		// EVAL
		rSh200sfm.setCafon( String.valueOf(""));
		// EVAL
		rSh200sfm.setCbpone( String.valueOf(""));
		// MOVE
		rSh200sfm.setCaacct(String.valueOf(S0ACCT));
		// CHAIN SETLL
		try {
			market.getTransaction().begin();
			qMarket = market.createQuery("select c from Market c where c.MMMSNO = '"+rSh200sfm.getCaacct()+"'", Market.class);
			rMarketList = qMarket.getResultList();
			if (rMarketList.size() >= 1) {
				rMarket = new Market();
				rMarketFOUND = true;
				rMarketEOF = false;
			} else {
				rMarketFOUND = false;
				rMarketEOF = true;
			}
			rMarketPOS = -1;
			market.getTransaction().commit();
		} catch (Exception e) {
			market.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rMarketFOUND = false;
		rMarketEOF = true;
		while (rMarketPOS < rMarketList.size() || rMarketFOUND) {
			rMarket = rMarketList.get(++rMarketPOS);
				if (Objects.equals(String.valueOf(rMarket.getMmmsno()), String.valueOf(rSh200sfm.getCaacct()))) {
				rMarketFOUND = true;
				rMarketEOF = false;
			} else {
				rMarketFOUND = false;
				rMarketEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			// CHAIN SETLL
			try {
				mktadd.getTransaction().begin();
				qMktadd = mktadd.createQuery("select c from Mktadd c where c.MKMMS = '"+rSh200sfm.getCaacct()+"'", Mktadd.class);
				rMktaddList = qMktadd.getResultList();
				if (rMktaddList.size() >= 1) {
					rMktadd = new Mktadd();
					rMktaddFOUND = true;
					rMktaddEOF = false;
				} else {
					rMktaddFOUND = false;
					rMktaddEOF = true;
				}
				rMktaddPOS = -1;
				mktadd.getTransaction().commit();
			} catch (Exception e) {
				mktadd.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rMktaddFOUND = false;
			rMktaddEOF = true;
			while (rMktaddPOS < rMktaddList.size() || rMktaddFOUND) {
				rMktadd = rMktaddList.get(++rMktaddPOS);
						if (Objects.equals(String.valueOf(rMktadd.getMkmms()), String.valueOf(rSh200sfm.getCaacct()))) {
					rMktaddFOUND = true;
					rMktaddEOF = false;
				} else {
					rMktaddFOUND = false;
					rMktaddEOF = true;
				}

			}
			// MOVE
			rSh200sfm.setCbacct(String.valueOf(rSh200sfm.getCaacct()));
			// IF STATEMENT
			if (mphoneDS.$ph4().compareTo("") != 0) {
			// ENDIF
			}
			// MOVE
			rSh200sfm.setCbpone(String.valueOf(rSh200sfm.getCafon()));
		// ELSE
		} else {
		// ENDIF
		}
		// MOVE
		rSh200sfm.setCaent(String.valueOf(S0ENT));
		// IF STATEMENT
		if (rSh200sfm.getCaent().compareTo("") == 0) {
			// MOVE
			rSh200sfm.setCaent(String.valueOf(rMarket.getMrent()));
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCaent().compareTo("") == 0) {
			// EVAL
		// ELSE
		} else {
			// EVAL
			// CHAIN SETLL
			try {
				entmasla.getTransaction().begin();
				qEntmasla = entmasla.createQuery("select c from Entmasla c where c.EMNUM = '"+rSh200sfm.getCaent()+"'", Entmasla.class);
				rEntmaslaList = qEntmasla.getResultList();
				if (rEntmaslaList.size() >= 1) {
					rEntmasla = new Entmasla();
					rEntmaslaFOUND = true;
					rEntmaslaEOF = false;
				} else {
					rEntmaslaFOUND = false;
					rEntmaslaEOF = true;
				}
				rEntmaslaPOS = -1;
				entmasla.getTransaction().commit();
			} catch (Exception e) {
				entmasla.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rEntmaslaFOUND = false;
			rEntmaslaEOF = true;
			while (rEntmaslaPOS < rEntmaslaList.size() || rEntmaslaFOUND) {
				rEntmasla = rEntmaslaList.get(++rEntmaslaPOS);
						if (Objects.equals(String.valueOf(rEntmasla.getEmnum()), String.valueOf(rSh200sfm.getCaent()))) {
					rEntmaslaFOUND = true;
					rEntmaslaEOF = false;
				} else {
					rEntmaslaFOUND = false;
					rEntmaslaEOF = true;
				}

			}
			// IF STATEMENT
			if (IN79 == false) {
				// MOVE
				rSh200sfm.setCaadd1(String.valueOf(rEntmasla.getEmadd1()));
			// ENDIF
			}
		// ENDIF
		}
		// MOVE
		S0ZIP = String.valueOf(rEntmasla.getEmzip());
		// IF STATEMENT
		if (rMarket.getMaux().compareTo("Y") == 0) {
			// CHAIN SETLL
			try {
				auxadrla.getTransaction().begin();
				qAuxadrla = auxadrla.createQuery("select c from Auxadrla c where c.AAMMS = '"+rSh200sfm.getCaacct()+"'", Auxadrla.class);
				rAuxadrlaList = qAuxadrla.getResultList();
				if (rAuxadrlaList.size() >= 1) {
					rAuxadrla = new Auxadrla();
					rAuxadrlaFOUND = true;
					rAuxadrlaEOF = false;
				} else {
					rAuxadrlaFOUND = false;
					rAuxadrlaEOF = true;
				}
				rAuxadrlaPOS = -1;
				auxadrla.getTransaction().commit();
			} catch (Exception e) {
				auxadrla.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rAuxadrlaFOUND = false;
			rAuxadrlaEOF = true;
			while (rAuxadrlaPOS < rAuxadrlaList.size() || rAuxadrlaFOUND) {
				rAuxadrla = rAuxadrlaList.get(++rAuxadrlaPOS);
						if (Objects.equals(String.valueOf(rAuxadrla.getAamms()), String.valueOf(rSh200sfm.getCaacct()))) {
					rAuxadrlaFOUND = true;
					rAuxadrlaEOF = false;
				} else {
					rAuxadrlaFOUND = false;
					rAuxadrlaEOF = true;
				}

			}
			// IF STATEMENT
			if (IN79 == false) {
				// MOVE
				S0ZIP = String.valueOf(rAuxadrla.getAazip());
			// ENDIF
			}
		// ENDIF
		}
		// MOVE
		rSh200sfm.setCaterr(String.valueOf(S0TERR));
		// CHAIN SETLL
		try {
			terafl.getTransaction().begin();
			qTerafl = terafl.createQuery("select c from Terafl c where c.AFNUM = '"+rSh200sfm.getCaterr()+"'", Terafl.class);
			rTeraflList = qTerafl.getResultList();
			if (rTeraflList.size() >= 1) {
				rTerafl = new Terafl();
				rTeraflFOUND = true;
				rTeraflEOF = false;
			} else {
				rTeraflFOUND = false;
				rTeraflEOF = true;
			}
			rTeraflPOS = -1;
			terafl.getTransaction().commit();
		} catch (Exception e) {
			terafl.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rTeraflFOUND = false;
		rTeraflEOF = true;
		while (rTeraflPOS < rTeraflList.size() || rTeraflFOUND) {
			rTerafl = rTeraflList.get(++rTeraflPOS);
				if (Objects.equals(String.valueOf(rTerafl.getAfnum()), String.valueOf(rSh200sfm.getCaterr()))) {
				rTeraflFOUND = true;
				rTeraflEOF = false;
			} else {
				rTeraflFOUND = false;
				rTeraflEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			// MOVE
			rSh200sfm.setCalnam(String.valueOf(rTerafl.getAflnam()));
			// IF STATEMENT
			if (rTerafl.getAfffl0().compareTo("N") == 0 || rTerafl.getAfffl0().compareTo("") == 0) {
				// EVAL
				// MOVE
				rSh200sfm.setCbccds(String.valueOf("N"));
			// ELSE
			} else {
				// EVAL
				// EVAL
				rSh200sfm.setCbccds( String.valueOf(""));
			// ENDIF
			}
		// ENDIF
		}
		//EXSR
		ALOAD();
		// IF STATEMENT
		if (IN96 == false) {
			//EXSR
			AADQTE();
			// EVAL
			// EVAL
			// EVAL
			TCBST = String.valueOf(" ");
			//EXSR
			$MNTQU();
		// ENDIF
		}
		// EVAL
		// EVAL
		// IF STATEMENT
		if (rSh200sfm.getRmultq().compareTo("Y") !=0 && rSh200sfm.getRmultq().compareTo("N") !=0) {
			// EVAL
			rSh200sfm.setRmultq( String.valueOf("N"));
		// ENDIF
		}
		// MOVE
		rSh200sfm.setTitle(String.valueOf(TTL.get(5)));
		// CHAIN SETLL
		try {
			cmptwn.getTransaction().begin();
			qCmptwn = cmptwn.createQuery(ctkeyKL("Cmptwn"), Cmptwn.class);
			rCmptwnList = qCmptwn.getResultList();
			if (rCmptwnList.size() >= 1) {
				rCmptwn = new Cmptwn();
				rCmptwnFOUND = true;
				rCmptwnEOF = false;
			} else {
				rCmptwnFOUND = false;
				rCmptwnEOF = true;
			}
			rCmptwnPOS = -1;
			cmptwn.getTransaction().commit();
		} catch (Exception e) {
			cmptwn.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rCmptwnFOUND = false;
		rCmptwnEOF = true;
		while (rCmptwnPOS < rCmptwnList.size() || rCmptwnFOUND) {
			rCmptwn = rCmptwnList.get(++rCmptwnPOS);
				if (Objects.equals(String.valueOf(rCmptwn.getCtcamp()), String.valueOf(ldadsDS.lcamp())) && Objects.equals(String.valueOf(rCmptwn.getCttown()), String.valueOf(ldadsDS.laterr()))) {
				rCmptwnFOUND = true;
				rCmptwnEOF = false;
			} else {
				rCmptwnFOUND = false;
				rCmptwnEOF = true;
			}

		}
		// IF STATEMENT
		if (rCmptwnFOUND) {
			// EVAL
		// ELSE
		} else {
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
			// EVAL
		// ELSE
		} else {
			// EVAL
		// ENDIF
		}
		// EVAL
		// EVAL
		// EVAL
		// IF STATEMENT
		if (INKC == true) {
			// MOVE
			$PAS1 = String.valueOf("1");
			// EVAL
			$UPDPROM = String.valueOf(" ");
			//EXSR
			SH290();
		// ENDIF
		}
		//DOW
		while (IN90 == true) {
			//EXSR
			$HELP();
			// EVAL
		//ENDDO
		}
		// IF STATEMENT
		if (INKF == true) {
			// EVAL
			RTNEXIT = String.valueOf("0");
			// IF STATEMENT
			if (RTNEXIT.compareTo("1")==0) {
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (INKG == true) {
		// ENDIF
		}
		// IF STATEMENT
		if (INKH == true) {
		// ENDIF
		}
		// IF STATEMENT
		if (INKI == true) {
		// ENDIF
		}
		// IF STATEMENT
		if (INKJ == true) {
			// MOVEA
			AMS.clear();
			// EVAL
			// EVAL
			// EVAL
			// EVAL
			AFNDFLG = Integer.valueOf(String.valueOf(0));
			//EXSR
			AADQTE();
			// EVAL
			// EVAL
			// EVAL
			TCBST = String.valueOf(" ");
			// EVAL
			TMPSLS2 = String.valueOf("");
			//EXSR
			$MNTQU();
			//EXSR
			ALOAD();
		// ENDIF
		}
		//EXSR
		$INTFZ();
		// IF STATEMENT
		if (INKK == true) {
		// ENDIF
		}
		// IF STATEMENT
		if (IN96 == true) {
			// EVAL
			//EXSR
			ASELCT();
			// EVAL
		// ENDIF
		}
		// MOVE
		ldadsDS.laterr(String.valueOf(S0TERR));
		// EVAL
	//END OF PROCESS
	}
	
//BEGSR
	public static void ALOAD () {
	//Z-ADD
	rSh200sfm.set_ansc(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.set_amnt(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	ADDAMT = Float.valueOf(String.valueOf(0));
	//Z-ADD
	EFFAMT = Float.valueOf(String.valueOf(0));
	//Z-ADD
	QFNEGP.clear();
	//Z-ADD
	QFLINE.clear();
	//Z-ADD
	QNO = (int) Integer.valueOf(String.valueOf(0));
	// EVAL
	// EVAL
	// EVAL
	// CHAIN SETLL
	try {
		cmptwn.getTransaction().begin();
		qCmptwn = cmptwn.createQuery(ctkeyKL("Cmptwn"), Cmptwn.class);
		rCmptwnList = qCmptwn.getResultList();
		if (rCmptwnList.size() >= 1) {
			rCmptwn = new Cmptwn();
			rCmptwnFOUND = true;
			rCmptwnEOF = false;
		} else {
			rCmptwnFOUND = false;
			rCmptwnEOF = true;
		}
		rCmptwnPOS = -1;
		cmptwn.getTransaction().commit();
	} catch (Exception e) {
		cmptwn.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rCmptwnFOUND = false;
	rCmptwnEOF = true;
	while (rCmptwnPOS < rCmptwnList.size() || rCmptwnFOUND) {
		rCmptwn = rCmptwnList.get(++rCmptwnPOS);
		if (Objects.equals(String.valueOf(rCmptwn.getCtcamp()), String.valueOf(ldadsDS.lcamp())) && Objects.equals(String.valueOf(rCmptwn.getCttown()), String.valueOf(ldadsDS.laterr()))) {
			rCmptwnFOUND = true;
			rCmptwnEOF = false;
		} else {
			rCmptwnFOUND = false;
			rCmptwnEOF = true;
		}

	}
	// IF STATEMENT
	if (rCmptwnFOUND) {
		// EVAL
	// ELSE
	} else {
		// EVAL
	// ENDIF
	}
	// EVAL
	//Z-ADD
	rSh200sfm.setRrna((int) Integer.valueOf(String.valueOf(0)));
	// EVAL
	// EVAL
	// EVAL
	rSh200sfm.setSaoptn( String.valueOf(""));
	// SETLL
	try {
		quhdr.getTransaction().begin();
		qQuhdr = quhdr.createQuery(quhkeyKL("Quhdr"), Quhdr.class);
		rQuhdrList = qQuhdr.getResultList();
		if (rQuhdrList.size() >= 1) {
			rQuhdr = new Quhdr();
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}
		rQuhdrPOS = -1;
		quhdr.getTransaction().commit();
	} catch (Exception e) {
		quhdr.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// IF STATEMENT
	if (IN79 == true) {
		// EVAL
		// SETGT
		try {
			quhdr.getTransaction().begin();
			qQuhdr = quhdr.createQuery(quhkeyKL("Quhdr"), Quhdr.class);
			rQuhdrList = qQuhdr.getResultList();
			if (rQuhdrList.size() >= 1) {
				rQuhdr = new Quhdr();
				rQuhdrFOUND = true;
				rQuhdrEOF = false;
			} else {
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
			}
			rQuhdrPOS = rQuhdrList.size();
			quhdr.getTransaction().commit();
		} catch (Exception e) {
			quhdr.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		//DOU
		do {
			// READPE
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
			while (rQuhdrPOS > 0 || rQuhdrFOUND) {
				rQuhdr = rQuhdrList.get(--rQuhdrPOS);
							if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct()))) {
					rQuhdrFOUND = true;
					rQuhdrEOF = false;
				} else {
					rQuhdrFOUND = false;
					rQuhdrEOF = true;
				}

			}
			// IF STATEMENT
			if (IN79 == false) {
				// MOVE
				rSh200sfm.set_ent_(String.valueOf(rQuhdr.getQuent()));
				// MOVE
				rSh200sfm.set_acnt_(String.valueOf(rQuhdr.getQuacct()));
				//Z-ADD
				rSh200sfm.setHaseq((int) Integer.valueOf(String.valueOf(rQuhdr.getQuseq())));
				// MOVE
				rSh200sfm.setSapkg(String.valueOf(rQuhdr.getQupkg()));
				// MOVE
				rSh200sfm.setSacat(String.valueOf(rQuhdr.getQucat()));
				// MOVE
				rSh200sfm.setQdate(Integer.valueOf(String.valueOf($QDATE)));
				// MOVE
				rSh200sfm.setQtime(Integer.valueOf(String.valueOf(rQuhdr.getQulupt())));
				// MOVE
				rSh200sfm.setQowner(String.valueOf(rQuhdr.getQulupu()));
				// IF STATEMENT
				if (rQuhdr.getQungmp() != 0) {
					//Z-ADD
					rSh200sfm.setQansc(Float.valueOf(String.valueOf(rQuhdr.getQungmp())));
				// ELSE
				} else {
					//ADD
					rSh200sfm.setQansc(rQuhdr.getQuwrfe() + rQuhdr.getQufire());
					//ADD
					rSh200sfm.setQansc(rSh200sfm.getQansc() + rQuhdr.getQumntr());
					//SUB
					rSh200sfm.setQansc(rSh200sfm.getQansc() - rQuhdr.getQuanam());
				// ENDIF
				}
				// IF STATEMENT
				if (rQuhdr.getQunegp() != 0) {
					//Z-ADD
					rSh200sfm.setSaamnt(Float.valueOf(String.valueOf(rQuhdr.getQunegp())));
				// ELSE
				} else {
					//ADD
					rSh200sfm.setSaamnt(rQuhdr.getQubase() + rQuhdr.getQuadd());
					//ADD
					rSh200sfm.setSaamnt(rSh200sfm.getSaamnt() + rQuhdr.getQuads$());
					//SUB
					rSh200sfm.setSaamnt(rSh200sfm.getSaamnt() - rQuhdr.getQuadam());
					//SUB
					rSh200sfm.setSaamnt(rSh200sfm.getSaamnt() - rQuhdr.getQuitam());
				// ENDIF
				}
				// EVAL
				$FACCT = String.valueOf(ldadsDS.lmms());
				// EVAL
				$FSEQ = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
				// SETLL
				try {
					qufdtl.getTransaction().begin();
					qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
					rQufdtlList = qQufdtl.getResultList();
					if (rQufdtlList.size() >= 1) {
						rQufdtl = new Qufdtl();
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}
					rQufdtlPOS = -1;
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
				e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// IF STATEMENT
				if (Boolean.valueOf(rSh200sfm.getIn85()) == true) {
					//ADD
					rSh200sfm.set_ansc(rSh200sfm.get_ansc() + rSh200sfm.getQansc());
					//ADD
					rSh200sfm.set_amnt(rSh200sfm.get_amnt() + rSh200sfm.getSaamnt());
					// IF STATEMENT
					if (rQuhdr.getQunegp() != 0) {
						// EVAL
						EFFAMT = Float.valueOf(String.valueOf(EFFAMT+rQuhdr.getQunegp()));
						// EVAL
						QNO = Integer.valueOf(String.valueOf(QNO+1));
						// EVAL
						QFLINE.set(QNO,  Integer.valueOf(String.valueOf(rQuhdr.getQuseq())));
						// EVAL
						QFNEGP.set(QNO,  Float.valueOf(String.valueOf(rQuhdr.getQunegp())));
					// ELSE
					} else {
						// EVAL
						EFFAMT = Float.valueOf(String.valueOf(EFFAMT+rSh200sfm.getSaamnt()));
						// EVAL
						ADDAMT = Float.valueOf(String.valueOf(ADDAMT+rQuhdr.getQuads$()));
					// ENDIF
					}
				// ENDIF
				}
				//ADD
				rSh200sfm.setRrna(rSh200sfm.getRrna() + 1);
				// EVAL
				// MOVE
				in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
				// MOVE
				in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
				// MOVE
				rSh200sfm.setY2k002(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
				// EVAL
				rSh200sfm.setIn85( String.valueOf(rSh200sfm.getIn85()));
			// ENDIF
			}
		//ENDDO
		} while (IN79 == true);
	// ENDIF
	}
	//Z-ADD
	rSh200sfm.set_tqtes((int) Integer.valueOf(String.valueOf(rSh200sfm.getRrna())));
	//Z-ADD
	rSh200sfm.setRrna((int) Integer.valueOf(String.valueOf(1)));
	//ENDSR
	}
	
//BEGSR
	public static void ASELCT () {
	// EVAL
	// EVAL
	//DOU
	do {
		// EVAL
		// EVAL
		// EVAL
		$FDBAL = Float.valueOf(String.valueOf(0));
		// EVAL
		// IF STATEMENT
		if (IN21 == false) {
			// EVAL
			$FDBAL = Float.valueOf(String.valueOf(rSh200sfm.getSaamnt()));
			// EVAL
			CHSSAVE = String.valueOf(CHSSAVE.replaceAll("[a-zA-Z0-9],\\s+", "0"));
			// IF STATEMENT
			if (rSh200sfm.getSaoptn().compareTo("F") == 0) {
				// EVAL
				ldadsDS.lquseq( String.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// IF STATEMENT
				if (ldadsDS.lquseq().trim().length()!=3) {
					// EVAL
					ldadsDS.lquseq( String.valueOf("0000".substring(0, 3-ldadsDS.lquseq().trim().length()+0) + ldadsDS.lquseq().trim()));
				// ENDIF
				}
				// EVAL
				// EVAL
				// EVAL
				MPKG = String.valueOf(rSh200sfm.getSapkg());
				//EXSR
				MULTIPKGAB();
				// IF STATEMENT
				if (IN98) {
					// EVAL
					rSh200sfm.setSaoptn( String.valueOf(""));
					// EVAL
					$FFLAG = Integer.valueOf(String.valueOf(0));
					// EVAL
					rSh200sfm.setIn85( String.valueOf(false));
				// ENDIF
				}
				//EXSR
				MULTIPKG();
				// IF STATEMENT
				if (IN98) {
					// EVAL
					rSh200sfm.setSaoptn( String.valueOf(""));
					// EVAL
					$FFLAG = Integer.valueOf(String.valueOf(0));
					// EVAL
					rSh200sfm.setIn85( String.valueOf(false));
				// ENDIF
				}
				// IF STATEMENT
				if (! IN56) {
					//EXSR
					CHK_MQUOTE_FINAL();
					// IF STATEMENT
					if (AQERR) {
						// EVAL
						rSh200sfm.setSaoptn( String.valueOf(""));
						// EVAL
						$FFLAG = Integer.valueOf(String.valueOf(0));
						// EVAL
						rSh200sfm.setIn85( String.valueOf(false));
					// ENDIF
					}
				// ENDIF
				}
				// ELSEIF STATEMENT
			} else if (rSh200sfm.getSaoptn().compareTo("R") == 0) {
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// EVAL
				MPKG = String.valueOf(rSh200sfm.getSapkg());
				//EXSR
				MULTIPKGREV();
				// IF STATEMENT
				if (IN98) {
					// EVAL
					rSh200sfm.setSaoptn( String.valueOf(""));
					// EVAL
					rSh200sfm.setIn85( String.valueOf(rSh200sfm.getIn85()));
				// ENDIF
				}
			// ENDSL
			}
			// IF STATEMENT
			if (rSh200sfm.getSaoptn().compareTo("R") == 0) {
				// EVAL
				$FFLAG = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
				// EVAL
				$FACCT = String.valueOf(ldadsDS.lmms());
				// EVAL
				$FSEQ = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
				// EVAL
				$ACCT = String.valueOf(ldadsDS.lmms());
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				//EXSR
				$CHKQF();
				// EVAL
				// CHAIN SETLL
				try {
					adtmmquot.getTransaction().begin();
					qAdtmmquot = adtmmquot.createQuery("select c from Adtmmquot c where c.MACCTNO = '"+ldadsDS.lmms()+"' and c.MMQPKG = '"+rSh200sfm.getSapkg()+"' and c.MMQSEQ = '"+rSh200sfm.getHaseq()+"'", Adtmmquot.class);
					rAdtmmquotList = qAdtmmquot.getResultList();
					if (rAdtmmquotList.size() >= 1) {
						rAdtmmquot = new Adtmmquot();
						rAdtmmquotFOUND = true;
						rAdtmmquotEOF = false;
					} else {
						rAdtmmquotFOUND = false;
						rAdtmmquotEOF = true;
					}
					rAdtmmquotPOS = -1;
					adtmmquot.getTransaction().commit();
				} catch (Exception e) {
					adtmmquot.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rAdtmmquotFOUND = false;
				rAdtmmquotEOF = true;
				while (rAdtmmquotPOS < rAdtmmquotList.size() || rAdtmmquotFOUND) {
					rAdtmmquot = rAdtmmquotList.get(++rAdtmmquotPOS);
								if (Objects.equals(String.valueOf(rAdtmmquot.getMacctno()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rAdtmmquot.getMmqpkg()), String.valueOf(rSh200sfm.getSapkg())) && Objects.equals(String.valueOf(rAdtmmquot.getMmqseq()), String.valueOf(rSh200sfm.getHaseq()))) {
						rAdtmmquotFOUND = true;
						rAdtmmquotEOF = false;
					} else {
						rAdtmmquotFOUND = false;
						rAdtmmquotEOF = true;
					}

				}
				// IF STATEMENT
				if (rAdtmmquotFOUND) {
					// DELETE
					try {
						adtmmquot.getTransaction().begin();
						adtmmquot.remove(rAdtmmquot);
						adtmmquot.getTransaction().commit();
					} catch (Exception e) {
						adtmmquot.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// EVAL
					// CHAIN SETLL
					try {
						adtordtyp.getTransaction().begin();
						qAdtordtyp = adtordtyp.createQuery("select c from Adtordtyp c where c.OACCTNO = '"+ldadsDS.lmms()+"'", Adtordtyp.class);
						rAdtordtypList = qAdtordtyp.getResultList();
						if (rAdtordtypList.size() >= 1) {
							rAdtordtyp = new Adtordtyp();
							rAdtordtypFOUND = true;
							rAdtordtypEOF = false;
						} else {
							rAdtordtypFOUND = false;
							rAdtordtypEOF = true;
						}
						rAdtordtypPOS = -1;
						adtordtyp.getTransaction().commit();
					} catch (Exception e) {
						adtordtyp.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rAdtordtypFOUND = false;
					rAdtordtypEOF = true;
					while (rAdtordtypPOS < rAdtordtypList.size() || rAdtordtypFOUND) {
						rAdtordtyp = rAdtordtypList.get(++rAdtordtypPOS);
										if (Objects.equals(String.valueOf(rAdtordtyp.getOacctno()), String.valueOf(ldadsDS.lmms()))) {
							rAdtordtypFOUND = true;
							rAdtordtypEOF = false;
						} else {
							rAdtordtypFOUND = false;
							rAdtordtypEOF = true;
						}

					}
					// IF STATEMENT
					if (rAdtordtypFOUND) {
						// EVAL
						rAdtordtyp.setOmultq( String.valueOf("N"));
						// EVAL
						rAdtordtyp.setOtrans( String.valueOf(""));
						// EVAL
						rAdtordtyp.setOmqpkg( String.valueOf(""));
						// EVAL
						rAdtordtyp.setOmqseq( Integer.valueOf(String.valueOf(0)));
						// UPDATE
						try {
							adtordtyp.getTransaction().begin();
							adtordtyp.getTransaction().commit();
						} catch (Exception e) {
							adtordtyp.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
					// ENDIF
					}
				// ENDIF
				}
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("F16") == 0 || ldadsDS.lcamp().compareTo("CAN  ") == 0) {
					// EVAL
					$FACCT = String.valueOf(ldadsDS.lmms());
					// EVAL
					$FSEQ = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
					// CHAIN SETLL
					try {
						qufdtl.getTransaction().begin();
						qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
						rQufdtlList = qQufdtl.getResultList();
						if (rQufdtlList.size() >= 1) {
							rQufdtl = new Qufdtl();
							rQufdtlFOUND = true;
							rQufdtlEOF = false;
						} else {
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
						}
						rQufdtlPOS = -1;
						qufdtl.getTransaction().commit();
					} catch (Exception e) {
						qufdtl.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
					while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
						rQufdtl = rQufdtlList.get(++rQufdtlPOS);
										if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQufdtl.getFdseq()), String.valueOf($FSEQ))) {
							rQufdtlFOUND = true;
							rQufdtlEOF = false;
						} else {
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
						}

					}
					// EVAL
					$ACCT = String.valueOf(rSh200sfm.getCaacct());
					// IF STATEMENT
					if ($COUNTER == 2) {
						// SETLL
						try {
							qufdtl.getTransaction().begin();
							qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+$ACCT+"'", Qufdtl.class);
							rQufdtlList = qQufdtl.getResultList();
							if (rQufdtlList.size() >= 1) {
								rQufdtl = new Qufdtl();
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}
							rQufdtlPOS = -1;
							qufdtl.getTransaction().commit();
						} catch (Exception e) {
							qufdtl.getTransaction().rollback();
						e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// READE
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
						while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
							rQufdtl = rQufdtlList.get(++rQufdtlPOS);
									if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}

						}
						//DOW
						while (! rQufdtlEOF) {
							// CHAIN SETLL
							try {
								quhdr.getTransaction().begin();
								qQuhdr = quhdr.createQuery(quhkyKL("Quhdr"), Quhdr.class);
								rQuhdrList = qQuhdr.getResultList();
								if (rQuhdrList.size() >= 1) {
									rQuhdr = new Quhdr();
									rQuhdrFOUND = true;
									rQuhdrEOF = false;
								} else {
									rQuhdrFOUND = false;
									rQuhdrEOF = true;
								}
								rQuhdrPOS = -1;
								quhdr.getTransaction().commit();
							} catch (Exception e) {
								quhdr.getTransaction().rollback();
								e.printStackTrace();
							}
							finally{
								emf.close();
							}
							// CHAIN READE
							rQuhdrFOUND = false;
							rQuhdrEOF = true;
							while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
								rQuhdr = rQuhdrList.get(++rQuhdrPOS);
														if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf($ACCT)) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtl.getFdseq()))) {
									rQuhdrFOUND = true;
									rQuhdrEOF = false;
								} else {
									rQuhdrFOUND = false;
									rQuhdrEOF = true;
								}

							}
							// IF STATEMENT
							if (rQuhdrFOUND) {
								// EVAL
								$PAK = String.valueOf(rQuhdr.getQupkg());
								// IF STATEMENT
								if ($PAK.compareTo(rSh200sfm.getSapkg()) != 0) {
									//LEAVE
									break;
								// ENDIF
								}
							// ENDIF
							}
							// READE
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
							while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
								rQufdtl = rQufdtlList.get(++rQufdtlPOS);
										if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
									rQufdtlFOUND = true;
									rQufdtlEOF = false;
								} else {
									rQufdtlFOUND = false;
									rQufdtlEOF = true;
								}

							}
						//ENDDO
						}
						//Z-ADD
						C1 = (int) Integer.valueOf(String.valueOf(1));
					// ENDIF
					}
				// ENDIF
				}
				// CHAIN SETLL
				try {
					qufdtl.getTransaction().begin();
					qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
					rQufdtlList = qQufdtl.getResultList();
					if (rQufdtlList.size() >= 1) {
						rQufdtl = new Qufdtl();
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}
					rQufdtlPOS = -1;
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
				while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
					rQufdtl = rQufdtlList.get(++rQufdtlPOS);
								if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQufdtl.getFdseq()), String.valueOf($FSEQ))) {
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}

				}
				// IF STATEMENT
				if (rQufdtlFOUND) {
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("BUSI") == 0 && rMktadd.getMk1sld().compareTo("") != 0 || ldadsDS.lcamp().compareTo("F16") == 0 && rMktadd.getMk1sld().compareTo("") != 0) {
					// ENDIF
					}
					// DELETE
					try {
						qufdtl.getTransaction().begin();
						qufdtl.remove(rQufdtl);
						qufdtl.getTransaction().commit();
					} catch (Exception e) {
						qufdtl.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN SETLL
					try {
						qutrip.getTransaction().begin();
						qQutrip = qutrip.createQuery($fdkyKL("Qutrip"), Qutrip.class);
						rQutripList = qQutrip.getResultList();
						if (rQutripList.size() >= 1) {
							rQutrip = new Qutrip();
							rQutripFOUND = true;
							rQutripEOF = false;
						} else {
							rQutripFOUND = false;
							rQutripEOF = true;
						}
						rQutripPOS = -1;
						qutrip.getTransaction().commit();
					} catch (Exception e) {
						qutrip.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rQutripFOUND = false;
					rQutripEOF = true;
					while (rQutripPOS < rQutripList.size() || rQutripFOUND) {
						rQutrip = rQutripList.get(++rQutripPOS);
										if (Objects.equals(String.valueOf(rQutrip.getTuacct()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQutrip.getTuseq()), String.valueOf($FSEQ))) {
							rQutripFOUND = true;
							rQutripEOF = false;
						} else {
							rQutripFOUND = false;
							rQutripEOF = true;
						}

					}
					// IF STATEMENT
					if (rQutripFOUND) {
						// EVAL
						rQutrip.setTuuser( String.valueOf(ldadsDS.luser()));
						// EVAL
						rQutrip.setTsflag( String.valueOf("R"));
						// UPDATE
						try {
							qutrip.getTransaction().begin();
							qutrip.getTransaction().commit();
						} catch (Exception e) {
							qutrip.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
					// ELSE
					} else {
						// EVAL
						rQutrip.setTuacct( String.valueOf(ldadsDS.lmms()));
						// EVAL
						rQutrip.setTuseq( Integer.valueOf(String.valueOf(rQufdtl.getFdseq())));
						// EVAL
						rQutrip.setTamt( Float.valueOf(String.valueOf(0)));
						// EVAL
						rQutrip.setTuuser( String.valueOf(ldadsDS.luser()));
						// EVAL
						rQutrip.setTtime($TTIME);
						// EVAL
						rQutrip.setTsflag( String.valueOf("R"));
						// EVAL
						rQutrip.setTfflag( String.valueOf("N"));
						// WRITE
						try {
							qutrip.getTransaction().begin();
							qutrip.persist(rQutrip);
							qutrip.getTransaction().commit();
						} catch (Exception e) {
							qutrip.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
					// ENDIF
					}
					// CHAIN SETLL
					try {
						quphnd.getTransaction().begin();
						qQuphnd = quphnd.createQuery($fdkyKL("Quphnd"), Quphnd.class);
						rQuphndList = qQuphnd.getResultList();
						if (rQuphndList.size() >= 1) {
							rQuphnd = new Quphnd();
							rQuphndFOUND = true;
							rQuphndEOF = false;
						} else {
							rQuphndFOUND = false;
							rQuphndEOF = true;
						}
						rQuphndPOS = -1;
						quphnd.getTransaction().commit();
					} catch (Exception e) {
						quphnd.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rQuphndFOUND = false;
					rQuphndEOF = true;
					while (rQuphndPOS < rQuphndList.size() || rQuphndFOUND) {
						rQuphnd = rQuphndList.get(++rQuphndPOS);
										if (Objects.equals(String.valueOf(rQuphnd.getPuacct()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQuphnd.getPuseq()), String.valueOf($FSEQ))) {
							rQuphndFOUND = true;
							rQuphndEOF = false;
						} else {
							rQuphndFOUND = false;
							rQuphndEOF = true;
						}

					}
					// IF STATEMENT
					if (rQuphndFOUND) {
						// EVAL
						rQuphnd.setPuuser( String.valueOf(ldadsDS.luser()));
						// EVAL
						rQuphnd.setPsflag( String.valueOf("R"));
						// UPDATE
						try {
							quphnd.getTransaction().begin();
							quphnd.getTransaction().commit();
						} catch (Exception e) {
							quphnd.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
					// ELSE
					} else {
						// EVAL
						rQuphnd.setPuacct( String.valueOf(ldadsDS.lmms()));
						// EVAL
						rQuphnd.setPuseq( Integer.valueOf(String.valueOf(rQufdtl.getFdseq())));
						// EVAL
						rQuphnd.setPamt( Float.valueOf(String.valueOf(0)));
						// EVAL
						rQuphnd.setPuuser( String.valueOf(ldadsDS.luser()));
						// EVAL
						rQuphnd.setPctime($TTIME);
						// EVAL
						rQuphnd.setPsflag( String.valueOf("R"));
						// EVAL
						rQuphnd.setPfflag( String.valueOf("N"));
						// EVAL
						rQuphnd.setPaflag( String.valueOf("Y"));
						// WRITE
						try {
							quphnd.getTransaction().begin();
							quphnd.persist(rQuphnd);
							quphnd.getTransaction().commit();
						} catch (Exception e) {
							quphnd.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
					// ENDIF
					}
				// ENDIF
				}
				//EXSR
				ALOAD();
				// EVAL
				CHSSAVE = String.valueOf(CHSSAVE.replaceAll("[a-zA-Z0-9],\\s+", "0"));
				// EVAL
				$FFLAG = Integer.valueOf(String.valueOf(0));
				//LEAVE
				break;
				// ELSEIF STATEMENT
			} else if (rSh200sfm.getSaoptn().compareTo("F") == 0) {
				// EVAL
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// IF STATEMENT
				if (CHS && (ldadsDS.lcamp().compareTo("F16") == 0 || ldadsDS.lcamp().compareTo("CAN") == 0)) {
					//EXSR
					CHSCONFIRM();
					// IF STATEMENT
					if (INKC) {
						// EVAL
						// EVAL
						rSh200sfm.setSaoptn( String.valueOf("X"));
						// EVAL
					// ENDIF
					}
				// ENDIF
				}
				// EVAL
				$FFLAG = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
				// EVAL
				$FACCT = String.valueOf(ldadsDS.lmms());
				// EVAL
				$FSEQ = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("BUSI") == 0 || ldadsDS.lcamp().compareTo("F16") == 0 || ldadsDS.lcamp().compareTo("MARSH") == 0 || ldadsDS.lcamp().compareTo("CAN   ") == 0 || ldadsDS.lcamp().compareTo("CANBUS") == 0 || ldadsDS.lcamp().compareTo("CANRSL") == 0 || ldadsDS.lcamp().compareTo("DICON") == 0) {
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("F16") == 0 || ldadsDS.lcamp().compareTo("CAN  ") == 0) {
						// EVAL
						$FACCT = String.valueOf(ldadsDS.lmms());
						// EVAL
						$FSEQ = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
						// CHAIN SETLL
						try {
							qufdtl.getTransaction().begin();
							qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
							rQufdtlList = qQufdtl.getResultList();
							if (rQufdtlList.size() >= 1) {
								rQufdtl = new Qufdtl();
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}
							rQufdtlPOS = -1;
							qufdtl.getTransaction().commit();
						} catch (Exception e) {
							qufdtl.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
						while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
							rQufdtl = rQufdtlList.get(++rQufdtlPOS);
												if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQufdtl.getFdseq()), String.valueOf($FSEQ))) {
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}

						}
						// IF STATEMENT
						if (! rQufdtlFOUND) {
							// EVAL
							$ACCT = String.valueOf(rSh200sfm.getCaacct());
							//EXSR
							$CHKQF();
							// ELSEIF STATEMENT
						} else if ($COUNTER > 1) {
							//ADD
							RRNZ = RRNZ + 1;
							// MOVE
							rSh200sfm.setSzerrm(String.valueOf(ERR.get(26)));
							// EVAL
							// EVAL
							rSh200sfm.setSaoptn( String.valueOf(""));
							// EVAL
							$FFLAG = Integer.valueOf(String.valueOf(0));
							// EVAL
							rSh200sfm.setIn85( String.valueOf(false));
							// ELSEIF STATEMENT
						} else if ($COUNTER == 1) {
							// CHAIN SETLL
							try {
								qufdtl.getTransaction().begin();
								qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+$ACCT+"'", Qufdtl.class);
								rQufdtlList = qQufdtl.getResultList();
								if (rQufdtlList.size() >= 1) {
									rQufdtl = new Qufdtl();
									rQufdtlFOUND = true;
									rQufdtlEOF = false;
								} else {
									rQufdtlFOUND = false;
									rQufdtlEOF = true;
								}
								rQufdtlPOS = -1;
								qufdtl.getTransaction().commit();
							} catch (Exception e) {
								qufdtl.getTransaction().rollback();
								e.printStackTrace();
							}
							finally{
								emf.close();
							}
							// CHAIN READE
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
							while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
								rQufdtl = rQufdtlList.get(++rQufdtlPOS);
														if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
									rQufdtlFOUND = true;
									rQufdtlEOF = false;
								} else {
									rQufdtlFOUND = false;
									rQufdtlEOF = true;
								}

							}
							// IF STATEMENT
							if (rQufdtlFOUND) {
								// CHAIN SETLL
								try {
									quhdr.getTransaction().begin();
									qQuhdr = quhdr.createQuery(quhkyKL("Quhdr"), Quhdr.class);
									rQuhdrList = qQuhdr.getResultList();
									if (rQuhdrList.size() >= 1) {
										rQuhdr = new Quhdr();
										rQuhdrFOUND = true;
										rQuhdrEOF = false;
									} else {
										rQuhdrFOUND = false;
										rQuhdrEOF = true;
									}
									rQuhdrPOS = -1;
									quhdr.getTransaction().commit();
								} catch (Exception e) {
									quhdr.getTransaction().rollback();
									e.printStackTrace();
								}
								finally{
									emf.close();
								}
								// CHAIN READE
								rQuhdrFOUND = false;
								rQuhdrEOF = true;
								while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
									rQuhdr = rQuhdrList.get(++rQuhdrPOS);
																if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf($ACCT)) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtl.getFdseq()))) {
										rQuhdrFOUND = true;
										rQuhdrEOF = false;
									} else {
										rQuhdrFOUND = false;
										rQuhdrEOF = true;
									}

								}
								// IF STATEMENT
								if (rQuhdrFOUND) {
									// EVAL
									$PAK = String.valueOf(rQuhdr.getQupkg());
									// ELSEIF STATEMENT
								} else if (ldadsDS.lcamp().compareTo("F16") == 0) {
									// IF STATEMENT
									if ($PAK.substring(0, 5) != "SW VV" && rSh200sfm.getSapkg().substring(0, 5) != "SW VV" || $PAK.substring(0, 5) == "SW VV" && rSh200sfm.getSapkg().substring(0, 5) == "SW VV") {
										// IF STATEMENT
										if ($PAK.substring(0, 5) != "SW VI" && rSh200sfm.getSapkg().substring(0, 5) != "SW VI" || $PAK.substring(0, 5) == "SW VI" && rSh200sfm.getSapkg().substring(0, 5) == "SW VI") {
											//ADD
											RRNZ = RRNZ + 1;
											// MOVE
											rSh200sfm.setSzerrm(String.valueOf(ERR.get(27)));
											// EVAL
											// EVAL
											rSh200sfm.setSaoptn( String.valueOf(""));
											// EVAL
											$FFLAG = Integer.valueOf(String.valueOf(0));
											// EVAL
											rSh200sfm.setIn85( String.valueOf(false));
										// ENDIF
										}
									// ENDIF
									}
									// ELSEIF STATEMENT
								} else if (ldadsDS.lcamp().compareTo("CAN   ") == 0) {
								// ENDSL
								}
							// ENDIF
							}
						// ENDIF
						}
						// IF STATEMENT
						if ($COUNTER == 0) {
							//Z-ADD
							C1 = (int) Integer.valueOf(String.valueOf(1));
						// ENDSL
						}
					// ENDIF
					}
				// ENDIF
				}
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// EVAL
				INSL = Boolean.valueOf("1");
				// EVAL
				PKGCD = String.valueOf(rSh200sfm.getSapkg());
				// CHAIN SETLL
				try {
					qufdtl.getTransaction().begin();
					qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
					rQufdtlList = qQufdtl.getResultList();
					if (rQufdtlList.size() >= 1) {
						rQufdtl = new Qufdtl();
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}
					rQufdtlPOS = -1;
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
				while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
					rQufdtl = rQufdtlList.get(++rQufdtlPOS);
								if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQufdtl.getFdseq()), String.valueOf($FSEQ))) {
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}

				}
				// IF STATEMENT
				if (! rQufdtlFOUND) {
					// EVAL
					rQufdtl.setFdmms( String.valueOf(ldadsDS.lmms()));
					// EVAL
					rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
					//EXSR
					ATRIPC();
					// IF STATEMENT
					if (IN96) {
						//LEAVESR
						return;
					// ENDIF
					}
					// WRITE
					try {
						qufdtl.getTransaction().begin();
						qufdtl.persist(rQufdtl);
						qufdtl.getTransaction().commit();
					} catch (Exception e) {
						qufdtl.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// EVAL
				// ELSE
				} else {
					//EXSR
					ATRIPC();
					// IF STATEMENT
					if (IN96) {
						//LEAVESR
						return;
					// ENDIF
					}
				// ENDIF
				}
			// ELSE
			} else {
				// SETLL
				try {
					qufdtl.getTransaction().begin();
					qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+rQuhdr.getQuacct()+"'", Qufdtl.class);
					rQufdtlList = qQufdtl.getResultList();
					if (rQufdtlList.size() >= 1) {
						rQufdtl = new Qufdtl();
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}
					rQufdtlPOS = -1;
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
				e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// IF STATEMENT
				if (! rQufdtlFOUND) {
					// EVAL
					rQufdtl.setFdmms( String.valueOf(ldadsDS.lmms()));
					// EVAL
					rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
					//EXSR
					ATRIPC();
					// IF STATEMENT
					if (IN96) {
						//LEAVESR
						return;
					// ENDIF
					}
					// WRITE
					try {
						qufdtl.getTransaction().begin();
						qufdtl.persist(rQufdtl);
						qufdtl.getTransaction().commit();
					} catch (Exception e) {
						qufdtl.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// EVAL
				// ELSE
				} else {
					//EXSR
					ATRIPC();
					// IF STATEMENT
					if (IN96) {
						//LEAVESR
						return;
					// ENDIF
					}
					// CHAIN SETLL
					try {
						qufdtl.getTransaction().begin();
						qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
						rQufdtlList = qQufdtl.getResultList();
						if (rQufdtlList.size() >= 1) {
							rQufdtl = new Qufdtl();
							rQufdtlFOUND = true;
							rQufdtlEOF = false;
						} else {
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
						}
						rQufdtlPOS = -1;
						qufdtl.getTransaction().commit();
					} catch (Exception e) {
						qufdtl.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
					while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
						rQufdtl = rQufdtlList.get(++rQufdtlPOS);
										if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQufdtl.getFdseq()), String.valueOf($FSEQ))) {
							rQufdtlFOUND = true;
							rQufdtlEOF = false;
						} else {
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
						}

					}
					// IF STATEMENT
					if (! rQufdtlFOUND) {
						// SETLL
						try {
							qufdtl.getTransaction().begin();
							qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+rQuhdr.getQuacct()+"'", Qufdtl.class);
							rQufdtlList = qQufdtl.getResultList();
							if (rQufdtlList.size() >= 1) {
								rQufdtl = new Qufdtl();
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}
							rQufdtlPOS = -1;
							qufdtl.getTransaction().commit();
						} catch (Exception e) {
							qufdtl.getTransaction().rollback();
						e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// READE
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
						while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
							rQufdtl = rQufdtlList.get(++rQufdtlPOS);
									if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf(rQuhdr.getQuacct()))) {
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}

						}
						//DOW
						while (! rQufdtlEOF) {
							// DELETE
							try {
								qufdtl.getTransaction().begin();
								qufdtl.remove(rQufdtl);
								qufdtl.getTransaction().commit();
							} catch (Exception e) {
								qufdtl.getTransaction().rollback();
								e.printStackTrace();
							}
							finally{
								emf.close();
							}
							// READE
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
							while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
								rQufdtl = rQufdtlList.get(++rQufdtlPOS);
										if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf(rQuhdr.getQuacct()))) {
									rQufdtlFOUND = true;
									rQufdtlEOF = false;
								} else {
									rQufdtlFOUND = false;
									rQufdtlEOF = true;
								}

							}
						//ENDDO
						}
						// EVAL
						rQufdtl.setFdmms( String.valueOf(ldadsDS.lmms()));
						// EVAL
						rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
						// WRITE
						try {
							qufdtl.getTransaction().begin();
							qufdtl.persist(rQufdtl);
							qufdtl.getTransaction().commit();
						} catch (Exception e) {
							qufdtl.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// EVAL
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.getSaoptn().compareTo("I") == 0) {
				// EVAL
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				//EXSR
				AINQ();
				//EXSR
				$MNTQU();
				// EVAL
				// EVAL
				//EXSR
				ALOAD();
				// EVAL
				// ELSEIF STATEMENT
			} else if (rSh200sfm.getSaoptn().compareTo("C") == 0) {
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				//EXSR
				ACOPY();
				//EXSR
				ALOAD();
				//LEAVE
				break;
				// ELSEIF STATEMENT
			} else if (rSh200sfm.getSaoptn().compareTo("P") == 0) {
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// MOVE
				ldadsDS.lentn(String.valueOf(rSh200sfm.getCaent()));
				// MOVE
				ldadsDS.lmms(String.valueOf(rSh200sfm.getCaacct()));
				// MOVE
				ldadsDS.lquseq(String.valueOf(rSh200sfm.getHaseq()));
				// ELSEIF STATEMENT
			} else if (ldadsDS.lcamp().compareTo("F16") == 0 || ldadsDS.lcamp().compareTo("RESALE") == 0 || ldadsDS.lcamp().compareTo("MARSH") == 0 || ldadsDS.lcamp().compareTo("DICON") == 0 || ldadsDS.lcamp().compareTo("BUSI") == 0 || ldadsDS.lcamp().compareTo("CAN") == 0 || ldadsDS.lcamp().compareTo("CANBUS") == 0) {
				// MOVE
				$CMD80 = String.valueOf(QCMD.get(1));
				// MOVE
				$CMD80 = String.valueOf(QCMD.get(3));
				// MOVE
				$CMD80 = String.valueOf(QCMD.get(5));
				// ELSEIF STATEMENT
			} else if (ldadsDS.lcamp().compareTo("COMRSL") == 0) {
				// MOVE
				$CMD80 = String.valueOf(QCMD.get(2));
				// MOVE
				$CMD80 = String.valueOf(QCMD.get(4));
				// MOVE
				$CMD80 = String.valueOf(QCMD.get(6));
			// ENDSL
			}
			// MOVE
			$CMD80 = String.valueOf(QCMD.get(7));
			//EXSR
			ALOAD();
			// IF STATEMENT
			if (rSh200sfm.getSaoptn().compareTo("X") == 0) {
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// EVAL
				$FIRST = String.valueOf("Y");
				// CHAIN SETLL
				try {
					quhdr.getTransaction().begin();
					qQuhdr = quhdr.createQuery(quhky3KL("Quhdr"), Quhdr.class);
					rQuhdrList = qQuhdr.getResultList();
					if (rQuhdrList.size() >= 1) {
						rQuhdr = new Quhdr();
						rQuhdrFOUND = true;
						rQuhdrEOF = false;
					} else {
						rQuhdrFOUND = false;
						rQuhdrEOF = true;
					}
					rQuhdrPOS = -1;
					quhdr.getTransaction().commit();
				} catch (Exception e) {
					quhdr.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
				while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
					rQuhdr = rQuhdrList.get(++rQuhdrPOS);
								if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rSh200sfm.getHaseq()))) {
						rQuhdrFOUND = true;
						rQuhdrEOF = false;
					} else {
						rQuhdrFOUND = false;
						rQuhdrEOF = true;
					}

				}
				// IF STATEMENT
				if (rQuhdrFOUND && rQuhdr.getQulupu().compareTo("PRDUSER") == 0) {
					// EVAL
					// EVAL
					RRNZ = Integer.valueOf(String.valueOf(RRNZ + 1));
					// EVAL
					rSh200sfm.setSzerrm( String.valueOf(ERR.get(35)));
					// EVAL
					rSh200sfm.setSaoptn( String.valueOf(""));
				// ENDIF
				}
				//EXSR
				UPDATEWARN();
				// IF STATEMENT
				if (NOUPDATE) {
				// ENDIF
				}
				// SETLL
				try {
					qufdtl.getTransaction().begin();
					qQufdtl = qufdtl.createQuery(prckey2KL("Qufdtl"), Qufdtl.class);
					rQufdtlList = qQufdtl.getResultList();
					if (rQufdtlList.size() >= 1) {
						rQufdtl = new Qufdtl();
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}
					rQufdtlPOS = -1;
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
				e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// IF STATEMENT
				if (Boolean.valueOf(rSh200sfm.getIn85()) == true) {
					// EVAL
					AFNDFLG = Integer.valueOf(String.valueOf(1));
				// ELSE
				} else {
					// EVAL
					AFNDFLG = Integer.valueOf(String.valueOf(0));
				// ENDIF
				}
				// EVAL
				// EVAL
				//EXSR
				ACHGQU();
				// EVAL
				// EVAL
				// EVAL
				TCBST = String.valueOf(rSh200sfm.getCbst());
				// EVAL
				TMPSLS2 = String.valueOf(rSh200sfm.getCbst());
				//EXSR
				$MNTQU();
				//EXSR
				ALOAD();
				//LEAVE
				break;
				// ELSEIF STATEMENT
			} else if (rSh200sfm.getSaoptn().compareTo("E") == 0) {
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// SETLL
				try {
					qufdtl.getTransaction().begin();
					qQufdtl = qufdtl.createQuery(prckey2KL("Qufdtl"), Qufdtl.class);
					rQufdtlList = qQufdtl.getResultList();
					if (rQufdtlList.size() >= 1) {
						rQufdtl = new Qufdtl();
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}
					rQufdtlPOS = -1;
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
				e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// IF STATEMENT
				if (Boolean.valueOf(rSh200sfm.getIn85()) == true) {
				// ELSE
				} else {
					// EVAL
					RRNZ = Integer.valueOf(String.valueOf(RRNZ + 1));
					// EVAL
					rSh200sfm.setSzerrm( String.valueOf(ERR.get(34)));
					// EVAL
					// EVAL
					rSh200sfm.setIn85( String.valueOf(false));
				// ENDIF
				}
			// ENDSL
			}
			// IF STATEMENT
			if (rSh200sfm.getSaoptn().compareTo(" ") != 0 && rSh200sfm.getSaoptn().compareTo("I") != 0) {
				// EVAL
				rQufdtl.setFdseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
				// EVAL
				$FACCT = String.valueOf(ldadsDS.lmms());
				// EVAL
				$FSEQ = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
				// EVAL
				rSh200sfm.setSaoptn( String.valueOf(""));
				// MOVE
				in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
				// MOVE
				in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
				// MOVE
				rSh200sfm.setY2k002(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN21 == true);
	// IF STATEMENT
	if ($FFLAG != 0) {
		// EVAL
		ldadsDS.lquseq( String.valueOf(String.valueOf(rSh200sfm.getHaseq())));
		// IF STATEMENT
		if (ldadsDS.lquseq().trim().length()!=3) {
			// EVAL
			ldadsDS.lquseq( String.valueOf("0000".substring(0, 3-ldadsDS.lquseq().trim().length()+0) + ldadsDS.lquseq().trim()));
		// ENDIF
		}
		// CHAIN SETLL
		try {
			quhdr.getTransaction().begin();
			qQuhdr = quhdr.createQuery(quhky3KL("Quhdr"), Quhdr.class);
			rQuhdrList = qQuhdr.getResultList();
			if (rQuhdrList.size() >= 1) {
				rQuhdr = new Quhdr();
				rQuhdrFOUND = true;
				rQuhdrEOF = false;
			} else {
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
			}
			rQuhdrPOS = -1;
			quhdr.getTransaction().commit();
		} catch (Exception e) {
			quhdr.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdrFOUND = false;
		rQuhdrEOF = true;
		while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
			rQuhdr = rQuhdrList.get(++rQuhdrPOS);
				if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rSh200sfm.getHaseq()))) {
				rQuhdrFOUND = true;
				rQuhdrEOF = false;
			} else {
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
			}

		}
		// EVAL
		$FFLAG = Integer.valueOf(String.valueOf(0));
		// MOVE
		$PAS1 = String.valueOf("0");
		// EVAL
		$UPDPROM = String.valueOf(rQuhdr.getQuprom());
		//EXSR
		SH290();
		//EXSR
		ALOAD();
		// MOVE
		$PAS1 = String.valueOf("1");
		// EVAL
		$UPDPROM = String.valueOf(" ");
		//EXSR
		SH290();
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void ACOPY () {
	// EVAL
	// EVAL
	// MOVE
	rSh200sfm.setCaent(String.valueOf(rSh200sfm.get_ent_()));
	// MOVE
	rSh200sfm.setCaacct(String.valueOf(rSh200sfm.get_acnt_()));
	// CHAIN SETLL
	try {
		quhdr.getTransaction().begin();
		qQuhdr = quhdr.createQuery(quhky3KL("Quhdr"), Quhdr.class);
		rQuhdrList = qQuhdr.getResultList();
		if (rQuhdrList.size() >= 1) {
			rQuhdr = new Quhdr();
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}
		rQuhdrPOS = -1;
		quhdr.getTransaction().commit();
	} catch (Exception e) {
		quhdr.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQuhdrFOUND = false;
	rQuhdrEOF = true;
	while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
		rQuhdr = rQuhdrList.get(++rQuhdrPOS);
		if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rSh200sfm.getHaseq()))) {
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == false) {
		// MOVE
		rPakmst.setPkstyp(String.valueOf(rQuhdr.getQustyp()));
		//Z-ADD
		rSh200sfm.setQdate((int) Integer.valueOf(String.valueOf(0)));
		// EVAL
		rSh200sfm.setQtime( Integer.valueOf(String.valueOf(0)));
		// EVAL
		rSh200sfm.setQowner( String.valueOf(""));
		// MOVE
		$$ADAT = Integer.valueOf(String.valueOf(rQuhdr.getQuentd()));
		// MOVE
		$$ADTA = String.valueOf($$ADAT);
		// MOVE
		rSh200sfm.setCblnam(String.valueOf(rSh200sfm.getCalnam()));
		//Z-ADD
		rSh200sfm.setCbbase(Float.valueOf(String.valueOf(rQuhdr.getQubase())));
		//Z-ADD
		rSh200sfm.setCbadd(Float.valueOf(String.valueOf(rQuhdr.getQuadd())));
		//Z-ADD
		rSh200sfm.setCbadd2(Float.valueOf(String.valueOf(rQuhdr.getQuadd())));
		//Z-ADD
		rSh200sfm.setCbadd$(Float.valueOf(String.valueOf(rQuhdr.getQuads$())));
		//Z-SUB
		rSh200sfm.setCbadam(0 - rQuhdr.getQuadam());
		//SUB
		rSh200sfm.setCbadam(rSh200sfm.getCbadam() - rQuhdr.getQuitam());
		//ADD
		rSh200sfm.setCbb$ad(rQuhdr.getQubase() + rQuhdr.getQuadd());
		//ADD
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() + rQuhdr.getQuads$());
		//SUB
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() - rQuhdr.getQuadam());
		//SUB
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() - rQuhdr.getQuitam());
		//Z-ADD
		rSh200sfm.setCbnegp(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbngmp(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbngpp(Float.valueOf(String.valueOf(0)));
		// MOVE
		rSh200sfm.setCbpkg(String.valueOf(rQuhdr.getQupkg()));
		// MOVE
		rSh200sfm.setCbmon(String.valueOf(rQuhdr.getQumon()));
		// MOVE
		rSh200sfm.setHbprom(String.valueOf(rQuhdr.getQuprom()));
		//Z-ADD
		rPakprc.setPpdccf(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rPakprc.setPpamfe(Float.valueOf(String.valueOf(rQuhdr.getQumntr())));
		//Z-ADD
		rSh200sfm.setCbmntr(Float.valueOf(String.valueOf(rQuhdr.getQumntr())));
		//DIV
		rSh200sfm.setCbmmnt(rQuhdr.getQumntr() / 12);
		// MOVE
		rSh200sfm.setCbcat(String.valueOf(rQuhdr.getQucat()));
		//Z-ADD
		rSh200sfm.setCbfire(Float.valueOf(String.valueOf(rQuhdr.getQufire())));
		//DIV
		rSh200sfm.setCbmfir(rQuhdr.getQufire() / 12);
		// MOVE
		rSh200sfm.setCbwarc(String.valueOf(rQuhdr.getQuwarc()));
		// IF STATEMENT
		if (rSh200sfm.getCbwarc().compareTo("") == 0) {
			// MOVE
			rSh200sfm.setCbwarc(String.valueOf("N"));
		// ENDIF
		}
		//Z-ADD
		rSh200sfm.setCbwrfe(Float.valueOf(String.valueOf(rQuhdr.getQuwrfe())));
		//DIV
		rSh200sfm.setCbmwrf(rQuhdr.getQuwrfe() / 12);
		// MOVE
		rSh200sfm.setCbccds(String.valueOf(rQuhdr.getQuccds()));
		//DIV
		rSh200sfm.setCbmnmp(rQuhdr.getQungmp() / 12);
		//Z-ADD
		rSh200sfm.setCbanam(Float.valueOf(String.valueOf(rQuhdr.getQuanam())));
		//DIV
		rSh200sfm.setCbanmm(rSh200sfm.getCbanam() / 12);
		//Z-ADD
		rSh200sfm.setCbperm(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		SVPERM = Float.valueOf(String.valueOf(rSh200sfm.getCbperm()));
		//ADD
		rSh200sfm.setCbmfwt(rQuhdr.getQumntr() + rQuhdr.getQufire());
		//ADD
		rSh200sfm.setCbmfwt(rSh200sfm.getCbmfwt() + rQuhdr.getQuwrfe());
		//Z-ADD
		SVMFWT = Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt()));
		//ADD
		rSh200sfm.setCbmmfw(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir());
		//ADD
		rSh200sfm.setCbmmfw(rSh200sfm.getCbmmfw() + rSh200sfm.getCbmwrf());
		// CHAIN SETLL
		try {
			quhdre.getTransaction().begin();
			qQuhdre = quhdre.createQuery(quhex2KL("Quhdre"), Quhdre.class);
			rQuhdreList = qQuhdre.getResultList();
			if (rQuhdreList.size() >= 1) {
				rQuhdre = new Quhdre();
				rQuhdreFOUND = true;
				rQuhdreEOF = false;
			} else {
				rQuhdreFOUND = false;
				rQuhdreEOF = true;
			}
			rQuhdrePOS = -1;
			quhdre.getTransaction().commit();
		} catch (Exception e) {
			quhdre.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdreFOUND = false;
		rQuhdreEOF = true;
		while (rQuhdrePOS < rQuhdreList.size() || rQuhdreFOUND) {
			rQuhdre = rQuhdreList.get(++rQuhdrePOS);
				if (Objects.equals(String.valueOf(rQuhdre.getQuemms()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQuhdre.getQueseq()), String.valueOf(rQuhdr.getQuseq()))) {
				rQuhdreFOUND = true;
				rQuhdreEOF = false;
			} else {
				rQuhdreFOUND = false;
				rQuhdreEOF = true;
			}

		}
		// EVAL
		rSh200sfm.setCbst( String.valueOf(rQuhdre.getQuslty()));
		// MOVE
		TMPQSP = String.valueOf(rQuhdre.getQuslty());
		// EVAL
		HBITQTY = Integer.valueOf(String.valueOf(rQuhdre.getQuitqty()));
		// EVAL
		HBITAMT = Float.valueOf(String.valueOf(rQuhdre.getQuitamt()));
		// EVAL
		HBITPC = Float.valueOf(String.valueOf(rQuhdre.getQuitpc()));
		// SETLL
		try {
			qusrvc.getTransaction().begin();
			qQusrvc = qusrvc.createQuery(quhky3KL("Qusrvc"), Qusrvc.class);
			rQusrvcList = qQusrvc.getResultList();
			if (rQusrvcList.size() >= 1) {
				rQusrvc = new Qusrvc();
				rQusrvcFOUND = true;
				rQusrvcEOF = false;
			} else {
				rQusrvcFOUND = false;
				rQusrvcEOF = true;
			}
			rQusrvcPOS = -1;
			qusrvc.getTransaction().commit();
		} catch (Exception e) {
			qusrvc.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		//DOU
		do {
			// READE
			rQusrvcFOUND = false;
			rQusrvcEOF = true;
			while (rQusrvcPOS < rQusrvcList.size() || rQusrvcFOUND) {
				rQusrvc = rQusrvcList.get(++rQusrvcPOS);
							if (Objects.equals(String.valueOf(rQusrvc.getQsent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQusrvc.getQsacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQusrvc.getQsseq()), String.valueOf(rSh200sfm.getHaseq()))) {
					rQusrvcFOUND = true;
					rQusrvcEOF = false;
				} else {
					rQusrvcFOUND = false;
					rQusrvcEOF = true;
				}

			}
			// IF STATEMENT
			if (IN79 == false) {
				//Z-ADD
				A2 = (int) Integer.valueOf(String.valueOf(1));
				// IF STATEMENT
				if (IN77 == true) {
					//Z-ADD
					ANQ.set(A2, (int) Integer.valueOf(String.valueOf(rQusrvc.getQsqty())));
					// MOVE
					AMS.set(A2, rQusrvc.getQsmanu());
				// ENDIF
				}
			// ENDIF
			}
		//ENDDO
		} while (IN79 == true);
		// EVAL
		TCBST = String.valueOf(" ");
		// EVAL
		// EVAL
		//EXSR
		$MNTQU();
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void APRMIT () {
	// EVAL
	$HLD = Integer.valueOf(String.valueOf(0));
	// IF STATEMENT
	if (IN51 == false) {
		// MOVE
		S5ZIP = String.valueOf(S0ZIP);
		// MOVE
		S9ZIP = String.valueOf(S5ZIP);
	// ELSE
	} else {
		// MOVE
		S6ZIP = String.valueOf(S0ZIP);
		// MOVE
		S9ZIP = String.valueOf(S6ZIP);
	// ENDIF
	}
	// SETLL
	try {
		permitlb.getTransaction().begin();
		qPermitlb = permitlb.createQuery(perkeyKL("Permitlb"), Permitlb.class);
		rPermitlbList = qPermitlb.getResultList();
		if (rPermitlbList.size() >= 1) {
			rPermitlb = new Permitlb();
			rPermitlbFOUND = true;
			rPermitlbEOF = false;
		} else {
			rPermitlbFOUND = false;
			rPermitlbEOF = true;
		}
		rPermitlbPOS = -1;
		permitlb.getTransaction().commit();
	} catch (Exception e) {
		permitlb.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// IF STATEMENT
	if (IN02 == false) {
		// READPE
		rPermitlbFOUND = false;
		rPermitlbEOF = true;
		while (rPermitlbPOS > 0 || rPermitlbFOUND) {
			rPermitlb = rPermitlbList.get(--rPermitlbPOS);
				if (Objects.equals(String.valueOf(rPermitlb.getPtterr()), String.valueOf(rSh200sfm.getCaterr()))) {
				rPermitlbFOUND = true;
				rPermitlbEOF = false;
			} else {
				rPermitlbFOUND = false;
				rPermitlbEOF = true;
			}

		}
	// ENDIF
	}
	// EVAL
	$PMTAMT = 0;
	// EVAL
	rSh200sfm.setCbperm( Float.valueOf(String.valueOf($PMTAMT)));
	// IF STATEMENT
	if (S9ZIP.compareTo(rPermitlb.getPtfrzp()) >= 0 && S9ZIP.compareTo(rPermitlb.getPttozp()) <= 0) {
		// IF STATEMENT
		if (rPermitlb.getPtname().compareTo("ADT") == 0) {
			//ADD
			rSh200sfm.setCbperm(rSh200sfm.getCbperm() + rPermitlb.getPtamt());
		// ENDIF
		}
	// ELSE
	} else {
		// MOVE
		IN79 = true ;
	// ENDIF
	}
	//DOU
	do {
		// READE
		rPermitlbFOUND = false;
		rPermitlbEOF = true;
		while (rPermitlbPOS < rPermitlbList.size() || rPermitlbFOUND) {
			rPermitlb = rPermitlbList.get(++rPermitlbPOS);
					if (Objects.equals(String.valueOf(rPermitlb.getPtterr()), String.valueOf(rSh200sfm.getCaterr()))) {
				rPermitlbFOUND = true;
				rPermitlbEOF = false;
			} else {
				rPermitlbFOUND = false;
				rPermitlbEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			// IF STATEMENT
			if (rPermitlb.getPtfrzp().compareTo(S9ZIP) <= 0) {
				// MOVE
				CKZIP = String.valueOf(rPermitlb.getPtfrzp());
				// IF STATEMENT
				if (CKZIP.compareTo("") == 0) {
					// IF STATEMENT
					if (IN51 == false) {
						// IF STATEMENT
						if (rPermitlb.getPtfrzp().compareTo(S5ZIP) <= 0 && rPermitlb.getPttozp().compareTo(S5ZIP) >= 0) {
							// IF STATEMENT
							if (rPermitlb.getPtname().compareTo("ADT") == 0) {
								//ADD
								rSh200sfm.setCbperm(rSh200sfm.getCbperm() + rPermitlb.getPtamt());
							// ENDIF
							}
						// ENDIF
						}
					// ELSE
					} else {
						// IF STATEMENT
						if (rPermitlb.getPtfrzp().compareTo(S6ZIP) <= 0 && rPermitlb.getPttozp().compareTo(S6ZIP) >= 0) {
							// IF STATEMENT
							if (rPermitlb.getPtname().compareTo("ADT") == 0) {
								//ADD
								rSh200sfm.setCbperm(rSh200sfm.getCbperm() + rPermitlb.getPtamt());
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
				// ELSE
				} else {
					// IF STATEMENT
					if (rPermitlb.getPtfrzp().compareTo(S0ZIP) <= 0 && rPermitlb.getPttozp().compareTo(S0ZIP) >= 0) {
						// IF STATEMENT
						if (rPermitlb.getPtname().compareTo("ADT") == 0) {
							//ADD
							rSh200sfm.setCbperm(rSh200sfm.getCbperm() + rPermitlb.getPtamt());
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			// ELSE
			} else {
				// EVAL
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	// CHAIN SETLL
	try {
		cmptwn.getTransaction().begin();
		qCmptwn = cmptwn.createQuery(ctkey2KL("Cmptwn"), Cmptwn.class);
		rCmptwnList = qCmptwn.getResultList();
		if (rCmptwnList.size() >= 1) {
			rCmptwn = new Cmptwn();
			rCmptwnFOUND = true;
			rCmptwnEOF = false;
		} else {
			rCmptwnFOUND = false;
			rCmptwnEOF = true;
		}
		rCmptwnPOS = -1;
		cmptwn.getTransaction().commit();
	} catch (Exception e) {
		cmptwn.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rCmptwnFOUND = false;
	rCmptwnEOF = true;
	while (rCmptwnPOS < rCmptwnList.size() || rCmptwnFOUND) {
		rCmptwn = rCmptwnList.get(++rCmptwnPOS);
		if (Objects.equals(String.valueOf(rCmptwn.getCtcamp()), String.valueOf(ldadsDS.lcamp())) && Objects.equals(String.valueOf(rCmptwn.getCttown()), String.valueOf(T99999999))) {
			rCmptwnFOUND = true;
			rCmptwnEOF = false;
		} else {
			rCmptwnFOUND = false;
			rCmptwnEOF = true;
		}

	}
	// IF STATEMENT
	if (rCmptwnFOUND && rCmptwn.getCtflg2().compareTo("Y") == 0) {
	// ENDIF
	}
	// IF STATEMENT
	if ($CHGST) {
	// ENDIF
	}
	// SETLL
	try {
		travella.getTransaction().begin();
		qTravella = travella.createQuery(perkeyKL("Travella"), Travella.class);
		rTravellaList = qTravella.getResultList();
		if (rTravellaList.size() >= 1) {
			rTravella = new Travella();
			rTravellaFOUND = true;
			rTravellaEOF = false;
		} else {
			rTravellaFOUND = false;
			rTravellaEOF = true;
		}
		rTravellaPOS = -1;
		travella.getTransaction().commit();
	} catch (Exception e) {
		travella.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// IF STATEMENT
	if (IN02 == false) {
		// READPE
		rTravellaFOUND = false;
		rTravellaEOF = true;
		while (rTravellaPOS > 0 || rTravellaFOUND) {
			rTravella = rTravellaList.get(--rTravellaPOS);
				if (Objects.equals(String.valueOf(rTravella.getTrterr()), String.valueOf(rSh200sfm.getCaterr()))) {
				rTravellaFOUND = true;
				rTravellaEOF = false;
			} else {
				rTravellaFOUND = false;
				rTravellaEOF = true;
			}

		}
	// ENDIF
	}
	// IF STATEMENT
	if (S9ZIP.compareTo(rTravella.getTrfrzp()) >= 0 && S9ZIP.compareTo(rTravella.getTrtozp()) <= 0) {
		//ADD
		rSh200sfm.setCbadd$(rSh200sfm.getCbadd$() + rTravella.getTramt());
	// ELSE
	} else {
		// MOVE
		IN79 = true ;
	// ENDIF
	}
	//DOU
	do {
		// READE
		rTravellaFOUND = false;
		rTravellaEOF = true;
		while (rTravellaPOS < rTravellaList.size() || rTravellaFOUND) {
			rTravella = rTravellaList.get(++rTravellaPOS);
					if (Objects.equals(String.valueOf(rTravella.getTrterr()), String.valueOf(rSh200sfm.getCaterr()))) {
				rTravellaFOUND = true;
				rTravellaEOF = false;
			} else {
				rTravellaFOUND = false;
				rTravellaEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			// IF STATEMENT
			if (rTravella.getTrfrzp().compareTo(S9ZIP) <= 0) {
				// MOVE
				CKZIP = String.valueOf(rTravella.getTrfrzp());
				// IF STATEMENT
				if (CKZIP.compareTo("") == 0) {
					// IF STATEMENT
					if (IN51 == false) {
						// IF STATEMENT
						if (rTravella.getTrfrzp().compareTo(S5ZIP) <= 0 && rTravella.getTrtozp().compareTo(S5ZIP) >= 0) {
							//ADD
							rSh200sfm.setCbadd$(rSh200sfm.getCbadd$() + rTravella.getTramt());
						// ENDIF
						}
					// ELSE
					} else {
						// IF STATEMENT
						if (rTravella.getTrfrzp().compareTo(S6ZIP) <= 0 && rTravella.getTrtozp().compareTo(S6ZIP) >= 0) {
							//ADD
							rSh200sfm.setCbadd$(rSh200sfm.getCbadd$() + rTravella.getTramt());
						// ENDIF
						}
					// ENDIF
					}
				// ELSE
				} else {
					// IF STATEMENT
					if (rTravella.getTrfrzp().compareTo(S0ZIP) <= 0 && rTravella.getTrtozp().compareTo(S0ZIP) >= 0) {
						//ADD
						rSh200sfm.setCbadd$(rSh200sfm.getCbadd$() + rTravella.getTramt());
					// ENDIF
					}
				// ENDIF
				}
			// ELSE
			} else {
				// MOVE
				IN79 = true ;
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	//ENDSR
	}
	
//BEGSR
	public static void AVALSB () {
	// IF STATEMENT
	if (rSh200sfm.getRmultq().compareTo("Y") !=0 && rSh200sfm.getRmultq().compareTo("N") !=0) {
		// EVAL
		rSh200sfm.setRmultq( String.valueOf("N"));
	// ENDIF
	}
	// IF STATEMENT
	if (IN79 == true) {
		// MOVE
		ldadsDS.lcat(String.valueOf("PCG"));
		// MOVE
		ldadsDS.lcode(String.valueOf(SVCAT));
		// MOVE
		rSh200sfm.setCbcat(String.valueOf(ldadsDS.lcode()));
	// ENDIF
	}
	// MOVE
	WKCAT = String.valueOf("PCG");
	// MOVE
	WKCODE = String.valueOf(rSh200sfm.getCbcat());
	// SETLL
	try {
		refer.getTransaction().begin();
		qRefer = refer.createQuery(refkeyKL("Refer"), Refer.class);
		rReferList = qRefer.getResultList();
		if (rReferList.size() >= 1) {
			rRefer = new Refer();
			rReferFOUND = true;
			rReferEOF = false;
		} else {
			rReferFOUND = false;
			rReferEOF = true;
		}
		rReferPOS = -1;
		refer.getTransaction().commit();
	} catch (Exception e) {
		refer.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// IF STATEMENT
	if (IN79 == false  || rSh200sfm.getCbcat().compareTo("") == 0) {
		//ADD
		RRNZ = RRNZ + 1;
		// MOVE
		rSh200sfm.setSzerrm(String.valueOf(ERR.get(4)));
		// EVAL
		// EVAL
	// ELSE
	} else {
		// MOVE
		SVCAT2 = String.valueOf(rSh200sfm.getCbcat());
	// ENDIF
	}
	// IF STATEMENT
	if (IN78 == true) {
		// MOVE
		ldadsDS.lterr(String.valueOf(rSh200sfm.getCaterr()));
		// MOVE
		ldadsDS.lpakag(String.valueOf(SVPKG));
		// MOVE
		HSUSP = String.valueOf(ldadsDS.lsusp());
		// EVAL
		ldadsDS.lsusp( String.valueOf(""));
		// EVAL
		SVPGM = String.valueOf(ldadsDS.lprog());
		// EVAL
		ldadsDS.lprog( String.valueOf("SH200S"));
		// EVAL
		ldadsDS.lprog( String.valueOf(SVPGM));
		// MOVE
		ldadsDS.lsusp(String.valueOf(HSUSP));
		// MOVE
		rSh200sfm.setCbpkg(String.valueOf(ldadsDS.lpakag()));
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getCbst().compareTo("?") == 0 && ! INKL) {
		// IF STATEMENT
		if (rSh200sfm.getCbst().compareTo("?") == 0 || rSh200sfm.getCbst().compareTo("") == 0) {
			// EVAL
			rSh200sfm.setCbst( String.valueOf(SVST));
		// ENDIF
		}
		// EVAL
		SVST = String.valueOf(rSh200sfm.getCbst());
		// EVAL
		TMPSLS = String.valueOf(rSh200sfm.getCbst());
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getCbpkg().compareTo("") == 0) {
		//ADD
		RRNZ = RRNZ + 1;
		// MOVE
		rSh200sfm.setSzerrm(String.valueOf(ERR.get(1)));
		// EVAL
		// EVAL
	// ELSE
	} else {
		//EXSR
		VALIDSR();
		// MOVE
		ZTERR = String.valueOf(rSh200sfm.getCaterr());
		// SETLL
		try {
			pakmst.getTransaction().begin();
			qPakmst = pakmst.createQuery(pakkeyKL("Pakmst"), Pakmst.class);
			rPakmstList = qPakmst.getResultList();
			if (rPakmstList.size() >= 1) {
				rPakmst = new Pakmst();
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}
			rPakmstPOS = -1;
			pakmst.getTransaction().commit();
		} catch (Exception e) {
			pakmst.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// IF STATEMENT
		if (IN79 == false) {
			// MOVE
			ZTERR = String.valueOf(ZTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
			// SETLL
			try {
				pakmst.getTransaction().begin();
				qPakmst = pakmst.createQuery(pakkeyKL("Pakmst"), Pakmst.class);
				rPakmstList = qPakmst.getResultList();
				if (rPakmstList.size() >= 1) {
					rPakmst = new Pakmst();
					rPakmstFOUND = true;
					rPakmstEOF = false;
				} else {
					rPakmstFOUND = false;
					rPakmstEOF = true;
				}
				rPakmstPOS = -1;
				pakmst.getTransaction().commit();
			} catch (Exception e) {
				pakmst.getTransaction().rollback();
			e.printStackTrace();
			}
			finally{
				emf.close();
			}
		// ENDIF
		}
		// CHAIN SETLL
		try {
			pakmst.getTransaction().begin();
			qPakmst = pakmst.createQuery(pakkeyKL("Pakmst"), Pakmst.class);
			rPakmstList = qPakmst.getResultList();
			if (rPakmstList.size() >= 1) {
				rPakmst = new Pakmst();
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}
			rPakmstPOS = -1;
			pakmst.getTransaction().commit();
		} catch (Exception e) {
			pakmst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPakmstFOUND = false;
		rPakmstEOF = true;
		while (rPakmstPOS < rPakmstList.size() || rPakmstFOUND) {
			rPakmst = rPakmstList.get(++rPakmstPOS);
				if (Objects.equals(String.valueOf(rPakmst.getPkterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rPakmst.getPkpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}

		}
		// IF STATEMENT
		if (IN89 == false) {
			// MOVE
			WTERR1 = String.valueOf(ZTERR);
			// IF STATEMENT
			if (rPakmst.getPkstat().compareTo("T") == 0) {
				// CHAIN SETLL
				try {
					paktwn.getTransaction().begin();
					qPaktwn = paktwn.createQuery(pkgtwnKL("Paktwn"), Paktwn.class);
					rPaktwnList = qPaktwn.getResultList();
					if (rPaktwnList.size() >= 1) {
						rPaktwn = new Paktwn();
						rPaktwnFOUND = true;
						rPaktwnEOF = false;
					} else {
						rPaktwnFOUND = false;
						rPaktwnEOF = true;
					}
					rPaktwnPOS = -1;
					paktwn.getTransaction().commit();
				} catch (Exception e) {
					paktwn.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rPaktwnFOUND = false;
				rPaktwnEOF = true;
				while (rPaktwnPOS < rPaktwnList.size() || rPaktwnFOUND) {
					rPaktwn = rPaktwnList.get(++rPaktwnPOS);
								if (Objects.equals(String.valueOf(rPaktwn.getPtpakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPaktwn.getPtterr()), String.valueOf(rSh200sfm.getCaterr()))) {
						rPaktwnFOUND = true;
						rPaktwnEOF = false;
					} else {
						rPaktwnFOUND = false;
						rPaktwnEOF = true;
					}

				}
				// IF STATEMENT
				if (rPaktwnFOUND) {
					// EVAL
					rPakmst.setPkstat( String.valueOf("Y"));
				// ELSE
				} else {
					// EVAL
					rPakmst.setPkstat( String.valueOf("N"));
				// ENDIF
				}
			// ENDIF
			}
			// IF STATEMENT
			if (rPakmst.getPkstat().compareTo("N") == 0   || rPakmst.getPkcamp().compareTo(ldadsDS.lcamp()) != 0) {
				// CHAIN SETLL
				try {
					pakcamp.getTransaction().begin();
					qPakcamp = pakcamp.createQuery(pkgcmpKL("Pakcamp"), Pakcamp.class);
					rPakcampList = qPakcamp.getResultList();
					if (rPakcampList.size() >= 1) {
						rPakcamp = new Pakcamp();
						rPakcampFOUND = true;
						rPakcampEOF = false;
					} else {
						rPakcampFOUND = false;
						rPakcampEOF = true;
					}
					rPakcampPOS = -1;
					pakcamp.getTransaction().commit();
				} catch (Exception e) {
					pakcamp.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rPakcampFOUND = false;
				rPakcampEOF = true;
				while (rPakcampPOS < rPakcampList.size() || rPakcampFOUND) {
					rPakcamp = rPakcampList.get(++rPakcampPOS);
								if (Objects.equals(String.valueOf(rPakcamp.getPcpakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakcamp.getPccamp()), String.valueOf(ldadsDS.lcamp()))) {
						rPakcampFOUND = true;
						rPakcampEOF = false;
					} else {
						rPakcampFOUND = false;
						rPakcampEOF = true;
					}

				}
				// IF STATEMENT
				if (! rPakcampFOUND) {
					//ADD
					RRNZ = RRNZ + 1;
					// MOVE
					rSh200sfm.setSzerrm(String.valueOf(ERR.get(2)));
					// EVAL
					// EVAL
				// ELSE
				} else {
					//EXSR
					CILOAD();
				// ENDIF
				}
			// ENDIF
			}
			// IF STATEMENT
			if (ldadsDS.lscod().substring(0, 4) != "USAA" && ldadsDS.lqsrc().substring(0, 4) != "USAA") {
				// EVAL
				$POS = Integer.valueOf(String.valueOf(rSh200sfm.getCbpkg().indexOf("USAA" )));
				// IF STATEMENT
				if ($POS > 0) {
					//ADD
					RRNZ = RRNZ + 1;
					// MOVE
					rSh200sfm.setSzerrm(String.valueOf(ERR.get(24)));
					// EVAL
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// CHAIN SETLL
		try {
			repmas.getTransaction().begin();
			qRepmas = repmas.createQuery("select c from Repmas c where c.RPUSER = '"+ldadsDS.luser()+"'", Repma.class);
			rRepmasList = qRepmas.getResultList();
			if (rRepmasList.size() >= 1) {
				rRepmas = new Repma();
				rRepmasFOUND = true;
				rRepmasEOF = false;
			} else {
				rRepmasFOUND = false;
				rRepmasEOF = true;
			}
			rRepmasPOS = -1;
			repmas.getTransaction().commit();
		} catch (Exception e) {
			repmas.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rRepmasFOUND = false;
		rRepmasEOF = true;
		while (rRepmasPOS < rRepmasList.size() || rRepmasFOUND) {
			rRepmas = rRepmasList.get(++rRepmasPOS);
				if (Objects.equals(String.valueOf(rRepmas.getRpuser()), String.valueOf(ldadsDS.luser()))) {
				rRepmasFOUND = true;
				rRepmasEOF = false;
			} else {
				rRepmasFOUND = false;
				rRepmasEOF = true;
			}

		}
		// IF STATEMENT
		if (rRepmasFOUND) {
			// CHAIN SETLL
			try {
				usrpakgf.getTransaction().begin();
				qUsrpakgf = usrpakgf.createQuery(uspakgk2KL("Usrpakgf"), Usrpakgf.class);
				rUsrpakgfList = qUsrpakgf.getResultList();
				if (rUsrpakgfList.size() >= 1) {
					rUsrpakgf = new Usrpakgf();
					rUsrpakgfFOUND = true;
					rUsrpakgfEOF = false;
				} else {
					rUsrpakgfFOUND = false;
					rUsrpakgfEOF = true;
				}
				rUsrpakgfPOS = -1;
				usrpakgf.getTransaction().commit();
			} catch (Exception e) {
				usrpakgf.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rUsrpakgfFOUND = false;
			rUsrpakgfEOF = true;
			while (rUsrpakgfPOS < rUsrpakgfList.size() || rUsrpakgfFOUND) {
				rUsrpakgf = rUsrpakgfList.get(++rUsrpakgfPOS);
						if (Objects.equals(String.valueOf(rUsrpakgf.getPrterr()), String.valueOf(WTERR1)) && Objects.equals(String.valueOf(rUsrpakgf.getPrpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
					rUsrpakgfFOUND = true;
					rUsrpakgfEOF = false;
				} else {
					rUsrpakgfFOUND = false;
					rUsrpakgfEOF = true;
				}

			}
			// IF STATEMENT
			if (rUsrpakgfFOUND) {
				// CHAIN SETLL
				try {
					usrpakgf.getTransaction().begin();
					qUsrpakgf = usrpakgf.createQuery(uspakgk1KL("Usrpakgf"), Usrpakgf.class);
					rUsrpakgfList = qUsrpakgf.getResultList();
					if (rUsrpakgfList.size() >= 1) {
						rUsrpakgf = new Usrpakgf();
						rUsrpakgfFOUND = true;
						rUsrpakgfEOF = false;
					} else {
						rUsrpakgfFOUND = false;
						rUsrpakgfEOF = true;
					}
					rUsrpakgfPOS = -1;
					usrpakgf.getTransaction().commit();
				} catch (Exception e) {
					usrpakgf.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rUsrpakgfFOUND = false;
				rUsrpakgfEOF = true;
				while (rUsrpakgfPOS < rUsrpakgfList.size() || rUsrpakgfFOUND) {
					rUsrpakgf = rUsrpakgfList.get(++rUsrpakgfPOS);
								if (Objects.equals(String.valueOf(rUsrpakgf.getPrterr()), String.valueOf(WTERR1)) && Objects.equals(String.valueOf(rUsrpakgf.getPrpakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rUsrpakgf.getPrgrpid()), String.valueOf(rRepmas.getRgrpid()))) {
						rUsrpakgfFOUND = true;
						rUsrpakgfEOF = false;
					} else {
						rUsrpakgfFOUND = false;
						rUsrpakgfEOF = true;
					}

				}
				// IF STATEMENT
				if (! rUsrpakgfFOUND) {
					//ADD
					RRNZ = RRNZ + 1;
					// EVAL
					rSh200sfm.setSzerrm( String.valueOf(ERR.get(48)));
					// EVAL
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (IN79 == false) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(2)));
			// EVAL
			// EVAL
		// ELSE
		} else {
			//EXSR
			CILOAD();
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	rAdtpo3.setPxpo( String.valueOf(false));
	// IF STATEMENT
	if (! IN98 && IN79) {
		// CHAIN SETLL
		try {
			adtpo3.getTransaction().begin();
			qAdtpo3 = adtpo3.createQuery("select c from Adtpo3 c where c.PXPKG = '"+rSh200sfm.getCbpkg()+"'", Adtpo3.class);
			rAdtpo3List = qAdtpo3.getResultList();
			if (rAdtpo3List.size() >= 1) {
				rAdtpo3 = new Adtpo3();
				rAdtpo3FOUND = true;
				rAdtpo3EOF = false;
			} else {
				rAdtpo3FOUND = false;
				rAdtpo3EOF = true;
			}
			rAdtpo3POS = -1;
			adtpo3.getTransaction().commit();
		} catch (Exception e) {
			adtpo3.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAdtpo3FOUND = false;
		rAdtpo3EOF = true;
		while (rAdtpo3POS < rAdtpo3List.size() || rAdtpo3FOUND) {
			rAdtpo3 = rAdtpo3List.get(++rAdtpo3POS);
				if (Objects.equals(String.valueOf(rAdtpo3.getPxpkg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rAdtpo3FOUND = true;
				rAdtpo3EOF = false;
			} else {
				rAdtpo3FOUND = false;
				rAdtpo3EOF = true;
			}

		}
		// IF STATEMENT
		if ((rAdtpo3FOUND && ! PO && Boolean.valueOf(rAdtpo3.getPxpo()) == true ) || (PO && ! rAdtpo3FOUND && Boolean.valueOf(rAdtpo2.getPoshow()) == false )) {
			//ADD
			RRNZ = RRNZ + 1;
			// EVAL
			rSh200sfm.setSzerrm( String.valueOf(ERR.get(2)));
			// EVAL
			// EVAL
		// ELSE
		} else {
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (PO && rSh200sfm.getCbpkg().compareTo("") != 0) {
		//EXSR
		CHECKST();
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getCbpkg().compareTo(SVPKG) != 0) {
		// EVAL
		$CBPKG = String.valueOf(" ");
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbprom().compareTo(" ") != 0 && rPakmstFOUND && INKN== false  && rPromstlb.getPmpakg().compareTo(rSh200sfm.getCbpkg()) != 0) {
		// CHAIN SETLL
		try {
			propkg.getTransaction().begin();
			qPropkg = propkg.createQuery(propkgky1KL("Propkg"), Propkg.class);
			rPropkgList = qPropkg.getResultList();
			if (rPropkgList.size() >= 1) {
				rPropkg = new Propkg();
				rPropkgFOUND = true;
				rPropkgEOF = false;
			} else {
				rPropkgFOUND = false;
				rPropkgEOF = true;
			}
			rPropkgPOS = -1;
			propkg.getTransaction().commit();
		} catch (Exception e) {
			propkg.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPropkgFOUND = false;
		rPropkgEOF = true;
		while (rPropkgPOS < rPropkgList.size() || rPropkgFOUND) {
			rPropkg = rPropkgList.get(++rPropkgPOS);
				if (Objects.equals(String.valueOf(rPropkg.getPxterr()), String.valueOf(rPromstlb.getPmterr())) && Objects.equals(String.valueOf(rPropkg.getPxcode()), String.valueOf(rSh200sfm.getHbprom())) && Objects.equals(String.valueOf(rPropkg.getPxpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPropkgFOUND = true;
				rPropkgEOF = false;
			} else {
				rPropkgFOUND = false;
				rPropkgEOF = true;
			}

		}
		// IF STATEMENT
		if (((! rPropkgFOUND && rPromstlb.getPmmpal().compareTo("L") == 0) || rPromstlb.getPmmpal().compareTo("N") == 0) && $_PROM.compareTo(rSh200sfm.getHbprom()) != 0 && $CBPKG.compareTo(rSh200sfm.getCbpkg()) != 0) {
			// IF STATEMENT
			if ($FLPRV.compareTo("Y") == 0) {
				// EVAL
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (IN98 == false) {
		// IF STATEMENT
		if (rSh200sfm.getCbpkg().compareTo(SVPKG) != 0) {
			//EXSR
			$LOADD();
			// MOVE
			$FLAG3 = String.valueOf("X");
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbst().compareTo(TCBST) != 0 && ldadsDS.lcamp().compareTo("RESALE") != 0 && ldadsDS.lcamp().compareTo("CANRSL") != 0) {
			// EVAL
			TCBST = String.valueOf(rSh200sfm.getCbst());
			// EVAL
			//EXSR
			$DISRE();
			// EVAL
		// ENDIF
		}
		// MOVE
		$PKG5 = String.valueOf(rSh200sfm.getCbpkg());
		// IF STATEMENT
		if (rSh200sfm.getCbpkg().compareTo("INKTAG") == 0 || $PKG5.compareTo("ASSET") == 0) {
			// EVAL
			rSh200sfm.setCbmon( String.valueOf("L"));
		// ENDIF
		}
		// IF STATEMENT
		if (rPakmst.getPkpakg().substring(0, 10) == "SW VID LOC") {
			// EVAL
			rSh200sfm.setCbmon( String.valueOf("L"));
		// ENDIF
		}
		// CHAIN SETLL
		try {
			pkgmno.getTransaction().begin();
			qPkgmno = pkgmno.createQuery("select c from Pkgmno c where c.MOPAKG = '"+rSh200sfm.getCbpkg()+"'", Pkgmno.class);
			rPkgmnoList = qPkgmno.getResultList();
			if (rPkgmnoList.size() >= 1) {
				rPkgmno = new Pkgmno();
				rPkgmnoFOUND = true;
				rPkgmnoEOF = false;
			} else {
				rPkgmnoFOUND = false;
				rPkgmnoEOF = true;
			}
			rPkgmnoPOS = -1;
			pkgmno.getTransaction().commit();
		} catch (Exception e) {
			pkgmno.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPkgmnoFOUND = false;
		rPkgmnoEOF = true;
		while (rPkgmnoPOS < rPkgmnoList.size() || rPkgmnoFOUND) {
			rPkgmno = rPkgmnoList.get(++rPkgmnoPOS);
				if (Objects.equals(String.valueOf(rPkgmno.getMopakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPkgmnoFOUND = true;
				rPkgmnoEOF = false;
			} else {
				rPkgmnoFOUND = false;
				rPkgmnoEOF = true;
			}

		}
		// IF STATEMENT
		if (! rPkgmnoFOUND) {
			// MOVE
			$PKG2 = String.valueOf(rSh200sfm.getCbpkg());
			// IF STATEMENT
			if ((ldadsDS.lcamp().compareTo("BUSI") == 0 && $PKG2.compareTo("31") == 0) || (ldadsDS.lcamp().compareTo("BUSI") == 0 && $PKG2.compareTo("51") == 0) || (ldadsDS.lcamp().compareTo("BUSI") == 0 && $PKG2.compareTo("41") == 0) || (ldadsDS.lcamp().compareTo("BUSI") == 0 && $PKG2.compareTo("71") == 0) || (ldadsDS.lcamp().compareTo("BUSI") == 0 && $PKG2.compareTo("36") == 0)) {
				// EVAL
				rSh200sfm.setCbmon( String.valueOf("L"));
			// ENDIF
			}
		// ELSE
		} else {
			// EVAL
			rSh200sfm.setCbmon( String.valueOf(rPkgmno.getMotype()));
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbmon().compareTo("M") != 0 && rSh200sfm.getCbmon().compareTo("L") != 0) {
			// MOVE
			IN31 = true ;
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(3)));
			// EVAL
			// EVAL
		// ELSE
		} else {
			// MOVE
			SVMON = String.valueOf(rSh200sfm.getCbmon());
		// ENDIF
		}
		//MULT
		TOTMN0 = rPakmst.getPkinhr() * 60;
		//ADD
		TOTMN0 = TOTMN0 + rPakmst.getPkinmn();
		// IF STATEMENT
		if (rSh200sfm.getCbpkg().compareTo(AAPKG) != 0 || rSh200sfm.getCbcat().compareTo(AACAT) != 0 || rSh200sfm.getCbst().compareTo(rAuxadrla.getAast())  != 0) {
			//Z-ADD
			rSh200sfm.setCbbase(Float.valueOf(String.valueOf(0)));
			//Z-ADD
			$FDFLG = (int) Integer.valueOf(String.valueOf(0));
		// ENDIF
		}
		//EXSR
		CHKLOCALPAK();
		// SETGT
		try {
			pakprc.getTransaction().begin();
			qPakprc = pakprc.createQuery(prcky1KL("Pakprc"), Pakprc.class);
			rPakprcList = qPakprc.getResultList();
			if (rPakprcList.size() >= 1) {
				rPakprc = new Pakprc();
				rPakprcFOUND = true;
				rPakprcEOF = false;
			} else {
				rPakprcFOUND = false;
				rPakprcEOF = true;
			}
			rPakprcPOS = rPakprcList.size();
			pakprc.getTransaction().commit();
		} catch (Exception e) {
			pakprc.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		//DOU
		do {
			// READPE
			rPakprcFOUND = false;
			rPakprcEOF = true;
			while (rPakprcPOS > 0 || rPakprcFOUND) {
				rPakprc = rPakprcList.get(--rPakprcPOS);
							if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(rProsls.getPterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
					rPakprcFOUND = true;
					rPakprcEOF = false;
				} else {
					rPakprcFOUND = false;
					rPakprcEOF = true;
				}

			}
			// IF STATEMENT
			if (IN79 == false) {
				// IF STATEMENT
				if ($$ADTA.compareTo(rPakprc.getPpstdt()) >= 0) {
					// IF STATEMENT
					if (rPakprc.getPpstat().compareTo("D") != 0 && rPakprc.getPpallw().compareTo("Y") == 0) {
						// IF STATEMENT
						if (Boolean.valueOf(rSlstyp.getSxqspl()) == true  || rSlstyp.getSxqspl().compareTo("") == 0) {
							// IF STATEMENT
							if (rPakprc.getPpfwar().compareTo("Y") == 0) {
								// MOVE
								rSh200sfm.setCbwarc(String.valueOf("Y"));
							// ENDIF
							}
						// ENDIF
						}
						//MULT
						TOTMN0 = rPakprc.getPpinhr() * 60;
						//ADD
						TOTMN0 = TOTMN0 + rPakprc.getPpinmn();
						//Z-ADD
						rSh200sfm.setPpbase(Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
						// IF STATEMENT
						if (rSh200sfm.getCbpkg().compareTo(AAPKG) != 0 || rSh200sfm.getCbcat().compareTo(AACAT) != 0 || rSh200sfm.getCbst().compareTo(rAuxadrla.getAast())  != 0) {
							//Z-ADD
							rSh200sfm.setCbbase(Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
						// ENDIF
						}
						//Z-ADD
						$FDFLG = (int) Integer.valueOf(String.valueOf(1));
						// MOVE
						IN79 = true ;
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
		//ENDDO
		} while (IN79 == true);
		//EXSR
		$600OV();
		// IF STATEMENT
		if (rSh200sfm.getCbbase() == 0 && $FDFLG == 0) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(10)));
			// EVAL
			// EVAL
		// ENDIF
		}
		// CHAIN SETLL
		try {
			promst.getTransaction().begin();
			qPromst = promst.createQuery(prokeyKL("Promst"), Promst.class);
			rPromstList = qPromst.getResultList();
			if (rPromstList.size() >= 1) {
				rPromst = new Promst();
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}
			rPromstPOS = -1;
			promst.getTransaction().commit();
		} catch (Exception e) {
			promst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPromstFOUND = false;
		rPromstEOF = true;
		while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
			rPromst = rPromstList.get(++rPromstPOS);
				if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rMktadd.getMkprom()))) {
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}

		}
		// IF STATEMENT
		if (rPromstFOUND && rSh200sfm.getCbcat().compareTo("") != 0 && rPromstlb.getPmtype().compareTo("") != 0 && rSh200sfm.getCbcat().compareTo(rPromstlb.getPmtype()) != 0) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(32)));
			// EVAL
			// EVAL
		// ENDIF
		}
		// EVAL
		// IF STATEMENT
		if (rSh200sfm.getCbwarc().compareTo("Y") != 0 && rSh200sfm.getCbwarc().compareTo("N") != 0) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(9)));
			// EVAL
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (IN92 == true) {
			// IF STATEMENT
			if (rSh200sfm.getCbccds().compareTo("Y") != 0 && rSh200sfm.getCbccds().compareTo("N") != 0) {
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(6)));
				// EVAL
				// EVAL
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.getCbccds().compareTo("Y") == 0 && rSh200sfm.getCbmon().compareTo("M") != 0) {
				// IF STATEMENT
				if (IN31 == false) {
					//ADD
					RRNZ = RRNZ + 1;
					// MOVE
					rSh200sfm.setSzerrm(String.valueOf(ERR.get(13)));
					// EVAL
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		//Z-ADD
		ONCE = (int) Integer.valueOf(String.valueOf(0));
		//Z-ADD
		rSh200sfm.setSflpsb((int) Integer.valueOf(String.valueOf(1)));
		//Z-ADD
		WRKAD0 = Float.valueOf(String.valueOf(0));
		//Z-ADD
		ANQ.clear();
		//Z-ADD
		WAQ.clear();
		//Z-ADD
		WAP.clear();
		// MOVE
		S5ZIP = String.valueOf(S0ZIP);
		// CHAIN SETLL
		try {
			zipsrvla.getTransaction().begin();
			qZipsrvla = zipsrvla.createQuery("select c from Zipsrvla c where c.ZSZIP = '"+S5ZIP+"'", Zipsrvla.class);
			rZipsrvlaList = qZipsrvla.getResultList();
			if (rZipsrvlaList.size() >= 1) {
				rZipsrvla = new Zipsrvla();
				rZipsrvlaFOUND = true;
				rZipsrvlaEOF = false;
			} else {
				rZipsrvlaFOUND = false;
				rZipsrvlaEOF = true;
			}
			rZipsrvlaPOS = -1;
			zipsrvla.getTransaction().commit();
		} catch (Exception e) {
			zipsrvla.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rZipsrvlaFOUND = false;
		rZipsrvlaEOF = true;
		while (rZipsrvlaPOS < rZipsrvlaList.size() || rZipsrvlaFOUND) {
			rZipsrvla = rZipsrvlaList.get(++rZipsrvlaPOS);
				if (Objects.equals(String.valueOf(rZipsrvla.getZszip()), String.valueOf(S5ZIP))) {
				rZipsrvlaFOUND = true;
				rZipsrvlaEOF = false;
			} else {
				rZipsrvlaFOUND = false;
				rZipsrvlaEOF = true;
			}

		}
		// CHAIN SETLL
		try {
			annfee.getTransaction().begin();
			qAnnfee = annfee.createQuery(annkeyKL("Annfee"), Annfee.class);
			rAnnfeeList = qAnnfee.getResultList();
			if (rAnnfeeList.size() >= 1) {
				rAnnfee = new Annfee();
				rAnnfeeFOUND = true;
				rAnnfeeEOF = false;
			} else {
				rAnnfeeFOUND = false;
				rAnnfeeEOF = true;
			}
			rAnnfeePOS = -1;
			annfee.getTransaction().commit();
		} catch (Exception e) {
			annfee.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAnnfeeFOUND = false;
		rAnnfeeEOF = true;
		while (rAnnfeePOS < rAnnfeeList.size() || rAnnfeeFOUND) {
			rAnnfee = rAnnfeeList.get(++rAnnfeePOS);
				if (Objects.equals(String.valueOf(rAnnfee.getAnterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rAnnfee.getAncat()), String.valueOf(rZipsrvla.getZssrv()))) {
				rAnnfeeFOUND = true;
				rAnnfeeEOF = false;
			} else {
				rAnnfeeFOUND = false;
				rAnnfeeEOF = true;
			}

		}
		//DOW
		while (IN78 == false) {
			// IF STATEMENT
			if (rAnnfee.getAncamp().compareTo(ldadsDS.lcamp()) == 0) {
				//Z-ADD
				A2 = (int) Integer.valueOf(String.valueOf(1));
				// IF STATEMENT
				if (IN77 == true) {
					//ADD
					ANQ.set(A2, ANQ.get(A2) + 1);
					// MOVE
					AMS.set(A2, "X");
				// ENDIF
				}
			// ENDIF
			}
			// READE
			rZipsrvlaFOUND = false;
			rZipsrvlaEOF = true;
			while (rZipsrvlaPOS < rZipsrvlaList.size() || rZipsrvlaFOUND) {
				rZipsrvla = rZipsrvlaList.get(++rZipsrvlaPOS);
						if (Objects.equals(String.valueOf(rZipsrvla.getZszip()), String.valueOf(S5ZIP))) {
					rZipsrvlaFOUND = true;
					rZipsrvlaEOF = false;
				} else {
					rZipsrvlaFOUND = false;
					rZipsrvlaEOF = true;
				}

			}
			// CHAIN SETLL
			try {
				annfee.getTransaction().begin();
				qAnnfee = annfee.createQuery(annkeyKL("Annfee"), Annfee.class);
				rAnnfeeList = qAnnfee.getResultList();
				if (rAnnfeeList.size() >= 1) {
					rAnnfee = new Annfee();
					rAnnfeeFOUND = true;
					rAnnfeeEOF = false;
				} else {
					rAnnfeeFOUND = false;
					rAnnfeeEOF = true;
				}
				rAnnfeePOS = -1;
				annfee.getTransaction().commit();
			} catch (Exception e) {
				annfee.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rAnnfeeFOUND = false;
			rAnnfeeEOF = true;
			while (rAnnfeePOS < rAnnfeeList.size() || rAnnfeeFOUND) {
				rAnnfee = rAnnfeeList.get(++rAnnfeePOS);
						if (Objects.equals(String.valueOf(rAnnfee.getAnterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rAnnfee.getAncat()), String.valueOf(rZipsrvla.getZssrv()))) {
					rAnnfeeFOUND = true;
					rAnnfeeEOF = false;
				} else {
					rAnnfeeFOUND = false;
					rAnnfeeEOF = true;
				}

			}
		//ENDDO
		}
		// CHAIN SETLL
		try {
			pkgsrv.getTransaction().begin();
			qPkgsrv = pkgsrv.createQuery(pakkeyKL("Pkgsrv"), Pkgsrv.class);
			rPkgsrvList = qPkgsrv.getResultList();
			if (rPkgsrvList.size() >= 1) {
				rPkgsrv = new Pkgsrv();
				rPkgsrvFOUND = true;
				rPkgsrvEOF = false;
			} else {
				rPkgsrvFOUND = false;
				rPkgsrvEOF = true;
			}
			rPkgsrvPOS = -1;
			pkgsrv.getTransaction().commit();
		} catch (Exception e) {
			pkgsrv.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPkgsrvFOUND = false;
		rPkgsrvEOF = true;
		while (rPkgsrvPOS < rPkgsrvList.size() || rPkgsrvFOUND) {
			rPkgsrv = rPkgsrvList.get(++rPkgsrvPOS);
				if (Objects.equals(String.valueOf(rPkgsrv.getPsterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rPkgsrv.getPspkg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPkgsrvFOUND = true;
				rPkgsrvEOF = false;
			} else {
				rPkgsrvFOUND = false;
				rPkgsrvEOF = true;
			}

		}
		//DOW
		while (IN78 == false) {
			//Z-ADD
			A2 = (int) Integer.valueOf(String.valueOf(1));
			// IF STATEMENT
			if (IN77 == true) {
				//ADD
				ANQ.set(A2, ANQ.get(A2) + 1);
				// MOVE
				AMS.set(A2, "X");
			// ENDIF
			}
			// READE
			rPkgsrvFOUND = false;
			rPkgsrvEOF = true;
			while (rPkgsrvPOS < rPkgsrvList.size() || rPkgsrvFOUND) {
				rPkgsrv = rPkgsrvList.get(++rPkgsrvPOS);
							if (Objects.equals(String.valueOf(rPkgsrv.getPsterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rPkgsrv.getPspkg()), String.valueOf(rSh200sfm.getCbpkg()))) {
					rPkgsrvFOUND = true;
					rPkgsrvEOF = false;
				} else {
					rPkgsrvFOUND = false;
					rPkgsrvEOF = true;
				}

			}
		//ENDDO
		}
		// EVAL
		// EVAL
		// EVAL
		// EVAL
		$NOITEM = Integer.valueOf(String.valueOf(0));
		// EVAL
		$POS1 = Integer.valueOf(String.valueOf(0));
		//EXSR
		POFFER();
		// IF STATEMENT
		if (IN76 == true) {
			//Z-ADD
			$PDTTL = Float.valueOf(String.valueOf(0));
			//Z-ADD
			$PDTTL2 = Float.valueOf(String.valueOf(0));
			//Z-ADD
			SBITAMT = Float.valueOf(String.valueOf(0));
			// MOVEA
			PAM.clear();
			//DOU
			do {
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
				// ELSE
				} else {
				// ENDIF
				}
				// IF STATEMENT
				if (IN79 == false) {
					// IF STATEMENT
					if (rSh200sfm.getItmtyp().compareTo("BAS") == 0 && rSh200sfm.getSbaddq() > 0) {
						// EVAL
						BASEITEMS = Float.valueOf(String.valueOf(BASEITEMS + (rSh200sfm.getSbaddq() * rSh200sfm.getSbsprc())));
					// ENDIF
					}
					// MOVE
					$FLAG = String.valueOf("X");
					//EXSR
					ACITEM();
					// IF STATEMENT
					if (rSh200sfm.getSbaddq() >= 1 || rSh200sfm.getSbaddq() != rSh200sfm.getHsaddq()) {
						//Z-ADD
						SVRRN = (int) Integer.valueOf(String.valueOf(RRNB));
						// IF STATEMENT
						if (SVRRN != 0 && rSh200sfm.getSbaddq() != rSh200sfm.getHsaddq()) {
							// MOVE
							rSh200sfm.setHsaddq(Integer.valueOf(String.valueOf(rSh200sfm.getSbaddq())));
							//Z-ADD
							rSh200sfm.setSflpsb((int) Integer.valueOf(String.valueOf(SVRRN)));
							//Z-ADD
							SVRRN = (int) Integer.valueOf(String.valueOf(0));
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (rSh200sfm.getSbaddq() < 1) {
						//MULT
						rSh200sfm.setSbaddq(rSh200sfm.getSbaddq() * -1);
					// ENDIF
					}
					// EVAL
					rSh200sfm.setIdwarc( String.valueOf(""));
					// CHAIN SETLL
					try {
						itmdef.getTransaction().begin();
						qItmdef = itmdef.createQuery(idfky1KL("Itmdef"), Itmdef.class);
						rItmdefList = qItmdef.getResultList();
						if (rItmdefList.size() >= 1) {
							rItmdef = new Itmdef();
							rItmdefFOUND = true;
							rItmdefEOF = false;
						} else {
							rItmdefFOUND = false;
							rItmdefEOF = true;
						}
						rItmdefPOS = -1;
						itmdef.getTransaction().commit();
					} catch (Exception e) {
						itmdef.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rItmdefFOUND = false;
					rItmdefEOF = true;
					while (rItmdefPOS < rItmdefList.size() || rItmdefFOUND) {
						rItmdef = rItmdefList.get(++rItmdefPOS);
										if (Objects.equals(String.valueOf(rItmdef.getIditem()), String.valueOf(rSh200sfm.getSbitem())) && Objects.equals(String.valueOf(rItmdef.getIdterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rItmdef.getIdstyp()), String.valueOf(rPakmst.getPkstyp()))) {
							rItmdefFOUND = true;
							rItmdefEOF = false;
						} else {
							rItmdefFOUND = false;
							rItmdefEOF = true;
						}

					}
					// IF STATEMENT
					if (IN73 == true) {
						// CHAIN SETLL
						try {
							itmdef.getTransaction().begin();
							qItmdef = itmdef.createQuery(idfky9KL("Itmdef"), Itmdef.class);
							rItmdefList = qItmdef.getResultList();
							if (rItmdefList.size() >= 1) {
								rItmdef = new Itmdef();
								rItmdefFOUND = true;
								rItmdefEOF = false;
							} else {
								rItmdefFOUND = false;
								rItmdefEOF = true;
							}
							rItmdefPOS = -1;
							itmdef.getTransaction().commit();
						} catch (Exception e) {
							itmdef.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rItmdefFOUND = false;
						rItmdefEOF = true;
						while (rItmdefPOS < rItmdefList.size() || rItmdefFOUND) {
							rItmdef = rItmdefList.get(++rItmdefPOS);
												if (Objects.equals(String.valueOf(rItmdef.getIditem()), String.valueOf(rSh200sfm.getSbitem())) && Objects.equals(String.valueOf(rItmdef.getIdterr()), String.valueOf(ZZTERR)) && Objects.equals(String.valueOf(rItmdef.getIdstyp()), String.valueOf(rPakmst.getPkstyp()))) {
								rItmdefFOUND = true;
								rItmdefEOF = false;
							} else {
								rItmdefFOUND = false;
								rItmdefEOF = true;
							}

						}
					// ENDIF
					}
					//EXSR
					GETITMPRC();
					//Z-ADD
					W2 = (int) Integer.valueOf(String.valueOf(1));
					// IF STATEMENT
					if (IN77 == true) {
						//ADD
						WAP.set(W2, WAP.get(W2) + rSh200sfm.getSbpkgq());
						//ADD
						WAQ.set(W2, WAQ.get(W2) + rSh200sfm.getSbaddq());
					// ENDIF
					}
					//Z-ADD
					rSh200sfm.setSbsprc(Float.valueOf(String.valueOf(0)));
					// MOVE
					ldadsDS.laterr(String.valueOf(rSh200sfm.getCaterr()));
					//Z-ADD
					rSh200sfm.setSbsprc(Float.valueOf(String.valueOf(AASLSP)));
					//Z-ADD
					rSh200sfm.setSbitqt((int) Integer.valueOf(String.valueOf(0)));
					//Z-ADD
					rSh200sfm.setSbitam(Float.valueOf(String.valueOf(0)));
					//Z-ADD
					P2 = (int) Integer.valueOf(String.valueOf(1));
					// IF STATEMENT
					if (IN77 == false) {
						//Z-ADD
						P2 = (int) Integer.valueOf(String.valueOf(1));
					// ENDIF
					}
					// CHAIN SETLL
					try {
						lqgitmf.getTransaction().begin();
						qLqgitmf = lqgitmf.createQuery(poitkKL("Lqgitmf"), Lqgitmf.class);
						rLqgitmfList = qLqgitmf.getResultList();
						if (rLqgitmfList.size() >= 1) {
							rLqgitmf = new Lqgitmf();
							rLqgitmfFOUND = true;
							rLqgitmfEOF = false;
						} else {
							rLqgitmfFOUND = false;
							rLqgitmfEOF = true;
						}
						rLqgitmfPOS = -1;
						lqgitmf.getTransaction().commit();
					} catch (Exception e) {
						lqgitmf.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rLqgitmfFOUND = false;
					rLqgitmfEOF = true;
					while (rLqgitmfPOS < rLqgitmfList.size() || rLqgitmfFOUND) {
						rLqgitmf = rLqgitmfList.get(++rLqgitmfPOS);
										if (Objects.equals(String.valueOf(rLqgitmf.getLqqsrc()), String.valueOf(rPartofl.getPqsrc())) && Objects.equals(String.valueOf(rLqgitmf.getLqgmed()), String.valueOf(rPartofl.getPgmed())) && Objects.equals(String.valueOf(rLqgitmf.getLqitem()), String.valueOf(rSh200sfm.getSbitem()))) {
							rLqgitmfFOUND = true;
							rLqgitmfEOF = false;
						} else {
							rLqgitmfFOUND = false;
							rLqgitmfEOF = true;
						}

					}
					// IF STATEMENT
					if (IN77 == true) {
						// IF STATEMENT
						if (PIE.get(P2).compareTo("I") == 0 && rSh200sfm.getSbaddq() > 0 && WSL.get(P2).compareTo("Y") == 0) {
							// EVAL
							PMS.set(P2,  String.valueOf("Y"));
						// ENDIF
						}
						// IF STATEMENT
						if (PAD.get(P2).compareTo("X") == 0) {
							//SUB
							WRKQT0 = rSh200sfm.getSbaddq() - PMN.get(P2);
						// ELSE
						} else {
							//ADD
							WRKQT0 = rSh200sfm.getSbpkgq() + rSh200sfm.getSbaddq();
							//SUB
							WRKQT0 = WRKQT0 - PMN.get(P2);
						// ENDIF
						}
						//Z-ADD
						PQT.set(P2, (int) Integer.valueOf(String.valueOf(0)));
						// IF STATEMENT
						if (PIT.get(P2).compareTo($ITEM) != 0) {
							//Z-ADD
							PAM.set(P2, Float.valueOf(String.valueOf(0)));
						// ENDIF
						}
						//Z-ADD
						PSP.set(P2, Float.valueOf(String.valueOf(rSh200sfm.getSbsprc())));
						// IF STATEMENT
						if (WRKQT0 > 0) {
							// IF STATEMENT
							if (WRKQT0 > PMX.get(P2) && PMX.get(P2) != 0) {
								//Z-ADD
								PQT.set(P2, (int) Integer.valueOf(String.valueOf(PMX.get(P2))));
							// ELSE
							} else {
								//Z-ADD
								PQT.set(P2, (int) Integer.valueOf(String.valueOf(WRKQT0)));
							// ENDIF
							}
							// IF STATEMENT
							if (PDO.get(P2) > 0) {
								//MULT
								PAM.set(P2, (float) (PDO.get(P2) * PQT.get(P2)));
							// ELSE
							} else {
								//DIV
								WRKPC0 = PPC.get(P2) / 100;
								//MULT
								PAM.set(P2, (float) (rSh200sfm.getSbsprc() * PQT.get(P2)));
								//MULT
								WRKPR0 = (float) (PAM.get(P2) * WRKPC0);
								//Z-ADD
								PAM.set(P2, Float.valueOf(String.valueOf(WRKPR0)));
							// ENDIF
							}
							// IF STATEMENT
							if (rSh200sfm.getCbpkg().compareTo("PRO2K USAA TAK2") == 0 || rSh200sfm.getCbpkg().compareTo("P3K  USAA TAK2") == 0) {
								// IF STATEMENT
								if ($PDTTL >= 500) {
									//DIV
									PAM.set(P2, PAM.get(P2) / 2);
									//ADD
									$PDTTL = $PDTTL + PAM.get(P2);
								// ELSE
								} else {
									//ADD
									$PDTTL = $PDTTL + PAM.get(P2);
									// IF STATEMENT
									if ($PDTTL > 500) {
										//SUB
										$PDTEMP = $PDTTL - 500;
										//SUB
										PAM.set(P2, PAM.get(P2) - $PDTEMP);
										//DIV
										$PDTEMP = $PDTEMP / 2;
										//ADD
										PAM.set(P2, PAM.get(P2) + $PDTEMP);
										//ADD
										$PDTTL = $PDTTL + $PDTEMP;
									// ENDIF
									}
								// ENDIF
								}
								// ELSEIF STATEMENT
							} else if (rSh200sfm.getCbpkg().compareTo("PRO2K USAA TAK2B") == 0 || rSh200sfm.getCbpkg().compareTo("P3K  USAA TAK2B") == 0) {
								// IF STATEMENT
								if ($PDTTL >= 300) {
									//MULT
									PAM.set(P2, (float) (PAM.get(P2) * 0.3));
									//ADD
									$PDTTL = $PDTTL + PAM.get(P2);
								// ELSE
								} else {
									//ADD
									$PDTTL = $PDTTL + PAM.get(P2);
									// IF STATEMENT
									if ($PDTTL > 300) {
										//SUB
										$PDTEMP = $PDTTL - 300;
										//SUB
										PAM.set(P2, PAM.get(P2) - $PDTEMP);
										//MULT
										$PDTEMP = (float) ($PDTEMP * 0.3);
										//ADD
										PAM.set(P2, PAM.get(P2) + $PDTEMP);
										//ADD
										$PDTTL = $PDTTL + $PDTEMP;
									// ENDIF
									}
								// ENDIF
								}
							// ENDSL
							}
							// IF STATEMENT
							if (PMS.get(P2).compareTo("Y") == 0) {
								//Z-ADD
								rSh200sfm.setSbitqt((int) Integer.valueOf(String.valueOf(PQT.get(P2))));
								//Z-ADD
								rSh200sfm.setSbitam(Float.valueOf(String.valueOf(PAM.get(P2))));
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
						//Z-ADD
						rSh200sfm.setSblnam(Float.valueOf(String.valueOf(0)));
					// ELSE
					} else {
						//Z-ADD
						rSh200sfm.setSblnams(Float.valueOf(String.valueOf(0)));
					// ENDIF
					}
					//Z-ADD
					WRK092 = Float.valueOf(String.valueOf(0));
					// IF STATEMENT
					if (rSh200sfm.getSbaddq() > 0) {
						//MULT
						TOTMN9 = rSh200sfm.getHbinhr() * 60;
						//ADD
						TOTMN9 = TOTMN9 + rSh200sfm.getHbinmn();
						//MULT
						TOTMN9 = TOTMN9 * rSh200sfm.getSbaddq();
						//ADD
						TOTMN0 = TOTMN0 + TOTMN9;
						//MULT
						WRK092 = (float) (rSh200sfm.getSbaddq() * rSh200sfm.getSbsprc());
						//ADD
						WRKAD0 = WRKAD0 + WRK092;
						// IF STATEMENT
						if (IN73 == false) {
							//Z-ADD
							A2 = (int) Integer.valueOf(String.valueOf(1));
							// IF STATEMENT
							if (IN77 == true) {
								//ADD
								ANQ.set(A2, ANQ.get(A2) + rSh200sfm.getSbaddq());
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
					//EXSR
					$OVRITM();
					// EVAL
					rSh200sfm.setHpdamt( Float.valueOf(String.valueOf(0)));
					// IF STATEMENT
					if ($POFFER && rLqgitmfFOUND) {
						// EVAL
						rSh200sfm.setHpdamt( Float.valueOf(String.valueOf(WRK092-rSh200sfm.getSbitam())));
						// IF STATEMENT
						if (rSh200sfm.getSbitqt() == 0) {
							// EVAL
							rSh200sfm.setSbitqt( Integer.valueOf(String.valueOf(rSh200sfm.getSbaddq())));
						// ENDIF
						}
					// ENDIF
					}
					// EVAL
					rSh200sfm.setSbitam( Float.valueOf(String.valueOf(rSh200sfm.getSbitam()+rSh200sfm.getHpdamt())));
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
						//SUB
						rSh200sfm.setSblnam(WRK092 - rSh200sfm.getSbitam());
					// ELSE
					} else {
						//SUB
						rSh200sfm.setSblnams(WRK092 - rSh200sfm.getSbitam());
					// ENDIF
					}
					// EVAL
					rSh200sfm.setSitneg( Float.valueOf(String.valueOf(0)));
					// IF STATEMENT
					if (rItusnegFOUND && (rItusneg.getIudisc().compareTo("I") == 0 || rItusneg.getIudisc().compareTo("B") == 0)) {
						// CHAIN SETLL
						try {
							usritmf.getTransaction().begin();
							qUsritmf = usritmf.createQuery(grpitkKL("Usritmf"), Usritmf.class);
							rUsritmfList = qUsritmf.getResultList();
							if (rUsritmfList.size() >= 1) {
								rUsritmf = new Usritmf();
								rUsritmfFOUND = true;
								rUsritmfEOF = false;
							} else {
								rUsritmfFOUND = false;
								rUsritmfEOF = true;
							}
							rUsritmfPOS = -1;
							usritmf.getTransaction().commit();
						} catch (Exception e) {
							usritmf.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rUsritmfFOUND = false;
						rUsritmfEOF = true;
						while (rUsritmfPOS < rUsritmfList.size() || rUsritmfFOUND) {
							rUsritmf = rUsritmfList.get(++rUsritmfPOS);
												if (Objects.equals(String.valueOf(rUsritmf.getUiusrg()), String.valueOf(rItusneg.getIuugrp())) && Objects.equals(String.valueOf(rUsritmf.getUidisc()), String.valueOf(rItusneg.getIudisc())) && Objects.equals(String.valueOf(rUsritmf.getUiitem()), String.valueOf(rSh200sfm.getSbitem()))) {
								rUsritmfFOUND = true;
								rUsritmfEOF = false;
							} else {
								rUsritmfFOUND = false;
								rUsritmfEOF = true;
							}

						}
						// IF STATEMENT
						if (rUsritmfFOUND) {
							// EVAL
							rSh200sfm.setSitneg( Float.valueOf(String.valueOf((WRK092-rSh200sfm.getSbitam()))));
						// ENDIF
						}
					// ENDIF
					}
					// EVAL
					_ITNEG = Float.valueOf(String.valueOf(_ITNEG + rSh200sfm.getSitneg()));
					// EVAL
					$ITMDESC = String.valueOf(rSh200sfm.getSbitem());
					// CHAIN SETLL
					try {
						adtitmo.getTransaction().begin();
						qAdtitmo = adtitmo.createQuery($kitmoKL("Adtitmo"), Adtitmo.class);
						rAdtitmoList = qAdtitmo.getResultList();
						if (rAdtitmoList.size() >= 1) {
							rAdtitmo = new Adtitmo();
							rAdtitmoFOUND = true;
							rAdtitmoEOF = false;
						} else {
							rAdtitmoFOUND = false;
							rAdtitmoEOF = true;
						}
						rAdtitmoPOS = -1;
						adtitmo.getTransaction().commit();
					} catch (Exception e) {
						adtitmo.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rAdtitmoFOUND = false;
					rAdtitmoEOF = true;
					while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
						rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
										if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
							rAdtitmoFOUND = true;
							rAdtitmoEOF = false;
						} else {
							rAdtitmoFOUND = false;
							rAdtitmoEOF = true;
						}

					}
					// IF STATEMENT
					if (rAdtitmoFOUND) {
						// EVAL
					// ELSE
					} else {
						// CHAIN SETLL
						try {
							adtitmo.getTransaction().begin();
							qAdtitmo = adtitmo.createQuery($kitmo99KL("Adtitmo"), Adtitmo.class);
							rAdtitmoList = qAdtitmo.getResultList();
							if (rAdtitmoList.size() >= 1) {
								rAdtitmo = new Adtitmo();
								rAdtitmoFOUND = true;
								rAdtitmoEOF = false;
							} else {
								rAdtitmoFOUND = false;
								rAdtitmoEOF = true;
							}
							rAdtitmoPOS = -1;
							adtitmo.getTransaction().commit();
						} catch (Exception e) {
							adtitmo.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rAdtitmoFOUND = false;
						rAdtitmoEOF = true;
						while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
							rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
												if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
								rAdtitmoFOUND = true;
								rAdtitmoEOF = false;
							} else {
								rAdtitmoFOUND = false;
								rAdtitmoEOF = true;
							}

						}
						// IF STATEMENT
						if (rAdtitmoFOUND) {
							// EVAL
						// ELSE
						} else {
							// EVAL
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (rSh200sfm.getHbmaxq() < (rSh200sfm.getSbpkgq() + rSh200sfm.getSbaddq())) {
						// EVAL
						// EVAL
						//ADD
						RRNZ = RRNZ + 1;
						// MOVE
						rSh200sfm.setSzerrm(String.valueOf(ERR.get(28)));
						// EVAL
					// ELSE
					} else {
						// EVAL
					// ENDIF
					}
					// EVAL
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
						// CHAIN SETLL
						try {
							itmlin.getTransaction().begin();
							qItmlin = itmlin.createQuery("select c from Itmlin c where c.ILITEM = '"+rSh200sfm.getSbitem()+"'", Itmlin.class);
							rItmlinList = qItmlin.getResultList();
							if (rItmlinList.size() >= 1) {
								rItmlin = new Itmlin();
								rItmlinFOUND = true;
								rItmlinEOF = false;
							} else {
								rItmlinFOUND = false;
								rItmlinEOF = true;
							}
							rItmlinPOS = -1;
							itmlin.getTransaction().commit();
						} catch (Exception e) {
							itmlin.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rItmlinFOUND = false;
						rItmlinEOF = true;
						while (rItmlinPOS < rItmlinList.size() || rItmlinFOUND) {
							rItmlin = rItmlinList.get(++rItmlinPOS);
												if (Objects.equals(String.valueOf(rItmlin.getIlitem()), String.valueOf(rSh200sfm.getSbitem()))) {
								rItmlinFOUND = true;
								rItmlinEOF = false;
							} else {
								rItmlinFOUND = false;
								rItmlinEOF = true;
							}

						}
						// IF STATEMENT
						if (rItmlinFOUND && (rItmlin.getIlline() == 19 || rItmlin.getIlline() == 26 || rItmlin.getIlline() == 33)) {
							// IF STATEMENT
							if (rSh200sfm.getSblctn().trim() != "Y" && rSh200sfm.getSblctn().trim() != "Y" && rSh200sfm.getSblctn().trim() != "N" && rSh200sfm.getSblctn().trim() != "N" && rSh200sfm.getSblctn().compareTo(" ") != 0) {
								// EVAL
								// EVAL
								//ADD
								RRNZ = RRNZ + 1;
								// MOVE
								rSh200sfm.setSzerrm(String.valueOf(ERR.get(49)));
								// EVAL
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (rSh200sfm.getSbpkgq() != 0 || rSh200sfm.getSbaddq() != 0) {
						// IF STATEMENT
						if (rSh200sfm.getSbaddq() != 0) {
							// EVAL
							$NOITEM = Integer.valueOf(String.valueOf($NOITEM +1));
						// ENDIF
						}
						// EVAL
						$POS1 = Integer.valueOf(String.valueOf($POS1 + 1));
						// EVAL
						$OITM.set($POS1,  String.valueOf(rSh200sfm.getSbitem()));
					// ENDIF
					}
					// EVAL
					SBITAMT = Float.valueOf(String.valueOf(SBITAMT+rSh200sfm.getSbsprc()*rSh200sfm.getSbaddq()));
					// IF STATEMENT
					if ($ONCE == true) {
						// IF STATEMENT
						if (PMS.get(P2).compareTo("Y") == 0 && PIE.get(P2).compareTo("O") == 0) {
							// EVAL
							$GRPPOS = Integer.valueOf(String.valueOf(PGRP.indexOf(PGR.get(P2))));
							// IF STATEMENT
							if ($GRPPOS > 0) {
								// IF STATEMENT
								if (rSh200sfm.getSbaddq() > 0) {
									// EVAL
									PGRPI.set($GRPPOS,  Integer.valueOf(String.valueOf(PGRPI.get($GRPPOS) + 1)));
								// ELSE
								} else {
									// EVAL
									PGRPI.set($GRPPOS,  Integer.valueOf(String.valueOf(PGRPI.get($GRPPOS) - 1)));
								// ENDIF
								}
								// IF STATEMENT
								if (PGRPI.get($GRPPOS) > 1) {
									// EVAL
									rSh200sfm.setGrpid( String.valueOf(PGR.get(P2)));
								// ENDIF
								}
							// ENDIF
							}
						// ENDIF
						}
						// IF STATEMENT
						if (rSh200sfm.getSbaddq() > 0 && PIE.get(P2).compareTo("I") == 0 && rSh200sfm.getHoaddq() == 0) {
							// EVAL
						// ENDIF
						}
						// IF STATEMENT
						if (rSh200sfm.getSbaddq() > 0 && PIE.get(P2).compareTo("O") == 0 && rSh200sfm.getHoaddq() == 0) {
							// EVAL
						// ENDIF
						}
					// ENDIF
					}
					// EVAL
					rSh200sfm.setHoaddq( Integer.valueOf(String.valueOf(rSh200sfm.getSbaddq())));
					//EXSR
					GETATTR();
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
					// ELSE
					} else {
					// ENDIF
					}
				// ENDIF
				}
			//ENDDO
			} while (IN79 == true);
			// EVAL
			//EXSR
			ELECTSR();
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getPpbase()+SBITAMT<rProextn.getPeadmia() && rProextn.getPeadmia() != 0) {
			// MOVE
			ADSCDIS = String.valueOf("0");
		// ELSE
		} else {
			// MOVE
			ADSCDIS = String.valueOf("1");
		// ENDIF
		}
		//Z-ADD
		rSh200sfm.setCbmntr(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbmmnt(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbwrfe(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbmwrf(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbfire(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		CBFIR1 = Float.valueOf(String.valueOf(0));
		//Z-ADD
		rSh200sfm.setCbmfir(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbanam(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbanmm(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		PVUSD = Float.valueOf(String.valueOf(0));
		//Z-ADD
		rSh200sfm.set_pvdif(Float.valueOf(String.valueOf(rSh200sfm.get_pvtot())));
		//Z-ADD
		rSh200sfm.setCbadd(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbadam(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.set_ptusd((int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PTDIF = (int) Integer.valueOf(String.valueOf(rSh200sfm.get_pvpts()));
		// EVAL
		$HPDAMT = Float.valueOf(String.valueOf(0));
		// IF STATEMENT
		if (RRNB > 0) {
			// EVAL
			//Z-ADD
			C = (int) Integer.valueOf(String.valueOf(1));
			//DOW
			while (IN81 == false) {
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
				// ELSE
				} else {
				// ENDIF
				}
				// IF STATEMENT
				if (IN81 == false) {
					// IF STATEMENT
					if (rSh200sfm.get_pvpt$() != 0) {
						//DIV
						rSh200sfm.setHsvpts((int) Integer.valueOf(String.valueOf(rSh200sfm.getSbsprc() / rSh200sfm.get_pvpt$())));
					// ENDIF
					}
					//MULT
					rSh200sfm.setHspusd(rSh200sfm.getSbaddq() * rSh200sfm.getHsvpts());
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
						// EVAL
						rSh200sfm.setSblnam( Float.valueOf(String.valueOf(rSh200sfm.getSbsprc()*rSh200sfm.getSbaddq())));
					// ELSE
					} else {
						// EVAL
						rSh200sfm.setSblnams( Float.valueOf(String.valueOf(rSh200sfm.getSbsprc()*rSh200sfm.getSbaddq())));
					// ENDIF
					}
					//Z-ADD
					P3 = (int) Integer.valueOf(String.valueOf(1));
					// IF STATEMENT
					if (PFB.get(P3).compareTo("") != 0) {
						// EVAL
						FBITEMS2 = Float.valueOf(String.valueOf(FBITEMS2 + rSh200sfm.getSbitam()));
					// ENDIF
					}
					// IF STATEMENT
					if (PIE.get(P3).compareTo("E") == 0) {
						// EVAL
						FBITEMS2 = Float.valueOf(String.valueOf(FBITEMS2 +(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())));
					// ENDIF
					}
					// IF STATEMENT
					if (PFB.get(P3).compareTo("B") == 0) {
						// EVAL
						$PDTTL = Float.valueOf(String.valueOf($PDTTL - rSh200sfm.getSbitam()));
					// ENDIF
					}
					// IF STATEMENT
					if (rSh200sfm.getPpbase()+SBITAMT-FBITEMS2<rProextn.getPeadmia() && rProextn.getPeadmia() != 0) {
						// MOVE
						ADSCDIS = String.valueOf("0");
					// ELSE
					} else {
						// MOVE
						ADSCDIS = String.valueOf("1");
					// ENDIF
					}
					// IF STATEMENT
					if (rPromstlb.getPmdsam() > 0 && rSh200sfm.getHbdsam() == 0 && rProextn.getPeadmia() <= ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc()))-FBITEMS2) {
						// EVAL
						rSh200sfm.setHbdsam( Float.valueOf(String.valueOf(rPromstlb.getPmdsam())));
					// ENDIF
					}
					// IF STATEMENT
					if (rSh200sfm.getHbdsam() > 0 && IN77 == false  || rSh200sfm.getHbdsam() > 0 && IN77 == true  && PFB.get(P3).compareTo("") == 0) {
						// IF STATEMENT
						if (rSh200sfm.getHbdsam() >= ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())) - FBITEMS2) {
							// EVAL
							rSh200sfm.setSbitam( Float.valueOf(String.valueOf(0)));
						// ENDIF
						}
						// IF STATEMENT
						if (rSh200sfm.getHbdsam() < ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())) - FBITEMS2 && rSh200sfm.getHbdsam() > (rSh200sfm.getPpbase()+rSh200sfm.getCbadd()) - FBITEMS && rSh200sfm.getSbitam() > 0) {
							// EVAL
							rSh200sfm.setSbitam( Float.valueOf(String.valueOf(rSh200sfm.getSbitam()*( ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc()) -rSh200sfm.getHbdsam()-FBITEMS2)/((rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())- (FBITEMS2-FBITEMS))))));
						// ENDIF
						}
					// ELSE
					} else {
						// IF STATEMENT
						if (rProextn.getPeadmia() > ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())) - FBITEMS2) {
							// IF STATEMENT
							if (IN77 == false  || IN77 == true  && PFB.get(P3).compareTo("") == 0) {
								// EVAL
								rSh200sfm.setSbitam( Float.valueOf(String.valueOf(0)));
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (rProextn.getPeadmia() > 0) {
						// IF STATEMENT
						if (rProextn.getPeadmia() >= ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())) - FBITEMS2) {
							// IF STATEMENT
							if (IN77 == false  || IN77 == true  && PFB.get(P3).compareTo("") == 0) {
								// EVAL
								rSh200sfm.setSbitam( Float.valueOf(String.valueOf(0)));
							// ENDIF
							}
						// ENDIF
						}
						// IF STATEMENT
						if (rProextn.getPeadmia() < ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())) - FBITEMS2 && rProextn.getPeadmia() > (rSh200sfm.getPpbase()+rSh200sfm.getCbadd()) - FBITEMS && rSh200sfm.getSbitam() > 0) {
							// IF STATEMENT
							if (IN77 == false  || IN77 == true  && PFB.get(P3).compareTo("") == 0) {
								// IF STATEMENT
								if (((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc()) -rSh200sfm.getHbdsam()-FBITEMS2) < ((rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())-(FBITEMS2-FBITEMS))) {
									// EVAL
									rSh200sfm.setSbitam( Float.valueOf(String.valueOf(rSh200sfm.getSbitam()*( ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc()) -rProextn.getPeadmia()-FBITEMS2)/ ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc()) -rSh200sfm.getHbdsam()-FBITEMS2)))));
								// ELSE
								} else {
									// EVAL
									rSh200sfm.setSbitam( Float.valueOf(String.valueOf(rSh200sfm.getSbitam()*( ((rSh200sfm.getPpbase()+rSh200sfm.getCbadd())+(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc()) -rProextn.getPeadmia()-FBITEMS2)/ ((rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())-(FBITEMS2-FBITEMS))))));
								// ENDIF
								}
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (PFB.get(P3).compareTo("") != 0) {
						// EVAL
						FBITEMS = Float.valueOf(String.valueOf(FBITEMS + rSh200sfm.getSbitam()));
					// ENDIF
					}
					// IF STATEMENT
					if (PIE.get(P3).compareTo("E") == 0) {
						// EVAL
						FBITEMS = Float.valueOf(String.valueOf(FBITEMS +(rSh200sfm.getSbaddq()*rSh200sfm.getSbsprc())));
					// ENDIF
					}
					// IF STATEMENT
					if (IN77 == false) {
						//Z-ADD
						P3 = (int) Integer.valueOf(String.valueOf(1));
					// ENDIF
					}
					// IF STATEMENT
					if (rSh200sfm.getCbpkg().compareTo("PRO2K USAA TAK2") != 0 && rSh200sfm.getCbpkg().compareTo("P3K  USAA TAK2") != 0 && rSh200sfm.getCbpkg().compareTo("PRO2K USAA TAK2B") != 0 && rSh200sfm.getCbpkg().compareTo("P3K  USAA TAK2B") != 0) {
						// IF STATEMENT
						if (HBITMX$ != 0) {
							// IF STATEMENT
							if ($PDTTL >= HBITMX$) {
								// EVAL
								rSh200sfm.setSbitam( Float.valueOf(String.valueOf(rSh200sfm.getSbitam() * (HBITMXP/100))));
								//ADD
								$PDTTL = $PDTTL + rSh200sfm.getSbitam();
							// ELSE
							} else {
								//ADD
								$PDTTL = $PDTTL + rSh200sfm.getSbitam();
								// IF STATEMENT
								if ($PDTTL > HBITMX$) {
									//SUB
									$PDTEMP = $PDTTL - HBITMX$;
									//SUB
									rSh200sfm.setSbitam(rSh200sfm.getSbitam() - $PDTEMP);
									// EVAL
									$PDTEMP = Float.valueOf(String.valueOf($PDTEMP * (HBITMXP/100)));
									//ADD
									rSh200sfm.setSbitam(rSh200sfm.getSbitam() + $PDTEMP);
									//ADD
									$PDTTL = $PDTTL + $PDTEMP;
								// ENDIF
								}
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (PIT.get(P3).compareTo("ITEM") == 0) {
						//ADD
						$PDTTL2 = $PDTTL2 + rSh200sfm.getSbitam();
					// ENDIF
					}
					// IF STATEMENT
					if (PVUSD < rSh200sfm.get_pvtot()) {
						// IF STATEMENT
						if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
							//ADD
							PVUSD = PVUSD + rSh200sfm.getSblnam();
							//SUB
							rSh200sfm.set_pvdif(rSh200sfm.get_pvdif() - rSh200sfm.getSblnam());
						// ELSE
						} else {
							//ADD
							PVUSD = PVUSD + rSh200sfm.getSblnams();
							//SUB
							rSh200sfm.set_pvdif(rSh200sfm.get_pvdif() - rSh200sfm.getSblnams());
						// ENDIF
						}
						// ELSEIF STATEMENT
					} else if (PVUSD == rSh200sfm.get_pvtot()) {
						// IF STATEMENT
						if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
							//ADD
							rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.getSblnam());
							//ADD
							rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.getSblnam());
						// ELSE
						} else {
							//ADD
							rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.getSblnams());
							//ADD
							rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.getSblnams());
						// ENDIF
						}
					// ENDSL
					}
					// IF STATEMENT
					if (PVUSD > rSh200sfm.get_pvtot()) {
						//Z-SUB
						rSh200sfm.set_pvdif(0 - rSh200sfm.get_pvdif());
						//ADD
						rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.get_pvdif());
						//ADD
						rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.get_pvdif());
						//Z-ADD
						PVUSD = Float.valueOf(String.valueOf(rSh200sfm.get_pvtot()));
						//Z-ADD
						rSh200sfm.set_pvdif(Float.valueOf(String.valueOf(0)));
					// ENDIF
					}
					//SUB
					rSh200sfm.setCbadam(rSh200sfm.getCbadam() - rSh200sfm.getSbitam());
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
						// EVAL
						rSh200sfm.setSblnam( Float.valueOf(String.valueOf(rSh200sfm.getSbsprc()*rSh200sfm.getSbaddq()-rSh200sfm.getSbitam())));
					// ELSE
					} else {
						// EVAL
						rSh200sfm.setSblnams( Float.valueOf(String.valueOf(rSh200sfm.getSbsprc()*rSh200sfm.getSbaddq()-rSh200sfm.getSbitam())));
					// ENDIF
					}
					// EVAL
					$ITMDESC = String.valueOf(rSh200sfm.getSbitem());
					// CHAIN SETLL
					try {
						adtitmo.getTransaction().begin();
						qAdtitmo = adtitmo.createQuery($kitmoKL("Adtitmo"), Adtitmo.class);
						rAdtitmoList = qAdtitmo.getResultList();
						if (rAdtitmoList.size() >= 1) {
							rAdtitmo = new Adtitmo();
							rAdtitmoFOUND = true;
							rAdtitmoEOF = false;
						} else {
							rAdtitmoFOUND = false;
							rAdtitmoEOF = true;
						}
						rAdtitmoPOS = -1;
						adtitmo.getTransaction().commit();
					} catch (Exception e) {
						adtitmo.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rAdtitmoFOUND = false;
					rAdtitmoEOF = true;
					while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
						rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
										if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
							rAdtitmoFOUND = true;
							rAdtitmoEOF = false;
						} else {
							rAdtitmoFOUND = false;
							rAdtitmoEOF = true;
						}

					}
					// IF STATEMENT
					if (rAdtitmoFOUND) {
						// EVAL
					// ELSE
					} else {
						// CHAIN SETLL
						try {
							adtitmo.getTransaction().begin();
							qAdtitmo = adtitmo.createQuery($kitmo99KL("Adtitmo"), Adtitmo.class);
							rAdtitmoList = qAdtitmo.getResultList();
							if (rAdtitmoList.size() >= 1) {
								rAdtitmo = new Adtitmo();
								rAdtitmoFOUND = true;
								rAdtitmoEOF = false;
							} else {
								rAdtitmoFOUND = false;
								rAdtitmoEOF = true;
							}
							rAdtitmoPOS = -1;
							adtitmo.getTransaction().commit();
						} catch (Exception e) {
							adtitmo.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rAdtitmoFOUND = false;
						rAdtitmoEOF = true;
						while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
							rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
												if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
								rAdtitmoFOUND = true;
								rAdtitmoEOF = false;
							} else {
								rAdtitmoFOUND = false;
								rAdtitmoEOF = true;
							}

						}
						// IF STATEMENT
						if (rAdtitmoFOUND) {
							// EVAL
						// ELSE
						} else {
							// EVAL
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (rSh200sfm.getHbmaxq() < (rSh200sfm.getSbpkgq() + rSh200sfm.getSbaddq())) {
						// EVAL
						// EVAL
					// ELSE
					} else {
						// EVAL
					// ENDIF
					}
					// IF STATEMENT
					if (rSh200sfm.getHpdamt() > 0) {
						// EVAL
						$HPDAMT = Float.valueOf(String.valueOf($HPDAMT + rSh200sfm.getSbitam()));
					// ENDIF
					}
					//EXSR
					GETATTR();
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
					// ELSE
					} else {
					// ENDIF
					}
				// ENDIF
				}
				//ADD
				C = C + 1;
			//ENDDO
			}
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbmon().compareTo("M") == 0) {
			//Z-ADD
			rSh200sfm.setCbmntr(Float.valueOf(String.valueOf(rPakprc.getPpamfe())));
			//Z-ADD
			A2 = (int) Integer.valueOf(String.valueOf(0));
			//DO
			for (A2 = 1; A2 < A1; A2++) {
				// IF STATEMENT
				if (ANQ.get(A2) != 0 || AMS.get(A2).compareTo("X") == 0) {
					// IF STATEMENT
					if (ANQ.get(A2) > 0) {
						// IF STATEMENT
						if (mkactyDS.$camp().compareTo("H") != 0 && mkactyDS.$camp().compareTo("F") != 0) {
							// IF STATEMENT
							if (ANFL.get(A2).compareTo(" ") == 0 || ANFL.get(A2).compareTo("N") == 0) {
								//ADD
								rSh200sfm.setCbfire(rSh200sfm.getCbfire() + ANF.get(A2));
							// ELSE
							} else {
								// EVAL
								rSh200sfm.setCbfire( Float.valueOf(String.valueOf(rSh200sfm.getCbfire() + ANQ.get(A2) * ANF.get(A2))));
							// ENDIF
							}
						// ELSE
						} else {
							// IF STATEMENT
							if (ANFL.get(A2).compareTo(" ") == 0 || ANFL.get(A2).compareTo("Y") == 0) {
								//MULT
								CBFIR1 = (float) (ANQ.get(A2) * ANF.get(A2));
							// ELSE
							} else {
								// EVAL
								CBFIR1 = Float.valueOf(String.valueOf(ANF.get(A2)));
							// ENDIF
							}
							//ADD
							rSh200sfm.setCbfire(rSh200sfm.getCbfire() + CBFIR1);
						// ENDIF
						}
					// ELSE
					} else {
						// IF STATEMENT
						if (ANFL.get(A2).compareTo(" ") == 0 || ANFL.get(A2).compareTo("N") == 0) {
							//ADD
							rSh200sfm.setCbfire(rSh200sfm.getCbfire() + ANF.get(A2));
						// ELSE
						} else {
							// EVAL
							rSh200sfm.setCbfire( Float.valueOf(String.valueOf(rSh200sfm.getCbfire() + ANQ.get(A2) * ANF.get(A2))));
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			//ENDDO
			}
		// ENDIF
		}
		// IF STATEMENT
		if (SVWARC.compareTo(rSh200sfm.getCbwarc()) != 0) {
			// MOVE
			$FLAG5 = String.valueOf("X");
		// ENDIF
		}
		// EVAL
		// IF STATEMENT
		if (rAdtitmoFOUND) {
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbwarc().compareTo("Y") == 0 && (ldadsDS.lcamp().compareTo("F16") != 0 || ADDONPKG)) {
			//Z-ADD
			rSh200sfm.setCbwrfe(Float.valueOf(String.valueOf(rPakprc.getPpwarp())));
			//Z-ADD
			W2 = (int) Integer.valueOf(String.valueOf(0));
			//DO
			for (W2 = 1; W2 < W1; W2++) {
				//ADD
				WRK092 = WAQ.get(W2) + WAP.get(W2);
				//MULT
				WRK092 = (float) (WRK092 * WAF.get(W2));
				// IF STATEMENT
				if (WRK092 > WAT.get(W2)) {
					//SUB
					WRK092 = WRK092 - WAT.get(W2);
					//ADD
					rSh200sfm.setCbwrfe(rSh200sfm.getCbwrfe() + WRK092);
				// ENDIF
				}
			//ENDDO
			}
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbccds().compareTo("Y") == 0) {
			//SUB
			rSh200sfm.setCbmntr(rSh200sfm.getCbmntr() - rPakprc.getPpdccf());
		// ENDIF
		}
		// EVAL
		rSh200sfm.setCbbase( Float.valueOf(String.valueOf(rSh200sfm.getPpbase() + BASEITEMS)));
		//SUB
		rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() - BASEITEMS);
		//SUB
		rSh200sfm.setCbadd(rSh200sfm.getCbadd() - BASEITEMS);
		//ADD
		rSh200sfm.setCbb$ad(rSh200sfm.getCbbase() + rSh200sfm.getCbadd());
		//ADD
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() + rSh200sfm.getCbadd$());
		//SUB
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() - USAA_ADSC);
		//DIV
		rSh200sfm.setCbmmnt(rSh200sfm.getCbmntr() / 12);
		//DIV
		rSh200sfm.setCbmfir(rSh200sfm.getCbfire() / 12);
		//DIV
		rSh200sfm.setCbmwrf(rSh200sfm.getCbwrfe() / 12);
		// EVAL
		rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam())));
		// EVAL
		rSh200sfm.setCbmmfw( Float.valueOf(String.valueOf(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir() + rSh200sfm.getCbmwrf() + rSh200sfm.getCbanmm())));
	// ENDIF
	}
	//Z-ADD
	P2 = (int) Integer.valueOf(String.valueOf(0));
	// IF STATEMENT
	if (rSh200sfm.getHbprom().compareTo("") == 0) {
		// EVAL
		ANSCPROM = Float.valueOf(String.valueOf(0));
		// EVAL
		PROMBAL1 = Integer.valueOf(String.valueOf(0));
		// EVAL
		rSh200sfm.setPrombal( Integer.valueOf(String.valueOf(0)));
	// ENDIF
	}
	//DO
	for (P2 = 1; P2 < 2; P2++) {
		// IF STATEMENT
		if (PIT.get(P2).compareTo("ANSC    ") == 0) {
			// IF STATEMENT
			if (PDO.get(P2) != 0) {
				//Z-ADD
				PAM.set(P2, Float.valueOf(String.valueOf(PDO.get(P2))));
			// ELSE
			} else {
				//DIV
				WRKPC0 = PPC.get(P2) / 100;
				//MULT
				PAM.set(P2, (float) (rSh200sfm.getCbmfwt() * WRKPC0));
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (PIT.get(P2).compareTo("ADSC    ") == 0) {
			// EVAL
			// IF STATEMENT
			if (rSh200sfm.getHbprom().compareTo("") != 0) {
				// EVAL
			// ENDIF
			}
			// IF STATEMENT
			if (ANSCPROM == 0) {
				// EVAL
				ANSCPROM = Float.valueOf(String.valueOf(PDO.get(P2)));
			// ELSE
			} else {
				// EVAL
				PDO.set(P2,  Float.valueOf(String.valueOf(ANSCPROM)));
			// ENDIF
			}
			// IF STATEMENT
			if (ADSCDIS.compareTo("1") == 0) {
				// EVAL
				PROMBAL1 = Integer.valueOf(String.valueOf(ANSCPROM - (rSh200sfm.getCbbase()+rSh200sfm.getCbadd()) + FBITEMS));
			// ELSE
			} else {
				// EVAL
				PROMBAL1 = Integer.valueOf(String.valueOf(ANSCPROM));
			// ENDIF
			}
			// IF STATEMENT
			if (PROMBAL1 < 0) {
				// EVAL
				PROMBAL1 = Integer.valueOf(String.valueOf(0));
			// ENDIF
			}
			// IF STATEMENT
			if (PROMBAL1 > 999) {
				// EVAL
				PROMBAL1 = Integer.valueOf(String.valueOf(999));
			// ENDIF
			}
			// EVAL
			rSh200sfm.setPrombal( Integer.valueOf(String.valueOf(PROMBAL1)));
			// IF STATEMENT
			if (PDO.get(P2) > (rSh200sfm.getCbbase()+rSh200sfm.getCbadd()-FBITEMS)) {
				// EVAL
				PDO.set(P2,  Float.valueOf(String.valueOf((rSh200sfm.getCbbase()+rSh200sfm.getCbadd()-FBITEMS))));
			// ENDIF
			}
			// IF STATEMENT
			if (rProextn.getPeadmia() > (rSh200sfm.getCbbase()+rSh200sfm.getCbadd()-FBITEMS)) {
				// EVAL
				PDO.set(P2,  Float.valueOf(String.valueOf(0)));
			// ENDIF
			}
			// IF STATEMENT
			if (PDO.get(P2) != 0 && PPC.get(P2) == 0) {
				//Z-ADD
				PAM.set(P2, Float.valueOf(String.valueOf(PDO.get(P2))));
				// ELSEIF STATEMENT
			} else if (PPC.get(P2) != 0 && PDO.get(P2) == 0) {
				//DIV
				WRKPC0 = PPC.get(P2) / 100;
				//MULT
				PAM.set(P2, (float) (rSh200sfm.getCbbase() * WRKPC0));
				// ELSEIF STATEMENT
			} else if (PO$.get(P2).compareTo("1") == 0) {
				// EVAL
				TBASE = Float.valueOf(String.valueOf(rSh200sfm.getCbbase() - PDO.get(P2)));
				//DIV
				WRKPC0 = PPC.get(P2) / 100;
				//MULT
				PAM.set(P2, (float) (TBASE * WRKPC0));
				//ADD
				PAM.set(P2, PAM.get(P2) + PDO.get(P2));
				// ELSEIF STATEMENT
			} else if (POP.get(P2).compareTo("1") == 0) {
				//DIV
				WRKPC0 = PPC.get(P2) / 100;
				//MULT
				PAM.set(P2, (float) (rSh200sfm.getCbbase() * WRKPC0));
				//ADD
				PAM.set(P2, PAM.get(P2) + PDO.get(P2));
			// ENDSL
			}
		// ENDIF
		}
	//ENDDO
	}
	//Z-ADD
	rSh200sfm.setHbanam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbadam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbitam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	P2 = (int) Integer.valueOf(String.valueOf(0));
	//DO
	for (P2 = 1; P2 < P1; P2++) {
		// IF STATEMENT
		if (PMS.get(P2).compareTo("Y") == 0) {
			// IF STATEMENT
			if (PIT.get(P2).compareTo("ANSC    ") == 0) {
				//Z-ADD
				rSh200sfm.setHbanam(Float.valueOf(String.valueOf(PAM.get(P2))));
			// ELSE
			} else {
				// IF STATEMENT
				if (PIT.get(P2).compareTo("ADSC    ") == 0) {
					//Z-ADD
					rSh200sfm.setHbadam(Float.valueOf(String.valueOf(PAM.get(P2))));
				// ELSE
				} else {
					// IF STATEMENT
					if (PIT.get(P2).compareTo("ITEM    ") == 0) {
						// EVAL
						PAM.set(P2,  Float.valueOf(String.valueOf($PDTTL2)));
						//ADD
						rSh200sfm.setHbitam(rSh200sfm.getHbitam() + PAM.get(P2));
					// ELSE
					} else {
						//ADD
						rSh200sfm.setHbitam(rSh200sfm.getHbitam() + PAM.get(P2));
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	}
	// IF STATEMENT
	if (IN98 == true) {
		//Z-ADD
		$AMOUNT = Float.valueOf(String.valueOf(0));
	// ELSE
	} else {
		//Z-ADD
		$AMOUNT = Float.valueOf(String.valueOf(rSh200sfm.getCbadam()));
		//MULT
		$AMOUNT = (float) ($AMOUNT * -1);
	// ENDIF
	}
	//MULT
	rSh200sfm.setCbadam((float) (rSh200sfm.getHbadam() * -1));
	//SUB
	rSh200sfm.setCbadam(rSh200sfm.getCbadam() - $AMOUNT);
	//ADD
	rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() + rSh200sfm.getCbadam());
	// IF STATEMENT
	if (rSh200sfm.getCbadam() != 0 && IN98 == false) {
		//SUB
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() - USAA_ADSC);
	// ENDIF
	}
	// IF STATEMENT
	if ($POFFERDIS || $POFFER) {
		// IF STATEMENT
		if (rPartofl.getPaddp().compareTo("%") == 0) {
			// EVAL
			rSh200sfm.setCbadam( Float.valueOf(String.valueOf(rSh200sfm.getCbadam() - (rSh200sfm.getCbb$ad() * rPartofl.getPadsc())/100)));
			// EVAL
			rSh200sfm.setHbadam( Float.valueOf(String.valueOf(rSh200sfm.getHbadam() + (rSh200sfm.getCbb$ad() * rPartofl.getPadsc())/100)));
			// EVAL
			rSh200sfm.setCbb$ad( Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad() * (100 - rPartofl.getPadsc())/100)));
			// ELSEIF STATEMENT
		} else if (rPartofl.getPaddp().compareTo("$") == 0) {
		// ELSE
		} else {
			// IF STATEMENT
			if (rSh200sfm.getCbb$ad() >= rPartofl.getPadsc()) {
				// EVAL
				rSh200sfm.setCbadam( Float.valueOf(String.valueOf(rSh200sfm.getCbadam()-rPartofl.getPadsc())));
				// EVAL
				rSh200sfm.setCbb$ad( Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()-rPartofl.getPadsc())));
				// EVAL
				rSh200sfm.setHbadam( Float.valueOf(String.valueOf(rSh200sfm.getHbadam()+rPartofl.getPadsc())));
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setCbadam( Float.valueOf(String.valueOf(rSh200sfm.getCbadam()-rSh200sfm.getCbb$ad())));
				// EVAL
				rSh200sfm.setHbadam( Float.valueOf(String.valueOf(rSh200sfm.getHbadam()+rSh200sfm.getCbb$ad())));
				// EVAL
				rSh200sfm.setCbb$ad( Float.valueOf(String.valueOf(0)));
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	//Z-ADD
	rSh200sfm.setCbadd2(Float.valueOf(String.valueOf(rSh200sfm.getCbadd())));
	//Z-SUB
	rSh200sfm.setCbanam(0 - rSh200sfm.getHbanam());
	// EVAL
	rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam())));
	// IF STATEMENT
	if ($POFFERDIS || $POFFER) {
		// IF STATEMENT
		if (rPartofl.getPandp().compareTo("%") == 0) {
			// EVAL
			rSh200sfm.setCbanam( Float.valueOf(String.valueOf(rSh200sfm.getCbanam() - (rSh200sfm.getCbmfwt() * rPartofl.getPansc())/100)));
			// EVAL
			rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt() * (100 - rPartofl.getPansc())/100)));
			// ELSEIF STATEMENT
		} else if (rPartofl.getPandp().compareTo("$") == 0) {
		// ELSE
		} else {
			// IF STATEMENT
			if (rSh200sfm.getCbmfwt() >= rPartofl.getPansc()) {
				// EVAL
				rSh200sfm.setCbanam( Float.valueOf(String.valueOf(rSh200sfm.getCbanam()-rPartofl.getPansc())));
				// EVAL
				rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()-rPartofl.getPansc())));
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setCbanam( Float.valueOf(String.valueOf(rSh200sfm.getCbanam()-rSh200sfm.getCbmfwt())));
				// EVAL
				rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(0)));
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	rSh200sfm.setCbmmfw( Float.valueOf(String.valueOf(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir() + rSh200sfm.getCbmwrf() + rSh200sfm.getCbanmm())));
	// EVAL
	rSh200sfm.setHbanam( Float.valueOf(String.valueOf(-1*rSh200sfm.getCbanam())));
	//DIV
	rSh200sfm.setCbanmm(rSh200sfm.getCbanam() / 12);
	// IF STATEMENT
	if (! rAdtitmoFOUND && rSh200sfm.getCbwarc().compareTo("Y") == 0) {
		//EXSR
		GETQSP();
	// ENDIF
	}
	//EXSR
	APRCOR();
	// IF STATEMENT
	if (rSh200sfm.getSzerrm().compareTo(ERR.get(33)) == 0 && IN98 == false) {
		// EVAL
	// ENDIF
	}
	// IF STATEMENT
	if (IN98 == false) {
		//EXSR
		USAADISCN();
		//EXSR
		CHECKCI();
	// ENDIF
	}
	// IF STATEMENT
	if (rProintro.getPmintf().compareTo("Y") == 0 && INKH != Boolean.valueOf("1")) {
		// IF STATEMENT
		if ($FIRST.compareTo("Y") == 0) {
			// EVAL
			$FIRST = String.valueOf("N");
		// ENDIF
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void $LOADD () {
	// MOVE
	$MANSL = String.valueOf("N");
	// MOVEA
	IN74 = true;
	// MOVEA
	IN75 = false;
	// MOVEA
	IN76 = false;
	// MOVE
	in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
	// MOVE
	in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
	// MOVE
	rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
	//EXSR
	CALCCB();
	// IF STATEMENT
	if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
	// ELSE
	} else {
	// ENDIF
	}
	// MOVE
	IN75 = true ;
	//Z-ADD
	RRNB = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	TOTSFB = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	ANQ.clear();
	//Z-ADD
	$GRPINS = (int) Integer.valueOf(String.valueOf(0));
	// EVAL
	$GROUPS = String.valueOf(" ");
	// EVAL
	rSh200sfm.setHbprom( String.valueOf(""));
	// MOVE
	rSh200sfm.setHbdsal(String.valueOf(" "));
	//Z-ADD
	rSh200sfm.setHbdsam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbdspc(Float.valueOf(String.valueOf(0)));
	// MOVE
	rSh200sfm.setHbanal(String.valueOf(" "));
	//Z-ADD
	rSh200sfm.setHbands(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbanpc(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbaxds(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbaxsl((int) Integer.valueOf(String.valueOf(0)));
	// MOVE
	rSh200sfm.setHbital(String.valueOf(" "));
	//Z-ADD
	rSh200sfm.setHbitms((int) Integer.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbadam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbanam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbitam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	HBITAMT = Float.valueOf(String.valueOf(0));
	//Z-ADD
	HBITAMT = Float.valueOf(String.valueOf(0));
	//Z-ADD
	HBITPC = Float.valueOf(String.valueOf(0));
	//Z-ADD
	rSh200sfm.setCbadam(Float.valueOf(String.valueOf(0)));
	// MOVE
	FRCANA = String.valueOf("N");
	// MOVE
	FRCDSA = String.valueOf("N");
	// MOVE
	SAMEPR = String.valueOf("N");
	// MOVE
	YTERR = String.valueOf(rSh200sfm.getCaterr());
	// CHAIN SETLL
	try {
		promst.getTransaction().begin();
		qPromst = promst.createQuery(proky3KL("Promst"), Promst.class);
		rPromstList = qPromst.getResultList();
		if (rPromstList.size() >= 1) {
			rPromst = new Promst();
			rPromstFOUND = true;
			rPromstEOF = false;
		} else {
			rPromstFOUND = false;
			rPromstEOF = true;
		}
		rPromstPOS = -1;
		promst.getTransaction().commit();
	} catch (Exception e) {
		promst.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rPromstFOUND = false;
	rPromstEOF = true;
	while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
		rPromst = rPromstList.get(++rPromstPOS);
		if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rQuhdr.getQuprom()))) {
			rPromstFOUND = true;
			rPromstEOF = false;
		} else {
			rPromstFOUND = false;
			rPromstEOF = true;
		}

	}
	// CHAIN SETLL
	try {
		proext.getTransaction().begin();
		qProext = proext.createQuery(proky3KL("Proext"), Proext.class);
		rProextList = qProext.getResultList();
		if (rProextList.size() >= 1) {
			rProext = new Proext();
			rProextFOUND = true;
			rProextEOF = false;
		} else {
			rProextFOUND = false;
			rProextEOF = true;
		}
		rProextPOS = -1;
		proext.getTransaction().commit();
	} catch (Exception e) {
		proext.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rProextFOUND = false;
	rProextEOF = true;
	while (rProextPOS < rProextList.size() || rProextFOUND) {
		rProext = rProextList.get(++rProextPOS);
		if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(rQuhdr.getQuprom()))) {
			rProextFOUND = true;
			rProextEOF = false;
		} else {
			rProextFOUND = false;
			rProextEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == true) {
		// MOVE
		YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
		// CHAIN SETLL
		try {
			promst.getTransaction().begin();
			qPromst = promst.createQuery(proky3KL("Promst"), Promst.class);
			rPromstList = qPromst.getResultList();
			if (rPromstList.size() >= 1) {
				rPromst = new Promst();
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}
			rPromstPOS = -1;
			promst.getTransaction().commit();
		} catch (Exception e) {
			promst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPromstFOUND = false;
		rPromstEOF = true;
		while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
			rPromst = rPromstList.get(++rPromstPOS);
				if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rQuhdr.getQuprom()))) {
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}

		}
		// CHAIN SETLL
		try {
			proext.getTransaction().begin();
			qProext = proext.createQuery(proky3KL("Proext"), Proext.class);
			rProextList = qProext.getResultList();
			if (rProextList.size() >= 1) {
				rProext = new Proext();
				rProextFOUND = true;
				rProextEOF = false;
			} else {
				rProextFOUND = false;
				rProextEOF = true;
			}
			rProextPOS = -1;
			proext.getTransaction().commit();
		} catch (Exception e) {
			proext.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rProextFOUND = false;
		rProextEOF = true;
		while (rProextPOS < rProextList.size() || rProextFOUND) {
			rProext = rProextList.get(++rProextPOS);
				if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(rQuhdr.getQuprom()))) {
				rProextFOUND = true;
				rProextEOF = false;
			} else {
				rProextFOUND = false;
				rProextEOF = true;
			}

		}
	// ENDIF
	}
	// IF STATEMENT
	if (rProextFOUND) {
		// EVAL
		HBITAMT = Float.valueOf(String.valueOf(rProext.getPmesam()));
		// EVAL
		HBITPC = Float.valueOf(String.valueOf(rProext.getPmespc()));
		// EVAL
		HBITQTY = Integer.valueOf(String.valueOf(rProext.getPmeqty()));
		// EVAL
		HBITMX$ = Float.valueOf(String.valueOf(rProext.getPmemx$()));
		// EVAL
		HBITMXP = Float.valueOf(String.valueOf(rProext.getPmempc()));
		// EVAL
		$ADAM = Float.valueOf(String.valueOf(0));
		// IF STATEMENT
		if (rProextn.getPeadmia() > 0 && (rQuhdr.getQubase()+rQuhdr.getQuadd()) < rProextn.getPeadmia()) {
			// EVAL
			$ADAM = Float.valueOf(String.valueOf(rPromstlb.getPmdsam()));
		// ENDIF
		}
	// ENDIF
	}
	// CHAIN SETLL
	try {
		prointro.getTransaction().begin();
		qProintro = prointro.createQuery(proky3KL("Prointro"), Prointro.class);
		rProintroList = qProintro.getResultList();
		if (rProintroList.size() >= 1) {
			rProintro = new Prointro();
			rProintroFOUND = true;
			rProintroEOF = false;
		} else {
			rProintroFOUND = false;
			rProintroEOF = true;
		}
		rProintroPOS = -1;
		prointro.getTransaction().commit();
	} catch (Exception e) {
		prointro.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rProintroFOUND = false;
	rProintroEOF = true;
	while (rProintroPOS < rProintroList.size() || rProintroFOUND) {
		rProintro = rProintroList.get(++rProintroPOS);
		if (Objects.equals(String.valueOf(rProintro.getPmtown()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProintro.getPmprcd()), String.valueOf(rQuhdr.getQuprom()))) {
			rProintroFOUND = true;
			rProintroEOF = false;
		} else {
			rProintroFOUND = false;
			rProintroEOF = true;
		}

	}
	// EVAL
	// IF STATEMENT
	if (rPromstlb.getPmmpal().compareTo("L") == 0) {
		// CHAIN SETLL
		try {
			propkg.getTransaction().begin();
			qPropkg = propkg.createQuery(propkgkeyKL("Propkg"), Propkg.class);
			rPropkgList = qPropkg.getResultList();
			if (rPropkgList.size() >= 1) {
				rPropkg = new Propkg();
				rPropkgFOUND = true;
				rPropkgEOF = false;
			} else {
				rPropkgFOUND = false;
				rPropkgEOF = true;
			}
			rPropkgPOS = -1;
			propkg.getTransaction().commit();
		} catch (Exception e) {
			propkg.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPropkgFOUND = false;
		rPropkgEOF = true;
		while (rPropkgPOS < rPropkgList.size() || rPropkgFOUND) {
			rPropkg = rPropkgList.get(++rPropkgPOS);
				if (Objects.equals(String.valueOf(rPropkg.getPxterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPropkg.getPxcode()), String.valueOf(rPromstlb.getPmcode())) && Objects.equals(String.valueOf(rPropkg.getPxpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPropkgFOUND = true;
				rPropkgEOF = false;
			} else {
				rPropkgFOUND = false;
				rPropkgEOF = true;
			}

		}
		// IF STATEMENT
		if (rPropkgFOUND) {
			// EVAL
			// MOVE
			YTERR = String.valueOf(rSh200sfm.getCaterr());
			// CHAIN SETLL
			try {
				proext.getTransaction().begin();
				qProext = proext.createQuery(proky6KL("Proext"), Proext.class);
				rProextList = qProext.getResultList();
				if (rProextList.size() >= 1) {
					rProext = new Proext();
					rProextFOUND = true;
					rProextEOF = false;
				} else {
					rProextFOUND = false;
					rProextEOF = true;
				}
				rProextPOS = -1;
				proext.getTransaction().commit();
			} catch (Exception e) {
				proext.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProextFOUND = false;
			rProextEOF = true;
			while (rProextPOS < rProextList.size() || rProextFOUND) {
				rProext = rProextList.get(++rProextPOS);
						if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(rPromstlb.getPmcode()))) {
					rProextFOUND = true;
					rProextEOF = false;
				} else {
					rProextFOUND = false;
					rProextEOF = true;
				}

			}
			// CHAIN SETLL
			try {
				promst.getTransaction().begin();
				qPromst = promst.createQuery(proky6KL("Promst"), Promst.class);
				rPromstList = qPromst.getResultList();
				if (rPromstList.size() >= 1) {
					rPromst = new Promst();
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}
				rPromstPOS = -1;
				promst.getTransaction().commit();
			} catch (Exception e) {
				promst.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPromstFOUND = false;
			rPromstEOF = true;
			while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
				rPromst = rPromstList.get(++rPromstPOS);
						if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rPromstlb.getPmcode()))) {
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}

			}
			// IF STATEMENT
			if (! rPromstFOUND) {
				// MOVE
				YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
				// CHAIN SETLL
				try {
					promst.getTransaction().begin();
					qPromst = promst.createQuery(proky6KL("Promst"), Promst.class);
					rPromstList = qPromst.getResultList();
					if (rPromstList.size() >= 1) {
						rPromst = new Promst();
						rPromstFOUND = true;
						rPromstEOF = false;
					} else {
						rPromstFOUND = false;
						rPromstEOF = true;
					}
					rPromstPOS = -1;
					promst.getTransaction().commit();
				} catch (Exception e) {
					promst.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rPromstFOUND = false;
				rPromstEOF = true;
				while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
					rPromst = rPromstList.get(++rPromstPOS);
								if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rPromstlb.getPmcode()))) {
						rPromstFOUND = true;
						rPromstEOF = false;
					} else {
						rPromstFOUND = false;
						rPromstEOF = true;
					}

				}
				// CHAIN SETLL
				try {
					proext.getTransaction().begin();
					qProext = proext.createQuery(proky6KL("Proext"), Proext.class);
					rProextList = qProext.getResultList();
					if (rProextList.size() >= 1) {
						rProext = new Proext();
						rProextFOUND = true;
						rProextEOF = false;
					} else {
						rProextFOUND = false;
						rProextEOF = true;
					}
					rProextPOS = -1;
					proext.getTransaction().commit();
				} catch (Exception e) {
					proext.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rProextFOUND = false;
				rProextEOF = true;
				while (rProextPOS < rProextList.size() || rProextFOUND) {
					rProext = rProextList.get(++rProextPOS);
								if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(rPromstlb.getPmcode()))) {
						rProextFOUND = true;
						rProextEOF = false;
					} else {
						rProextFOUND = false;
						rProextEOF = true;
					}

				}
			// ENDIF
			}
			// CHAIN SETLL
			try {
				prointro.getTransaction().begin();
				qProintro = prointro.createQuery(proky6KL("Prointro"), Prointro.class);
				rProintroList = qProintro.getResultList();
				if (rProintroList.size() >= 1) {
					rProintro = new Prointro();
					rProintroFOUND = true;
					rProintroEOF = false;
				} else {
					rProintroFOUND = false;
					rProintroEOF = true;
				}
				rProintroPOS = -1;
				prointro.getTransaction().commit();
			} catch (Exception e) {
				prointro.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProintroFOUND = false;
			rProintroEOF = true;
			while (rProintroPOS < rProintroList.size() || rProintroFOUND) {
				rProintro = rProintroList.get(++rProintroPOS);
						if (Objects.equals(String.valueOf(rProintro.getPmtown()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProintro.getPmprcd()), String.valueOf(rPromstlb.getPmcode()))) {
					rProintroFOUND = true;
					rProintroEOF = false;
				} else {
					rProintroFOUND = false;
					rProintroEOF = true;
				}

			}
			// IF STATEMENT
			if (PKGINLIST) {
				// EVAL
				rQuhdr.setQuprom( String.valueOf(rPromstlb.getPmcode()));
				// EVAL
				rSh200sfm.setHbprom( String.valueOf(rPromstlb.getPmcode()));
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	// IF STATEMENT
	if (rPromstlb.getPmcamp().compareTo(ldadsDS.lcamp()) != 0) {
		// CHAIN SETLL
		try {
			procamp.getTransaction().begin();
			qProcamp = procamp.createQuery(procmpkeyKL("Procamp"), Procamp.class);
			rProcampList = qProcamp.getResultList();
			if (rProcampList.size() >= 1) {
				rProcamp = new Procamp();
				rProcampFOUND = true;
				rProcampEOF = false;
			} else {
				rProcampFOUND = false;
				rProcampEOF = true;
			}
			rProcampPOS = -1;
			procamp.getTransaction().commit();
		} catch (Exception e) {
			procamp.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rProcampFOUND = false;
		rProcampEOF = true;
		while (rProcampPOS < rProcampList.size() || rProcampFOUND) {
			rProcamp = rProcampList.get(++rProcampPOS);
				if (Objects.equals(String.valueOf(rProcamp.getPcterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProcamp.getPccode()), String.valueOf(rPromstlb.getPmcode())) && Objects.equals(String.valueOf(rProcamp.getPccamp()), String.valueOf(ldadsDS.lcamp()))) {
				rProcampFOUND = true;
				rProcampEOF = false;
			} else {
				rProcampFOUND = false;
				rProcampEOF = true;
			}

		}
		// IF STATEMENT
		if (! rProcampFOUND) {
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if ((IN79 == false  && rPromstlb.getPmpakg().compareTo(rSh200sfm.getCbpkg()) == 0 || IN79 == false  && rPromstlb.getPmmpal().compareTo("Y") == 0 || rPromstlb.getPmmpal().compareTo("L") == 0 && PKGINLIST) && CMPINLIST) {
		// MOVE
		SAMEPR = String.valueOf("Y");
		// MOVE
		rSh200sfm.setHbprom(String.valueOf(rQuhdr.getQuprom()));
		// MOVE
		rSh200sfm.setHbdsal(String.valueOf(rQuhdr.getQudsal()));
		//Z-ADD
		rSh200sfm.setHbdsam(Float.valueOf(String.valueOf(rQuhdr.getQudsam())));
		//Z-ADD
		rSh200sfm.setHbdspc(Float.valueOf(String.valueOf(rQuhdr.getQudspc())));
		// IF STATEMENT
		if (rQuhdr.getQudsam() != 0 && rQuhdr.getQudspc() != 0) {
			// MOVE
			YTERR = String.valueOf(rSh200sfm.getCaterr());
			// CHAIN SETLL
			try {
				promst.getTransaction().begin();
				qPromst = promst.createQuery(proky2KL("Promst"), Promst.class);
				rPromstList = qPromst.getResultList();
				if (rPromstList.size() >= 1) {
					rPromst = new Promst();
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}
				rPromstPOS = -1;
				promst.getTransaction().commit();
			} catch (Exception e) {
				promst.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPromstFOUND = false;
			rPromstEOF = true;
			while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
				rPromst = rPromstList.get(++rPromstPOS);
						if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(S0PROM))) {
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}

			}
			// EVAL
			rSh200sfm.setHbdor$( String.valueOf(rPromstlb.getPmdor$()));
			// EVAL
			rSh200sfm.setHbdorp( String.valueOf(rPromstlb.getPmdorp()));
		// ENDIF
		}
		// EVAL
		$$PROM = String.valueOf(rPromstlb.getPmcode());
		//EXSR
		ASLPVAL();
		// IF STATEMENT
		if (AADIS.compareTo("Y") == 0) {
			// MOVE
			rSh200sfm.setHbanal(String.valueOf(rQuhdr.getQuanal()));
			//Z-ADD
			rSh200sfm.setHbands(Float.valueOf(String.valueOf(rQuhdr.getQuands())));
			//Z-ADD
			rSh200sfm.setHbanpc(Float.valueOf(String.valueOf(rQuhdr.getQuanpc())));
			//Z-ADD
			rSh200sfm.setHbaxds(Float.valueOf(String.valueOf(rQuhdr.getQuaxds())));
			//Z-ADD
			rSh200sfm.setHbaxsl((int) Integer.valueOf(String.valueOf(rQuhdr.getQuaxsl())));
			// MOVE
			rSh200sfm.setHbital(String.valueOf(rQuhdr.getQuital()));
			//Z-ADD
			rSh200sfm.setHbitms((int) Integer.valueOf(String.valueOf(rQuhdr.getQuitms())));
			//Z-ADD
			rSh200sfm.setHbadam(Float.valueOf(String.valueOf(rQuhdr.getQuadam())));
			//Z-ADD
			rSh200sfm.setHbanam(Float.valueOf(String.valueOf(rQuhdr.getQuanam())));
			//Z-ADD
			rSh200sfm.setHbitam(Float.valueOf(String.valueOf(rQuhdr.getQuitam())));
			// EVAL
			HBITAMT = Float.valueOf(String.valueOf(rQuhdre.getQuitamt()));
			// EVAL
			HBITPC = Float.valueOf(String.valueOf(rQuhdre.getQuitpc()));
			// EVAL
			HBITQTY = Integer.valueOf(String.valueOf(rQuhdre.getQuitqty()));
		// ENDIF
		}
	// ELSE
	} else {
		// MOVE
		YTERR = String.valueOf(rSh200sfm.getCaterr());
		// CHAIN SETLL
		try {
			promst.getTransaction().begin();
			qPromst = promst.createQuery(proky2KL("Promst"), Promst.class);
			rPromstList = qPromst.getResultList();
			if (rPromstList.size() >= 1) {
				rPromst = new Promst();
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}
			rPromstPOS = -1;
			promst.getTransaction().commit();
		} catch (Exception e) {
			promst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPromstFOUND = false;
		rPromstEOF = true;
		while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
			rPromst = rPromstList.get(++rPromstPOS);
				if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(S0PROM))) {
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}

		}
		// CHAIN SETLL
		try {
			proext.getTransaction().begin();
			qProext = proext.createQuery(proky2KL("Proext"), Proext.class);
			rProextList = qProext.getResultList();
			if (rProextList.size() >= 1) {
				rProext = new Proext();
				rProextFOUND = true;
				rProextEOF = false;
			} else {
				rProextFOUND = false;
				rProextEOF = true;
			}
			rProextPOS = -1;
			proext.getTransaction().commit();
		} catch (Exception e) {
			proext.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rProextFOUND = false;
		rProextEOF = true;
		while (rProextPOS < rProextList.size() || rProextFOUND) {
			rProext = rProextList.get(++rProextPOS);
				if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(S0PROM))) {
				rProextFOUND = true;
				rProextEOF = false;
			} else {
				rProextFOUND = false;
				rProextEOF = true;
			}

		}
		// IF STATEMENT
		if (IN78 == true) {
			// MOVE
			YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
			// CHAIN SETLL
			try {
				promst.getTransaction().begin();
				qPromst = promst.createQuery(proky2KL("Promst"), Promst.class);
				rPromstList = qPromst.getResultList();
				if (rPromstList.size() >= 1) {
					rPromst = new Promst();
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}
				rPromstPOS = -1;
				promst.getTransaction().commit();
			} catch (Exception e) {
				promst.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPromstFOUND = false;
			rPromstEOF = true;
			while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
				rPromst = rPromstList.get(++rPromstPOS);
						if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(S0PROM))) {
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}

			}
			// CHAIN SETLL
			try {
				proext.getTransaction().begin();
				qProext = proext.createQuery(proky2KL("Proext"), Proext.class);
				rProextList = qProext.getResultList();
				if (rProextList.size() >= 1) {
					rProext = new Proext();
					rProextFOUND = true;
					rProextEOF = false;
				} else {
					rProextFOUND = false;
					rProextEOF = true;
				}
				rProextPOS = -1;
				proext.getTransaction().commit();
			} catch (Exception e) {
				proext.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProextFOUND = false;
			rProextEOF = true;
			while (rProextPOS < rProextList.size() || rProextFOUND) {
				rProext = rProextList.get(++rProextPOS);
						if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(S0PROM))) {
					rProextFOUND = true;
					rProextEOF = false;
				} else {
					rProextFOUND = false;
					rProextEOF = true;
				}

			}
		// ENDIF
		}
		// CHAIN SETLL
		try {
			prointro.getTransaction().begin();
			qProintro = prointro.createQuery(proky6KL("Prointro"), Prointro.class);
			rProintroList = qProintro.getResultList();
			if (rProintroList.size() >= 1) {
				rProintro = new Prointro();
				rProintroFOUND = true;
				rProintroEOF = false;
			} else {
				rProintroFOUND = false;
				rProintroEOF = true;
			}
			rProintroPOS = -1;
			prointro.getTransaction().commit();
		} catch (Exception e) {
			prointro.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rProintroFOUND = false;
		rProintroEOF = true;
		while (rProintroPOS < rProintroList.size() || rProintroFOUND) {
			rProintro = rProintroList.get(++rProintroPOS);
				if (Objects.equals(String.valueOf(rProintro.getPmtown()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProintro.getPmprcd()), String.valueOf(rPromstlb.getPmcode()))) {
				rProintroFOUND = true;
				rProintroEOF = false;
			} else {
				rProintroFOUND = false;
				rProintroEOF = true;
			}

		}
		// EVAL
		$QPROM = String.valueOf(rPromstlb.getPmcode());
		//EXSR
		AQSRCVAL();
		// IF STATEMENT
		if (AQSRC.compareTo("Y") == 0) {
			// IF STATEMENT
			if (rProextFOUND) {
				// EVAL
				HBITAMT = Float.valueOf(String.valueOf(rProext.getPmesam()));
				// EVAL
				HBITPC = Float.valueOf(String.valueOf(rProext.getPmespc()));
				// EVAL
				HBITQTY = Integer.valueOf(String.valueOf(rProext.getPmeqty()));
				// EVAL
				HBITMX$ = Float.valueOf(String.valueOf(rProext.getPmemx$()));
				// EVAL
				HBITMXP = Float.valueOf(String.valueOf(rProext.getPmempc()));
			// ENDIF
			}
			// EVAL
			// IF STATEMENT
			if (rPromstlb.getPmmpal().compareTo("L") == 0) {
				// CHAIN SETLL
				try {
					propkg.getTransaction().begin();
					qPropkg = propkg.createQuery(propkgkeyKL("Propkg"), Propkg.class);
					rPropkgList = qPropkg.getResultList();
					if (rPropkgList.size() >= 1) {
						rPropkg = new Propkg();
						rPropkgFOUND = true;
						rPropkgEOF = false;
					} else {
						rPropkgFOUND = false;
						rPropkgEOF = true;
					}
					rPropkgPOS = -1;
					propkg.getTransaction().commit();
				} catch (Exception e) {
					propkg.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rPropkgFOUND = false;
				rPropkgEOF = true;
				while (rPropkgPOS < rPropkgList.size() || rPropkgFOUND) {
					rPropkg = rPropkgList.get(++rPropkgPOS);
								if (Objects.equals(String.valueOf(rPropkg.getPxterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPropkg.getPxcode()), String.valueOf(rPromstlb.getPmcode())) && Objects.equals(String.valueOf(rPropkg.getPxpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
						rPropkgFOUND = true;
						rPropkgEOF = false;
					} else {
						rPropkgFOUND = false;
						rPropkgEOF = true;
					}

				}
				// IF STATEMENT
				if (rPropkgFOUND) {
					// EVAL
				// ENDIF
				}
				// IF STATEMENT
				if (IN78) {
					// MOVE
					YTERR = String.valueOf(rSh200sfm.getCaterr());
					// CHAIN SETLL
					try {
						promst.getTransaction().begin();
						qPromst = promst.createQuery(proky6KL("Promst"), Promst.class);
						rPromstList = qPromst.getResultList();
						if (rPromstList.size() >= 1) {
							rPromst = new Promst();
							rPromstFOUND = true;
							rPromstEOF = false;
						} else {
							rPromstFOUND = false;
							rPromstEOF = true;
						}
						rPromstPOS = -1;
						promst.getTransaction().commit();
					} catch (Exception e) {
						promst.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rPromstFOUND = false;
					rPromstEOF = true;
					while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
						rPromst = rPromstList.get(++rPromstPOS);
										if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rPromstlb.getPmcode()))) {
							rPromstFOUND = true;
							rPromstEOF = false;
						} else {
							rPromstFOUND = false;
							rPromstEOF = true;
						}

					}
					// CHAIN SETLL
					try {
						proext.getTransaction().begin();
						qProext = proext.createQuery(proky6KL("Proext"), Proext.class);
						rProextList = qProext.getResultList();
						if (rProextList.size() >= 1) {
							rProext = new Proext();
							rProextFOUND = true;
							rProextEOF = false;
						} else {
							rProextFOUND = false;
							rProextEOF = true;
						}
						rProextPOS = -1;
						proext.getTransaction().commit();
					} catch (Exception e) {
						proext.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rProextFOUND = false;
					rProextEOF = true;
					while (rProextPOS < rProextList.size() || rProextFOUND) {
						rProext = rProextList.get(++rProextPOS);
										if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(rPromstlb.getPmcode()))) {
							rProextFOUND = true;
							rProextEOF = false;
						} else {
							rProextFOUND = false;
							rProextEOF = true;
						}

					}
					// IF STATEMENT
					if (IN78 == true) {
						// MOVE
						YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
						// CHAIN SETLL
						try {
							promst.getTransaction().begin();
							qPromst = promst.createQuery(proky6KL("Promst"), Promst.class);
							rPromstList = qPromst.getResultList();
							if (rPromstList.size() >= 1) {
								rPromst = new Promst();
								rPromstFOUND = true;
								rPromstEOF = false;
							} else {
								rPromstFOUND = false;
								rPromstEOF = true;
							}
							rPromstPOS = -1;
							promst.getTransaction().commit();
						} catch (Exception e) {
							promst.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rPromstFOUND = false;
						rPromstEOF = true;
						while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
							rPromst = rPromstList.get(++rPromstPOS);
												if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rPromstlb.getPmcode()))) {
								rPromstFOUND = true;
								rPromstEOF = false;
							} else {
								rPromstFOUND = false;
								rPromstEOF = true;
							}

						}
						// CHAIN SETLL
						try {
							proext.getTransaction().begin();
							qProext = proext.createQuery(proky6KL("Proext"), Proext.class);
							rProextList = qProext.getResultList();
							if (rProextList.size() >= 1) {
								rProext = new Proext();
								rProextFOUND = true;
								rProextEOF = false;
							} else {
								rProextFOUND = false;
								rProextEOF = true;
							}
							rProextPOS = -1;
							proext.getTransaction().commit();
						} catch (Exception e) {
							proext.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rProextFOUND = false;
						rProextEOF = true;
						while (rProextPOS < rProextList.size() || rProextFOUND) {
							rProext = rProextList.get(++rProextPOS);
												if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(rPromstlb.getPmcode()))) {
								rProextFOUND = true;
								rProextEOF = false;
							} else {
								rProextFOUND = false;
								rProextEOF = true;
							}

						}
					// ENDIF
					}
					// CHAIN SETLL
					try {
						prointro.getTransaction().begin();
						qProintro = prointro.createQuery(proky6KL("Prointro"), Prointro.class);
						rProintroList = qProintro.getResultList();
						if (rProintroList.size() >= 1) {
							rProintro = new Prointro();
							rProintroFOUND = true;
							rProintroEOF = false;
						} else {
							rProintroFOUND = false;
							rProintroEOF = true;
						}
						rProintroPOS = -1;
						prointro.getTransaction().commit();
					} catch (Exception e) {
						prointro.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rProintroFOUND = false;
					rProintroEOF = true;
					while (rProintroPOS < rProintroList.size() || rProintroFOUND) {
						rProintro = rProintroList.get(++rProintroPOS);
										if (Objects.equals(String.valueOf(rProintro.getPmtown()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProintro.getPmprcd()), String.valueOf(rPromstlb.getPmcode()))) {
							rProintroFOUND = true;
							rProintroEOF = false;
						} else {
							rProintroFOUND = false;
							rProintroEOF = true;
						}

					}
					// IF STATEMENT
					if (PKGINLIST) {
						// EVAL
						S0PROM = String.valueOf(rPromstlb.getPmcode());
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
			// EVAL
			// IF STATEMENT
			if (rPromstlb.getPmcamp().compareTo(ldadsDS.lcamp()) != 0) {
				// CHAIN SETLL
				try {
					procamp.getTransaction().begin();
					qProcamp = procamp.createQuery(procmpkeyKL("Procamp"), Procamp.class);
					rProcampList = qProcamp.getResultList();
					if (rProcampList.size() >= 1) {
						rProcamp = new Procamp();
						rProcampFOUND = true;
						rProcampEOF = false;
					} else {
						rProcampFOUND = false;
						rProcampEOF = true;
					}
					rProcampPOS = -1;
					procamp.getTransaction().commit();
				} catch (Exception e) {
					procamp.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rProcampFOUND = false;
				rProcampEOF = true;
				while (rProcampPOS < rProcampList.size() || rProcampFOUND) {
					rProcamp = rProcampList.get(++rProcampPOS);
								if (Objects.equals(String.valueOf(rProcamp.getPcterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProcamp.getPccode()), String.valueOf(rPromstlb.getPmcode())) && Objects.equals(String.valueOf(rProcamp.getPccamp()), String.valueOf(ldadsDS.lcamp()))) {
						rProcampFOUND = true;
						rProcampEOF = false;
					} else {
						rProcampFOUND = false;
						rProcampEOF = true;
					}

				}
				// IF STATEMENT
				if (! rProcampFOUND) {
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
			// IF STATEMENT
			if ((IN78 == false  && rPromstlb.getPmpakg().compareTo(rSh200sfm.getCbpkg()) == 0 || IN78 == false  && rPromstlb.getPmmpal().compareTo("Y") == 0 || IN79 == false  && rPromstlb.getPmmpal().compareTo("L") == 0 && PKGINLIST) && CMPINLIST) {
				// IF STATEMENT
				if ($$ADTA.compareTo(rPromstlb.getPmefdt()) >= 0 && $$ADTA.compareTo(rPromstlb.getPmcodt()) <= 0) {
					// EVAL
					$$PROM = String.valueOf(rPromstlb.getPmcode());
					//EXSR
					$LODDS();
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getHbprom().compareTo("") == 0) {
			// EVAL
			PROMO0 = String.valueOf("");
			// MOVE
			YTERR = String.valueOf(rSh200sfm.getCaterr());
			// IF STATEMENT
			if (ldadsDS.lqsrc().indexOf("USAA") == 0) {
				//Z-ADD
				rSh200sfm.setHbadam(Float.valueOf(String.valueOf(rQuhdr.getQuadam())));
				//Z-ADD
				rSh200sfm.setHbanam(Float.valueOf(String.valueOf(rQuhdr.getQuanam())));
			// ENDIF
			}
			// SETLL
			try {
				promstlb.getTransaction().begin();
				qPromstlb = promstlb.createQuery(proky5KL("Promstlb"), Promstlb.class);
				rPromstlbList = qPromstlb.getResultList();
				if (rPromstlbList.size() >= 1) {
					rPromstlb = new Promstlb();
					rPromstlbFOUND = true;
					rPromstlbEOF = false;
				} else {
					rPromstlbFOUND = false;
					rPromstlbEOF = true;
				}
				rPromstlbPOS = -1;
				promstlb.getTransaction().commit();
			} catch (Exception e) {
				promstlb.getTransaction().rollback();
			e.printStackTrace();
			}
			finally{
				emf.close();
			}
			//DOU
			do {
				// READE
				rPromstlbFOUND = false;
				rPromstlbEOF = true;
				while (rPromstlbPOS < rPromstlbList.size() || rPromstlbFOUND) {
					rPromstlb = rPromstlbList.get(++rPromstlbPOS);
									if (Objects.equals(String.valueOf(rPromstlb.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromstlb.getPmpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
						rPromstlbFOUND = true;
						rPromstlbEOF = false;
					} else {
						rPromstlbFOUND = false;
						rPromstlbEOF = true;
					}

				}
				// IF STATEMENT
				if (IN78 == false) {
					// EVAL
					$QPROM = String.valueOf(rPromstlb.getPmcode());
					//EXSR
					AQSRCVAL();
					// IF STATEMENT
					if (AQSRC.compareTo("Y") == 0) {
						// IF STATEMENT
						if ($$ADTA.compareTo(rPromstlb.getPmefdt()) >= 0 && $$ADTA.compareTo(rPromstlb.getPmcodt()) <= 0) {
							// EVAL
							$$PROM = String.valueOf(rSh200sfm.getHbprom());
							//EXSR
							$LODDS();
							// MOVE
							IN78 = true ;
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			//ENDDO
			} while (IN78 == true);
			// IF STATEMENT
			if (rSh200sfm.getHbprom().compareTo("") == 0) {
				// IF STATEMENT
				if (YTERR != YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9")) {
					// MOVE
					YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbadam() == 0 && $ADAM > 0) {
		// EVAL
		rSh200sfm.setHbadam( Float.valueOf(String.valueOf($ADAM)));
		// EVAL
		rSh200sfm.setHbdsam( Float.valueOf(String.valueOf($ADAM)));
		// SETLL
		try {
			qudtl.getTransaction().begin();
			qQudtl = qudtl.createQuery(quhky5KL("Qudtl"), Qudtl.class);
			rQudtlList = qQudtl.getResultList();
			if (rQudtlList.size() >= 1) {
				rQudtl = new Qudtl();
				rQudtlFOUND = true;
				rQudtlEOF = false;
			} else {
				rQudtlFOUND = false;
				rQudtlEOF = true;
			}
			rQudtlPOS = -1;
			qudtl.getTransaction().commit();
		} catch (Exception e) {
			qudtl.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// READE
		rQudtlFOUND = false;
		rQudtlEOF = true;
		while (rQudtlPOS < rQudtlList.size() || rQudtlFOUND) {
			rQudtl = rQudtlList.get(++rQudtlPOS);
					if (Objects.equals(String.valueOf(rQudtl.getQdent()), String.valueOf(rQuhdr.getQuent())) && Objects.equals(String.valueOf(rQudtl.getQdacct()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQudtl.getQdseq()), String.valueOf(rQuhdr.getQuseq()))) {
				rQudtlFOUND = true;
				rQudtlEOF = false;
			} else {
				rQudtlFOUND = false;
				rQudtlEOF = true;
			}

		}
		//DOW
		while (! rQudtlEOF) {
			// IF STATEMENT
			if (rQudtl.getQditam() != 0) {
				// EVAL
				rSh200sfm.setHbitam( Float.valueOf(String.valueOf(rSh200sfm.getHbitam() + rQudtl.getQditam())));
			// ENDIF
			}
			// READE
			rQudtlFOUND = false;
			rQudtlEOF = true;
			while (rQudtlPOS < rQudtlList.size() || rQudtlFOUND) {
				rQudtl = rQudtlList.get(++rQudtlPOS);
							if (Objects.equals(String.valueOf(rQudtl.getQdent()), String.valueOf(rQuhdr.getQuent())) && Objects.equals(String.valueOf(rQudtl.getQdacct()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQudtl.getQdseq()), String.valueOf(rQuhdr.getQuseq()))) {
					rQudtlFOUND = true;
					rQudtlEOF = false;
				} else {
					rQudtlFOUND = false;
					rQudtlEOF = true;
				}

			}
		//ENDDO
		}
	// ENDIF
	}
	//Z-ADD
	P1 = (int) Integer.valueOf(String.valueOf(0));
	// IF STATEMENT
	if (rSh200sfm.getHbanal().compareTo("Y") == 0) {
		//ADD
		P1 = P1 + 1;
		// MOVE
		PIT.set(P1, "ANSC    ");
		// MOVE
		PDS.set(P1, ERR.get(15));
		// MOVE
		PAD.set(P1, "");
		//Z-ADD
		PMN.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PDO.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbands())));
		//Z-ADD
		PPC.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbanpc())));
		// MOVE
		PO$.set(P1, rSh200sfm.getHbdor$());
		// MOVE
		POP.set(P1, rSh200sfm.getHbdorp());
		//Z-ADD
		PMX.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PQT.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PAM.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbanam())));
		//Z-ADD
		PSP.set(P1, Float.valueOf(String.valueOf(0)));
		// IF STATEMENT
		if (rSh200sfm.getHbanam() != 0 || FRCANA.compareTo("Y") == 0) {
			// MOVE
			PMS.set(P1, "Y");
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbdsal().compareTo("Y") == 0) {
		//ADD
		P1 = P1 + 1;
		// MOVE
		PIT.set(P1, "ADSC    ");
		// MOVE
		PDS.set(P1, ERR.get(16));
		// MOVE
		PAD.set(P1, "");
		//Z-ADD
		PMN.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PDO.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbdsam())));
		//Z-ADD
		PPC.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbdspc())));
		// MOVE
		PO$.set(P1, rSh200sfm.getHbdor$());
		// MOVE
		POP.set(P1, rSh200sfm.getHbdorp());
		//Z-ADD
		PMX.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PQT.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PAM.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbadam())));
		//Z-ADD
		PSP.set(P1, Float.valueOf(String.valueOf(0)));
		// IF STATEMENT
		if (rSh200sfm.getHbadam() != 0 || FRCDSA.compareTo("Y") == 0) {
			// MOVE
			PMS.set(P1, "Y");
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbital().compareTo("Y") == 0) {
		// IF STATEMENT
		if (HBITAMT != 0 || HBITPC != 0) {
			//ADD
			P1 = P1 + 1;
			// MOVE
			PIT.set(P1, $ITEM);
			// MOVE
			PDS.set(P1, ERR.get(25));
			// MOVE
			PAD.set(P1, "X");
			//Z-ADD
			PMN.set(P1, (int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			PDO.set(P1, Float.valueOf(String.valueOf(HBITAMT)));
			//Z-ADD
			PPC.set(P1, Float.valueOf(String.valueOf(HBITPC)));
			//Z-ADD
			PMX.set(P1, (int) Integer.valueOf(String.valueOf(HBITQTY)));
			//Z-ADD
			PQT.set(P1, (int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			PAM.set(P1, Float.valueOf(String.valueOf(0)));
			//Z-ADD
			PSP.set(P1, Float.valueOf(String.valueOf(0)));
			// MOVE
			PMS.set(P1, "Y");
		// ENDIF
		}
		// SETLL
		try {
			pritds.getTransaction().begin();
			qPritds = pritds.createQuery(proky4KL("Pritds"), Pritd.class);
			rPritdsList = qPritds.getResultList();
			if (rPritdsList.size() >= 1) {
				rPritds = new Pritd();
				rPritdsFOUND = true;
				rPritdsEOF = false;
			} else {
				rPritdsFOUND = false;
				rPritdsEOF = true;
			}
			rPritdsPOS = -1;
			pritds.getTransaction().commit();
		} catch (Exception e) {
			pritds.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		//DOU
		do {
			// READE
			rPritdsFOUND = false;
			rPritdsEOF = true;
			while (rPritdsPOS < rPritdsList.size() || rPritdsFOUND) {
				rPritds = rPritdsList.get(++rPritdsPOS);
							if (Objects.equals(String.valueOf(rPritds.getPrterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPritds.getPrcode()), String.valueOf(rSh200sfm.getHbprom()))) {
					rPritdsFOUND = true;
					rPritdsEOF = false;
				} else {
					rPritdsFOUND = false;
					rPritdsEOF = true;
				}

			}
			// IF STATEMENT
			if (IN77 == false) {
				//ADD
				P1 = P1 + 1;
				// MOVE
				PIT.set(P1, rPritds.getPritem());
				// CHAIN SETLL
				try {
					itmast.getTransaction().begin();
					qItmast = itmast.createQuery("select c from Itmast c where c.IMITEM = '"+rPritds.getPritem()+"'", Itmast.class);
					rItmastList = qItmast.getResultList();
					if (rItmastList.size() >= 1) {
						rItmast = new Itmast();
						rItmastFOUND = true;
						rItmastEOF = false;
					} else {
						rItmastFOUND = false;
						rItmastEOF = true;
					}
					rItmastPOS = -1;
					itmast.getTransaction().commit();
				} catch (Exception e) {
					itmast.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rItmastFOUND = false;
				rItmastEOF = true;
				while (rItmastPOS < rItmastList.size() || rItmastFOUND) {
					rItmast = rItmastList.get(++rItmastPOS);
								if (Objects.equals(String.valueOf(rItmast.getImitem()), String.valueOf(rPritds.getPritem()))) {
						rItmastFOUND = true;
						rItmastEOF = false;
					} else {
						rItmastFOUND = false;
						rItmastEOF = true;
					}

				}
				// IF STATEMENT
				if (IN76 == false) {
					// MOVE
					PDS.set(P1, rItmast.getImdsc1());
				// ELSE
				} else {
					// MOVE
					PDS.set(P1, ERR.get(17));
				// ENDIF
				}
				// EVAL
				PIE.set(P1,  String.valueOf(rPritds.getPriore()));
				// IF STATEMENT
				if (PIE.get(P1).compareTo("I") == 0) {
					// MOVE
					PMS.set(P1, "Y");
				// ENDIF
				}
				// EVAL
				PFB.set(P1,  String.valueOf(rPritds.getPradfb()));
				// MOVE
				PAD.set(P1, rPritds.getPraddo());
				//Z-ADD
				PMN.set(P1, (int) Integer.valueOf(String.valueOf(rPritds.getPrmqty())));
				//Z-ADD
				PDO.set(P1, Float.valueOf(String.valueOf(rPritds.getPrdsam())));
				//Z-ADD
				PPC.set(P1, Float.valueOf(String.valueOf(rPritds.getPrdspc())));
				//Z-ADD
				PMX.set(P1, (int) Integer.valueOf(String.valueOf(rPritds.getPrxqty())));
				//Z-ADD
				PQT.set(P1, (int) Integer.valueOf(String.valueOf(0)));
				//Z-ADD
				PAM.set(P1, Float.valueOf(String.valueOf(rPritds.getPrdsam())));
				//Z-ADD
				PSP.set(P1, Float.valueOf(String.valueOf(0)));
				// MOVE
				PMS.set(P1, " ");
				// IF STATEMENT
				if (PIE.get(P1).compareTo("I") == 0) {
					// MOVE
					WSL.set(P1, "Y");
				// ENDIF
				}
				// CHAIN SETLL
				try {
					pritdse.getTransaction().begin();
					qPritdse = pritdse.createQuery(itgrkyKL("Pritdse"), Pritdse.class);
					rPritdseList = qPritdse.getResultList();
					if (rPritdseList.size() >= 1) {
						rPritdse = new Pritdse();
						rPritdseFOUND = true;
						rPritdseEOF = false;
					} else {
						rPritdseFOUND = false;
						rPritdseEOF = true;
					}
					rPritdsePOS = -1;
					pritdse.getTransaction().commit();
				} catch (Exception e) {
					pritdse.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rPritdseFOUND = false;
				rPritdseEOF = true;
				while (rPritdsePOS < rPritdseList.size() || rPritdseFOUND) {
					rPritdse = rPritdseList.get(++rPritdsePOS);
								if (Objects.equals(String.valueOf(rPritdse.getPeterr()), String.valueOf(rPritds.getPrterr())) && Objects.equals(String.valueOf(rPritdse.getPecode()), String.valueOf(rPritds.getPrcode())) && Objects.equals(String.valueOf(rPritdse.getPeitem()), String.valueOf(rPritds.getPritem()))) {
						rPritdseFOUND = true;
						rPritdseEOF = false;
					} else {
						rPritdseFOUND = false;
						rPritdseEOF = true;
					}

				}
				// IF STATEMENT
				if (rPritdseFOUND && PIE.get(P1).compareTo("O") == 0) {
					// MOVE
					PGR.set(P1, rPritdse.getPegrp());
					// MOVE
					PGRPS.set(P1, rPritdse.getPegrp());
					// IF STATEMENT
					if (PGR.get(P1).compareTo(" ") == 0) {
						// MOVE
						PGR.set(P1, "*");
					// ENDIF
					}
				// ELSE
				} else {
					// MOVE
					PGR.set(P1, " ");
				// ENDIF
				}
				// IF STATEMENT
				if (PGR.get(P1).compareTo(" ") != 0) {
					// EVAL
					$GRPPOS = Integer.valueOf(String.valueOf(PGRP.indexOf(PGR.get(P1))));
					// IF STATEMENT
					if ($GRPPOS > 0) {
						// IF STATEMENT
						if (PGR.get(P1).compareTo(" ") != 0 && PIE.get(P1).compareTo("O") == 0 && PAM.get(P1) > 0 &&  PMS.get(P1).compareTo("Y") == 0) {
							// EVAL
							PGRPI.set($GRPPOS,  Integer.valueOf(String.valueOf(PGRPI.get($GRPPOS) + 1)));
						// ENDIF
						}
					// ELSE
					} else {
						// EVAL
						$GRPINS = Integer.valueOf(String.valueOf($GRPINS + 1));
						// IF STATEMENT
						if (PGR.get(P1).compareTo(" ") != 0 && PIE.get(P1).compareTo("O") == 0 && PAM.get(P1) > 0 &&  PMS.get(P1).compareTo("Y") == 0) {
							// EVAL
							PGRPI.set($GRPINS,  Integer.valueOf(String.valueOf(1)));
						// ENDIF
						}
						// EVAL
						PGRP.set($GRPINS,  String.valueOf(PGR.get(P1)));
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
		//ENDDO
		} while (IN77 == true);
	// ENDIF
	}
	// EVAL
	// MOVE
	ZTERR = String.valueOf(rSh200sfm.getCaterr());
	// CHAIN SETLL
	try {
		pakmst.getTransaction().begin();
		qPakmst = pakmst.createQuery(pakkeyKL("Pakmst"), Pakmst.class);
		rPakmstList = qPakmst.getResultList();
		if (rPakmstList.size() >= 1) {
			rPakmst = new Pakmst();
			rPakmstFOUND = true;
			rPakmstEOF = false;
		} else {
			rPakmstFOUND = false;
			rPakmstEOF = true;
		}
		rPakmstPOS = -1;
		pakmst.getTransaction().commit();
	} catch (Exception e) {
		pakmst.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rPakmstFOUND = false;
	rPakmstEOF = true;
	while (rPakmstPOS < rPakmstList.size() || rPakmstFOUND) {
		rPakmst = rPakmstList.get(++rPakmstPOS);
		if (Objects.equals(String.valueOf(rPakmst.getPkterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rPakmst.getPkpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
			rPakmstFOUND = true;
			rPakmstEOF = false;
		} else {
			rPakmstFOUND = false;
			rPakmstEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == true) {
		// MOVE
		ZTERR = String.valueOf(ZTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
		// CHAIN SETLL
		try {
			pakmst.getTransaction().begin();
			qPakmst = pakmst.createQuery(pakkeyKL("Pakmst"), Pakmst.class);
			rPakmstList = qPakmst.getResultList();
			if (rPakmstList.size() >= 1) {
				rPakmst = new Pakmst();
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}
			rPakmstPOS = -1;
			pakmst.getTransaction().commit();
		} catch (Exception e) {
			pakmst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPakmstFOUND = false;
		rPakmstEOF = true;
		while (rPakmstPOS < rPakmstList.size() || rPakmstFOUND) {
			rPakmst = rPakmstList.get(++rPakmstPOS);
				if (Objects.equals(String.valueOf(rPakmst.getPkterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rPakmst.getPkpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}

		}
	// ENDIF
	}
	// MOVE
	WTERR1 = String.valueOf(ZTERR);
	// EVAL
	// IF STATEMENT
	if (IN79 == false) {
		//Z-ADD
		PVUSD = Float.valueOf(String.valueOf(0));
		// IF STATEMENT
		if (rPakmst.getPkvpts() > 0 && rPakmst.getPkpt$() > 0) {
			//MULT
			rSh200sfm.set_pvtot((float) (rPakmst.getPkvpts() * rPakmst.getPkpt$()));
			//Z-ADD
			rSh200sfm.set_pvpts((int) Integer.valueOf(String.valueOf(rPakmst.getPkvpts())));
			//Z-ADD
			rSh200sfm.set_pvpt$(Float.valueOf(String.valueOf(rPakmst.getPkpt$())));
		// ELSE
		} else {
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	// IF STATEMENT
	if (IN88 == false) {
		// MOVE
		VALSWT = String.valueOf("V");
	// ELSE
	} else {
		// EVAL
		VALSWT = String.valueOf("");
	// ENDIF
	}
	//Z-ADD
	rSh200sfm.set_pvdif(Float.valueOf(String.valueOf(rSh200sfm.get_pvtot())));
	//Z-ADD
	rSh200sfm.setCbadd(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbadd2(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbadam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	PTDIF = (int) Integer.valueOf(String.valueOf(rSh200sfm.get_pvpts()));
	// MOVE
	IN86 = true ;
	// SETLL
	try {
		pakdtlla.getTransaction().begin();
		qPakdtlla = pakdtlla.createQuery(pakkeyKL("Pakdtlla"), Pakdtlla.class);
		rPakdtllaList = qPakdtlla.getResultList();
		if (rPakdtllaList.size() >= 1) {
			rPakdtlla = new Pakdtlla();
			rPakdtllaFOUND = true;
			rPakdtllaEOF = false;
		} else {
			rPakdtllaFOUND = false;
			rPakdtllaEOF = true;
		}
		rPakdtllaPOS = -1;
		pakdtlla.getTransaction().commit();
	} catch (Exception e) {
		pakdtlla.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	//DOU
	do {
		// READE
		rPakdtllaFOUND = false;
		rPakdtllaEOF = true;
		while (rPakdtllaPOS < rPakdtllaList.size() || rPakdtllaFOUND) {
			rPakdtlla = rPakdtllaList.get(++rPakdtllaPOS);
					if (Objects.equals(String.valueOf(rPakdtlla.getPlterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rPakdtlla.getPlpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPakdtllaFOUND = true;
				rPakdtllaEOF = false;
			} else {
				rPakdtllaFOUND = false;
				rPakdtllaEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			// MOVE
			$MANSL = String.valueOf("N");
			//Z-ADD
			rSh200sfm.setHbinhr((int) Integer.valueOf(String.valueOf(rPakdtlla.getPlinhr())));
			//Z-ADD
			rSh200sfm.setHbinmn((int) Integer.valueOf(String.valueOf(rPakdtlla.getPlinmn())));
			//Z-ADD
			rSh200sfm.setHbmaxq((int) Integer.valueOf(String.valueOf(rPakdtlla.getPlmaxq())));
			//Z-ADD
			rSh200sfm.setHsmqty((int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setHsdsam(Float.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setHsdspc(Float.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setHsxqty((int) Integer.valueOf(String.valueOf(0)));
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
				//Z-ADD
				rSh200sfm.setSblnam(Float.valueOf(String.valueOf(0)));
			// ELSE
			} else {
				//Z-ADD
				rSh200sfm.setSblnams(Float.valueOf(String.valueOf(0)));
			// ENDIF
			}
			//Z-ADD
			rSh200sfm.setSbitqt((int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setSbitam(Float.valueOf(String.valueOf(0)));
			//Z-ADD
			P2 = (int) Integer.valueOf(String.valueOf(1));
			// IF STATEMENT
			if (IN77 == false) {
				//Z-ADD
				P2 = (int) Integer.valueOf(String.valueOf(1));
			// ENDIF
			}
			// IF STATEMENT
			if (IN77 == true) {
				// MOVE
				rSh200sfm.setHsaddo(String.valueOf(PAD.get(P2)));
				//Z-ADD
				rSh200sfm.setHsmqty((int) Integer.valueOf(String.valueOf(PMN.get(P2))));
				//Z-ADD
				rSh200sfm.setHsdsam(Float.valueOf(String.valueOf(PDO.get(P2))));
				//Z-ADD
				rSh200sfm.setHsdspc(Float.valueOf(String.valueOf(PPC.get(P2))));
				//Z-ADD
				rSh200sfm.setHsxqty((int) Integer.valueOf(String.valueOf(PMX.get(P2))));
			// ENDIF
			}
			// CHAIN SETLL
			try {
				qudtlla.getTransaction().begin();
				qQudtlla = qudtlla.createQuery(itmky1KL("Qudtlla"), Qudtlla.class);
				rQudtllaList = qQudtlla.getResultList();
				if (rQudtllaList.size() >= 1) {
					rQudtlla = new Qudtlla();
					rQudtllaFOUND = true;
					rQudtllaEOF = false;
				} else {
					rQudtllaFOUND = false;
					rQudtllaEOF = true;
				}
				rQudtllaPOS = -1;
				qudtlla.getTransaction().commit();
			} catch (Exception e) {
				qudtlla.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rQudtllaFOUND = false;
			rQudtllaEOF = true;
			while (rQudtllaPOS < rQudtllaList.size() || rQudtllaFOUND) {
				rQudtlla = rQudtllaList.get(++rQudtllaPOS);
						if (Objects.equals(String.valueOf(rQudtlla.getQdent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQudtlla.getQdacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQudtlla.getQdseq()), String.valueOf(rSh200sfm.getHaseq())) && Objects.equals(String.valueOf(rQudtlla.getQditem()), String.valueOf(rPakdtlla.getPlitem()))) {
					rQudtllaFOUND = true;
					rQudtllaEOF = false;
				} else {
					rQudtllaFOUND = false;
					rQudtllaEOF = true;
				}

			}
			// IF STATEMENT
			if (IN77 == false  && rSh200sfm.getCbpkg().compareTo(rQuhdr.getQupkg()) == 0) {
				//Z-ADD
				rSh200sfm.setSbaddq((int) Integer.valueOf(String.valueOf(rQudtl.getQdaddq())));
				//Z-ADD
				rSh200sfm.setHoaddq((int) Integer.valueOf(String.valueOf(rQudtl.getQdaddq())));
				//Z-ADD
				rSh200sfm.setHsaddq((int) Integer.valueOf(String.valueOf(rQudtl.getQdaddq())));
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
					// MOVE
					rSh200sfm.setSblctn(String.valueOf(rQudtl.getQdlctn()));
				// ELSE
				} else {
					// MOVE
					rSh200sfm.setSblctns(String.valueOf(rQudtl.getQdlctn()));
				// ENDIF
				}
				//Z-ADD
				HKITQT = (int) Integer.valueOf(String.valueOf(0));
				//Z-ADD
				HKITAM = Float.valueOf(String.valueOf(0));
				//Z-ADD
				HKITQT = (int) Integer.valueOf(String.valueOf(rQudtl.getQditqt()));
				//Z-ADD
				HKITAM = Float.valueOf(String.valueOf(rQudtl.getQditam()));
				//Z-ADD
				rSh200sfm.setSbitqt((int) Integer.valueOf(String.valueOf(rQudtl.getQditqt())));
				//Z-ADD
				rSh200sfm.setSbitam(Float.valueOf(String.valueOf(rQudtl.getQditam())));
				// IF STATEMENT
				if (SAMEPR.compareTo("Y") == 0) {
					// IF STATEMENT
					if (rQudtl.getQddsam() != 0 || rQudtl.getQddspc() != 0) {
						// IF STATEMENT
						if (rQudtl.getQditam() != 0) {
							// MOVE
							$MANSL = String.valueOf("Y");
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			// ELSE
			} else {
				//Z-ADD
				rSh200sfm.setSbaddq((int) Integer.valueOf(String.valueOf(0)));
				//Z-ADD
				rSh200sfm.setHsaddq((int) Integer.valueOf(String.valueOf(0)));
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
					// EVAL
					rSh200sfm.setSblctn( String.valueOf(""));
				// ELSE
				} else {
					// EVAL
					rSh200sfm.setSblctns( String.valueOf(""));
				// ENDIF
				}
			// ENDIF
			}
			// IF STATEMENT
			if (rPakdtlla.getPlporo().compareTo("P") == 0) {
				//Z-ADD
				rSh200sfm.setSbpkgq((int) Integer.valueOf(String.valueOf(rPakdtlla.getPlpqty())));
			// ELSE
			} else {
				//Z-ADD
				rSh200sfm.setSbpkgq((int) Integer.valueOf(String.valueOf(0)));
			// ENDIF
			}
			//Z-ADD
			rSh200sfm.setHblin((int) Integer.valueOf(String.valueOf(0)));
			// MOVE
			rSh200sfm.setSbitem(String.valueOf(rPakdtlla.getPlitem()));
			// CHAIN SETLL
			try {
				itmast.getTransaction().begin();
				qItmast = itmast.createQuery("select c from Itmast c where c.IMITEM = '"+rSh200sfm.getSbitem()+"'", Itmast.class);
				rItmastList = qItmast.getResultList();
				if (rItmastList.size() >= 1) {
					rItmast = new Itmast();
					rItmastFOUND = true;
					rItmastEOF = false;
				} else {
					rItmastFOUND = false;
					rItmastEOF = true;
				}
				rItmastPOS = -1;
				itmast.getTransaction().commit();
			} catch (Exception e) {
				itmast.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rItmastFOUND = false;
			rItmastEOF = true;
			while (rItmastPOS < rItmastList.size() || rItmastFOUND) {
				rItmast = rItmastList.get(++rItmastPOS);
						if (Objects.equals(String.valueOf(rItmast.getImitem()), String.valueOf(rSh200sfm.getSbitem()))) {
					rItmastFOUND = true;
					rItmastEOF = false;
				} else {
					rItmastFOUND = false;
					rItmastEOF = true;
				}

			}
			// EVAL
			rSh200sfm.setItmtyp( String.valueOf(rItmast.getImpcod()));
			// IF STATEMENT
			if (IN78 == false) {
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
					// MOVE
					rSh200sfm.setSbdsc1(String.valueOf(rItmast.getImdsc1()));
				// ELSE
				} else {
					// MOVE
					rSh200sfm.setSbdsc1s(String.valueOf(rItmast.getImdsc1()));
				// ENDIF
				}
			// ENDIF
			}
			// EVAL
			$ITMDESC = String.valueOf(rSh200sfm.getSbitem());
			// CHAIN SETLL
			try {
				adtitmo.getTransaction().begin();
				qAdtitmo = adtitmo.createQuery($kitmoKL("Adtitmo"), Adtitmo.class);
				rAdtitmoList = qAdtitmo.getResultList();
				if (rAdtitmoList.size() >= 1) {
					rAdtitmo = new Adtitmo();
					rAdtitmoFOUND = true;
					rAdtitmoEOF = false;
				} else {
					rAdtitmoFOUND = false;
					rAdtitmoEOF = true;
				}
				rAdtitmoPOS = -1;
				adtitmo.getTransaction().commit();
			} catch (Exception e) {
				adtitmo.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rAdtitmoFOUND = false;
			rAdtitmoEOF = true;
			while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
				rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
						if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
					rAdtitmoFOUND = true;
					rAdtitmoEOF = false;
				} else {
					rAdtitmoFOUND = false;
					rAdtitmoEOF = true;
				}

			}
			// IF STATEMENT
			if (rAdtitmoFOUND) {
				// EVAL
			// ELSE
			} else {
				// CHAIN SETLL
				try {
					adtitmo.getTransaction().begin();
					qAdtitmo = adtitmo.createQuery($kitmo99KL("Adtitmo"), Adtitmo.class);
					rAdtitmoList = qAdtitmo.getResultList();
					if (rAdtitmoList.size() >= 1) {
						rAdtitmo = new Adtitmo();
						rAdtitmoFOUND = true;
						rAdtitmoEOF = false;
					} else {
						rAdtitmoFOUND = false;
						rAdtitmoEOF = true;
					}
					rAdtitmoPOS = -1;
					adtitmo.getTransaction().commit();
				} catch (Exception e) {
					adtitmo.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rAdtitmoFOUND = false;
				rAdtitmoEOF = true;
				while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
					rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
								if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
						rAdtitmoFOUND = true;
						rAdtitmoEOF = false;
					} else {
						rAdtitmoFOUND = false;
						rAdtitmoEOF = true;
					}

				}
				// IF STATEMENT
				if (rAdtitmoFOUND) {
					// EVAL
				// ELSE
				} else {
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
			//Z-ADD
			rSh200sfm.setSbsprc(Float.valueOf(String.valueOf(0)));
			// MOVE
			ldadsDS.laterr(String.valueOf(rSh200sfm.getCaterr()));
			//Z-ADD
			rSh200sfm.setSbsprc(Float.valueOf(String.valueOf(AASLSP)));
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
				//MULT
				rSh200sfm.setSblnam((float) (rSh200sfm.getSbsprc() * rSh200sfm.getSbaddq()));
				//SUB
				rSh200sfm.setSblnam(rSh200sfm.getSblnam() - rSh200sfm.getSbitam());
			// ELSE
			} else {
				//MULT
				rSh200sfm.setSblnams((float) (rSh200sfm.getSbsprc() * rSh200sfm.getSbaddq()));
				//SUB
				rSh200sfm.setSblnams(rSh200sfm.getSblnams() - rSh200sfm.getSbitam());
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.get_pvpt$() != 0) {
				//DIV
				rSh200sfm.setHsvpts((int) Integer.valueOf(String.valueOf(rSh200sfm.getSbsprc() / rSh200sfm.get_pvpt$())));
			// ENDIF
			}
			//MULT
			rSh200sfm.setHspusd(rSh200sfm.getSbaddq() * rSh200sfm.getHsvpts());
			// IF STATEMENT
			if (PVUSD < rSh200sfm.get_pvtot()) {
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
					//ADD
					PVUSD = PVUSD + rSh200sfm.getSblnam();
					//SUB
					rSh200sfm.set_pvdif(rSh200sfm.get_pvdif() - rSh200sfm.getSblnam());
				// ELSE
				} else {
					//ADD
					PVUSD = PVUSD + rSh200sfm.getSblnams();
					//SUB
					rSh200sfm.set_pvdif(rSh200sfm.get_pvdif() - rSh200sfm.getSblnams());
				// ENDIF
				}
				// ELSEIF STATEMENT
			} else if (PVUSD == rSh200sfm.get_pvtot()) {
				// IF STATEMENT
				if (rItmast.getImpcod().compareTo("BAS") != 0) {
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
						//ADD
						rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.getSblnam());
						//ADD
						rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.getSblnam());
					// ELSE
					} else {
						//ADD
						rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.getSblnams());
						//ADD
						rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.getSblnams());
					// ENDIF
					}
				// ENDIF
				}
				//Z-ADD
				rSh200sfm.set_pvdif(Float.valueOf(String.valueOf(0)));
			// ENDSL
			}
			// IF STATEMENT
			if (PVUSD > rSh200sfm.get_pvtot()) {
				//Z-SUB
				rSh200sfm.set_pvdif(0 - rSh200sfm.get_pvdif());
				// IF STATEMENT
				if (rItmast.getImpcod().compareTo("BAS") != 0) {
					//ADD
					rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.get_pvdif());
					//ADD
					rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.get_pvdif());
				// ENDIF
				}
				//Z-ADD
				PVUSD = Float.valueOf(String.valueOf(rSh200sfm.get_pvtot()));
				//Z-ADD
				rSh200sfm.set_pvdif(Float.valueOf(String.valueOf(0)));
			// ENDIF
			}
			//ADD
			TOTSFB = TOTSFB + 1;
			//Z-ADD
			RRNB = (int) Integer.valueOf(String.valueOf(TOTSFB));
			//Z-ADD
			rSh200sfm.setSflpsb((int) Integer.valueOf(String.valueOf(1)));
			// MOVE
			IN76 = true ;
			// IF STATEMENT
			if (rItmast.getImpcod().compareTo("BAS") != 0) {
				//ADD
				rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.getSbitam());
				//ADD
				rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.getSbitam());
			// ENDIF
			}
			//SUB
			rSh200sfm.setCbadam(rSh200sfm.getCbadam() - rSh200sfm.getSbitam());
			// CHAIN SETLL
			try {
				itmdef.getTransaction().begin();
				qItmdef = itmdef.createQuery(idfky1KL("Itmdef"), Itmdef.class);
				rItmdefList = qItmdef.getResultList();
				if (rItmdefList.size() >= 1) {
					rItmdef = new Itmdef();
					rItmdefFOUND = true;
					rItmdefEOF = false;
				} else {
					rItmdefFOUND = false;
					rItmdefEOF = true;
				}
				rItmdefPOS = -1;
				itmdef.getTransaction().commit();
			} catch (Exception e) {
				itmdef.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rItmdefFOUND = false;
			rItmdefEOF = true;
			while (rItmdefPOS < rItmdefList.size() || rItmdefFOUND) {
				rItmdef = rItmdefList.get(++rItmdefPOS);
						if (Objects.equals(String.valueOf(rItmdef.getIditem()), String.valueOf(rSh200sfm.getSbitem())) && Objects.equals(String.valueOf(rItmdef.getIdterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rItmdef.getIdstyp()), String.valueOf(rPakmst.getPkstyp()))) {
					rItmdefFOUND = true;
					rItmdefEOF = false;
				} else {
					rItmdefFOUND = false;
					rItmdefEOF = true;
				}

			}
			// IF STATEMENT
			if (IN78 == true) {
				// CHAIN SETLL
				try {
					itmdef.getTransaction().begin();
					qItmdef = itmdef.createQuery(idfky9KL("Itmdef"), Itmdef.class);
					rItmdefList = qItmdef.getResultList();
					if (rItmdefList.size() >= 1) {
						rItmdef = new Itmdef();
						rItmdefFOUND = true;
						rItmdefEOF = false;
					} else {
						rItmdefFOUND = false;
						rItmdefEOF = true;
					}
					rItmdefPOS = -1;
					itmdef.getTransaction().commit();
				} catch (Exception e) {
					itmdef.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rItmdefFOUND = false;
				rItmdefEOF = true;
				while (rItmdefPOS < rItmdefList.size() || rItmdefFOUND) {
					rItmdef = rItmdefList.get(++rItmdefPOS);
								if (Objects.equals(String.valueOf(rItmdef.getIditem()), String.valueOf(rSh200sfm.getSbitem())) && Objects.equals(String.valueOf(rItmdef.getIdterr()), String.valueOf(ZZTERR)) && Objects.equals(String.valueOf(rItmdef.getIdstyp()), String.valueOf(rPakmst.getPkstyp()))) {
						rItmdefFOUND = true;
						rItmdefEOF = false;
					} else {
						rItmdefFOUND = false;
						rItmdefEOF = true;
					}

				}
			// ENDIF
			}
			//EXSR
			GETITMPRC();
			// IF STATEMENT
			if (rPakmst.getPkstyp().compareTo("WRL") == 0 && rSh200sfm.getSbpkgq() + rSh200sfm.getSbaddq() > 0) {
				// EVAL
			// ENDIF
			}
			//EXSR
			GETATTR();
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
			// ELSE
			} else {
			// ENDIF
			}
			//Z-ADD
			W2 = (int) Integer.valueOf(String.valueOf(1));
			// IF STATEMENT
			if (IN77 == true) {
				//ADD
				WAP.set(W2, WAP.get(W2) + rSh200sfm.getSbpkgq());
				//ADD
				WAQ.set(W2, WAQ.get(W2) + rSh200sfm.getSbaddq());
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.getSbaddq() > 0) {
				// IF STATEMENT
				if (IN78 == false) {
					//Z-ADD
					A2 = (int) Integer.valueOf(String.valueOf(1));
					// IF STATEMENT
					if (IN77 == true) {
						//ADD
						ANQ.set(A2, ANQ.get(A2) + rSh200sfm.getSbaddq());
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
			//Z-ADD
			P2 = (int) Integer.valueOf(String.valueOf(1));
			// IF STATEMENT
			if (IN77 == false) {
				//Z-ADD
				P2 = (int) Integer.valueOf(String.valueOf(1));
			// ENDIF
			}
			// IF STATEMENT
			if (IN77 == true) {
				// MOVE
				PAD.set(P2, rSh200sfm.getHsaddo());
				//Z-ADD
				PMN.set(P2, (int) Integer.valueOf(String.valueOf(rSh200sfm.getHsmqty())));
				//Z-ADD
				PDO.set(P2, Float.valueOf(String.valueOf(rSh200sfm.getHsdsam())));
				//Z-ADD
				PPC.set(P2, Float.valueOf(String.valueOf(rSh200sfm.getHsdspc())));
				//Z-ADD
				PMX.set(P2, (int) Integer.valueOf(String.valueOf(rSh200sfm.getHsxqty())));
				//Z-ADD
				PQT.set(P2, (int) Integer.valueOf(String.valueOf(rSh200sfm.getSbitqt())));
				//Z-ADD
				PAM.set(P2, Float.valueOf(String.valueOf(rSh200sfm.getSbitam())));
				//Z-ADD
				PSP.set(P2, Float.valueOf(String.valueOf(rSh200sfm.getSbsprc())));
				// IF STATEMENT
				if (rSh200sfm.getSbitam() != 0 || $MANSL.compareTo("Y") == 0) {
					// MOVE
					PMS.set(P2, "Y");
					//Z-ADD
					PQT.set(P2, (int) Integer.valueOf(String.valueOf(HKITQT)));
					// IF STATEMENT
					if (PIT.get(P2).compareTo($ITEM) == 0) {
						//ADD
						PAM.set(P2, PAM.get(P2) + HKITAM);
					// ELSE
					} else {
						//Z-ADD
						PAM.set(P2, Float.valueOf(String.valueOf(HKITAM)));
					// ENDIF
					}
				// ENDIF
				}
			// ELSE
			} else {
				// IF STATEMENT
				if (rSh200sfm.getHsdsam() != 0 || rSh200sfm.getHsdspc() != 0) {
					//ADD
					P1 = P1 + 1;
					// MOVE
					PIT.set(P1, rSh200sfm.getSbitem());
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
						// MOVE
						PDS.set(P1, rSh200sfm.getSbdsc1());
					// ELSE
					} else {
						// MOVE
						PDS.set(P1, rSh200sfm.getSbdsc1s());
					// ENDIF
					}
					// MOVE
					PAD.set(P1, rSh200sfm.getHsaddo());
					//Z-ADD
					PMN.set(P1, (int) Integer.valueOf(String.valueOf(rSh200sfm.getHsmqty())));
					//Z-ADD
					PDO.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHsdsam())));
					//Z-ADD
					PPC.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHsdspc())));
					//Z-ADD
					PMX.set(P1, (int) Integer.valueOf(String.valueOf(rSh200sfm.getHsxqty())));
					//Z-ADD
					PQT.set(P1, (int) Integer.valueOf(String.valueOf(rSh200sfm.getSbitqt())));
					//Z-ADD
					PAM.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getSbitam())));
					//Z-ADD
					PSP.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getSbsprc())));
					// IF STATEMENT
					if (rSh200sfm.getSbitam() != 0 || $MANSL.compareTo("Y") == 0) {
						// MOVE
						PMS.set(P1, "Y");
						//Z-ADD
						PQT.set(P1, (int) Integer.valueOf(String.valueOf(HKITQT)));
						//Z-ADD
						PAM.set(P1, Float.valueOf(String.valueOf(HKITAM)));
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	//Z-SUB
	rSh200sfm.setCbanam(0 - rSh200sfm.getHbanam());
	//Z-ADD
	$AMOUNT = Float.valueOf(String.valueOf(rSh200sfm.getCbadam()));
	//MULT
	$AMOUNT = (float) ($AMOUNT * -1);
	//MULT
	rSh200sfm.setCbadam((float) (rSh200sfm.getHbadam() * -1));
	//SUB
	rSh200sfm.setCbadam(rSh200sfm.getCbadam() - $AMOUNT);
	// IF STATEMENT
	if (rSh200sfm.getHbprom().compareTo("") == 0) {
		//EXSR
		USAADISCN();
	// ENDIF
	}
	//DIV
	rSh200sfm.setCbanmm(rSh200sfm.getCbanam() / 12);
	//ADD
	rSh200sfm.setCbb$ad(rSh200sfm.getCbbase() + rSh200sfm.getCbadd2());
	//ADD
	rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() + rSh200sfm.getCbadam());
	//ADD
	rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() + rSh200sfm.getCbadd$());
	//Z-ADD
	SVB$AD = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
	// MOVE
	SVPKG = String.valueOf(rSh200sfm.getCbpkg());
	// MOVE
	SVCAT = String.valueOf(rSh200sfm.getCbcat());
	//ENDSR
	}
	
//BEGSR
	public static void AADQTE () {
	// MOVEA
	IN74 = true;
	// MOVEA
	IN75 = false;
	// MOVEA
	IN76 = false;
	// MOVE
	in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
	// MOVE
	in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
	// MOVE
	rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
	// IF STATEMENT
	if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
	// ELSE
	} else {
	// ENDIF
	}
	// MOVE
	IN75 = true ;
	//Z-ADD
	RRNB = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	TOTSFB = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	rSh200sfm.setCbbase(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbadd(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbadd2(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbadam(Float.valueOf(String.valueOf(0)));
	// MOVE
	rSh200sfm.setCblnam(String.valueOf(rSh200sfm.getCalnam()));
	//Z-ADD
	rSh200sfm.setCbb$ad(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	PVUSD = Float.valueOf(String.valueOf(0));
	//Z-ADD
	rSh200sfm.set_pvdif(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbnegp(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	SVB$AD = Float.valueOf(String.valueOf(0));
	//Z-ADD
	rSh200sfm.setCbngmp(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbngpp(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbmnmp(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	SVMFWT = Float.valueOf(String.valueOf(0));
	//Z-ADD
	SVPERM = Float.valueOf(String.valueOf(0));
	// EVAL
	rSh200sfm.setCbpkg( String.valueOf(""));
	// MOVE
	rSh200sfm.setCbmon(String.valueOf("M"));
	//Z-ADD
	rSh200sfm.setCbmntr(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbmmnt(Float.valueOf(String.valueOf(0)));
	// EVAL
	rSh200sfm.setCbcat( String.valueOf(""));
	//Z-ADD
	rSh200sfm.setCbfire(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbmfir(Float.valueOf(String.valueOf(0)));
	// MOVE
	rSh200sfm.setCbwarc(String.valueOf("N"));
	// MOVE
	TMPQSP1 = String.valueOf("N");
	//Z-ADD
	rSh200sfm.setCbwrfe(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbmwrf(Float.valueOf(String.valueOf(0)));
	// EVAL
	rSh200sfm.setCbccds( String.valueOf(""));
	//Z-ADD
	rSh200sfm.setCbmfwt(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbmmfw(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbanam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbanmm(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbperm(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbadd$(Float.valueOf(String.valueOf(0)));
	// EVAL
	rSh200sfm.setCbst( String.valueOf(""));
	//EXSR
	APRMIT();
	//Z-ADD
	SVPERM = Float.valueOf(String.valueOf(rSh200sfm.getCbperm()));
	// CHAIN SETLL
	try {
		mktadd.getTransaction().begin();
		qMktadd = mktadd.createQuery("select c from Mktadd c where c.MKMMS = '"+rSh200sfm.getCaacct()+"'", Mktadd.class);
		rMktaddList = qMktadd.getResultList();
		if (rMktaddList.size() >= 1) {
			rMktadd = new Mktadd();
			rMktaddFOUND = true;
			rMktaddEOF = false;
		} else {
			rMktaddFOUND = false;
			rMktaddEOF = true;
		}
		rMktaddPOS = -1;
		mktadd.getTransaction().commit();
	} catch (Exception e) {
		mktadd.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rMktaddFOUND = false;
	rMktaddEOF = true;
	while (rMktaddPOS < rMktaddList.size() || rMktaddFOUND) {
		rMktadd = rMktaddList.get(++rMktaddPOS);
		if (Objects.equals(String.valueOf(rMktadd.getMkmms()), String.valueOf(rSh200sfm.getCaacct()))) {
			rMktaddFOUND = true;
			rMktaddEOF = false;
		} else {
			rMktaddFOUND = false;
			rMktaddEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == false) {
		// MOVE
		YTERR = String.valueOf(rSh200sfm.getCaterr());
		// CHAIN SETLL
		try {
			promst.getTransaction().begin();
			qPromst = promst.createQuery(proky2KL("Promst"), Promst.class);
			rPromstList = qPromst.getResultList();
			if (rPromstList.size() >= 1) {
				rPromst = new Promst();
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}
			rPromstPOS = -1;
			promst.getTransaction().commit();
		} catch (Exception e) {
			promst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPromstFOUND = false;
		rPromstEOF = true;
		while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
			rPromst = rPromstList.get(++rPromstPOS);
				if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(S0PROM))) {
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}

		}
		// IF STATEMENT
		if (IN78 == true) {
			// MOVE
			YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
			// CHAIN SETLL
			try {
				promst.getTransaction().begin();
				qPromst = promst.createQuery(proky2KL("Promst"), Promst.class);
				rPromstList = qPromst.getResultList();
				if (rPromstList.size() >= 1) {
					rPromst = new Promst();
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}
				rPromstPOS = -1;
				promst.getTransaction().commit();
			} catch (Exception e) {
				promst.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPromstFOUND = false;
			rPromstEOF = true;
			while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
				rPromst = rPromstList.get(++rPromstPOS);
						if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(S0PROM))) {
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}

			}
		// ENDIF
		}
		// IF STATEMENT
		if (IN78 == false) {
			// MOVE
			rSh200sfm.setCbpkg(String.valueOf(rPromstlb.getPmpakg()));
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbpkg().compareTo("") == 0) {
			// MOVE
			YTERR = String.valueOf(rSh200sfm.getCaterr());
			// CHAIN SETLL
			try {
				promst.getTransaction().begin();
				qPromst = promst.createQuery(prokeyKL("Promst"), Promst.class);
				rPromstList = qPromst.getResultList();
				if (rPromstList.size() >= 1) {
					rPromst = new Promst();
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}
				rPromstPOS = -1;
				promst.getTransaction().commit();
			} catch (Exception e) {
				promst.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPromstFOUND = false;
			rPromstEOF = true;
			while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
				rPromst = rPromstList.get(++rPromstPOS);
						if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rMktadd.getMkprom()))) {
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}

			}
			// IF STATEMENT
			if (IN78 == true) {
				// MOVE
				YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
				// CHAIN SETLL
				try {
					promst.getTransaction().begin();
					qPromst = promst.createQuery(prokeyKL("Promst"), Promst.class);
					rPromstList = qPromst.getResultList();
					if (rPromstList.size() >= 1) {
						rPromst = new Promst();
						rPromstFOUND = true;
						rPromstEOF = false;
					} else {
						rPromstFOUND = false;
						rPromstEOF = true;
					}
					rPromstPOS = -1;
					promst.getTransaction().commit();
				} catch (Exception e) {
					promst.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rPromstFOUND = false;
				rPromstEOF = true;
				while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
					rPromst = rPromstList.get(++rPromstPOS);
								if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rMktadd.getMkprom()))) {
						rPromstFOUND = true;
						rPromstEOF = false;
					} else {
						rPromstFOUND = false;
						rPromstEOF = true;
					}

				}
			// ENDIF
			}
			// IF STATEMENT
			if (IN78 == false) {
				// MOVE
				rSh200sfm.setCbpkg(String.valueOf(rPromstlb.getPmpakg()));
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	// MOVEA
	IN34 = false;
	// MOVEA
	IN35 = false;
	// MOVEA
	IN36 = false;
	// MOVEA
	IN37 = false;
	// MOVEA
	IN38 = false;
	// MOVE
	rSh200sfm.setSaoptn(String.valueOf("A"));
	//Z-ADD
	rSh200sfm.setHaseq((int) Integer.valueOf(String.valueOf(0)));
	//MULT
	Calendar calendar = Calendar.getInstance();
	$$ADAT = (int) (Integer.valueOf(String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf(calendar.get(Calendar.MONTH)+1) + String.valueOf(calendar.get(Calendar.DAY_OF_MONTH))) * 10000.0001);
	// MOVE
	$$ADTA = String.valueOf($$ADAT);
	// EVAL
	rSh200sfm.setCbcat( String.valueOf("ADT"));
	// MOVE
	OPER = String.valueOf("ADD");
	//ENDSR
	}
	
//BEGSR
	public static void AINQ () {
	// MOVE
	ZTERR = String.valueOf(rSh200sfm.getCaterr());
	// EVAL
	// EVAL
	// EVAL
	// EVAL
	// EVAL
	// MOVE
	in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
	// MOVE
	in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
	// MOVE
	rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
	// IF STATEMENT
	if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
	// ELSE
	} else {
	// ENDIF
	}
	// EVAL
	// MOVE
	rSh200sfm.setCbpkg(String.valueOf(rSh200sfm.getSapkg()));
	// MOVE
	ZTERR = String.valueOf(rSh200sfm.getCaterr());
	// CHAIN SETLL
	try {
		pakmst.getTransaction().begin();
		qPakmst = pakmst.createQuery(pakkeyKL("Pakmst"), Pakmst.class);
		rPakmstList = qPakmst.getResultList();
		if (rPakmstList.size() >= 1) {
			rPakmst = new Pakmst();
			rPakmstFOUND = true;
			rPakmstEOF = false;
		} else {
			rPakmstFOUND = false;
			rPakmstEOF = true;
		}
		rPakmstPOS = -1;
		pakmst.getTransaction().commit();
	} catch (Exception e) {
		pakmst.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rPakmstFOUND = false;
	rPakmstEOF = true;
	while (rPakmstPOS < rPakmstList.size() || rPakmstFOUND) {
		rPakmst = rPakmstList.get(++rPakmstPOS);
		if (Objects.equals(String.valueOf(rPakmst.getPkterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rPakmst.getPkpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
			rPakmstFOUND = true;
			rPakmstEOF = false;
		} else {
			rPakmstFOUND = false;
			rPakmstEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == true) {
		// MOVE
		ZTERR = String.valueOf(ZTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
		// CHAIN SETLL
		try {
			pakmst.getTransaction().begin();
			qPakmst = pakmst.createQuery(pakkeyKL("Pakmst"), Pakmst.class);
			rPakmstList = qPakmst.getResultList();
			if (rPakmstList.size() >= 1) {
				rPakmst = new Pakmst();
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}
			rPakmstPOS = -1;
			pakmst.getTransaction().commit();
		} catch (Exception e) {
			pakmst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPakmstFOUND = false;
		rPakmstEOF = true;
		while (rPakmstPOS < rPakmstList.size() || rPakmstFOUND) {
			rPakmst = rPakmstList.get(++rPakmstPOS);
				if (Objects.equals(String.valueOf(rPakmst.getPkterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rPakmst.getPkpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}

		}
	// ENDIF
	}
	// EVAL
	// IF STATEMENT
	if (IN79 == false) {
		// EVAL
		// IF STATEMENT
		if (IN88 == false) {
			// MOVE
			VALSWT = String.valueOf("V");
		// ELSE
		} else {
			// EVAL
			VALSWT = String.valueOf("");
		// ENDIF
		}
		//MULT
		rSh200sfm.set_pvtot((float) (rPakmst.getPkvpts() * rPakmst.getPkpt$()));
		//Z-ADD
		rSh200sfm.set_pvpts((int) Integer.valueOf(String.valueOf(rPakmst.getPkvpts())));
		//Z-ADD
		rSh200sfm.set_pvpt$(Float.valueOf(String.valueOf(rPakmst.getPkpt$())));
	// ENDIF
	}
	//Z-ADD
	rSh200sfm.set_pvdif(Float.valueOf(String.valueOf(rSh200sfm.get_pvtot())));
	//Z-ADD
	PVUSD = Float.valueOf(String.valueOf(0));
	//Z-ADD
	PTDIF = (int) Integer.valueOf(String.valueOf(rSh200sfm.get_pvpts()));
	//Z-ADD
	rSh200sfm.set_ptusd((int) Integer.valueOf(String.valueOf(0)));
	//Z-ADD
	RRNB = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	TOTSFB = (int) Integer.valueOf(String.valueOf(0));
	// CHAIN SETLL
	try {
		quhdr.getTransaction().begin();
		qQuhdr = quhdr.createQuery(quhky3KL("Quhdr"), Quhdr.class);
		rQuhdrList = qQuhdr.getResultList();
		if (rQuhdrList.size() >= 1) {
			rQuhdr = new Quhdr();
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}
		rQuhdrPOS = -1;
		quhdr.getTransaction().commit();
	} catch (Exception e) {
		quhdr.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQuhdrFOUND = false;
	rQuhdrEOF = true;
	while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
		rQuhdr = rQuhdrList.get(++rQuhdrPOS);
		if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rSh200sfm.getHaseq()))) {
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == false) {
		// CHAIN SETLL
		try {
			quhdre.getTransaction().begin();
			qQuhdre = quhdre.createQuery(quhex2KL("Quhdre"), Quhdre.class);
			rQuhdreList = qQuhdre.getResultList();
			if (rQuhdreList.size() >= 1) {
				rQuhdre = new Quhdre();
				rQuhdreFOUND = true;
				rQuhdreEOF = false;
			} else {
				rQuhdreFOUND = false;
				rQuhdreEOF = true;
			}
			rQuhdrePOS = -1;
			quhdre.getTransaction().commit();
		} catch (Exception e) {
			quhdre.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdreFOUND = false;
		rQuhdreEOF = true;
		while (rQuhdrePOS < rQuhdreList.size() || rQuhdreFOUND) {
			rQuhdre = rQuhdreList.get(++rQuhdrePOS);
				if (Objects.equals(String.valueOf(rQuhdre.getQuemms()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQuhdre.getQueseq()), String.valueOf(rQuhdr.getQuseq()))) {
				rQuhdreFOUND = true;
				rQuhdreEOF = false;
			} else {
				rQuhdreFOUND = false;
				rQuhdreEOF = true;
			}

		}
		// EVAL
		rSh200sfm.setCbst( String.valueOf(rQuhdre.getQuslty()));
		// MOVE
		TMPQSP = String.valueOf(rQuhdre.getQuslty());
		// MOVE
		rPakmst.setPkstyp(String.valueOf(rQuhdr.getQustyp()));
		// MOVE
		rSh200sfm.setQdate(Integer.valueOf(String.valueOf($QDATE)));
		// MOVE
		rSh200sfm.setQtime(Integer.valueOf(String.valueOf(rQuhdr.getQulupt())));
		// MOVE
		rSh200sfm.setQowner(String.valueOf(rQuhdr.getQulupu()));
		// MOVE
		$$ADAT = Integer.valueOf(String.valueOf(rQuhdr.getQuentd()));
		// MOVE
		$$ADTA = String.valueOf($$ADAT);
		// MOVE
		rSh200sfm.setCblnam(String.valueOf(rSh200sfm.getCalnam()));
		//Z-ADD
		rSh200sfm.setCbbase(Float.valueOf(String.valueOf(rQuhdr.getQubase())));
		//Z-ADD
		rSh200sfm.setCbadd(Float.valueOf(String.valueOf(rQuhdr.getQuadd())));
		//Z-ADD
		rSh200sfm.setCbadd2(Float.valueOf(String.valueOf(rQuhdr.getQuadd())));
		//Z-ADD
		rSh200sfm.setCbadd2(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbadd$(Float.valueOf(String.valueOf(rQuhdr.getQuads$())));
		//ADD
		rSh200sfm.setCbb$ad(rQuhdr.getQubase() + rQuhdr.getQuadd());
		//ADD
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() + rQuhdr.getQuads$());
		//SUB
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() - rQuhdr.getQuadam());
		//SUB
		rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() - rQuhdr.getQuitam());
		//MULT
		rSh200sfm.setCbadam((float) (rQuhdr.getQuadam() * -1));
		//SUB
		rSh200sfm.setCbadam(rSh200sfm.getCbadam() - rQuhdr.getQuitam());
		//Z-ADD
		rSh200sfm.setCbnegp(Float.valueOf(String.valueOf(rQuhdr.getQunegp())));
		//Z-ADD
		rSh200sfm.setCbngmp(Float.valueOf(String.valueOf(rQuhdr.getQungmp())));
		//Z-ADD
		rSh200sfm.setCbngpp(Float.valueOf(String.valueOf(rQuhdr.getQungpp())));
		// MOVE
		rSh200sfm.setCbpkg(String.valueOf(rQuhdr.getQupkg()));
		// MOVE
		rSh200sfm.setCbmon(String.valueOf(rQuhdr.getQumon()));
		// MOVE
		rSh200sfm.setHbprom(String.valueOf(rQuhdr.getQuprom()));
		//Z-ADD
		rPakprc.setPpdccf(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rPakprc.setPpamfe(Float.valueOf(String.valueOf(rQuhdr.getQumntr())));
		//Z-ADD
		rSh200sfm.setCbmntr(Float.valueOf(String.valueOf(rQuhdr.getQumntr())));
		//DIV
		rSh200sfm.setCbmmnt(rQuhdr.getQumntr() / 12);
		// MOVE
		rSh200sfm.setCbcat(String.valueOf(rQuhdr.getQucat()));
		//Z-ADD
		rSh200sfm.setCbfire(Float.valueOf(String.valueOf(rQuhdr.getQufire())));
		//DIV
		rSh200sfm.setCbmfir(rQuhdr.getQufire() / 12);
		// MOVE
		rSh200sfm.setCbwarc(String.valueOf(rQuhdr.getQuwarc()));
		// IF STATEMENT
		if (rSh200sfm.getCbwarc().compareTo("") == 0) {
			// MOVE
			rSh200sfm.setCbwarc(String.valueOf("N"));
		// ENDIF
		}
		//Z-ADD
		rSh200sfm.setCbwrfe(Float.valueOf(String.valueOf(rQuhdr.getQuwrfe())));
		//DIV
		rSh200sfm.setCbmwrf(rQuhdr.getQuwrfe() / 12);
		// MOVE
		rSh200sfm.setCbccds(String.valueOf(rQuhdr.getQuccds()));
		//DIV
		rSh200sfm.setCbmnmp(rQuhdr.getQungmp() / 12);
		//Z-ADD
		rSh200sfm.setCbanam(Float.valueOf(String.valueOf(rQuhdr.getQuanam())));
		//DIV
		rSh200sfm.setCbanmm(rSh200sfm.getCbanam() / 12);
		//Z-ADD
		rSh200sfm.setCbperm(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setCbadd$(Float.valueOf(String.valueOf(0)));
		//EXSR
		APRMIT();
		//Z-ADD
		SVPERM = Float.valueOf(String.valueOf(rSh200sfm.getCbperm()));
		//ADD
		rSh200sfm.setCbmfwt(rQuhdr.getQumntr() + rQuhdr.getQufire());
		//ADD
		rSh200sfm.setCbmfwt(rSh200sfm.getCbmfwt() + rQuhdr.getQuwrfe());
		//SUB
		rSh200sfm.setCbmfwt(rSh200sfm.getCbmfwt() - rSh200sfm.getCbanam());
		//Z-ADD
		SVMFWT = Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt()));
		//ADD
		rSh200sfm.setCbmmfw(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir());
		//ADD
		rSh200sfm.setCbmmfw(rSh200sfm.getCbmmfw() + rSh200sfm.getCbmwrf());
		// IF STATEMENT
		if (rSh200sfm.getCbnegp() < rSh200sfm.getCbb$ad() && rSh200sfm.getCbnegp() != 0) {
			// EVAL
			rSh200sfm.setCbadnp( Integer.valueOf(String.valueOf(((rSh200sfm.getCbb$ad() - rSh200sfm.getCbnegp())/rSh200sfm.getCbb$ad()) * 100)));
		// ELSE
		} else {
			// EVAL
			rSh200sfm.setCbadnp( Integer.valueOf(String.valueOf(0)));
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbngmp() < rSh200sfm.getCbmfwt() && rSh200sfm.getCbngmp() != 0) {
			// EVAL
			rSh200sfm.setCbannp( Integer.valueOf(String.valueOf(((rSh200sfm.getCbmfwt() - rSh200sfm.getCbngmp())/rSh200sfm.getCbmfwt()) * 100)));
		// ELSE
		} else {
			// EVAL
			rSh200sfm.setCbannp( Integer.valueOf(String.valueOf(0)));
		// ENDIF
		}
		// SETLL
		try {
			qusrvc.getTransaction().begin();
			qQusrvc = qusrvc.createQuery(quhky3KL("Qusrvc"), Qusrvc.class);
			rQusrvcList = qQusrvc.getResultList();
			if (rQusrvcList.size() >= 1) {
				rQusrvc = new Qusrvc();
				rQusrvcFOUND = true;
				rQusrvcEOF = false;
			} else {
				rQusrvcFOUND = false;
				rQusrvcEOF = true;
			}
			rQusrvcPOS = -1;
			qusrvc.getTransaction().commit();
		} catch (Exception e) {
			qusrvc.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		//DOU
		do {
			// READE
			rQusrvcFOUND = false;
			rQusrvcEOF = true;
			while (rQusrvcPOS < rQusrvcList.size() || rQusrvcFOUND) {
				rQusrvc = rQusrvcList.get(++rQusrvcPOS);
							if (Objects.equals(String.valueOf(rQusrvc.getQsent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQusrvc.getQsacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQusrvc.getQsseq()), String.valueOf(rSh200sfm.getHaseq()))) {
					rQusrvcFOUND = true;
					rQusrvcEOF = false;
				} else {
					rQusrvcFOUND = false;
					rQusrvcEOF = true;
				}

			}
			// IF STATEMENT
			if (IN79 == false) {
				//Z-ADD
				A2 = (int) Integer.valueOf(String.valueOf(1));
				// IF STATEMENT
				if (IN77 == true) {
					//Z-ADD
					ANQ.set(A2, (int) Integer.valueOf(String.valueOf(rQusrvc.getQsqty())));
					// MOVE
					AMS.set(A2, rQusrvc.getQsmanu());
				// ENDIF
				}
			// ENDIF
			}
		//ENDDO
		} while (IN79 == true);
		// EVAL
		// EVAL
		// EVAL
		// MOVE
		in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
		// MOVE
		in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
		// MOVE
		rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
		// IF STATEMENT
		if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
		// ELSE
		} else {
		// ENDIF
		}
		// EVAL
		// EVAL
		//Z-ADD
		RRNB = (int) Integer.valueOf(String.valueOf(0));
		// EVAL
		rSh200sfm.setSbitem( String.valueOf(""));
		// CHAIN SETLL
		try {
			qudtlla.getTransaction().begin();
			qQudtlla = qudtlla.createQuery(qdtlKL("Qudtlla"), Qudtlla.class);
			rQudtllaList = qQudtlla.getResultList();
			if (rQudtllaList.size() >= 1) {
				rQudtlla = new Qudtlla();
				rQudtllaFOUND = true;
				rQudtllaEOF = false;
			} else {
				rQudtllaFOUND = false;
				rQudtllaEOF = true;
			}
			rQudtllaPOS = -1;
			qudtlla.getTransaction().commit();
		} catch (Exception e) {
			qudtlla.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQudtllaFOUND = false;
		rQudtllaEOF = true;
		while (rQudtllaPOS < rQudtllaList.size() || rQudtllaFOUND) {
			rQudtlla = rQudtllaList.get(++rQudtllaPOS);
				if (Objects.equals(String.valueOf(rQudtlla.getQdent()), String.valueOf(rQuhdr.getQuent())) && Objects.equals(String.valueOf(rQudtlla.getQdacct()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQudtlla.getQdseq()), String.valueOf(rQuhdr.getQuseq()))) {
				rQudtllaFOUND = true;
				rQudtllaEOF = false;
			} else {
				rQudtllaFOUND = false;
				rQudtllaEOF = true;
			}

		}
		// IF STATEMENT
		if (IN77 == false) {
			//DOU
			do {
				//Z-ADD
				rSh200sfm.setSbpkgq((int) Integer.valueOf(String.valueOf(rQudtl.getQdpkgq())));
				//Z-ADD
				rSh200sfm.setSbaddq((int) Integer.valueOf(String.valueOf(rQudtl.getQdaddq())));
				//Z-ADD
				rSh200sfm.setHoaddq((int) Integer.valueOf(String.valueOf(rQudtl.getQdaddq())));
				// MOVE
				rSh200sfm.setSbitem(String.valueOf(rQudtl.getQditem()));
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
					// MOVE
					rSh200sfm.setSblctn(String.valueOf(rQudtl.getQdlctn()));
				// ELSE
				} else {
					// MOVE
					rSh200sfm.setSblctns(String.valueOf(rQudtl.getQdlctn()));
				// ENDIF
				}
				//Z-ADD
				rSh200sfm.setSbitqt((int) Integer.valueOf(String.valueOf(rQudtl.getQditqt())));
				//Z-ADD
				rSh200sfm.setSbitam(Float.valueOf(String.valueOf(rQudtl.getQditam())));
				//Z-ADD
				rSh200sfm.setHsaddq((int) Integer.valueOf(String.valueOf(rQudtl.getQdaddq())));
				// CHAIN SETLL
				try {
					itmast.getTransaction().begin();
					qItmast = itmast.createQuery("select c from Itmast c where c.IMITEM = '"+rSh200sfm.getSbitem()+"'", Itmast.class);
					rItmastList = qItmast.getResultList();
					if (rItmastList.size() >= 1) {
						rItmast = new Itmast();
						rItmastFOUND = true;
						rItmastEOF = false;
					} else {
						rItmastFOUND = false;
						rItmastEOF = true;
					}
					rItmastPOS = -1;
					itmast.getTransaction().commit();
				} catch (Exception e) {
					itmast.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rItmastFOUND = false;
				rItmastEOF = true;
				while (rItmastPOS < rItmastList.size() || rItmastFOUND) {
					rItmast = rItmastList.get(++rItmastPOS);
								if (Objects.equals(String.valueOf(rItmast.getImitem()), String.valueOf(rSh200sfm.getSbitem()))) {
						rItmastFOUND = true;
						rItmastEOF = false;
					} else {
						rItmastFOUND = false;
						rItmastEOF = true;
					}

				}
				// IF STATEMENT
				if (IN78 == false) {
					// EVAL
					rSh200sfm.setItmtyp( String.valueOf(rItmast.getImpcod()));
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
						// MOVE
						rSh200sfm.setSbdsc1(String.valueOf(rItmast.getImdsc1()));
					// ELSE
					} else {
						// MOVE
						rSh200sfm.setSbdsc1s(String.valueOf(rItmast.getImdsc1()));
					// ENDIF
					}
				// ENDIF
				}
				// EVAL
				$ITMDESC = String.valueOf(rSh200sfm.getSbitem());
				// CHAIN SETLL
				try {
					adtitmo.getTransaction().begin();
					qAdtitmo = adtitmo.createQuery($kitmoKL("Adtitmo"), Adtitmo.class);
					rAdtitmoList = qAdtitmo.getResultList();
					if (rAdtitmoList.size() >= 1) {
						rAdtitmo = new Adtitmo();
						rAdtitmoFOUND = true;
						rAdtitmoEOF = false;
					} else {
						rAdtitmoFOUND = false;
						rAdtitmoEOF = true;
					}
					rAdtitmoPOS = -1;
					adtitmo.getTransaction().commit();
				} catch (Exception e) {
					adtitmo.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rAdtitmoFOUND = false;
				rAdtitmoEOF = true;
				while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
					rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
								if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
						rAdtitmoFOUND = true;
						rAdtitmoEOF = false;
					} else {
						rAdtitmoFOUND = false;
						rAdtitmoEOF = true;
					}

				}
				// IF STATEMENT
				if (rAdtitmoFOUND) {
					// EVAL
				// ELSE
				} else {
					// CHAIN SETLL
					try {
						adtitmo.getTransaction().begin();
						qAdtitmo = adtitmo.createQuery($kitmo99KL("Adtitmo"), Adtitmo.class);
						rAdtitmoList = qAdtitmo.getResultList();
						if (rAdtitmoList.size() >= 1) {
							rAdtitmo = new Adtitmo();
							rAdtitmoFOUND = true;
							rAdtitmoEOF = false;
						} else {
							rAdtitmoFOUND = false;
							rAdtitmoEOF = true;
						}
						rAdtitmoPOS = -1;
						adtitmo.getTransaction().commit();
					} catch (Exception e) {
						adtitmo.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rAdtitmoFOUND = false;
					rAdtitmoEOF = true;
					while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
						rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
										if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
							rAdtitmoFOUND = true;
							rAdtitmoEOF = false;
						} else {
							rAdtitmoFOUND = false;
							rAdtitmoEOF = true;
						}

					}
					// IF STATEMENT
					if (rAdtitmoFOUND) {
						// EVAL
					// ELSE
					} else {
						// EVAL
					// ENDIF
					}
				// ENDIF
				}
				//Z-ADD
				rSh200sfm.setSbsprc(Float.valueOf(String.valueOf(AASLSP)));
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
					//MULT
					rSh200sfm.setSblnam((float) (rSh200sfm.getSbsprc() * rSh200sfm.getSbaddq()));
					//SUB
					rSh200sfm.setSblnam(rSh200sfm.getSblnam() - rSh200sfm.getSbitam());
				// ELSE
				} else {
					//MULT
					rSh200sfm.setSblnams((float) (rSh200sfm.getSbsprc() * rSh200sfm.getSbaddq()));
					//SUB
					rSh200sfm.setSblnams(rSh200sfm.getSblnams() - rSh200sfm.getSbitam());
				// ENDIF
				}
				//MULT
				rSh200sfm.setHspusd(rSh200sfm.getSbaddq() * rSh200sfm.getHsvpts());
				// IF STATEMENT
				if (PVUSD < rSh200sfm.get_pvtot()) {
					// IF STATEMENT
					if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
						//ADD
						PVUSD = PVUSD + rSh200sfm.getSblnam();
						//SUB
						rSh200sfm.set_pvdif(rSh200sfm.get_pvdif() - rSh200sfm.getSblnam());
					// ELSE
					} else {
						//ADD
						PVUSD = PVUSD + rSh200sfm.getSblnams();
						//SUB
						rSh200sfm.set_pvdif(rSh200sfm.get_pvdif() - rSh200sfm.getSblnams());
					// ENDIF
					}
					// ELSEIF STATEMENT
				} else if (PVUSD == rSh200sfm.get_pvtot()) {
					// IF STATEMENT
					if (rItmast.getImpcod().compareTo("BAS") != 0) {
						// IF STATEMENT
						if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
							//ADD
							rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.getSblnam());
							//ADD
							rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.getSblnam());
						// ELSE
						} else {
							//ADD
							rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.getSblnams());
							//ADD
							rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.getSblnams());
						// ENDIF
						}
					// ENDIF
					}
				// ENDSL
				}
				// IF STATEMENT
				if (PVUSD > rSh200sfm.get_pvtot()) {
					//Z-SUB
					rSh200sfm.set_pvdif(0 - rSh200sfm.get_pvdif());
					// IF STATEMENT
					if (rItmast.getImpcod().compareTo("BAS") != 0) {
						//ADD
						rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.get_pvdif());
						//ADD
						rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.get_pvdif());
					// ENDIF
					}
					//Z-ADD
					PVUSD = Float.valueOf(String.valueOf(rSh200sfm.get_pvtot()));
					//Z-ADD
					rSh200sfm.set_pvdif(Float.valueOf(String.valueOf(0)));
				// ENDIF
				}
				//ADD
				RRNB = RRNB + 1;
				// IF STATEMENT
				if (rItmast.getImpcod().compareTo("BAS") != 0) {
					//ADD
					rSh200sfm.setCbadd(rSh200sfm.getCbadd() + rSh200sfm.getSbitam());
					//ADD
					rSh200sfm.setCbadd2(rSh200sfm.getCbadd2() + rSh200sfm.getSbitam());
				// ENDIF
				}
				//EXSR
				GETATTR();
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
				// ELSE
				} else {
				// ENDIF
				}
				// READE
				rQudtllaFOUND = false;
				rQudtllaEOF = true;
				while (rQudtllaPOS < rQudtllaList.size() || rQudtllaFOUND) {
					rQudtlla = rQudtllaList.get(++rQudtllaPOS);
									if (Objects.equals(String.valueOf(rQudtlla.getQdent()), String.valueOf(rQuhdr.getQuent())) && Objects.equals(String.valueOf(rQudtlla.getQdacct()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQudtlla.getQdseq()), String.valueOf(rQuhdr.getQuseq()))) {
						rQudtllaFOUND = true;
						rQudtllaEOF = false;
					} else {
						rQudtllaFOUND = false;
						rQudtllaEOF = true;
					}

				}
			//ENDDO
			} while (IN77 == true);
			//Z-ADD
			rSh200sfm.setSflpsb((int) Integer.valueOf(String.valueOf(RRNB)));
		// ENDIF
		}
	// ENDIF
	}
	// MOVEA
	IN34 = false;
	// MOVEA
	IN35 = false;
	// MOVEA
	IN36 = false;
	// MOVEA
	IN37 = false;
	// MOVEA
	IN38 = false;
	//ENDSR
	}
	
//BEGSR
	public static void $MNTQU () {
	// EVAL
	$FDBAL = Float.valueOf(String.valueOf(0));
	// EVAL
	// IF STATEMENT
	if (PO && rSh200sfm.getSaoptn().compareTo("I") != 0 && rSh200sfm.getCbpkg().compareTo("") != 0) {
		//EXSR
		CHECKST();
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getSaoptn().compareTo("I") != 0) {
		//EXSR
		$LOADD();
	// ENDIF
	}
	// MOVE
	SVPKG = String.valueOf(rSh200sfm.getCbpkg());
	// MOVE
	SVCAT = String.valueOf(rSh200sfm.getCbcat());
	// MOVE
	SVMON = String.valueOf(rSh200sfm.getCbmon());
	// IF STATEMENT
	if (rSh200sfm.getSaoptn().compareTo("I") == 0) {
		// MOVE
		rSh200sfm.setTitle(String.valueOf(TTL.get(6)));
		// ELSEIF STATEMENT
	} else if (rSh200sfm.getSaoptn().compareTo("X") == 0) {
		// MOVE
		rSh200sfm.setTitle(String.valueOf(TTL.get(5)));
	// OTHER
	} else {
		// MOVE
		rSh200sfm.setTitle(String.valueOf(TTL.get(1)));
	// ENDSL
	}
	//DOU
	do {
		// IF STATEMENT
		if (OPER.compareTo("ADD")==0) {
			// MOVE
			AAPKG = String.valueOf(" ");
			// MOVE
			AACAT = String.valueOf(" ");
			// MOVE
			rAuxadrla.setAast(String.valueOf(" "));
			// MOVE
			OPER = String.valueOf(" ");
			// EVAL
			TMPQSP = String.valueOf(" ");
			// EVAL
			// EVAL
		// ELSE
		} else {
			// MOVE
			AAPKG = String.valueOf(rSh200sfm.getCbpkg());
			// MOVE
			AACAT = String.valueOf(rSh200sfm.getCbcat());
			// MOVE
			rAuxadrla.setAast(String.valueOf(rSh200sfm.getCbst()));
			// IF STATEMENT
			if ((ldadsDS.lcamp().compareTo("RESALE") == 0 || ldadsDS.lcamp().compareTo("CANRSL") == 0) && PO) {
				// EVAL
				// EVAL
				rSh200sfm.setCbst( String.valueOf("R"));
			// ENDIF
			}
		// ENDIF
		}
		//EXSR
		$600OV();
		// IF STATEMENT
		if (RRNB == 0) {
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
				// MOVE
				rSh200sfm.setSbdsc1(String.valueOf(ERR.get(21)));
			// ELSE
			} else {
				// MOVE
				rSh200sfm.setSbdsc1s(String.valueOf(ERR.get(21)));
			// ENDIF
			}
			//ADD
			RRNB = RRNB + 1;
			//Z-ADD
			rSh200sfm.setSflpsb((int) Integer.valueOf(String.valueOf(RRNB)));
			//EXSR
			GETATTR();
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
			// ELSE
			} else {
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.get_pvpt$() != 0) {
			//DIV
			_PTWRK = (int) Integer.valueOf(String.valueOf(PVUSD / rSh200sfm.get_pvpt$()));
			//SUB
			rSh200sfm.set_ptusd(rSh200sfm.get_pvpts() - _PTWRK);
		// ENDIF
		}
		// IF STATEMENT
		if (IN72 == true) {
		// ENDIF
		}
		// IF STATEMENT
		if (IN72 == false) {
		// ENDIF
		}
		// IF STATEMENT
		if (IN98 == true) {
		// ENDIF
		}
		// MOVE
		SVWARC = String.valueOf(rSh200sfm.getCbwarc());
		// MOVE
		in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
		// MOVE
		in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
		// MOVE
		rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
		// IF STATEMENT
		if (rSh200sfm.getHbprom().compareTo("") != 0 && rSh200sfm.getHbprom().compareTo(SVPROM) != 0 && ! FIRSTPASS) {
			//EXSR
			$DISRE();
		// ENDIF
		}
		// EVAL
		// IF STATEMENT
		if (CHS) {
			//EXSR
			CHSSET();
			// EVAL
			SCRSAVE = String.valueOf(chsparmsDS.chsparms());
			// EVAL
			rSh200sfm.setIn85( String.valueOf(false));
			// EVAL
		// ENDIF
		}
		// EVAL
		rSh200sfm.setPermno( String.valueOf(""));
		// SETGT
		try {
			pmt002la.getTransaction().begin();
			qPmt002la = pmt002la.createQuery(akeypermKL("Pmt002la"), Pmt002la.class);
			rPmt002laList = qPmt002la.getResultList();
			if (rPmt002laList.size() >= 1) {
				rPmt002la = new Pmt002la();
				rPmt002laFOUND = true;
				rPmt002laEOF = false;
			} else {
				rPmt002laFOUND = false;
				rPmt002laEOF = true;
			}
			rPmt002laPOS = rPmt002laList.size();
			pmt002la.getTransaction().commit();
		} catch (Exception e) {
			pmt002la.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// IF STATEMENT
		if (! rPmt002laEOF) {
			// READPE
			rPmt002laFOUND = false;
			rPmt002laEOF = true;
			while (rPmt002laPOS > 0 || rPmt002laFOUND) {
				rPmt002la = rPmt002laList.get(--rPmt002laPOS);
							if (Objects.equals(String.valueOf(rPmt002la.getPaacct()), String.valueOf(rMktadd.getMkmms()))) {
					rPmt002laFOUND = true;
					rPmt002laEOF = false;
				} else {
					rPmt002laFOUND = false;
					rPmt002laEOF = true;
				}

			}
			// IF STATEMENT
			if (! rPmt002laEOF) {
				// EVAL
				rSh200sfm.setPermno( String.valueOf(rPmt002la.getPapno()));
			// ENDIF
			}
		// ENDIF
		}
		//EXSR
		CALCCB();
		// IF STATEMENT
		if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
		// ELSE
		} else {
			// IF STATEMENT
			if (TMPQSP1.compareTo(" ") == 0) {
				// EVAL
				TMPQSP1 = String.valueOf(rSh200sfm.getCbwarc());
				// EVAL
				TMPQSP = String.valueOf(rSh200sfm.getCbst());
			// ENDIF
			}
		// ENDIF
		}
		// CHAIN SETLL
		try {
			itusneg.getTransaction().begin();
			qItusneg = itusneg.createQuery("select c from Itusneg c where c.IUUGRP = '"+ldadsDS.luser()+"'", Itusneg.class);
			rItusnegList = qItusneg.getResultList();
			if (rItusnegList.size() >= 1) {
				rItusneg = new Itusneg();
				rItusnegFOUND = true;
				rItusnegEOF = false;
			} else {
				rItusnegFOUND = false;
				rItusnegEOF = true;
			}
			rItusnegPOS = -1;
			itusneg.getTransaction().commit();
		} catch (Exception e) {
			itusneg.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rItusnegFOUND = false;
		rItusnegEOF = true;
		while (rItusnegPOS < rItusnegList.size() || rItusnegFOUND) {
			rItusneg = rItusnegList.get(++rItusnegPOS);
				if (Objects.equals(String.valueOf(rItusneg.getIuugrp()), String.valueOf(ldadsDS.luser()))) {
				rItusnegFOUND = true;
				rItusnegEOF = false;
			} else {
				rItusnegFOUND = false;
				rItusnegEOF = true;
			}

		}
		// IF STATEMENT
		if (! rItusnegFOUND) {
			// CHAIN SETLL
			try {
				itusneg.getTransaction().begin();
				qItusneg = itusneg.createQuery("select c from Itusneg c where c.IUUGRP = '"+rRepmas.getRgrpid()+"'", Itusneg.class);
				rItusnegList = qItusneg.getResultList();
				if (rItusnegList.size() >= 1) {
					rItusneg = new Itusneg();
					rItusnegFOUND = true;
					rItusnegEOF = false;
				} else {
					rItusnegFOUND = false;
					rItusnegEOF = true;
				}
				rItusnegPOS = -1;
				itusneg.getTransaction().commit();
			} catch (Exception e) {
				itusneg.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rItusnegFOUND = false;
			rItusnegEOF = true;
			while (rItusnegPOS < rItusnegList.size() || rItusnegFOUND) {
				rItusneg = rItusnegList.get(++rItusnegPOS);
						if (Objects.equals(String.valueOf(rItusneg.getIuugrp()), String.valueOf(rRepmas.getRgrpid()))) {
					rItusnegFOUND = true;
					rItusnegEOF = false;
				} else {
					rItusnegFOUND = false;
					rItusnegEOF = true;
				}

			}
		// ENDIF
		}
		// EVAL
		// EVAL
		rSh200sfm.setGrpid( String.valueOf(" "));
		// EVAL
		// EVAL
		$SUCS2 = String.valueOf($NSUCSS);
		// EVAL
		SVCAT2 = String.valueOf(rSh200sfm.getCbcat());
		// EVAL
		SVPROM = String.valueOf(rSh200sfm.getHbprom());
		// IF STATEMENT
		if (INKQ) {
			// IF STATEMENT
			if (rSh200sfm.getCbnegp() > 0) {
				// EVAL
				$MAT = Float.valueOf(String.valueOf(rSh200sfm.getCbnegp()));
			// ELSE
			} else {
				// EVAL
				$MAT = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
			// ENDIF
			}
			// EVAL
			$ADD1 = String.valueOf(rAuxadrla.getAaadd1());
			// EVAL
			$ADD2 = String.valueOf(rAuxadrla.getAaadd2());
			// EVAL
			$CITY25 = String.valueOf(rAuxadrla.getAacity());
			// EVAL
			$STATE = String.valueOf(rAuxadrla.getAast());
			// EVAL
			$ZIP5 = String.valueOf(rAuxadrla.getAazip());
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getSaoptn().compareTo("I") != 0) {
			// EVAL
			// EVAL
		// ENDIF
		}
		// EVAL
		// EVAL
		// IF STATEMENT
		if (rSh200sfm.getSzerrm().compareTo(ERR.get(33)) == 0 && IN98 == true) {
			// EVAL
			$FLAG = String.valueOf(" ");
			// EVAL
			$FLAG4 = String.valueOf(" ");
		// ENDIF
		}
		// IF STATEMENT
		if ($FLAG.compareTo("X") == 0) {
			// MOVE
			$FLAG4 = String.valueOf("X");
		// ENDIF
		}
		// EVAL
		// EVAL
		$QPROM = String.valueOf(rSh200sfm.getHbprom());
		//EXSR
		AQSRCVAL();
		// IF STATEMENT
		if (AQSRC.compareTo("Y") != 0 && INKC == false) {
			// EVAL
			RRNZ = Integer.valueOf(String.valueOf(RRNZ + 1));
			// EVAL
			rSh200sfm.setSzerrm( String.valueOf(ERR.get(50)));
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (INKC == true) {
			// IF STATEMENT
			if ($FLAG.compareTo(" ") != 0 || $FLAG2.compareTo(" ") != 0 || $FLAG3.compareTo(" ") != 0 || $FLAG4.compareTo(" ") != 0 || $FLAG5.compareTo(" ") != 0) {
				// MOVE
				rSh200sfm.setCbpkg(String.valueOf(SVPKG));
				// MOVE
				rSh200sfm.setCbcat(String.valueOf(SVCAT2));
				// MOVE
				rSh200sfm.setCbmon(String.valueOf(SVMON));
				// MOVE
				rSh200sfm.setCbwarc(String.valueOf(SVWARC));
				// EVAL
				IN98 = Boolean.valueOf("0");
				// EVAL
				// EVAL
				//EXSR
				AVALSB();
				//EXSR
				MSGWINDSP();
				// IF STATEMENT
				if ($SLSTPE) {
					// EVAL
				// ENDIF
				}
				// IF STATEMENT
				if ($DSPPROMD == true) {
					//EXSR
					APROMD();
				// ENDIF
				}
				// IF STATEMENT
				if (IN72 == true) {
				// ENDIF
				}
				// IF STATEMENT
				if (IN72 == false) {
				// ENDIF
				}
				// MOVE
				in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
				// MOVE
				in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
				// MOVE
				rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
				//EXSR
				CALCCB();
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
				// ELSE
				} else {
				// ENDIF
				}
				// IF STATEMENT
				if ($ELECTRIC == true  && $OVERRIDE == true  && $EXCLUDED == false) {
					// EVAL
					// EVAL
					// IF STATEMENT
					if (INKL == true) {
						// EVAL
					// ENDIF
					}
				// ENDIF
				}
				// MOVE
				rSh200sfm.setRcysno(String.valueOf("Y"));
				// IF STATEMENT
				if (INKL == true) {
					// MOVE
				// ENDIF
				}
				// IF STATEMENT
				if (rSh200sfm.getRcysno().compareTo("Y") == 0) {
					//EXSR
					CHECKCI();
					// IF STATEMENT
					if (IN98 == true) {
					// ENDIF
					}
					//EXSR
					ASAVE();
				// ENDIF
				}
			// ENDIF
			}
			//EXSR
			$INTFZ();
			// MOVEA
			IN30 = false;
			// MOVEA
			IN31 = false;
			// MOVEA
			IN32 = false;
			// MOVEA
			IN33 = false;
			// MOVEA
			IN34 = false;
			// MOVEA
			IN35 = false;
			// MOVEA
			IN36 = false;
			// MOVE
			$PAS1 = String.valueOf("1");
			// EVAL
			$UPDPROM = String.valueOf(" ");
			//EXSR
			SH290();
		// ENDIF
		}
		// IF STATEMENT
		if (IN90 == true) {
			//DOW
			while (IN90 == true) {
				//EXSR
				$HELP();
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
				// ELSE
				} else {
				// ENDIF
				}
			//ENDDO
			}
		// ENDIF
		}
		// IF STATEMENT
		if (IN98 == true       || SVPKG.compareTo(rSh200sfm.getCbpkg())  != 0  || SVCAT2.compareTo(rSh200sfm.getCbcat()) != 0  || SVMON.compareTo(rSh200sfm.getCbmon())  != 0  || SVWARC.compareTo(rSh200sfm.getCbwarc()) != 0) {
		// ENDIF
		}
		// IF STATEMENT
		if (INKD == true) {
			// EVAL
			IN58 = Boolean.valueOf((String.valueOf(rSh200sfm.getSaoptn()) == String.valueOf("I")));
			//EXSR
			AANFEE();
		// ENDIF
		}
		// IF STATEMENT
		if (INKE == true) {
			//EXSR
			$WARFE();
		// ENDIF
		}
		// IF STATEMENT
		if (INKH == true  && rSh200sfm.getSaoptn().compareTo("I") != 0) {
			// IF STATEMENT
			if (rProintro.getPmintf().compareTo("Y") != 0) {
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(51)));
				// EVAL
			// ENDIF
			}
			//EXSR
			AVALSB();
			//EXSR
			$INTROWIN();
		// ENDIF
		}
		// IF STATEMENT
		if (INKR == true) {
			// CHAIN SETLL
			try {
				qutrip.getTransaction().begin();
				qQutrip = qutrip.createQuery("select c from Qutrip c where c.TUACCT = '"+ldadsDS.lmms()+"'", Qutrip.class);
				rQutripList = qQutrip.getResultList();
				if (rQutripList.size() >= 1) {
					rQutrip = new Qutrip();
					rQutripFOUND = true;
					rQutripEOF = false;
				} else {
					rQutripFOUND = false;
					rQutripEOF = true;
				}
				rQutripPOS = -1;
				qutrip.getTransaction().commit();
			} catch (Exception e) {
				qutrip.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rQutripFOUND = false;
			rQutripEOF = true;
			while (rQutripPOS < rQutripList.size() || rQutripFOUND) {
				rQutrip = rQutripList.get(++rQutripPOS);
						if (Objects.equals(String.valueOf(rQutrip.getTuacct()), String.valueOf(ldadsDS.lmms()))) {
					rQutripFOUND = true;
					rQutripEOF = false;
				} else {
					rQutripFOUND = false;
					rQutripEOF = true;
				}

			}
			// IF STATEMENT
			if (! rQutripFOUND) {
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(43)));
				// EVAL
			// ELSE
			} else {
				// EVAL
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (INKU == true) {
			// CHAIN SETLL
			try {
				quphnd.getTransaction().begin();
				qQuphnd = quphnd.createQuery("select c from Quphnd c where c.PUACCT = '"+ldadsDS.lmms()+"'", Quphnd.class);
				rQuphndList = qQuphnd.getResultList();
				if (rQuphndList.size() >= 1) {
					rQuphnd = new Quphnd();
					rQuphndFOUND = true;
					rQuphndEOF = false;
				} else {
					rQuphndFOUND = false;
					rQuphndEOF = true;
				}
				rQuphndPOS = -1;
				quphnd.getTransaction().commit();
			} catch (Exception e) {
				quphnd.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rQuphndFOUND = false;
			rQuphndEOF = true;
			while (rQuphndPOS < rQuphndList.size() || rQuphndFOUND) {
				rQuphnd = rQuphndList.get(++rQuphndPOS);
						if (Objects.equals(String.valueOf(rQuphnd.getPuacct()), String.valueOf(ldadsDS.lmms()))) {
					rQuphndFOUND = true;
					rQuphndEOF = false;
				} else {
					rQuphndFOUND = false;
					rQuphndEOF = true;
				}

			}
			// IF STATEMENT
			if (! rQuphndFOUND) {
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(43)));
				// EVAL
			// ELSE
			} else {
				// EVAL
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (INKI == true) {
			// MOVE
			ldadsDS.lzip(String.valueOf(S0ZIP));
			// EVAL
			ldadsDS.lslstp( String.valueOf(rSh200sfm.getCbst()));
			// EVAL
			// EVAL
			ldadsDS.lslstp( String.valueOf(" "));
		// ENDIF
		}
		// IF STATEMENT
		if (INKT == true) {
			// MOVE
			ldadsDS.lzip(String.valueOf(S0ZIP));
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (INKK == true) {
			// MOVE
			ldadsDS.laterr(String.valueOf(rSh200sfm.getCaterr()));
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (INKL == true) {
			// MOVE
			ldadsDS.lentf(String.valueOf("C"));
			// MOVE
			ldadsDS.lmms(String.valueOf(rSh200sfm.getCaacct()));
			// EVAL
			ldadsDS.lentn( String.valueOf(""));
			// EVAL
			ldadsDS.lprocc( String.valueOf(""));
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (INKN == true) {
			// MOVE
			ldadsDS.lpakag(String.valueOf(rSh200sfm.getCbpkg()));
			// MOVE
			ldadsDS.lpromo(String.valueOf(rSh200sfm.getHbprom()));
			// MOVE
			ldadsDS.lqucal(String.valueOf("Q"));
			// EVAL
			ldadsDS.lcmdky( String.valueOf(""));
			// EVAL
			YTERR = String.valueOf(rSh200sfm.getCaterr());
			// CHAIN SETLL
			try {
				proext.getTransaction().begin();
				qProext = proext.createQuery(proky8KL("Proext"), Proext.class);
				rProextList = qProext.getResultList();
				if (rProextList.size() >= 1) {
					rProext = new Proext();
					rProextFOUND = true;
					rProextEOF = false;
				} else {
					rProextFOUND = false;
					rProextEOF = true;
				}
				rProextPOS = -1;
				proext.getTransaction().commit();
			} catch (Exception e) {
				proext.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProextFOUND = false;
			rProextEOF = true;
			while (rProextPOS < rProextList.size() || rProextFOUND) {
				rProext = rProextList.get(++rProextPOS);
						if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(ldadsDS.lpromo()))) {
					rProextFOUND = true;
					rProextEOF = false;
				} else {
					rProextFOUND = false;
					rProextEOF = true;
				}

			}
			// IF STATEMENT
			if (! rProextFOUND) {
				// EVAL
				YTERR = String.valueOf("99999999");
				// CHAIN SETLL
				try {
					proext.getTransaction().begin();
					qProext = proext.createQuery(proky8KL("Proext"), Proext.class);
					rProextList = qProext.getResultList();
					if (rProextList.size() >= 1) {
						rProext = new Proext();
						rProextFOUND = true;
						rProextEOF = false;
					} else {
						rProextFOUND = false;
						rProextEOF = true;
					}
					rProextPOS = -1;
					proext.getTransaction().commit();
				} catch (Exception e) {
					proext.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rProextFOUND = false;
				rProextEOF = true;
				while (rProextPOS < rProextList.size() || rProextFOUND) {
					rProext = rProextList.get(++rProextPOS);
								if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(ldadsDS.lpromo()))) {
						rProextFOUND = true;
						rProextEOF = false;
					} else {
						rProextFOUND = false;
						rProextEOF = true;
					}

				}
			// ENDIF
			}
			// CHAIN SETLL
			try {
				prointro.getTransaction().begin();
				qProintro = prointro.createQuery(proky6KL("Prointro"), Prointro.class);
				rProintroList = qProintro.getResultList();
				if (rProintroList.size() >= 1) {
					rProintro = new Prointro();
					rProintroFOUND = true;
					rProintroEOF = false;
				} else {
					rProintroFOUND = false;
					rProintroEOF = true;
				}
				rProintroPOS = -1;
				prointro.getTransaction().commit();
			} catch (Exception e) {
				prointro.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProintroFOUND = false;
			rProintroEOF = true;
			while (rProintroPOS < rProintroList.size() || rProintroFOUND) {
				rProintro = rProintroList.get(++rProintroPOS);
						if (Objects.equals(String.valueOf(rProintro.getPmtown()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProintro.getPmprcd()), String.valueOf(rPromstlb.getPmcode()))) {
					rProintroFOUND = true;
					rProintroEOF = false;
				} else {
					rProintroFOUND = false;
					rProintroEOF = true;
				}

			}
			// IF STATEMENT
			if (rProextFOUND && rProext.getPmrcfl().compareTo("Y") == 0) {
				// CHAIN SETLL
				try {
					cpnacflb.getTransaction().begin();
					qCpnacflb = cpnacflb.createQuery(cpnkeyKL("Cpnacflb"), Cpnacflb.class);
					rCpnacflbList = qCpnacflb.getResultList();
					if (rCpnacflbList.size() >= 1) {
						rCpnacflb = new Cpnacflb();
						rCpnacflbFOUND = true;
						rCpnacflbEOF = false;
					} else {
						rCpnacflbFOUND = false;
						rCpnacflbEOF = true;
					}
					rCpnacflbPOS = -1;
					cpnacflb.getTransaction().commit();
				} catch (Exception e) {
					cpnacflb.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rCpnacflbFOUND = false;
				rCpnacflbEOF = true;
				while (rCpnacflbPOS < rCpnacflbList.size() || rCpnacflbFOUND) {
					rCpnacflb = rCpnacflbList.get(++rCpnacflbPOS);
								if (Objects.equals(String.valueOf(rCpnacflb.getCmmsno()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rCpnacflb.getCpromo()), String.valueOf(ldadsDS.lpromo()))) {
						rCpnacflbFOUND = true;
						rCpnacflbEOF = false;
					} else {
						rCpnacflbFOUND = false;
						rCpnacflbEOF = true;
					}

				}
				// CHAIN SETLL
				try {
					ofrmntflb.getTransaction().begin();
					qOfrmntflb = ofrmntflb.createQuery(cpnkeyKL("Ofrmntflb"), Ofrmntflb.class);
					rOfrmntflbList = qOfrmntflb.getResultList();
					if (rOfrmntflbList.size() >= 1) {
						rOfrmntflb = new Ofrmntflb();
						rOfrmntflbFOUND = true;
						rOfrmntflbEOF = false;
					} else {
						rOfrmntflbFOUND = false;
						rOfrmntflbEOF = true;
					}
					rOfrmntflbPOS = -1;
					ofrmntflb.getTransaction().commit();
				} catch (Exception e) {
					ofrmntflb.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rOfrmntflbFOUND = false;
				rOfrmntflbEOF = true;
				while (rOfrmntflbPOS < rOfrmntflbList.size() || rOfrmntflbFOUND) {
					rOfrmntflb = rOfrmntflbList.get(++rOfrmntflbPOS);
								if (Objects.equals(String.valueOf(rOfrmntflb.getOacct_()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rOfrmntflb.getOpromo()), String.valueOf(ldadsDS.lpromo()))) {
						rOfrmntflbFOUND = true;
						rOfrmntflbEOF = false;
					} else {
						rOfrmntflbFOUND = false;
						rOfrmntflbEOF = true;
					}

				}
				// IF STATEMENT
				if (! rCpnacflbFOUND && ! rOfrmntflbFOUND) {
					// EVAL
					ldadsDS.lpromo( String.valueOf(rSh200sfm.getHbprom()));
					// EVAL
					RRNZ = Integer.valueOf(String.valueOf(RRNZ + 1));
					// EVAL
					rSh200sfm.setSzerrm( String.valueOf(ERR.get(43)));
					// EVAL
				// ENDIF
				}
				// IF STATEMENT
				if (rCpnacflbFOUND && rOfrmntflbFOUND) {
					// IF STATEMENT
					if (rCpnacflb.getCexpdt().compareTo(rOfrmntflb.getOexpdt()) < 0) {
						// EVAL
						rCpnacflb.setCexpdt( String.valueOf(rOfrmntflb.getOexpdt()));
					// ENDIF
					}
					// ELSEIF STATEMENT
				} else if (rOfrmntflbFOUND) {
					// EVAL
					rCpnacflb.setCexpdt( String.valueOf(rOfrmntflb.getOexpdt()));
				// ENDSL
				}
				// EVAL
				$DATEN =new Date(Integer.parseInt(rCpnacflb.getCexpdt()));
				//ADDDUR
				Calendar calendar = Calendar.getInstance();
				calendar.setTime($DATEN);
				calendar.add(Calendar.DATE, 15);
				$DATEN = calendar.getTime();
				// EVAL
				$NUMD = Integer.valueOf(String.valueOf(Integer.parseInt(String.valueOf($DATEN))));
				// EVAL
				$DATEC = Integer.valueOf(String.valueOf(Integer.parseInt(String.valueOf(new Date()))));
				// IF STATEMENT
				if ($NUMD < $DATEC) {
					// EVAL
					ldadsDS.lpromo( String.valueOf(rSh200sfm.getHbprom()));
					// EVAL
					RRNZ = Integer.valueOf(String.valueOf(RRNZ + 1));
					// EVAL
					rSh200sfm.setSzerrm( String.valueOf(ERR.get(44)));
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
			// EVAL
			ldadsDS.lqucal( String.valueOf(""));
			// EVAL
			$QPROM = String.valueOf(rSh200sfm.getHbprom());
			//EXSR
			AQSRCVAL();
			// IF STATEMENT
			if (AQSRC.compareTo("Y") != 0) {
				// EVAL
				RRNZ = Integer.valueOf(String.valueOf(RRNZ + 1));
				// EVAL
				rSh200sfm.setSzerrm( String.valueOf(ERR.get(50)));
				// EVAL
			// ENDIF
			}
			// IF STATEMENT
			if (ldadsDS.lpromo().compareTo(rSh200sfm.getHbprom()) != 0) {
				// MOVE
				rSh200sfm.setHbprom(String.valueOf(ldadsDS.lpromo()));
				//EXSR
				$DISRE();
				//EXSR
				AVALSB();
				//EXSR
				APROMD();
				// IF STATEMENT
				if (rSh200sfm.getErmsg1().compareTo("") != 0) {
					// EVAL
					APRMFLG = Integer.valueOf(String.valueOf(1));
				// ENDIF
				}
				//EXSR
				$INTFZ();
				// EVAL
				APRMFLG = Integer.valueOf(String.valueOf(0));
			// ENDIF
			}
			// MOVE
			ldadsDS.lpromo(String.valueOf(S0PROM));
			// IF STATEMENT
			if (rProintro.getPmintf().compareTo("Y") == 0) {
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (INKG == true) {
			// EVAL
			_ITNEG = Float.valueOf(String.valueOf(0));
			// EVAL
			// EVAL
			//EXSR
			AVALSB();
			//EXSR
			CALCCB();
			//EXSR
			MSGWINDSP();
			// IF STATEMENT
			if ($SLSTPE) {
				// EVAL
			// ENDIF
			}
			//Z-ADD
			SVB$AD = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
			//Z-ADD
			SVMFWT = Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt()));
			//Z-ADD
			SVPERM = Float.valueOf(String.valueOf(rSh200sfm.getCbperm()));
			// IF STATEMENT
			if (IN72 == true) {
			// ENDIF
			}
			// IF STATEMENT
			if (IN72 == false) {
			// ENDIF
			}
			// MOVE
			in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
			// MOVE
			in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
			// MOVE
			rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
			// ELSE
			} else {
			// ENDIF
			}
			// EVAL
			USAACHK = Integer.valueOf(String.valueOf(ldadsDS.lqsrc().indexOf("USAA")));
			// EVAL
			USAACHK = Integer.valueOf(String.valueOf(0));
			// IF STATEMENT
			if (USAACHK== 0) {
				// IF STATEMENT
				if (rProintro.getPmintf().compareTo("Y") == 0) {
				// ENDIF
				}
				//EXSR
				$NEGPR();
				//EXSR
				APRCOR();
			// ELSE
			} else {
				//DOU
				do {
				//ENDDO
				} while (INKC == true  || INKJ == true);
				// IF STATEMENT
				if (INKC == false) {
				// ELSE
				} else {
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (INKP == true) {
			//EXSR
			APROMD();
			//EXSR
			$INTFZ();
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getSaoptn().compareTo("C") == 0 || rSh200sfm.getSaoptn().compareTo("X") == 0 || rSh200sfm.getSaoptn().compareTo("A") == 0) {
			//EXSR
			$INTFZ();
			// MOVEA
			IN30 = false;
			// MOVEA
			IN31 = false;
			// MOVEA
			IN32 = false;
			// MOVEA
			IN33 = false;
			// MOVEA
			IN34 = false;
			// MOVEA
			IN35 = false;
			// MOVEA
			IN36 = false;
			// EVAL
			// EVAL
			//EXSR
			AVALSB();
			//EXSR
			CALCCB();
			//EXSR
			MSGWINDSP();
			// IF STATEMENT
			if ($SLSTPE) {
				// EVAL
			// ENDIF
			}
			// IF STATEMENT
			if ($DSPPROMW == true) {
				// EVAL
				// EVAL
				RRNZ = Integer.valueOf(String.valueOf(RRNZ + 1));
				// EVAL
				rSh200sfm.setSzerrm( String.valueOf(ERR.get(52)));
				// EVAL
				// EVAL
			// ENDIF
			}
			// IF STATEMENT
			if ($DSPPROMD == true) {
				//EXSR
				APROMD();
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.getCbnegp() != 0 && rSh200sfm.getCbb$ad() != SVB$AD) {
				//Z-ADD
				rSh200sfm.setCbnegp(Float.valueOf(String.valueOf(0)));
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(12)));
				// EVAL
				// EVAL
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.getCbngmp() != 0 && rSh200sfm.getCbmfwt() != SVMFWT) {
				//Z-ADD
				rSh200sfm.setCbngmp(Float.valueOf(String.valueOf(0)));
				//Z-ADD
				rSh200sfm.setCbmnmp(Float.valueOf(String.valueOf(0)));
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(14)));
				// EVAL
				// EVAL
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.getCbngpp() != 0 && rSh200sfm.getCbperm() != SVPERM) {
				//Z-ADD
				rSh200sfm.setCbngpp(Float.valueOf(String.valueOf(0)));
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(22)));
				// EVAL
				// EVAL
			// ENDIF
			}
			//Z-ADD
			SVB$AD = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
			//Z-ADD
			SVMFWT = Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt()));
			//Z-ADD
			SVPERM = Float.valueOf(String.valueOf(rSh200sfm.getCbperm()));
		// ENDIF
		}
		// IF STATEMENT
		if (IN98 == false  && IN76 == true) {
			// EVAL
		// ELSE
		} else {
			// EVAL
		// ENDIF
		}
	//ENDDO
	} while (INKS == true  || INKC == true  || INKJ == true);
	// IF STATEMENT
	if (rSh200sfm.getSaoptn().compareTo("A") == 0 || rSh200sfm.getSaoptn().compareTo("C") == 0 || rSh200sfm.getSaoptn().compareTo("X") == 0) {
		// IF STATEMENT
		if ($ELECTRIC == true  && $OVERRIDE == true  && $EXCLUDED == false) {
			// EVAL
			// EVAL
			// EVAL
			// EVAL
			// IF STATEMENT
			if (INKL == true) {
				// EVAL
			// ENDIF
			}
		// ENDIF
		}
		// EVAL
		//EXSR
		ASAVE();
		// EVAL
	// ENDIF
	}
	// IF STATEMENT
	if (INKJ == true) {
		// IF STATEMENT
		if (rSh200sfm.getCbperm() == 0 && rSh200sfm.getCbngpp() == 0) {
			// MOVE
			ldadsDS.lzip(String.valueOf(S0ZIP));
			// EVAL
			ldadsDS.lslstp( String.valueOf(rSh200sfm.getCbst()));
			// EVAL
			// EVAL
			ldadsDS.lslstp( String.valueOf(" "));
		// ENDIF
		}
		// EVAL
		// IF STATEMENT
		if (CHS && (ldadsDS.lcamp().compareTo("F16") == 0 || ldadsDS.lcamp().compareTo("CAN") == 0)) {
			//EXSR
			CHSCONFIRM();
			// IF STATEMENT
			if (INKC) {
			// ENDIF
			}
		// ENDIF
		}
		// EVAL
		MPKG = String.valueOf(rSh200sfm.getCbpkg());
		//EXSR
		MULTIPKGAB();
		// IF STATEMENT
		if (IN98) {
			// EVAL
		// ENDIF
		}
		// EVAL
		MPKG = String.valueOf(rSh200sfm.getCbpkg());
		//EXSR
		MULTIPKG();
		// IF STATEMENT
		if (IN98) {
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getSaoptn().compareTo("I") == 0) {
			// MOVE
			ldadsDS.lquseq(String.valueOf(rSh200sfm.getHaseq()));
		// ELSE
		} else {
			// EVAL
			// MOVE
			ldadsDS.lquseq(String.valueOf(CBSEQ0));
		// ENDIF
		}
		// EVAL
		$FACCT = String.valueOf(ldadsDS.lmms());
		// MOVE
		$FSEQ = Integer.valueOf(String.valueOf(ldadsDS.lquseq()));
		// IF STATEMENT
		if (ldadsDS.lcamp().compareTo("BUSI") == 0 || ldadsDS.lcamp().compareTo("F16") == 0 || ldadsDS.lcamp().compareTo("MARSH") == 0 || ldadsDS.lcamp().compareTo("CAN   ") == 0 || ldadsDS.lcamp().compareTo("CANBUS") == 0 || ldadsDS.lcamp().compareTo("CANRSL") == 0 || ldadsDS.lcamp().compareTo("DICON") == 0) {
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("F16") == 0 || ldadsDS.lcamp().compareTo("CAN  ") == 0) {
				// EVAL
				$FACCT = String.valueOf(ldadsDS.lmms());
				// EVAL
				$FSEQ = Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
				// CHAIN SETLL
				try {
					qufdtl.getTransaction().begin();
					qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
					rQufdtlList = qQufdtl.getResultList();
					if (rQufdtlList.size() >= 1) {
						rQufdtl = new Qufdtl();
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}
					rQufdtlPOS = -1;
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
				while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
					rQufdtl = rQufdtlList.get(++rQufdtlPOS);
								if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQufdtl.getFdseq()), String.valueOf($FSEQ))) {
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}

				}
				// IF STATEMENT
				if (! rQufdtlFOUND) {
					// EVAL
					$ACCT = String.valueOf(rSh200sfm.getCbacct());
					//EXSR
					$CHKQF();
					// IF STATEMENT
					if ($COUNTER > 1) {
						//ADD
						RRNZ = RRNZ + 1;
						// MOVE
						rSh200sfm.setSzerrm(String.valueOf(ERR.get(26)));
						// EVAL
						// EVAL
						// ELSEIF STATEMENT
					} else if ($COUNTER == 1) {
						// CHAIN SETLL
						try {
							qufdtl.getTransaction().begin();
							qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+$ACCT+"'", Qufdtl.class);
							rQufdtlList = qQufdtl.getResultList();
							if (rQufdtlList.size() >= 1) {
								rQufdtl = new Qufdtl();
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}
							rQufdtlPOS = -1;
							qufdtl.getTransaction().commit();
						} catch (Exception e) {
							qufdtl.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
						while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
							rQufdtl = rQufdtlList.get(++rQufdtlPOS);
												if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}

						}
						// IF STATEMENT
						if (rQufdtlFOUND) {
							// CHAIN SETLL
							try {
								quhdr.getTransaction().begin();
								qQuhdr = quhdr.createQuery(quhkyKL("Quhdr"), Quhdr.class);
								rQuhdrList = qQuhdr.getResultList();
								if (rQuhdrList.size() >= 1) {
									rQuhdr = new Quhdr();
									rQuhdrFOUND = true;
									rQuhdrEOF = false;
								} else {
									rQuhdrFOUND = false;
									rQuhdrEOF = true;
								}
								rQuhdrPOS = -1;
								quhdr.getTransaction().commit();
							} catch (Exception e) {
								quhdr.getTransaction().rollback();
								e.printStackTrace();
							}
							finally{
								emf.close();
							}
							// CHAIN READE
							rQuhdrFOUND = false;
							rQuhdrEOF = true;
							while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
								rQuhdr = rQuhdrList.get(++rQuhdrPOS);
														if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf($ACCT)) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtl.getFdseq()))) {
									rQuhdrFOUND = true;
									rQuhdrEOF = false;
								} else {
									rQuhdrFOUND = false;
									rQuhdrEOF = true;
								}

							}
							// IF STATEMENT
							if (rQuhdrFOUND) {
								// EVAL
								$PAK = String.valueOf(rQuhdr.getQupkg());
								// ELSEIF STATEMENT
							} else if (ldadsDS.lcamp().compareTo("F16") == 0) {
								// IF STATEMENT
								if ($PAK.substring(0, 5) != "SW VV" && rSh200sfm.getCbpkg().substring(0, 5) != "SW VV" || $PAK.substring(0, 5) == "SW VV" && rSh200sfm.getCbpkg().substring(0, 5) == "SW VV") {
									// IF STATEMENT
									if ($PAK.substring(0, 5) != "SW VI" && rSh200sfm.getSapkg().substring(0, 5) != "SW VI" || $PAK.substring(0, 5) == "SW VI" && rSh200sfm.getSapkg().substring(0, 5) == "SW VI") {
										//ADD
										RRNZ = RRNZ + 1;
										// MOVE
										rSh200sfm.setSzerrm(String.valueOf(ERR.get(27)));
										// EVAL
										// EVAL
									// ENDIF
									}
								// ENDIF
								}
								// ELSEIF STATEMENT
							} else if (ldadsDS.lcamp().compareTo("CAN   ") == 0) {
							// ENDSL
							}
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if ($COUNTER == 0) {
						//Z-ADD
						C1 = (int) Integer.valueOf(String.valueOf(1));
					// ENDSL
					}
				// ENDIF
				}
			// ENDIF
			}
			// CHAIN SETLL
			try {
				qufdtl.getTransaction().begin();
				qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
				rQufdtlList = qQufdtl.getResultList();
				if (rQufdtlList.size() >= 1) {
					rQufdtl = new Qufdtl();
					rQufdtlFOUND = true;
					rQufdtlEOF = false;
				} else {
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
				}
				rQufdtlPOS = -1;
				qufdtl.getTransaction().commit();
			} catch (Exception e) {
				qufdtl.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
			while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
				rQufdtl = rQufdtlList.get(++rQufdtlPOS);
						if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQufdtl.getFdseq()), String.valueOf($FSEQ))) {
					rQufdtlFOUND = true;
					rQufdtlEOF = false;
				} else {
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
				}

			}
			// IF STATEMENT
			if (! rQufdtlFOUND) {
				// EVAL
				rQufdtl.setFdmms( String.valueOf(ldadsDS.lmms()));
				// MOVE
				rQufdtl.setFdseq(Integer.valueOf(String.valueOf(ldadsDS.lquseq())));
				//EXSR
				ATRIPC();
				// IF STATEMENT
				if (INKC) {
				// ENDIF
				}
				// WRITE
				try {
					qufdtl.getTransaction().begin();
					qufdtl.persist(rQufdtl);
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// EVAL
			// ELSE
			} else {
				//EXSR
				ATRIPC();
				// IF STATEMENT
				if (INKC) {
				// ENDIF
				}
			// ENDIF
			}
		// ELSE
		} else {
			// SETLL
			try {
				qufdtl.getTransaction().begin();
				qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+rQuhdr.getQuacct()+"'", Qufdtl.class);
				rQufdtlList = qQufdtl.getResultList();
				if (rQufdtlList.size() >= 1) {
					rQufdtl = new Qufdtl();
					rQufdtlFOUND = true;
					rQufdtlEOF = false;
				} else {
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
				}
				rQufdtlPOS = -1;
				qufdtl.getTransaction().commit();
			} catch (Exception e) {
				qufdtl.getTransaction().rollback();
			e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// IF STATEMENT
			if (! rQufdtlFOUND) {
				// EVAL
				rQufdtl.setFdmms( String.valueOf(ldadsDS.lmms()));
				// MOVE
				rQufdtl.setFdseq(Integer.valueOf(String.valueOf(ldadsDS.lquseq())));
				//EXSR
				ATRIPC();
				// IF STATEMENT
				if (INKC) {
				// ENDIF
				}
				// WRITE
				try {
					qufdtl.getTransaction().begin();
					qufdtl.persist(rQufdtl);
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// EVAL
			// ELSE
			} else {
				// CHAIN SETLL
				try {
					qufdtl.getTransaction().begin();
					qQufdtl = qufdtl.createQuery($fdkyKL("Qufdtl"), Qufdtl.class);
					rQufdtlList = qQufdtl.getResultList();
					if (rQufdtlList.size() >= 1) {
						rQufdtl = new Qufdtl();
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}
					rQufdtlPOS = -1;
					qufdtl.getTransaction().commit();
				} catch (Exception e) {
					qufdtl.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
				while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
					rQufdtl = rQufdtlList.get(++rQufdtlPOS);
								if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($FACCT)) && Objects.equals(String.valueOf(rQufdtl.getFdseq()), String.valueOf($FSEQ))) {
						rQufdtlFOUND = true;
						rQufdtlEOF = false;
					} else {
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
					}

				}
				// IF STATEMENT
				if (! rQufdtlFOUND) {
					// SETLL
					try {
						qufdtl.getTransaction().begin();
						qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+rQuhdr.getQuacct()+"'", Qufdtl.class);
						rQufdtlList = qQufdtl.getResultList();
						if (rQufdtlList.size() >= 1) {
							rQufdtl = new Qufdtl();
							rQufdtlFOUND = true;
							rQufdtlEOF = false;
						} else {
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
						}
						rQufdtlPOS = -1;
						qufdtl.getTransaction().commit();
					} catch (Exception e) {
						qufdtl.getTransaction().rollback();
					e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// READE
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
					while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
						rQufdtl = rQufdtlList.get(++rQufdtlPOS);
								if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf(rQuhdr.getQuacct()))) {
							rQufdtlFOUND = true;
							rQufdtlEOF = false;
						} else {
							rQufdtlFOUND = false;
							rQufdtlEOF = true;
						}

					}
					//DOW
					while (! rQufdtlEOF) {
						// DELETE
						try {
							qufdtl.getTransaction().begin();
							qufdtl.remove(rQufdtl);
							qufdtl.getTransaction().commit();
						} catch (Exception e) {
							qufdtl.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// READE
						rQufdtlFOUND = false;
						rQufdtlEOF = true;
						while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
							rQufdtl = rQufdtlList.get(++rQufdtlPOS);
									if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf(rQuhdr.getQuacct()))) {
								rQufdtlFOUND = true;
								rQufdtlEOF = false;
							} else {
								rQufdtlFOUND = false;
								rQufdtlEOF = true;
							}

						}
					//ENDDO
					}
					// EVAL
					rQufdtl.setFdmms( String.valueOf(ldadsDS.lmms()));
					// MOVE
					rQufdtl.setFdseq(Integer.valueOf(String.valueOf(ldadsDS.lquseq())));
					//EXSR
					ATRIPC();
					// IF STATEMENT
					if (INKC) {
					// ENDIF
					}
					// WRITE
					try {
						qufdtl.getTransaction().begin();
						qufdtl.persist(rQufdtl);
						qufdtl.getTransaction().commit();
					} catch (Exception e) {
						qufdtl.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (ldadsDS.lquseq().trim().length()!=3) {
			// EVAL
			ldadsDS.lquseq( String.valueOf("0000".substring(0, 3-ldadsDS.lquseq().trim().length()+0) + ldadsDS.lquseq().trim()));
		// ENDIF
		}
		// MOVE
		$PAS1 = String.valueOf("0");
		// EVAL
		$UPDPROM = String.valueOf(rSh200sfm.getHbprom());
		//EXSR
		SH290();
		// EVAL
		// IF STATEMENT
		if ($PRCNEGU) {
			// EVAL
			// CHAIN SETLL
			try {
				qufinl.getTransaction().begin();
				qQufinl = qufinl.createQuery(quhkeyKL("Qufinl"), Qufinl.class);
				rQufinlList = qQufinl.getResultList();
				if (rQufinlList.size() >= 1) {
					rQufinl = new Qufinl();
					rQufinlFOUND = true;
					rQufinlEOF = false;
				} else {
					rQufinlFOUND = false;
					rQufinlEOF = true;
				}
				rQufinlPOS = -1;
				qufinl.getTransaction().commit();
			} catch (Exception e) {
				qufinl.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rQufinlFOUND = false;
			rQufinlEOF = true;
			while (rQufinlPOS < rQufinlList.size() || rQufinlFOUND) {
				rQufinl = rQufinlList.get(++rQufinlPOS);
						if (Objects.equals(String.valueOf(rQufinl.getQfent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQufinl.getQfacct()), String.valueOf(rSh200sfm.getCaacct()))) {
					rQufinlFOUND = true;
					rQufinlEOF = false;
				} else {
					rQufinlFOUND = false;
					rQufinlEOF = true;
				}

			}
			// IF STATEMENT
			if (rQufinlFOUND) {
				// SETLL
				try {
					quhneg.getTransaction().begin();
					qQuhneg = quhneg.createQuery(quhky2KL("Quhneg"), Quhneg.class);
					rQuhnegList = qQuhneg.getResultList();
					if (rQuhnegList.size() >= 1) {
						rQuhneg = new Quhneg();
						rQuhnegFOUND = true;
						rQuhnegEOF = false;
					} else {
						rQuhnegFOUND = false;
						rQuhnegEOF = true;
					}
					rQuhnegPOS = -1;
					quhneg.getTransaction().commit();
				} catch (Exception e) {
					quhneg.getTransaction().rollback();
				e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// READE
				rQuhnegFOUND = false;
				rQuhnegEOF = true;
				while (rQuhnegPOS < rQuhnegList.size() || rQuhnegFOUND) {
					rQuhneg = rQuhnegList.get(++rQuhnegPOS);
									if (Objects.equals(String.valueOf(rQuhneg.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhneg.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhneg.getQuseq()), String.valueOf(CBSEQ0))) {
						rQuhnegFOUND = true;
						rQuhnegEOF = false;
					} else {
						rQuhnegFOUND = false;
						rQuhnegEOF = true;
					}

				}
				// IF STATEMENT
				if (! rQuhnegEOF) {
					// EVAL
					rQuhneg.setQurpid( String.valueOf(rQufinl.getQfrpid()));
					// UPDATE
					try {
						quhneg.getTransaction().begin();
						quhneg.getTransaction().commit();
					} catch (Exception e) {
						quhneg.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (USAA_CC == true) {
			// EVAL
			USAACHK = Integer.valueOf(String.valueOf(ldadsDS.lqsrc().indexOf("USAA")));
			// IF STATEMENT
			if (USAACHK > 0) {
				// CHAIN SETLL
				try {
					quhdr.getTransaction().begin();
					qQuhdr = quhdr.createQuery(qdtlKL("Quhdr"), Quhdr.class);
					rQuhdrList = qQuhdr.getResultList();
					if (rQuhdrList.size() >= 1) {
						rQuhdr = new Quhdr();
						rQuhdrFOUND = true;
						rQuhdrEOF = false;
					} else {
						rQuhdrFOUND = false;
						rQuhdrEOF = true;
					}
					rQuhdrPOS = -1;
					quhdr.getTransaction().commit();
				} catch (Exception e) {
					quhdr.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
				while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
					rQuhdr = rQuhdrList.get(++rQuhdrPOS);
								if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rQuhdr.getQuent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQuhdr.getQuseq()))) {
						rQuhdrFOUND = true;
						rQuhdrEOF = false;
					} else {
						rQuhdrFOUND = false;
						rQuhdrEOF = true;
					}

				}
				// IF STATEMENT
				if (rQuhdrFOUND) {
					// EVAL
					rSh200sfm.setCbfire( Float.valueOf(String.valueOf(rQuhdr.getQufire())));
				// ENDIF
				}
				//DIV
				rSh200sfm.setCbmfir(rSh200sfm.getCbfire() / 12);
				// EVAL
				rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam())));
				// EVAL
				rSh200sfm.setCbmmfw( Float.valueOf(String.valueOf(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir() + rSh200sfm.getCbmwrf() + rSh200sfm.getCbanmm())));
				// IF STATEMENT
				if (rSh200sfm.getCbcat().compareTo(rQuhdr.getQucat()) != 0) {
					// EVAL
					rSh200sfm.setCbcat( String.valueOf(rQuhdr.getQucat()));
					//EXSR
					APRCOR();
					// EVAL
					$PRSRFLG = String.valueOf("1");
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if ($PRSRFLG.compareTo("0") == 0) {
			//EXSR
			APRCOR();
		// ELSE
		} else {
			// EVAL
			$PRSRFLG = String.valueOf("0");
		// ENDIF
		}
	// ELSE
	} else {
		// MOVE
		$PAS1 = String.valueOf("1");
		// EVAL
		$UPDPROM = String.valueOf(" ");
		//EXSR
		SH290();
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void ASAVE () {
	//DO
	for (int a0 = 0; a0 < 100; a0++) {
	//ENDDO
	}
	// IF STATEMENT
	if (rSh200sfm.getSaoptn().compareTo("A") == 0 || rSh200sfm.getSaoptn().compareTo("C") == 0) {
		// SETGT
		try {
			quhdr.getTransaction().begin();
			qQuhdr = quhdr.createQuery(quhkeyKL("Quhdr"), Quhdr.class);
			rQuhdrList = qQuhdr.getResultList();
			if (rQuhdrList.size() >= 1) {
				rQuhdr = new Quhdr();
				rQuhdrFOUND = true;
				rQuhdrEOF = false;
			} else {
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
			}
			rQuhdrPOS = rQuhdrList.size();
			quhdr.getTransaction().commit();
		} catch (Exception e) {
			quhdr.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		//DOU
		do {
			// READPE
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
			while (rQuhdrPOS > 0 || rQuhdrFOUND) {
				rQuhdr = rQuhdrList.get(--rQuhdrPOS);
							if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct()))) {
					rQuhdrFOUND = true;
					rQuhdrEOF = false;
				} else {
					rQuhdrFOUND = false;
					rQuhdrEOF = true;
				}

			}
			// IF STATEMENT
			if (IN80 == true) {
				//Z-ADD
				COUNT0 = (int) Integer.valueOf(String.valueOf(1));
				//EXSR
				$ERROR();
			// ENDIF
			}
		//ENDDO
		} while (IN80 == false);
		// IF STATEMENT
		if (IN79 == false) {
			//ADD
			CBSEQ0 = rQuhdr.getQuseq() + 1;
		// ELSE
		} else {
			//Z-ADD
			CBSEQ0 = (int) Integer.valueOf(String.valueOf(1));
		// ENDIF
		}
	// ELSE
	} else {
		//Z-ADD
		CBSEQ0 = (int) Integer.valueOf(String.valueOf(rSh200sfm.getHaseq()));
	// ENDIF
	}
	//DOU
	do {
		// CHAIN SETLL
		try {
			quhdr.getTransaction().begin();
			qQuhdr = quhdr.createQuery(quhky2KL("Quhdr"), Quhdr.class);
			rQuhdrList = qQuhdr.getResultList();
			if (rQuhdrList.size() >= 1) {
				rQuhdr = new Quhdr();
				rQuhdrFOUND = true;
				rQuhdrEOF = false;
			} else {
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
			}
			rQuhdrPOS = -1;
			quhdr.getTransaction().commit();
		} catch (Exception e) {
			quhdr.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdrFOUND = false;
		rQuhdrEOF = true;
		while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
			rQuhdr = rQuhdrList.get(++rQuhdrPOS);
				if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(CBSEQ0))) {
				rQuhdrFOUND = true;
				rQuhdrEOF = false;
			} else {
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
			}

		}
		// IF STATEMENT
		if (IN80 == true) {
			//Z-ADD
			COUNT0 = (int) Integer.valueOf(String.valueOf(1));
			//EXSR
			$ERROR();
		// ENDIF
		}
	//ENDDO
	} while (IN80 == false);
	// EVAL
	rQuhdr.setQustat( String.valueOf(""));
	// MOVE
	rQuhdr.setQuent(String.valueOf(rSh200sfm.getCaent()));
	// MOVE
	rQuhdr.setQuacct(String.valueOf(rSh200sfm.getCaacct()));
	//Z-ADD
	rQuhdr.setQuseq((int) Integer.valueOf(String.valueOf(CBSEQ0)));
	// MOVE
	rQuhdr.setQuterr(String.valueOf(rSh200sfm.getCaterr()));
	// MOVE
	rQuhdr.setQupkg(String.valueOf(rSh200sfm.getCbpkg()));
	// MOVE
	rQuhdr.setQustyp(String.valueOf(rPakmst.getPkstyp()));
	// MOVE
	rQuhdr.setQucat(String.valueOf(rSh200sfm.getCbcat()));
	// MOVE
	rQuhdr.setQuwarc(String.valueOf(rSh200sfm.getCbwarc()));
	//Z-ADD
	rQuhdr.setQuwrfe(Float.valueOf(String.valueOf(rSh200sfm.getCbwrfe())));
	//Z-ADD
	rQuhdr.setQufire(Float.valueOf(String.valueOf(rSh200sfm.getCbfire())));
	//Z-ADD
	rQuhdr.setQudsam(Float.valueOf(String.valueOf(rSh200sfm.getCbadam())));
	// MOVE
	rQuhdr.setQumon(String.valueOf(rSh200sfm.getCbmon()));
	// IF STATEMENT
	if (rSh200sfm.getCbccds().compareTo("") == 0) {
		// MOVE
		rQuhdr.setQuccds(String.valueOf("N"));
	// ELSE
	} else {
		// MOVE
		rQuhdr.setQuccds(String.valueOf(rSh200sfm.getCbccds()));
	// ENDIF
	}
	//Z-ADD
	rQuhdr.setQudamt(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rQuhdr.setQubase(Float.valueOf(String.valueOf(rSh200sfm.getCbbase())));
	//Z-ADD
	rQuhdr.setQuadd(Float.valueOf(String.valueOf(rSh200sfm.getCbadd())));
	//Z-ADD
	rQuhdr.setQuads$(Float.valueOf(String.valueOf(rSh200sfm.getCbadd$())));
	//Z-ADD
	rQuhdr.setQunegp(Float.valueOf(String.valueOf(rSh200sfm.getCbnegp())));
	//Z-ADD
	rQuhdr.setQumntr(Float.valueOf(String.valueOf(rSh200sfm.getCbmntr())));
	//Z-ADD
	rQuhdr.setQungmp(Float.valueOf(String.valueOf(rSh200sfm.getCbngmp())));
	//Z-ADD
	rQuhdr.setQungpp(Float.valueOf(String.valueOf(rSh200sfm.getCbngpp())));
	//Z-ADD
	rQuhdr.setQuperm(Float.valueOf(String.valueOf(rSh200sfm.getCbperm())));
	//DIV
	rQuhdr.setQuinhr((int) Integer.valueOf(String.valueOf(TOTMN0 / 60)));
	//MVR
	rQuhdr.setQuinmn(TOTMN0 % 60);
	//MULT
	Calendar calendar = Calendar.getInstance();
	WRKDT0 = (int) (Integer.valueOf(String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf(calendar.get(Calendar.MONTH)+1) + String.valueOf(calendar.get(Calendar.DAY_OF_MONTH))) * 10000.0001);
	// IF STATEMENT
	if (rSh200sfm.getSaoptn().compareTo("A") == 0 || rSh200sfm.getSaoptn().compareTo("C") == 0) {
		// MOVE
		rQuhdr.setQuentd(String.valueOf(WRKDT0));
	// ENDIF
	}
	// MOVE
	rQuhdr.setQulupd(String.valueOf(WRKDT0));
	// MOVE
	rQuhdr.setQulupu(String.valueOf(USR08A));
	// IF STATEMENT
	if (rSh200sfm.getSaoptn().compareTo("A") == 0 || rSh200sfm.getSaoptn().compareTo("C") == 0) {
		// MOVE
		rQuhdr.setQulupt(String.valueOf(WRKTM0));
	// ENDIF
	}
	// MOVE
	rQuhdr.setQuprom(String.valueOf(rSh200sfm.getHbprom()));
	// MOVE
	rQuhdr.setQudsal(String.valueOf(rSh200sfm.getHbdsal()));
	//Z-ADD
	rQuhdr.setQudsam(Float.valueOf(String.valueOf(rSh200sfm.getHbdsam())));
	//Z-ADD
	rQuhdr.setQudspc(Float.valueOf(String.valueOf(rSh200sfm.getHbdspc())));
	// MOVE
	rQuhdr.setQuanal(String.valueOf(rSh200sfm.getHbanal()));
	//Z-ADD
	rQuhdr.setQuands(Float.valueOf(String.valueOf(rSh200sfm.getHbands())));
	//Z-ADD
	rQuhdr.setQuanpc(Float.valueOf(String.valueOf(rSh200sfm.getHbanpc())));
	//Z-ADD
	rQuhdr.setQuaxds(Float.valueOf(String.valueOf(rSh200sfm.getHbaxds())));
	//Z-ADD
	rQuhdr.setQuaxsl((int) Integer.valueOf(String.valueOf(rSh200sfm.getHbaxsl())));
	// MOVE
	rQuhdr.setQuital(String.valueOf(rSh200sfm.getHbital()));
	//Z-ADD
	rQuhdr.setQuitms((int) Integer.valueOf(String.valueOf(rSh200sfm.getHbitms())));
	//Z-ADD
	rQuhdr.setQuadam(Float.valueOf(String.valueOf(rSh200sfm.getHbadam())));
	//ADD
	rQuhdr.setQuadam(rQuhdr.getQuadam() + USAA_ADSC);
	//Z-ADD
	rQuhdr.setQuanam(Float.valueOf(String.valueOf(rSh200sfm.getHbanam())));
	//ADD
	rQuhdr.setQuanam(rQuhdr.getQuanam() + USAA_ANSC);
	//Z-ADD
	rQuhdr.setQuitam(Float.valueOf(String.valueOf($AMOUNT)));
	//ADD
	rQuhdr.setQuitam(rQuhdr.getQuitam() + USAA_ITEM);
	// IF STATEMENT
	if (IN79 == true) {
		// MOVE
		rQuhdr.setQucamp(String.valueOf(S0CAMP));
		// MOVE
		rQuhdr.setQucode(String.valueOf(rMarket.getMldsrc()));
		// MOVE
		rQuhdr.setQudate(String.valueOf(rMarket.getMurdte()));
		// IF STATEMENT
		if (SRTERR == SRTERR.replaceAll("[a-zA-Z0-9],\\s+", "9")) {
			// MOVE
			rQuhdr.setQutype(String.valueOf("P"));
		// ELSE
		} else {
			// MOVE
			rQuhdr.setQutype(String.valueOf("F"));
		// ENDIF
		}
		// WRITE
		try {
			quhdr.getTransaction().begin();
			quhdr.persist(rQuhdr);
			quhdr.getTransaction().commit();
		} catch (Exception e) {
			quhdr.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ELSE
	} else {
		// UPDATE
		try {
			quhdr.getTransaction().begin();
			quhdr.getTransaction().commit();
		} catch (Exception e) {
			quhdr.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ENDIF
	}
	// IF STATEMENT
	if ($PRCNEG) {
		// EVAL
		// IF STATEMENT
		if (INKJ == true) {
			// EVAL
		// ENDIF
		}
		// EVAL
		rQuhneg.setQuadsc( Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad())));
		// EVAL
		rQuhneg.setQslsty( String.valueOf(rSh200sfm.getCbst()));
		// EVAL
		rQuhneg.setQuansc( Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt())));
		// EVAL
		rQuhneg.setQugrpf( String.valueOf(rRepmas.getRgrpid()));
		// EVAL
		rQuhneg.setQucrtu( String.valueOf(ldadsDS.luser()));
		// EVAL
		rQuhneg.setQucrdt( String.valueOf(String.valueOf(new Date())));
		// EVAL
		rQuhneg.setQucrtm( String.valueOf(String.valueOf(new Time(new Date().getTime()))));
		// WRITE
		try {
			quhneg.getTransaction().begin();
			quhneg.persist(rQuhdr);
			quhneg.getTransaction().commit();
		} catch (Exception e) {
			quhneg.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ENDIF
	}
	// CHAIN SETLL
	try {
		quhdre.getTransaction().begin();
		qQuhdre = quhdre.createQuery(quhex2KL("Quhdre"), Quhdre.class);
		rQuhdreList = qQuhdre.getResultList();
		if (rQuhdreList.size() >= 1) {
			rQuhdre = new Quhdre();
			rQuhdreFOUND = true;
			rQuhdreEOF = false;
		} else {
			rQuhdreFOUND = false;
			rQuhdreEOF = true;
		}
		rQuhdrePOS = -1;
		quhdre.getTransaction().commit();
	} catch (Exception e) {
		quhdre.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQuhdreFOUND = false;
	rQuhdreEOF = true;
	while (rQuhdrePOS < rQuhdreList.size() || rQuhdreFOUND) {
		rQuhdre = rQuhdreList.get(++rQuhdrePOS);
		if (Objects.equals(String.valueOf(rQuhdre.getQuemms()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQuhdre.getQueseq()), String.valueOf(rQuhdr.getQuseq()))) {
			rQuhdreFOUND = true;
			rQuhdreEOF = false;
		} else {
			rQuhdreFOUND = false;
			rQuhdreEOF = true;
		}

	}
	// EVAL
	rQuhdre.setQuemms( String.valueOf(rQuhdr.getQuacct()));
	// EVAL
	rQuhdre.setQueseq( Integer.valueOf(String.valueOf(rQuhdr.getQuseq())));
	// EVAL
	rQuhdre.setQuitqty( Integer.valueOf(String.valueOf(HBITQTY)));
	// EVAL
	rQuhdre.setQuitamt( Float.valueOf(String.valueOf(HBITAMT)));
	// EVAL
	rQuhdre.setQuitpc( Float.valueOf(String.valueOf(HBITPC)));
	// IF STATEMENT
	if (PO) {
		// EVAL
		rQuhdre.setQuslty( String.valueOf(rSh200sfm.getCbst()));
	// ELSE
	} else {
		// EVAL
		rQuhdre.setQuslty( String.valueOf(" "));
	// ENDIF
	}
	// IF STATEMENT
	if (rQuhdreFOUND) {
		// UPDATE
		try {
			quhdre.getTransaction().begin();
			quhdre.getTransaction().commit();
		} catch (Exception e) {
			quhdre.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ELSE
	} else {
		// WRITE
		try {
			quhdre.getTransaction().begin();
			quhdre.persist(rQuhdre);
			quhdre.getTransaction().commit();
		} catch (Exception e) {
			quhdre.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ENDIF
	}
	// SETLL
	try {
		qudtl.getTransaction().begin();
		qQudtl = qudtl.createQuery(quhky2KL("Qudtl"), Qudtl.class);
		rQudtlList = qQudtl.getResultList();
		if (rQudtlList.size() >= 1) {
			rQudtl = new Qudtl();
			rQudtlFOUND = true;
			rQudtlEOF = false;
		} else {
			rQudtlFOUND = false;
			rQudtlEOF = true;
		}
		rQudtlPOS = -1;
		qudtl.getTransaction().commit();
	} catch (Exception e) {
		qudtl.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	//DOU
	do {
		//DOU
		do {
			// READE
			rQudtlFOUND = false;
			rQudtlEOF = true;
			while (rQudtlPOS < rQudtlList.size() || rQudtlFOUND) {
				rQudtl = rQudtlList.get(++rQudtlPOS);
							if (Objects.equals(String.valueOf(rQudtl.getQdent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQudtl.getQdacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQudtl.getQdseq()), String.valueOf(CBSEQ0))) {
					rQudtlFOUND = true;
					rQudtlEOF = false;
				} else {
					rQudtlFOUND = false;
					rQudtlEOF = true;
				}

			}
			// IF STATEMENT
			if (IN80 == true) {
				//Z-ADD
				COUNT0 = (int) Integer.valueOf(String.valueOf(0));
				//EXSR
				$ERROR();
			// ENDIF
			}
		//ENDDO
		} while (IN80 == false);
		// IF STATEMENT
		if (IN79 == false) {
			// DELETE
			try {
				qudtl.getTransaction().begin();
				qudtl.remove(rQudtl);
				qudtl.getTransaction().commit();
			} catch (Exception e) {
				qudtl.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	//Z-ADD
	LINE00 = (int) Integer.valueOf(String.valueOf(0));
	// EVAL
	// IF STATEMENT
	if (IN76 == true) {
		//Z-ADD
		C = (int) Integer.valueOf(String.valueOf(1));
		//DOU
		do {
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
			// ELSE
			} else {
			// ENDIF
			}
			// IF STATEMENT
			if (IN79 == false) {
				// EVAL
				rQudtl.setQdstat( String.valueOf(""));
				// MOVE
				rQudtl.setQdent(String.valueOf(rSh200sfm.getCaent()));
				// MOVE
				rQudtl.setQdacct(String.valueOf(rSh200sfm.getCaacct()));
				//Z-ADD
				rQudtl.setQdseq((int) Integer.valueOf(String.valueOf(CBSEQ0)));
				// MOVE
				rQudtl.setQditem(String.valueOf(rSh200sfm.getSbitem()));
				// IF STATEMENT
				if (rSh200sfm.getItmtyp().compareTo("GLD") == 0 && rSh200sfm.getSbaddq() > 0) {
					// EVAL
				// ENDIF
				}
				//Z-ADD
				rQudtl.setQdpkgq((int) Integer.valueOf(String.valueOf(rSh200sfm.getSbpkgq())));
				//Z-ADD
				rQudtl.setQdaddq((int) Integer.valueOf(String.valueOf(rSh200sfm.getSbaddq())));
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
					// MOVE
					rQudtl.setQdlctn(String.valueOf(rSh200sfm.getSblctn()));
				// ELSE
				} else {
					// MOVE
					rQudtl.setQdlctn(String.valueOf(rSh200sfm.getSblctns()));
				// ENDIF
				}
				// MOVE
				rQudtl.setQdlupu(String.valueOf(USR08A));
				// MOVE
				rQudtl.setQdlupd(String.valueOf(WRKDT0));
				// MOVE
				rQudtl.setQdlupt(String.valueOf(WRKTM0));
				//Z-ADD
				rQudtl.setQdsprc(Float.valueOf(String.valueOf(rSh200sfm.getSbsprc())));
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") ==0) {
					//Z-ADD
					rQudtl.setQdlnam(Float.valueOf(String.valueOf(rSh200sfm.getSblnam())));
				// ELSE
				} else {
					//Z-ADD
					rQudtl.setQdlnam(Float.valueOf(String.valueOf(rSh200sfm.getSblnams())));
				// ENDIF
				}
				//Z-ADD
				rQudtl.setQdmqty((int) Integer.valueOf(String.valueOf(rSh200sfm.getHsmqty())));
				//Z-ADD
				rQudtl.setQddsam(Float.valueOf(String.valueOf(rSh200sfm.getHsdsam())));
				//Z-ADD
				rQudtl.setQddspc(Float.valueOf(String.valueOf(rSh200sfm.getHsdspc())));
				//Z-ADD
				rQudtl.setQdxqty((int) Integer.valueOf(String.valueOf(rSh200sfm.getHsxqty())));
				//Z-ADD
				rQudtl.setQditqt((int) Integer.valueOf(String.valueOf(rSh200sfm.getSbitqt())));
				//Z-ADD
				rQudtl.setQditam(Float.valueOf(String.valueOf(rSh200sfm.getSbitam())));
				// IF STATEMENT
				if (rSh200sfm.getSbpkgq() != 0 || rSh200sfm.getSbaddq() != 0) {
					//ADD
					LINE00 = LINE00 + 1;
					//Z-ADD
					rQudtl.setQdlin((int) Integer.valueOf(String.valueOf(LINE00)));
					// WRITE
					try {
						qudtlla.getTransaction().begin();
						qudtlla.persist(rQudtl);
						qudtlla.getTransaction().commit();
					} catch (Exception e) {
						qudtlla.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
				// ENDIF
				}
			// ENDIF
			}
			//ADD
			C = C + 1;
		//ENDDO
		} while (IN79 == true);
	// ENDIF
	}
	// CHAIN SETLL
	try {
		quhdre.getTransaction().begin();
		qQuhdre = quhdre.createQuery(quhex2KL("Quhdre"), Quhdre.class);
		rQuhdreList = qQuhdre.getResultList();
		if (rQuhdreList.size() >= 1) {
			rQuhdre = new Quhdre();
			rQuhdreFOUND = true;
			rQuhdreEOF = false;
		} else {
			rQuhdreFOUND = false;
			rQuhdreEOF = true;
		}
		rQuhdrePOS = -1;
		quhdre.getTransaction().commit();
	} catch (Exception e) {
		quhdre.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQuhdreFOUND = false;
	rQuhdreEOF = true;
	while (rQuhdrePOS < rQuhdreList.size() || rQuhdreFOUND) {
		rQuhdre = rQuhdreList.get(++rQuhdrePOS);
		if (Objects.equals(String.valueOf(rQuhdre.getQuemms()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQuhdre.getQueseq()), String.valueOf(rQuhdr.getQuseq()))) {
			rQuhdreFOUND = true;
			rQuhdreEOF = false;
		} else {
			rQuhdreFOUND = false;
			rQuhdreEOF = true;
		}

	}
	// IF STATEMENT
	if (rQuhdreFOUND) {
		// EVAL
		rQuhdre.setQugold( String.valueOf(GOLDOPT));
		// UPDATE
		try {
			quhdre.getTransaction().begin();
			quhdre.getTransaction().commit();
		} catch (Exception e) {
			quhdre.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ENDIF
	}
	//DO
	for (A2 = 1; A2 < A1; A2++) {
		// CHAIN SETLL
		try {
			qusrvc.getTransaction().begin();
			qQusrvc = qusrvc.createQuery(quskeyKL("Qusrvc"), Qusrvc.class);
			rQusrvcList = qQusrvc.getResultList();
			if (rQusrvcList.size() >= 1) {
				rQusrvc = new Qusrvc();
				rQusrvcFOUND = true;
				rQusrvcEOF = false;
			} else {
				rQusrvcFOUND = false;
				rQusrvcEOF = true;
			}
			rQusrvcPOS = -1;
			qusrvc.getTransaction().commit();
		} catch (Exception e) {
			qusrvc.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQusrvcFOUND = false;
		rQusrvcEOF = true;
		while (rQusrvcPOS < rQusrvcList.size() || rQusrvcFOUND) {
			rQusrvc = rQusrvcList.get(++rQusrvcPOS);
				if (Objects.equals(String.valueOf(rQusrvc.getQsent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQusrvc.getQsacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQusrvc.getQsseq()), String.valueOf(CBSEQ0)) && Objects.equals(String.valueOf(rQusrvc.getQscat()), String.valueOf(ANC.get(A2)))) {
				rQusrvcFOUND = true;
				rQusrvcEOF = false;
			} else {
				rQusrvcFOUND = false;
				rQusrvcEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			// IF STATEMENT
			if (ANQ.get(A2) != 0 || AMS.get(A2).compareTo("X") == 0) {
				//Z-ADD
				rQusrvc.setQsfeam(Float.valueOf(String.valueOf(ANF.get(A2))));
				//Z-ADD
				rQusrvc.setQsqty((int) Integer.valueOf(String.valueOf(ANQ.get(A2))));
				// MOVE
				rQusrvc.setQsmanu(String.valueOf(AMS.get(A2)));
				// MOVE
				rQusrvc.setQslupu(String.valueOf(USR08A));
				// MOVE
				rQusrvc.setQslupd(String.valueOf(WRKDT0));
				// MOVE
				rQusrvc.setQslupt(String.valueOf(WRKTM0));
				// UPDATE
				try {
					qusrvc.getTransaction().begin();
					qusrvc.getTransaction().commit();
				} catch (Exception e) {
					qusrvc.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
			// ELSE
			} else {
				// DELETE
				try {
					qusrvc.getTransaction().begin();
					qusrvc.remove(rQusrvc);
					qusrvc.getTransaction().commit();
				} catch (Exception e) {
					qusrvc.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
			// ENDIF
			}
		// ELSE
		} else {
			// IF STATEMENT
			if (ANQ.get(A2) != 0 || AMS.get(A2).compareTo("X") == 0) {
				// EVAL
				rQusrvc.setQsstat( String.valueOf(""));
				// MOVE
				rQusrvc.setQsent(String.valueOf(rSh200sfm.getCaent()));
				// MOVE
				rQusrvc.setQsacct(String.valueOf(rSh200sfm.getCaacct()));
				//Z-ADD
				rQusrvc.setQsseq((int) Integer.valueOf(String.valueOf(CBSEQ0)));
				// MOVE
				rQusrvc.setQscat(String.valueOf(ANC.get(A2)));
				//Z-ADD
				rQusrvc.setQsfeam(Float.valueOf(String.valueOf(ANF.get(A2))));
				//Z-ADD
				rQusrvc.setQsqty((int) Integer.valueOf(String.valueOf(ANQ.get(A2))));
				// MOVE
				rQusrvc.setQsmanu(String.valueOf(AMS.get(A2)));
				// MOVE
				rQusrvc.setQslupu(String.valueOf(USR08A));
				// MOVE
				rQusrvc.setQslupd(String.valueOf(WRKDT0));
				// MOVE
				rQusrvc.setQslupt(String.valueOf(WRKTM0));
				// WRITE
				try {
					qusrvc.getTransaction().begin();
					qusrvc.persist(rQusrvc);
					qusrvc.getTransaction().commit();
				} catch (Exception e) {
					qusrvc.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	}
	// IF STATEMENT
	if (rSh200sfm.getSaoptn().compareTo("A") == 0 || rSh200sfm.getSaoptn().compareTo("C") == 0) {
		// MOVE
		rSh200sfm.setSaoptn(String.valueOf("X"));
		//Z-ADD
		rSh200sfm.setHaseq((int) Integer.valueOf(String.valueOf(CBSEQ0)));
	// ENDIF
	}
	//EXSR
	APHNDS();
	//EXSR
	$600SV();
	// CHAIN SETLL
	try {
		adtpspsh.getTransaction().begin();
		qAdtpspsh = adtpspsh.createQuery("select c from Adtpspsh c where c.MMACCT = '"+rSh200sfm.getCaacct()+"'", Adtpspsh.class);
		rAdtpspshList = qAdtpspsh.getResultList();
		if (rAdtpspshList.size() >= 1) {
			rAdtpspsh = new Adtpspsh();
			rAdtpspshFOUND = true;
			rAdtpspshEOF = false;
		} else {
			rAdtpspshFOUND = false;
			rAdtpspshEOF = true;
		}
		rAdtpspshPOS = -1;
		adtpspsh.getTransaction().commit();
	} catch (Exception e) {
		adtpspsh.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rAdtpspshFOUND = false;
	rAdtpspshEOF = true;
	while (rAdtpspshPOS < rAdtpspshList.size() || rAdtpspshFOUND) {
		rAdtpspsh = rAdtpspshList.get(++rAdtpspshPOS);
		if (Objects.equals(String.valueOf(rAdtpspsh.getMmacct()), String.valueOf(rSh200sfm.getCaacct()))) {
			rAdtpspshFOUND = true;
			rAdtpspshEOF = false;
		} else {
			rAdtpspshFOUND = false;
			rAdtpspshEOF = true;
		}

	}
	// IF STATEMENT
	if ((rAdtpspshFOUND && rAdtpspsh.getMmjob().compareTo("") != 0)) {
		// EVAL
		MMJOBX = String.valueOf(rAdtpspsh.getMmjob().substring(1, 9));
		// IF STATEMENT
		if (rAdtpspsh.getMmqtseq().compareTo("") == 0) {
			// EVAL
			rAdtpspsh.setMmqtseq( String.valueOf("001"));
		// ENDIF
		}
		// CHAIN SETLL
		try {
			adtmmquot.getTransaction().begin();
			qAdtmmquot = adtmmquot.createQuery("select c from Adtmmquot c where c.MACCTNO = '"+rSh200sfm.getCaacct()+"' and c.MMQPKG = '"+rSh200sfm.getCbpkg()+"' and c.MMQSEQ = '"+rSh200sfm.getHaseq()+"'", Adtmmquot.class);
			rAdtmmquotList = qAdtmmquot.getResultList();
			if (rAdtmmquotList.size() >= 1) {
				rAdtmmquot = new Adtmmquot();
				rAdtmmquotFOUND = true;
				rAdtmmquotEOF = false;
			} else {
				rAdtmmquotFOUND = false;
				rAdtmmquotEOF = true;
			}
			rAdtmmquotPOS = -1;
			adtmmquot.getTransaction().commit();
		} catch (Exception e) {
			adtmmquot.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAdtmmquotFOUND = false;
		rAdtmmquotEOF = true;
		while (rAdtmmquotPOS < rAdtmmquotList.size() || rAdtmmquotFOUND) {
			rAdtmmquot = rAdtmmquotList.get(++rAdtmmquotPOS);
				if (Objects.equals(String.valueOf(rAdtmmquot.getMacctno()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rAdtmmquot.getMmqpkg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rAdtmmquot.getMmqseq()), String.valueOf(rSh200sfm.getHaseq()))) {
				rAdtmmquotFOUND = true;
				rAdtmmquotEOF = false;
			} else {
				rAdtmmquotFOUND = false;
				rAdtmmquotEOF = true;
			}

		}
		// IF STATEMENT
		if (rAdtmmquotFOUND) {
			// IF STATEMENT
			if (Float.parseFloat(rAdtpspsh.getMmqtseq()) != rSh200sfm.getHaseq()) {
				// EVAL
				MMJOBX = String.valueOf("");
				//DOW
				while (! INLR) {
					// READE
					rAdtpspshFOUND = false;
					rAdtpspshEOF = true;
					while (rAdtpspshPOS < rAdtpspshList.size() || rAdtpspshFOUND) {
						rAdtpspsh = rAdtpspshList.get(++rAdtpspshPOS);
								if (Objects.equals(String.valueOf(rAdtpspsh.getMmacct()), String.valueOf(rSh200sfm.getCaacct()))) {
							rAdtpspshFOUND = true;
							rAdtpspshEOF = false;
						} else {
							rAdtpspshFOUND = false;
							rAdtpspshEOF = true;
						}

					}
					// IF STATEMENT
					if (! rAdtpspshEOF) {
						// IF STATEMENT
						if (Float.parseFloat(rAdtpspsh.getMmqtseq()) == rSh200sfm.getHaseq()) {
							// EVAL
							MMJOBX = String.valueOf(rAdtpspsh.getMmjob().substring(1, 9));
							//LEAVE
							break;
						// ENDIF
						}
						//ITER
						continue;
					// ENDIF
					}
					//LEAVE
					break;
				//ENDDO
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (MMJOBX.compareTo("") != 0) {
			// EVAL
			ldadsDS.lquseq( String.valueOf(String.valueOf(rSh200sfm.getHaseq())));
			// IF STATEMENT
			if (ldadsDS.lquseq().trim().length()!=3) {
				// EVAL
				ldadsDS.lquseq( String.valueOf("0000".substring(0, 3-ldadsDS.lquseq().trim().length()+0) + ldadsDS.lquseq().trim()));
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void ACHGQU () {
	// MOVEA
	AMS.clear();
	// MOVEA
	IN74 = true;
	// MOVEA
	IN75 = false;
	// MOVEA
	IN76 = false;
	// MOVE
	in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
	// MOVE
	in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
	// MOVE
	rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
	// IF STATEMENT
	if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
	// ELSE
	} else {
	// ENDIF
	}
	// MOVE
	IN75 = true ;
	//Z-ADD
	RRNB = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	TOTSFB = (int) Integer.valueOf(String.valueOf(0));
	// CHAIN SETLL
	try {
		quhdr.getTransaction().begin();
		qQuhdr = quhdr.createQuery(quhky3KL("Quhdr"), Quhdr.class);
		rQuhdrList = qQuhdr.getResultList();
		if (rQuhdrList.size() >= 1) {
			rQuhdr = new Quhdr();
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}
		rQuhdrPOS = -1;
		quhdr.getTransaction().commit();
	} catch (Exception e) {
		quhdr.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQuhdrFOUND = false;
	rQuhdrEOF = true;
	while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
		rQuhdr = rQuhdrList.get(++rQuhdrPOS);
		if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rSh200sfm.getHaseq()))) {
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}

	}
	// CHAIN SETLL
	try {
		quhdre.getTransaction().begin();
		qQuhdre = quhdre.createQuery(quhex2KL("Quhdre"), Quhdre.class);
		rQuhdreList = qQuhdre.getResultList();
		if (rQuhdreList.size() >= 1) {
			rQuhdre = new Quhdre();
			rQuhdreFOUND = true;
			rQuhdreEOF = false;
		} else {
			rQuhdreFOUND = false;
			rQuhdreEOF = true;
		}
		rQuhdrePOS = -1;
		quhdre.getTransaction().commit();
	} catch (Exception e) {
		quhdre.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQuhdreFOUND = false;
	rQuhdreEOF = true;
	while (rQuhdrePOS < rQuhdreList.size() || rQuhdreFOUND) {
		rQuhdre = rQuhdreList.get(++rQuhdrePOS);
		if (Objects.equals(String.valueOf(rQuhdre.getQuemms()), String.valueOf(rQuhdr.getQuacct())) && Objects.equals(String.valueOf(rQuhdre.getQueseq()), String.valueOf(rQuhdr.getQuseq()))) {
			rQuhdreFOUND = true;
			rQuhdreEOF = false;
		} else {
			rQuhdreFOUND = false;
			rQuhdreEOF = true;
		}

	}
	// CHAIN SETLL
	try {
		quhdr.getTransaction().begin();
		qQuhdr = quhdr.createQuery(quhky3KL("Quhdr"), Quhdr.class);
		rQuhdrList = qQuhdr.getResultList();
		if (rQuhdrList.size() >= 1) {
			rQuhdr = new Quhdr();
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}
		rQuhdrPOS = -1;
		quhdr.getTransaction().commit();
	} catch (Exception e) {
		quhdr.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQuhdrFOUND = false;
	rQuhdrEOF = true;
	while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
		rQuhdr = rQuhdrList.get(++rQuhdrPOS);
		if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rSh200sfm.getHaseq()))) {
			rQuhdrFOUND = true;
			rQuhdrEOF = false;
		} else {
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
		}

	}
	// EVAL
	rSh200sfm.setCbst( String.valueOf(rQuhdre.getQuslty()));
	// EVAL
	SVST = String.valueOf(rQuhdre.getQuslty());
	// MOVE
	TMPQSP = String.valueOf(rQuhdre.getQuslty());
	// EVAL
	TMPSLS = String.valueOf(rSh200sfm.getCbst());
	// MOVE
	$$ADAT = Integer.valueOf(String.valueOf(rQuhdr.getQuentd()));
	// MOVE
	$$ADTA = String.valueOf($$ADAT);
	// MOVE
	rSh200sfm.setCblnam(String.valueOf(rSh200sfm.getCalnam()));
	//Z-ADD
	rSh200sfm.setCbbase(Float.valueOf(String.valueOf(rQuhdr.getQubase())));
	//Z-ADD
	rSh200sfm.setCbadd(Float.valueOf(String.valueOf(rQuhdr.getQuadd())));
	//Z-ADD
	rSh200sfm.setCbadd2(Float.valueOf(String.valueOf(rQuhdr.getQuadd())));
	//Z-ADD
	rSh200sfm.setCbadd2(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbadd$(Float.valueOf(String.valueOf(rQuhdr.getQuads$())));
	//Z-SUB
	rSh200sfm.setCbadam(0 - rQuhdr.getQuadam());
	//SUB
	rSh200sfm.setCbadam(rSh200sfm.getCbadam() - rQuhdr.getQuitam());
	//ADD
	rSh200sfm.setCbb$ad(rQuhdr.getQubase() + rQuhdr.getQuadd());
	//ADD
	rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() + rQuhdr.getQuads$());
	//SUB
	rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() - rQuhdr.getQuadam());
	//SUB
	rSh200sfm.setCbb$ad(rSh200sfm.getCbb$ad() - rQuhdr.getQuitam());
	//Z-ADD
	rSh200sfm.setCbnegp(Float.valueOf(String.valueOf(rQuhdr.getQunegp())));
	//Z-ADD
	rSh200sfm.setCbngmp(Float.valueOf(String.valueOf(rQuhdr.getQungmp())));
	//Z-ADD
	rSh200sfm.setCbngpp(Float.valueOf(String.valueOf(rQuhdr.getQungpp())));
	// MOVE
	rSh200sfm.setCbpkg(String.valueOf(rQuhdr.getQupkg()));
	// MOVE
	rSh200sfm.setCbmon(String.valueOf(rQuhdr.getQumon()));
	//Z-ADD
	rPakprc.setPpdccf(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rPakprc.setPpamfe(Float.valueOf(String.valueOf(rQuhdr.getQumntr())));
	//Z-ADD
	rSh200sfm.setCbmntr(Float.valueOf(String.valueOf(rQuhdr.getQumntr())));
	//DIV
	rSh200sfm.setCbmmnt(rQuhdr.getQumntr() / 12);
	// MOVE
	rSh200sfm.setCbcat(String.valueOf(rQuhdr.getQucat()));
	//Z-ADD
	rSh200sfm.setCbfire(Float.valueOf(String.valueOf(rQuhdr.getQufire())));
	//DIV
	rSh200sfm.setCbmfir(rQuhdr.getQufire() / 12);
	// MOVE
	rSh200sfm.setCbwarc(String.valueOf(rQuhdr.getQuwarc()));
	// IF STATEMENT
	if (rSh200sfm.getCbwarc().compareTo("") == 0) {
		// MOVE
		rSh200sfm.setCbwarc(String.valueOf("N"));
	// ENDIF
	}
	//Z-ADD
	rSh200sfm.setCbwrfe(Float.valueOf(String.valueOf(rQuhdr.getQuwrfe())));
	//DIV
	rSh200sfm.setCbmwrf(rQuhdr.getQuwrfe() / 12);
	// MOVE
	rSh200sfm.setCbccds(String.valueOf(rQuhdr.getQuccds()));
	//DIV
	rSh200sfm.setCbmnmp(rQuhdr.getQungmp() / 12);
	//Z-SUB
	rSh200sfm.setCbanam(0 - rQuhdr.getQuanam());
	//DIV
	rSh200sfm.setCbanmm(rSh200sfm.getCbanam() / 12);
	//Z-ADD
	rSh200sfm.setCbperm(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setCbadd$(Float.valueOf(String.valueOf(0)));
	//EXSR
	APRMIT();
	//Z-ADD
	SVPERM = Float.valueOf(String.valueOf(rSh200sfm.getCbperm()));
	// EVAL
	rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam())));
	// EVAL
	rSh200sfm.setCbmmfw( Float.valueOf(String.valueOf(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir() + rSh200sfm.getCbmwrf() + rSh200sfm.getCbanmm())));
	//Z-ADD
	SVMFWT = Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt()));
	// IF STATEMENT
	if (rSh200sfm.getCbnegp() < rSh200sfm.getCbb$ad() && rSh200sfm.getCbnegp() != 0) {
		// EVAL
		rSh200sfm.setCbadnp( Integer.valueOf(String.valueOf(((rSh200sfm.getCbb$ad() - rSh200sfm.getCbnegp())/rSh200sfm.getCbb$ad()) * 100)));
	// ELSE
	} else {
		// EVAL
		rSh200sfm.setCbadnp( Integer.valueOf(String.valueOf(0)));
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getCbngmp() < rSh200sfm.getCbmfwt() && rSh200sfm.getCbngmp() != 0) {
		// EVAL
		rSh200sfm.setCbannp( Integer.valueOf(String.valueOf(((rSh200sfm.getCbmfwt() - rSh200sfm.getCbngmp())/rSh200sfm.getCbmfwt()) * 100)));
	// ELSE
	} else {
		// EVAL
		rSh200sfm.setCbannp( Integer.valueOf(String.valueOf(0)));
	// ENDIF
	}
	// SETLL
	try {
		qusrvc.getTransaction().begin();
		qQusrvc = qusrvc.createQuery(quhky3KL("Qusrvc"), Qusrvc.class);
		rQusrvcList = qQusrvc.getResultList();
		if (rQusrvcList.size() >= 1) {
			rQusrvc = new Qusrvc();
			rQusrvcFOUND = true;
			rQusrvcEOF = false;
		} else {
			rQusrvcFOUND = false;
			rQusrvcEOF = true;
		}
		rQusrvcPOS = -1;
		qusrvc.getTransaction().commit();
	} catch (Exception e) {
		qusrvc.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	//DOU
	do {
		// READE
		rQusrvcFOUND = false;
		rQusrvcEOF = true;
		while (rQusrvcPOS < rQusrvcList.size() || rQusrvcFOUND) {
			rQusrvc = rQusrvcList.get(++rQusrvcPOS);
					if (Objects.equals(String.valueOf(rQusrvc.getQsent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQusrvc.getQsacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQusrvc.getQsseq()), String.valueOf(rSh200sfm.getHaseq()))) {
				rQusrvcFOUND = true;
				rQusrvcEOF = false;
			} else {
				rQusrvcFOUND = false;
				rQusrvcEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			//Z-ADD
			A2 = (int) Integer.valueOf(String.valueOf(1));
			// IF STATEMENT
			if (IN77 == true) {
				//Z-ADD
				ANQ.set(A2, (int) Integer.valueOf(String.valueOf(rQusrvc.getQsqty())));
				// MOVE
				AMS.set(A2, rQusrvc.getQsmanu());
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	// MOVEA
	IN34 = false;
	// MOVEA
	IN35 = false;
	// MOVEA
	IN36 = false;
	// MOVEA
	IN37 = false;
	// MOVEA
	IN38 = false;
	// CHAIN SETLL
	try {
		qufdtlla.getTransaction().begin();
		qQufdtlla = qufdtlla.createQuery("select c from Qufdtlla c where c.FDMMS = '"+ldadsDS.lmms()+"'", Qufdtlla.class);
		rQufdtllaList = qQufdtlla.getResultList();
		if (rQufdtllaList.size() >= 1) {
			rQufdtlla = new Qufdtlla();
			rQufdtllaFOUND = true;
			rQufdtllaEOF = false;
		} else {
			rQufdtllaFOUND = false;
			rQufdtllaEOF = true;
		}
		rQufdtllaPOS = -1;
		qufdtlla.getTransaction().commit();
	} catch (Exception e) {
		qufdtlla.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQufdtllaFOUND = false;
	rQufdtllaEOF = true;
	while (rQufdtllaPOS < rQufdtllaList.size() || rQufdtllaFOUND) {
		rQufdtlla = rQufdtllaList.get(++rQufdtllaPOS);
		if (Objects.equals(String.valueOf(rQufdtlla.getFdmms()), String.valueOf(ldadsDS.lmms()))) {
			rQufdtllaFOUND = true;
			rQufdtllaEOF = false;
		} else {
			rQufdtllaFOUND = false;
			rQufdtllaEOF = true;
		}

	}
	//DOW
	while (rQufdtllaFOUND && ! rQufdtllaEOF) {
		// IF STATEMENT
		if (rQufdtlla.getFdseq()==rQuhdr.getQuseq()) {
			// IF STATEMENT
			if (rQuhdr.getQunegp()>0) {
				// EVAL
				EFFAMT = Float.valueOf(String.valueOf(EFFAMT-rQuhdr.getQunegp()));
			// ELSE
			} else {
				// EVAL
				EFFAMT = Float.valueOf(String.valueOf(EFFAMT-rSh200sfm.getCbb$ad()-rSh200sfm.getCbadd$()));
				// EVAL
				ADDAMT = Float.valueOf(String.valueOf(ADDAMT-rSh200sfm.getCbadd$()));
			// ENDIF
			}
		// ENDIF
		}
		// READE
		rQufdtllaFOUND = false;
		rQufdtllaEOF = true;
		while (rQufdtllaPOS < rQufdtllaList.size() || rQufdtllaFOUND) {
			rQufdtlla = rQufdtllaList.get(++rQufdtllaPOS);
					if (Objects.equals(String.valueOf(rQufdtlla.getFdmms()), String.valueOf(ldadsDS.lmms()))) {
				rQufdtllaFOUND = true;
				rQufdtllaEOF = false;
			} else {
				rQufdtllaFOUND = false;
				rQufdtllaEOF = true;
			}

		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void $NEGPR () {
	// EVAL
	rSh200sfm.setR1rpid( String.valueOf(""));
	// EVAL
	rSh200sfm.setR1pswd( String.valueOf(""));
	// EVAL
	rSh200sfm.setR1povr( String.valueOf(""));
	// MOVE
	rSh200sfm.setR1negp(Float.valueOf(String.valueOf(rSh200sfm.getCbnegp())));
	// MOVE
	rSh200sfm.setR1ngmp(Float.valueOf(String.valueOf(rSh200sfm.getCbngmp())));
	// MOVEA
	IN40 = false;
	// MOVEA
	IN41 = false;
	// MOVEA
	IN42 = false;
	// MOVEA
	IN44 = false;
	// MOVEA
	IN45 = false;
	// CHAIN SETLL
	try {
		itusneg.getTransaction().begin();
		qItusneg = itusneg.createQuery("select c from Itusneg c where c.IUUGRP = '"+ldadsDS.luser()+"'", Itusneg.class);
		rItusnegList = qItusneg.getResultList();
		if (rItusnegList.size() >= 1) {
			rItusneg = new Itusneg();
			rItusnegFOUND = true;
			rItusnegEOF = false;
		} else {
			rItusnegFOUND = false;
			rItusnegEOF = true;
		}
		rItusnegPOS = -1;
		itusneg.getTransaction().commit();
	} catch (Exception e) {
		itusneg.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rItusnegFOUND = false;
	rItusnegEOF = true;
	while (rItusnegPOS < rItusnegList.size() || rItusnegFOUND) {
		rItusneg = rItusnegList.get(++rItusnegPOS);
		if (Objects.equals(String.valueOf(rItusneg.getIuugrp()), String.valueOf(ldadsDS.luser()))) {
			rItusnegFOUND = true;
			rItusnegEOF = false;
		} else {
			rItusnegFOUND = false;
			rItusnegEOF = true;
		}

	}
	// IF STATEMENT
	if (! rItusnegFOUND) {
		// CHAIN SETLL
		try {
			itusneg.getTransaction().begin();
			qItusneg = itusneg.createQuery("select c from Itusneg c where c.IUUGRP = '"+rRepmas.getRgrpid()+"'", Itusneg.class);
			rItusnegList = qItusneg.getResultList();
			if (rItusnegList.size() >= 1) {
				rItusneg = new Itusneg();
				rItusnegFOUND = true;
				rItusnegEOF = false;
			} else {
				rItusnegFOUND = false;
				rItusnegEOF = true;
			}
			rItusnegPOS = -1;
			itusneg.getTransaction().commit();
		} catch (Exception e) {
			itusneg.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rItusnegFOUND = false;
		rItusnegEOF = true;
		while (rItusnegPOS < rItusnegList.size() || rItusnegFOUND) {
			rItusneg = rItusnegList.get(++rItusnegPOS);
				if (Objects.equals(String.valueOf(rItusneg.getIuugrp()), String.valueOf(rRepmas.getRgrpid()))) {
				rItusnegFOUND = true;
				rItusnegEOF = false;
			} else {
				rItusnegFOUND = false;
				rItusnegEOF = true;
			}

		}
	// ENDIF
	}
	//Z-ADD
	RCCOUT = (int) Integer.valueOf(String.valueOf(0));
	//DOU
	do {
		// MOVEA
		IN40 = false;
		// MOVEA
		IN41 = false;
		// MOVEA
		IN42 = false;
		// MOVEA
		IN44 = false;
		// MOVEA
		IN45 = false;
		// EVAL
		rSh200sfm.setR1err( String.valueOf(" "));
		// EVAL
		rSh200sfm.setR1err1( String.valueOf(" "));
		// IF STATEMENT
		if (INKC != true) {
			// IF STATEMENT
			if (IN79 == true) {
				// MOVE
				ldadsDS.lcat(String.valueOf("QPO"));
				// MOVE
				ldadsDS.lcode(String.valueOf("   "));
				// MOVE
				rSh200sfm.setR1povr(String.valueOf(ldadsDS.lcode()));
				// IF STATEMENT
				if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
				// ELSE
				} else {
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getR1negp() < 0) {
			//MULT
			rSh200sfm.setR1negp((float) (rSh200sfm.getR1negp() * -1));
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getR1ngmp() < 0) {
			//MULT
			rSh200sfm.setR1ngmp((float) (rSh200sfm.getR1ngmp() * -1));
		// ENDIF
		}
		// CHAIN SETLL
		try {
			qumgmt.getTransaction().begin();
			qQumgmt = qumgmt.createQuery("select c from Qumgmt c where c.QMRPID = '"+rSh200sfm.getR1rpid()+"'", Qumgmt.class);
			rQumgmtList = qQumgmt.getResultList();
			if (rQumgmtList.size() >= 1) {
				rQumgmt = new Qumgmt();
				rQumgmtFOUND = true;
				rQumgmtEOF = false;
			} else {
				rQumgmtFOUND = false;
				rQumgmtEOF = true;
			}
			rQumgmtPOS = -1;
			qumgmt.getTransaction().commit();
		} catch (Exception e) {
			qumgmt.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQumgmtFOUND = false;
		rQumgmtEOF = true;
		while (rQumgmtPOS < rQumgmtList.size() || rQumgmtFOUND) {
			rQumgmt = rQumgmtList.get(++rQumgmtPOS);
				if (Objects.equals(String.valueOf(rQumgmt.getQmrpid()), String.valueOf(rSh200sfm.getR1rpid()))) {
				rQumgmtFOUND = true;
				rQumgmtEOF = false;
			} else {
				rQumgmtFOUND = false;
				rQumgmtEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == true) {
			// MOVE
			IN41 = true ;
		// ELSE
		} else {
			// IF STATEMENT
			if (rSh200sfm.getR1pswd().compareTo(rQumgmt.getQmpswd()) != 0) {
				// EVAL
				rSh200sfm.setR1pswd( String.valueOf(""));
				// MOVE
				IN40 = true ;
			// ELSE
			} else {
				// MOVE
				WKCAT = String.valueOf("QPO");
				// MOVE
				WKCODE = String.valueOf(rSh200sfm.getR1povr());
				// CHAIN SETLL
				try {
					refer.getTransaction().begin();
					qRefer = refer.createQuery(refkeyKL("Refer"), Refer.class);
					rReferList = qRefer.getResultList();
					if (rReferList.size() >= 1) {
						rRefer = new Refer();
						rReferFOUND = true;
						rReferEOF = false;
					} else {
						rReferFOUND = false;
						rReferEOF = true;
					}
					rReferPOS = -1;
					refer.getTransaction().commit();
				} catch (Exception e) {
					refer.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rReferFOUND = false;
				rReferEOF = true;
				while (rReferPOS < rReferList.size() || rReferFOUND) {
					rRefer = rReferList.get(++rReferPOS);
								if (Objects.equals(String.valueOf(rRefer.getEcat()), String.valueOf(WKCAT)) && Objects.equals(String.valueOf(rRefer.getEcode()), String.valueOf(WKCODE))) {
						rReferFOUND = true;
						rReferEOF = false;
					} else {
						rReferFOUND = false;
						rReferEOF = true;
					}

				}
				// IF STATEMENT
				if (IN79 == true) {
					// MOVE
					IN42 = true ;
				// ELSE
				} else {
					// EVAL
					_ADSCLD = Float.valueOf(String.valueOf(0));
					// EVAL
					_ADSCLI = Float.valueOf(String.valueOf(0));
					// EVAL
					_ADSCL = Float.valueOf(String.valueOf(0));
					// EVAL
					_ANSCL = Float.valueOf(String.valueOf(0));
					// IF STATEMENT
					if (rItusnegFOUND) {
						// IF STATEMENT
						if (rItusneg.getIuadop().compareTo("%") == 0) {
							// EVAL
							_ADSCLD = Float.valueOf(String.valueOf((100-rItusneg.getIuadpc())*rSh200sfm.getCbb$ad()/100));
						// ELSE
						} else {
							// EVAL
							_ADSCLD = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad() - rItusneg.getIuadpc()));
						// ENDIF
						}
						// IF STATEMENT
						if (rItusneg.getIuanfl().compareTo("Y") == 0) {
							// IF STATEMENT
							if (rItusneg.getIuanop().compareTo("%") == 0) {
								// EVAL
								_ANSCL = Float.valueOf(String.valueOf((100-rItusneg.getIuanpc())*rSh200sfm.getCbmfwt()/100));
							// ELSE
							} else {
								// EVAL
								_ANSCL = Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt() - rItusneg.getIuanpc()));
							// ENDIF
							}
						// ENDIF
						}
						// IF STATEMENT
						if ((rItusneg.getIudisc().compareTo("I") == 0 || rItusneg.getIudisc().compareTo("B") == 0) && _ITNEG > 0) {
							// EVAL
							_ADSCLI = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()-_ITNEG));
						// ENDIF
						}
						// IF STATEMENT
						if (rItusneg.getIudisc().trim()=="I" && _ITNEG > 0) {
							// EVAL
							_ADSCL = Float.valueOf(String.valueOf(_ADSCLI));
							// ELSEIF STATEMENT
						} else if (rItusneg.getIudisc().trim()=="D" || (rItusneg.getIudisc().compareTo("I") == 0 && _ITNEG == 0)) {
							// EVAL
							_ADSCL = Float.valueOf(String.valueOf(_ADSCLD));
							// ELSEIF STATEMENT
						} else if (rItusneg.getIudisc().trim()=="B") {
							// IF STATEMENT
							if (rItusneg.getIuadop().compareTo("%") == 0) {
								// EVAL
								_ADSCLD = Float.valueOf(String.valueOf((100-rItusneg.getIuadpc())*(rSh200sfm.getCbb$ad()-_ITNEG)/100));
							// ELSE
							} else {
								// EVAL
								_ADSCLD = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad() - _ITNEG - rItusneg.getIuadpc()));
							// ENDIF
							}
							// EVAL
							_ADSCL = Float.valueOf(String.valueOf(_ADSCLD));
						// ENDSL
						}
						// IF STATEMENT
						if (rSh200sfm.getR1negp()<_ADSCL && rSh200sfm.getR1negp()>0) {
							// EVAL
						// ENDIF
						}
						// IF STATEMENT
						if (rSh200sfm.getR1ngmp()<_ANSCL && rSh200sfm.getR1ngmp()>0) {
							// EVAL
						// ENDIF
						}
						// IF STATEMENT
						if (IN44) {
							// EVAL
							rSh200sfm.setR1err( String.valueOf("USER NOT ALLOWED TO NEG.ADSC"));
		decfmt = new DecimalFormat("      0.  ");
							// EVAL
							rSh200sfm.setR1err1( String.valueOf("LESS THAN "+decfmt.format(_ADSCL).trim()+" AMOUNT."));
							//ITER
							continue;
						// ENDIF
						}
						// IF STATEMENT
						if (IN45) {
							// EVAL
							rSh200sfm.setR1err( String.valueOf("USER NOT ALLOWED TO NEG.ANSC"));
		decfmt = new DecimalFormat("      0.  ");
							// EVAL
							rSh200sfm.setR1err1( String.valueOf("LESS THAN "+decfmt.format(_ANSCL).trim()+" AMOUNT."));
							//ITER
							continue;
						// ENDIF
						}
					// ENDIF
					}
					// IF STATEMENT
					if (! INKC) {
						// EVAL
					// ENDIF
					}
					// IF STATEMENT
					if ((rSh200sfm.getR1negp() != 0 || rSh200sfm.getR1ngmp() != 0) && ! INKC) {
						// EVAL
						//DOU
						do {
							// IF STATEMENT
							if (rItusnegFOUND) {
								// IF STATEMENT
								if (rSh200sfm.getR1negp()<_ADSCL && rSh200sfm.getR1negp()>0) {
									// EVAL
								// ENDIF
								}
								// IF STATEMENT
								if (rSh200sfm.getR1ngmp()<_ANSCL && rSh200sfm.getR1ngmp()>0) {
									// EVAL
								// ENDIF
								}
							// ENDIF
							}
							// IF STATEMENT
							if (IN44 || IN45) {
								// IF STATEMENT
								if (IN44) {
									// EVAL
									rSh200sfm.setR1err( String.valueOf("USER NOT ALLOWED TO NEG ADSC"));
		decfmt = new DecimalFormat("      0.  ");
									// EVAL
									rSh200sfm.setR1err1( String.valueOf("LESS THAN "+decfmt.format(_ADSCL).trim()+" AMOUNT."));
								// ENDIF
								}
								// IF STATEMENT
								if (IN45) {
									// EVAL
									rSh200sfm.setR1err( String.valueOf("USER NOT ALLOWED TO NEG.ANSC"));
		decfmt = new DecimalFormat("      0.  ");
									// EVAL
									rSh200sfm.setR1err1( String.valueOf("LESS THAN "+decfmt.format(_ANSCL).trim()+" AMOUNT."));
								// ENDIF
								}
								// EVAL
							// ELSE
							} else {
								// EVAL
								SVNEGP = Float.valueOf(String.valueOf(rSh200sfm.getR1negp()));
								// EVAL
								SVNGMP = Float.valueOf(String.valueOf(rSh200sfm.getR1ngmp()));
								// EVAL
							// ENDIF
							}
							// MOVEA
							IN44 = false;
							// MOVEA
							IN45 = false;
							// EVAL
							rSh200sfm.setR1err( String.valueOf(" "));
						//ENDDO
						} while (rSh200sfm.getR1negp() == SVNEGP && rSh200sfm.getR1ngmp() == SVNGMP);
						// EVAL
						// EVAL
						rSh200sfm.setR1negp2( Float.valueOf(String.valueOf(0)));
						// EVAL
						rSh200sfm.setR1ngmp2( Float.valueOf(String.valueOf(0)));
						// EVAL
						//DOU
						do {
							// IF STATEMENT
							if (! INKC) {
								// IF STATEMENT
								if (rSh200sfm.getR1negp2() < 0) {
									//MULT
									rSh200sfm.setR1negp2((float) (rSh200sfm.getR1negp2() * -1));
								// ENDIF
								}
								// IF STATEMENT
								if (rSh200sfm.getR1ngmp2() < 0) {
									//MULT
									rSh200sfm.setR1ngmp2((float) (rSh200sfm.getR1ngmp2() * -1));
								// ENDIF
								}
								// IF STATEMENT
								if (rSh200sfm.getR1negp() == rSh200sfm.getR1negp2() && rSh200sfm.getR1ngmp() == rSh200sfm.getR1ngmp2()) {
									// EVAL
								// ELSE
								} else {
									// EVAL
								// ENDIF
								}
							// ENDIF
							}
						//ENDDO
						} while (NPVERIFIED || INKC);
						// IF STATEMENT
						if (INKC == true) {
							// EVAL
							// EVAL
						// ENDIF
						}
					// ENDIF
					}
					// EVAL
					// IF STATEMENT
					if (NPVERIFIED) {
						//Z-ADD
						rSh200sfm.setCbnegp(Float.valueOf(String.valueOf(rSh200sfm.getR1negp())));
						//Z-ADD
						rSh200sfm.setCbngmp(Float.valueOf(String.valueOf(rSh200sfm.getR1ngmp())));
						//DIV
						rSh200sfm.setCbmnmp(rSh200sfm.getR1ngmp() / 12);
						// EVAL
						// EVAL
						rQuhneg.setQumgr( String.valueOf(rSh200sfm.getR1rpid()));
						// EVAL
						rQuhneg.setQunrsn( String.valueOf(rSh200sfm.getR1povr()));
						// CHAIN SETLL
						try {
							qufinl.getTransaction().begin();
							qQufinl = qufinl.createQuery(quhkeyKL("Qufinl"), Qufinl.class);
							rQufinlList = qQufinl.getResultList();
							if (rQufinlList.size() >= 1) {
								rQufinl = new Qufinl();
								rQufinlFOUND = true;
								rQufinlEOF = false;
							} else {
								rQufinlFOUND = false;
								rQufinlEOF = true;
							}
							rQufinlPOS = -1;
							qufinl.getTransaction().commit();
						} catch (Exception e) {
							qufinl.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rQufinlFOUND = false;
						rQufinlEOF = true;
						while (rQufinlPOS < rQufinlList.size() || rQufinlFOUND) {
							rQufinl = rQufinlList.get(++rQufinlPOS);
												if (Objects.equals(String.valueOf(rQufinl.getQfent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQufinl.getQfacct()), String.valueOf(rSh200sfm.getCaacct()))) {
								rQufinlFOUND = true;
								rQufinlEOF = false;
							} else {
								rQufinlFOUND = false;
								rQufinlEOF = true;
							}

						}
						// IF STATEMENT
						if ((Boolean.valueOf(rSh200sfm.getIn85()) && $NEWQUOTE == false ) || ($SAMEQUOTE)) {
							// EVAL
							rQuhneg.setQurpid( String.valueOf(rQufinl.getQfrpid()));
						// ELSE
						} else {
							// EVAL
							rQuhneg.setQurpid( String.valueOf(" "));
						// ENDIF
						}
						// IF STATEMENT
						if (rSh200sfm.getCbnegp() < rSh200sfm.getCbb$ad() && rSh200sfm.getCbnegp() != 0) {
							// EVAL
							rSh200sfm.setCbadnp( Integer.valueOf(String.valueOf(((rSh200sfm.getCbb$ad() - rSh200sfm.getCbnegp())/rSh200sfm.getCbb$ad()) * 100)));
						// ELSE
						} else {
							// EVAL
							rSh200sfm.setCbadnp( Integer.valueOf(String.valueOf(0)));
						// ENDIF
						}
						// IF STATEMENT
						if (rSh200sfm.getCbngmp() < rSh200sfm.getCbmfwt() && rSh200sfm.getCbngmp() != 0) {
							// EVAL
							rSh200sfm.setCbannp( Integer.valueOf(String.valueOf(((rSh200sfm.getCbmfwt() - rSh200sfm.getCbngmp())/rSh200sfm.getCbmfwt()) * 100)));
						// ELSE
						} else {
							// EVAL
							rSh200sfm.setCbannp( Integer.valueOf(String.valueOf(0)));
						// ENDIF
						}
						// MOVE
						// MOVE
						rQuprov.setQpstat(String.valueOf("S"));
						// MOVE
						rQuprov.setQprpid(String.valueOf(rSh200sfm.getR1rpid()));
						// MOVE
						rQuprov.setQppswd(String.valueOf(rSh200sfm.getR1pswd()));
						// MOVE
						rQuprov.setQpent(String.valueOf(rSh200sfm.getCaent()));
						// MOVE
						rQuprov.setQpacct(String.valueOf(rSh200sfm.getCaacct()));
						//Z-ADD
						rQuprov.setQpseq((int) Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
						// MOVE
						rQuprov.setQpterr(String.valueOf(rSh200sfm.getCaterr()));
						//Z-ADD
						rQuprov.setQpbase(Float.valueOf(String.valueOf(rSh200sfm.getCbbase())));
						//Z-ADD
						rQuprov.setQpadd(Float.valueOf(String.valueOf(rSh200sfm.getCbadd())));
						//Z-ADD
						rQuprov.setQpnegp(Float.valueOf(String.valueOf(rSh200sfm.getCbnegp())));
						// MOVE
						rQuprov.setQppovr(String.valueOf(rSh200sfm.getR1povr()));
						//Z-ADD
						rQuprov.setQpngmp(Float.valueOf(String.valueOf(rSh200sfm.getCbngmp())));
						//Z-ADD
						rQuprov.setQpmntr(Float.valueOf(String.valueOf(rSh200sfm.getCbmntr())));
						//Z-ADD
						rQuprov.setQpfire(Float.valueOf(String.valueOf(rSh200sfm.getCbfire())));
						//Z-ADD
						rQuprov.setQpwrfe(Float.valueOf(String.valueOf(rSh200sfm.getCbwrfe())));
						// MOVE
						rQuprov.setQplupu(String.valueOf(USR08A));
						//MULT
						Calendar calendar = Calendar.getInstance();
						WRKDT0 = (int) (Integer.valueOf(String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf(calendar.get(Calendar.MONTH)+1) + String.valueOf(calendar.get(Calendar.DAY_OF_MONTH))) * 10000.0001);
						// MOVE
						rQuprov.setQplupd(String.valueOf(WRKDT0));
						// MOVE
						rQuprov.setQplupt(String.valueOf(WRKTM0));
						// WRITE
						try {
							quprov.getTransaction().begin();
							quprov.persist(rQufinl);
							quprov.getTransaction().commit();
						} catch (Exception e) {
							quprov.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (INKC == false) {
			// IF STATEMENT
			if (rSh200sfm.getR1rpid().compareTo("") != 0) {
				//ADD
				RCCOUT = RCCOUT + 1;
				// IF STATEMENT
				if (RCCOUT >= 3) {
					// MOVE
					rQuprov.setQpstat(String.valueOf("F"));
					// MOVE
					rQuprov.setQprpid(String.valueOf(rSh200sfm.getR1rpid()));
					// MOVE
					rQuprov.setQppswd(String.valueOf(rSh200sfm.getR1pswd()));
					// MOVE
					rQuprov.setQpent(String.valueOf(rSh200sfm.getCaent()));
					// MOVE
					rQuprov.setQpacct(String.valueOf(rSh200sfm.getCaacct()));
					//Z-ADD
					rQuprov.setQpseq((int) Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
					// MOVE
					rQuprov.setQpterr(String.valueOf(rSh200sfm.getCaterr()));
					//Z-ADD
					rQuprov.setQpbase(Float.valueOf(String.valueOf(rSh200sfm.getCbbase())));
					//Z-ADD
					rQuprov.setQpadd(Float.valueOf(String.valueOf(rSh200sfm.getCbadd())));
					//Z-ADD
					rQuprov.setQpnegp(Float.valueOf(String.valueOf(rSh200sfm.getCbnegp())));
					//Z-ADD
					rQuprov.setQpngmp(Float.valueOf(String.valueOf(rSh200sfm.getCbngmp())));
					//Z-ADD
					rQuprov.setQpmntr(Float.valueOf(String.valueOf(rSh200sfm.getCbmntr())));
					//Z-ADD
					rQuprov.setQpfire(Float.valueOf(String.valueOf(rSh200sfm.getCbfire())));
					//Z-ADD
					rQuprov.setQpwrfe(Float.valueOf(String.valueOf(rSh200sfm.getCbwrfe())));
					// MOVE
					rQuprov.setQplupu(String.valueOf(USR08A));
					//MULT
					Calendar calendar = Calendar.getInstance();
					WRKDT0 = (int) (Integer.valueOf(String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf(calendar.get(Calendar.MONTH)+1) + String.valueOf(calendar.get(Calendar.DAY_OF_MONTH))) * 10000.0001);
					// MOVE
					rQuprov.setQplupd(String.valueOf(WRKDT0));
					// MOVE
					rQuprov.setQplupt(String.valueOf(WRKTM0));
					// WRITE
					try {
						quprov.getTransaction().begin();
						quprov.persist(rQufinl);
						quprov.getTransaction().commit();
					} catch (Exception e) {
						quprov.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// MOVE
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (INKC == true);
	// MOVE
	// MOVEA
	IN44 = false;
	// MOVEA
	IN45 = false;
	// IF STATEMENT
	if (! rQuprovFOUND && rSh200sfm.getCbwarc().compareTo("Y") == 0) {
		//EXSR
		GETQSP();
		// EVAL
		SVMFWT = Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt()));
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void $INTROWIN () {
	// MOVE
	rIntroffer.setIoseq(Integer.valueOf(String.valueOf(ldadsDS.lquseq())));
	// CHAIN SETLL
	try {
		introffer.getTransaction().begin();
		qIntroffer = introffer.createQuery(intkeyKL("Introffer"), Introffer.class);
		rIntrofferList = qIntroffer.getResultList();
		if (rIntrofferList.size() >= 1) {
			rIntroffer = new Introffer();
			rIntrofferFOUND = true;
			rIntrofferEOF = false;
		} else {
			rIntrofferFOUND = false;
			rIntrofferEOF = true;
		}
		rIntrofferPOS = -1;
		introffer.getTransaction().commit();
	} catch (Exception e) {
		introffer.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rIntrofferFOUND = false;
	rIntrofferEOF = true;
	while (rIntrofferPOS < rIntrofferList.size() || rIntrofferFOUND) {
		rIntroffer = rIntrofferList.get(++rIntrofferPOS);
		if (Objects.equals(String.valueOf(rIntroffer.getIomms()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rIntroffer.getIoseq()), String.valueOf(rQuhdr.getQuseq()))) {
			rIntrofferFOUND = true;
			rIntrofferEOF = false;
		} else {
			rIntrofferFOUND = false;
			rIntrofferEOF = true;
		}

	}
	// IF STATEMENT
	if (rIntrofferFOUND) {
		// EVAL
		rSh200sfm.setInddes( String.valueOf(""));
		// IF STATEMENT
		if (rIntroffer.getIoindd() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(String.valueOf(rIntroffer.getIoindd()).trim() + " " + INTRO.get(1).trim()));
			// ELSEIF STATEMENT
		} else if (rIntroffer.getIoindp() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(String.valueOf(rIntroffer.getIoindp()).trim() + " " + INTRO.get(2).trim()));
			// ELSEIF STATEMENT
		} else if (rIntroffer.getIoindf() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(INTRO.get(3)));
		// ENDSL
		}
		// EVAL
		rSh200sfm.setInansc( Float.valueOf(String.valueOf(rIntroffer.getIoians())));
		// EVAL
		rSh200sfm.setInindu( String.valueOf(String.valueOf(rIntroffer.getIoindu()).trim() + " " + "MONTHS"));
	// ELSE
	} else {
		// EVAL
		rSh200sfm.setInddes( String.valueOf(""));
		// IF STATEMENT
		if (rProintro.getPmindd() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(String.valueOf(rProintro.getPmindd()).trim() + " " + INTRO.get(1).trim()));
			// EVAL
			rIntroffer.setIodtyp( String.valueOf("1"));
			// IF STATEMENT
			if (rSh200sfm.getCbmnmp() != 0) {
				// EVAL
				rSh200sfm.setInansc( Float.valueOf(String.valueOf(rSh200sfm.getCbmnmp() - rProintro.getPmindd())));
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setInansc( Float.valueOf(String.valueOf($ANSC - rProintro.getPmindd())));
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rProintro.getPmindp() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(String.valueOf(rProintro.getPmindp()).trim() + " " + INTRO.get(2).trim()));
			// EVAL
			rIntroffer.setIodtyp( String.valueOf("2"));
			// IF STATEMENT
			if (rSh200sfm.getCbmnmp() != 0) {
				// EVAL
				rSh200sfm.setInansc( Float.valueOf(String.valueOf(rSh200sfm.getCbmnmp() - (rSh200sfm.getCbmnmp() * (rProintro.getPmindp()/100)))));
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setInansc( Float.valueOf(String.valueOf($ANSC - ($ANSC * (rProintro.getPmindp()/100)))));
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rProintro.getPmindf() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(INTRO.get(3)));
			// EVAL
			rSh200sfm.setInansc( Float.valueOf(String.valueOf(rProintro.getPmindf())));
			// EVAL
			rIntroffer.setIodtyp( String.valueOf("3"));
		// ENDSL
		}
		// EVAL
		rSh200sfm.setInindu( String.valueOf(String.valueOf(rProintro.getPmindu()).trim() + " " + "MONTHS"));
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getInansc() < 0) {
		// EVAL
		rSh200sfm.setInansc( Float.valueOf(String.valueOf(0)));
	// ENDIF
	}
	// EVAL
	rSh200sfm.setIndamt( Float.valueOf(String.valueOf($ANSC - rSh200sfm.getInansc())));
	// IF STATEMENT
	if (rSh200sfm.getIndamt() < 0) {
		// EVAL
		rSh200sfm.setIndamt( Float.valueOf(String.valueOf(0)));
	// ENDIF
	}
	// EVAL
	rSh200sfm.setIndper( Float.valueOf(String.valueOf((($ANSC - rSh200sfm.getInansc()) / $ANSC) * 100)));
	// IF STATEMENT
	if (rSh200sfm.getIndper() < 0) {
		// EVAL
		rSh200sfm.setIndper( Float.valueOf(String.valueOf(0)));
	// ENDIF
	}
	//DOU
	do {
	//ENDDO
	} while (INKC == true);
	// EVAL
	rIntroffer.setIomms( String.valueOf(ldadsDS.lmms()));
	// EVAL
	rIntroffer.setIoseq( Integer.valueOf(String.valueOf(rQuhdr.getQuseq())));
	// EVAL
	rIntroffer.setIoindu( Integer.valueOf(String.valueOf(rProintro.getPmindu())));
	// EVAL
	rIntroffer.setIoindd( Float.valueOf(String.valueOf(rProintro.getPmindd())));
	// EVAL
	rIntroffer.setIoindp( Float.valueOf(String.valueOf(rProintro.getPmindp())));
	// EVAL
	rIntroffer.setIoindf( Float.valueOf(String.valueOf(rProintro.getPmindf())));
	// IF STATEMENT
	if (rSh200sfm.getCbmnmp() != 0) {
		// EVAL
		rIntroffer.setIooans( Float.valueOf(String.valueOf(rSh200sfm.getCbmnmp())));
	// ELSE
	} else {
		// EVAL
		rIntroffer.setIooans( Float.valueOf(String.valueOf($ANSC)));
	// ENDIF
	}
	// EVAL
	rIntroffer.setIoians( Float.valueOf(String.valueOf(rSh200sfm.getInansc())));
	// EVAL
	rIntroffer.setIoddes( String.valueOf(rSh200sfm.getInddes()));
	// EVAL
	//ENDSR
	}
	
//BEGSR
	public static void AANFEE () {
	// MOVEA
	IN65 = false;
	// MOVEA
	IN66 = false;
	// MOVE
	IN65 = true ;
	//Z-ADD
	rSh200sfm.setRrnd((int) Integer.valueOf(String.valueOf(0)));
	// MOVE
	rSh200sfm.setCdtitl(String.valueOf(TTL.get(2)));
	// MOVE
	rSh200sfm.setRdcmdl(String.valueOf(CMD.get(1)));
	//Z-ADD
	rSh200sfm.setRdfeam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	A2 = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	rSh200sfm.setCbfire(Float.valueOf(String.valueOf(0)));
	//DO
	for (A2 = 1; A2 < A1; A2++) {
		// MOVE
		rSh200sfm.setSdmanu(String.valueOf(AMS.get(A2)));
		// MOVE
		rSh200sfm.setSdcat(String.valueOf(ANC.get(A2)));
		// MOVE
		rSh200sfm.setSddesc(String.valueOf(AND.get(A2)));
		// MOVE
		rSh200sfm.setSdfeam(Float.valueOf(String.valueOf(ANF.get(A2))));
		// MOVE
		IN59 = false ;
		// IF STATEMENT
		if (ANQ.get(A2) > 0 || AMS.get(A2).compareTo("X") == 0) {
			//ADD
			rSh200sfm.setRdfeam(rSh200sfm.getRdfeam() + rSh200sfm.getSdfeam());
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (ANY.get(A2).compareTo("Y") == 0 && ANZ.get(A2).compareTo(ldadsDS.lcamp()) == 0) {
			// EVAL
			//ADD
			rSh200sfm.setRrnd(rSh200sfm.getRrnd() + 1);
		// ENDIF
		}
	//ENDDO
	}
	//Z-ADD
	rSh200sfm.setRrnd((int) Integer.valueOf(String.valueOf(1)));
	//DOU
	do {
		// IF STATEMENT
		if (IN20 == false) {
			// MOVE
			$FLAG = String.valueOf("X");
			// IF STATEMENT
			if (rSh200sfm.getSdmanu().compareTo(" ") != 0) {
				// MOVE
				rSh200sfm.setSdmanu(String.valueOf("X"));
			// ENDIF
			}
			//Z-ADD
			RR = (int) Integer.valueOf(String.valueOf(1));
			// IF STATEMENT
			if (IN78 == true) {
				// MOVE
				AMS.set(RR, rSh200sfm.getSdmanu());
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN20 == true);
	//DO
	for (A2 = 1; A2 < A1; A2++) {
		// IF STATEMENT
		if (ANQ.get(A2) != 0 || AMS.get(A2).compareTo("X") == 0) {
			// IF STATEMENT
			if (ANQ.get(A2) > 0) {
				// IF STATEMENT
				if (ANFL.get(A2).compareTo(" ") == 0 || ANFL.get(A2).compareTo("N") == 0) {
					//ADD
					rSh200sfm.setCbfire(rSh200sfm.getCbfire() + ANF.get(A2));
				// ELSE
				} else {
					// EVAL
					rSh200sfm.setCbfire( Float.valueOf(String.valueOf(rSh200sfm.getCbfire() + ANQ.get(A2) * ANF.get(A2))));
				// ENDIF
				}
			// ELSE
			} else {
				// IF STATEMENT
				if (ANFL.get(A2).compareTo(" ") == 0 || ANFL.get(A2).compareTo("N") == 0) {
					//ADD
					rSh200sfm.setCbfire(rSh200sfm.getCbfire() + ANF.get(A2));
				// ELSE
				} else {
					// EVAL
					rSh200sfm.setCbfire( Float.valueOf(String.valueOf(rSh200sfm.getCbfire() + ANQ.get(A2) * ANF.get(A2))));
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	}
	//DIV
	rSh200sfm.setCbmmnt(rSh200sfm.getCbmntr() / 12);
	//DIV
	rSh200sfm.setCbmfir(rSh200sfm.getCbfire() / 12);
	//DIV
	rSh200sfm.setCbmwrf(rSh200sfm.getCbwrfe() / 12);
	//DIV
	rSh200sfm.setCbanmm(rSh200sfm.getCbanam() / 12);
	// EVAL
	rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam())));
	// EVAL
	rSh200sfm.setCbmmfw( Float.valueOf(String.valueOf(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir() + rSh200sfm.getCbmwrf() + rSh200sfm.getCbanmm())));
	//ENDSR
	}
	
//BEGSR
	public static void $WARFE () {
	// MOVEA
	IN65 = false;
	// MOVEA
	IN66 = false;
	// MOVE
	IN65 = true ;
	//Z-ADD
	RRNC = (int) Integer.valueOf(String.valueOf(0));
	// MOVE
	rSh200sfm.setCctitl(String.valueOf(TTL.get(3)));
	// MOVE
	rSh200sfm.setRccmdl(String.valueOf(CMD.get(1)));
	//Z-ADD
	rSh200sfm.setRcfeam(Float.valueOf(String.valueOf(0)));
	// EVAL
	rSh200sfm.setSccat( String.valueOf(""));
	// MOVE
	rSh200sfm.setScdesc(String.valueOf(ERR.get(5)));
	//Z-ADD
	rSh200sfm.setScfeam(Float.valueOf(String.valueOf(rPakprc.getPpwarp())));
	//Z-ADD
	rSh200sfm.setRcfeam(Float.valueOf(String.valueOf(rPakprc.getPpwarp())));
	//ADD
	RRNC = RRNC + 1;
	// MOVE
	IN66 = true ;
	//DO
	for (W2 = 1; W2 < W1; W2++) {
		//ADD
		WRK092 = WAQ.get(W2) + WAP.get(W2);
		//MULT
		WRK092 = (float) (WRK092 * WAF.get(W2));
		// IF STATEMENT
		if (WRK092 > WAT.get(W2)) {
			// MOVE
			rSh200sfm.setSccat(String.valueOf(WAC.get(W2)));
			// MOVE
			rSh200sfm.setScdesc(String.valueOf(WAD.get(W2)));
			//SUB
			WRK092 = WRK092 - WAT.get(W2);
			//Z-ADD
			rSh200sfm.setScfeam(Float.valueOf(String.valueOf(WRK092)));
			//ADD
			rSh200sfm.setRcfeam(rSh200sfm.getRcfeam() + rSh200sfm.getScfeam());
			//ADD
			RRNC = RRNC + 1;
			// MOVE
			IN66 = true ;
		// ENDIF
		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void APROMD () {
	// IF STATEMENT
	if (INKP == false) {
		// EVAL
		// EVAL
		rSh200sfm.setGrpid( String.valueOf(" "));
		// EVAL
		rSh200sfm.setCmnt1( String.valueOf("FOLLOWING ITEM DISCOUNTS ARE AVAIL- ABLE FOR THE CUSTOMER."));
		// EVAL
		rSh200sfm.setCmnt3( String.valueOf("   "));
	// ELSE
	} else {
		// EVAL
		// EVAL
		rSh200sfm.setCmnt1( String.valueOf("ITEM DISCOUNT AVAIL FOR ANY ONE FRO- M EACH GROUP; CONFIRM APPROPRIATE"));
		// EVAL
		rSh200sfm.setCmnt3( String.valueOf("SELECTION."));
		// EVAL
		$GRPPOS = Integer.valueOf(String.valueOf(1));
		// EVAL
		$GROUPS = String.valueOf(" ");
		//DOW
		while (PGRPS.get($GRPPOS).compareTo(" ")!=0) {
			// IF STATEMENT
			if ($GROUPS.compareTo(" ") == 0) {
				// EVAL
				$GROUPS = String.valueOf(PGRPS.get($GRPPOS));
			// ELSE
			} else {
				// IF STATEMENT
				if (PGRPS.get($GRPPOS) != PGRPS.get($GRPPOS-1)) {
					// EVAL
					$GROUPS = String.valueOf(PGRPS.get($GRPPOS) + "," + $GROUPS.trim());
				// ENDIF
				}
			// ENDIF
			}
			// EVAL
			$GRPPOS = Integer.valueOf(String.valueOf($GRPPOS + 1));
		//ENDDO
		}
		// EVAL
		rSh200sfm.setCmnt2( String.valueOf($GROUPS));
		// EVAL
		rSh200sfm.setGrpid( String.valueOf("*"));
	// ENDIF
	}
	// EVAL
	$OGRPID = String.valueOf(rSh200sfm.getGrpid());
	// EVAL
	// EVAL
	// EVAL
	//EXSR
	$INTFY();
	//Z-ADD
	RRNE = (int) Integer.valueOf(String.valueOf(0));
	// EVAL
	$RRNE = Integer.valueOf(String.valueOf(0));
	// MOVE
	rSh200sfm.setCetitl(String.valueOf(TTL.get(4)));
	// MOVE
	rSh200sfm.setRecmdl(String.valueOf(CMD.get(7)));
	//Z-ADD
	rSh200sfm.setReitam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	P2 = (int) Integer.valueOf(String.valueOf(0));
	// MOVE
	ITEM00 = String.valueOf("N");
	//Z-ADD
	NOSEL0 = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	NOITM0 = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	TOTDS0 = Float.valueOf(String.valueOf(0));
	// MOVE
	PCHG.set(0, "N");
	PCHG.set(1, "N");
	PCHG.set(2, "N");
	PCHG.set(3, "N");
	PCHG.set(4, "N");
	PCHG.set(5, "N");
	PCHG.set(6, "N");
	PCHG.set(7, "N");
	PCHG.set(8, "N");
	PCHG.set(9, "N");
	PCHG.set(10, "N");
	PCHG.set(11, "N");
	PCHG.set(12, "N");
	PCHG.set(13, "N");
	PCHG.set(14, "N");
	PCHG.set(15, "N");
	PCHG.set(16, "N");
	PCHG.set(17, "N");
	PCHG.set(18, "N");
	PCHG.set(19, "N");
	PCHG.set(20, "N");
	PCHG.set(21, "N");
	PCHG.set(22, "N");
	PCHG.set(23, "N");
	PCHG.set(24, "N");
	PCHG.set(25, "N");
	PCHG.set(26, "N");
	PCHG.set(27, "N");
	PCHG.set(28, "N");
	PCHG.set(29, "N");
	PCHG.set(30, "N");
	PCHG.set(31, "N");
	PCHG.set(32, "N");
	PCHG.set(33, "N");
	PCHG.set(34, "N");
	PCHG.set(35, "N");
	PCHG.set(36, "N");
	PCHG.set(37, "N");
	PCHG.set(38, "N");
	PCHG.set(39, "N");
	PCHG.set(40, "N");
	PCHG.set(41, "N");
	PCHG.set(42, "N");
	PCHG.set(43, "N");
	PCHG.set(44, "N");
	PCHG.set(45, "N");
	PCHG.set(46, "N");
	PCHG.set(47, "N");
	PCHG.set(48, "N");
	PCHG.set(49, "N");
	PCHG.set(50, "N");
	PCHG.set(51, "N");
	PCHG.set(52, "N");
	PCHG.set(53, "N");
	PCHG.set(54, "N");
	PCHG.set(55, "N");
	PCHG.set(56, "N");
	PCHG.set(57, "N");
	PCHG.set(58, "N");
	PCHG.set(59, "N");
	PCHG.set(60, "N");
	PCHG.set(61, "N");
	PCHG.set(62, "N");
	PCHG.set(63, "N");
	PCHG.set(64, "N");
	PCHG.set(65, "N");
	PCHG.set(66, "N");
	PCHG.set(67, "N");
	PCHG.set(68, "N");
	PCHG.set(69, "N");
	PCHG.set(70, "N");
	PCHG.set(71, "N");
	PCHG.set(72, "N");
	PCHG.set(73, "N");
	PCHG.set(74, "N");
	PCHG.set(75, "N");
	PCHG.set(76, "N");
	PCHG.set(77, "N");
	PCHG.set(78, "N");
	PCHG.set(79, "N");
	PCHG.set(80, "N");
	PCHG.set(81, "N");
	PCHG.set(82, "N");
	PCHG.set(83, "N");
	PCHG.set(84, "N");
	PCHG.set(85, "N");
	PCHG.set(86, "N");
	PCHG.set(87, "N");
	PCHG.set(88, "N");
	PCHG.set(89, "N");
	PCHG.set(90, "N");
	PCHG.set(91, "N");
	PCHG.set(92, "N");
	PCHG.set(93, "N");
	PCHG.set(94, "N");
	PCHG.set(95, "N");
	PCHG.set(96, "N");
	PCHG.set(97, "N");
	PCHG.set(98, "N");
	PCHG.set(99, "N");
	//Z-ADD
	PGRPI.clear();
	// EVAL
	$OGRP = String.valueOf("A");
	// EVAL
	$GRPPOS1 = Integer.valueOf(String.valueOf(100));
	//DOW
	while ($GRPPOS1>=1) {
		// IF STATEMENT
		if (rSh200sfm.getGrpid().compareTo("*") == 0 && PGRPS.get($GRPPOS1).compareTo($OGRP) == 0) {
			// EVAL
			$GRPPOS1 = Integer.valueOf(String.valueOf($GRPPOS1 - 1));
			//ITER
			continue;
		// ENDIF
		}
		//DO
		for (P2 = 1; P2 < P1; P2++) {
			// EVAL
			$OGRP = String.valueOf(PGRPS.get($GRPPOS1));
			// MOVE
			rSh200sfm.setSeitem(String.valueOf(PIT.get(P2)));
			// MOVE
			rSh200sfm.setSemanu(String.valueOf(PMS.get(P2)));
			// MOVE
			rSh200sfm.setSomanu(String.valueOf(PMS.get(P2)));
			// MOVE
			rSh200sfm.setSedesc(String.valueOf(PDS.get(P2)));
			// MOVE
			rSh200sfm.setSeaddo(String.valueOf(PAD.get(P2)));
			// MOVE
			rSh200sfm.setSemqty(Integer.valueOf(String.valueOf(PMN.get(P2))));
			// MOVE
			rSh200sfm.setSedsam(Float.valueOf(String.valueOf(PDO.get(P2))));
			// MOVE
			rSh200sfm.setSedspc(Float.valueOf(String.valueOf(PPC.get(P2))));
			// MOVE
			rSh200sfm.setSedor$(String.valueOf(PO$.get(P2)));
			// MOVE
			rSh200sfm.setSedorp(String.valueOf(POP.get(P2)));
			// MOVE
			rSh200sfm.setSexqty(Integer.valueOf(String.valueOf(PMX.get(P2))));
			// MOVE
			rSh200sfm.setSeitqt(Integer.valueOf(String.valueOf(PQT.get(P2))));
			// MOVE
			rSh200sfm.setSeitam(Float.valueOf(String.valueOf(PAM.get(P2))));
			// MOVE
			rSh200sfm.setSesprc(Float.valueOf(String.valueOf(PSP.get(P2))));
			// IF STATEMENT
			if (PGR.get(P2).compareTo(" ") != 0 && PGR.get(P2).compareTo("*") != 0) {
				// MOVE
				rSh200sfm.setSepie(String.valueOf(PGR.get(P2)));
			// ELSE
			} else {
				// MOVE
				rSh200sfm.setSepie(String.valueOf(" "));
			// ENDIF
			}
			// EVAL
			// IF STATEMENT
			if (PIE.get(P2).compareTo("E") == 0) {
				// EVAL
			// ELSE
			} else {
				// EVAL
			// ENDIF
			}
			// MOVE
			$FLAG2 = String.valueOf("X");
			// IF STATEMENT
			if (rSh200sfm.getSemanu().compareTo(" ") != 0) {
				// MOVE
				rSh200sfm.setSemanu(String.valueOf("Y"));
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.getSemanu().compareTo("Y") == 0) {
				// IF STATEMENT
				if (rSh200sfm.getSeitem().compareTo("ANSC    ") == 0) {
					//ADD
					NOSEL0 = NOSEL0 + 1;
					// IF STATEMENT
					if (rSh200sfm.getSedsam() != 0) {
						//ADD
						TOTDS0 = TOTDS0 + rSh200sfm.getSedsam();
						//Z-ADD
						rSh200sfm.setSeitam(Float.valueOf(String.valueOf(rSh200sfm.getSedsam())));
					// ELSE
					} else {
						//DIV
						WRKPC0 = rSh200sfm.getSedspc() / 100;
						//MULT
						WRKPR0 = (float) (rSh200sfm.getCbmfwt() * WRKPC0);
						//Z-ADD
						rSh200sfm.setSeitam(Float.valueOf(String.valueOf(WRKPR0)));
						//ADD
						TOTDS0 = TOTDS0 + rSh200sfm.getSeitam();
					// ENDIF
					}
				// ELSE
				} else {
					// IF STATEMENT
					if (rSh200sfm.getSeitem().compareTo("ADSC    ") == 0) {
						//ADD
						NOSEL0 = NOSEL0 + 1;
						// IF STATEMENT
						if (rSh200sfm.getSedsam() != 0 && rSh200sfm.getSedspc() == 0) {
							//ADD
							TOTDS0 = TOTDS0 + rSh200sfm.getSedsam();
							//Z-ADD
							rSh200sfm.setSeitam(Float.valueOf(String.valueOf(rSh200sfm.getSedsam())));
							// ELSEIF STATEMENT
						} else if (rSh200sfm.getSedspc() != 0 && rSh200sfm.getSedsam() == 0) {
							//DIV
							WRKPC0 = rSh200sfm.getSedspc() / 100;
							//ADD
							WRKPR0 = rSh200sfm.getCbbase() + rSh200sfm.getCbadd();
							//MULT
							WRKPR0 = (float) (WRKPR0 * WRKPC0);
							//Z-ADD
							rSh200sfm.setSeitam(Float.valueOf(String.valueOf(WRKPR0)));
							//ADD
							TOTDS0 = TOTDS0 + rSh200sfm.getSeitam();
							// ELSEIF STATEMENT
						} else if (rSh200sfm.getSedor$().compareTo("1") == 0) {
							// EVAL
							TBASE = Float.valueOf(String.valueOf(rSh200sfm.getCbbase() + rSh200sfm.getCbadd() - rSh200sfm.getSedsam()));
							//DIV
							WRKPC0 = rSh200sfm.getSedspc() / 100;
							//MULT
							rSh200sfm.setSeitam((float) (TBASE * WRKPC0));
							//ADD
							rSh200sfm.setSeitam(rSh200sfm.getSeitam() + rSh200sfm.getSedsam());
							//ADD
							TOTDS0 = TOTDS0 + rSh200sfm.getSeitam();
							// ELSEIF STATEMENT
						} else if (rSh200sfm.getSedorp().compareTo("1") == 0) {
							// EVAL
							TBASE = Float.valueOf(String.valueOf(rSh200sfm.getCbbase() + rSh200sfm.getCbadd()));
							//DIV
							WRKPC0 = rSh200sfm.getSedspc() / 100;
							//MULT
							rSh200sfm.setSeitam((float) (TBASE * WRKPC0));
							//ADD
							rSh200sfm.setSeitam(rSh200sfm.getSeitam() + rSh200sfm.getSedsam());
							//ADD
							TOTDS0 = TOTDS0 + rSh200sfm.getSeitam();
						// ENDSL
						}
					// ELSE
					} else {
						// IF STATEMENT
						if (rSh200sfm.getSeitem().compareTo("ITEM") != 0) {
							// IF STATEMENT
							if (ITEM00.compareTo("N") == 0) {
								// MOVE
								ITEM00 = String.valueOf("Y");
								//ADD
								NOSEL0 = NOSEL0 + 1;
							// ENDIF
							}
							//ADD
							NOITM0 = NOITM0 + 1;
							// IF STATEMENT
							if (rSh200sfm.getCbpkg().compareTo("PRO2K USAA TAK2") != 0 && rSh200sfm.getCbpkg().compareTo("P3K  USAA TAK2") != 0 && rSh200sfm.getCbpkg().compareTo("PRO2K USAA TAK2B") != 0 && rSh200sfm.getCbpkg().compareTo("P3K  USAA TAK2B") != 0) {
								// IF STATEMENT
								if (rSh200sfm.getSedsam() != 0) {
									//ADD
									TOTDS0 = TOTDS0 + rSh200sfm.getSedsam();
									//Z-ADD
									rSh200sfm.setSeitam(Float.valueOf(String.valueOf(rSh200sfm.getSedsam())));
								// ELSE
								} else {
									//DIV
									WRKPC0 = rSh200sfm.getSedspc() / 100;
									//MULT
									rSh200sfm.setSeitam((float) (rSh200sfm.getSesprc() * rSh200sfm.getSeitqt()));
									//MULT
									rSh200sfm.setSeitam((float) (rSh200sfm.getSeitam() * WRKPC0));
									//ADD
									TOTDS0 = TOTDS0 + rSh200sfm.getSeitam();
								// ENDIF
								}
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
			// IF STATEMENT
			if (rSh200sfm.getSeitem().compareTo("ADSC") != 0 && rSh200sfm.getSeitem().compareTo("ANSC") != 0 && rSh200sfm.getSeitem().compareTo("ITEM") != 0) {
				// IF STATEMENT
				if ((rSh200sfm.getGrpid().compareTo(" ") == 0 && PIE.get(P2).compareTo("I") == 0) || (rSh200sfm.getGrpid().compareTo("*") == 0 && PIE.get(P2).compareTo("O") == 0 && ((PGRPS.get($GRPPOS1).compareTo(" ")==0 && PGR.get(P2).compareTo("*")==0) || PGRPS.get($GRPPOS1).compareTo(PGR.get(P2))==0)) || (rSh200sfm.getGrpid().compareTo("E") == 0 && PIE.get(P2).compareTo("E") == 0) || (rSh200sfm.getGrpid().compareTo(" ") != 0 && rSh200sfm.getGrpid().compareTo(PGR.get(P2)) == 0 && rSh200sfm.getGrpid().compareTo("*") != 0)) {
					// IF STATEMENT
					if (PMS.get(P2).compareTo("Y") == 0) {
						//ADD
						rSh200sfm.setReitam(rSh200sfm.getReitam() + rSh200sfm.getSeitam());
						// EVAL
					// ENDIF
					}
					// IF STATEMENT
					if (PIE.get(P2).compareTo("I") == 0 && PMS.get(P2).compareTo(" ") == 0) {
						// EVAL
						// EVAL
						DA = String.valueOf("WNN");
						// ELSEIF STATEMENT
					} else if (PIE.get(P2).compareTo("I") == 0 && PMS.get(P2).compareTo("Y") == 0) {
						// EVAL
						// EVAL
						DA = String.valueOf("WNY");
						// ELSEIF STATEMENT
					} else if (PIE.get(P2).compareTo("E") == 0 && PMS.get(P2).compareTo(" ") == 0) {
						// EVAL
						DA = String.valueOf("RNN");
						// ELSEIF STATEMENT
					} else if (PIE.get(P2).compareTo("E") == 0 && PMS.get(P2).compareTo("Y") == 0) {
						// EVAL
						DA = String.valueOf("RNY");
						// ELSEIF STATEMENT
					} else if (PIE.get(P2).compareTo("O") == 0) {
						// EVAL
						// EVAL
						$GRPPOS = Integer.valueOf(String.valueOf(PGRP.indexOf(PGR.get(P2))));
						// IF STATEMENT
						if ($GRPPOS > 0 && $GRPPOS <= 7) {
							// EVAL
							DA = String.valueOf(COLOR.get($GRPPOS));
						// ELSE
						} else {
							// EVAL
							DA = String.valueOf("WN");
						// ENDIF
						}
						// IF STATEMENT
						if (PMS.get(P2).compareTo("Y") == 0) {
							// EVAL
							DA = String.valueOf(DA.trim()+"Y");
						// ELSE
						} else {
							// EVAL
							DA = String.valueOf(DA.trim()+"N");
						// ENDIF
						}
					// ENDSL
					}
					// EVAL
					rSh200sfm.setXdisclr( String.valueOf(DAX));
					// EVAL
					$GRPPOS = Integer.valueOf(String.valueOf(PGRP.indexOf(PGR.get(P2))));
					// IF STATEMENT
					if (PMS.get(P2).compareTo("Y") == 0 && $GRPPOS > 0) {
						// EVAL
						PGRPI.set($GRPPOS,  Integer.valueOf(String.valueOf(PGRPI.get($GRPPOS) + 1)));
					// ENDIF
					}
					//ADD
					RRNE = RRNE + 1;
					// EVAL
				// ENDIF
				}
			// ELSE
			} else {
				// EVAL
				$RRNE = Integer.valueOf(String.valueOf($RRNE + 1));
			// ENDIF
			}
			// EVAL
		//ENDDO
		}
		// IF STATEMENT
		if (rSh200sfm.getGrpid().compareTo("*") == 0) {
			// EVAL
			$GRPPOS1 = Integer.valueOf(String.valueOf($GRPPOS1 - 1));
		// ELSE
		} else {
			//LEAVE
			break;
		// ENDIF
		}
	//ENDDO
	}
	// EVAL
	$GRPPOS = Integer.valueOf(String.valueOf(1));
	//DOW
	while (PGRP.get($GRPPOS).compareTo(" ") != 0) {
		// IF STATEMENT
		if (PGRPI.get($GRPPOS) > 1) {
			// EVAL
			RRNY = Integer.valueOf(String.valueOf(RRNY + 1));
			// EVAL
			rSh200sfm.setSyerrm( String.valueOf("PLEASE SELECT ONLY ONE ITEM FROM + GROUP "));
			// IF STATEMENT
			if (PGRP.get($GRPPOS).compareTo("*") != 0) {
				// EVAL
				rSh200sfm.setSyerrm( String.valueOf(rSh200sfm.getSyerrm().trim()+" "+PGRP.get($GRPPOS) +"."));
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setSyerrm( String.valueOf(rSh200sfm.getSyerrm().trim() + " ' '."));
			// ENDIF
			}
			// EVAL
		// ENDIF
		}
		// EVAL
		$GRPPOS = Integer.valueOf(String.valueOf($GRPPOS + 1));
	//ENDDO
	}
	// EVAL
	// IF STATEMENT
	if (INKN == true) {
		// MOVE
		ldadsDS.lpromo(String.valueOf(rSh200sfm.getHbprom()));
		// MOVE
		ldadsDS.lterr(String.valueOf(rSh200sfm.getCaterr()));
		// MOVE
		ldadsDS.lmtyp(String.valueOf("I"));
	// ENDIF
	}
	// IF STATEMENT
	if (INKQ == true) {
		//EXSR
		$DISRE();
	// ENDIF
	}
	//EXSR
	$INTFY();
	// IF STATEMENT
	if ($OGRPID.compareTo(rSh200sfm.getGrpid()) != 0) {
		// EVAL
		$OGRPID = String.valueOf(rSh200sfm.getGrpid());
	// ENDIF
	}
	// IF STATEMENT
	if (IN66 == true) {
		// EVAL
		//DOU
		do {
			// IF STATEMENT
			if (IN21 == false) {
				// MOVE
				$FLAG2 = String.valueOf("X");
				// IF STATEMENT
				if (rSh200sfm.getSemanu().compareTo(" ") != 0) {
					// MOVE
					rSh200sfm.setSemanu(String.valueOf("Y"));
				// ENDIF
				}
				// EVAL
				RRNE1 = Integer.valueOf(String.valueOf(RRNE + $RRNE));
				// EVAL
				RRNE1 = Integer.valueOf(String.valueOf(PIT.indexOf(rSh200sfm.getSeitem())));
				// IF STATEMENT
				if (rSh200sfm.getSemanu().compareTo(rSh200sfm.getSomanu()) != 0) {
					// EVAL
					PCHG.set(RRNE1,  String.valueOf("Y"));
				// ENDIF
				}
				// IF STATEMENT
				if (PGR.get(RRNE1).compareTo(" ") != 0 && PIE.get(RRNE1).compareTo("O") == 0) {
					// EVAL
					$GRPPOS = Integer.valueOf(String.valueOf(PGRP.indexOf(PGR.get(RRNE1))));
					// IF STATEMENT
					if ($GRPPOS > 0) {
						// IF STATEMENT
						if (rSh200sfm.getSemanu().compareTo("Y") == 0) {
							// EVAL
							PGRPI.set($GRPPOS,  Integer.valueOf(String.valueOf(PGRPI.get($GRPPOS) + 1)));
						// ELSE
						} else {
							// EVAL
							PGRPI.set($GRPPOS,  Integer.valueOf(String.valueOf(PGRPI.get($GRPPOS) - 1)));
						// ENDIF
						}
					// ELSE
					} else {
						// EVAL
						$GRPINS = Integer.valueOf(String.valueOf($GRPINS + 1));
						// EVAL
						PGRP.set($GRPINS,  String.valueOf(PGR.get(RRNE1)));
						// IF STATEMENT
						if (rSh200sfm.getSemanu().compareTo("Y") == 0) {
							// EVAL
							PGRPI.set($GRPINS,  Integer.valueOf(String.valueOf(1)));
						// ELSE
						} else {
							// EVAL
							PGRPI.set($GRPINS,  Integer.valueOf(String.valueOf(0)));
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
				// IF STATEMENT
				if (rSh200sfm.getSemanu().compareTo("Y") == 0) {
					// IF STATEMENT
					if (rSh200sfm.getSeitem().compareTo("ANSC    ") == 0) {
						//ADD
						NOSEL0 = NOSEL0 + 1;
						// IF STATEMENT
						if (rSh200sfm.getSedsam() != 0) {
							//ADD
							TOTDS0 = TOTDS0 + rSh200sfm.getSedsam();
							//Z-ADD
							rSh200sfm.setSeitam(Float.valueOf(String.valueOf(rSh200sfm.getSedsam())));
						// ELSE
						} else {
							//DIV
							WRKPC0 = rSh200sfm.getSedspc() / 100;
							//MULT
							WRKPR0 = (float) (rSh200sfm.getCbmfwt() * WRKPC0);
							//Z-ADD
							rSh200sfm.setSeitam(Float.valueOf(String.valueOf(WRKPR0)));
							//ADD
							TOTDS0 = TOTDS0 + rSh200sfm.getSeitam();
						// ENDIF
						}
					// ELSE
					} else {
						// IF STATEMENT
						if (rSh200sfm.getSeitem().compareTo("ADSC    ") == 0) {
							//ADD
							NOSEL0 = NOSEL0 + 1;
							// IF STATEMENT
							if (rSh200sfm.getSedsam() != 0) {
								//ADD
								TOTDS0 = TOTDS0 + rSh200sfm.getSedsam();
								//Z-ADD
								rSh200sfm.setSeitam(Float.valueOf(String.valueOf(rSh200sfm.getSedsam())));
							// ELSE
							} else {
								//DIV
								WRKPC0 = rSh200sfm.getSedspc() / 100;
								//ADD
								WRKPR0 = rSh200sfm.getCbbase() + rSh200sfm.getCbadd();
								//MULT
								WRKPR0 = (float) (WRKPR0 * WRKPC0);
								//Z-ADD
								rSh200sfm.setSeitam(Float.valueOf(String.valueOf(WRKPR0)));
								//ADD
								TOTDS0 = TOTDS0 + rSh200sfm.getSeitam();
							// ENDIF
							}
						// ELSE
						} else {
							// IF STATEMENT
							if (ITEM00.compareTo("N") == 0) {
								// MOVE
								ITEM00 = String.valueOf("Y");
								//ADD
								NOSEL0 = NOSEL0 + 1;
							// ENDIF
							}
							//ADD
							NOITM0 = NOITM0 + 1;
							// IF STATEMENT
							if (rSh200sfm.getSedsam() != 0) {
								//ADD
								TOTDS0 = TOTDS0 + rSh200sfm.getSedsam();
								//Z-ADD
								rSh200sfm.setSeitam(Float.valueOf(String.valueOf(rSh200sfm.getSedsam())));
							// ELSE
							} else {
								//DIV
								WRKPC0 = rSh200sfm.getSedspc() / 100;
								//MULT
								rSh200sfm.setSeitam((float) (rSh200sfm.getSesprc() * rSh200sfm.getSeitqt()));
								//MULT
								rSh200sfm.setSeitam((float) (rSh200sfm.getSeitam() * WRKPC0));
								//ADD
								TOTDS0 = TOTDS0 + rSh200sfm.getSeitam();
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
				// ELSE
				} else {
					// IF STATEMENT
					if (rSh200sfm.getSeitem().compareTo("ANSC    ") == 0) {
						//SUB
						NOSEL0 = NOSEL0 - 1;
						// IF STATEMENT
						if (rSh200sfm.getSedsam() != 0) {
							//SUB
							TOTDS0 = TOTDS0 - rSh200sfm.getSedsam();
							//Z-ADD
							rSh200sfm.setSeitam(Float.valueOf(String.valueOf(0)));
						// ELSE
						} else {
							//DIV
							WRKPC0 = rSh200sfm.getSedspc() / 100;
							//MULT
							WRKPR0 = (float) (rSh200sfm.getCbmfwt() * WRKPC0);
							//Z-ADD
							rSh200sfm.setSeitam(Float.valueOf(String.valueOf(WRKPR0)));
							//SUB
							TOTDS0 = TOTDS0 - rSh200sfm.getSeitam();
							//Z-ADD
							rSh200sfm.setSeitam(Float.valueOf(String.valueOf(0)));
						// ENDIF
						}
					// ELSE
					} else {
						// IF STATEMENT
						if (rSh200sfm.getSeitem().compareTo("ADSC    ") == 0) {
							//SUB
							NOSEL0 = NOSEL0 - 1;
							// IF STATEMENT
							if (rSh200sfm.getSedsam() != 0) {
								//SUB
								TOTDS0 = TOTDS0 - rSh200sfm.getSedsam();
								//Z-ADD
								rSh200sfm.setSeitam(Float.valueOf(String.valueOf(0)));
							// ELSE
							} else {
								//DIV
								WRKPC0 = rSh200sfm.getSedspc() / 100;
								//ADD
								WRKPR0 = rSh200sfm.getCbbase() + rSh200sfm.getCbadd();
								//MULT
								WRKPR0 = (float) (WRKPR0 * WRKPC0);
								//Z-ADD
								rSh200sfm.setSeitam(Float.valueOf(String.valueOf(WRKPR0)));
								//SUB
								TOTDS0 = TOTDS0 - rSh200sfm.getSeitam();
								//Z-ADD
								rSh200sfm.setSeitam(Float.valueOf(String.valueOf(0)));
							// ENDIF
							}
						// ELSE
						} else {
							// IF STATEMENT
							if (ITEM00.compareTo("N") == 0) {
								// MOVE
								ITEM00 = String.valueOf("N");
								//SUB
								NOSEL0 = NOSEL0 - 1;
							// ENDIF
							}
							//SUB
							NOITM0 = NOITM0 - 1;
							// IF STATEMENT
							if (rSh200sfm.getSedsam() != 0) {
								//SUB
								TOTDS0 = TOTDS0 - rSh200sfm.getSedsam();
								//Z-ADD
								rSh200sfm.setSeitam(Float.valueOf(String.valueOf(0)));
							// ELSE
							} else {
								//DIV
								WRKPC0 = rSh200sfm.getSedspc() / 100;
								//MULT
								rSh200sfm.setSeitam((float) (rSh200sfm.getSesprc() * rSh200sfm.getSeitqt()));
								//MULT
								rSh200sfm.setSeitam((float) (rSh200sfm.getSeitam() * WRKPC0));
								//SUB
								TOTDS0 = TOTDS0 - rSh200sfm.getSeitam();
								//Z-ADD
								rSh200sfm.setSeitam(Float.valueOf(String.valueOf(0)));
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
		//ENDDO
		} while (IN21 == true);
	// ENDIF
	}
	//Z-ADD
	rSh200sfm.setReitam(Float.valueOf(String.valueOf(TOTDS0)));
	// IF STATEMENT
	if (rSh200sfm.getReitam() > rSh200sfm.getHbaxds() && rSh200sfm.getHbaxds() != 0 && rSh200sfm.getCbpkg().compareTo("PRO2K USAA TAK2") != 0 && rSh200sfm.getCbpkg().compareTo("P3K  USAA TAK2") != 0 && rSh200sfm.getCbpkg().compareTo("PRO2K USAA TAK2B") != 0 && rSh200sfm.getCbpkg().compareTo("P3K  USAA TAK2B") != 0) {
		//ADD
		RRNY = RRNY + 1;
		// MOVE
		rSh200sfm.setSyerrm(String.valueOf(ERR.get(18)));
		// MOVE
		IN98 = true ;
	// ENDIF
	}
	// IF STATEMENT
	if (NOSEL0 > rSh200sfm.getHbaxsl() && rSh200sfm.getHbaxsl() != 0) {
		//ADD
		RRNY = RRNY + 1;
		// MOVE
		rSh200sfm.setSyerrm(String.valueOf(ERR.get(19)));
		// MOVE
		IN98 = true ;
	// ENDIF
	}
	// IF STATEMENT
	if (NOITM0 > rSh200sfm.getHbitms() && rSh200sfm.getHbitms() != 0) {
		//ADD
		RRNY = RRNY + 1;
		// MOVE
		rSh200sfm.setSyerrm(String.valueOf(ERR.get(20)));
		// MOVE
		IN98 = true ;
	// ENDIF
	}
	// EVAL
	$GRPPOS = Integer.valueOf(String.valueOf(1));
	//DOW
	while (PGRP.get($GRPPOS).compareTo(" ") != 0) {
		// IF STATEMENT
		if (PGRPI.get($GRPPOS) > 1) {
			// EVAL
			RRNY = Integer.valueOf(String.valueOf(RRNY + 1));
			// EVAL
			rSh200sfm.setSyerrm( String.valueOf("PLEASE SELECT ONLY ONE ITEM FROM + GROUP "));
			// IF STATEMENT
			if (PGRP.get($GRPPOS).compareTo("*") != 0) {
				// EVAL
				rSh200sfm.setSyerrm( String.valueOf(rSh200sfm.getSyerrm().trim()+" "+PGRP.get($GRPPOS) +". "));
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setSyerrm( String.valueOf(rSh200sfm.getSyerrm().trim() + " ' '."));
			// ENDIF
			}
			// EVAL
		// ENDIF
		}
		// EVAL
		$GRPPOS = Integer.valueOf(String.valueOf($GRPPOS + 1));
	//ENDDO
	}
	// IF STATEMENT
	if (IN98 == true) {
	// ENDIF
	}
	// IF STATEMENT
	if (IN66 == true) {
		//Z-ADD
		WRKRNE = (int) Integer.valueOf(String.valueOf(0));
		//DOU
		do {
			//ADD
			WRKRNE = WRKRNE + 1;
			// IF STATEMENT
			if (IN79 == false) {
				//Z-ADD
				RR = (int) Integer.valueOf(String.valueOf(WRKRNE));
				// EVAL
				$GRPPOS = Integer.valueOf(String.valueOf(PIT.indexOf(rSh200sfm.getSeitem())));
				// EVAL
				RR = Integer.valueOf(String.valueOf($GRPPOS));
				// MOVE
				PMS.set(RR, rSh200sfm.getSemanu());
				// IF STATEMENT
				if (PCHG.get(RR).compareTo("Y") == 0) {
					// MOVE
					WSL.set(RR, rSh200sfm.getSemanu());
				// ENDIF
				}
			// ENDIF
			}
		//ENDDO
		} while (IN79 == true);
	// ENDIF
	}
	// MOVE
	in2kx8DS.in2kx8(Integer.valueOf(String.valueOf(rSh200sfm.getQdate())));
	// MOVE
	in2kx8DS.in2kp3(Integer.valueOf(String.valueOf(in2kx8DS.in2kp4())));
	// MOVE
	rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(in2kx8DS.in2kx6())));
	// IF STATEMENT
	if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
	// ELSE
	} else {
	// ENDIF
	}
	//EXSR
	AVALSB();
	//ENDSR
	}
	
//BEGSR
	public static void $DISRE () {
	// MOVE
	YTERR = String.valueOf(rSh200sfm.getCaterr());
	// CHAIN SETLL
	try {
		promst.getTransaction().begin();
		qPromst = promst.createQuery(proky4KL("Promst"), Promst.class);
		rPromstList = qPromst.getResultList();
		if (rPromstList.size() >= 1) {
			rPromst = new Promst();
			rPromstFOUND = true;
			rPromstEOF = false;
		} else {
			rPromstFOUND = false;
			rPromstEOF = true;
		}
		rPromstPOS = -1;
		promst.getTransaction().commit();
	} catch (Exception e) {
		promst.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rPromstFOUND = false;
	rPromstEOF = true;
	while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
		rPromst = rPromstList.get(++rPromstPOS);
		if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rSh200sfm.getHbprom()))) {
			rPromstFOUND = true;
			rPromstEOF = false;
		} else {
			rPromstFOUND = false;
			rPromstEOF = true;
		}

	}
	// IF STATEMENT
	if (! rPromstFOUND) {
		// MOVE
		YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
		// CHAIN SETLL
		try {
			promst.getTransaction().begin();
			qPromst = promst.createQuery(proky4KL("Promst"), Promst.class);
			rPromstList = qPromst.getResultList();
			if (rPromstList.size() >= 1) {
				rPromst = new Promst();
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}
			rPromstPOS = -1;
			promst.getTransaction().commit();
		} catch (Exception e) {
			promst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPromstFOUND = false;
		rPromstEOF = true;
		while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
			rPromst = rPromstList.get(++rPromstPOS);
				if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rSh200sfm.getHbprom()))) {
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}

		}
		// IF STATEMENT
		if (rPromstFOUND) {
			// IF STATEMENT
			if ($$ADTA.compareTo(rPromstlb.getPmefdt()) < 0 || $$ADTA.compareTo(rPromstlb.getPmcodt()) > 0) {
				// EVAL
				rSh200sfm.setHbprom( String.valueOf(""));
			// ENDIF
			}
		// ELSE
		} else {
		// ENDIF
		}
	// ELSE
	} else {
		// IF STATEMENT
		if ($$ADTA.compareTo(rPromstlb.getPmefdt()) < 0 || $$ADTA.compareTo(rPromstlb.getPmcodt()) > 0) {
			// EVAL
			rSh200sfm.setHbprom( String.valueOf(""));
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	PROMO0 = String.valueOf("");
	// CHAIN SETLL
	try {
		promst.getTransaction().begin();
		qPromst = promst.createQuery(proky4KL("Promst"), Promst.class);
		rPromstList = qPromst.getResultList();
		if (rPromstList.size() >= 1) {
			rPromst = new Promst();
			rPromstFOUND = true;
			rPromstEOF = false;
		} else {
			rPromstFOUND = false;
			rPromstEOF = true;
		}
		rPromstPOS = -1;
		promst.getTransaction().commit();
	} catch (Exception e) {
		promst.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rPromstFOUND = false;
	rPromstEOF = true;
	while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
		rPromst = rPromstList.get(++rPromstPOS);
		if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rSh200sfm.getHbprom()))) {
			rPromstFOUND = true;
			rPromstEOF = false;
		} else {
			rPromstFOUND = false;
			rPromstEOF = true;
		}

	}
	// CHAIN SETLL
	try {
		proext.getTransaction().begin();
		qProext = proext.createQuery(proky4KL("Proext"), Proext.class);
		rProextList = qProext.getResultList();
		if (rProextList.size() >= 1) {
			rProext = new Proext();
			rProextFOUND = true;
			rProextEOF = false;
		} else {
			rProextFOUND = false;
			rProextEOF = true;
		}
		rProextPOS = -1;
		proext.getTransaction().commit();
	} catch (Exception e) {
		proext.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rProextFOUND = false;
	rProextEOF = true;
	while (rProextPOS < rProextList.size() || rProextFOUND) {
		rProext = rProextList.get(++rProextPOS);
		if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(rSh200sfm.getHbprom()))) {
			rProextFOUND = true;
			rProextEOF = false;
		} else {
			rProextFOUND = false;
			rProextEOF = true;
		}

	}
	// IF STATEMENT
	if (IN78 == true) {
		// MOVE
		YTERR = String.valueOf(YTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
		// CHAIN SETLL
		try {
			promst.getTransaction().begin();
			qPromst = promst.createQuery(proky4KL("Promst"), Promst.class);
			rPromstList = qPromst.getResultList();
			if (rPromstList.size() >= 1) {
				rPromst = new Promst();
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}
			rPromstPOS = -1;
			promst.getTransaction().commit();
		} catch (Exception e) {
			promst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPromstFOUND = false;
		rPromstEOF = true;
		while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
			rPromst = rPromstList.get(++rPromstPOS);
				if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf(rSh200sfm.getHbprom()))) {
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}

		}
		// CHAIN SETLL
		try {
			proext.getTransaction().begin();
			qProext = proext.createQuery(proky4KL("Proext"), Proext.class);
			rProextList = qProext.getResultList();
			if (rProextList.size() >= 1) {
				rProext = new Proext();
				rProextFOUND = true;
				rProextEOF = false;
			} else {
				rProextFOUND = false;
				rProextEOF = true;
			}
			rProextPOS = -1;
			proext.getTransaction().commit();
		} catch (Exception e) {
			proext.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rProextFOUND = false;
		rProextEOF = true;
		while (rProextPOS < rProextList.size() || rProextFOUND) {
			rProext = rProextList.get(++rProextPOS);
				if (Objects.equals(String.valueOf(rProext.getPmetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProext.getPmepro()), String.valueOf(rSh200sfm.getHbprom()))) {
				rProextFOUND = true;
				rProextEOF = false;
			} else {
				rProextFOUND = false;
				rProextEOF = true;
			}

		}
	// ENDIF
	}
	// CHAIN SETLL
	try {
		prointro.getTransaction().begin();
		qProintro = prointro.createQuery(proky6KL("Prointro"), Prointro.class);
		rProintroList = qProintro.getResultList();
		if (rProintroList.size() >= 1) {
			rProintro = new Prointro();
			rProintroFOUND = true;
			rProintroEOF = false;
		} else {
			rProintroFOUND = false;
			rProintroEOF = true;
		}
		rProintroPOS = -1;
		prointro.getTransaction().commit();
	} catch (Exception e) {
		prointro.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rProintroFOUND = false;
	rProintroEOF = true;
	while (rProintroPOS < rProintroList.size() || rProintroFOUND) {
		rProintro = rProintroList.get(++rProintroPOS);
		if (Objects.equals(String.valueOf(rProintro.getPmtown()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProintro.getPmprcd()), String.valueOf(rPromstlb.getPmcode()))) {
			rProintroFOUND = true;
			rProintroEOF = false;
		} else {
			rProintroFOUND = false;
			rProintroEOF = true;
		}

	}
	// EVAL
	$$PROM = String.valueOf(rSh200sfm.getHbprom());
	//EXSR
	ASLPVAL();
	// EVAL
	$QPROM = String.valueOf(rSh200sfm.getHbprom());
	//EXSR
	AQSRCVAL();
	// IF STATEMENT
	if (AQSRC.compareTo("Y") != 0) {
	// ENDIF
	}
	// IF STATEMENT
	if (rProextFOUND && AADIS.compareTo("Y") == 0 && AQSRC.compareTo("Y") == 0) {
		// EVAL
		HBITAMT = Float.valueOf(String.valueOf(rProext.getPmesam()));
		// EVAL
		HBITPC = Float.valueOf(String.valueOf(rProext.getPmespc()));
		// EVAL
		HBITQTY = Integer.valueOf(String.valueOf(rProext.getPmeqty()));
		// EVAL
		HBITMX$ = Float.valueOf(String.valueOf(rProext.getPmemx$()));
		// EVAL
		HBITMXP = Float.valueOf(String.valueOf(rProext.getPmempc()));
	// ENDIF
	}
	// IF STATEMENT
	if (IN78 == false) {
		// MOVEA
		XIT = PIT;
		// MOVEA
		XMS = PMS;
		// MOVE
		PIT.clear(  );
		// MOVE
		PDS.clear(  );
		// MOVE
		PAD.set(0, "");
		PAD.set(1, "");
		PAD.set(2, "");
		PAD.set(3, "");
		PAD.set(4, "");
		PAD.set(5, "");
		PAD.set(6, "");
		PAD.set(7, "");
		PAD.set(8, "");
		PAD.set(9, "");
		PAD.set(10, "");
		PAD.set(11, "");
		PAD.set(12, "");
		PAD.set(13, "");
		PAD.set(14, "");
		PAD.set(15, "");
		PAD.set(16, "");
		PAD.set(17, "");
		PAD.set(18, "");
		PAD.set(19, "");
		PAD.set(20, "");
		PAD.set(21, "");
		PAD.set(22, "");
		PAD.set(23, "");
		PAD.set(24, "");
		PAD.set(25, "");
		PAD.set(26, "");
		PAD.set(27, "");
		PAD.set(28, "");
		PAD.set(29, "");
		PAD.set(30, "");
		PAD.set(31, "");
		PAD.set(32, "");
		PAD.set(33, "");
		PAD.set(34, "");
		PAD.set(35, "");
		PAD.set(36, "");
		PAD.set(37, "");
		PAD.set(38, "");
		PAD.set(39, "");
		PAD.set(40, "");
		PAD.set(41, "");
		PAD.set(42, "");
		PAD.set(43, "");
		PAD.set(44, "");
		PAD.set(45, "");
		PAD.set(46, "");
		PAD.set(47, "");
		PAD.set(48, "");
		PAD.set(49, "");
		PAD.set(50, "");
		PAD.set(51, "");
		PAD.set(52, "");
		PAD.set(53, "");
		PAD.set(54, "");
		PAD.set(55, "");
		PAD.set(56, "");
		PAD.set(57, "");
		PAD.set(58, "");
		PAD.set(59, "");
		PAD.set(60, "");
		PAD.set(61, "");
		PAD.set(62, "");
		PAD.set(63, "");
		PAD.set(64, "");
		PAD.set(65, "");
		PAD.set(66, "");
		PAD.set(67, "");
		PAD.set(68, "");
		PAD.set(69, "");
		PAD.set(70, "");
		PAD.set(71, "");
		PAD.set(72, "");
		PAD.set(73, "");
		PAD.set(74, "");
		PAD.set(75, "");
		PAD.set(76, "");
		PAD.set(77, "");
		PAD.set(78, "");
		PAD.set(79, "");
		PAD.set(80, "");
		PAD.set(81, "");
		PAD.set(82, "");
		PAD.set(83, "");
		PAD.set(84, "");
		PAD.set(85, "");
		PAD.set(86, "");
		PAD.set(87, "");
		PAD.set(88, "");
		PAD.set(89, "");
		PAD.set(90, "");
		PAD.set(91, "");
		PAD.set(92, "");
		PAD.set(93, "");
		PAD.set(94, "");
		PAD.set(95, "");
		PAD.set(96, "");
		PAD.set(97, "");
		PAD.set(98, "");
		PAD.set(99, "");
		//Z-ADD
		PMN.clear();
		//Z-ADD
		PDO.clear();
		//Z-ADD
		PPC.clear();
		//Z-ADD
		PMX.clear();
		//Z-ADD
		PQT.clear();
		//Z-ADD
		PAM.clear();
		//Z-ADD
		PSP.clear();
		// MOVE
		PMS.clear(  );
		// MOVE
		PGR.clear(  );
		// MOVE
		PGRP.clear(  );
		// MOVE
		PGRPS.clear(  );
		// MOVE
		PGRPI.clear(  );
		//Z-ADD
		$GRPINS = (int) Integer.valueOf(String.valueOf(0));
		// EVAL
		$GROUPS = String.valueOf(" ");
		// MOVE
		WSL.clear(  );
		//Z-ADD
		rSh200sfm.setCbadam(Float.valueOf(String.valueOf(0)));
		// MOVE
		FRCANA = String.valueOf("N");
		// MOVE
		FRCDSA = String.valueOf("N");
		// MOVE
		PROMO0 = String.valueOf(rPromstlb.getPmcode());
		// MOVE
		rSh200sfm.setHbprom(String.valueOf(rPromstlb.getPmcode()));
		// MOVE
		rSh200sfm.setHbdsal(String.valueOf(rPromstlb.getPmdsal()));
		//Z-ADD
		rSh200sfm.setHbdsam(Float.valueOf(String.valueOf(rPromstlb.getPmdsam())));
		//Z-ADD
		rSh200sfm.setHbdspc(Float.valueOf(String.valueOf(rPromstlb.getPmdspc())));
		// MOVE
		rSh200sfm.setHbdor$(String.valueOf(rPromstlb.getPmdor$()));
		// MOVE
		rSh200sfm.setHbdorp(String.valueOf(rPromstlb.getPmdorp()));
		// MOVE
		rSh200sfm.setHbanal(String.valueOf(rPromstlb.getPmanal()));
		//Z-ADD
		rSh200sfm.setHbands(Float.valueOf(String.valueOf(rPromstlb.getPmands())));
		//Z-ADD
		rSh200sfm.setHbanpc(Float.valueOf(String.valueOf(rPromstlb.getPmanpc())));
		//Z-ADD
		rSh200sfm.setHbaxds(Float.valueOf(String.valueOf(rPromstlb.getPmaxds())));
		//Z-ADD
		rSh200sfm.setHbaxsl((int) Integer.valueOf(String.valueOf(rPromstlb.getPmaxsl())));
		// MOVE
		rSh200sfm.setHbital(String.valueOf(rPromstlb.getPmital()));
		//Z-ADD
		rSh200sfm.setHbitms((int) Integer.valueOf(String.valueOf(rPromstlb.getPmitms())));
		//Z-ADD
		rSh200sfm.setHbadam(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setHbanam(Float.valueOf(String.valueOf(0)));
		//Z-ADD
		rSh200sfm.setHbitam(Float.valueOf(String.valueOf(0)));
		// IF STATEMENT
		if (rProextFOUND && AADIS.compareTo("Y") == 0 && AQSRC.compareTo("Y") == 0) {
			// EVAL
			HBITAMT = Float.valueOf(String.valueOf(rProext.getPmesam()));
			// EVAL
			HBITPC = Float.valueOf(String.valueOf(rProext.getPmespc()));
			// EVAL
			HBITQTY = Integer.valueOf(String.valueOf(rProext.getPmeqty()));
			// EVAL
			HBITMX$ = Float.valueOf(String.valueOf(rProext.getPmemx$()));
			// EVAL
			HBITMXP = Float.valueOf(String.valueOf(rProext.getPmempc()));
		// ENDIF
		}
		// IF STATEMENT
		if (AADIS.compareTo("Y") != 0 || AQSRC.compareTo("Y") != 0) {
			// EVAL
			rSh200sfm.setHbanal( String.valueOf("N"));
			// EVAL
			rSh200sfm.setHbdsal( String.valueOf("N"));
			// EVAL
			rSh200sfm.setHbital( String.valueOf("N"));
			// EVAL
			rSh200sfm.setHbprom( String.valueOf(""));
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getHbanal().compareTo("Y") == 0) {
			// MOVE
			FRCANA = String.valueOf("Y");
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getHbaxsl() == 0 || rSh200sfm.getHbaxsl() >= 2) {
			// IF STATEMENT
			if (rSh200sfm.getHbdsal().compareTo("Y") == 0) {
				// MOVE
				FRCDSA = String.valueOf("Y");
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	//Z-ADD
	P1 = (int) Integer.valueOf(String.valueOf(0));
	// IF STATEMENT
	if (rSh200sfm.getHbanal().compareTo("Y") == 0) {
		//ADD
		P1 = P1 + 1;
		// MOVE
		PIT.set(P1, "ANSC    ");
		// MOVE
		PDS.set(P1, ERR.get(15));
		// MOVE
		PAD.set(P1, "");
		//Z-ADD
		PMN.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PDO.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbands())));
		//Z-ADD
		PPC.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbanpc())));
		//Z-ADD
		PMX.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PQT.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PAM.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbanam())));
		//Z-ADD
		PSP.set(P1, Float.valueOf(String.valueOf(0)));
		// IF STATEMENT
		if (rSh200sfm.getHbanam() != 0 || FRCANA.compareTo("Y") == 0) {
			// MOVE
			PMS.set(P1, "Y");
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbdsal().compareTo("Y") == 0) {
		//ADD
		P1 = P1 + 1;
		// MOVE
		PIT.set(P1, "ADSC    ");
		// MOVE
		PDS.set(P1, ERR.get(16));
		// MOVE
		PAD.set(P1, "");
		//Z-ADD
		PMN.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PDO.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbdsam())));
		//Z-ADD
		PPC.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbdspc())));
		// MOVE
		PO$.set(P1, rSh200sfm.getHbdor$());
		// MOVE
		POP.set(P1, rSh200sfm.getHbdorp());
		//Z-ADD
		PMX.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PQT.set(P1, (int) Integer.valueOf(String.valueOf(0)));
		//Z-ADD
		PAM.set(P1, Float.valueOf(String.valueOf(rSh200sfm.getHbadam())));
		//Z-ADD
		PSP.set(P1, Float.valueOf(String.valueOf(0)));
		// IF STATEMENT
		if (rSh200sfm.getHbadam() != 0 || FRCDSA.compareTo("Y") == 0) {
			// MOVE
			PMS.set(P1, "Y");
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbital().compareTo("Y") == 0) {
		// IF STATEMENT
		if (HBITAMT != 0 || HBITPC != 0) {
			//ADD
			P1 = P1 + 1;
			// MOVE
			PIT.set(P1, $ITEM);
			// MOVE
			PDS.set(P1, ERR.get(25));
			// MOVE
			PAD.set(P1, "X");
			//Z-ADD
			PMN.set(P1, (int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			PDO.set(P1, Float.valueOf(String.valueOf(HBITAMT)));
			//Z-ADD
			PPC.set(P1, Float.valueOf(String.valueOf(HBITPC)));
			//Z-ADD
			PMX.set(P1, (int) Integer.valueOf(String.valueOf(HBITQTY)));
			//Z-ADD
			PQT.set(P1, (int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			PAM.set(P1, Float.valueOf(String.valueOf(0)));
			//Z-ADD
			PSP.set(P1, Float.valueOf(String.valueOf(0)));
			// MOVE
			PMS.set(P1, "Y");
		// ENDIF
		}
		// SETLL
		try {
			pritds.getTransaction().begin();
			qPritds = pritds.createQuery(proky4KL("Pritds"), Pritd.class);
			rPritdsList = qPritds.getResultList();
			if (rPritdsList.size() >= 1) {
				rPritds = new Pritd();
				rPritdsFOUND = true;
				rPritdsEOF = false;
			} else {
				rPritdsFOUND = false;
				rPritdsEOF = true;
			}
			rPritdsPOS = -1;
			pritds.getTransaction().commit();
		} catch (Exception e) {
			pritds.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		//DOU
		do {
			// READE
			rPritdsFOUND = false;
			rPritdsEOF = true;
			while (rPritdsPOS < rPritdsList.size() || rPritdsFOUND) {
				rPritds = rPritdsList.get(++rPritdsPOS);
							if (Objects.equals(String.valueOf(rPritds.getPrterr()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rPritds.getPrcode()), String.valueOf(rSh200sfm.getHbprom()))) {
					rPritdsFOUND = true;
					rPritdsEOF = false;
				} else {
					rPritdsFOUND = false;
					rPritdsEOF = true;
				}

			}
			// IF STATEMENT
			if (IN77 == false) {
				//ADD
				P1 = P1 + 1;
				// MOVE
				PIT.set(P1, rPritds.getPritem());
				// CHAIN SETLL
				try {
					itmast.getTransaction().begin();
					qItmast = itmast.createQuery("select c from Itmast c where c.IMITEM = '"+rPritds.getPritem()+"'", Itmast.class);
					rItmastList = qItmast.getResultList();
					if (rItmastList.size() >= 1) {
						rItmast = new Itmast();
						rItmastFOUND = true;
						rItmastEOF = false;
					} else {
						rItmastFOUND = false;
						rItmastEOF = true;
					}
					rItmastPOS = -1;
					itmast.getTransaction().commit();
				} catch (Exception e) {
					itmast.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rItmastFOUND = false;
				rItmastEOF = true;
				while (rItmastPOS < rItmastList.size() || rItmastFOUND) {
					rItmast = rItmastList.get(++rItmastPOS);
								if (Objects.equals(String.valueOf(rItmast.getImitem()), String.valueOf(rPritds.getPritem()))) {
						rItmastFOUND = true;
						rItmastEOF = false;
					} else {
						rItmastFOUND = false;
						rItmastEOF = true;
					}

				}
				// IF STATEMENT
				if (IN79 == false) {
					// MOVE
					PDS.set(P1, rItmast.getImdsc1());
				// ELSE
				} else {
					// MOVE
					PDS.set(P1, ERR.get(17));
				// ENDIF
				}
				// EVAL
				PIE.set(P1,  String.valueOf(rPritds.getPriore()));
				// EVAL
				PFB.set(P1,  String.valueOf(rPritds.getPradfb()));
				// MOVE
				PAD.set(P1, rPritds.getPraddo());
				//Z-ADD
				PMN.set(P1, (int) Integer.valueOf(String.valueOf(rPritds.getPrmqty())));
				//Z-ADD
				PDO.set(P1, Float.valueOf(String.valueOf(rPritds.getPrdsam())));
				//Z-ADD
				PPC.set(P1, Float.valueOf(String.valueOf(rPritds.getPrdspc())));
				//Z-ADD
				PMX.set(P1, (int) Integer.valueOf(String.valueOf(rPritds.getPrxqty())));
				//Z-ADD
				PQT.set(P1, (int) Integer.valueOf(String.valueOf(0)));
				//Z-ADD
				PAM.set(P1, Float.valueOf(String.valueOf(rPritds.getPrdsam())));
				//Z-ADD
				PSP.set(P1, Float.valueOf(String.valueOf(0)));
				// MOVE
				PMS.set(P1, " ");
				// IF STATEMENT
				if (PIE.get(P1).compareTo("I") == 0) {
					// MOVE
					WSL.set(P1, "Y");
				// ENDIF
				}
				// CHAIN SETLL
				try {
					pritdse.getTransaction().begin();
					qPritdse = pritdse.createQuery(itgrkyKL("Pritdse"), Pritdse.class);
					rPritdseList = qPritdse.getResultList();
					if (rPritdseList.size() >= 1) {
						rPritdse = new Pritdse();
						rPritdseFOUND = true;
						rPritdseEOF = false;
					} else {
						rPritdseFOUND = false;
						rPritdseEOF = true;
					}
					rPritdsePOS = -1;
					pritdse.getTransaction().commit();
				} catch (Exception e) {
					pritdse.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rPritdseFOUND = false;
				rPritdseEOF = true;
				while (rPritdsePOS < rPritdseList.size() || rPritdseFOUND) {
					rPritdse = rPritdseList.get(++rPritdsePOS);
								if (Objects.equals(String.valueOf(rPritdse.getPeterr()), String.valueOf(rPritds.getPrterr())) && Objects.equals(String.valueOf(rPritdse.getPecode()), String.valueOf(rPritds.getPrcode())) && Objects.equals(String.valueOf(rPritdse.getPeitem()), String.valueOf(rPritds.getPritem()))) {
						rPritdseFOUND = true;
						rPritdseEOF = false;
					} else {
						rPritdseFOUND = false;
						rPritdseEOF = true;
					}

				}
				// IF STATEMENT
				if (rPritdseFOUND && PIE.get(P1).compareTo("O") == 0) {
					// MOVE
					PGR.set(P1, rPritdse.getPegrp());
					// MOVE
					PGRPS.set(P1, rPritdse.getPegrp());
					// IF STATEMENT
					if (PGR.get(P1).compareTo(" ") == 0) {
						// MOVE
						PGR.set(P1, "*");
					// ENDIF
					}
				// ELSE
				} else {
					// MOVE
					PGR.set(P1, " ");
				// ENDIF
				}
				// IF STATEMENT
				if (PGR.get(P1).compareTo(" ") != 0) {
					// EVAL
					$GRPPOS = Integer.valueOf(String.valueOf(PGRP.indexOf(PGR.get(P1))));
					// IF STATEMENT
					if ($GRPPOS > 0) {
						// IF STATEMENT
						if (PGR.get(P1).compareTo(" ") != 0 && PIE.get(P1).compareTo("O") == 0 && PAM.get(P1) > 0 &&  PMS.get(P1).compareTo("Y") == 0) {
							// EVAL
							PGRPI.set($GRPPOS,  Integer.valueOf(String.valueOf(PGRPI.get($GRPPOS) + 1)));
						// ENDIF
						}
					// ELSE
					} else {
						// EVAL
						$GRPINS = Integer.valueOf(String.valueOf($GRPINS + 1));
						// IF STATEMENT
						if (PGR.get(P1).compareTo(" ") != 0 && PIE.get(P1).compareTo("O") == 0 && PAM.get(P1) > 0 &&  PMS.get(P1).compareTo("Y") == 0) {
							// EVAL
							PGRPI.set($GRPINS,  Integer.valueOf(String.valueOf(1)));
						// ENDIF
						}
						// EVAL
						PGRP.set($GRPINS,  String.valueOf(PGR.get(P1)));
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
		//ENDDO
		} while (IN77 == true);
	// ENDIF
	}
	//DOU
	do {
		// IF STATEMENT
		if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
		// ELSE
		} else {
		// ENDIF
		}
		// IF STATEMENT
		if (IN79 == false) {
			//Z-ADD
			rSh200sfm.setHsmqty((int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setHsdsam(Float.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setHsdspc(Float.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setHsxqty((int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setSbitqt((int) Integer.valueOf(String.valueOf(0)));
			//Z-ADD
			rSh200sfm.setSbitam(Float.valueOf(String.valueOf(0)));
			//Z-ADD
			P2 = (int) Integer.valueOf(String.valueOf(1));
			// IF STATEMENT
			if (IN77 == false) {
				//Z-ADD
				P2 = (int) Integer.valueOf(String.valueOf(1));
			// ENDIF
			}
			// IF STATEMENT
			if (IN77 == true) {
				// MOVE
				rSh200sfm.setHsaddo(String.valueOf(PAD.get(P2)));
				//Z-ADD
				rSh200sfm.setHsmqty((int) Integer.valueOf(String.valueOf(PMN.get(P2))));
				//Z-ADD
				rSh200sfm.setHsdsam(Float.valueOf(String.valueOf(PDO.get(P2))));
				//Z-ADD
				rSh200sfm.setHsdspc(Float.valueOf(String.valueOf(PPC.get(P2))));
				//Z-ADD
				rSh200sfm.setHsxqty((int) Integer.valueOf(String.valueOf(PMX.get(P2))));
				//Z-ADD
				rSh200sfm.setSbitam(Float.valueOf(String.valueOf(PAM.get(P2))));
			// ENDIF
			}
			// MOVE
			IN86 = true ;
			// EVAL
			$ITMDESC = String.valueOf(rSh200sfm.getSbitem());
			// CHAIN SETLL
			try {
				adtitmo.getTransaction().begin();
				qAdtitmo = adtitmo.createQuery($kitmoKL("Adtitmo"), Adtitmo.class);
				rAdtitmoList = qAdtitmo.getResultList();
				if (rAdtitmoList.size() >= 1) {
					rAdtitmo = new Adtitmo();
					rAdtitmoFOUND = true;
					rAdtitmoEOF = false;
				} else {
					rAdtitmoFOUND = false;
					rAdtitmoEOF = true;
				}
				rAdtitmoPOS = -1;
				adtitmo.getTransaction().commit();
			} catch (Exception e) {
				adtitmo.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rAdtitmoFOUND = false;
			rAdtitmoEOF = true;
			while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
				rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
						if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
					rAdtitmoFOUND = true;
					rAdtitmoEOF = false;
				} else {
					rAdtitmoFOUND = false;
					rAdtitmoEOF = true;
				}

			}
			// IF STATEMENT
			if (rAdtitmoFOUND) {
				// EVAL
			// ELSE
			} else {
				// CHAIN SETLL
				try {
					adtitmo.getTransaction().begin();
					qAdtitmo = adtitmo.createQuery($kitmo99KL("Adtitmo"), Adtitmo.class);
					rAdtitmoList = qAdtitmo.getResultList();
					if (rAdtitmoList.size() >= 1) {
						rAdtitmo = new Adtitmo();
						rAdtitmoFOUND = true;
						rAdtitmoEOF = false;
					} else {
						rAdtitmoFOUND = false;
						rAdtitmoEOF = true;
					}
					rAdtitmoPOS = -1;
					adtitmo.getTransaction().commit();
				} catch (Exception e) {
					adtitmo.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rAdtitmoFOUND = false;
				rAdtitmoEOF = true;
				while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
					rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
								if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
						rAdtitmoFOUND = true;
						rAdtitmoEOF = false;
					} else {
						rAdtitmoFOUND = false;
						rAdtitmoEOF = true;
					}

				}
				// IF STATEMENT
				if (rAdtitmoFOUND) {
					// EVAL
				// ELSE
				} else {
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
			//EXSR
			GETATTR();
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
			// ELSE
			} else {
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	//Z-ADD
	P2 = (int) Integer.valueOf(String.valueOf(0));
	//DO
	for (P2 = 1; P2 < P1; P2++) {
		//Z-ADD
		X1 = (int) Integer.valueOf(String.valueOf(1));
		// IF STATEMENT
		if (IN79 == true  && XMS.get(X1).compareTo("Y") == 0) {
			// MOVE
			PMS.set(P2, "Y");
		// ENDIF
		}
	//ENDDO
	}
	// IF STATEMENT
	if (AUTOREDIS == false) {
		//EXSR
		AVALSB();
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void $LODDS () {
	//EXSR
	ASLPVAL();
	// MOVE
	PROMO0 = String.valueOf(rPromstlb.getPmcode());
	// MOVE
	rSh200sfm.setHbprom(String.valueOf(rPromstlb.getPmcode()));
	// MOVE
	rSh200sfm.setHbdsal(String.valueOf(rPromstlb.getPmdsal()));
	//Z-ADD
	rSh200sfm.setHbdsam(Float.valueOf(String.valueOf(rPromstlb.getPmdsam())));
	//Z-ADD
	rSh200sfm.setHbdspc(Float.valueOf(String.valueOf(rPromstlb.getPmdspc())));
	// MOVE
	rSh200sfm.setHbdor$(String.valueOf(rPromstlb.getPmdor$()));
	// MOVE
	rSh200sfm.setHbdorp(String.valueOf(rPromstlb.getPmdorp()));
	// MOVE
	rSh200sfm.setHbanal(String.valueOf(rPromstlb.getPmanal()));
	//Z-ADD
	rSh200sfm.setHbands(Float.valueOf(String.valueOf(rPromstlb.getPmands())));
	//Z-ADD
	rSh200sfm.setHbanpc(Float.valueOf(String.valueOf(rPromstlb.getPmanpc())));
	//Z-ADD
	rSh200sfm.setHbaxds(Float.valueOf(String.valueOf(rPromstlb.getPmaxds())));
	//Z-ADD
	rSh200sfm.setHbaxsl((int) Integer.valueOf(String.valueOf(rPromstlb.getPmaxsl())));
	// MOVE
	rSh200sfm.setHbital(String.valueOf(rPromstlb.getPmital()));
	//Z-ADD
	rSh200sfm.setHbitms((int) Integer.valueOf(String.valueOf(rPromstlb.getPmitms())));
	//Z-ADD
	rSh200sfm.setHbadam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbanam(Float.valueOf(String.valueOf(0)));
	//Z-ADD
	rSh200sfm.setHbitam(Float.valueOf(String.valueOf(0)));
	// IF STATEMENT
	if (rProextFOUND && AADIS.compareTo("Y") == 0 && AQSRC.compareTo("Y") == 0) {
		// EVAL
		HBITAMT = Float.valueOf(String.valueOf(rProext.getPmesam()));
		// EVAL
		HBITPC = Float.valueOf(String.valueOf(rProext.getPmespc()));
		// EVAL
		HBITQTY = Integer.valueOf(String.valueOf(rProext.getPmeqty()));
		// EVAL
		HBITMX$ = Float.valueOf(String.valueOf(rProext.getPmemx$()));
		// EVAL
		HBITMXP = Float.valueOf(String.valueOf(rProext.getPmempc()));
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbanal().compareTo("Y") == 0) {
		// MOVE
		FRCANA = String.valueOf("Y");
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbaxsl() == 0 || rSh200sfm.getHbaxsl() >= 2) {
		// IF STATEMENT
		if (rSh200sfm.getHbdsal().compareTo("Y") == 0) {
			// MOVE
			FRCDSA = String.valueOf("Y");
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getHbaxsl() == 1 && rSh200sfm.getHbanal().compareTo("Y") != 0) {
		// IF STATEMENT
		if (rSh200sfm.getHbdsal().compareTo("Y") == 0) {
			// MOVE
			FRCDSA = String.valueOf("Y");
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (AADIS.compareTo("Y") != 0 || AQSRC.compareTo("Y") != 0) {
		// EVAL
		rSh200sfm.setHbanal( String.valueOf("N"));
		// EVAL
		rSh200sfm.setHbdsal( String.valueOf("N"));
		// EVAL
		FRCDSA = String.valueOf("N");
		// EVAL
		FRCANA = String.valueOf("N");
		// EVAL
		rSh200sfm.setHbital( String.valueOf("N"));
		// EVAL
		rSh200sfm.setHbprom( String.valueOf(""));
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void $HELP () {
	// MOVE
	binaryDS.linhex(String.valueOf(wsdsDS.fil()));
	// MOVE
	binaryDS.poshex(String.valueOf(wsdsDS.col()));
	// MOVE
	ROW = Integer.valueOf(String.valueOf(binaryDS.line()));
	// MOVE
	CPOS = Integer.valueOf(String.valueOf(binaryDS.pos()));
	// MOVE
	SCRNAM = String.valueOf(PGMSCR);
	//ENDSR
	}
	
//BEGSR
	public static void $INTFZ () {
	// MOVEA
	IN97 = false;
	// MOVEA
	IN98 = false;
	// MOVE
	IN97 = true ;
	// EVAL
	rSh200sfm.setSzerrm( String.valueOf(""));
	// IF STATEMENT
	if (APRMFLG == 0) {
		// EVAL
		rSh200sfm.setErmsg1( String.valueOf(""));
	// ENDIF
	}
	//Z-ADD
	RRNZ = (int) Integer.valueOf(String.valueOf(0));
	//ENDSR
	}
	
//BEGSR
	public static void $INTFY () {
	// MOVEA
	IN97 = false;
	// MOVEA
	IN98 = false;
	// MOVE
	IN97 = true ;
	// EVAL
	rSh200sfm.setSyerrm( String.valueOf(""));
	//Z-ADD
	RRNY = (int) Integer.valueOf(String.valueOf(0));
	//ENDSR
	}
	
//BEGSR
	public static void $ERROR () {
	// MOVE
	binaryDS.linhex(String.valueOf(wsdsDS.fil()));
	// MOVE
	binaryDS.poshex(String.valueOf(wsdsDS.col()));
	// MOVE
	ROW = Integer.valueOf(String.valueOf(binaryDS.line()));
	// MOVE
	CPOS = Integer.valueOf(String.valueOf(binaryDS.pos()));
	//ENDSR
	}
	
//BEGSR
	public static void $OVRITM () {
	//ENDSR
	}
	
//BEGSR
	public static void $CHKQF () {
	// EVAL
	$COUNTER = Integer.valueOf(String.valueOf(0));
	// SETLL
	try {
		qufdtl.getTransaction().begin();
		qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+$ACCT+"'", Qufdtl.class);
		rQufdtlList = qQufdtl.getResultList();
		if (rQufdtlList.size() >= 1) {
			rQufdtl = new Qufdtl();
			rQufdtlFOUND = true;
			rQufdtlEOF = false;
		} else {
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
		}
		rQufdtlPOS = -1;
		qufdtl.getTransaction().commit();
	} catch (Exception e) {
		qufdtl.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READE
	rQufdtlFOUND = false;
	rQufdtlEOF = true;
	while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
		rQufdtl = rQufdtlList.get(++rQufdtlPOS);
				if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
			rQufdtlFOUND = true;
			rQufdtlEOF = false;
		} else {
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
		}

	}
	//DOW
	while (IN79 == false) {
		//ADD
		$COUNTER = $COUNTER + 1;
		// READE
		rQufdtlFOUND = false;
		rQufdtlEOF = true;
		while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
			rQufdtl = rQufdtlList.get(++rQufdtlPOS);
					if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
				rQufdtlFOUND = true;
				rQufdtlEOF = false;
			} else {
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
			}

		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void MULTIPKG () {
	// EVAL
	$ACCT = String.valueOf(ldadsDS.lmms());
	// CHAIN SETLL
	try {
		mp100la.getTransaction().begin();
		qMp100la = mp100la.createQuery("select c from Mp100la c where c.MPBPKG = '"+MPKG+"'", Mp100la.class);
		rMp100laList = qMp100la.getResultList();
		if (rMp100laList.size() >= 1) {
			rMp100la = new Mp100la();
			rMp100laFOUND = true;
			rMp100laEOF = false;
		} else {
			rMp100laFOUND = false;
			rMp100laEOF = true;
		}
		rMp100laPOS = -1;
		mp100la.getTransaction().commit();
	} catch (Exception e) {
		mp100la.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rMp100laFOUND = false;
	rMp100laEOF = true;
	while (rMp100laPOS < rMp100laList.size() || rMp100laFOUND) {
		rMp100la = rMp100laList.get(++rMp100laPOS);
		if (Objects.equals(String.valueOf(rMp100la.getMpbpkg()), String.valueOf(MPKG))) {
			rMp100laFOUND = true;
			rMp100laEOF = false;
		} else {
			rMp100laFOUND = false;
			rMp100laEOF = true;
		}

	}
	// IF STATEMENT
	if (rMp100laFOUND) {
		// EVAL
		// SETLL
		try {
			qufdtl.getTransaction().begin();
			qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+$ACCT+"'", Qufdtl.class);
			rQufdtlList = qQufdtl.getResultList();
			if (rQufdtlList.size() >= 1) {
				rQufdtl = new Qufdtl();
				rQufdtlFOUND = true;
				rQufdtlEOF = false;
			} else {
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
			}
			rQufdtlPOS = -1;
			qufdtl.getTransaction().commit();
		} catch (Exception e) {
			qufdtl.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// READE
		rQufdtlFOUND = false;
		rQufdtlEOF = true;
		while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
			rQufdtl = rQufdtlList.get(++rQufdtlPOS);
					if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
				rQufdtlFOUND = true;
				rQufdtlEOF = false;
			} else {
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
			}

		}
		//DOW
		while (! rQufdtlEOF) {
			// CHAIN SETLL
			try {
				quhdr.getTransaction().begin();
				qQuhdr = quhdr.createQuery(quhkyKL("Quhdr"), Quhdr.class);
				rQuhdrList = qQuhdr.getResultList();
				if (rQuhdrList.size() >= 1) {
					rQuhdr = new Quhdr();
					rQuhdrFOUND = true;
					rQuhdrEOF = false;
				} else {
					rQuhdrFOUND = false;
					rQuhdrEOF = true;
				}
				rQuhdrPOS = -1;
				quhdr.getTransaction().commit();
			} catch (Exception e) {
				quhdr.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
			while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
				rQuhdr = rQuhdrList.get(++rQuhdrPOS);
						if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf($ACCT)) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtl.getFdseq()))) {
					rQuhdrFOUND = true;
					rQuhdrEOF = false;
				} else {
					rQuhdrFOUND = false;
					rQuhdrEOF = true;
				}

			}
			// IF STATEMENT
			if (rQuhdrFOUND  && rQuhdr.getQupkg().compareTo(rMp100.getMpapkg()) == 0) {
				// EVAL
			// ENDIF
			}
			// READE
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
			while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
				rQufdtl = rQufdtlList.get(++rQufdtlPOS);
						if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
					rQufdtlFOUND = true;
					rQufdtlEOF = false;
				} else {
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
				}

			}
		//ENDDO
		}
		// IF STATEMENT
		if (NOAPKG) {
			//ADD
			RRNZ = RRNZ + 1;
			// EVAL
			rSh200sfm.setSzerrm( String.valueOf(rMp100.getMpbpkg().trim() + " CANNOT BE " + "FINALIZED BEFORE " + rMp100.getMpapkg().trim() + " IS FINALIZED."));
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void MULTIPKGAB () {
	// EVAL
	$ACCT = String.valueOf(ldadsDS.lmms());
	// CHAIN SETLL
	try {
		mp100.getTransaction().begin();
		qMp100 = mp100.createQuery("select c from Mp100 c where c.MPAPKG = '"+MPKG+"'", Mp100.class);
		rMp100List = qMp100.getResultList();
		if (rMp100List.size() >= 1) {
			rMp100 = new Mp100();
			rMp100FOUND = true;
			rMp100EOF = false;
		} else {
			rMp100FOUND = false;
			rMp100EOF = true;
		}
		rMp100POS = -1;
		mp100.getTransaction().commit();
	} catch (Exception e) {
		mp100.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rMp100FOUND = false;
	rMp100EOF = true;
	while (rMp100POS < rMp100List.size() || rMp100FOUND) {
		rMp100 = rMp100List.get(++rMp100POS);
		if (Objects.equals(String.valueOf(rMp100.getMpapkg()), String.valueOf(MPKG))) {
			rMp100FOUND = true;
			rMp100EOF = false;
		} else {
			rMp100FOUND = false;
			rMp100EOF = true;
		}

	}
	// IF STATEMENT
	if (rMp100FOUND) {
		// EVAL
		// EVAL
		KPKG = String.valueOf(rMp100.getMpbpkg());
		// CHAIN SETLL
		try {
			quhdrlb.getTransaction().begin();
			qQuhdrlb = quhdrlb.createQuery(qhkeyKL("Quhdrlb"), Quhdrlb.class);
			rQuhdrlbList = qQuhdrlb.getResultList();
			if (rQuhdrlbList.size() >= 1) {
				rQuhdrlb = new Quhdrlb();
				rQuhdrlbFOUND = true;
				rQuhdrlbEOF = false;
			} else {
				rQuhdrlbFOUND = false;
				rQuhdrlbEOF = true;
			}
			rQuhdrlbPOS = -1;
			quhdrlb.getTransaction().commit();
		} catch (Exception e) {
			quhdrlb.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdrlbFOUND = false;
		rQuhdrlbEOF = true;
		while (rQuhdrlbPOS < rQuhdrlbList.size() || rQuhdrlbFOUND) {
			rQuhdrlb = rQuhdrlbList.get(++rQuhdrlbPOS);
				if (Objects.equals(String.valueOf(rQuhdrlb.getQuacct()), String.valueOf($ACCT)) && Objects.equals(String.valueOf(rQuhdrlb.getQupkg()), String.valueOf(KPKG))) {
				rQuhdrlbFOUND = true;
				rQuhdrlbEOF = false;
			} else {
				rQuhdrlbFOUND = false;
				rQuhdrlbEOF = true;
			}

		}
		// IF STATEMENT
		if (rQuhdrlbFOUND) {
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (NOBPKG) {
			//ADD
			RRNZ = RRNZ + 1;
			// EVAL
			rSh200sfm.setSzerrm( String.valueOf(rMp100.getMpapkg().trim() + " CANNOT BE " + "FINALIZED WITHOUT " + rMp100.getMpbpkg()));
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	// CHAIN SETLL
	try {
		mp100la.getTransaction().begin();
		qMp100la = mp100la.createQuery("select c from Mp100la c where c.MPBPKG = '"+MPKG+"'", Mp100la.class);
		rMp100laList = qMp100la.getResultList();
		if (rMp100laList.size() >= 1) {
			rMp100la = new Mp100la();
			rMp100laFOUND = true;
			rMp100laEOF = false;
		} else {
			rMp100laFOUND = false;
			rMp100laEOF = true;
		}
		rMp100laPOS = -1;
		mp100la.getTransaction().commit();
	} catch (Exception e) {
		mp100la.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rMp100laFOUND = false;
	rMp100laEOF = true;
	while (rMp100laPOS < rMp100laList.size() || rMp100laFOUND) {
		rMp100la = rMp100laList.get(++rMp100laPOS);
		if (Objects.equals(String.valueOf(rMp100la.getMpbpkg()), String.valueOf(MPKG))) {
			rMp100laFOUND = true;
			rMp100laEOF = false;
		} else {
			rMp100laFOUND = false;
			rMp100laEOF = true;
		}

	}
	// IF STATEMENT
	if (rMp100laFOUND) {
		// EVAL
		// EVAL
		KPKG = String.valueOf(rMp100.getMpapkg());
		// CHAIN SETLL
		try {
			quhdrlb.getTransaction().begin();
			qQuhdrlb = quhdrlb.createQuery(qhkeyKL("Quhdrlb"), Quhdrlb.class);
			rQuhdrlbList = qQuhdrlb.getResultList();
			if (rQuhdrlbList.size() >= 1) {
				rQuhdrlb = new Quhdrlb();
				rQuhdrlbFOUND = true;
				rQuhdrlbEOF = false;
			} else {
				rQuhdrlbFOUND = false;
				rQuhdrlbEOF = true;
			}
			rQuhdrlbPOS = -1;
			quhdrlb.getTransaction().commit();
		} catch (Exception e) {
			quhdrlb.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdrlbFOUND = false;
		rQuhdrlbEOF = true;
		while (rQuhdrlbPOS < rQuhdrlbList.size() || rQuhdrlbFOUND) {
			rQuhdrlb = rQuhdrlbList.get(++rQuhdrlbPOS);
				if (Objects.equals(String.valueOf(rQuhdrlb.getQuacct()), String.valueOf($ACCT)) && Objects.equals(String.valueOf(rQuhdrlb.getQupkg()), String.valueOf(KPKG))) {
				rQuhdrlbFOUND = true;
				rQuhdrlbEOF = false;
			} else {
				rQuhdrlbFOUND = false;
				rQuhdrlbEOF = true;
			}

		}
		// IF STATEMENT
		if (rQuhdrlbFOUND) {
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (NOAPKG) {
			//ADD
			RRNZ = RRNZ + 1;
			// EVAL
			rSh200sfm.setSzerrm( String.valueOf(rMp100.getMpbpkg().trim() + " CANNOT BE " + "FINALIZED WITHOUT " + rMp100.getMpapkg()));
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void MULTIPKGREV () {
	// EVAL
	$ACCT = String.valueOf(ldadsDS.lmms());
	// CHAIN SETLL
	try {
		mp100.getTransaction().begin();
		qMp100 = mp100.createQuery("select c from Mp100 c where c.MPAPKG = '"+MPKG+"'", Mp100.class);
		rMp100List = qMp100.getResultList();
		if (rMp100List.size() >= 1) {
			rMp100 = new Mp100();
			rMp100FOUND = true;
			rMp100EOF = false;
		} else {
			rMp100FOUND = false;
			rMp100EOF = true;
		}
		rMp100POS = -1;
		mp100.getTransaction().commit();
	} catch (Exception e) {
		mp100.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rMp100FOUND = false;
	rMp100EOF = true;
	while (rMp100POS < rMp100List.size() || rMp100FOUND) {
		rMp100 = rMp100List.get(++rMp100POS);
		if (Objects.equals(String.valueOf(rMp100.getMpapkg()), String.valueOf(MPKG))) {
			rMp100FOUND = true;
			rMp100EOF = false;
		} else {
			rMp100FOUND = false;
			rMp100EOF = true;
		}

	}
	// IF STATEMENT
	if (rMp100FOUND) {
		// EVAL
		// SETLL
		try {
			qufdtl.getTransaction().begin();
			qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+$ACCT+"'", Qufdtl.class);
			rQufdtlList = qQufdtl.getResultList();
			if (rQufdtlList.size() >= 1) {
				rQufdtl = new Qufdtl();
				rQufdtlFOUND = true;
				rQufdtlEOF = false;
			} else {
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
			}
			rQufdtlPOS = -1;
			qufdtl.getTransaction().commit();
		} catch (Exception e) {
			qufdtl.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// READE
		rQufdtlFOUND = false;
		rQufdtlEOF = true;
		while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
			rQufdtl = rQufdtlList.get(++rQufdtlPOS);
					if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
				rQufdtlFOUND = true;
				rQufdtlEOF = false;
			} else {
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
			}

		}
		//DOW
		while (! rQufdtlEOF) {
			// CHAIN SETLL
			try {
				quhdr.getTransaction().begin();
				qQuhdr = quhdr.createQuery(quhkyKL("Quhdr"), Quhdr.class);
				rQuhdrList = qQuhdr.getResultList();
				if (rQuhdrList.size() >= 1) {
					rQuhdr = new Quhdr();
					rQuhdrFOUND = true;
					rQuhdrEOF = false;
				} else {
					rQuhdrFOUND = false;
					rQuhdrEOF = true;
				}
				rQuhdrPOS = -1;
				quhdr.getTransaction().commit();
			} catch (Exception e) {
				quhdr.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
			while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
				rQuhdr = rQuhdrList.get(++rQuhdrPOS);
						if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf($ACCT)) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtl.getFdseq()))) {
					rQuhdrFOUND = true;
					rQuhdrEOF = false;
				} else {
					rQuhdrFOUND = false;
					rQuhdrEOF = true;
				}

			}
			// IF STATEMENT
			if (rQuhdrFOUND  && rQuhdr.getQupkg().compareTo(rMp100.getMpbpkg()) == 0) {
				// EVAL
			// ENDIF
			}
			// READE
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
			while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
				rQufdtl = rQufdtlList.get(++rQufdtlPOS);
						if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf($ACCT))) {
					rQufdtlFOUND = true;
					rQufdtlEOF = false;
				} else {
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
				}

			}
		//ENDDO
		}
		// IF STATEMENT
		if (VVPKG) {
			//ADD
			RRNZ = RRNZ + 1;
			// EVAL
			rSh200sfm.setSzerrm( String.valueOf(rMp100.getMpapkg().trim() + " CANNOT BE " + "REVERSED BEFORE " + rMp100.getMpbpkg().trim() + " IS REVERSED."));
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void USAADISCD () {
	// EVAL
	USAA_ADSC = Float.valueOf(String.valueOf(0));
	// EVAL
	USAA_ITEM = Float.valueOf(String.valueOf(0));
	//EXSR
	USAA10();
	// CHAIN SETLL
	try {
		proextn.getTransaction().begin();
		qProextn = proextn.createQuery(proky7KL("Proextn"), Proextn.class);
		rProextnList = qProextn.getResultList();
		if (rProextnList.size() >= 1) {
			rProextn = new Proextn();
			rProextnFOUND = true;
			rProextnEOF = false;
		} else {
			rProextnFOUND = false;
			rProextnEOF = true;
		}
		rProextnPOS = -1;
		proextn.getTransaction().commit();
	} catch (Exception e) {
		proextn.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rProextnFOUND = false;
	rProextnEOF = true;
	while (rProextnPOS < rProextnList.size() || rProextnFOUND) {
		rProextn = rProextnList.get(++rProextnPOS);
		if (Objects.equals(String.valueOf(rProextn.getPeetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProextn.getPeepro()), String.valueOf(rSh200sfm.getHbprom()))) {
			rProextnFOUND = true;
			rProextnEOF = false;
		} else {
			rProextnFOUND = false;
			rProextnEOF = true;
		}

	}
	// IF STATEMENT
	if (rProextnFOUND) {
		// IF STATEMENT
		if ((rSh200sfm.getCbbase() + rSh200sfm.getCbadd2() - FBITEMS) < rProextn.getPeadmia()) {
			// EVAL
			rSh200sfm.setCbadam( Float.valueOf(String.valueOf(0)));
			// EVAL
			rSh200sfm.setHbadam( Float.valueOf(String.valueOf(0)));
			// EVAL
			rSh200sfm.setHbdsam( Float.valueOf(String.valueOf(0)));
			// EVAL
			$AMOUNT = Float.valueOf(String.valueOf(0));
		// ENDIF
		}
		// IF STATEMENT
		if (rProextn.getPeadmia() > 0 && rSh200sfm.getHbadam() > 0 && rSh200sfm.getHbdsam() == 0) {
			// EVAL
			rSh200sfm.setHbdsam( Float.valueOf(String.valueOf(rPromstlb.getPmdsam())));
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (USAA10P == true) {
		// EVAL
		USAA_ADSC = Float.valueOf(String.valueOf((rSh200sfm.getCbbase() + rSh200sfm.getCbadd2() + rSh200sfm.getCbadam()) * .1));
		//SUB
		rSh200sfm.setCbadam(rSh200sfm.getCbadam() - USAA_ADSC);
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void USAADISCA () {
	// EVAL
	USAA_ITEM = Float.valueOf(String.valueOf(0));
	//EXSR
	USAA10();
	// IF STATEMENT
	if (USAA10P == true) {
		// EVAL
		USAA_ITEM = Float.valueOf(String.valueOf(rSh200sfm.getCbadd2() * .1));
		//SUB
		rSh200sfm.setCbadam(rSh200sfm.getCbadam() - USAA_ITEM);
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void USAADISCN () {
	// EVAL
	USAA_ANSC = Float.valueOf(String.valueOf(0));
	//EXSR
	USAA10();
	// IF STATEMENT
	if (USAA10P == true) {
		// EVAL
		USAA_ANSC = Float.valueOf(String.valueOf((rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam()) * (rAdtqspp.getAqdisc() *.01)));
		//SUB
		rSh200sfm.setCbanam(rSh200sfm.getCbanam() - USAA_ANSC);
		// EVAL
		rSh200sfm.setCbanmm( Float.valueOf(String.valueOf(rSh200sfm.getCbanam() / 12)));
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void USAA10 () {
	// EVAL
	// CHAIN SETLL
	try {
		adtqspp.getTransaction().begin();
		qAdtqspp = adtqspp.createQuery("select c from Adtqspp c where c.AQPROM = '"+rSh200sfm.getHbprom()+"'", Adtqspp.class);
		rAdtqsppList = qAdtqspp.getResultList();
		if (rAdtqsppList.size() >= 1) {
			rAdtqspp = new Adtqspp();
			rAdtqsppFOUND = true;
			rAdtqsppEOF = false;
		} else {
			rAdtqsppFOUND = false;
			rAdtqsppEOF = true;
		}
		rAdtqsppPOS = -1;
		adtqspp.getTransaction().commit();
	} catch (Exception e) {
		adtqspp.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rAdtqsppFOUND = false;
	rAdtqsppEOF = true;
	while (rAdtqsppPOS < rAdtqsppList.size() || rAdtqsppFOUND) {
		rAdtqspp = rAdtqsppList.get(++rAdtqsppPOS);
		if (Objects.equals(String.valueOf(rAdtqspp.getAqprom()), String.valueOf(rSh200sfm.getHbprom()))) {
			rAdtqsppFOUND = true;
			rAdtqsppEOF = false;
		} else {
			rAdtqsppFOUND = false;
			rAdtqsppEOF = true;
		}

	}
	// IF STATEMENT
	if (rAdtqsppFOUND) {
		// EVAL
	// ELSE
	} else {
		//LEAVESR
		return;
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void UPDATEWARN () {
	// IF STATEMENT
	if (MSGSWITCH == false) {
		// EVAL
	// ELSE
	} else {
		// EVAL
		// EVAL
		//DOU
		do {
			// IF STATEMENT
			if (ldadsDS.lacct().compareTo("SCORR") == 0 || ldadsDS.lacct().compareTo("FUSER") == 0) {
			// ELSE
			} else {
			// ENDIF
			}
			// IF STATEMENT
			if (INKG == true) {
				// EVAL
				// ELSEIF STATEMENT
			} else if (INKC == true) {
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setSaoptn( String.valueOf(""));
				// EVAL
				rSh200sfm.setIn85( String.valueOf(rSh200sfm.getIn85()));
			// ENDIF
			}
		//ENDDO
		} while (INKG == true  || INKC == true);
		// EVAL
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void CALCCB () {
	// IF STATEMENT
	if (rSh200sfm.getSaoptn().compareTo("I") != 0) {
		// CHAIN SETLL
		try {
			proextn.getTransaction().begin();
			qProextn = proextn.createQuery(proky7KL("Proextn"), Proextn.class);
			rProextnList = qProextn.getResultList();
			if (rProextnList.size() >= 1) {
				rProextn = new Proextn();
				rProextnFOUND = true;
				rProextnEOF = false;
			} else {
				rProextnFOUND = false;
				rProextnEOF = true;
			}
			rProextnPOS = -1;
			proextn.getTransaction().commit();
		} catch (Exception e) {
			proextn.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rProextnFOUND = false;
		rProextnEOF = true;
		while (rProextnPOS < rProextnList.size() || rProextnFOUND) {
			rProextn = rProextnList.get(++rProextnPOS);
				if (Objects.equals(String.valueOf(rProextn.getPeetwn()), String.valueOf(YTERR)) && Objects.equals(String.valueOf(rProextn.getPeepro()), String.valueOf(rSh200sfm.getHbprom()))) {
				rProextnFOUND = true;
				rProextnEOF = false;
			} else {
				rProextnFOUND = false;
				rProextnEOF = true;
			}

		}
		// IF STATEMENT
		if (rProextnFOUND) {
			// IF STATEMENT
			if ((rSh200sfm.getCbbase() + rSh200sfm.getCbadd2()) < rProextn.getPeadmia()) {
				// EVAL
				rSh200sfm.setCbadam( Float.valueOf(String.valueOf(USAA_ADSC * -1)));
			// ENDIF
			}
		// ENDIF
		}
		// EVAL
		rSh200sfm.setCbb$ad( Float.valueOf(String.valueOf(rSh200sfm.getCbbase() + rSh200sfm.getCbadd2() + rSh200sfm.getCbadam() + rSh200sfm.getCbadd$())));
		// EVAL
		rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam())));
		// EVAL
		rSh200sfm.setCbmmfw( Float.valueOf(String.valueOf(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir() + rSh200sfm.getCbmwrf() + rSh200sfm.getCbanmm())));
	// ELSE
	} else {
		// IF STATEMENT
		if (rSh200sfm.getCbanam() > 0) {
			//MULT
			rSh200sfm.setCbanam((float) (rSh200sfm.getCbanam() * -1));
			//MULT
			rSh200sfm.setCbanmm((float) (rSh200sfm.getCbanmm() * -1));
		// ENDIF
		}
		// EVAL
		rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam())));
		// EVAL
		rSh200sfm.setCbmmfw( Float.valueOf(String.valueOf(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir() + rSh200sfm.getCbmwrf() + rSh200sfm.getCbanmm())));
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getCbnegp() < rSh200sfm.getCbb$ad() && rSh200sfm.getCbnegp() != 0) {
		// EVAL
		rSh200sfm.setCbadnp( Integer.valueOf(String.valueOf(((rSh200sfm.getCbb$ad() - rSh200sfm.getCbnegp())/rSh200sfm.getCbb$ad()) * 100)));
	// ELSE
	} else {
		// EVAL
		rSh200sfm.setCbadnp( Integer.valueOf(String.valueOf(0)));
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getCbngmp() < rSh200sfm.getCbmfwt() && rSh200sfm.getCbngmp() != 0) {
		// EVAL
		rSh200sfm.setCbannp( Integer.valueOf(String.valueOf(((rSh200sfm.getCbmfwt() - rSh200sfm.getCbngmp())/rSh200sfm.getCbmfwt()) * 100)));
	// ELSE
	} else {
		// EVAL
		rSh200sfm.setCbannp( Integer.valueOf(String.valueOf(0)));
	// ENDIF
	}
	// EVAL
	$ANSC = Float.valueOf(String.valueOf(rSh200sfm.getCbmmfw()));
	//ENDSR
	}
	
//BEGSR
	public static void SCANPAK () {
	// EVAL
	FND = Integer.valueOf(String.valueOf(0));
	// EVAL
	FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("ADD-ON")));
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("ASC")));
	// ENDIF
	}
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("2")));
	// ENDIF
	}
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("3")));
	// ENDIF
	}
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("MULT")));
	// ENDIF
	}
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("TAK")));
	// ENDIF
	}
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("MU")));
	// ENDIF
	}
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf(" M ")));
	// ENDIF
	}
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("T1")));
	// ENDIF
	}
	// IF STATEMENT
	if (FND == 0) {
		// EVAL
		FND = Integer.valueOf(String.valueOf(DESCCAP.indexOf("TK")));
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void CHECKST () {
	// EVAL
	// EVAL
	// IF STATEMENT
	if (ldadsDS.lcamp().compareTo("RESALE") == 0) {
		// EVAL
		rSh200sfm.setCbst( String.valueOf("R"));
		// EVAL
		TCBST = String.valueOf("R");
		// EVAL
		IN23 = Boolean.valueOf("1");
	// ENDIF
	}
	// CHAIN SETLL
	try {
		slstyp.getTransaction().begin();
		qSlstyp = slstyp.createQuery("select c from Slstyp c where c.SXTYPE = '"+rSh200sfm.getCbst()+"'", Slstyp.class);
		rSlstypList = qSlstyp.getResultList();
		if (rSlstypList.size() >= 1) {
			rSlstyp = new Slstyp();
			rSlstypFOUND = true;
			rSlstypEOF = false;
		} else {
			rSlstypFOUND = false;
			rSlstypEOF = true;
		}
		rSlstypPOS = -1;
		slstyp.getTransaction().commit();
	} catch (Exception e) {
		slstyp.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rSlstypFOUND = false;
	rSlstypEOF = true;
	while (rSlstypPOS < rSlstypList.size() || rSlstypFOUND) {
		rSlstyp = rSlstypList.get(++rSlstypPOS);
		if (Objects.equals(String.valueOf(rSlstyp.getSxtype()), String.valueOf(rSh200sfm.getCbst()))) {
			rSlstypFOUND = true;
			rSlstypEOF = false;
		} else {
			rSlstypFOUND = false;
			rSlstypEOF = true;
		}

	}
	// IF STATEMENT
	if (! rSlstypFOUND) {
		//ADD
		RRNZ = RRNZ + 1;
		// MOVE
		rSh200sfm.setSzerrm(String.valueOf(ERR.get(36)));
		// EVAL
		// EVAL
	// ELSE
	} else {
		// IF STATEMENT
		if (Boolean.valueOf(rSlstyp.getSxqspl()) == true) {
			// EVAL
			// EVAL
			rSh200sfm.setCbwarc( String.valueOf(rSlstyp.getSxqspd()));
		// ELSE
		} else {
			// IF STATEMENT
			if (rSh200sfm.getCbst().compareTo(TMPQSP) != 0) {
				// EVAL
				rSh200sfm.setCbwarc( String.valueOf(rSlstyp.getSxqspd()));
				// EVAL
				TMPQSP1 = String.valueOf(rSh200sfm.getCbwarc());
				// EVAL
				TMPQSP = String.valueOf(rSh200sfm.getCbst());
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (rSlstyp.getSxcamp().compareTo(" ") != 0  && rSlstyp.getSxcamp().compareTo(ldadsDS.lcamp()) != 0 && IN20 == Boolean.valueOf("0") && ldadsDS.lcamp().compareTo("RESALE") != 0 && ldadsDS.lcamp().compareTo("CANRSL") != 0) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(41)));
			// EVAL
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if (IN20 ==Boolean.valueOf("1") && ldadsDS.lcamp().compareTo("RESALE") !=0 && ldadsDS.lcamp().compareTo("CANRSL") == 0 && rSh200sfm.getCbst().compareTo("?") !=0 && rSh200sfm.getCbst().compareTo(TMPSLS) != 0 && IN44 == Boolean.valueOf("0")) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(40)));
			// EVAL
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	SLSTRR = String.valueOf(rSh200sfm.getCaterr());
	// CHAIN SETLL
	try {
		paksls.getTransaction().begin();
		qPaksls = paksls.createQuery(pkslsk1KL("Paksls"), Paksl.class);
		rPakslsList = qPaksls.getResultList();
		if (rPakslsList.size() >= 1) {
			rPaksls = new Paksl();
			rPakslsFOUND = true;
			rPakslsEOF = false;
		} else {
			rPakslsFOUND = false;
			rPakslsEOF = true;
		}
		rPakslsPOS = -1;
		paksls.getTransaction().commit();
	} catch (Exception e) {
		paksls.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rPakslsFOUND = false;
	rPakslsEOF = true;
	while (rPakslsPOS < rPakslsList.size() || rPakslsFOUND) {
		rPaksls = rPakslsList.get(++rPakslsPOS);
		if (Objects.equals(String.valueOf(rPaksls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rPaksls.getPpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
			rPakslsFOUND = true;
			rPakslsEOF = false;
		} else {
			rPakslsFOUND = false;
			rPakslsEOF = true;
		}

	}
	// IF STATEMENT
	if (rPakslsFOUND) {
		// CHAIN SETLL
		try {
			paksls.getTransaction().begin();
			qPaksls = paksls.createQuery(pkslsk2KL("Paksls"), Paksl.class);
			rPakslsList = qPaksls.getResultList();
			if (rPakslsList.size() >= 1) {
				rPaksls = new Paksl();
				rPakslsFOUND = true;
				rPakslsEOF = false;
			} else {
				rPakslsFOUND = false;
				rPakslsEOF = true;
			}
			rPakslsPOS = -1;
			paksls.getTransaction().commit();
		} catch (Exception e) {
			paksls.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPakslsFOUND = false;
		rPakslsEOF = true;
		while (rPakslsPOS < rPakslsList.size() || rPakslsFOUND) {
			rPaksls = rPakslsList.get(++rPakslsPOS);
				if (Objects.equals(String.valueOf(rPaksls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rPaksls.getPpakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPaksls.getPslstp()), String.valueOf(rSh200sfm.getCbst()))) {
				rPakslsFOUND = true;
				rPakslsEOF = false;
			} else {
				rPakslsFOUND = false;
				rPakslsEOF = true;
			}

		}
		// IF STATEMENT
		if (! rPakslsFOUND) {
			// IF STATEMENT
			if ($FLPRV.compareTo("Y") == 0) {
				// EVAL
			// ELSE
			} else {
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(46)));
				// EVAL
				// EVAL
			// ENDIF
			}
		// ENDIF
		}
	// ELSE
	} else {
		// EVAL
		SLSTRR = String.valueOf("99999999");
		// CHAIN SETLL
		try {
			paksls.getTransaction().begin();
			qPaksls = paksls.createQuery(pkslsk1KL("Paksls"), Paksl.class);
			rPakslsList = qPaksls.getResultList();
			if (rPakslsList.size() >= 1) {
				rPaksls = new Paksl();
				rPakslsFOUND = true;
				rPakslsEOF = false;
			} else {
				rPakslsFOUND = false;
				rPakslsEOF = true;
			}
			rPakslsPOS = -1;
			paksls.getTransaction().commit();
		} catch (Exception e) {
			paksls.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPakslsFOUND = false;
		rPakslsEOF = true;
		while (rPakslsPOS < rPakslsList.size() || rPakslsFOUND) {
			rPaksls = rPakslsList.get(++rPakslsPOS);
				if (Objects.equals(String.valueOf(rPaksls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rPaksls.getPpakg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPakslsFOUND = true;
				rPakslsEOF = false;
			} else {
				rPakslsFOUND = false;
				rPakslsEOF = true;
			}

		}
		// IF STATEMENT
		if (rPakslsFOUND) {
			// CHAIN SETLL
			try {
				paksls.getTransaction().begin();
				qPaksls = paksls.createQuery(pkslsk2KL("Paksls"), Paksl.class);
				rPakslsList = qPaksls.getResultList();
				if (rPakslsList.size() >= 1) {
					rPaksls = new Paksl();
					rPakslsFOUND = true;
					rPakslsEOF = false;
				} else {
					rPakslsFOUND = false;
					rPakslsEOF = true;
				}
				rPakslsPOS = -1;
				paksls.getTransaction().commit();
			} catch (Exception e) {
				paksls.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPakslsFOUND = false;
			rPakslsEOF = true;
			while (rPakslsPOS < rPakslsList.size() || rPakslsFOUND) {
				rPaksls = rPakslsList.get(++rPakslsPOS);
						if (Objects.equals(String.valueOf(rPaksls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rPaksls.getPpakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPaksls.getPslstp()), String.valueOf(rSh200sfm.getCbst()))) {
					rPakslsFOUND = true;
					rPakslsEOF = false;
				} else {
					rPakslsFOUND = false;
					rPakslsEOF = true;
				}

			}
			// IF STATEMENT
			if (! rPakslsFOUND) {
				// IF STATEMENT
				if ($FLPRV.compareTo("Y") == 0) {
					// EVAL
				// ELSE
				} else {
					//ADD
					RRNZ = RRNZ + 1;
					// MOVE
					rSh200sfm.setSzerrm(String.valueOf(ERR.get(46)));
					// EVAL
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (IN44 == Boolean.valueOf("0") &&  rSh200sfm.getCbst().compareTo(TMPSLS2) != 0) {
		// EVAL
		TMPSLS2 = String.valueOf(rSh200sfm.getCbst());
		// IF STATEMENT
		if (rSh200sfm.getHbprom().compareTo("") == 0) {
			// MOVE
			rSh200sfm.setHbprom(String.valueOf(ldadsDS.lpromo()));
		// ENDIF
		}
		// EVAL
		SLSTRR = String.valueOf(rSh200sfm.getCaterr());
		// CHAIN SETLL
		try {
			prosls.getTransaction().begin();
			qProsls = prosls.createQuery(pslsk2KL("Prosls"), Prosl.class);
			rProslsList = qProsls.getResultList();
			if (rProslsList.size() >= 1) {
				rProsls = new Prosl();
				rProslsFOUND = true;
				rProslsEOF = false;
			} else {
				rProslsFOUND = false;
				rProslsEOF = true;
			}
			rProslsPOS = -1;
			prosls.getTransaction().commit();
		} catch (Exception e) {
			prosls.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rProslsFOUND = false;
		rProslsEOF = true;
		while (rProslsPOS < rProslsList.size() || rProslsFOUND) {
			rProsls = rProslsList.get(++rProslsPOS);
				if (Objects.equals(String.valueOf(rProsls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rProsls.getPpromo()), String.valueOf($$PROM))) {
				rProslsFOUND = true;
				rProslsEOF = false;
			} else {
				rProslsFOUND = false;
				rProslsEOF = true;
			}

		}
		// IF STATEMENT
		if (rProslsFOUND) {
			// CHAIN SETLL
			try {
				prosls.getTransaction().begin();
				qProsls = prosls.createQuery(pslsk3KL("Prosls"), Prosl.class);
				rProslsList = qProsls.getResultList();
				if (rProslsList.size() >= 1) {
					rProsls = new Prosl();
					rProslsFOUND = true;
					rProslsEOF = false;
				} else {
					rProslsFOUND = false;
					rProslsEOF = true;
				}
				rProslsPOS = -1;
				prosls.getTransaction().commit();
			} catch (Exception e) {
				prosls.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProslsFOUND = false;
			rProslsEOF = true;
			while (rProslsPOS < rProslsList.size() || rProslsFOUND) {
				rProsls = rProslsList.get(++rProslsPOS);
						if (Objects.equals(String.valueOf(rProsls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rProsls.getPpromo()), String.valueOf($$PROM)) && Objects.equals(String.valueOf(rProsls.getPslstp()), String.valueOf(rSh200sfm.getCbst()))) {
					rProslsFOUND = true;
					rProslsEOF = false;
				} else {
					rProslsFOUND = false;
					rProslsEOF = true;
				}

			}
			// IF STATEMENT
			if (! rProslsFOUND) {
				//ADD
				RRNZ = RRNZ + 1;
				// MOVE
				rSh200sfm.setSzerrm(String.valueOf(ERR.get(47)));
				// EVAL
				// EVAL
			// ENDIF
			}
		// ELSE
		} else {
			// EVAL
			SLSTRR = String.valueOf("99999999");
			// CHAIN SETLL
			try {
				prosls.getTransaction().begin();
				qProsls = prosls.createQuery(pslsk2KL("Prosls"), Prosl.class);
				rProslsList = qProsls.getResultList();
				if (rProslsList.size() >= 1) {
					rProsls = new Prosl();
					rProslsFOUND = true;
					rProslsEOF = false;
				} else {
					rProslsFOUND = false;
					rProslsEOF = true;
				}
				rProslsPOS = -1;
				prosls.getTransaction().commit();
			} catch (Exception e) {
				prosls.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProslsFOUND = false;
			rProslsEOF = true;
			while (rProslsPOS < rProslsList.size() || rProslsFOUND) {
				rProsls = rProslsList.get(++rProslsPOS);
						if (Objects.equals(String.valueOf(rProsls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rProsls.getPpromo()), String.valueOf($$PROM))) {
					rProslsFOUND = true;
					rProslsEOF = false;
				} else {
					rProslsFOUND = false;
					rProslsEOF = true;
				}

			}
			// IF STATEMENT
			if (rProslsFOUND) {
				// CHAIN SETLL
				try {
					prosls.getTransaction().begin();
					qProsls = prosls.createQuery(pslsk3KL("Prosls"), Prosl.class);
					rProslsList = qProsls.getResultList();
					if (rProslsList.size() >= 1) {
						rProsls = new Prosl();
						rProslsFOUND = true;
						rProslsEOF = false;
					} else {
						rProslsFOUND = false;
						rProslsEOF = true;
					}
					rProslsPOS = -1;
					prosls.getTransaction().commit();
				} catch (Exception e) {
					prosls.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rProslsFOUND = false;
				rProslsEOF = true;
				while (rProslsPOS < rProslsList.size() || rProslsFOUND) {
					rProsls = rProslsList.get(++rProslsPOS);
								if (Objects.equals(String.valueOf(rProsls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rProsls.getPpromo()), String.valueOf($$PROM)) && Objects.equals(String.valueOf(rProsls.getPslstp()), String.valueOf(rSh200sfm.getCbst()))) {
						rProslsFOUND = true;
						rProslsEOF = false;
					} else {
						rProslsFOUND = false;
						rProslsEOF = true;
					}

				}
				// IF STATEMENT
				if (! rProslsFOUND) {
					//ADD
					RRNZ = RRNZ + 1;
					// MOVE
					rSh200sfm.setSzerrm(String.valueOf(ERR.get(47)));
					// EVAL
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (IN44 == Boolean.valueOf("0") && $SLSTPE == false) {
		// EVAL
		//EXSR
		APRMIT();
		// EVAL
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void GETATTR () {
	// IF STATEMENT
	if (rSh200sfm.getSbitem().compareTo("") != 0) {
		// CHAIN SETLL
		try {
			itmclr.getTransaction().begin();
			qItmclr = itmclr.createQuery("select c from Itmclr c where c.IXITEM = '"+rSh200sfm.getSbitem()+"'", Itmclr.class);
			rItmclrList = qItmclr.getResultList();
			if (rItmclrList.size() >= 1) {
				rItmclr = new Itmclr();
				rItmclrFOUND = true;
				rItmclrEOF = false;
			} else {
				rItmclrFOUND = false;
				rItmclrEOF = true;
			}
			rItmclrPOS = -1;
			itmclr.getTransaction().commit();
		} catch (Exception e) {
			itmclr.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rItmclrFOUND = false;
		rItmclrEOF = true;
		while (rItmclrPOS < rItmclrList.size() || rItmclrFOUND) {
			rItmclr = rItmclrList.get(++rItmclrPOS);
				if (Objects.equals(String.valueOf(rItmclr.getIxitem()), String.valueOf(rSh200sfm.getSbitem()))) {
				rItmclrFOUND = true;
				rItmclrEOF = false;
			} else {
				rItmclrFOUND = false;
				rItmclrEOF = true;
			}

		}
		// IF STATEMENT
		if (rItmclrFOUND) {
			// EVAL
			DA = String.valueOf(rItmclr.getIxcolr());
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	$ITMDESC = String.valueOf(rSh200sfm.getSbitem());
	// CHAIN SETLL
	try {
		adtitmo.getTransaction().begin();
		qAdtitmo = adtitmo.createQuery($kitmoKL("Adtitmo"), Adtitmo.class);
		rAdtitmoList = qAdtitmo.getResultList();
		if (rAdtitmoList.size() >= 1) {
			rAdtitmo = new Adtitmo();
			rAdtitmoFOUND = true;
			rAdtitmoEOF = false;
		} else {
			rAdtitmoFOUND = false;
			rAdtitmoEOF = true;
		}
		rAdtitmoPOS = -1;
		adtitmo.getTransaction().commit();
	} catch (Exception e) {
		adtitmo.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rAdtitmoFOUND = false;
	rAdtitmoEOF = true;
	while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
		rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
		if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
			rAdtitmoFOUND = true;
			rAdtitmoEOF = false;
		} else {
			rAdtitmoFOUND = false;
			rAdtitmoEOF = true;
		}

	}
	// IF STATEMENT
	if (rAdtitmoFOUND) {
		// EVAL
	// ELSE
	} else {
		// CHAIN SETLL
		try {
			adtitmo.getTransaction().begin();
			qAdtitmo = adtitmo.createQuery($kitmo99KL("Adtitmo"), Adtitmo.class);
			rAdtitmoList = qAdtitmo.getResultList();
			if (rAdtitmoList.size() >= 1) {
				rAdtitmo = new Adtitmo();
				rAdtitmoFOUND = true;
				rAdtitmoEOF = false;
			} else {
				rAdtitmoFOUND = false;
				rAdtitmoEOF = true;
			}
			rAdtitmoPOS = -1;
			adtitmo.getTransaction().commit();
		} catch (Exception e) {
			adtitmo.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAdtitmoFOUND = false;
		rAdtitmoEOF = true;
		while (rAdtitmoPOS < rAdtitmoList.size() || rAdtitmoFOUND) {
			rAdtitmo = rAdtitmoList.get(++rAdtitmoPOS);
				if (Objects.equals(String.valueOf(rAdtitmo.getAiterr()), String.valueOf(ZTERR)) && Objects.equals(String.valueOf(rAdtitmo.getAiitem()), String.valueOf($ITMDESC))) {
				rAdtitmoFOUND = true;
				rAdtitmoEOF = false;
			} else {
				rAdtitmoFOUND = false;
				rAdtitmoEOF = true;
			}

		}
		// IF STATEMENT
		if (rAdtitmoFOUND) {
			// EVAL
		// ELSE
		} else {
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (DA.compareTo("") != 0) {
		// ELSEIF STATEMENT
	} else if (IN71) {
		// EVAL
		DA = String.valueOf("RNN");
	// OTHER
	} else {
		// EVAL
		DA = String.valueOf("TNN");
	// ENDSL
	}
	// IF STATEMENT
	if (rSh200sfm.getSbitem().indexOf("SA026")>0 && rSr0rsq05.getCbyac1().compareTo("L6") == 0) {
		// IF STATEMENT
		if (Boolean.valueOf(String.valueOf($CNT)) == Boolean.valueOf(String.valueOf(0))) {
			//Z-ADD
			$CNT = (int) Integer.valueOf(String.valueOf(1));
		// ENDIF
		}
		// EVAL
		DA = String.valueOf("WNN");
	// ENDIF
	}
	// IF STATEMENT
	if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
		// CHAIN SETLL
		try {
			itmlin.getTransaction().begin();
			qItmlin = itmlin.createQuery("select c from Itmlin c where c.ILITEM = '"+rSh200sfm.getSbitem()+"'", Itmlin.class);
			rItmlinList = qItmlin.getResultList();
			if (rItmlinList.size() >= 1) {
				rItmlin = new Itmlin();
				rItmlinFOUND = true;
				rItmlinEOF = false;
			} else {
				rItmlinFOUND = false;
				rItmlinEOF = true;
			}
			rItmlinPOS = -1;
			itmlin.getTransaction().commit();
		} catch (Exception e) {
			itmlin.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rItmlinFOUND = false;
		rItmlinEOF = true;
		while (rItmlinPOS < rItmlinList.size() || rItmlinFOUND) {
			rItmlin = rItmlinList.get(++rItmlinPOS);
				if (Objects.equals(String.valueOf(rItmlin.getIlitem()), String.valueOf(rSh200sfm.getSbitem()))) {
				rItmlinFOUND = true;
				rItmlinEOF = false;
			} else {
				rItmlinFOUND = false;
				rItmlinEOF = true;
			}

		}
		// IF STATEMENT
		if (rItmlinFOUND && (rItmlin.getIlline() == 14 || rItmlin.getIlline() == 15 || rItmlin.getIlline() == 19 || rItmlin.getIlline()==7)) {
			// EVAL
			DA = String.valueOf("R"+DA.substring(1, 3));
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	rSh200sfm.setXsbdsc1( String.valueOf(DAX));
	//ENDSR
	}
	
//BEGSR
	public static void CATEXCEPTION () {
	// EVAL
	// SETLL
	try {
		adt520x.getTransaction().begin();
		qAdt520x = adt520x.createQuery("select c from Adt520x c where c.CXPKID = '"+rAdt520.getCopkid()+"'", Adt520x.class);
		rAdt520xList = qAdt520x.getResultList();
		if (rAdt520xList.size() >= 1) {
			rAdt520x = new Adt520x();
			rAdt520xFOUND = true;
			rAdt520xEOF = false;
		} else {
			rAdt520xFOUND = false;
			rAdt520xEOF = true;
		}
		rAdt520xPOS = -1;
		adt520x.getTransaction().commit();
	} catch (Exception e) {
		adt520x.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READE
	rAdt520xFOUND = false;
	rAdt520xEOF = true;
	while (rAdt520xPOS < rAdt520xList.size() || rAdt520xFOUND) {
		rAdt520x = rAdt520xList.get(++rAdt520xPOS);
				if (Objects.equals(String.valueOf(rAdt520x.getCxpkid()), String.valueOf(rAdt520.getCopkid()))) {
			rAdt520xFOUND = true;
			rAdt520xEOF = false;
		} else {
			rAdt520xFOUND = false;
			rAdt520xEOF = true;
		}

	}
	//DOW
	while (! rAdt520xEOF && ! CATEXP) {
		// IF STATEMENT
		if (ldadsDS.lpromo().indexOf(rAdt520x.getCxsrcs().trim()) > 0 || ldadsDS.lldsrc().indexOf(rAdt520x.getCxsrcs().trim()) > 0 || ldadsDS.lscod().indexOf(rAdt520x.getCxsrcs().trim()) > 0 || ldadsDS.lqsrc().indexOf(rAdt520x.getCxsrcs().trim()) > 0) {
			// EVAL
			rAdt520.setCoovpp( Float.valueOf(String.valueOf(rAdt520x.getCxovpp())));
			// EVAL
			rAdt520.setCopcat( String.valueOf(rAdt520x.getCxpcat()));
			// EVAL
		// ENDIF
		}
		// READE
		rAdt520xFOUND = false;
		rAdt520xEOF = true;
		while (rAdt520xPOS < rAdt520xList.size() || rAdt520xFOUND) {
			rAdt520x = rAdt520xList.get(++rAdt520xPOS);
					if (Objects.equals(String.valueOf(rAdt520x.getCxpkid()), String.valueOf(rAdt520.getCopkid()))) {
				rAdt520xFOUND = true;
				rAdt520xEOF = false;
			} else {
				rAdt520xFOUND = false;
				rAdt520xEOF = true;
			}

		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void OPENCAT () {
	// IF STATEMENT
	if (! CATSCR) {
	// ENDIF
	}
	// EVAL
	// EVAL
	//ENDSR
	}
	
//BEGSR
	public static void INZSR () {
	// CHAIN SETLL
	try {
		adtpo2.getTransaction().begin();
		qAdtpo2 = adtpo2.createQuery("select c from Adtpo2 c where c.POTOWN = '"+ldadsDS.laterr()+"'", Adtpo2.class);
		rAdtpo2List = qAdtpo2.getResultList();
		if (rAdtpo2List.size() >= 1) {
			rAdtpo2 = new Adtpo2();
			rAdtpo2FOUND = true;
			rAdtpo2EOF = false;
		} else {
			rAdtpo2FOUND = false;
			rAdtpo2EOF = true;
		}
		rAdtpo2POS = -1;
		adtpo2.getTransaction().commit();
	} catch (Exception e) {
		adtpo2.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rAdtpo2FOUND = false;
	rAdtpo2EOF = true;
	while (rAdtpo2POS < rAdtpo2List.size() || rAdtpo2FOUND) {
		rAdtpo2 = rAdtpo2List.get(++rAdtpo2POS);
		if (Objects.equals(String.valueOf(rAdtpo2.getPotown()), String.valueOf(ldadsDS.laterr()))) {
			rAdtpo2FOUND = true;
			rAdtpo2EOF = false;
		} else {
			rAdtpo2FOUND = false;
			rAdtpo2EOF = true;
		}

	}
	// IF STATEMENT
	if (! rAdtpo2FOUND) {
		// CHAIN SETLL
		try {
			adtpo2.getTransaction().begin();
			qAdtpo2 = adtpo2.createQuery("select c from Adtpo2 c where c.POTOWN = '"+T99999999+"'", Adtpo2.class);
			rAdtpo2List = qAdtpo2.getResultList();
			if (rAdtpo2List.size() >= 1) {
				rAdtpo2 = new Adtpo2();
				rAdtpo2FOUND = true;
				rAdtpo2EOF = false;
			} else {
				rAdtpo2FOUND = false;
				rAdtpo2EOF = true;
			}
			rAdtpo2POS = -1;
			adtpo2.getTransaction().commit();
		} catch (Exception e) {
			adtpo2.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAdtpo2FOUND = false;
		rAdtpo2EOF = true;
		while (rAdtpo2POS < rAdtpo2List.size() || rAdtpo2FOUND) {
			rAdtpo2 = rAdtpo2List.get(++rAdtpo2POS);
				if (Objects.equals(String.valueOf(rAdtpo2.getPotown()), String.valueOf(T99999999))) {
				rAdtpo2FOUND = true;
				rAdtpo2EOF = false;
			} else {
				rAdtpo2FOUND = false;
				rAdtpo2EOF = true;
			}

		}
	// ENDIF
	}
	// IF STATEMENT
	if (rAdtpo2FOUND && ldadsDS.lcamp().compareTo("COMRSL") != 0 && ldadsDS.lcamp().compareTo("COMPAN") != 0 && ldadsDS.lcamp().compareTo("MARSH") != 0 && ldadsDS.lcamp().compareTo("DICON") != 0) {
		// EVAL
		// EVAL
	// ELSE
	} else {
		// EVAL
		// EVAL
	// ENDIF
	}
	// MOVE
	S0TERR = String.valueOf(ldadsDS.laterr());
	// MOVE
	SRTERR = String.valueOf(ldadsDS.lterr());
	// MOVE
	S0ACCT = String.valueOf(ldadsDS.lmms());
	// MOVE
	S0ENT = String.valueOf(ldadsDS.lentn());
	// MOVE
	S0CAMP = String.valueOf(ldadsDS.lcamp());
	// MOVE
	S0PROM = String.valueOf(ldadsDS.lpromo());
	// MOVE
	S9TERR = String.valueOf(S9TERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
	// MOVE
	ZZTERR = String.valueOf(ZZTERR.replaceAll("[a-zA-Z0-9],\\s+", "9"));
	//Z-ADD
	binaryDS.line((int) Integer.valueOf(String.valueOf(0)));
	//Z-ADD
	binaryDS.pos((int) Integer.valueOf(String.valueOf(0)));
	//Z-ADD
	ACBNEGP = Float.valueOf(String.valueOf(rSh200sfm.getCbnegp()));
	//Z-ADD
	ACBB$AD = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
	// EVAL
	ACBCAT = String.valueOf(rSh200sfm.getCbcat());
	// MOVE
	rSh200sfm.setTitle(String.valueOf(TTL.get(1)));
	// IF STATEMENT
	if (ldadsDS.luser().compareTo("") != 0) {
		// MOVE
		USR08A = String.valueOf(ldadsDS.luser());
	// ELSE
	} else {
		// MOVE
		USR08A = String.valueOf(pgmnamDS.usernm());
	// ENDIF
	}
	// MOVEA
	ANC.clear();
	// MOVEA
	AMS.clear();
	// MOVEA
	AND.clear();
	//Z-ADD
	ANF.clear();
	// MOVE
	ANFL.set(0, "");
	ANFL.set(1, "");
	ANFL.set(2, "");
	ANFL.set(3, "");
	ANFL.set(4, "");
	ANFL.set(5, "");
	ANFL.set(6, "");
	ANFL.set(7, "");
	ANFL.set(8, "");
	ANFL.set(9, "");
	ANFL.set(10, "");
	ANFL.set(11, "");
	ANFL.set(12, "");
	ANFL.set(13, "");
	ANFL.set(14, "");
	ANFL.set(15, "");
	ANFL.set(16, "");
	ANFL.set(17, "");
	ANFL.set(18, "");
	ANFL.set(19, "");
	ANFL.set(20, "");
	ANFL.set(21, "");
	ANFL.set(22, "");
	ANFL.set(23, "");
	ANFL.set(24, "");
	ANFL.set(25, "");
	ANFL.set(26, "");
	ANFL.set(27, "");
	ANFL.set(28, "");
	ANFL.set(29, "");
	ANFL.set(30, "");
	ANFL.set(31, "");
	ANFL.set(32, "");
	ANFL.set(33, "");
	ANFL.set(34, "");
	ANFL.set(35, "");
	ANFL.set(36, "");
	ANFL.set(37, "");
	ANFL.set(38, "");
	ANFL.set(39, "");
	ANFL.set(40, "");
	ANFL.set(41, "");
	ANFL.set(42, "");
	ANFL.set(43, "");
	ANFL.set(44, "");
	ANFL.set(45, "");
	ANFL.set(46, "");
	ANFL.set(47, "");
	ANFL.set(48, "");
	ANFL.set(49, "");
	ANFL.set(50, "");
	ANFL.set(51, "");
	ANFL.set(52, "");
	ANFL.set(53, "");
	ANFL.set(54, "");
	ANFL.set(55, "");
	ANFL.set(56, "");
	ANFL.set(57, "");
	ANFL.set(58, "");
	ANFL.set(59, "");
	ANFL.set(60, "");
	ANFL.set(61, "");
	ANFL.set(62, "");
	ANFL.set(63, "");
	ANFL.set(64, "");
	ANFL.set(65, "");
	ANFL.set(66, "");
	ANFL.set(67, "");
	ANFL.set(68, "");
	ANFL.set(69, "");
	ANFL.set(70, "");
	ANFL.set(71, "");
	ANFL.set(72, "");
	ANFL.set(73, "");
	ANFL.set(74, "");
	ANFL.set(75, "");
	ANFL.set(76, "");
	ANFL.set(77, "");
	ANFL.set(78, "");
	ANFL.set(79, "");
	ANFL.set(80, "");
	ANFL.set(81, "");
	ANFL.set(82, "");
	ANFL.set(83, "");
	ANFL.set(84, "");
	ANFL.set(85, "");
	ANFL.set(86, "");
	ANFL.set(87, "");
	ANFL.set(88, "");
	ANFL.set(89, "");
	ANFL.set(90, "");
	ANFL.set(91, "");
	ANFL.set(92, "");
	ANFL.set(93, "");
	ANFL.set(94, "");
	ANFL.set(95, "");
	ANFL.set(96, "");
	ANFL.set(97, "");
	ANFL.set(98, "");
	ANFL.set(99, "");
	ANFL.set(100, "");
	ANFL.set(101, "");
	ANFL.set(102, "");
	ANFL.set(103, "");
	ANFL.set(104, "");
	ANFL.set(105, "");
	ANFL.set(106, "");
	ANFL.set(107, "");
	ANFL.set(108, "");
	ANFL.set(109, "");
	ANFL.set(110, "");
	ANFL.set(111, "");
	ANFL.set(112, "");
	ANFL.set(113, "");
	ANFL.set(114, "");
	ANFL.set(115, "");
	ANFL.set(116, "");
	ANFL.set(117, "");
	ANFL.set(118, "");
	ANFL.set(119, "");
	ANFL.set(120, "");
	ANFL.set(121, "");
	ANFL.set(122, "");
	ANFL.set(123, "");
	ANFL.set(124, "");
	ANFL.set(125, "");
	ANFL.set(126, "");
	ANFL.set(127, "");
	ANFL.set(128, "");
	ANFL.set(129, "");
	ANFL.set(130, "");
	ANFL.set(131, "");
	ANFL.set(132, "");
	ANFL.set(133, "");
	ANFL.set(134, "");
	ANFL.set(135, "");
	ANFL.set(136, "");
	ANFL.set(137, "");
	ANFL.set(138, "");
	ANFL.set(139, "");
	ANFL.set(140, "");
	ANFL.set(141, "");
	ANFL.set(142, "");
	ANFL.set(143, "");
	ANFL.set(144, "");
	ANFL.set(145, "");
	ANFL.set(146, "");
	ANFL.set(147, "");
	ANFL.set(148, "");
	ANFL.set(149, "");
	ANFL.set(150, "");
	ANFL.set(151, "");
	ANFL.set(152, "");
	ANFL.set(153, "");
	ANFL.set(154, "");
	ANFL.set(155, "");
	ANFL.set(156, "");
	ANFL.set(157, "");
	ANFL.set(158, "");
	ANFL.set(159, "");
	ANFL.set(160, "");
	ANFL.set(161, "");
	ANFL.set(162, "");
	ANFL.set(163, "");
	ANFL.set(164, "");
	ANFL.set(165, "");
	ANFL.set(166, "");
	ANFL.set(167, "");
	ANFL.set(168, "");
	ANFL.set(169, "");
	ANFL.set(170, "");
	ANFL.set(171, "");
	ANFL.set(172, "");
	ANFL.set(173, "");
	ANFL.set(174, "");
	ANFL.set(175, "");
	ANFL.set(176, "");
	ANFL.set(177, "");
	ANFL.set(178, "");
	ANFL.set(179, "");
	ANFL.set(180, "");
	ANFL.set(181, "");
	ANFL.set(182, "");
	ANFL.set(183, "");
	ANFL.set(184, "");
	ANFL.set(185, "");
	ANFL.set(186, "");
	ANFL.set(187, "");
	ANFL.set(188, "");
	ANFL.set(189, "");
	ANFL.set(190, "");
	ANFL.set(191, "");
	ANFL.set(192, "");
	ANFL.set(193, "");
	ANFL.set(194, "");
	ANFL.set(195, "");
	ANFL.set(196, "");
	ANFL.set(197, "");
	ANFL.set(198, "");
	ANFL.set(199, "");
	ANFL.set(200, "");
	ANFL.set(201, "");
	ANFL.set(202, "");
	ANFL.set(203, "");
	ANFL.set(204, "");
	ANFL.set(205, "");
	ANFL.set(206, "");
	ANFL.set(207, "");
	ANFL.set(208, "");
	ANFL.set(209, "");
	ANFL.set(210, "");
	ANFL.set(211, "");
	ANFL.set(212, "");
	ANFL.set(213, "");
	ANFL.set(214, "");
	ANFL.set(215, "");
	ANFL.set(216, "");
	ANFL.set(217, "");
	ANFL.set(218, "");
	ANFL.set(219, "");
	ANFL.set(220, "");
	ANFL.set(221, "");
	ANFL.set(222, "");
	ANFL.set(223, "");
	ANFL.set(224, "");
	ANFL.set(225, "");
	ANFL.set(226, "");
	ANFL.set(227, "");
	ANFL.set(228, "");
	ANFL.set(229, "");
	ANFL.set(230, "");
	ANFL.set(231, "");
	ANFL.set(232, "");
	ANFL.set(233, "");
	ANFL.set(234, "");
	ANFL.set(235, "");
	ANFL.set(236, "");
	ANFL.set(237, "");
	ANFL.set(238, "");
	ANFL.set(239, "");
	ANFL.set(240, "");
	ANFL.set(241, "");
	ANFL.set(242, "");
	ANFL.set(243, "");
	ANFL.set(244, "");
	ANFL.set(245, "");
	ANFL.set(246, "");
	ANFL.set(247, "");
	ANFL.set(248, "");
	ANFL.set(249, "");
	ANFL.set(250, "");
	ANFL.set(251, "");
	ANFL.set(252, "");
	ANFL.set(253, "");
	ANFL.set(254, "");
	ANFL.set(255, "");
	ANFL.set(256, "");
	ANFL.set(257, "");
	ANFL.set(258, "");
	ANFL.set(259, "");
	ANFL.set(260, "");
	ANFL.set(261, "");
	ANFL.set(262, "");
	ANFL.set(263, "");
	ANFL.set(264, "");
	ANFL.set(265, "");
	ANFL.set(266, "");
	ANFL.set(267, "");
	ANFL.set(268, "");
	ANFL.set(269, "");
	ANFL.set(270, "");
	ANFL.set(271, "");
	ANFL.set(272, "");
	ANFL.set(273, "");
	ANFL.set(274, "");
	ANFL.set(275, "");
	ANFL.set(276, "");
	ANFL.set(277, "");
	ANFL.set(278, "");
	ANFL.set(279, "");
	ANFL.set(280, "");
	ANFL.set(281, "");
	ANFL.set(282, "");
	ANFL.set(283, "");
	ANFL.set(284, "");
	ANFL.set(285, "");
	ANFL.set(286, "");
	ANFL.set(287, "");
	ANFL.set(288, "");
	ANFL.set(289, "");
	ANFL.set(290, "");
	ANFL.set(291, "");
	ANFL.set(292, "");
	ANFL.set(293, "");
	ANFL.set(294, "");
	ANFL.set(295, "");
	ANFL.set(296, "");
	ANFL.set(297, "");
	ANFL.set(298, "");
	ANFL.set(299, "");
	ANFL.set(300, "");
	ANFL.set(301, "");
	ANFL.set(302, "");
	ANFL.set(303, "");
	ANFL.set(304, "");
	ANFL.set(305, "");
	ANFL.set(306, "");
	ANFL.set(307, "");
	ANFL.set(308, "");
	ANFL.set(309, "");
	ANFL.set(310, "");
	ANFL.set(311, "");
	ANFL.set(312, "");
	ANFL.set(313, "");
	ANFL.set(314, "");
	ANFL.set(315, "");
	ANFL.set(316, "");
	ANFL.set(317, "");
	ANFL.set(318, "");
	ANFL.set(319, "");
	ANFL.set(320, "");
	ANFL.set(321, "");
	ANFL.set(322, "");
	ANFL.set(323, "");
	ANFL.set(324, "");
	ANFL.set(325, "");
	ANFL.set(326, "");
	ANFL.set(327, "");
	ANFL.set(328, "");
	ANFL.set(329, "");
	ANFL.set(330, "");
	ANFL.set(331, "");
	ANFL.set(332, "");
	ANFL.set(333, "");
	ANFL.set(334, "");
	ANFL.set(335, "");
	ANFL.set(336, "");
	ANFL.set(337, "");
	ANFL.set(338, "");
	ANFL.set(339, "");
	ANFL.set(340, "");
	ANFL.set(341, "");
	ANFL.set(342, "");
	ANFL.set(343, "");
	ANFL.set(344, "");
	ANFL.set(345, "");
	ANFL.set(346, "");
	ANFL.set(347, "");
	ANFL.set(348, "");
	ANFL.set(349, "");
	ANFL.set(350, "");
	ANFL.set(351, "");
	ANFL.set(352, "");
	ANFL.set(353, "");
	ANFL.set(354, "");
	ANFL.set(355, "");
	ANFL.set(356, "");
	ANFL.set(357, "");
	ANFL.set(358, "");
	ANFL.set(359, "");
	ANFL.set(360, "");
	ANFL.set(361, "");
	ANFL.set(362, "");
	ANFL.set(363, "");
	ANFL.set(364, "");
	ANFL.set(365, "");
	ANFL.set(366, "");
	ANFL.set(367, "");
	ANFL.set(368, "");
	ANFL.set(369, "");
	ANFL.set(370, "");
	ANFL.set(371, "");
	ANFL.set(372, "");
	ANFL.set(373, "");
	ANFL.set(374, "");
	ANFL.set(375, "");
	ANFL.set(376, "");
	ANFL.set(377, "");
	ANFL.set(378, "");
	ANFL.set(379, "");
	ANFL.set(380, "");
	ANFL.set(381, "");
	ANFL.set(382, "");
	ANFL.set(383, "");
	ANFL.set(384, "");
	ANFL.set(385, "");
	ANFL.set(386, "");
	ANFL.set(387, "");
	ANFL.set(388, "");
	ANFL.set(389, "");
	ANFL.set(390, "");
	ANFL.set(391, "");
	ANFL.set(392, "");
	ANFL.set(393, "");
	ANFL.set(394, "");
	ANFL.set(395, "");
	ANFL.set(396, "");
	ANFL.set(397, "");
	ANFL.set(398, "");
	ANFL.set(399, "");
	ANFL.set(400, "");
	ANFL.set(401, "");
	ANFL.set(402, "");
	ANFL.set(403, "");
	ANFL.set(404, "");
	ANFL.set(405, "");
	ANFL.set(406, "");
	ANFL.set(407, "");
	ANFL.set(408, "");
	ANFL.set(409, "");
	ANFL.set(410, "");
	ANFL.set(411, "");
	ANFL.set(412, "");
	ANFL.set(413, "");
	ANFL.set(414, "");
	ANFL.set(415, "");
	ANFL.set(416, "");
	ANFL.set(417, "");
	ANFL.set(418, "");
	ANFL.set(419, "");
	ANFL.set(420, "");
	ANFL.set(421, "");
	ANFL.set(422, "");
	ANFL.set(423, "");
	ANFL.set(424, "");
	ANFL.set(425, "");
	ANFL.set(426, "");
	ANFL.set(427, "");
	ANFL.set(428, "");
	ANFL.set(429, "");
	ANFL.set(430, "");
	ANFL.set(431, "");
	ANFL.set(432, "");
	ANFL.set(433, "");
	ANFL.set(434, "");
	ANFL.set(435, "");
	ANFL.set(436, "");
	ANFL.set(437, "");
	ANFL.set(438, "");
	ANFL.set(439, "");
	ANFL.set(440, "");
	ANFL.set(441, "");
	ANFL.set(442, "");
	ANFL.set(443, "");
	ANFL.set(444, "");
	ANFL.set(445, "");
	ANFL.set(446, "");
	ANFL.set(447, "");
	ANFL.set(448, "");
	ANFL.set(449, "");
	ANFL.set(450, "");
	ANFL.set(451, "");
	ANFL.set(452, "");
	ANFL.set(453, "");
	ANFL.set(454, "");
	ANFL.set(455, "");
	ANFL.set(456, "");
	ANFL.set(457, "");
	ANFL.set(458, "");
	ANFL.set(459, "");
	ANFL.set(460, "");
	ANFL.set(461, "");
	ANFL.set(462, "");
	ANFL.set(463, "");
	ANFL.set(464, "");
	ANFL.set(465, "");
	ANFL.set(466, "");
	ANFL.set(467, "");
	ANFL.set(468, "");
	ANFL.set(469, "");
	ANFL.set(470, "");
	ANFL.set(471, "");
	ANFL.set(472, "");
	ANFL.set(473, "");
	ANFL.set(474, "");
	ANFL.set(475, "");
	ANFL.set(476, "");
	ANFL.set(477, "");
	ANFL.set(478, "");
	ANFL.set(479, "");
	ANFL.set(480, "");
	ANFL.set(481, "");
	ANFL.set(482, "");
	ANFL.set(483, "");
	ANFL.set(484, "");
	ANFL.set(485, "");
	ANFL.set(486, "");
	ANFL.set(487, "");
	ANFL.set(488, "");
	ANFL.set(489, "");
	ANFL.set(490, "");
	ANFL.set(491, "");
	ANFL.set(492, "");
	ANFL.set(493, "");
	ANFL.set(494, "");
	ANFL.set(495, "");
	ANFL.set(496, "");
	ANFL.set(497, "");
	ANFL.set(498, "");
	ANFL.set(499, "");
	ANFL.set(500, "");
	ANFL.set(501, "");
	ANFL.set(502, "");
	ANFL.set(503, "");
	ANFL.set(504, "");
	ANFL.set(505, "");
	ANFL.set(506, "");
	ANFL.set(507, "");
	ANFL.set(508, "");
	ANFL.set(509, "");
	ANFL.set(510, "");
	ANFL.set(511, "");
	ANFL.set(512, "");
	ANFL.set(513, "");
	ANFL.set(514, "");
	ANFL.set(515, "");
	ANFL.set(516, "");
	ANFL.set(517, "");
	ANFL.set(518, "");
	ANFL.set(519, "");
	ANFL.set(520, "");
	ANFL.set(521, "");
	ANFL.set(522, "");
	ANFL.set(523, "");
	ANFL.set(524, "");
	ANFL.set(525, "");
	ANFL.set(526, "");
	ANFL.set(527, "");
	ANFL.set(528, "");
	ANFL.set(529, "");
	ANFL.set(530, "");
	ANFL.set(531, "");
	ANFL.set(532, "");
	ANFL.set(533, "");
	ANFL.set(534, "");
	ANFL.set(535, "");
	ANFL.set(536, "");
	ANFL.set(537, "");
	ANFL.set(538, "");
	ANFL.set(539, "");
	ANFL.set(540, "");
	ANFL.set(541, "");
	ANFL.set(542, "");
	ANFL.set(543, "");
	ANFL.set(544, "");
	ANFL.set(545, "");
	ANFL.set(546, "");
	ANFL.set(547, "");
	ANFL.set(548, "");
	ANFL.set(549, "");
	ANFL.set(550, "");
	ANFL.set(551, "");
	ANFL.set(552, "");
	ANFL.set(553, "");
	ANFL.set(554, "");
	ANFL.set(555, "");
	ANFL.set(556, "");
	ANFL.set(557, "");
	ANFL.set(558, "");
	ANFL.set(559, "");
	ANFL.set(560, "");
	ANFL.set(561, "");
	ANFL.set(562, "");
	ANFL.set(563, "");
	ANFL.set(564, "");
	ANFL.set(565, "");
	ANFL.set(566, "");
	ANFL.set(567, "");
	ANFL.set(568, "");
	ANFL.set(569, "");
	ANFL.set(570, "");
	ANFL.set(571, "");
	ANFL.set(572, "");
	ANFL.set(573, "");
	ANFL.set(574, "");
	ANFL.set(575, "");
	ANFL.set(576, "");
	ANFL.set(577, "");
	ANFL.set(578, "");
	ANFL.set(579, "");
	ANFL.set(580, "");
	ANFL.set(581, "");
	ANFL.set(582, "");
	ANFL.set(583, "");
	ANFL.set(584, "");
	ANFL.set(585, "");
	ANFL.set(586, "");
	ANFL.set(587, "");
	ANFL.set(588, "");
	ANFL.set(589, "");
	ANFL.set(590, "");
	ANFL.set(591, "");
	ANFL.set(592, "");
	ANFL.set(593, "");
	ANFL.set(594, "");
	ANFL.set(595, "");
	ANFL.set(596, "");
	ANFL.set(597, "");
	ANFL.set(598, "");
	ANFL.set(599, "");
	ANFL.set(600, "");
	ANFL.set(601, "");
	ANFL.set(602, "");
	ANFL.set(603, "");
	ANFL.set(604, "");
	ANFL.set(605, "");
	ANFL.set(606, "");
	ANFL.set(607, "");
	ANFL.set(608, "");
	ANFL.set(609, "");
	ANFL.set(610, "");
	ANFL.set(611, "");
	ANFL.set(612, "");
	ANFL.set(613, "");
	ANFL.set(614, "");
	ANFL.set(615, "");
	ANFL.set(616, "");
	ANFL.set(617, "");
	ANFL.set(618, "");
	ANFL.set(619, "");
	ANFL.set(620, "");
	ANFL.set(621, "");
	ANFL.set(622, "");
	ANFL.set(623, "");
	ANFL.set(624, "");
	ANFL.set(625, "");
	ANFL.set(626, "");
	ANFL.set(627, "");
	ANFL.set(628, "");
	ANFL.set(629, "");
	ANFL.set(630, "");
	ANFL.set(631, "");
	ANFL.set(632, "");
	ANFL.set(633, "");
	ANFL.set(634, "");
	ANFL.set(635, "");
	ANFL.set(636, "");
	ANFL.set(637, "");
	ANFL.set(638, "");
	ANFL.set(639, "");
	ANFL.set(640, "");
	ANFL.set(641, "");
	ANFL.set(642, "");
	ANFL.set(643, "");
	ANFL.set(644, "");
	ANFL.set(645, "");
	ANFL.set(646, "");
	ANFL.set(647, "");
	ANFL.set(648, "");
	ANFL.set(649, "");
	ANFL.set(650, "");
	ANFL.set(651, "");
	ANFL.set(652, "");
	ANFL.set(653, "");
	ANFL.set(654, "");
	ANFL.set(655, "");
	ANFL.set(656, "");
	ANFL.set(657, "");
	ANFL.set(658, "");
	ANFL.set(659, "");
	ANFL.set(660, "");
	ANFL.set(661, "");
	ANFL.set(662, "");
	ANFL.set(663, "");
	ANFL.set(664, "");
	ANFL.set(665, "");
	ANFL.set(666, "");
	ANFL.set(667, "");
	ANFL.set(668, "");
	ANFL.set(669, "");
	ANFL.set(670, "");
	ANFL.set(671, "");
	ANFL.set(672, "");
	ANFL.set(673, "");
	ANFL.set(674, "");
	ANFL.set(675, "");
	ANFL.set(676, "");
	ANFL.set(677, "");
	ANFL.set(678, "");
	ANFL.set(679, "");
	ANFL.set(680, "");
	ANFL.set(681, "");
	ANFL.set(682, "");
	ANFL.set(683, "");
	ANFL.set(684, "");
	ANFL.set(685, "");
	ANFL.set(686, "");
	ANFL.set(687, "");
	ANFL.set(688, "");
	ANFL.set(689, "");
	ANFL.set(690, "");
	ANFL.set(691, "");
	ANFL.set(692, "");
	ANFL.set(693, "");
	ANFL.set(694, "");
	ANFL.set(695, "");
	ANFL.set(696, "");
	ANFL.set(697, "");
	ANFL.set(698, "");
	ANFL.set(699, "");
	ANFL.set(700, "");
	ANFL.set(701, "");
	ANFL.set(702, "");
	ANFL.set(703, "");
	ANFL.set(704, "");
	ANFL.set(705, "");
	ANFL.set(706, "");
	ANFL.set(707, "");
	ANFL.set(708, "");
	ANFL.set(709, "");
	ANFL.set(710, "");
	ANFL.set(711, "");
	ANFL.set(712, "");
	ANFL.set(713, "");
	ANFL.set(714, "");
	ANFL.set(715, "");
	ANFL.set(716, "");
	ANFL.set(717, "");
	ANFL.set(718, "");
	ANFL.set(719, "");
	ANFL.set(720, "");
	ANFL.set(721, "");
	ANFL.set(722, "");
	ANFL.set(723, "");
	ANFL.set(724, "");
	ANFL.set(725, "");
	ANFL.set(726, "");
	ANFL.set(727, "");
	ANFL.set(728, "");
	ANFL.set(729, "");
	ANFL.set(730, "");
	ANFL.set(731, "");
	ANFL.set(732, "");
	ANFL.set(733, "");
	ANFL.set(734, "");
	ANFL.set(735, "");
	ANFL.set(736, "");
	ANFL.set(737, "");
	ANFL.set(738, "");
	ANFL.set(739, "");
	ANFL.set(740, "");
	ANFL.set(741, "");
	ANFL.set(742, "");
	ANFL.set(743, "");
	ANFL.set(744, "");
	ANFL.set(745, "");
	ANFL.set(746, "");
	ANFL.set(747, "");
	ANFL.set(748, "");
	ANFL.set(749, "");
	ANFL.set(750, "");
	ANFL.set(751, "");
	ANFL.set(752, "");
	ANFL.set(753, "");
	ANFL.set(754, "");
	ANFL.set(755, "");
	ANFL.set(756, "");
	ANFL.set(757, "");
	ANFL.set(758, "");
	ANFL.set(759, "");
	ANFL.set(760, "");
	ANFL.set(761, "");
	ANFL.set(762, "");
	ANFL.set(763, "");
	ANFL.set(764, "");
	ANFL.set(765, "");
	ANFL.set(766, "");
	ANFL.set(767, "");
	ANFL.set(768, "");
	ANFL.set(769, "");
	ANFL.set(770, "");
	ANFL.set(771, "");
	ANFL.set(772, "");
	ANFL.set(773, "");
	ANFL.set(774, "");
	ANFL.set(775, "");
	ANFL.set(776, "");
	ANFL.set(777, "");
	ANFL.set(778, "");
	ANFL.set(779, "");
	ANFL.set(780, "");
	ANFL.set(781, "");
	ANFL.set(782, "");
	ANFL.set(783, "");
	ANFL.set(784, "");
	ANFL.set(785, "");
	ANFL.set(786, "");
	ANFL.set(787, "");
	ANFL.set(788, "");
	ANFL.set(789, "");
	ANFL.set(790, "");
	ANFL.set(791, "");
	ANFL.set(792, "");
	ANFL.set(793, "");
	ANFL.set(794, "");
	ANFL.set(795, "");
	ANFL.set(796, "");
	ANFL.set(797, "");
	ANFL.set(798, "");
	ANFL.set(799, "");
	ANFL.set(800, "");
	ANFL.set(801, "");
	ANFL.set(802, "");
	ANFL.set(803, "");
	ANFL.set(804, "");
	ANFL.set(805, "");
	ANFL.set(806, "");
	ANFL.set(807, "");
	ANFL.set(808, "");
	ANFL.set(809, "");
	ANFL.set(810, "");
	ANFL.set(811, "");
	ANFL.set(812, "");
	ANFL.set(813, "");
	ANFL.set(814, "");
	ANFL.set(815, "");
	ANFL.set(816, "");
	ANFL.set(817, "");
	ANFL.set(818, "");
	ANFL.set(819, "");
	ANFL.set(820, "");
	ANFL.set(821, "");
	ANFL.set(822, "");
	ANFL.set(823, "");
	ANFL.set(824, "");
	ANFL.set(825, "");
	ANFL.set(826, "");
	ANFL.set(827, "");
	ANFL.set(828, "");
	ANFL.set(829, "");
	ANFL.set(830, "");
	ANFL.set(831, "");
	ANFL.set(832, "");
	ANFL.set(833, "");
	ANFL.set(834, "");
	ANFL.set(835, "");
	ANFL.set(836, "");
	ANFL.set(837, "");
	ANFL.set(838, "");
	ANFL.set(839, "");
	ANFL.set(840, "");
	ANFL.set(841, "");
	ANFL.set(842, "");
	ANFL.set(843, "");
	ANFL.set(844, "");
	ANFL.set(845, "");
	ANFL.set(846, "");
	ANFL.set(847, "");
	ANFL.set(848, "");
	ANFL.set(849, "");
	ANFL.set(850, "");
	ANFL.set(851, "");
	ANFL.set(852, "");
	ANFL.set(853, "");
	ANFL.set(854, "");
	ANFL.set(855, "");
	ANFL.set(856, "");
	ANFL.set(857, "");
	ANFL.set(858, "");
	ANFL.set(859, "");
	ANFL.set(860, "");
	ANFL.set(861, "");
	ANFL.set(862, "");
	ANFL.set(863, "");
	ANFL.set(864, "");
	ANFL.set(865, "");
	ANFL.set(866, "");
	ANFL.set(867, "");
	ANFL.set(868, "");
	ANFL.set(869, "");
	ANFL.set(870, "");
	ANFL.set(871, "");
	ANFL.set(872, "");
	ANFL.set(873, "");
	ANFL.set(874, "");
	ANFL.set(875, "");
	ANFL.set(876, "");
	ANFL.set(877, "");
	ANFL.set(878, "");
	ANFL.set(879, "");
	ANFL.set(880, "");
	ANFL.set(881, "");
	ANFL.set(882, "");
	ANFL.set(883, "");
	ANFL.set(884, "");
	ANFL.set(885, "");
	ANFL.set(886, "");
	ANFL.set(887, "");
	ANFL.set(888, "");
	ANFL.set(889, "");
	ANFL.set(890, "");
	ANFL.set(891, "");
	ANFL.set(892, "");
	ANFL.set(893, "");
	ANFL.set(894, "");
	ANFL.set(895, "");
	ANFL.set(896, "");
	ANFL.set(897, "");
	ANFL.set(898, "");
	ANFL.set(899, "");
	ANFL.set(900, "");
	ANFL.set(901, "");
	ANFL.set(902, "");
	ANFL.set(903, "");
	ANFL.set(904, "");
	ANFL.set(905, "");
	ANFL.set(906, "");
	ANFL.set(907, "");
	ANFL.set(908, "");
	ANFL.set(909, "");
	ANFL.set(910, "");
	ANFL.set(911, "");
	ANFL.set(912, "");
	ANFL.set(913, "");
	ANFL.set(914, "");
	ANFL.set(915, "");
	ANFL.set(916, "");
	ANFL.set(917, "");
	ANFL.set(918, "");
	ANFL.set(919, "");
	ANFL.set(920, "");
	ANFL.set(921, "");
	ANFL.set(922, "");
	ANFL.set(923, "");
	ANFL.set(924, "");
	ANFL.set(925, "");
	ANFL.set(926, "");
	ANFL.set(927, "");
	ANFL.set(928, "");
	ANFL.set(929, "");
	ANFL.set(930, "");
	ANFL.set(931, "");
	ANFL.set(932, "");
	ANFL.set(933, "");
	ANFL.set(934, "");
	ANFL.set(935, "");
	ANFL.set(936, "");
	ANFL.set(937, "");
	ANFL.set(938, "");
	ANFL.set(939, "");
	ANFL.set(940, "");
	ANFL.set(941, "");
	ANFL.set(942, "");
	ANFL.set(943, "");
	ANFL.set(944, "");
	ANFL.set(945, "");
	ANFL.set(946, "");
	ANFL.set(947, "");
	ANFL.set(948, "");
	ANFL.set(949, "");
	ANFL.set(950, "");
	ANFL.set(951, "");
	ANFL.set(952, "");
	ANFL.set(953, "");
	ANFL.set(954, "");
	ANFL.set(955, "");
	ANFL.set(956, "");
	ANFL.set(957, "");
	ANFL.set(958, "");
	ANFL.set(959, "");
	ANFL.set(960, "");
	ANFL.set(961, "");
	ANFL.set(962, "");
	ANFL.set(963, "");
	ANFL.set(964, "");
	ANFL.set(965, "");
	ANFL.set(966, "");
	ANFL.set(967, "");
	ANFL.set(968, "");
	ANFL.set(969, "");
	ANFL.set(970, "");
	ANFL.set(971, "");
	ANFL.set(972, "");
	ANFL.set(973, "");
	ANFL.set(974, "");
	ANFL.set(975, "");
	ANFL.set(976, "");
	ANFL.set(977, "");
	ANFL.set(978, "");
	ANFL.set(979, "");
	ANFL.set(980, "");
	ANFL.set(981, "");
	ANFL.set(982, "");
	ANFL.set(983, "");
	ANFL.set(984, "");
	ANFL.set(985, "");
	ANFL.set(986, "");
	ANFL.set(987, "");
	ANFL.set(988, "");
	ANFL.set(989, "");
	ANFL.set(990, "");
	ANFL.set(991, "");
	ANFL.set(992, "");
	ANFL.set(993, "");
	ANFL.set(994, "");
	ANFL.set(995, "");
	ANFL.set(996, "");
	ANFL.set(997, "");
	ANFL.set(998, "");
	//Z-ADD
	ANQ.clear();
	//Z-ADD
	A1 = (int) Integer.valueOf(String.valueOf(0));
	//Z-ADD
	A3 = (int) Integer.valueOf(String.valueOf(0));
	// SETLL
	try {
		annfee.getTransaction().begin();
		qAnnfee = annfee.createQuery("select c from Annfee c where c.ANTERR = '"+S9TERR+"'", Annfee.class);
		rAnnfeeList = qAnnfee.getResultList();
		if (rAnnfeeList.size() >= 1) {
			rAnnfee = new Annfee();
			rAnnfeeFOUND = true;
			rAnnfeeEOF = false;
		} else {
			rAnnfeeFOUND = false;
			rAnnfeeEOF = true;
		}
		rAnnfeePOS = -1;
		annfee.getTransaction().commit();
	} catch (Exception e) {
		annfee.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	//DOU
	do {
		// READE
		rAnnfeeFOUND = false;
		rAnnfeeEOF = true;
		while (rAnnfeePOS < rAnnfeeList.size() || rAnnfeeFOUND) {
			rAnnfee = rAnnfeeList.get(++rAnnfeePOS);
					if (Objects.equals(String.valueOf(rAnnfee.getAnterr()), String.valueOf(S9TERR))) {
				rAnnfeeFOUND = true;
				rAnnfeeEOF = false;
			} else {
				rAnnfeeFOUND = false;
				rAnnfeeEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			//ADD
			A1 = A1 + 1;
			// MOVE
			ANY.set(A1, rAnnfee.getAndisp());
			// MOVE
			ANZ.set(A1, rAnnfee.getAncamp());
			// MOVE
			ANC.set(A1, rAnnfee.getAncat());
			// MOVE
			AND.set(A1, rAnnfee.getAndesc());
			//Z-ADD
			ANF.set(A1, Float.valueOf(String.valueOf(rAnnfee.getAnfeam())));
			// MOVE
			ANFL.set(A1, rAnnfee.getAnflag());
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	// SETLL
	try {
		annfee.getTransaction().begin();
		qAnnfee = annfee.createQuery("select c from Annfee c where c.ANTERR = '"+ldadsDS.laterr()+"'", Annfee.class);
		rAnnfeeList = qAnnfee.getResultList();
		if (rAnnfeeList.size() >= 1) {
			rAnnfee = new Annfee();
			rAnnfeeFOUND = true;
			rAnnfeeEOF = false;
		} else {
			rAnnfeeFOUND = false;
			rAnnfeeEOF = true;
		}
		rAnnfeePOS = -1;
		annfee.getTransaction().commit();
	} catch (Exception e) {
		annfee.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	//DOU
	do {
		// READE
		rAnnfeeFOUND = false;
		rAnnfeeEOF = true;
		while (rAnnfeePOS < rAnnfeeList.size() || rAnnfeeFOUND) {
			rAnnfee = rAnnfeeList.get(++rAnnfeePOS);
					if (Objects.equals(String.valueOf(rAnnfee.getAnterr()), String.valueOf(ldadsDS.laterr()))) {
				rAnnfeeFOUND = true;
				rAnnfeeEOF = false;
			} else {
				rAnnfeeFOUND = false;
				rAnnfeeEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			//ADD
			A3 = A3 + 1;
			// IF STATEMENT
			if (IN60 == true) {
				//Z-ADD
				ANF.set(A3, Float.valueOf(String.valueOf(rAnnfee.getAnfeam())));
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	// IF STATEMENT
	if (A3 > A1) {
		//Z-ADD
		A1 = (int) Integer.valueOf(String.valueOf(A2));
	// ENDIF
	}
	// MOVEA
	WAC.clear();
	// MOVEA
	WAD.clear();
	//Z-ADD
	WAF.clear();
	//Z-ADD
	WAT.clear();
	//Z-ADD
	WAQ.clear();
	//Z-ADD
	WAP.clear();
	//Z-ADD
	W1 = (int) Integer.valueOf(String.valueOf(0));
	// SETLL
	try {
		warnty.getTransaction().begin();
		qWarnty = warnty.createQuery("select c from Warnty c where c.WRTERR = '"+S0TERR+"'", Warnty.class);
		rWarntyList = qWarnty.getResultList();
		if (rWarntyList.size() >= 1) {
			rWarnty = new Warnty();
			rWarntyFOUND = true;
			rWarntyEOF = false;
		} else {
			rWarntyFOUND = false;
			rWarntyEOF = true;
		}
		rWarntyPOS = -1;
		warnty.getTransaction().commit();
	} catch (Exception e) {
		warnty.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	//DOU
	do {
		// READE
		rWarntyFOUND = false;
		rWarntyEOF = true;
		while (rWarntyPOS < rWarntyList.size() || rWarntyFOUND) {
			rWarnty = rWarntyList.get(++rWarntyPOS);
					if (Objects.equals(String.valueOf(rWarnty.getWrterr()), String.valueOf(S0TERR))) {
				rWarntyFOUND = true;
				rWarntyEOF = false;
			} else {
				rWarntyFOUND = false;
				rWarntyEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			//ADD
			W1 = W1 + 1;
			// MOVE
			WAC.set(W1, rWarnty.getWrcode());
			// MOVE
			WAD.set(W1, rWarnty.getWrdesc());
			//Z-ADD
			WAF.set(W1, Float.valueOf(String.valueOf(rWarnty.getWrfeam())));
			//Z-ADD
			WAT.set(W1, Float.valueOf(String.valueOf(rWarnty.getWrfeth())));
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	// SETLL
	try {
		warnty.getTransaction().begin();
		qWarnty = warnty.createQuery("select c from Warnty c where c.WRTERR = '"+ZZTERR+"'", Warnty.class);
		rWarntyList = qWarnty.getResultList();
		if (rWarntyList.size() >= 1) {
			rWarnty = new Warnty();
			rWarntyFOUND = true;
			rWarntyEOF = false;
		} else {
			rWarntyFOUND = false;
			rWarntyEOF = true;
		}
		rWarntyPOS = -1;
		warnty.getTransaction().commit();
	} catch (Exception e) {
		warnty.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	//DOU
	do {
		// READE
		rWarntyFOUND = false;
		rWarntyEOF = true;
		while (rWarntyPOS < rWarntyList.size() || rWarntyFOUND) {
			rWarnty = rWarntyList.get(++rWarntyPOS);
					if (Objects.equals(String.valueOf(rWarnty.getWrterr()), String.valueOf(ZZTERR))) {
				rWarntyFOUND = true;
				rWarntyEOF = false;
			} else {
				rWarntyFOUND = false;
				rWarntyEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			//Z-ADD
			W9 = (int) Integer.valueOf(String.valueOf(1));
			// IF STATEMENT
			if (IN78 == false) {
				//ADD
				W1 = W1 + 1;
				// MOVE
				WAC.set(W1, rWarnty.getWrcode());
				// MOVE
				WAD.set(W1, rWarnty.getWrdesc());
				//Z-ADD
				WAF.set(W1, Float.valueOf(String.valueOf(rWarnty.getWrfeam())));
				//Z-ADD
				WAT.set(W1, Float.valueOf(String.valueOf(rWarnty.getWrfeth())));
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	// MOVE
	TERR99 = String.valueOf(ldadsDS.laterr());
	// CHAIN SETLL
	try {
		schdft.getTransaction().begin();
		qSchdft = schdft.createQuery("select c from Schdft c where c.DFTERR = '"+TERR99+"'", Schdft.class);
		rSchdftList = qSchdft.getResultList();
		if (rSchdftList.size() >= 1) {
			rSchdft = new Schdft();
			rSchdftFOUND = true;
			rSchdftEOF = false;
		} else {
			rSchdftFOUND = false;
			rSchdftEOF = true;
		}
		rSchdftPOS = -1;
		schdft.getTransaction().commit();
	} catch (Exception e) {
		schdft.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rSchdftFOUND = false;
	rSchdftEOF = true;
	while (rSchdftPOS < rSchdftList.size() || rSchdftFOUND) {
		rSchdft = rSchdftList.get(++rSchdftPOS);
		if (Objects.equals(String.valueOf(rSchdft.getDfterr()), String.valueOf(TERR99))) {
			rSchdftFOUND = true;
			rSchdftEOF = false;
		} else {
			rSchdftFOUND = false;
			rSchdftEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == true) {
		// MOVE
		TERR99 = String.valueOf(TERR99.replaceAll("[a-zA-Z0-9],\\s+", "9"));
		// CHAIN SETLL
		try {
			schdft.getTransaction().begin();
			qSchdft = schdft.createQuery("select c from Schdft c where c.DFTERR = '"+TERR99+"'", Schdft.class);
			rSchdftList = qSchdft.getResultList();
			if (rSchdftList.size() >= 1) {
				rSchdft = new Schdft();
				rSchdftFOUND = true;
				rSchdftEOF = false;
			} else {
				rSchdftFOUND = false;
				rSchdftEOF = true;
			}
			rSchdftPOS = -1;
			schdft.getTransaction().commit();
		} catch (Exception e) {
			schdft.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rSchdftFOUND = false;
		rSchdftEOF = true;
		while (rSchdftPOS < rSchdftList.size() || rSchdftFOUND) {
			rSchdft = rSchdftList.get(++rSchdftPOS);
				if (Objects.equals(String.valueOf(rSchdft.getDfterr()), String.valueOf(TERR99))) {
				rSchdftFOUND = true;
				rSchdftEOF = false;
			} else {
				rSchdftFOUND = false;
				rSchdftEOF = true;
			}

		}
	// ENDIF
	}
	// MOVE
	$TSKTP = String.valueOf("INSTALL");
	// CHAIN SETLL
	try {
		catskd.getTransaction().begin();
		qCatskd = catskd.createQuery($tskcKL("Catskd"), Catskd.class);
		rCatskdList = qCatskd.getResultList();
		if (rCatskdList.size() >= 1) {
			rCatskd = new Catskd();
			rCatskdFOUND = true;
			rCatskdEOF = false;
		} else {
			rCatskdFOUND = false;
			rCatskdEOF = true;
		}
		rCatskdPOS = -1;
		catskd.getTransaction().commit();
	} catch (Exception e) {
		catskd.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rCatskdFOUND = false;
	rCatskdEOF = true;
	while (rCatskdPOS < rCatskdList.size() || rCatskdFOUND) {
		rCatskd = rCatskdList.get(++rCatskdPOS);
		if (Objects.equals(String.valueOf(rCatskd.getCtterr()), String.valueOf(TERR99)) && Objects.equals(String.valueOf(rCatskd.getCtcamp()), String.valueOf(ldadsDS.lcamp())) && Objects.equals(String.valueOf(rCatskd.getCttskt()), String.valueOf($TSKTP))) {
			rCatskdFOUND = true;
			rCatskdEOF = false;
		} else {
			rCatskdFOUND = false;
			rCatskdEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == true) {
		// MOVE
		rSchdft.setDfstsk(String.valueOf("RIF"));
	// ELSE
	} else {
		// MOVE
		rSchdft.setDfstsk(String.valueOf(rCatskd.getCttsk()));
	// ENDIF
	}
	// SETLL
	try {
		schdetlc.getTransaction().begin();
		qSchdetlc = schdetlc.createQuery(schkey2KL("Schdetlc"), Schdetlc.class);
		rSchdetlcList = qSchdetlc.getResultList();
		if (rSchdetlcList.size() >= 1) {
			rSchdetlc = new Schdetlc();
			rSchdetlcFOUND = true;
			rSchdetlcEOF = false;
		} else {
			rSchdetlcFOUND = false;
			rSchdetlcEOF = true;
		}
		rSchdetlcPOS = -1;
		schdetlc.getTransaction().commit();
	} catch (Exception e) {
		schdetlc.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	//DOU
	do {
		// READE
		rSchdetlcFOUND = false;
		rSchdetlcEOF = true;
		while (rSchdetlcPOS < rSchdetlcList.size() || rSchdetlcFOUND) {
			rSchdetlc = rSchdetlcList.get(++rSchdetlcPOS);
					if (Objects.equals(String.valueOf(rSchdetlc.getSdent()), String.valueOf($ENT)) && Objects.equals(String.valueOf(rSchdetlc.getSdacct()), String.valueOf(ldadsDS.lmms()))) {
				rSchdetlcFOUND = true;
				rSchdetlcEOF = false;
			} else {
				rSchdetlcFOUND = false;
				rSchdetlcEOF = true;
			}

		}
		// IF STATEMENT
		if (IN79 == false) {
			// CHAIN SETLL
			try {
				taskms.getTransaction().begin();
				qTaskms = taskms.createQuery(taskeyKL("Taskms"), Taskm.class);
				rTaskmsList = qTaskms.getResultList();
				if (rTaskmsList.size() >= 1) {
					rTaskms = new Taskm();
					rTaskmsFOUND = true;
					rTaskmsEOF = false;
				} else {
					rTaskmsFOUND = false;
					rTaskmsEOF = true;
				}
				rTaskmsPOS = -1;
				taskms.getTransaction().commit();
			} catch (Exception e) {
				taskms.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rTaskmsFOUND = false;
			rTaskmsEOF = true;
			while (rTaskmsPOS < rTaskmsList.size() || rTaskmsFOUND) {
				rTaskms = rTaskmsList.get(++rTaskmsPOS);
						if (Objects.equals(String.valueOf(rTaskms.getTsterr()), String.valueOf(rSchdetli.getSdterr())) && Objects.equals(String.valueOf(rTaskms.getTsnumb()), String.valueOf(rSchdetli.getSdnumb())) && Objects.equals(String.valueOf(rTaskms.getTssubt()), String.valueOf(rSchdetli.getSdsubt()))) {
					rTaskmsFOUND = true;
					rTaskmsEOF = false;
				} else {
					rTaskmsFOUND = false;
					rTaskmsEOF = true;
				}

			}
			// IF STATEMENT
			if (IN78 == false  && rTaskms.getTsusr2().compareTo("SLS") == 0) {
				// MOVE
				$RARPID = String.valueOf(rSchdetli.getSdrpid());
				// MOVE
				IN79 = true ;
			// ELSE
			} else {
				// CHAIN SETLL
				try {
					taskms.getTransaction().begin();
					qTaskms = taskms.createQuery(tasky9KL("Taskms"), Taskm.class);
					rTaskmsList = qTaskms.getResultList();
					if (rTaskmsList.size() >= 1) {
						rTaskms = new Taskm();
						rTaskmsFOUND = true;
						rTaskmsEOF = false;
					} else {
						rTaskmsFOUND = false;
						rTaskmsEOF = true;
					}
					rTaskmsPOS = -1;
					taskms.getTransaction().commit();
				} catch (Exception e) {
					taskms.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rTaskmsFOUND = false;
				rTaskmsEOF = true;
				while (rTaskmsPOS < rTaskmsList.size() || rTaskmsFOUND) {
					rTaskms = rTaskmsList.get(++rTaskmsPOS);
								if (Objects.equals(String.valueOf(rTaskms.getTsterr()), String.valueOf(SDTER9)) && Objects.equals(String.valueOf(rTaskms.getTsnumb()), String.valueOf(rSchdetli.getSdnumb()))) {
						rTaskmsFOUND = true;
						rTaskmsEOF = false;
					} else {
						rTaskmsFOUND = false;
						rTaskmsEOF = true;
					}

				}
				// IF STATEMENT
				if (IN78 == false  && rTaskms.getTsusr2().compareTo("SLS") == 0) {
					// MOVE
					$RARPID = String.valueOf(rSchdetli.getSdrpid());
					// MOVE
					IN79 = true ;
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	//ENDDO
	} while (IN79 == true);
	// CHAIN SETLL
	try {
		repmst.getTransaction().begin();
		qRepmst = repmst.createQuery("select c from Repmst c where c.RPRPID = '"+$RARPID+"'", Repmst.class);
		rRepmstList = qRepmst.getResultList();
		if (rRepmstList.size() >= 1) {
			rRepmst = new Repmst();
			rRepmstFOUND = true;
			rRepmstEOF = false;
		} else {
			rRepmstFOUND = false;
			rRepmstEOF = true;
		}
		rRepmstPOS = -1;
		repmst.getTransaction().commit();
	} catch (Exception e) {
		repmst.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rRepmstFOUND = false;
	rRepmstEOF = true;
	while (rRepmstPOS < rRepmstList.size() || rRepmstFOUND) {
		rRepmst = rRepmstList.get(++rRepmstPOS);
		if (Objects.equals(String.valueOf(rRepmst.getRprpid()), String.valueOf($RARPID))) {
			rRepmstFOUND = true;
			rRepmstEOF = false;
		} else {
			rRepmstFOUND = false;
			rRepmstEOF = true;
		}

	}
	// IF STATEMENT
	if (rRepmstFOUND) {
		// MOVE
		$RPUS06 = String.valueOf(rRepmst.getRpus06());
		// CHAIN SETLL
		try {
			sr0rsq05.getTransaction().begin();
			qSr0rsq05 = sr0rsq05.createQuery("select c from Sr0rsq05 c where c.CBU6C1 = '"+rRepmst.getRpus10()+"'", Sr0rsq05.class);
			rSr0rsq05List = qSr0rsq05.getResultList();
			if (rSr0rsq05List.size() >= 1) {
				rSr0rsq05 = new Sr0rsq05();
				rSr0rsq05FOUND = true;
				rSr0rsq05EOF = false;
			} else {
				rSr0rsq05FOUND = false;
				rSr0rsq05EOF = true;
			}
			rSr0rsq05POS = -1;
			sr0rsq05.getTransaction().commit();
		} catch (Exception e) {
			sr0rsq05.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rSr0rsq05FOUND = false;
		rSr0rsq05EOF = true;
		while (rSr0rsq05POS < rSr0rsq05List.size() || rSr0rsq05FOUND) {
			rSr0rsq05 = rSr0rsq05List.get(++rSr0rsq05POS);
				if (Objects.equals(String.valueOf(rSr0rsq05.getCbu6c1()), String.valueOf(rRepmst.getRpus10()))) {
				rSr0rsq05FOUND = true;
				rSr0rsq05EOF = false;
			} else {
				rSr0rsq05FOUND = false;
				rSr0rsq05EOF = true;
			}

		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void GETITMPRC () {
	// EVAL
	rItmprclb.setIpwarc( String.valueOf(""));
	// EVAL
	rItmprclb.setIpanlf( String.valueOf(""));
	// EVAL
	rItmprclb.setIpsprc( Float.valueOf(String.valueOf(0)));
	// EVAL
	// CHAIN SETLL
	try {
		itmprclb.getTransaction().begin();
		qItmprclb = itmprclb.createQuery(iprky1KL("Itmprclb"), Itmprclb.class);
		rItmprclbList = qItmprclb.getResultList();
		if (rItmprclbList.size() >= 1) {
			rItmprclb = new Itmprclb();
			rItmprclbFOUND = true;
			rItmprclbEOF = false;
		} else {
			rItmprclbFOUND = false;
			rItmprclbEOF = true;
		}
		rItmprclbPOS = -1;
		itmprclb.getTransaction().commit();
	} catch (Exception e) {
		itmprclb.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rItmprclbFOUND = false;
	rItmprclbEOF = true;
	while (rItmprclbPOS < rItmprclbList.size() || rItmprclbFOUND) {
		rItmprclb = rItmprclbList.get(++rItmprclbPOS);
		if (Objects.equals(String.valueOf(rItmprclb.getIpitem()), String.valueOf(rSh200sfm.getSbitem())) && Objects.equals(String.valueOf(rItmprclb.getIpterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rItmprclb.getIpstyp()), String.valueOf(rPakmst.getPkstyp())) && Objects.equals(String.valueOf(rItmprclb.getIppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
			rItmprclbFOUND = true;
			rItmprclbEOF = false;
		} else {
			rItmprclbFOUND = false;
			rItmprclbEOF = true;
		}

	}
	//DOW
	while (! IN91 && ! IPRCFOUND) {
		// IF STATEMENT
		if (rItmprclb.getIpstat().compareTo("D") != 0) {
			// IF STATEMENT
			if (! IN82) {
				// MOVE
				// IF STATEMENT
				if (ISODATE.compareTo(STARTISO) >= 0) {
					// EVAL
					// EVAL
					rSh200sfm.setIdwarc( String.valueOf(rItmprclb.getIpwarc()));
					// EVAL
					rSh200sfm.setIdanlf( String.valueOf(rItmprclb.getIpanlf()));
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
		// IF STATEMENT
		if (! IPRCFOUND) {
			// READE
			rItmprclbFOUND = false;
			rItmprclbEOF = true;
			while (rItmprclbPOS < rItmprclbList.size() || rItmprclbFOUND) {
				rItmprclb = rItmprclbList.get(++rItmprclbPOS);
							if (Objects.equals(String.valueOf(rItmprclb.getIpitem()), String.valueOf(rSh200sfm.getSbitem())) && Objects.equals(String.valueOf(rItmprclb.getIpterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rItmprclb.getIpstyp()), String.valueOf(rPakmst.getPkstyp())) && Objects.equals(String.valueOf(rItmprclb.getIppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
					rItmprclbFOUND = true;
					rItmprclbEOF = false;
				} else {
					rItmprclbFOUND = false;
					rItmprclbEOF = true;
				}

			}
		// ENDIF
		}
	//ENDDO
	}
	// IF STATEMENT
	if (! IPRCFOUND) {
		// CHAIN SETLL
		try {
			itmprclb.getTransaction().begin();
			qItmprclb = itmprclb.createQuery(iprky9KL("Itmprclb"), Itmprclb.class);
			rItmprclbList = qItmprclb.getResultList();
			if (rItmprclbList.size() >= 1) {
				rItmprclb = new Itmprclb();
				rItmprclbFOUND = true;
				rItmprclbEOF = false;
			} else {
				rItmprclbFOUND = false;
				rItmprclbEOF = true;
			}
			rItmprclbPOS = -1;
			itmprclb.getTransaction().commit();
		} catch (Exception e) {
			itmprclb.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rItmprclbFOUND = false;
		rItmprclbEOF = true;
		while (rItmprclbPOS < rItmprclbList.size() || rItmprclbFOUND) {
			rItmprclb = rItmprclbList.get(++rItmprclbPOS);
				if (Objects.equals(String.valueOf(rItmprclb.getIpitem()), String.valueOf(rSh200sfm.getSbitem())) && Objects.equals(String.valueOf(rItmprclb.getIpterr()), String.valueOf(ZZTERR)) && Objects.equals(String.valueOf(rItmprclb.getIpstyp()), String.valueOf(rPakmst.getPkstyp())) && Objects.equals(String.valueOf(rItmprclb.getIppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
				rItmprclbFOUND = true;
				rItmprclbEOF = false;
			} else {
				rItmprclbFOUND = false;
				rItmprclbEOF = true;
			}

		}
		//DOW
		while (! IN91 && ! IPRCFOUND) {
			// IF STATEMENT
			if (rItmprclb.getIpstat().compareTo("D") != 0) {
				// IF STATEMENT
				if (! IN82) {
					// MOVE
					// IF STATEMENT
					if (ISODATE.compareTo(STARTISO) >= 0) {
						// EVAL
						// EVAL
						rSh200sfm.setIdwarc( String.valueOf(rItmprclb.getIpwarc()));
						// EVAL
						rSh200sfm.setIdanlf( String.valueOf(rItmprclb.getIpanlf()));
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
			// IF STATEMENT
			if (! IPRCFOUND) {
				// READE
				rItmprclbFOUND = false;
				rItmprclbEOF = true;
				while (rItmprclbPOS < rItmprclbList.size() || rItmprclbFOUND) {
					rItmprclb = rItmprclbList.get(++rItmprclbPOS);
									if (Objects.equals(String.valueOf(rItmprclb.getIpitem()), String.valueOf(rSh200sfm.getSbitem())) && Objects.equals(String.valueOf(rItmprclb.getIpterr()), String.valueOf(ZZTERR)) && Objects.equals(String.valueOf(rItmprclb.getIpstyp()), String.valueOf(rPakmst.getPkstyp())) && Objects.equals(String.valueOf(rItmprclb.getIppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
						rItmprclbFOUND = true;
						rItmprclbEOF = false;
					} else {
						rItmprclbFOUND = false;
						rItmprclbEOF = true;
					}

				}
			// ENDIF
			}
		//ENDDO
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void GETQSP () {
	// EVAL
	PKGQSP = Float.valueOf(String.valueOf(0));
	// EVAL
	QSPCODE = String.valueOf("");
	// SETLL
	try {
		pakspcde.getTransaction().begin();
		qPakspcde = pakspcde.createQuery("select c from Pakspcde c", Pakspcde.class);
		rPakspcdeList = qPakspcde.getResultList();
		if (rPakspcdeList.size() >= 1) {
			rPakspcde = new Pakspcde();
			rPakspcdeFOUND = true;
			rPakspcdeEOF = false;
		} else {
			rPakspcdeFOUND = false;
			rPakspcdeEOF = true;
		}
		rPakspcdePOS = -1;
		pakspcde.getTransaction().commit();
	} catch (Exception e) {
		pakspcde.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READ
	if (rPakspcdePOS < rPakspcdeList.size()) {
		rPakspcde = rPakspcdeList.get(++rPakspcdePOS);
		rPakspcdeFOUND = true;
		rPakspcdeEOF = false;
	} else {
		rPakspcdeFOUND = false;
		rPakspcdeEOF = true;
	}
	//DOW
	while (! rPakspcdeEOF) {
		// IF STATEMENT
		if (rPakspcde.getMatch().compareTo("BEGINS") == 0) {
			// EVAL
			SPCODE1 = String.valueOf(rSh200sfm.getCbpkg().substring(0, rPakspcde.getFldlen()+0));
			// EVAL
			DBCODE = String.valueOf(rPakspcde.getPakid().substring(0, rPakspcde.getFldlen()+0));
			// IF STATEMENT
			if (DBCODE.compareTo(SPCODE1)  == 0) {
				// EVAL
				QSPCODE = String.valueOf(rAdtqsp.getSpcode());
				//LEAVE
				break;
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rPakspcde.getMatch().compareTo("EQUALS") == 0) {
			// IF STATEMENT
			if (rPakspcde.getPakid().compareTo(rSh200sfm.getCbpkg())   == 0) {
				// EVAL
				QSPCODE = String.valueOf(rAdtqsp.getSpcode());
				//LEAVE
				break;
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rPakspcde.getMatch().compareTo("CONTAINS") == 0) {
			// EVAL
			EQUALSON = Integer.valueOf(String.valueOf(0));
			// EVAL
			EQUALSON = Integer.valueOf(String.valueOf(rSh200sfm.getCbpkg().indexOf(rPakspcde.getPakid().trim())));
			// IF STATEMENT
			if (EQUALSON >= 1) {
				// EVAL
				QSPCODE = String.valueOf(rAdtqsp.getSpcode());
				//LEAVE
				break;
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rPakspcde.getMatch().compareTo("ENDS") == 0) {
			// EVAL
			LEN = Integer.valueOf(String.valueOf(rSh200sfm.getCbpkg().trim().length()));
			// IF STATEMENT
			if (LEN    >  rPakspcde.getFldlen()) {
				// EVAL
				STARTPOS = Integer.valueOf(String.valueOf((LEN - rPakspcde.getFldlen()) + 1));
				// EVAL
				SPCODE1 = String.valueOf(rSh200sfm.getCbpkg().substring(STARTPOS-1, rPakspcde.getFldlen()+STARTPOS-1));
				// EVAL
				LEN1 = Integer.valueOf(String.valueOf(rPakspcde.getPakid().trim().length()));
				// EVAL
				STARTPOS1 = Integer.valueOf(String.valueOf(LEN1 - rPakspcde.getFldlen()));
				// EVAL
				DBCODE = String.valueOf(rPakspcde.getPakid().substring(0, rPakspcde.getFldlen()+0));
				// IF STATEMENT
				if (DBCODE.compareTo(SPCODE1)  == 0) {
					// EVAL
					QSPCODE = String.valueOf(rAdtqsp.getSpcode());
					//LEAVE
					break;
				// ENDIF
				}
			// ENDIF
			}
		// ENDSL
		}
		// READ
		if (rPakspcdePOS < rPakspcdeList.size()) {
			rPakspcde = rPakspcdeList.get(++rPakspcdePOS);
			rPakspcdeFOUND = true;
			rPakspcdeEOF = false;
		} else {
			rPakspcdeFOUND = false;
			rPakspcdeEOF = true;
		}
	//ENDDO
	}
	// IF STATEMENT
	if (rSh200sfm.getCbnegp() != 0) {
		//Z-ADD
		QSPPRICE = Float.valueOf(String.valueOf(rSh200sfm.getCbnegp()));
	// ELSE
	} else {
		// IF STATEMENT
		if (QSPCODE.compareTo("USAA") == 0) {
			// EVAL
			QSPPRICE = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
		// ELSE
		} else {
			// EVAL
			QSPPRICE = Float.valueOf(String.valueOf(rSh200sfm.getCbbase() + rSh200sfm.getCbadd2()));
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (QSPCODE.compareTo("") == 0) {
		// CHAIN SETLL
		try {
			adtqspb.getTransaction().begin();
			qAdtqspb = adtqspb.createQuery("select c from Adtqspb c where c.QBCAMP = '"+ldadsDS.lcamp()+"'", Adtqspb.class);
			rAdtqspbList = qAdtqspb.getResultList();
			if (rAdtqspbList.size() >= 1) {
				rAdtqspb = new Adtqspb();
				rAdtqspbFOUND = true;
				rAdtqspbEOF = false;
			} else {
				rAdtqspbFOUND = false;
				rAdtqspbEOF = true;
			}
			rAdtqspbPOS = -1;
			adtqspb.getTransaction().commit();
		} catch (Exception e) {
			adtqspb.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAdtqspbFOUND = false;
		rAdtqspbEOF = true;
		while (rAdtqspbPOS < rAdtqspbList.size() || rAdtqspbFOUND) {
			rAdtqspb = rAdtqspbList.get(++rAdtqspbPOS);
				if (Objects.equals(String.valueOf(rAdtqspb.getQbcamp()), String.valueOf(ldadsDS.lcamp()))) {
				rAdtqspbFOUND = true;
				rAdtqspbEOF = false;
			} else {
				rAdtqspbFOUND = false;
				rAdtqspbEOF = true;
			}

		}
		// IF STATEMENT
		if (rAdtqspbFOUND) {
			// MOVE
			ATMPFLG = Integer.valueOf(String.valueOf("1"));
			// EVAL
			QSPCODE = String.valueOf(rAdtqspb.getQbqcod());
		// ELSE
		} else {
			// MOVE
			ATMPFLG = Integer.valueOf(String.valueOf("0"));
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (QSPCODE.compareTo("") !=  0) {
		// SETGT
		try {
			adtqsp.getTransaction().begin();
			qAdtqsp = adtqsp.createQuery(qspkeyKL("Adtqsp"), Adtqsp.class);
			rAdtqspList = qAdtqsp.getResultList();
			if (rAdtqspList.size() >= 1) {
				rAdtqsp = new Adtqsp();
				rAdtqspFOUND = true;
				rAdtqspEOF = false;
			} else {
				rAdtqspFOUND = false;
				rAdtqspEOF = true;
			}
			rAdtqspPOS = rAdtqspList.size();
			adtqsp.getTransaction().commit();
		} catch (Exception e) {
			adtqsp.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// READ PRIOR
		if (rAdtqspPOS > 0) {
			rAdtqsp = rAdtqspList.get(--rAdtqspPOS);
			rAdtqspFOUND = true;
			rAdtqspEOF = false;
		} else {
			rAdtqspFOUND = false;
			rAdtqspEOF = true;
		}
		// IF STATEMENT
		if (! IN91 && QSPPRICE >= rAdtqsp.getSplopp() && QSPPRICE <= rAdtqsp.getSphipp()) {
			// IF STATEMENT
			if (rAdtqsp.getSppct() != 0) {
				// IF STATEMENT
				if (rAdtqsp.getSprnd().compareTo(" ") == 0) {
					// EVAL
					PKGQSP = Float.valueOf(String.valueOf(QSPPRICE * rAdtqsp.getSppct()));
					// ELSEIF STATEMENT
				} else if (rAdtqsp.getSprnd().compareTo("H") == 0) {
					// EVAL
					PKGQSPINT = Integer.valueOf(String.valueOf(QSPPRICE * rAdtqsp.getSppct()));
					// EVAL
					PKGQSP = Float.valueOf(String.valueOf(PKGQSPINT));
					// ELSEIF STATEMENT
				} else if (rAdtqsp.getSprnd().compareTo("D") == 0) {
					// EVAL
					PKGQSP = Float.valueOf(String.valueOf(QSPPRICE * rAdtqsp.getSppct()));
					// MOVE
					PKGQSPINT = Integer.valueOf(String.valueOf(PKGQSP));
					// EVAL
					PKGQSP = Float.valueOf(String.valueOf(PKGQSPINT));
					// ELSEIF STATEMENT
				} else if (rAdtqsp.getSprnd().compareTo("U") == 0) {
					// EVAL
					PKGQSP = Float.valueOf(String.valueOf(QSPPRICE * rAdtqsp.getSppct()));
					// MOVE
					PKGQSPINT = Integer.valueOf(String.valueOf(PKGQSP));
					// EVAL
					PKGQSP = Float.valueOf(String.valueOf(PKGQSPINT + 1));
				// ENDSL
				}
				// EVAL
				PKGQSP = Float.valueOf(String.valueOf(PKGQSP * 12));
			// ELSE
			} else {
				// EVAL
				PKGQSP = Float.valueOf(String.valueOf(rAdtqsp.getSpbase() * 12));
			// ENDIF
			}
			// IF STATEMENT
			if (rAdtqsp.getSprf() != 0 && RFITEMS) {
				// EVAL
				PKGQSP = Float.valueOf(String.valueOf(PKGQSP + (rAdtqsp.getSprf() * 12)));
			// ENDIF
			}
			//Z-ADD
			rSh200sfm.setCbwrfe(Float.valueOf(String.valueOf(PKGQSP)));
			//Z-ADD
			W2 = (int) Integer.valueOf(String.valueOf(0));
			//DO
			for (W2 = 1; W2 < W1; W2++) {
				//ADD
				WRK092 = WAQ.get(W2) + WAP.get(W2);
				//MULT
				WRK092 = (float) (WRK092 * WAF.get(W2));
				// IF STATEMENT
				if (WRK092 > WAT.get(W2)) {
					//SUB
					WRK092 = WRK092 - WAT.get(W2);
					//ADD
					rSh200sfm.setCbwrfe(rSh200sfm.getCbwrfe() + WRK092);
				// ENDIF
				}
			//ENDDO
			}
			//DIV
			rSh200sfm.setCbmwrf(rSh200sfm.getCbwrfe() / 12);
			// EVAL
			rSh200sfm.setCbmfwt( Float.valueOf(String.valueOf(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire() + rSh200sfm.getCbwrfe() + rSh200sfm.getCbanam())));
			// EVAL
			rSh200sfm.setCbmmfw( Float.valueOf(String.valueOf(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir() + rSh200sfm.getCbmwrf() + rSh200sfm.getCbanmm())));
		// ENDIF
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void CHECKCHS () {
	// EVAL
	// EVAL
	// EVAL
	rValdetla.setVdacen( String.valueOf("C"));
	// EVAL
	rValdetla.setVdmms( String.valueOf(S0ACCT));
	// EVAL
	rValdetla.setVdset( String.valueOf("NEWRESI"));
	// EVAL
	rValdetla.setVdfld( String.valueOf("00017"));
	// CHAIN SETLL
	try {
		valdetla.getTransaction().begin();
		qValdetla = valdetla.createQuery(valkeyKL("Valdetla"), Valdetla.class);
		rValdetlaList = qValdetla.getResultList();
		if (rValdetlaList.size() >= 1) {
			rValdetla = new Valdetla();
			rValdetlaFOUND = true;
			rValdetlaEOF = false;
		} else {
			rValdetlaFOUND = false;
			rValdetlaEOF = true;
		}
		rValdetlaPOS = -1;
		valdetla.getTransaction().commit();
	} catch (Exception e) {
		valdetla.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rValdetlaFOUND = false;
	rValdetlaEOF = true;
	while (rValdetlaPOS < rValdetlaList.size() || rValdetlaFOUND) {
		rValdetla = rValdetlaList.get(++rValdetlaPOS);
		if (Objects.equals(String.valueOf(rValdetla.getVdacen()), String.valueOf(rValdetla.getVdacen())) && Objects.equals(String.valueOf(rValdetla.getVdmms()), String.valueOf(rValdetla.getVdmms())) && Objects.equals(String.valueOf(rValdetla.getVdset()), String.valueOf(rValdetla.getVdset())) && Objects.equals(String.valueOf(rValdetla.getVdfld()), String.valueOf(rValdetla.getVdfld()))) {
			rValdetlaFOUND = true;
			rValdetlaEOF = false;
		} else {
			rValdetlaFOUND = false;
			rValdetlaEOF = true;
		}

	}
	// IF STATEMENT
	if (rValdetlaFOUND && rValdetla.getVddata().compareTo("CHS") == 0) {
		// MOVE
		rSchdetli.setSddate(String.valueOf(DISO));
		// SETGT
		try {
			schdetli.getTransaction().begin();
			qSchdetli = schdetli.createQuery(schkeyKL("Schdetli"), Schdetli.class);
			rSchdetliList = qSchdetli.getResultList();
			if (rSchdetliList.size() >= 1) {
				rSchdetli = new Schdetli();
				rSchdetliFOUND = true;
				rSchdetliEOF = false;
			} else {
				rSchdetliFOUND = false;
				rSchdetliEOF = true;
			}
			rSchdetliPOS = rSchdetliList.size();
			schdetli.getTransaction().commit();
		} catch (Exception e) {
			schdetli.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// READPE
		rSchdetliFOUND = false;
		rSchdetliEOF = true;
		while (rSchdetliPOS > 0 || rSchdetliFOUND) {
			rSchdetli = rSchdetliList.get(--rSchdetliPOS);
				if (Objects.equals(String.valueOf(rSchdetli.getSdacct()), String.valueOf(S0ACCT))) {
				rSchdetliFOUND = true;
				rSchdetliEOF = false;
			} else {
				rSchdetliFOUND = false;
				rSchdetliEOF = true;
			}

		}
		// IF STATEMENT
		if (! IN63) {
			// IF STATEMENT
			if (rSchdetli.getSdnumb().compareTo("CHS") == 0 || rSchdetli.getSdnumb().compareTo("CSG") ==0 || rSchdetli.getSdnumb().compareTo("CTA") ==0) {
				// EVAL
				// EVAL
				// EVAL
			// ENDIF
			}
		// ELSE
		} else {
			// EVAL
			// EVAL
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void CHSSET () {
	//EXSR
	CALCCB();
	// IF STATEMENT
	if (rSh200sfm.getCbwarc().compareTo("Y") == 0) {
		// EVAL
		rSh200sfm.setChswarc( String.valueOf("YES"));
	// ELSE
	} else {
		// EVAL
		rSh200sfm.setChswarc( String.valueOf("NO"));
	// ENDIF
	}
	// EVAL
	rSh200sfm.setAnscneg( String.valueOf(""));
	// EVAL
	rSh200sfm.setAdscneg( String.valueOf(""));
	// IF STATEMENT
	if (LISTFINAL) {
		// EVAL
		rSh200sfm.setChsansc( Float.valueOf(String.valueOf(rSh200sfm.getQansc())));
		// EVAL
		rSh200sfm.setChsadsc( Float.valueOf(String.valueOf(rSh200sfm.getSaamnt())));
		// IF STATEMENT
		if (rQuhdr.getQungmp() != 0) {
			// EVAL
			rSh200sfm.setAnscneg( String.valueOf("(NEGOTIATED)"));
		// ENDIF
		}
		// IF STATEMENT
		if (rQuhdr.getQunegp() != 0) {
			// EVAL
			rSh200sfm.setAdscneg( String.valueOf("(NEGOTIATED)"));
		// ENDIF
		}
		// CHAIN SETLL
		try {
			pakmst.getTransaction().begin();
			qPakmst = pakmst.createQuery(pkgkeyKL("Pakmst"), Pakmst.class);
			rPakmstList = qPakmst.getResultList();
			if (rPakmstList.size() >= 1) {
				rPakmst = new Pakmst();
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}
			rPakmstPOS = -1;
			pakmst.getTransaction().commit();
		} catch (Exception e) {
			pakmst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPakmstFOUND = false;
		rPakmstEOF = true;
		while (rPakmstPOS < rPakmstList.size() || rPakmstFOUND) {
			rPakmst = rPakmstList.get(++rPakmstPOS);
				if (Objects.equals(String.valueOf(rPakmst.getPkterr()), String.valueOf(rSh200sfm.getCaterr())) && Objects.equals(String.valueOf(rPakmst.getPkpakg()), String.valueOf(rSh200sfm.getSapkg()))) {
				rPakmstFOUND = true;
				rPakmstEOF = false;
			} else {
				rPakmstFOUND = false;
				rPakmstEOF = true;
			}

		}
		// IF STATEMENT
		if (! rPakmstFOUND) {
			// CHAIN SETLL
			try {
				pakmst.getTransaction().begin();
				qPakmst = pakmst.createQuery(pkgkeycorpKL("Pakmst"), Pakmst.class);
				rPakmstList = qPakmst.getResultList();
				if (rPakmstList.size() >= 1) {
					rPakmst = new Pakmst();
					rPakmstFOUND = true;
					rPakmstEOF = false;
				} else {
					rPakmstFOUND = false;
					rPakmstEOF = true;
				}
				rPakmstPOS = -1;
				pakmst.getTransaction().commit();
			} catch (Exception e) {
				pakmst.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPakmstFOUND = false;
			rPakmstEOF = true;
			while (rPakmstPOS < rPakmstList.size() || rPakmstFOUND) {
				rPakmst = rPakmstList.get(++rPakmstPOS);
						if (Objects.equals(String.valueOf(rPakmst.getPkterr()), String.valueOf(T99999999)) && Objects.equals(String.valueOf(rPakmst.getPkpakg()), String.valueOf(rSh200sfm.getSapkg()))) {
					rPakmstFOUND = true;
					rPakmstEOF = false;
				} else {
					rPakmstFOUND = false;
					rPakmstEOF = true;
				}

			}
		// ENDIF
		}
	// ELSE
	} else {
		// IF STATEMENT
		if (rSh200sfm.getCbngmp() != 0) {
			// EVAL
			rSh200sfm.setChsansc( Float.valueOf(String.valueOf(rSh200sfm.getCbngmp())));
			// EVAL
			rSh200sfm.setAnscneg( String.valueOf("(NEGOTIATED)"));
		// ELSE
		} else {
			// EVAL
			rSh200sfm.setChsansc( Float.valueOf(String.valueOf(rSh200sfm.getCbmfwt())));
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbnegp() != 0) {
			// EVAL
			rSh200sfm.setChsadsc( Float.valueOf(String.valueOf(rSh200sfm.getCbnegp())));
			// EVAL
			rSh200sfm.setAdscneg( String.valueOf("(NEGOTIATED)"));
		// ELSE
		} else {
			// EVAL
			rSh200sfm.setChsadsc( Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad())));
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	rSh200sfm.setChspkg( String.valueOf(rQuhdr.getQupkg()));
	// EVAL
	rSh200sfm.setChsseq( Integer.valueOf(String.valueOf(rSh200sfm.getHaseq())));
	// EVAL
	rSh200sfm.setChsanmo( Float.valueOf(String.valueOf(rSh200sfm.getChsansc() / 12)));
	//ENDSR
	}
	
//BEGSR
	public static void CHSCONFIRM () {
	//EXSR
	CHSSET();
	// EVAL
	rSh200sfm.setChsmsg( String.valueOf("NOT VERIFYING THIS INFORMATION "+ "WITH THE REP WILL RESULT IN AN UNSAT."));
	// IF STATEMENT
	if (! LISTFINAL) {
		// IF STATEMENT
		if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
		// ELSE
		} else {
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (((chsparmsDS.chsparms().compareTo(CHSSAVE) != 0 && CHSSAVE.compareTo("") != 0) || chsparmsDS.chsparms().compareTo(SCRSAVE) != 0) && Boolean.valueOf(rSh200sfm.getIn85()) == false) {
		// EVAL
		rSh200sfm.setChspcd( String.valueOf(rSh200sfm.getHbprom()));
		// EVAL
		rSh200sfm.setChspds( String.valueOf(" "));
		// IF STATEMENT
		if (rSh200sfm.getChspcd().compareTo(" ") != 0) {
			// EVAL
			rSh200sfm.setChspds( String.valueOf(rPromstlb.getPmdesc()));
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	rSh200sfm.setIn85( String.valueOf(false));
	// EVAL
	CHSSAVE = String.valueOf(chsparmsDS.chsparms());
	// EVAL
	//ENDSR
	}
	
//BEGSR
	public static void SH290 () {
	// IF STATEMENT
	if ($PAS1.compareTo("0") == 0 && rProintro.getPmintf().compareTo("Y") == 0) {
		// EVAL
		rIntroffer.setIomms( String.valueOf(ldadsDS.lmms()));
		// EVAL
		rIntroffer.setIoseq( Integer.valueOf(String.valueOf(rQuhdr.getQuseq())));
		// EVAL
		rIntroffer.setIoindu( Integer.valueOf(String.valueOf(rProintro.getPmindu())));
		// EVAL
		rIntroffer.setIoindd( Float.valueOf(String.valueOf(rProintro.getPmindd())));
		// EVAL
		rIntroffer.setIoindp( Float.valueOf(String.valueOf(rProintro.getPmindp())));
		// EVAL
		rIntroffer.setIoindf( Float.valueOf(String.valueOf(rProintro.getPmindf())));
		// IF STATEMENT
		if (rSh200sfm.getCbmnmp() != 0) {
			// EVAL
			rIntroffer.setIooans( Float.valueOf(String.valueOf(rSh200sfm.getCbmnmp())));
		// ELSE
		} else {
			// EVAL
			rIntroffer.setIooans( Float.valueOf(String.valueOf(rSh200sfm.getCbmmfw())));
		// ENDIF
		}
		// EVAL
		rSh200sfm.setInddes( String.valueOf(""));
		// IF STATEMENT
		if (rProintro.getPmindd() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(String.valueOf(rProintro.getPmindd()).trim() + " " + INTRO.get(1).trim()));
			// EVAL
			rIntroffer.setIodtyp( String.valueOf("1"));
			// IF STATEMENT
			if (rSh200sfm.getCbmnmp() != 0) {
				// EVAL
				rSh200sfm.setInansc( Float.valueOf(String.valueOf(rSh200sfm.getCbmnmp() - rProintro.getPmindd())));
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setInansc( Float.valueOf(String.valueOf(rSh200sfm.getCbmmfw() - rProintro.getPmindd())));
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rProintro.getPmindp() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(String.valueOf(rProintro.getPmindp()).trim() + " " + INTRO.get(2).trim()));
			// EVAL
			rIntroffer.setIodtyp( String.valueOf("2"));
			// IF STATEMENT
			if (rSh200sfm.getCbmnmp() != 0) {
				// EVAL
				rSh200sfm.setInansc( Float.valueOf(String.valueOf(rSh200sfm.getCbmnmp() - (rSh200sfm.getCbmnmp() * (rProintro.getPmindp()/100)))));
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setInansc( Float.valueOf(String.valueOf(rSh200sfm.getCbmmfw() - (rSh200sfm.getCbmmfw() * (rProintro.getPmindp()/100)))));
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rProintro.getPmindf() != 0) {
			// EVAL
			rSh200sfm.setInddes( String.valueOf(INTRO.get(3)));
			// EVAL
			rSh200sfm.setInansc( Float.valueOf(String.valueOf(rProintro.getPmindf())));
			// EVAL
			rIntroffer.setIodtyp( String.valueOf("3"));
		// ENDSL
		}
		// EVAL
		rIntroffer.setIoians( Float.valueOf(String.valueOf(rSh200sfm.getInansc())));
		// EVAL
		rIntroffer.setIoddes( String.valueOf(rSh200sfm.getInddes()));
		// CHAIN SETLL
		try {
			introffer.getTransaction().begin();
			qIntroffer = introffer.createQuery(intkeyKL("Introffer"), Introffer.class);
			rIntrofferList = qIntroffer.getResultList();
			if (rIntrofferList.size() >= 1) {
				rIntroffer = new Introffer();
				rIntrofferFOUND = true;
				rIntrofferEOF = false;
			} else {
				rIntrofferFOUND = false;
				rIntrofferEOF = true;
			}
			rIntrofferPOS = -1;
			introffer.getTransaction().commit();
		} catch (Exception e) {
			introffer.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rIntrofferFOUND = false;
		rIntrofferEOF = true;
		while (rIntrofferPOS < rIntrofferList.size() || rIntrofferFOUND) {
			rIntroffer = rIntrofferList.get(++rIntrofferPOS);
				if (Objects.equals(String.valueOf(rIntroffer.getIomms()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rIntroffer.getIoseq()), String.valueOf(rQuhdr.getQuseq()))) {
				rIntrofferFOUND = true;
				rIntrofferEOF = false;
			} else {
				rIntrofferFOUND = false;
				rIntrofferEOF = true;
			}

		}
		// IF STATEMENT
		if (rIntrofferFOUND) {
			// UPDATE
			try {
				introffer.getTransaction().begin();
				introffer.getTransaction().commit();
			} catch (Exception e) {
				introffer.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
		// ELSE
		} else {
			// WRITE
			try {
				introffer.getTransaction().begin();
				introffer.persist(rIntroffer);
				introffer.getTransaction().commit();
			} catch (Exception e) {
				introffer.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	// IF STATEMENT
	if (rSh200sfm.getCbnegp() != 0) {
		// EVAL
		ADSCAMT = Float.valueOf(String.valueOf(rSh200sfm.getCbnegp()));
	// ELSE
	} else {
		// EVAL
		ADSCAMT = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
	// ENDIF
	}
	// CHAIN SETLL
	try {
		qutrip.getTransaction().begin();
		qQutrip = qutrip.createQuery(qtrip3KL("Qutrip"), Qutrip.class);
		rQutripList = qQutrip.getResultList();
		if (rQutripList.size() >= 1) {
			rQutrip = new Qutrip();
			rQutripFOUND = true;
			rQutripEOF = false;
		} else {
			rQutripFOUND = false;
			rQutripEOF = true;
		}
		rQutripPOS = -1;
		qutrip.getTransaction().commit();
	} catch (Exception e) {
		qutrip.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQutripFOUND = false;
	rQutripEOF = true;
	while (rQutripPOS < rQutripList.size() || rQutripFOUND) {
		rQutrip = rQutripList.get(++rQutripPOS);
		if (Objects.equals(String.valueOf(rQutrip.getTuacct()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rQutrip.getTuseq()), String.valueOf(rQufdtl.getFdseq())) && Objects.equals(String.valueOf(rQutrip.getTaflag()), String.valueOf($AFLAG))) {
			rQutripFOUND = true;
			rQutripEOF = false;
		} else {
			rQutripFOUND = false;
			rQutripEOF = true;
		}

	}
	// IF STATEMENT
	if (rQutripFOUND && rQutrip.getTsflag().compareTo("R") != 0) {
		// EVAL
		ADSCAMT = Float.valueOf(String.valueOf(ADSCAMT - rQutrip.getTamt()));
	// ENDIF
	}
	// CHAIN SETLL
	try {
		qusrvc.getTransaction().begin();
		qQusrvc = qusrvc.createQuery(quhky4KL("Qusrvc"), Qusrvc.class);
		rQusrvcList = qQusrvc.getResultList();
		if (rQusrvcList.size() >= 1) {
			rQusrvc = new Qusrvc();
			rQusrvcFOUND = true;
			rQusrvcEOF = false;
		} else {
			rQusrvcFOUND = false;
			rQusrvcEOF = true;
		}
		rQusrvcPOS = -1;
		qusrvc.getTransaction().commit();
	} catch (Exception e) {
		qusrvc.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQusrvcFOUND = false;
	rQusrvcEOF = true;
	while (rQusrvcPOS < rQusrvcList.size() || rQusrvcFOUND) {
		rQusrvc = rQusrvcList.get(++rQusrvcPOS);
		if (Objects.equals(String.valueOf(rQusrvc.getQsent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQusrvc.getQsacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQusrvc.getQsseq()), String.valueOf(rQufdtl.getFdseq())) && Objects.equals(String.valueOf(rQusrvc.getQscat()), String.valueOf($CONST250))) {
			rQusrvcFOUND = true;
			rQusrvcEOF = false;
		} else {
			rQusrvcFOUND = false;
			rQusrvcEOF = true;
		}

	}
	// IF STATEMENT
	if (rQusrvcFOUND) {
		// EVAL
		ATEMPMS = String.valueOf(rQusrvc.getQsmanu());
		// IF STATEMENT
		if (ATEMPMS.compareTo($CONSTX) == 0) {
			// EVAL
			AMSFLAG = String.valueOf($CONSTONE);
		// ELSE
		} else {
			// EVAL
			AMSFLAG = String.valueOf($CONSTZRO);
		// ENDIF
		}
	// ELSE
	} else {
		// EVAL
		ATEMPMS = String.valueOf("");
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getCbpkg().compareTo("") != 0) {
		// MOVE
		ldadsDS.lpakag(String.valueOf(rSh200sfm.getCbpkg()));
	// ELSE
	} else {
		// MOVE
		ldadsDS.lpakag(String.valueOf(rSh200sfm.getSapkg()));
	// ENDIF
	}
	// IF STATEMENT
	if (rSh200sfm.getRmultq().compareTo("Y") == 0) {
		//EXSR
		SAV_MQUOTE_FINAL();
	// ENDIF
	}
	// IF STATEMENT
	if ($CHKRPT) {
		//EXSR
		CRTRPT();
		// EVAL
	// ENDIF
	}
	// IF STATEMENT
	if (NEWTOWN.compareTo("") != 0) {
		// EVAL
		rSh200sfm.setCaterr( String.valueOf(NEWTOWN));
		// CHAIN SETLL
		try {
			terafl.getTransaction().begin();
			qTerafl = terafl.createQuery("select c from Terafl c where c.AFNUM = '"+rSh200sfm.getCaterr()+"'", Terafl.class);
			rTeraflList = qTerafl.getResultList();
			if (rTeraflList.size() >= 1) {
				rTerafl = new Terafl();
				rTeraflFOUND = true;
				rTeraflEOF = false;
			} else {
				rTeraflFOUND = false;
				rTeraflEOF = true;
			}
			rTeraflPOS = -1;
			terafl.getTransaction().commit();
		} catch (Exception e) {
			terafl.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rTeraflFOUND = false;
		rTeraflEOF = true;
		while (rTeraflPOS < rTeraflList.size() || rTeraflFOUND) {
			rTerafl = rTeraflList.get(++rTeraflPOS);
				if (Objects.equals(String.valueOf(rTerafl.getAfnum()), String.valueOf(rSh200sfm.getCaterr()))) {
				rTeraflFOUND = true;
				rTeraflEOF = false;
			} else {
				rTeraflFOUND = false;
				rTeraflEOF = true;
			}

		}
		// EVAL
		rSh200sfm.setCalnam( String.valueOf(rTerafl.getAflnam()));
		// EVAL
		rSh200sfm.setCblnam( String.valueOf(rTerafl.getAflnam()));
		// EVAL
		ldadsDS.laterr( String.valueOf(NEWTOWN));
		// EVAL
		ldadsDS.lsubt( String.valueOf(NEWSUBT));
	// ENDIF
	}
	// CHAIN SETLL
	try {
		qusrvc.getTransaction().begin();
		qQusrvc = qusrvc.createQuery(quhky4KL("Qusrvc"), Qusrvc.class);
		rQusrvcList = qQusrvc.getResultList();
		if (rQusrvcList.size() >= 1) {
			rQusrvc = new Qusrvc();
			rQusrvcFOUND = true;
			rQusrvcEOF = false;
		} else {
			rQusrvcFOUND = false;
			rQusrvcEOF = true;
		}
		rQusrvcPOS = -1;
		qusrvc.getTransaction().commit();
	} catch (Exception e) {
		qusrvc.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQusrvcFOUND = false;
	rQusrvcEOF = true;
	while (rQusrvcPOS < rQusrvcList.size() || rQusrvcFOUND) {
		rQusrvc = rQusrvcList.get(++rQusrvcPOS);
		if (Objects.equals(String.valueOf(rQusrvc.getQsent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQusrvc.getQsacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQusrvc.getQsseq()), String.valueOf(rQufdtl.getFdseq())) && Objects.equals(String.valueOf(rQusrvc.getQscat()), String.valueOf($CONST250))) {
			rQusrvcFOUND = true;
			rQusrvcEOF = false;
		} else {
			rQusrvcFOUND = false;
			rQusrvcEOF = true;
		}

	}
	// IF STATEMENT
	if (rQusrvcFOUND) {
		// EVAL
		ATEMPMS = String.valueOf(rQusrvc.getQsmanu());
		// IF STATEMENT
		if (ATEMPMS.compareTo($CONSTX) == 0) {
			//DO
			for (A2 = 1; A2 < A1; A2++) {
				// IF STATEMENT
				if (ANC.get(A2).compareTo($CONST250) == 0) {
					// EVAL
					AMS.set(A2,  String.valueOf($CONSTX));
				// ENDIF
				}
			//ENDDO
			}
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if (AMSFLAG.compareTo($CONSTONE) == 0) {
		// EVAL
		ATEMPMS = String.valueOf("");
	// ENDIF
	}
	// SETLL
	try {
		qufdtl.getTransaction().begin();
		qQufdtl = qufdtl.createQuery(prckey2KL("Qufdtl"), Qufdtl.class);
		rQufdtlList = qQufdtl.getResultList();
		if (rQufdtlList.size() >= 1) {
			rQufdtl = new Qufdtl();
			rQufdtlFOUND = true;
			rQufdtlEOF = false;
		} else {
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
		}
		rQufdtlPOS = -1;
		qufdtl.getTransaction().commit();
	} catch (Exception e) {
		qufdtl.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// IF STATEMENT
	if (Boolean.valueOf(rSh200sfm.getIn85()) == true) {
		// EVAL
		AFNDFLG = Integer.valueOf(String.valueOf(1));
		// EVAL
		rQuhdr.setQuseq( Integer.valueOf(String.valueOf($FSEQ)));
		// IF STATEMENT
		if ($PAS1.compareTo("0") == 0 && $UPDPROM.compareTo(" ") != 0 && $FLPRV.compareTo("Y") != 0) {
			// CHAIN SETLL
			try {
				mktadd.getTransaction().begin();
				qMktadd = mktadd.createQuery("select c from Mktadd c where c.MKMMS = '"+ldadsDS.lmms()+"'", Mktadd.class);
				rMktaddList = qMktadd.getResultList();
				if (rMktaddList.size() >= 1) {
					rMktadd = new Mktadd();
					rMktaddFOUND = true;
					rMktaddEOF = false;
				} else {
					rMktaddFOUND = false;
					rMktaddEOF = true;
				}
				rMktaddPOS = -1;
				mktadd.getTransaction().commit();
			} catch (Exception e) {
				mktadd.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rMktaddFOUND = false;
			rMktaddEOF = true;
			while (rMktaddPOS < rMktaddList.size() || rMktaddFOUND) {
				rMktadd = rMktaddList.get(++rMktaddPOS);
						if (Objects.equals(String.valueOf(rMktadd.getMkmms()), String.valueOf(ldadsDS.lmms()))) {
					rMktaddFOUND = true;
					rMktaddEOF = false;
				} else {
					rMktaddFOUND = false;
					rMktaddEOF = true;
				}

			}
			// IF STATEMENT
			if (rMktaddFOUND) {
				// EVAL
				rMktadd.setMkprom( String.valueOf($UPDPROM));
			// ENDIF
			}
			// UPDATE
			try {
				mktadd.getTransaction().begin();
				mktadd.getTransaction().commit();
			} catch (Exception e) {
				mktadd.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
		// ENDIF
		}
	// ELSE
	} else {
		// EVAL
		AFNDFLG = Integer.valueOf(String.valueOf(0));
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void APRCOR () {
	//EXSR
	$600SR();
	// IF STATEMENT
	if (AFNDFLG == 1) {
		//EXSR
		PRCPNTCAL();
	// ENDIF
	}
	// IF STATEMENT
	if ((rSh200sfm.getCbb$ad() != ACBB$AD || rSh200sfm.getCbnegp() != ACBNEGP || rSh200sfm.getCbcat().compareTo(ACBCAT)  != 0) && OVRPRC==Boolean.valueOf("0")) {
		// EVAL
		ACBB$AD = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
		// EVAL
		ACBNEGP = Float.valueOf(String.valueOf(rSh200sfm.getCbnegp()));
		// EVAL
		ACBCAT = String.valueOf(rSh200sfm.getCbcat());
		// IF STATEMENT
		if (rSh200sfm.getSaoptn().compareTo("A") == 0 || rSh200sfm.getCbb$ad() <=  rAdt520.getCoovpp()) {
			// EVAL
			AACAT = String.valueOf(rSh200sfm.getCbcat());
		// ENDIF
		}
		// IF STATEMENT
		if (rSh200sfm.getCbb$ad() <= rAdt520.getCoovpp()) {
			// EVAL
			AACAT = String.valueOf(rSh200sfm.getCbcat());
		// ELSE
		} else {
			// EVAL
			AACAT = String.valueOf(rAdt520.getCopcat());
		// ENDIF
		}
		// EVAL
		rSh200sfm.setCbmntr( Float.valueOf(String.valueOf(rPakprc.getPpamfe())));
		//DIV
		rSh200sfm.setCbmmnt(rSh200sfm.getCbmntr() / 12);
		//DIV
		rSh200sfm.setCbmfir(rSh200sfm.getCbfire() / 12);
		//DIV
		rSh200sfm.setCbmwrf(rSh200sfm.getCbwrfe() / 12);
		//ADD
		rSh200sfm.setCbmfwt(rSh200sfm.getCbmntr() + rSh200sfm.getCbfire());
		//ADD
		rSh200sfm.setCbmfwt(rSh200sfm.getCbmfwt() + rSh200sfm.getCbwrfe());
		//ADD
		rSh200sfm.setCbmmfw(rSh200sfm.getCbmmnt() + rSh200sfm.getCbmfir());
		//ADD
		rSh200sfm.setCbmmfw(rSh200sfm.getCbmmfw() + rSh200sfm.getCbmwrf());
		// SETLL
		try {
			adt520.getTransaction().begin();
			qAdt520 = adt520.createQuery("select c from Adt520 c", Adt520.class);
			rAdt520List = qAdt520.getResultList();
			if (rAdt520List.size() >= 1) {
				rAdt520 = new Adt520();
				rAdt520FOUND = true;
				rAdt520EOF = false;
			} else {
				rAdt520FOUND = false;
				rAdt520EOF = true;
			}
			rAdt520POS = -1;
			adt520.getTransaction().commit();
		} catch (Exception e) {
			adt520.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// READ
		if (rAdt520POS < rAdt520List.size()) {
			rAdt520 = rAdt520List.get(++rAdt520POS);
			rAdt520FOUND = true;
			rAdt520EOF = false;
		} else {
			rAdt520FOUND = false;
			rAdt520EOF = true;
		}
		//DOW
		while (! rAdt520EOF) {
			//EXSR
			CATEXCEPTION();
			// IF STATEMENT
			if (rAdt520.getCostyp().compareTo("B") == 0) {
				// EVAL
				SPCODE2 = String.valueOf(rSh200sfm.getCbpkg().substring(0, rAdt520.getCoslen()+0));
				// EVAL
				DBCODE1 = String.valueOf(rAdt520.getCopkid().substring(0, rAdt520.getCoslen()+0));
				// IF STATEMENT
				if (DBCODE1.compareTo(SPCODE2) == 0 && (( rSh200sfm.getCbnegp() > 0 && rSh200sfm.getCbnegp() >= rAdt520.getCoovpp() ) || ( rSh200sfm.getCbnegp() == 0 && rSh200sfm.getCbb$ad() >= rAdt520.getCoovpp() ))) {
					// IF STATEMENT
					if (AACAT.compareTo("") == 0) {
						// EVAL
						AACAT = String.valueOf(rAdt520.getCopcat());
					// ENDIF
					}
					// EVAL
					CATSAVE = String.valueOf(rSh200sfm.getCbcat());
					// EVAL
					rSh200sfm.setCbcat( String.valueOf(AACAT));
					//EXSR
					CHKLOCALPAK();
					// EVAL
					rSh200sfm.setCbcat( String.valueOf(CATSAVE));
					// SETGT
					try {
						pakprc.getTransaction().begin();
						qPakprc = pakprc.createQuery(prcky3KL("Pakprc"), Pakprc.class);
						rPakprcList = qPakprc.getResultList();
						if (rPakprcList.size() >= 1) {
							rPakprc = new Pakprc();
							rPakprcFOUND = true;
							rPakprcEOF = false;
						} else {
							rPakprcFOUND = false;
							rPakprcEOF = true;
						}
						rPakprcPOS = rPakprcList.size();
						pakprc.getTransaction().commit();
					} catch (Exception e) {
						pakprc.getTransaction().rollback();
					e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// READPE
					rPakprcFOUND = false;
					rPakprcEOF = true;
					while (rPakprcPOS > 0 || rPakprcFOUND) {
						rPakprc = rPakprcList.get(--rPakprcPOS);
											if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(rProsls.getPterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(AACAT))) {
							rPakprcFOUND = true;
							rPakprcEOF = false;
						} else {
							rPakprcFOUND = false;
							rPakprcEOF = true;
						}

					}
					// IF STATEMENT
					if (IN79 == false) {
						// IF STATEMENT
						if ($$ADTA.compareTo(rPakprc.getPpstdt()) >= 0) {
							// IF STATEMENT
							if (rPakprc.getPpstat().compareTo("D") != 0 && rPakprc.getPpallw().compareTo("Y") == 0) {
								// MOVE
								MSG1 = String.valueOf("");
								// MOVE
								MSG2 = String.valueOf("");
								// MOVE
								MSG3 = String.valueOf("");
								// EVAL
								MSG1 = String.valueOf("PRICING CATEGORY OVERRIDDEN TO ");
								// MOVE
								COVVP1 = String.valueOf(rAdt520.getCoovpp());
								// MOVE
								COVVP2 = String.valueOf(rAdt520.getCoovpp());
								// IF STATEMENT
								if (rAdt520.getCopcat().compareTo(rSh200sfm.getCbcat()) != 0) {
									// EVAL
									rSh200sfm.setErmsg1( String.valueOf(MSG1+rAdt520.getCopcat()+">$" +COVVP1.replaceAll("^/+","0")+"."+COVVP2));
									// EVAL
									rSh200sfm.setCbbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									rSh200sfm.setPpbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									// EVAL
								// ELSE
								} else {
									// EVAL
									rSh200sfm.setCbbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									rSh200sfm.setPpbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
								// ENDIF
								}
								// MOVE
								rSh200sfm.setCbcat(String.valueOf(rAdt520.getCopcat()));
								//EXSR
								CHKLOCALPAK();
								// SETGT
								try {
									pakprc.getTransaction().begin();
									qPakprc = pakprc.createQuery(prcky1KL("Pakprc"), Pakprc.class);
									rPakprcList = qPakprc.getResultList();
									if (rPakprcList.size() >= 1) {
										rPakprc = new Pakprc();
										rPakprcFOUND = true;
										rPakprcEOF = false;
									} else {
										rPakprcFOUND = false;
										rPakprcEOF = true;
									}
									rPakprcPOS = rPakprcList.size();
									pakprc.getTransaction().commit();
								} catch (Exception e) {
									pakprc.getTransaction().rollback();
								e.printStackTrace();
								}
								finally{
									emf.close();
								}
								// READPE
								rPakprcFOUND = false;
								rPakprcEOF = true;
								while (rPakprcPOS > 0 || rPakprcFOUND) {
									rPakprc = rPakprcList.get(--rPakprcPOS);
																	if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(rProsls.getPterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
										rPakprcFOUND = true;
										rPakprcEOF = false;
									} else {
										rPakprcFOUND = false;
										rPakprcEOF = true;
									}

								}
								// IF STATEMENT
								if (IN79 == false) {
									// IF STATEMENT
									if ($$ADTA.compareTo(rPakprc.getPpstdt()) >= 0) {
										// IF STATEMENT
										if (rPakprc.getPpstat().compareTo("D") != 0 && rPakprc.getPpallw().compareTo("Y") == 0) {
											//LEAVE
											break;
										// ELSE
										} else {
											// EVAL
											rSh200sfm.setCbcat( String.valueOf(AACAT));
											// EVAL
											// EVAL
											// EVAL
											rSh200sfm.setErmsg1( String.valueOf(""));
											//LEAVE
											break;
										// ENDIF
										}
									// ELSE
									} else {
										// EVAL
										rSh200sfm.setCbcat( String.valueOf(AACAT));
										// EVAL
										// EVAL
										// EVAL
										rSh200sfm.setErmsg1( String.valueOf(""));
										//LEAVE
										break;
									// ENDIF
									}
								// ELSE
								} else {
									// EVAL
									rSh200sfm.setCbcat( String.valueOf(AACAT));
									// EVAL
									// EVAL
									// EVAL
									rSh200sfm.setErmsg1( String.valueOf(""));
									//LEAVE
									break;
								// ENDIF
								}
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
				// ELSEIF STATEMENT
			} else if (rAdt520.getCostyp().compareTo("C") == 0) {
				// EVAL
				EQUALSON = Integer.valueOf(String.valueOf(0));
				// EVAL
				EQUALSON = Integer.valueOf(String.valueOf(rSh200sfm.getCbpkg().indexOf(rAdt520.getCopkid().trim())));
				// IF STATEMENT
				if (EQUALSON >= 1 && (( rSh200sfm.getCbnegp() > 0 && rSh200sfm.getCbnegp() >= rAdt520.getCoovpp() ) || ( rSh200sfm.getCbnegp() == 0 && rSh200sfm.getCbb$ad() >= rAdt520.getCoovpp() ))) {
					//EXSR
					CHKLOCALPAK();
					// SETGT
					try {
						pakprc.getTransaction().begin();
						qPakprc = pakprc.createQuery(prcky3KL("Pakprc"), Pakprc.class);
						rPakprcList = qPakprc.getResultList();
						if (rPakprcList.size() >= 1) {
							rPakprc = new Pakprc();
							rPakprcFOUND = true;
							rPakprcEOF = false;
						} else {
							rPakprcFOUND = false;
							rPakprcEOF = true;
						}
						rPakprcPOS = rPakprcList.size();
						pakprc.getTransaction().commit();
					} catch (Exception e) {
						pakprc.getTransaction().rollback();
					e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// READPE
					rPakprcFOUND = false;
					rPakprcEOF = true;
					while (rPakprcPOS > 0 || rPakprcFOUND) {
						rPakprc = rPakprcList.get(--rPakprcPOS);
											if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(rProsls.getPterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(AACAT))) {
							rPakprcFOUND = true;
							rPakprcEOF = false;
						} else {
							rPakprcFOUND = false;
							rPakprcEOF = true;
						}

					}
					// IF STATEMENT
					if (IN79 == false) {
						// IF STATEMENT
						if ($$ADTA.compareTo(rPakprc.getPpstdt()) >= 0) {
							// IF STATEMENT
							if (rPakprc.getPpstat().compareTo("D") != 0 && rPakprc.getPpallw().compareTo("Y") == 0) {
								// MOVE
								MSG1 = String.valueOf("");
								// MOVE
								MSG2 = String.valueOf("");
								// MOVE
								MSG3 = String.valueOf("");
								// EVAL
								MSG1 = String.valueOf("PRICING CATEGORY OVERRIDDEN TO ");
								// MOVE
								COVVP1 = String.valueOf(rAdt520.getCoovpp());
								// MOVE
								COVVP2 = String.valueOf(rAdt520.getCoovpp());
								// IF STATEMENT
								if (rAdt520.getCopcat().compareTo(rSh200sfm.getCbcat()) != 0) {
									// EVAL
									rSh200sfm.setErmsg1( String.valueOf(MSG1+rAdt520.getCopcat()+">$" +COVVP1.replaceAll("^/+","0")+"."+COVVP2));
									// EVAL
									rSh200sfm.setCbbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									rSh200sfm.setPpbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									// EVAL
								// ELSE
								} else {
									// EVAL
									rSh200sfm.setCbbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									rSh200sfm.setPpbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
								// ENDIF
								}
								// MOVE
								rSh200sfm.setCbcat(String.valueOf(rAdt520.getCopcat()));
								//EXSR
								CHKLOCALPAK();
								// SETGT
								try {
									pakprc.getTransaction().begin();
									qPakprc = pakprc.createQuery(prcky1KL("Pakprc"), Pakprc.class);
									rPakprcList = qPakprc.getResultList();
									if (rPakprcList.size() >= 1) {
										rPakprc = new Pakprc();
										rPakprcFOUND = true;
										rPakprcEOF = false;
									} else {
										rPakprcFOUND = false;
										rPakprcEOF = true;
									}
									rPakprcPOS = rPakprcList.size();
									pakprc.getTransaction().commit();
								} catch (Exception e) {
									pakprc.getTransaction().rollback();
								e.printStackTrace();
								}
								finally{
									emf.close();
								}
								// READPE
								rPakprcFOUND = false;
								rPakprcEOF = true;
								while (rPakprcPOS > 0 || rPakprcFOUND) {
									rPakprc = rPakprcList.get(--rPakprcPOS);
																	if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(rProsls.getPterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
										rPakprcFOUND = true;
										rPakprcEOF = false;
									} else {
										rPakprcFOUND = false;
										rPakprcEOF = true;
									}

								}
								// IF STATEMENT
								if (IN79 == false) {
									// IF STATEMENT
									if ($$ADTA.compareTo(rPakprc.getPpstdt()) >= 0) {
										// IF STATEMENT
										if (rPakprc.getPpstat().compareTo("D") != 0 && rPakprc.getPpallw().compareTo("Y") == 0) {
											//LEAVE
											break;
										// ELSE
										} else {
											// EVAL
											rSh200sfm.setCbcat( String.valueOf(AACAT));
											// EVAL
											// EVAL
											// EVAL
											rSh200sfm.setErmsg1( String.valueOf(""));
											//LEAVE
											break;
										// ENDIF
										}
									// ELSE
									} else {
										// EVAL
										rSh200sfm.setCbcat( String.valueOf(AACAT));
										// EVAL
										// EVAL
										// EVAL
										rSh200sfm.setErmsg1( String.valueOf(""));
										//LEAVE
										break;
									// ENDIF
									}
								// ELSE
								} else {
									// EVAL
									rSh200sfm.setCbcat( String.valueOf(AACAT));
									// EVAL
									// EVAL
									// EVAL
									rSh200sfm.setErmsg1( String.valueOf(""));
									//LEAVE
									break;
								// ENDIF
								}
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
				// ELSEIF STATEMENT
			} else if (rAdt520.getCostyp().compareTo("E") == 0) {
				// IF STATEMENT
				if (rAdt520.getCopkid().compareTo(rSh200sfm.getCbpkg())  == 0     && (( rSh200sfm.getCbnegp() > 0 && rSh200sfm.getCbnegp() >= rAdt520.getCoovpp() ) || ( rSh200sfm.getCbnegp() == 0 && rSh200sfm.getCbb$ad() >= rAdt520.getCoovpp() ))) {
					//EXSR
					CHKLOCALPAK();
					// SETGT
					try {
						pakprc.getTransaction().begin();
						qPakprc = pakprc.createQuery(prcky3KL("Pakprc"), Pakprc.class);
						rPakprcList = qPakprc.getResultList();
						if (rPakprcList.size() >= 1) {
							rPakprc = new Pakprc();
							rPakprcFOUND = true;
							rPakprcEOF = false;
						} else {
							rPakprcFOUND = false;
							rPakprcEOF = true;
						}
						rPakprcPOS = rPakprcList.size();
						pakprc.getTransaction().commit();
					} catch (Exception e) {
						pakprc.getTransaction().rollback();
					e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// READPE
					rPakprcFOUND = false;
					rPakprcEOF = true;
					while (rPakprcPOS > 0 || rPakprcFOUND) {
						rPakprc = rPakprcList.get(--rPakprcPOS);
											if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(rProsls.getPterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(AACAT))) {
							rPakprcFOUND = true;
							rPakprcEOF = false;
						} else {
							rPakprcFOUND = false;
							rPakprcEOF = true;
						}

					}
					// IF STATEMENT
					if (IN79 == false) {
						// IF STATEMENT
						if ($$ADTA.compareTo(rPakprc.getPpstdt()) >= 0) {
							// IF STATEMENT
							if (rPakprc.getPpstat().compareTo("D") != 0 && rPakprc.getPpallw().compareTo("Y") == 0) {
								// MOVE
								MSG1 = String.valueOf("");
								// MOVE
								MSG2 = String.valueOf("");
								// MOVE
								MSG3 = String.valueOf("");
								// EVAL
								MSG1 = String.valueOf("PRICING CATEGORY OVERRIDDEN TO ");
								// MOVE
								COVVP1 = String.valueOf(rAdt520.getCoovpp());
								// MOVE
								COVVP2 = String.valueOf(rAdt520.getCoovpp());
								// IF STATEMENT
								if (rAdt520.getCopcat().compareTo(rSh200sfm.getCbcat()) != 0) {
									// EVAL
									rSh200sfm.setErmsg1( String.valueOf(MSG1+rAdt520.getCopcat()+">$" +COVVP1.replaceAll("^/+","0")+"."+COVVP2));
									// EVAL
									rSh200sfm.setCbbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									rSh200sfm.setPpbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									// EVAL
								// ELSE
								} else {
									// EVAL
									rSh200sfm.setCbbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
									// EVAL
									rSh200sfm.setPpbase( Float.valueOf(String.valueOf(rPakprc.getPpsprc())));
								// ENDIF
								}
								// MOVE
								rSh200sfm.setCbcat(String.valueOf(rAdt520.getCopcat()));
								//EXSR
								CHKLOCALPAK();
								// SETGT
								try {
									pakprc.getTransaction().begin();
									qPakprc = pakprc.createQuery(prcky1KL("Pakprc"), Pakprc.class);
									rPakprcList = qPakprc.getResultList();
									if (rPakprcList.size() >= 1) {
										rPakprc = new Pakprc();
										rPakprcFOUND = true;
										rPakprcEOF = false;
									} else {
										rPakprcFOUND = false;
										rPakprcEOF = true;
									}
									rPakprcPOS = rPakprcList.size();
									pakprc.getTransaction().commit();
								} catch (Exception e) {
									pakprc.getTransaction().rollback();
								e.printStackTrace();
								}
								finally{
									emf.close();
								}
								// READPE
								rPakprcFOUND = false;
								rPakprcEOF = true;
								while (rPakprcPOS > 0 || rPakprcFOUND) {
									rPakprc = rPakprcList.get(--rPakprcPOS);
																	if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(rProsls.getPterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
										rPakprcFOUND = true;
										rPakprcEOF = false;
									} else {
										rPakprcFOUND = false;
										rPakprcEOF = true;
									}

								}
								// IF STATEMENT
								if (IN79 == false) {
									// IF STATEMENT
									if ($$ADTA.compareTo(rPakprc.getPpstdt()) >= 0) {
										// IF STATEMENT
										if (rPakprc.getPpstat().compareTo("D") != 0 && rPakprc.getPpallw().compareTo("Y") == 0) {
											//LEAVE
											break;
										// ELSE
										} else {
											// EVAL
											rSh200sfm.setCbcat( String.valueOf(AACAT));
											// EVAL
											// EVAL
											// EVAL
											rSh200sfm.setErmsg1( String.valueOf(""));
											//LEAVE
											break;
										// ENDIF
										}
									// ELSE
									} else {
										// EVAL
										rSh200sfm.setCbcat( String.valueOf(AACAT));
										// EVAL
										// EVAL
										// EVAL
										rSh200sfm.setErmsg1( String.valueOf(""));
										//LEAVE
										break;
									// ENDIF
									}
								// ELSE
								} else {
									// EVAL
									rSh200sfm.setCbcat( String.valueOf(AACAT));
									// EVAL
									// EVAL
									// EVAL
									rSh200sfm.setErmsg1( String.valueOf(""));
									//LEAVE
									break;
								// ENDIF
								}
							// ENDIF
							}
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			// ENDSL
			}
			// READ
			if (rAdt520POS < rAdt520List.size()) {
				rAdt520 = rAdt520List.get(++rAdt520POS);
				rAdt520FOUND = true;
				rAdt520EOF = false;
			} else {
				rAdt520FOUND = false;
				rAdt520EOF = true;
			}
		//ENDDO
		}
	// ENDIF
	}
	// EVAL
	ACBCAT = String.valueOf(rSh200sfm.getCbcat());
	// IF STATEMENT
	if (AFNDFLG == 1) {
		// EVAL
		rSh200sfm.setCbb$ad( Float.valueOf(String.valueOf(ACB$ADD)));
		// EVAL
		rSh200sfm.setCbnegp( Float.valueOf(String.valueOf(ACB$NEG)));
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void CILOAD () {
	// SETLL
	try {
		adt522la.getTransaction().begin();
		qAdt522la = adt522la.createQuery("select c from Adt522la c", Adt522la.class);
		rAdt522laList = qAdt522la.getResultList();
		if (rAdt522laList.size() >= 1) {
			rAdt522la = new Adt522la();
			rAdt522laFOUND = true;
			rAdt522laEOF = false;
		} else {
			rAdt522laFOUND = false;
			rAdt522laEOF = true;
		}
		rAdt522laPOS = -1;
		adt522la.getTransaction().commit();
	} catch (Exception e) {
		adt522la.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READ
	if (rAdt522laPOS < rAdt522laList.size()) {
		rAdt522la = rAdt522laList.get(++rAdt522laPOS);
		rAdt522laFOUND = true;
		rAdt522laEOF = false;
	} else {
		rAdt522laFOUND = false;
		rAdt522laEOF = true;
	}
	//DOW
	while (! rAdt522laEOF) {
		// IF STATEMENT
		if (rAdt522la.getPsstyp().compareTo(PSSTYP1) == 0) {
			// EVAL
			PSCODE1 = String.valueOf(rSh200sfm.getCbpkg().substring(0, rAdt522la.getPsslen()+0));
			// EVAL
			DBCOD = String.valueOf(rAdt522la.getPspkid().substring(0, rAdt522la.getPsslen()+0));
			// IF STATEMENT
			if (DBCOD.compareTo(PSCODE1)   == 0) {
				// IF STATEMENT
				if (! rAdt522laFOUND) {
					//ADD
					CX = CX + 1;
					// EVAL
					CIL.set(CX,  String.valueOf(rAdt522la.getPslnam()));
				// ENDIF
				}
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rAdt522la.getPsstyp().compareTo(PSSTYP3) == 0) {
			// EVAL
			PSCODE1 = String.valueOf(rSh200sfm.getCbpkg().substring(0, rAdt522la.getPsslen()+0));
			// IF STATEMENT
			if (rAdt522la.getPspkid().compareTo(PSCODE1)  == 0) {
				// IF STATEMENT
				if (! rAdt522laFOUND) {
					//ADD
					CX = CX + 1;
					// EVAL
					CIL.set(CX,  String.valueOf(rAdt522la.getPslnam()));
				// ENDIF
				}
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rAdt522la.getPsstyp().compareTo(PSSTYP2) == 0) {
			// EVAL
			EQUALSON1 = Integer.valueOf(String.valueOf(0));
			// EVAL
			EQUALSON1 = Integer.valueOf(String.valueOf(rSh200sfm.getCbpkg().indexOf(rAdt522la.getPspkid().trim())));
			// IF STATEMENT
			if (EQUALSON1 >= 1) {
				// IF STATEMENT
				if (! rAdt522laFOUND) {
					//ADD
					CX = CX + 1;
					// EVAL
					CIL.set(CX,  String.valueOf(rAdt522la.getPslnam()));
				// ENDIF
				}
			// ENDIF
			}
		// ENDSL
		}
		// READ
		if (rAdt522laPOS < rAdt522laList.size()) {
			rAdt522la = rAdt522laList.get(++rAdt522laPOS);
			rAdt522laFOUND = true;
			rAdt522laEOF = false;
		} else {
			rAdt522laFOUND = false;
			rAdt522laEOF = true;
		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void ACITEM () {
	//DO
	for (CX = 1; CX < 20; CX++) {
		// MOVE
		rAdt522la.setPslnam(String.valueOf(CIL.get(CX)));
		// CHAIN SETLL
		try {
			adt521lb.getTransaction().begin();
			qAdt521lb = adt521lb.createQuery(adt521kyKL("Adt521lb"), Adt521lb.class);
			rAdt521lbList = qAdt521lb.getResultList();
			if (rAdt521lbList.size() >= 1) {
				rAdt521lb = new Adt521lb();
				rAdt521lbFOUND = true;
				rAdt521lbEOF = false;
			} else {
				rAdt521lbFOUND = false;
				rAdt521lbEOF = true;
			}
			rAdt521lbPOS = -1;
			adt521lb.getTransaction().commit();
		} catch (Exception e) {
			adt521lb.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAdt521lbFOUND = false;
		rAdt521lbEOF = true;
		while (rAdt521lbPOS < rAdt521lbList.size() || rAdt521lbFOUND) {
			rAdt521lb = rAdt521lbList.get(++rAdt521lbPOS);
				if (Objects.equals(String.valueOf(rAdt521lb.getIllnam()), String.valueOf(rAdt522la.getPslnam())) && Objects.equals(String.valueOf(rAdt521lb.getIlitem()), String.valueOf(rSh200sfm.getSbitem()))) {
				rAdt521lbFOUND = true;
				rAdt521lbEOF = false;
			} else {
				rAdt521lbFOUND = false;
				rAdt521lbEOF = true;
			}

		}
		// IF STATEMENT
		if (rAdt521lbFOUND && rSh200sfm.getSbaddq() != 0) {
			// EVAL
		// ENDIF
		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void CHECKCI () {
	// EVAL
	//DO
	for (CX = 1; CX < 20; CX++) {
		// IF STATEMENT
		if (CIL.get(CX).compareTo("") != 0 && ! Boolean.valueOf(CIX.get(CX))) {
			// EVAL
		// ENDIF
		}
	//ENDDO
	}
	// IF STATEMENT
	if (IN98) {
		//ADD
		RRNZ = RRNZ + 1;
		// EVAL
		rSh200sfm.setSzerrm( String.valueOf(ERR.get(33)));
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void ACITEMOLD () {
	// SETLL
	try {
		adt522la.getTransaction().begin();
		qAdt522la = adt522la.createQuery("select c from Adt522la c", Adt522la.class);
		rAdt522laList = qAdt522la.getResultList();
		if (rAdt522laList.size() >= 1) {
			rAdt522la = new Adt522la();
			rAdt522laFOUND = true;
			rAdt522laEOF = false;
		} else {
			rAdt522laFOUND = false;
			rAdt522laEOF = true;
		}
		rAdt522laPOS = -1;
		adt522la.getTransaction().commit();
	} catch (Exception e) {
		adt522la.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READ
	if (rAdt522laPOS < rAdt522laList.size()) {
		rAdt522la = rAdt522laList.get(++rAdt522laPOS);
		rAdt522laFOUND = true;
		rAdt522laEOF = false;
	} else {
		rAdt522laFOUND = false;
		rAdt522laEOF = true;
	}
	//DOW
	while (! rAdt522laEOF) {
		// IF STATEMENT
		if (rAdt522la.getPsstyp().compareTo(PSSTYP1) == 0) {
			// EVAL
			PSCODE1 = String.valueOf(rSh200sfm.getCbpkg().substring(0, rAdt522la.getPsslen()+0));
			// EVAL
			DBCOD = String.valueOf(rAdt522la.getPspkid().substring(0, rAdt522la.getPsslen()+0));
			// IF STATEMENT
			if (DBCOD.compareTo(PSCODE1)   == 0) {
				// CHAIN SETLL
				try {
					adt521lb.getTransaction().begin();
					qAdt521lb = adt521lb.createQuery(adt521kyKL("Adt521lb"), Adt521lb.class);
					rAdt521lbList = qAdt521lb.getResultList();
					if (rAdt521lbList.size() >= 1) {
						rAdt521lb = new Adt521lb();
						rAdt521lbFOUND = true;
						rAdt521lbEOF = false;
					} else {
						rAdt521lbFOUND = false;
						rAdt521lbEOF = true;
					}
					rAdt521lbPOS = -1;
					adt521lb.getTransaction().commit();
				} catch (Exception e) {
					adt521lb.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rAdt521lbFOUND = false;
				rAdt521lbEOF = true;
				while (rAdt521lbPOS < rAdt521lbList.size() || rAdt521lbFOUND) {
					rAdt521lb = rAdt521lbList.get(++rAdt521lbPOS);
								if (Objects.equals(String.valueOf(rAdt521lb.getIllnam()), String.valueOf(rAdt522la.getPslnam())) && Objects.equals(String.valueOf(rAdt521lb.getIlitem()), String.valueOf(rSh200sfm.getSbitem()))) {
						rAdt521lbFOUND = true;
						rAdt521lbEOF = false;
					} else {
						rAdt521lbFOUND = false;
						rAdt521lbEOF = true;
					}

				}
				// IF STATEMENT
				if (rAdt521lbFOUND) {
					// IF STATEMENT
					if (rSh200sfm.getSbaddq() != 0) {
						// EVAL
						$SUCS1 = String.valueOf($SUCSS);
						// EVAL
						$SUCS2 = String.valueOf($SUCSS);
						// EVAL
						//EXSR
						ONEBUNDL();
						//LEAVE
						break;
					// ELSE
					} else {
						// IF STATEMENT
						if ($SUCS2.compareTo($NSUCSS) == 0) {
							// EVAL
							$SUCS1 = String.valueOf($NSUCSS);
							//EXSR
							ONEBUNDL();
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rAdt522la.getPsstyp().compareTo(PSSTYP3) == 0) {
			// EVAL
			PSCODE1 = String.valueOf(rSh200sfm.getCbpkg().substring(0, rAdt522la.getPsslen()+0));
			// IF STATEMENT
			if (rAdt522la.getPspkid().compareTo(PSCODE1)  == 0) {
				// CHAIN SETLL
				try {
					adt521lb.getTransaction().begin();
					qAdt521lb = adt521lb.createQuery(adt521kyKL("Adt521lb"), Adt521lb.class);
					rAdt521lbList = qAdt521lb.getResultList();
					if (rAdt521lbList.size() >= 1) {
						rAdt521lb = new Adt521lb();
						rAdt521lbFOUND = true;
						rAdt521lbEOF = false;
					} else {
						rAdt521lbFOUND = false;
						rAdt521lbEOF = true;
					}
					rAdt521lbPOS = -1;
					adt521lb.getTransaction().commit();
				} catch (Exception e) {
					adt521lb.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rAdt521lbFOUND = false;
				rAdt521lbEOF = true;
				while (rAdt521lbPOS < rAdt521lbList.size() || rAdt521lbFOUND) {
					rAdt521lb = rAdt521lbList.get(++rAdt521lbPOS);
								if (Objects.equals(String.valueOf(rAdt521lb.getIllnam()), String.valueOf(rAdt522la.getPslnam())) && Objects.equals(String.valueOf(rAdt521lb.getIlitem()), String.valueOf(rSh200sfm.getSbitem()))) {
						rAdt521lbFOUND = true;
						rAdt521lbEOF = false;
					} else {
						rAdt521lbFOUND = false;
						rAdt521lbEOF = true;
					}

				}
				// IF STATEMENT
				if (rAdt521lbFOUND) {
					// IF STATEMENT
					if (rSh200sfm.getSbaddq() != 0) {
						// EVAL
						$SUCS1 = String.valueOf($SUCSS);
						// EVAL
						$SUCS2 = String.valueOf($SUCSS);
						// EVAL
						//EXSR
						ONEBUNDL();
						//LEAVE
						break;
					// ELSE
					} else {
						// IF STATEMENT
						if ($SUCS2.compareTo($NSUCSS) == 0) {
							// EVAL
							$SUCS1 = String.valueOf($NSUCSS);
							//EXSR
							ONEBUNDL();
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
			// ELSEIF STATEMENT
		} else if (rAdt522la.getPsstyp().compareTo(PSSTYP2) == 0) {
			// EVAL
			EQUALSON1 = Integer.valueOf(String.valueOf(0));
			// EVAL
			EQUALSON1 = Integer.valueOf(String.valueOf(rSh200sfm.getCbpkg().indexOf(rAdt522la.getPspkid().trim())));
			// IF STATEMENT
			if (EQUALSON1 >= 1) {
				// CHAIN SETLL
				try {
					adt521lb.getTransaction().begin();
					qAdt521lb = adt521lb.createQuery(adt521kyKL("Adt521lb"), Adt521lb.class);
					rAdt521lbList = qAdt521lb.getResultList();
					if (rAdt521lbList.size() >= 1) {
						rAdt521lb = new Adt521lb();
						rAdt521lbFOUND = true;
						rAdt521lbEOF = false;
					} else {
						rAdt521lbFOUND = false;
						rAdt521lbEOF = true;
					}
					rAdt521lbPOS = -1;
					adt521lb.getTransaction().commit();
				} catch (Exception e) {
					adt521lb.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rAdt521lbFOUND = false;
				rAdt521lbEOF = true;
				while (rAdt521lbPOS < rAdt521lbList.size() || rAdt521lbFOUND) {
					rAdt521lb = rAdt521lbList.get(++rAdt521lbPOS);
								if (Objects.equals(String.valueOf(rAdt521lb.getIllnam()), String.valueOf(rAdt522la.getPslnam())) && Objects.equals(String.valueOf(rAdt521lb.getIlitem()), String.valueOf(rSh200sfm.getSbitem()))) {
						rAdt521lbFOUND = true;
						rAdt521lbEOF = false;
					} else {
						rAdt521lbFOUND = false;
						rAdt521lbEOF = true;
					}

				}
				// IF STATEMENT
				if (rAdt521lbFOUND) {
					// IF STATEMENT
					if (rSh200sfm.getSbaddq() != 0) {
						// EVAL
						$SUCS1 = String.valueOf($SUCSS);
						// EVAL
						$SUCS2 = String.valueOf($SUCSS);
						// EVAL
						//EXSR
						ONEBUNDL();
						//LEAVE
						break;
					// ELSE
					} else {
						// IF STATEMENT
						if ($SUCS2.compareTo($NSUCSS) == 0) {
							// EVAL
							$SUCS1 = String.valueOf($NSUCSS);
							//EXSR
							ONEBUNDL();
						// ENDIF
						}
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
		// ENDSL
		}
		// READ
		if (rAdt522laPOS < rAdt522laList.size()) {
			rAdt522la = rAdt522laList.get(++rAdt522laPOS);
			rAdt522laFOUND = true;
			rAdt522laEOF = false;
		} else {
			rAdt522laFOUND = false;
			rAdt522laEOF = true;
		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void ONEBUNDL () {
	// IF STATEMENT
	if ($SUCS1.compareTo($NSUCSS) == 0) {
		//ADD
		RRNZ = RRNZ + 1;
		// EVAL
		rSh200sfm.setSzerrm( String.valueOf(ERR.get(33)));
		// EVAL
	// ELSE
	} else {
		// IF STATEMENT
		if ($SUCS2.compareTo($SUCSS) == 0) {
			// EVAL
			rSh200sfm.setSzerrm( String.valueOf(""));
		// ENDIF
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void PRCPNTCAL () {
	// EVAL
	ACB$ADD = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
	// EVAL
	ACB$NEG = Float.valueOf(String.valueOf(rSh200sfm.getCbnegp()));
	// EVAL
	AQUSEQ = Integer.valueOf(String.valueOf(rQuhdr.getQuseq()));
	// EVAL
	AFDSEQ = Integer.valueOf(String.valueOf(rQufdtl.getFdseq()));
	// EVAL
	AQUPKG = String.valueOf(rQuhdr.getQupkg());
	// SETLL
	try {
		qufdtl.getTransaction().begin();
		qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+rSh200sfm.getCaacct()+"'", Qufdtl.class);
		rQufdtlList = qQufdtl.getResultList();
		if (rQufdtlList.size() >= 1) {
			rQufdtl = new Qufdtl();
			rQufdtlFOUND = true;
			rQufdtlEOF = false;
		} else {
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
		}
		rQufdtlPOS = -1;
		qufdtl.getTransaction().commit();
	} catch (Exception e) {
		qufdtl.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// IF STATEMENT
	if (rQufdtlFOUND) {
		// READE
		rQufdtlFOUND = false;
		rQufdtlEOF = true;
		while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
			rQufdtl = rQufdtlList.get(++rQufdtlPOS);
					if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf(rSh200sfm.getCaacct()))) {
				rQufdtlFOUND = true;
				rQufdtlEOF = false;
			} else {
				rQufdtlFOUND = false;
				rQufdtlEOF = true;
			}

		}
		//DOW
		while (! rQufdtlEOF) {
			// IF STATEMENT
			if (AQUSEQ != rQufdtl.getFdseq()) {
				// CHAIN SETLL
				try {
					quhdr.getTransaction().begin();
					qQuhdr = quhdr.createQuery(prckey1KL("Quhdr"), Quhdr.class);
					rQuhdrList = qQuhdr.getResultList();
					if (rQuhdrList.size() >= 1) {
						rQuhdr = new Quhdr();
						rQuhdrFOUND = true;
						rQuhdrEOF = false;
					} else {
						rQuhdrFOUND = false;
						rQuhdrEOF = true;
					}
					rQuhdrPOS = -1;
					quhdr.getTransaction().commit();
				} catch (Exception e) {
					quhdr.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
				while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
					rQuhdr = rQuhdrList.get(++rQuhdrPOS);
								if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rSh200sfm.getCaent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rSh200sfm.getCaacct())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtl.getFdseq()))) {
						rQuhdrFOUND = true;
						rQuhdrEOF = false;
					} else {
						rQuhdrFOUND = false;
						rQuhdrEOF = true;
					}

				}
				// IF STATEMENT
				if (rQuhdr.getQunegp() != 0) {
					// IF STATEMENT
					if (rSh200sfm.getCbnegp() != 0) {
						// EVAL
						rSh200sfm.setCbnegp( Float.valueOf(String.valueOf(rSh200sfm.getCbnegp() + rQuhdr.getQunegp())));
					// ELSE
					} else {
						// EVAL
						rSh200sfm.setCbnegp( Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad() + rQuhdr.getQunegp())));
					// ENDIF
					}
				// ELSE
				} else {
					// IF STATEMENT
					if (rSh200sfm.getCbnegp() != 0) {
						// EVAL
						rSh200sfm.setCbnegp( Float.valueOf(String.valueOf(rQuhdr.getQubase()+rQuhdr.getQuadd()-rQuhdr.getQuadam()-rQuhdr.getQuitam()+rQuhdr.getQuads$() +rSh200sfm.getCbnegp())));
					// ELSE
					} else {
						// EVAL
						rSh200sfm.setCbnegp( Float.valueOf(String.valueOf(rQuhdr.getQubase()+rQuhdr.getQuadd()-rQuhdr.getQuadam()-rQuhdr.getQuitam()+rQuhdr.getQuads$() +rSh200sfm.getCbb$ad())));
					// ENDIF
					}
				// ENDIF
				}
			// ENDIF
			}
			// READE
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
			while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
				rQufdtl = rQufdtlList.get(++rQufdtlPOS);
						if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf(rSh200sfm.getCaacct()))) {
					rQufdtlFOUND = true;
					rQufdtlEOF = false;
				} else {
					rQufdtlFOUND = false;
					rQufdtlEOF = true;
				}

			}
		//ENDDO
		}
	// ENDIF
	}
	// EVAL
	rQuhdr.setQuseq( Integer.valueOf(String.valueOf(AQUSEQ)));
	// EVAL
	rQufdtl.setFdseq( Integer.valueOf(String.valueOf(AFDSEQ)));
	// EVAL
	rQuhdr.setQupkg( String.valueOf(AQUPKG));
	//ENDSR
	}
	
//BEGSR
	public static void CHKLOCALPAK () {
	// IF STATEMENT
	if (rSh200sfm.getCbpkg().compareTo(AAPKG) != 0 || rSh200sfm.getCbcat().compareTo(AACAT) != 0 || rSh200sfm.getCbst().compareTo(rAuxadrla.getAast())  != 0) {
		// MOVE
		$$ADTA = String.valueOf(TODAY);
		// MOVE
		rQuhdr.setQuentd(String.valueOf(TODAY));
		// MOVE
		rSh200sfm.setQdate(Integer.valueOf(String.valueOf(TODAY)));
		// MOVE
		rSh200sfm.setY2k001(Integer.valueOf(String.valueOf(TODAY)));
	// ENDIF
	}
	// EVAL
	// SETGT
	try {
		pakprc.getTransaction().begin();
		qPakprc = pakprc.createQuery(locpakkey1KL("Pakprc"), Pakprc.class);
		rPakprcList = qPakprc.getResultList();
		if (rPakprcList.size() >= 1) {
			rPakprc = new Pakprc();
			rPakprcFOUND = true;
			rPakprcEOF = false;
		} else {
			rPakprcFOUND = false;
			rPakprcEOF = true;
		}
		rPakprcPOS = rPakprcList.size();
		pakprc.getTransaction().commit();
	} catch (Exception e) {
		pakprc.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READPE
	rPakprcFOUND = false;
	rPakprcEOF = true;
	while (rPakprcPOS > 0 || rPakprcFOUND) {
		rPakprc = rPakprcList.get(--rPakprcPOS);
			if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(ldadsDS.laterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
			rPakprcFOUND = true;
			rPakprcEOF = false;
		} else {
			rPakprcFOUND = false;
			rPakprcEOF = true;
		}

	}
	// IF STATEMENT
	if (! rPakprcEOF) {
		// EVAL
		// EVAL
		rProsls.setPterr( String.valueOf(rPakprc.getPpterr()));
	// ELSE
	} else {
		// EVAL
		rProsls.setPterr( String.valueOf(ZTERR));
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void CRTRPT () {
	// EVAL
	_DISP = String.valueOf("CG_");
	// IF STATEMENT
	if (MPKG.compareTo("PULSE DROP") == 0 ||  MPKG.indexOf("DSP IS ") == 1) {
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void $600SR () {
	// EVAL
	IN38 = Boolean.valueOf("0");
	// EVAL
	OVRPRC = Boolean.valueOf("0");
	// EVAL
	OVRAMT = Float.valueOf(String.valueOf(0));
	// EVAL
	TRRN = Integer.valueOf(String.valueOf(1));
	//EXSR
	$600AM();
	//EXSR
	$600OV();
	// IF STATEMENT
	if (RRNB>0) {
		// IF STATEMENT
		if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
		// ELSE
		} else {
		// ENDIF
		}
		//DOW
		boolean rSh200sfmFOUND = false;
		boolean rSh200sfmEOF = false;
		while (rSh200sfmFOUND && ! rSh200sfmEOF) {
			// IF STATEMENT
			if (rSh200sfm.getSbaddq()>0 && rSh200sfm.getSbsprc()>0) {
				// CHAIN SETLL
				try {
					itmovr.getTransaction().begin();
					qItmovr = itmovr.createQuery(ovrkeyKL("Itmovr"), Itmovr.class);
					rItmovrList = qItmovr.getResultList();
					if (rItmovrList.size() >= 1) {
						rItmovr = new Itmovr();
						rItmovrFOUND = true;
						rItmovrEOF = false;
					} else {
						rItmovrFOUND = false;
						rItmovrEOF = true;
					}
					rItmovrPOS = -1;
					itmovr.getTransaction().commit();
				} catch (Exception e) {
					itmovr.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rItmovrFOUND = false;
				rItmovrEOF = true;
				while (rItmovrPOS < rItmovrList.size() || rItmovrFOUND) {
					rItmovr = rItmovrList.get(++rItmovrPOS);
								if (Objects.equals(String.valueOf(rItmovr.getOaflag()), String.valueOf(OVFLAG)) && Objects.equals(String.valueOf(rItmovr.getOitmcd()), String.valueOf(rSh200sfm.getSbitem()))) {
						rItmovrFOUND = true;
						rItmovrEOF = false;
					} else {
						rItmovrFOUND = false;
						rItmovrEOF = true;
					}

				}
				// IF STATEMENT
				if (rItmovrFOUND) {
					// EVAL
					OVRAMT = Float.valueOf(String.valueOf(OVRAMT+rSh200sfm.getSbsprc()*rSh200sfm.getSbaddq()));
				// ENDIF
				}
			// ENDIF
			}
			// EVAL
			IN86 = Boolean.valueOf("1");
			//EXSR
			GETATTR();
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
			// ELSE
			} else {
			// ENDIF
			}
			// EVAL
			TRRN = Integer.valueOf(String.valueOf(TRRN+1));
			// IF STATEMENT
			if (ldadsDS.lcamp().compareTo("COMPAN") == 0) {
			// ELSE
			} else {
			// ENDIF
			}
		//ENDDO
		}
	// ENDIF
	}
	// IF STATEMENT
	if (OVRPRC) {
		// EVAL
		IN38 = Boolean.valueOf("1");
		// IF STATEMENT
		if ((EFFAMT+rSh200sfm.getCbb$ad()-rSh200sfm.getCbadd$()-OVRAMT>=rAdt520.getCoovpp() && rSh200sfm.getCbnegp()==0) || (EFFAMT+rSh200sfm.getCbnegp()>=rAdt520.getCoovpp() && rSh200sfm.getCbnegp()!=0)) {
			// IF STATEMENT
			if (rAdt520.getCopcat().compareTo("OPN") == 0) {
				//EXSR
				OPENCAT();
			// ELSE
			} else {
				// EVAL
				rSh200sfm.setCbcat( String.valueOf(rAdt520.getCopcat()));
			// ENDIF
			}
		// ELSE
		} else {
			// EVAL
			// EVAL
			rSh200sfm.setCbcat( String.valueOf("ADT"));
		// ENDIF
		}
	// ENDIF
	}
	//EXSR
	CHKLOCALPAK();
	// SETGT
	try {
		pakprc.getTransaction().begin();
		qPakprc = pakprc.createQuery(prcky1KL("Pakprc"), Pakprc.class);
		rPakprcList = qPakprc.getResultList();
		if (rPakprcList.size() >= 1) {
			rPakprc = new Pakprc();
			rPakprcFOUND = true;
			rPakprcEOF = false;
		} else {
			rPakprcFOUND = false;
			rPakprcEOF = true;
		}
		rPakprcPOS = rPakprcList.size();
		pakprc.getTransaction().commit();
	} catch (Exception e) {
		pakprc.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READPE
	rPakprcFOUND = false;
	rPakprcEOF = true;
	while (rPakprcPOS > 0 || rPakprcFOUND) {
		rPakprc = rPakprcList.get(--rPakprcPOS);
			if (Objects.equals(String.valueOf(rPakprc.getPpterr()), String.valueOf(rProsls.getPterr())) && Objects.equals(String.valueOf(rPakprc.getPppakg()), String.valueOf(rSh200sfm.getCbpkg())) && Objects.equals(String.valueOf(rPakprc.getPppcat()), String.valueOf(rSh200sfm.getCbcat()))) {
			rPakprcFOUND = true;
			rPakprcEOF = false;
		} else {
			rPakprcFOUND = false;
			rPakprcEOF = true;
		}

	}
	// IF STATEMENT
	if (IN79 == false) {
		// IF STATEMENT
		if ($$ADTA.compareTo(rPakprc.getPpstdt()) >= 0) {
			// IF STATEMENT
			if (rPakprc.getPpstat().compareTo("D") != 0 && rPakprc.getPpallw().compareTo("Y") == 0) {
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	//ADD
	RRNZ = RRNZ + 1;
	// MOVE
	rSh200sfm.setSzerrm(String.valueOf(ERR.get(10)));
	// EVAL
	// EVAL
	//ENDSR
	}
	
//BEGSR
	public static void $600AM () {
	// MOVE
	ITEM = String.valueOf("");
	// EVAL
	OVRPRC = Boolean.valueOf("0");
	// SETLL
	try {
		qufdtlla.getTransaction().begin();
		qQufdtlla = qufdtlla.createQuery("select c from Qufdtlla c where c.FDMMS = '"+ldadsDS.lmms()+"'", Qufdtlla.class);
		rQufdtllaList = qQufdtlla.getResultList();
		if (rQufdtllaList.size() >= 1) {
			rQufdtlla = new Qufdtlla();
			rQufdtllaFOUND = true;
			rQufdtllaEOF = false;
		} else {
			rQufdtllaFOUND = false;
			rQufdtllaEOF = true;
		}
		rQufdtllaPOS = -1;
		qufdtlla.getTransaction().commit();
	} catch (Exception e) {
		qufdtlla.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READE
	rQufdtllaFOUND = false;
	rQufdtllaEOF = true;
	while (rQufdtllaPOS < rQufdtllaList.size() || rQufdtllaFOUND) {
		rQufdtlla = rQufdtllaList.get(++rQufdtllaPOS);
				if (Objects.equals(String.valueOf(rQufdtlla.getFdmms()), String.valueOf(ldadsDS.lmms()))) {
			rQufdtllaFOUND = true;
			rQufdtllaEOF = false;
		} else {
			rQufdtllaFOUND = false;
			rQufdtllaEOF = true;
		}

	}
	//DOW
	while (! rQufdtllaEOF && rQufdtllaFOUND) {
		// IF STATEMENT
		if (rQufdtlla.getFdseq()!=rQuhdr.getQuseq()) {
			// EVAL
			QNO = Integer.valueOf(String.valueOf(1));
			// EVAL
			QNO = Integer.valueOf(String.valueOf(QFLINE.subList(QNO, QFLINE.size()).indexOf(rQufdtlla.getFdseq())));
			// IF STATEMENT
			if (QNO>0) {
				// EVAL
				OVRAMT = Float.valueOf(String.valueOf(OVRAMT+QFNEGP.get(QNO)));
			// ELSE
			} else {
				// CHAIN SETLL
				try {
					qudtllb.getTransaction().begin();
					qQudtllb = qudtllb.createQuery(dtlkeyKL("Qudtllb"), Qudtllb.class);
					rQudtllbList = qQudtllb.getResultList();
					if (rQudtllbList.size() >= 1) {
						rQudtllb = new Qudtllb();
						rQudtllbFOUND = true;
						rQudtllbEOF = false;
					} else {
						rQudtllbFOUND = false;
						rQudtllbEOF = true;
					}
					rQudtllbPOS = -1;
					qudtllb.getTransaction().commit();
				} catch (Exception e) {
					qudtllb.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rQudtllbFOUND = false;
				rQudtllbEOF = true;
				while (rQudtllbPOS < rQudtllbList.size() || rQudtllbFOUND) {
					rQudtllb = rQudtllbList.get(++rQudtllbPOS);
								if (Objects.equals(String.valueOf(rQudtllb.getQdent()), String.valueOf(rQudtl.getQdent())) && Objects.equals(String.valueOf(rQudtllb.getQdacct()), String.valueOf(rQufdtlla.getFdmms())) && Objects.equals(String.valueOf(rQudtllb.getQdseq()), String.valueOf(rQufdtlla.getFdseq()))) {
						rQudtllbFOUND = true;
						rQudtllbEOF = false;
					} else {
						rQudtllbFOUND = false;
						rQudtllbEOF = true;
					}

				}
				//DOW
				while (! rQudtllbEOF && rQudtllbFOUND) {
					// EVAL
					ITEM = String.valueOf(rQudtllb.getQditem());
					// CHAIN SETLL
					try {
						itmovr.getTransaction().begin();
						qItmovr = itmovr.createQuery(ovrky1KL("Itmovr"), Itmovr.class);
						rItmovrList = qItmovr.getResultList();
						if (rItmovrList.size() >= 1) {
							rItmovr = new Itmovr();
							rItmovrFOUND = true;
							rItmovrEOF = false;
						} else {
							rItmovrFOUND = false;
							rItmovrEOF = true;
						}
						rItmovrPOS = -1;
						itmovr.getTransaction().commit();
					} catch (Exception e) {
						itmovr.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rItmovrFOUND = false;
					rItmovrEOF = true;
					while (rItmovrPOS < rItmovrList.size() || rItmovrFOUND) {
						rItmovr = rItmovrList.get(++rItmovrPOS);
										if (Objects.equals(String.valueOf(rItmovr.getOaflag()), String.valueOf(OVFLAG)) && Objects.equals(String.valueOf(rItmovr.getOitmcd()), String.valueOf(ITEM))) {
							rItmovrFOUND = true;
							rItmovrEOF = false;
						} else {
							rItmovrFOUND = false;
							rItmovrEOF = true;
						}

					}
					// IF STATEMENT
					if (rItmovrFOUND) {
						// EVAL
						OVRAMT = Float.valueOf(String.valueOf(OVRAMT+rQudtllb.getQdsprc()*rQudtllb.getQdaddq()));
					// ENDIF
					}
					// READE
					rQudtllbFOUND = false;
					rQudtllbEOF = true;
					while (rQudtllbPOS < rQudtllbList.size() || rQudtllbFOUND) {
						rQudtllb = rQudtllbList.get(++rQudtllbPOS);
											if (Objects.equals(String.valueOf(rQudtllb.getQdent()), String.valueOf(rQudtl.getQdent())) && Objects.equals(String.valueOf(rQudtllb.getQdacct()), String.valueOf(rQufdtlla.getFdmms())) && Objects.equals(String.valueOf(rQudtllb.getQdseq()), String.valueOf(rQufdtlla.getFdseq()))) {
							rQudtllbFOUND = true;
							rQudtllbEOF = false;
						} else {
							rQudtllbFOUND = false;
							rQudtllbEOF = true;
						}

					}
				//ENDDO
				}
			// ENDIF
			}
		// ENDIF
		}
		// READE
		rQufdtllaFOUND = false;
		rQufdtllaEOF = true;
		while (rQufdtllaPOS < rQufdtllaList.size() || rQufdtllaFOUND) {
			rQufdtlla = rQufdtllaList.get(++rQufdtllaPOS);
					if (Objects.equals(String.valueOf(rQufdtlla.getFdmms()), String.valueOf(ldadsDS.lmms()))) {
				rQufdtllaFOUND = true;
				rQufdtllaEOF = false;
			} else {
				rQufdtllaFOUND = false;
				rQufdtllaEOF = true;
			}

		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void $600OV () {
	// SETLL
	try {
		adt520.getTransaction().begin();
		qAdt520 = adt520.createQuery("select c from Adt520 c", Adt520.class);
		rAdt520List = qAdt520.getResultList();
		if (rAdt520List.size() >= 1) {
			rAdt520 = new Adt520();
			rAdt520FOUND = true;
			rAdt520EOF = false;
		} else {
			rAdt520FOUND = false;
			rAdt520EOF = true;
		}
		rAdt520POS = -1;
		adt520.getTransaction().commit();
	} catch (Exception e) {
		adt520.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READ
	if (rAdt520POS < rAdt520List.size()) {
		rAdt520 = rAdt520List.get(++rAdt520POS);
		rAdt520FOUND = true;
		rAdt520EOF = false;
	} else {
		rAdt520FOUND = false;
		rAdt520EOF = true;
	}
	//DOW
	while (! rAdt520EOF) {
		//EXSR
		CATEXCEPTION();
		// EVAL
		TCOPKID = String.valueOf(" ");
		// EVAL
		TCOPKID = String.valueOf(rAdt520.getCopkid().substring(0, rAdt520.getCoslen()+0));
		// IF STATEMENT
		if (rSh200sfm.getCbmon().compareTo(rSh200sfm.getCbmon())==0) {
			// IF STATEMENT
			if (rAdt520.getCostyp().compareTo("E")==0) {
				// IF STATEMENT
				if (TCOPKID.compareTo(rSh200sfm.getCbpkg().substring(0, rAdt520.getCoslen()+0))==0) {
					// EVAL
					OVRPRC = Boolean.valueOf("1");
					//LEAVE
					break;
				// ENDIF
				}
				// ELSEIF STATEMENT
			} else if (rAdt520.getCostyp().compareTo("B")==0) {
				// IF STATEMENT
				if (TCOPKID.compareTo(rSh200sfm.getCbpkg().substring(0, rAdt520.getCoslen()+0))==0) {
					// EVAL
					OVRPRC = Boolean.valueOf("1");
					//LEAVE
					break;
				// ENDIF
				}
				// ELSEIF STATEMENT
			} else if (rAdt520.getCostyp().compareTo("C")==0) {
				//Z-ADD
				SPOS = (int) Integer.valueOf(String.valueOf(0));
				// EVAL
				SPOS = Integer.valueOf(String.valueOf(rSh200sfm.getCbpkg().indexOf(TCOPKID.substring(0, rAdt520.getCoslen()+0))));
				// IF STATEMENT
				if (SPOS>0) {
					// EVAL
					OVRPRC = Boolean.valueOf("1");
					//LEAVE
					break;
				// ENDIF
				}
			// ENDSL
			}
		// ENDIF
		}
		// READ
		if (rAdt520POS < rAdt520List.size()) {
			rAdt520 = rAdt520List.get(++rAdt520POS);
			rAdt520FOUND = true;
			rAdt520EOF = false;
		} else {
			rAdt520FOUND = false;
			rAdt520EOF = true;
		}
	//ENDDO
	}
	// IF STATEMENT
	if (OVRPRC && rAdt520.getCopcat().compareTo("OPN") != 0) {
		// EVAL
		IN38 = Boolean.valueOf("1");
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void $600SV () {
	//Z-ADD
	TQUSEQ = (int) Integer.valueOf(String.valueOf(rQuhdr.getQuseq()));
	// IF STATEMENT
	if (OVRPRC) {
		// SETLL
		try {
			qufdtlla.getTransaction().begin();
			qQufdtlla = qufdtlla.createQuery("select c from Qufdtlla c where c.FDMMS = '"+ldadsDS.lmms()+"'", Qufdtlla.class);
			rQufdtllaList = qQufdtlla.getResultList();
			if (rQufdtllaList.size() >= 1) {
				rQufdtlla = new Qufdtlla();
				rQufdtllaFOUND = true;
				rQufdtllaEOF = false;
			} else {
				rQufdtllaFOUND = false;
				rQufdtllaEOF = true;
			}
			rQufdtllaPOS = -1;
			qufdtlla.getTransaction().commit();
		} catch (Exception e) {
			qufdtlla.getTransaction().rollback();
		e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// READE
		rQufdtllaFOUND = false;
		rQufdtllaEOF = true;
		while (rQufdtllaPOS < rQufdtllaList.size() || rQufdtllaFOUND) {
			rQufdtlla = rQufdtllaList.get(++rQufdtllaPOS);
					if (Objects.equals(String.valueOf(rQufdtlla.getFdmms()), String.valueOf(ldadsDS.lmms()))) {
				rQufdtllaFOUND = true;
				rQufdtllaEOF = false;
			} else {
				rQufdtllaFOUND = false;
				rQufdtllaEOF = true;
			}

		}
		//DOW
		while (! rQufdtllaEOF && rQufdtllaFOUND) {
			// CHAIN SETLL
			try {
				quhdr.getTransaction().begin();
				qQuhdr = quhdr.createQuery(hdrkeyKL("Quhdr"), Quhdr.class);
				rQuhdrList = qQuhdr.getResultList();
				if (rQuhdrList.size() >= 1) {
					rQuhdr = new Quhdr();
					rQuhdrFOUND = true;
					rQuhdrEOF = false;
				} else {
					rQuhdrFOUND = false;
					rQuhdrEOF = true;
				}
				rQuhdrPOS = -1;
				quhdr.getTransaction().commit();
			} catch (Exception e) {
				quhdr.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rQuhdrFOUND = false;
			rQuhdrEOF = true;
			while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
				rQuhdr = rQuhdrList.get(++rQuhdrPOS);
						if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rQudtl.getQdent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rQufdtlla.getFdmms())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtlla.getFdseq()))) {
					rQuhdrFOUND = true;
					rQuhdrEOF = false;
				} else {
					rQuhdrFOUND = false;
					rQuhdrEOF = true;
				}

			}
			//DOW
			while (! rQuhdrEOF && rQuhdrFOUND) {
				// EVAL
				rQuhdr.setQucat( String.valueOf(rSh200sfm.getCbcat()));
				// UPDATE
				try {
					quhdr.getTransaction().begin();
					quhdr.getTransaction().commit();
				} catch (Exception e) {
					quhdr.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// READE
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
				while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
					rQuhdr = rQuhdrList.get(++rQuhdrPOS);
									if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rQudtl.getQdent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rQufdtlla.getFdmms())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtlla.getFdseq()))) {
						rQuhdrFOUND = true;
						rQuhdrEOF = false;
					} else {
						rQuhdrFOUND = false;
						rQuhdrEOF = true;
					}

				}
			//ENDDO
			}
			// READE
			rQufdtllaFOUND = false;
			rQufdtllaEOF = true;
			while (rQufdtllaPOS < rQufdtllaList.size() || rQufdtllaFOUND) {
				rQufdtlla = rQufdtllaList.get(++rQufdtllaPOS);
						if (Objects.equals(String.valueOf(rQufdtlla.getFdmms()), String.valueOf(ldadsDS.lmms()))) {
					rQufdtllaFOUND = true;
					rQufdtllaEOF = false;
				} else {
					rQufdtllaFOUND = false;
					rQufdtllaEOF = true;
				}

			}
		//ENDDO
		}
		// EVAL
		rQufdtlla.setFdseq( Integer.valueOf(String.valueOf(TQUSEQ)));
		// CHAIN SETLL
		try {
			quhdr.getTransaction().begin();
			qQuhdr = quhdr.createQuery(hdrkeyKL("Quhdr"), Quhdr.class);
			rQuhdrList = qQuhdr.getResultList();
			if (rQuhdrList.size() >= 1) {
				rQuhdr = new Quhdr();
				rQuhdrFOUND = true;
				rQuhdrEOF = false;
			} else {
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
			}
			rQuhdrPOS = -1;
			quhdr.getTransaction().commit();
		} catch (Exception e) {
			quhdr.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdrFOUND = false;
		rQuhdrEOF = true;
		while (rQuhdrPOS < rQuhdrList.size() || rQuhdrFOUND) {
			rQuhdr = rQuhdrList.get(++rQuhdrPOS);
				if (Objects.equals(String.valueOf(rQuhdr.getQuent()), String.valueOf(rQudtl.getQdent())) && Objects.equals(String.valueOf(rQuhdr.getQuacct()), String.valueOf(rQufdtlla.getFdmms())) && Objects.equals(String.valueOf(rQuhdr.getQuseq()), String.valueOf(rQufdtlla.getFdseq()))) {
				rQuhdrFOUND = true;
				rQuhdrEOF = false;
			} else {
				rQuhdrFOUND = false;
				rQuhdrEOF = true;
			}

		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void VALIDSR () {
	// SETLL
	try {
		pkgcombf.getTransaction().begin();
		qPkgcombf = pkgcombf.createQuery(key001KL("Pkgcombf"), Pkgcombf.class);
		rPkgcombfList = qPkgcombf.getResultList();
		if (rPkgcombfList.size() >= 1) {
			rPkgcombf = new Pkgcombf();
			rPkgcombfFOUND = true;
			rPkgcombfEOF = false;
		} else {
			rPkgcombfFOUND = false;
			rPkgcombfEOF = true;
		}
		rPkgcombfPOS = -1;
		pkgcombf.getTransaction().commit();
	} catch (Exception e) {
		pkgcombf.getTransaction().rollback();
	e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// READE
	rPkgcombfFOUND = false;
	rPkgcombfEOF = true;
	while (rPkgcombfPOS < rPkgcombfList.size() || rPkgcombfFOUND) {
		rPkgcombf = rPkgcombfList.get(++rPkgcombfPOS);
			if (Objects.equals(String.valueOf(rPkgcombf.getPkpkg()), String.valueOf(rSh200sfm.getCbpkg()))) {
			rPkgcombfFOUND = true;
			rPkgcombfEOF = false;
		} else {
			rPkgcombfFOUND = false;
			rPkgcombfEOF = true;
		}

	}
	//DOW
	while (! rPkgcombfEOF) {
		// IF STATEMENT
		if (IN30 == false  && ldadsDS.lqsrc().compareTo(" ") != 0 && ldadsDS.lqsrc().compareTo(rPkgcombf.getPkqsrc()) == 0) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(37)));
			// EVAL
			// EVAL
			//LEAVESR
			return;
		// ENDIF
		}
		// IF STATEMENT
		if (IN30 == false  && ldadsDS.lpromo().compareTo(" ") != 0 && ldadsDS.lpromo().compareTo(rPkgcombf.getPkprom()) == 0) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(38)));
			// EVAL
			// EVAL
			//LEAVESR
			return;
		// ENDIF
		}
		// IF STATEMENT
		if (IN30 == false  && ldadsDS.lscod().compareTo(" ") != 0  && ldadsDS.lscod().compareTo(rPkgcombf.getPkgmed()) == 0) {
			//ADD
			RRNZ = RRNZ + 1;
			// MOVE
			rSh200sfm.setSzerrm(String.valueOf(ERR.get(39)));
			// EVAL
			// EVAL
			//LEAVESR
			return;
		// ENDIF
		}
		// READE
		rPkgcombfFOUND = false;
		rPkgcombfEOF = true;
		while (rPkgcombfPOS < rPkgcombfList.size() || rPkgcombfFOUND) {
			rPkgcombf = rPkgcombfList.get(++rPkgcombfPOS);
					if (Objects.equals(String.valueOf(rPkgcombf.getPkpkg()), String.valueOf(rSh200sfm.getCbpkg()))) {
				rPkgcombfFOUND = true;
				rPkgcombfEOF = false;
			} else {
				rPkgcombfFOUND = false;
				rPkgcombfEOF = true;
			}

		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void ASLPVAL () {
	// EVAL
	AADIS = String.valueOf("N");
	// IF STATEMENT
	if (rSh200sfm.getCbst().compareTo(" ") != 0) {
		// EVAL
		SLSTRR = String.valueOf(rSh200sfm.getCaterr());
		// CHAIN SETLL
		try {
			promst.getTransaction().begin();
			qPromst = promst.createQuery(pslsk2KL("Promst"), Promst.class);
			rPromstList = qPromst.getResultList();
			if (rPromstList.size() >= 1) {
				rPromst = new Promst();
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}
			rPromstPOS = -1;
			promst.getTransaction().commit();
		} catch (Exception e) {
			promst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPromstFOUND = false;
		rPromstEOF = true;
		while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
			rPromst = rPromstList.get(++rPromstPOS);
				if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf($$PROM))) {
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}

		}
		// IF STATEMENT
		if (rPromstFOUND) {
			// CHAIN SETLL
			try {
				prosls.getTransaction().begin();
				qProsls = prosls.createQuery(pslsk2KL("Prosls"), Prosl.class);
				rProslsList = qProsls.getResultList();
				if (rProslsList.size() >= 1) {
					rProsls = new Prosl();
					rProslsFOUND = true;
					rProslsEOF = false;
				} else {
					rProslsFOUND = false;
					rProslsEOF = true;
				}
				rProslsPOS = -1;
				prosls.getTransaction().commit();
			} catch (Exception e) {
				prosls.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProslsFOUND = false;
			rProslsEOF = true;
			while (rProslsPOS < rProslsList.size() || rProslsFOUND) {
				rProsls = rProslsList.get(++rProslsPOS);
						if (Objects.equals(String.valueOf(rProsls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rProsls.getPpromo()), String.valueOf($$PROM))) {
					rProslsFOUND = true;
					rProslsEOF = false;
				} else {
					rProslsFOUND = false;
					rProslsEOF = true;
				}

			}
			// IF STATEMENT
			if (rProslsFOUND) {
				// CHAIN SETLL
				try {
					prosls.getTransaction().begin();
					qProsls = prosls.createQuery(pslsk3KL("Prosls"), Prosl.class);
					rProslsList = qProsls.getResultList();
					if (rProslsList.size() >= 1) {
						rProsls = new Prosl();
						rProslsFOUND = true;
						rProslsEOF = false;
					} else {
						rProslsFOUND = false;
						rProslsEOF = true;
					}
					rProslsPOS = -1;
					prosls.getTransaction().commit();
				} catch (Exception e) {
					prosls.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rProslsFOUND = false;
				rProslsEOF = true;
				while (rProslsPOS < rProslsList.size() || rProslsFOUND) {
					rProsls = rProslsList.get(++rProslsPOS);
								if (Objects.equals(String.valueOf(rProsls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rProsls.getPpromo()), String.valueOf($$PROM)) && Objects.equals(String.valueOf(rProsls.getPslstp()), String.valueOf(rSh200sfm.getCbst()))) {
						rProslsFOUND = true;
						rProslsEOF = false;
					} else {
						rProslsFOUND = false;
						rProslsEOF = true;
					}

				}
				// IF STATEMENT
				if (rProslsFOUND) {
					// EVAL
					AADIS = String.valueOf("Y");
				// ENDIF
				}
			// ELSE
			} else {
				// EVAL
				AADIS = String.valueOf("Y");
			// ENDIF
			}
		// ELSE
		} else {
			// EVAL
			SLSTRR = String.valueOf("99999999");
			// CHAIN SETLL
			try {
				promst.getTransaction().begin();
				qPromst = promst.createQuery(pslsk2KL("Promst"), Promst.class);
				rPromstList = qPromst.getResultList();
				if (rPromstList.size() >= 1) {
					rPromst = new Promst();
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}
				rPromstPOS = -1;
				promst.getTransaction().commit();
			} catch (Exception e) {
				promst.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPromstFOUND = false;
			rPromstEOF = true;
			while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
				rPromst = rPromstList.get(++rPromstPOS);
						if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf($$PROM))) {
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}

			}
			// IF STATEMENT
			if (rPromstFOUND) {
				// CHAIN SETLL
				try {
					prosls.getTransaction().begin();
					qProsls = prosls.createQuery(pslsk2KL("Prosls"), Prosl.class);
					rProslsList = qProsls.getResultList();
					if (rProslsList.size() >= 1) {
						rProsls = new Prosl();
						rProslsFOUND = true;
						rProslsEOF = false;
					} else {
						rProslsFOUND = false;
						rProslsEOF = true;
					}
					rProslsPOS = -1;
					prosls.getTransaction().commit();
				} catch (Exception e) {
					prosls.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rProslsFOUND = false;
				rProslsEOF = true;
				while (rProslsPOS < rProslsList.size() || rProslsFOUND) {
					rProsls = rProslsList.get(++rProslsPOS);
								if (Objects.equals(String.valueOf(rProsls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rProsls.getPpromo()), String.valueOf($$PROM))) {
						rProslsFOUND = true;
						rProslsEOF = false;
					} else {
						rProslsFOUND = false;
						rProslsEOF = true;
					}

				}
				// IF STATEMENT
				if (rProslsFOUND) {
					// CHAIN SETLL
					try {
						prosls.getTransaction().begin();
						qProsls = prosls.createQuery(pslsk3KL("Prosls"), Prosl.class);
						rProslsList = qProsls.getResultList();
						if (rProslsList.size() >= 1) {
							rProsls = new Prosl();
							rProslsFOUND = true;
							rProslsEOF = false;
						} else {
							rProslsFOUND = false;
							rProslsEOF = true;
						}
						rProslsPOS = -1;
						prosls.getTransaction().commit();
					} catch (Exception e) {
						prosls.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rProslsFOUND = false;
					rProslsEOF = true;
					while (rProslsPOS < rProslsList.size() || rProslsFOUND) {
						rProsls = rProslsList.get(++rProslsPOS);
										if (Objects.equals(String.valueOf(rProsls.getPterr()), String.valueOf(SLSTRR)) && Objects.equals(String.valueOf(rProsls.getPpromo()), String.valueOf($$PROM)) && Objects.equals(String.valueOf(rProsls.getPslstp()), String.valueOf(rSh200sfm.getCbst()))) {
							rProslsFOUND = true;
							rProslsEOF = false;
						} else {
							rProslsFOUND = false;
							rProslsEOF = true;
						}

					}
					// IF STATEMENT
					if (rProslsFOUND) {
						// EVAL
						AADIS = String.valueOf("Y");
					// ENDIF
					}
				// ELSE
				} else {
					// EVAL
					AADIS = String.valueOf("Y");
				// ENDIF
				}
			// ELSE
			} else {
				// EVAL
				AADIS = String.valueOf("Y");
			// ENDIF
			}
		// ENDIF
		}
	// ELSE
	} else {
		// EVAL
		AADIS = String.valueOf("Y");
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void ATRIPC () {
	// EVAL
	//EXSR
	APHNDS();
	// CHAIN SETLL
	try {
		qutrip.getTransaction().begin();
		qQutrip = qutrip.createQuery(qtripkKL("Qutrip"), Qutrip.class);
		rQutripList = qQutrip.getResultList();
		if (rQutripList.size() >= 1) {
			rQutrip = new Qutrip();
			rQutripFOUND = true;
			rQutripEOF = false;
		} else {
			rQutripFOUND = false;
			rQutripEOF = true;
		}
		rQutripPOS = -1;
		qutrip.getTransaction().commit();
	} catch (Exception e) {
		qutrip.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQutripFOUND = false;
	rQutripEOF = true;
	while (rQutripPOS < rQutripList.size() || rQutripFOUND) {
		rQutrip = rQutripList.get(++rQutripPOS);
		if (Objects.equals(String.valueOf(rQutrip.getTuacct()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rQutrip.getTuseq()), String.valueOf(rQufdtl.getFdseq()))) {
			rQutripFOUND = true;
			rQutripEOF = false;
		} else {
			rQutripFOUND = false;
			rQutripEOF = true;
		}

	}
	// IF STATEMENT
	if (rQutripFOUND && rQutrip.getTsflag().compareTo(" ") != 0) {
		//LEAVESR
		return;
	// ENDIF
	}
	// EVAL
	$ADSCA = Float.valueOf(String.valueOf(0));
	// EVAL
	SLSTP = String.valueOf(" ");
	// EVAL
	VALIDATE = "0";
	// IF STATEMENT
	if (INSL) {
		// CHAIN SETLL
		try {
			quhdre.getTransaction().begin();
			qQuhdre = quhdre.createQuery(qtripkKL("Quhdre"), Quhdre.class);
			rQuhdreList = qQuhdre.getResultList();
			if (rQuhdreList.size() >= 1) {
				rQuhdre = new Quhdre();
				rQuhdreFOUND = true;
				rQuhdreEOF = false;
			} else {
				rQuhdreFOUND = false;
				rQuhdreEOF = true;
			}
			rQuhdrePOS = -1;
			quhdre.getTransaction().commit();
		} catch (Exception e) {
			quhdre.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdreFOUND = false;
		rQuhdreEOF = true;
		while (rQuhdrePOS < rQuhdreList.size() || rQuhdreFOUND) {
			rQuhdre = rQuhdreList.get(++rQuhdrePOS);
				if (Objects.equals(String.valueOf(rQuhdre.getQuemms()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rQuhdre.getQueseq()), String.valueOf(rQufdtl.getFdseq()))) {
				rQuhdreFOUND = true;
				rQuhdreEOF = false;
			} else {
				rQuhdreFOUND = false;
				rQuhdreEOF = true;
			}

		}
		// EVAL
		SLSTP = String.valueOf(rQuhdre.getQuslty());
		// EVAL
		$ADSCA = Float.valueOf(String.valueOf($FDBAL + rQuhdr.getQuperm()));
	// ELSE
	} else {
		// EVAL
		SLSTP = String.valueOf(rSh200sfm.getCbst());
		// EVAL
		PKGCD = String.valueOf(rSh200sfm.getCbpkg());
		// IF STATEMENT
		if (rSh200sfm.getCbnegp() > 0) {
			// EVAL
			$ADSCA = Float.valueOf(String.valueOf(rSh200sfm.getCbnegp() + rSh200sfm.getCbperm()));
		// ELSE
		} else {
			// EVAL
			$ADSCA = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad() + rSh200sfm.getCbperm()));
		// ENDIF
		}
	// ENDIF
	}
	// CHAIN SETLL
	try {
		auxadrla.getTransaction().begin();
		qAuxadrla = auxadrla.createQuery("select c from Auxadrla c where c.AAMMS = '"+ldadsDS.lmms()+"'", Auxadrla.class);
		rAuxadrlaList = qAuxadrla.getResultList();
		if (rAuxadrlaList.size() >= 1) {
			rAuxadrla = new Auxadrla();
			rAuxadrlaFOUND = true;
			rAuxadrlaEOF = false;
		} else {
			rAuxadrlaFOUND = false;
			rAuxadrlaEOF = true;
		}
		rAuxadrlaPOS = -1;
		auxadrla.getTransaction().commit();
	} catch (Exception e) {
		auxadrla.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rAuxadrlaFOUND = false;
	rAuxadrlaEOF = true;
	while (rAuxadrlaPOS < rAuxadrlaList.size() || rAuxadrlaFOUND) {
		rAuxadrla = rAuxadrlaList.get(++rAuxadrlaPOS);
		if (Objects.equals(String.valueOf(rAuxadrla.getAamms()), String.valueOf(ldadsDS.lmms()))) {
			rAuxadrlaFOUND = true;
			rAuxadrlaEOF = false;
		} else {
			rAuxadrlaFOUND = false;
			rAuxadrlaEOF = true;
		}

	}
	// EVAL
	$TRIPA = Float.valueOf(String.valueOf(0));
	// EVAL
	rSh200sfm.setRtamt( Float.valueOf(String.valueOf($TRIPA)));
	// IF STATEMENT
	if (VALIDATE.compareTo("0") == 0) {
		//EXSR
		ATRIPS();
	// ENDIF
	}
	// EVAL
	rSh200sfm.setRtamt( Float.valueOf(String.valueOf($TRIPA)));
	// IF STATEMENT
	if (VALIDATE.compareTo("1") == 0 && (INKJ == true  || rSh200sfm.getRcysno().compareTo("Y") == 0 || (INKJ == false  && INSL == true  && rSh200sfm.getSaoptn().compareTo("F") == 0) || INKR == true )) {
		// CHAIN SETLL
		try {
			mktadd.getTransaction().begin();
			qMktadd = mktadd.createQuery("select c from Mktadd c where c.MKMMS = '"+ldadsDS.lmms()+"'", Mktadd.class);
			rMktaddList = qMktadd.getResultList();
			if (rMktaddList.size() >= 1) {
				rMktadd = new Mktadd();
				rMktaddFOUND = true;
				rMktaddEOF = false;
			} else {
				rMktaddFOUND = false;
				rMktaddEOF = true;
			}
			rMktaddPOS = -1;
			mktadd.getTransaction().commit();
		} catch (Exception e) {
			mktadd.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rMktaddFOUND = false;
		rMktaddEOF = true;
		while (rMktaddPOS < rMktaddList.size() || rMktaddFOUND) {
			rMktadd = rMktaddList.get(++rMktaddPOS);
				if (Objects.equals(String.valueOf(rMktadd.getMkmms()), String.valueOf(ldadsDS.lmms()))) {
				rMktaddFOUND = true;
				rMktaddEOF = false;
			} else {
				rMktaddFOUND = false;
				rMktaddEOF = true;
			}

		}
		// IF STATEMENT
		if (rMktaddFOUND) {
			// CHAIN SETLL
			try {
				market.getTransaction().begin();
				qMarket = market.createQuery("select c from Market c where c.MMMSNO = '"+ldadsDS.lmms()+"'", Market.class);
				rMarketList = qMarket.getResultList();
				if (rMarketList.size() >= 1) {
					rMarket = new Market();
					rMarketFOUND = true;
					rMarketEOF = false;
				} else {
					rMarketFOUND = false;
					rMarketEOF = true;
				}
				rMarketPOS = -1;
				market.getTransaction().commit();
			} catch (Exception e) {
				market.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rMarketFOUND = false;
			rMarketEOF = true;
			while (rMarketPOS < rMarketList.size() || rMarketFOUND) {
				rMarket = rMarketList.get(++rMarketPOS);
						if (Objects.equals(String.valueOf(rMarket.getMmmsno()), String.valueOf(ldadsDS.lmms()))) {
					rMarketFOUND = true;
					rMarketEOF = false;
				} else {
					rMarketFOUND = false;
					rMarketEOF = true;
				}

			}
			// CHAIN SETLL
			try {
				auxadrla.getTransaction().begin();
				qAuxadrla = auxadrla.createQuery("select c from Auxadrla c where c.AAMMS = '"+ldadsDS.lmms()+"'", Auxadrla.class);
				rAuxadrlaList = qAuxadrla.getResultList();
				if (rAuxadrlaList.size() >= 1) {
					rAuxadrla = new Auxadrla();
					rAuxadrlaFOUND = true;
					rAuxadrlaEOF = false;
				} else {
					rAuxadrlaFOUND = false;
					rAuxadrlaEOF = true;
				}
				rAuxadrlaPOS = -1;
				auxadrla.getTransaction().commit();
			} catch (Exception e) {
				auxadrla.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rAuxadrlaFOUND = false;
			rAuxadrlaEOF = true;
			while (rAuxadrlaPOS < rAuxadrlaList.size() || rAuxadrlaFOUND) {
				rAuxadrla = rAuxadrlaList.get(++rAuxadrlaPOS);
						if (Objects.equals(String.valueOf(rAuxadrla.getAamms()), String.valueOf(ldadsDS.lmms()))) {
					rAuxadrlaFOUND = true;
					rAuxadrlaEOF = false;
				} else {
					rAuxadrlaFOUND = false;
					rAuxadrlaEOF = true;
				}

			}
			// EVAL
			rSh200sfm.setRbname( String.valueOf(rMarket.getMlname().trim()+","+ rMarket.getMfname().trim()));
			// EVAL
			rSh200sfm.setRadd1( String.valueOf(rAuxadrla.getAaadd1()));
			// EVAL
			rSh200sfm.setRadd2( String.valueOf(rAuxadrla.getAaadd2()));
			// EVAL
			rSh200sfm.setRcity( String.valueOf(rAuxadrla.getAacity()));
			// EVAL
			rSh200sfm.setRstate( String.valueOf(rAuxadrla.getAast()));
			// EVAL
			rSh200sfm.setRzipcd( String.valueOf(rAuxadrla.getAazip()));
			// EVAL
			rSh200sfm.setRcustn( String.valueOf(rMarket.getMphone()));
		// ENDIF
		}
		// MOVE
		CDATE = String.valueOf(new Date());
		// EVAL
		rSh200sfm.setRchgdt( Integer.valueOf(String.valueOf(Integer.parseInt(CDATE.substring(0, 4) + CDATE.substring(6, 8)))));
		// EVAL
		rSh200sfm.setRcaldt( Integer.valueOf(String.valueOf(rSh200sfm.getRchgdt())));
		// EVAL
		rSh200sfm.setRcustn( String.valueOf(rMarket.getMphone()));
		// EVAL
		rSh200sfm.setRamdue( Float.valueOf(String.valueOf($ADSCA - rSh200sfm.getRtamt())));
		// EVAL
		rSh200sfm.setRrpmsg( String.valueOf(" "));
		// EVAL
		rSh200sfm.setRcustn( String.valueOf("800-238-2727"));
		// EVAL
		$MDATA = " ";
		// EVAL
		$POS3 = Integer.valueOf(String.valueOf($MDATA.indexOf("$")));
		// EVAL
		$POS4 = Integer.valueOf(String.valueOf($POS3/70));
		// EVAL
		$POS4 = Integer.valueOf(String.valueOf($POS4*70));
		// EVAL
		$POS3 = Integer.valueOf(String.valueOf($POS3-$POS4));
		// EVAL
		$POS4 = Integer.valueOf(String.valueOf($POS4+1));
		// IF STATEMENT
		if ($POS3 > 0) {
		decfmt = new DecimalFormat("       0.  ");
			// EVAL
			$MDATA = $MDATA.substring(0, $POS4-1) + $MDATA.substring($POS4-1, $POS3+$POS4-1) + decfmt.format($TRIPA).trim() + $MDATA.substring($POS3+$POS4-1,  70 - $POS3-1+$POS3+$POS4-1) + $MDATA.substring( 69, $MDATA.length());
		// ENDIF
		}
		// EVAL
		rSh200sfm.setRmsg1( String.valueOf($MDATA.substring(0, 70)));
		// EVAL
		rSh200sfm.setRmsg2( String.valueOf($MDATA.substring(70, 140)));
		// EVAL
		rSh200sfm.setRmsg3( String.valueOf($MDATA.substring(140, 210)));
		// EVAL
		rSh200sfm.setRmsg4( String.valueOf($MDATA.substring(210, 280)));
		// EVAL
		rSh200sfm.setRmsg5( String.valueOf($MDATA.substring(280, 350)));
		// EVAL
		rSh200sfm.setRmsg6( String.valueOf($MDATA.substring(350, 420)));
		// EVAL
		rSh200sfm.setRmsg7( String.valueOf($MDATA.substring(420, 490)));
		//DOU
		do {
			//LEAVE
			if (IN03) {
			break;
			}
			// IF STATEMENT
			if (rSh200sfm.getRrpmsg().compareTo(" ") == 0 && IN03 == false  && ! INKR) {
				//EXSR
				ATRIPS();
				//LEAVE
				break;
			// ENDIF
			}
		//ENDDO
		} while (! IN03);
		// IF STATEMENT
		if (IN03 == true) {
			// IF STATEMENT
			if (INSL == true) {
				// EVAL
				// EVAL
				rSh200sfm.setIn85( String.valueOf(INFI));
				// EVAL
				$FFLAG = Integer.valueOf(String.valueOf(0));
				// EVAL
				rSh200sfm.setSaoptn( String.valueOf(" "));
				// EVAL
			// ENDIF
			}
			// EVAL
			// EVAL
			PKGCD = String.valueOf(" ");
		// ENDIF
		}
	// ENDIF
	}
	// EVAL
	// EVAL
	// EVAL
	// EVAL
	//ENDSR
	}
	
//BEGSR
	public static void ATRIPS () {
	//MULT
	Calendar calendar = Calendar.getInstance();
	WRKDT0 = (int) (Integer.valueOf(String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf(calendar.get(Calendar.MONTH)+1) + String.valueOf(calendar.get(Calendar.DAY_OF_MONTH))) * 10000.0001);
	// CHAIN SETLL
	try {
		qutrip.getTransaction().begin();
		qQutrip = qutrip.createQuery(qtrip2KL("Qutrip"), Qutrip.class);
		rQutripList = qQutrip.getResultList();
		if (rQutripList.size() >= 1) {
			rQutrip = new Qutrip();
			rQutripFOUND = true;
			rQutripEOF = false;
		} else {
			rQutripFOUND = false;
			rQutripEOF = true;
		}
		rQutripPOS = -1;
		qutrip.getTransaction().commit();
	} catch (Exception e) {
		qutrip.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQutripFOUND = false;
	rQutripEOF = true;
	while (rQutripPOS < rQutripList.size() || rQutripFOUND) {
		rQutrip = rQutripList.get(++rQutripPOS);
		if (Objects.equals(String.valueOf(rQutrip.getTuacct()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rQutrip.getTuseq()), String.valueOf(rQufdtl.getFdseq()))) {
			rQutripFOUND = true;
			rQutripEOF = false;
		} else {
			rQutripFOUND = false;
			rQutripEOF = true;
		}

	}
	// IF STATEMENT
	if (rQutripFOUND) {
		// EVAL
		rQutrip.setTamt( Float.valueOf(String.valueOf(rSh200sfm.getRtamt())));
		// EVAL
		rQutrip.setTadsca( Float.valueOf(String.valueOf($ADSCA)));
		// EVAL
		rQutrip.setTuser( String.valueOf(ldadsDS.luser()));
		// EVAL
		rQutrip.setTcldat( String.valueOf(String.valueOf(WRKDT0)));
		// EVAL
		rQutrip.setTcdate( String.valueOf(String.valueOf(WRKDT0)));
		// EVAL
		rQutrip.setTutime($TTIME);
		// IF STATEMENT
		if (VALIDATE.compareTo("0") == 0) {
			// EVAL
			rQutrip.setTaflag( String.valueOf("N"));
		// ELSE
		} else {
			// EVAL
			rQutrip.setTaflag( String.valueOf("Y"));
		// ENDIF
		}
		// EVAL
		rQutrip.setTsflag( String.valueOf(" "));
		// UPDATE
		try {
			qutrip.getTransaction().begin();
			qutrip.getTransaction().commit();
		} catch (Exception e) {
			qutrip.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ELSE
	} else {
		// EVAL
		rQutrip.setTuacct( String.valueOf(ldadsDS.lmms()));
		// EVAL
		rQutrip.setTadsca( Float.valueOf(String.valueOf($ADSCA)));
		// EVAL
		rQutrip.setTuseq( Integer.valueOf(String.valueOf(rQufdtl.getFdseq())));
		// EVAL
		rQutrip.setTamt( Float.valueOf(String.valueOf(rSh200sfm.getRtamt())));
		// EVAL
		rQutrip.setTuser( String.valueOf(ldadsDS.luser()));
		// EVAL
		rQutrip.setTcldat( String.valueOf(String.valueOf(WRKDT0)));
		// EVAL
		rQutrip.setTcdate( String.valueOf(String.valueOf(WRKDT0)));
		// EVAL
		rQutrip.setTutime($TTIME);
		// IF STATEMENT
		if (VALIDATE.compareTo("0") == 0) {
			// EVAL
			rQutrip.setTaflag( String.valueOf("N"));
		// ELSE
		} else {
			// EVAL
			rQutrip.setTaflag( String.valueOf("Y"));
		// ENDIF
		}
		// EVAL
		rQutrip.setTsflag( String.valueOf(" "));
		// EVAL
		rQutrip.setTfflag( String.valueOf(" "));
		// EVAL
		rQutrip.setTrflag( String.valueOf(" "));
		// WRITE
		try {
			qutrip.getTransaction().begin();
			qutrip.persist(rQutrip);
			qutrip.getTransaction().commit();
		} catch (Exception e) {
			qutrip.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void AQSRCVAL () {
	// EVAL
	AQSRC = String.valueOf("N");
	// IF STATEMENT
	if ($QPROM.compareTo(" ") != 0 && rMktadd.getMkdsr2().compareTo(" ") != 0) {
		// EVAL
		QSRTRR = String.valueOf(rSh200sfm.getCaterr());
		// CHAIN SETLL
		try {
			promst.getTransaction().begin();
			qPromst = promst.createQuery(prqsrcKL("Promst"), Promst.class);
			rPromstList = qPromst.getResultList();
			if (rPromstList.size() >= 1) {
				rPromst = new Promst();
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}
			rPromstPOS = -1;
			promst.getTransaction().commit();
		} catch (Exception e) {
			promst.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPromstFOUND = false;
		rPromstEOF = true;
		while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
			rPromst = rPromstList.get(++rPromstPOS);
				if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(QSRTRR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf($QPROM))) {
				rPromstFOUND = true;
				rPromstEOF = false;
			} else {
				rPromstFOUND = false;
				rPromstEOF = true;
			}

		}
		// IF STATEMENT
		if (rPromstFOUND) {
			// CHAIN SETLL
			try {
				proqsrc.getTransaction().begin();
				qProqsrc = proqsrc.createQuery(prqsrcKL("Proqsrc"), Proqsrc.class);
				rProqsrcList = qProqsrc.getResultList();
				if (rProqsrcList.size() >= 1) {
					rProqsrc = new Proqsrc();
					rProqsrcFOUND = true;
					rProqsrcEOF = false;
				} else {
					rProqsrcFOUND = false;
					rProqsrcEOF = true;
				}
				rProqsrcPOS = -1;
				proqsrc.getTransaction().commit();
			} catch (Exception e) {
				proqsrc.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rProqsrcFOUND = false;
			rProqsrcEOF = true;
			while (rProqsrcPOS < rProqsrcList.size() || rProqsrcFOUND) {
				rProqsrc = rProqsrcList.get(++rProqsrcPOS);
						if (Objects.equals(String.valueOf(rProqsrc.getPterr()), String.valueOf(QSRTRR)) && Objects.equals(String.valueOf(rProqsrc.getPpromo()), String.valueOf($QPROM))) {
					rProqsrcFOUND = true;
					rProqsrcEOF = false;
				} else {
					rProqsrcFOUND = false;
					rProqsrcEOF = true;
				}

			}
			// IF STATEMENT
			if (rProqsrcFOUND) {
				// CHAIN SETLL
				try {
					proqsrc.getTransaction().begin();
					qProqsrc = proqsrc.createQuery(prqsrc1KL("Proqsrc"), Proqsrc.class);
					rProqsrcList = qProqsrc.getResultList();
					if (rProqsrcList.size() >= 1) {
						rProqsrc = new Proqsrc();
						rProqsrcFOUND = true;
						rProqsrcEOF = false;
					} else {
						rProqsrcFOUND = false;
						rProqsrcEOF = true;
					}
					rProqsrcPOS = -1;
					proqsrc.getTransaction().commit();
				} catch (Exception e) {
					proqsrc.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rProqsrcFOUND = false;
				rProqsrcEOF = true;
				while (rProqsrcPOS < rProqsrcList.size() || rProqsrcFOUND) {
					rProqsrc = rProqsrcList.get(++rProqsrcPOS);
								if (Objects.equals(String.valueOf(rProqsrc.getPterr()), String.valueOf(QSRTRR)) && Objects.equals(String.valueOf(rProqsrc.getPpromo()), String.valueOf($QPROM)) && Objects.equals(String.valueOf(rProqsrc.getPqssrc()), String.valueOf(rMktadd.getMkdsr2()))) {
						rProqsrcFOUND = true;
						rProqsrcEOF = false;
					} else {
						rProqsrcFOUND = false;
						rProqsrcEOF = true;
					}

				}
				// IF STATEMENT
				if (rProqsrcFOUND) {
					// EVAL
					AQSRC = String.valueOf("Y");
				// ENDIF
				}
			// ELSE
			} else {
				// EVAL
				AQSRC = String.valueOf("Y");
			// ENDIF
			}
		// ELSE
		} else {
			// EVAL
			QSRTRR = String.valueOf("99999999");
			// CHAIN SETLL
			try {
				promst.getTransaction().begin();
				qPromst = promst.createQuery(prqsrcKL("Promst"), Promst.class);
				rPromstList = qPromst.getResultList();
				if (rPromstList.size() >= 1) {
					rPromst = new Promst();
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}
				rPromstPOS = -1;
				promst.getTransaction().commit();
			} catch (Exception e) {
				promst.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPromstFOUND = false;
			rPromstEOF = true;
			while (rPromstPOS < rPromstList.size() || rPromstFOUND) {
				rPromst = rPromstList.get(++rPromstPOS);
						if (Objects.equals(String.valueOf(rPromst.getPmterr()), String.valueOf(QSRTRR)) && Objects.equals(String.valueOf(rPromst.getPmcode()), String.valueOf($QPROM))) {
					rPromstFOUND = true;
					rPromstEOF = false;
				} else {
					rPromstFOUND = false;
					rPromstEOF = true;
				}

			}
			// IF STATEMENT
			if (rPromstFOUND) {
				// CHAIN SETLL
				try {
					proqsrc.getTransaction().begin();
					qProqsrc = proqsrc.createQuery(prqsrcKL("Proqsrc"), Proqsrc.class);
					rProqsrcList = qProqsrc.getResultList();
					if (rProqsrcList.size() >= 1) {
						rProqsrc = new Proqsrc();
						rProqsrcFOUND = true;
						rProqsrcEOF = false;
					} else {
						rProqsrcFOUND = false;
						rProqsrcEOF = true;
					}
					rProqsrcPOS = -1;
					proqsrc.getTransaction().commit();
				} catch (Exception e) {
					proqsrc.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rProqsrcFOUND = false;
				rProqsrcEOF = true;
				while (rProqsrcPOS < rProqsrcList.size() || rProqsrcFOUND) {
					rProqsrc = rProqsrcList.get(++rProqsrcPOS);
								if (Objects.equals(String.valueOf(rProqsrc.getPterr()), String.valueOf(QSRTRR)) && Objects.equals(String.valueOf(rProqsrc.getPpromo()), String.valueOf($QPROM))) {
						rProqsrcFOUND = true;
						rProqsrcEOF = false;
					} else {
						rProqsrcFOUND = false;
						rProqsrcEOF = true;
					}

				}
				// IF STATEMENT
				if (rProqsrcFOUND) {
					// CHAIN SETLL
					try {
						proqsrc.getTransaction().begin();
						qProqsrc = proqsrc.createQuery(prqsrc1KL("Proqsrc"), Proqsrc.class);
						rProqsrcList = qProqsrc.getResultList();
						if (rProqsrcList.size() >= 1) {
							rProqsrc = new Proqsrc();
							rProqsrcFOUND = true;
							rProqsrcEOF = false;
						} else {
							rProqsrcFOUND = false;
							rProqsrcEOF = true;
						}
						rProqsrcPOS = -1;
						proqsrc.getTransaction().commit();
					} catch (Exception e) {
						proqsrc.getTransaction().rollback();
						e.printStackTrace();
					}
					finally{
						emf.close();
					}
					// CHAIN READE
					rProqsrcFOUND = false;
					rProqsrcEOF = true;
					while (rProqsrcPOS < rProqsrcList.size() || rProqsrcFOUND) {
						rProqsrc = rProqsrcList.get(++rProqsrcPOS);
										if (Objects.equals(String.valueOf(rProqsrc.getPterr()), String.valueOf(QSRTRR)) && Objects.equals(String.valueOf(rProqsrc.getPpromo()), String.valueOf($QPROM)) && Objects.equals(String.valueOf(rProqsrc.getPqssrc()), String.valueOf(rMktadd.getMkdsr2()))) {
							rProqsrcFOUND = true;
							rProqsrcEOF = false;
						} else {
							rProqsrcFOUND = false;
							rProqsrcEOF = true;
						}

					}
					// IF STATEMENT
					if (rProqsrcFOUND) {
						// EVAL
						AQSRC = String.valueOf("Y");
					// ENDIF
					}
				// ELSE
				} else {
					// EVAL
					AQSRC = String.valueOf("Y");
				// ENDIF
				}
			// ELSE
			} else {
				// EVAL
				AQSRC = String.valueOf("Y");
			// ENDIF
			}
		// ENDIF
		}
	// ELSE
	} else {
		// EVAL
		AQSRC = String.valueOf("Y");
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void APHNDS () {
	// EVAL
	$QUSEQ = Integer.valueOf(String.valueOf(rQuhdr.getQuseq()));
	// IF STATEMENT
	if (rSh200sfm.getCbnegp() > 0) {
		// EVAL
		$ADSCP = Float.valueOf(String.valueOf(rSh200sfm.getCbnegp()));
	// ELSE
	} else {
		// EVAL
		$ADSCP = Float.valueOf(String.valueOf(rSh200sfm.getCbb$ad()));
	// ENDIF
	}
	// IF STATEMENT
	if (INSL && rSh200sfm.getSaoptn().compareTo("F") == 0) {
		// CHAIN SETLL
		try {
			quhdre.getTransaction().begin();
			qQuhdre = quhdre.createQuery(qtripkKL("Quhdre"), Quhdre.class);
			rQuhdreList = qQuhdre.getResultList();
			if (rQuhdreList.size() >= 1) {
				rQuhdre = new Quhdre();
				rQuhdreFOUND = true;
				rQuhdreEOF = false;
			} else {
				rQuhdreFOUND = false;
				rQuhdreEOF = true;
			}
			rQuhdrePOS = -1;
			quhdre.getTransaction().commit();
		} catch (Exception e) {
			quhdre.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuhdreFOUND = false;
		rQuhdreEOF = true;
		while (rQuhdrePOS < rQuhdreList.size() || rQuhdreFOUND) {
			rQuhdre = rQuhdreList.get(++rQuhdrePOS);
				if (Objects.equals(String.valueOf(rQuhdre.getQuemms()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rQuhdre.getQueseq()), String.valueOf(rQufdtl.getFdseq()))) {
				rQuhdreFOUND = true;
				rQuhdreEOF = false;
			} else {
				rQuhdreFOUND = false;
				rQuhdreEOF = true;
			}

		}
		// EVAL
		$QUSEQ = Integer.valueOf(String.valueOf(rQufdtl.getFdseq()));
		// EVAL
		rSh200sfm.setCbst( String.valueOf(rQuhdre.getQuslty()));
		// EVAL
		rSh200sfm.setCbpkg( String.valueOf(PKGCD));
		// EVAL
		$ADSCP = $FDBAL;
	// ENDIF
	}
	// EVAL
	$PHNDP = Float.valueOf(String.valueOf(0));
	// EVAL
	VALIDATE = String.valueOf(false);
	// IF STATEMENT
	if (VALIDATE.compareTo("1") == 0) {
		// EVAL
		$MSGID = String.valueOf("PHNDPMSG");
		// CHAIN SETLL
		try {
			quphnd.getTransaction().begin();
			qQuphnd = quphnd.createQuery(qphnd1KL("Quphnd"), Quphnd.class);
			rQuphndList = qQuphnd.getResultList();
			if (rQuphndList.size() >= 1) {
				rQuphnd = new Quphnd();
				rQuphndFOUND = true;
				rQuphndEOF = false;
			} else {
				rQuphndFOUND = false;
				rQuphndEOF = true;
			}
			rQuphndPOS = -1;
			quphnd.getTransaction().commit();
		} catch (Exception e) {
			quphnd.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rQuphndFOUND = false;
		rQuphndEOF = true;
		while (rQuphndPOS < rQuphndList.size() || rQuphndFOUND) {
			rQuphnd = rQuphndList.get(++rQuphndPOS);
				if (Objects.equals(String.valueOf(rQuphnd.getPuacct()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rQuphnd.getPuseq()), String.valueOf($QUSEQ))) {
				rQuphndFOUND = true;
				rQuphndEOF = false;
			} else {
				rQuphndFOUND = false;
				rQuphndEOF = true;
			}

		}
		// IF STATEMENT
		if (rQuphndFOUND && rQuphnd.getPadsca() == $ADSCP && rQuphnd.getPmgrid().compareTo(" ") != 0 && $FINAL == true) {
			// EVAL
			$PHNDP = Float.valueOf(String.valueOf(rQuphnd.getPamt()));
		// ENDIF
		}
		// EVAL
		rSh200sfm.setRtamt( Float.valueOf(String.valueOf($PHNDP)));
		// EVAL
		rSh200sfm.setRtamtd( String.valueOf("DEPOSIT AMOUNT..:"));
		// EVAL
		rSh200sfm.setRchgdd( String.valueOf("DEPOSIT DATE..:"));
		// IF STATEMENT
		if (rQuphnd.getPamt() != $PHNDP || rQuphnd.getPadsca() != $ADSCP || $FINAL == true) {
			// EVAL
			//EXSR
			APOPUP();
		// ENDIF
		}
	// ENDIF
	}
	//MULT
	Calendar calendar = Calendar.getInstance();
	WRKDT0 = (int) (Integer.valueOf(String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf(calendar.get(Calendar.MONTH)+1) + String.valueOf(calendar.get(Calendar.DAY_OF_MONTH))) * 10000.0001);
	// CHAIN SETLL
	try {
		quphnd.getTransaction().begin();
		qQuphnd = quphnd.createQuery(qphnd1KL("Quphnd"), Quphnd.class);
		rQuphndList = qQuphnd.getResultList();
		if (rQuphndList.size() >= 1) {
			rQuphnd = new Quphnd();
			rQuphndFOUND = true;
			rQuphndEOF = false;
		} else {
			rQuphndFOUND = false;
			rQuphndEOF = true;
		}
		rQuphndPOS = -1;
		quphnd.getTransaction().commit();
	} catch (Exception e) {
		quphnd.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQuphndFOUND = false;
	rQuphndEOF = true;
	while (rQuphndPOS < rQuphndList.size() || rQuphndFOUND) {
		rQuphnd = rQuphndList.get(++rQuphndPOS);
		if (Objects.equals(String.valueOf(rQuphnd.getPuacct()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rQuphnd.getPuseq()), String.valueOf($QUSEQ))) {
			rQuphndFOUND = true;
			rQuphndEOF = false;
		} else {
			rQuphndFOUND = false;
			rQuphndEOF = true;
		}

	}
	// IF STATEMENT
	if (rQuphndFOUND) {
		// IF STATEMENT
		if (rQuphnd.getPamt() != $PHNDP || rQuphnd.getPadsca() != $ADSCP) {
			// EVAL
			rQuphnd.setPmgrid( String.valueOf(" "));
		// ENDIF
		}
		// EVAL
		rQuphnd.setPamt( Float.valueOf(String.valueOf($PHNDP)));
		// EVAL
		rQuphnd.setPadsca( Float.valueOf(String.valueOf($ADSCP)));
		// EVAL
		rPakcamp.setPcuser( String.valueOf(ldadsDS.luser()));
		// EVAL
		rQuphnd.setPcldat( String.valueOf(String.valueOf(WRKDT0)));
		// EVAL
		rQuphnd.setPcdate( String.valueOf(String.valueOf(WRKDT0)));
		// EVAL
		rQuphnd.setPutime($TTIME);
		// IF STATEMENT
		if (VALIDATE.compareTo("0") == 0) {
			// EVAL
			rQuphnd.setPaflag( String.valueOf("N"));
			// EVAL
			rQuphnd.setPmgrid( String.valueOf(" "));
		// ELSE
		} else {
			// EVAL
			rQuphnd.setPaflag( String.valueOf("Y"));
		// ENDIF
		}
		// EVAL
		rQuphnd.setPsflag( String.valueOf(" "));
		// EVAL
		rQuphnd.setPfflag( String.valueOf(" "));
		// UPDATE
		try {
			quphnd.getTransaction().begin();
			quphnd.getTransaction().commit();
		} catch (Exception e) {
			quphnd.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ELSE
	} else {
		// EVAL
		rQuphnd.setPuacct( String.valueOf(ldadsDS.lmms()));
		// EVAL
		rQuphnd.setPadsca( Float.valueOf(String.valueOf($ADSCP)));
		// EVAL
		rQuphnd.setPuseq( Integer.valueOf(String.valueOf(rQuhdr.getQuseq())));
		// EVAL
		rQuphnd.setPamt( Float.valueOf(String.valueOf($PHNDP)));
		// EVAL
		ldadsDS.puser( String.valueOf(ldadsDS.luser()));
		// EVAL
		rQuphnd.setPcldat( String.valueOf(String.valueOf(WRKDT0)));
		// EVAL
		rQuphnd.setPcdate( String.valueOf(String.valueOf(WRKDT0)));
		// EVAL
		rQuphnd.setPutime($TTIME);
		// IF STATEMENT
		if (VALIDATE.compareTo("0") == 0) {
			// EVAL
			rQuphnd.setPaflag( String.valueOf("N"));
		// ELSE
		} else {
			// EVAL
			rQuphnd.setPaflag( String.valueOf("Y"));
		// ENDIF
		}
		// EVAL
		rQuphnd.setPsflag( String.valueOf(" "));
		// EVAL
		rQuphnd.setPfflag( String.valueOf(" "));
		// EVAL
		rQuphnd.setPmgrid( String.valueOf(" "));
		// EVAL
		rQuphnd.setPrflag( String.valueOf(" "));
		// WRITE
		try {
			quphnd.getTransaction().begin();
			quphnd.persist(rQuphnd);
			quphnd.getTransaction().commit();
		} catch (Exception e) {
			quphnd.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void APOPUP () {
	// CHAIN SETLL
	try {
		mktadd.getTransaction().begin();
		qMktadd = mktadd.createQuery("select c from Mktadd c where c.MKMMS = '"+ldadsDS.lmms()+"'", Mktadd.class);
		rMktaddList = qMktadd.getResultList();
		if (rMktaddList.size() >= 1) {
			rMktadd = new Mktadd();
			rMktaddFOUND = true;
			rMktaddEOF = false;
		} else {
			rMktaddFOUND = false;
			rMktaddEOF = true;
		}
		rMktaddPOS = -1;
		mktadd.getTransaction().commit();
	} catch (Exception e) {
		mktadd.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rMktaddFOUND = false;
	rMktaddEOF = true;
	while (rMktaddPOS < rMktaddList.size() || rMktaddFOUND) {
		rMktadd = rMktaddList.get(++rMktaddPOS);
		if (Objects.equals(String.valueOf(rMktadd.getMkmms()), String.valueOf(ldadsDS.lmms()))) {
			rMktaddFOUND = true;
			rMktaddEOF = false;
		} else {
			rMktaddFOUND = false;
			rMktaddEOF = true;
		}

	}
	// IF STATEMENT
	if (rMktaddFOUND) {
		// CHAIN SETLL
		try {
			market.getTransaction().begin();
			qMarket = market.createQuery("select c from Market c where c.MMMSNO = '"+ldadsDS.lmms()+"'", Market.class);
			rMarketList = qMarket.getResultList();
			if (rMarketList.size() >= 1) {
				rMarket = new Market();
				rMarketFOUND = true;
				rMarketEOF = false;
			} else {
				rMarketFOUND = false;
				rMarketEOF = true;
			}
			rMarketPOS = -1;
			market.getTransaction().commit();
		} catch (Exception e) {
			market.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rMarketFOUND = false;
		rMarketEOF = true;
		while (rMarketPOS < rMarketList.size() || rMarketFOUND) {
			rMarket = rMarketList.get(++rMarketPOS);
				if (Objects.equals(String.valueOf(rMarket.getMmmsno()), String.valueOf(ldadsDS.lmms()))) {
				rMarketFOUND = true;
				rMarketEOF = false;
			} else {
				rMarketFOUND = false;
				rMarketEOF = true;
			}

		}
		// CHAIN SETLL
		try {
			auxadrla.getTransaction().begin();
			qAuxadrla = auxadrla.createQuery("select c from Auxadrla c where c.AAMMS = '"+ldadsDS.lmms()+"'", Auxadrla.class);
			rAuxadrlaList = qAuxadrla.getResultList();
			if (rAuxadrlaList.size() >= 1) {
				rAuxadrla = new Auxadrla();
				rAuxadrlaFOUND = true;
				rAuxadrlaEOF = false;
			} else {
				rAuxadrlaFOUND = false;
				rAuxadrlaEOF = true;
			}
			rAuxadrlaPOS = -1;
			auxadrla.getTransaction().commit();
		} catch (Exception e) {
			auxadrla.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rAuxadrlaFOUND = false;
		rAuxadrlaEOF = true;
		while (rAuxadrlaPOS < rAuxadrlaList.size() || rAuxadrlaFOUND) {
			rAuxadrla = rAuxadrlaList.get(++rAuxadrlaPOS);
				if (Objects.equals(String.valueOf(rAuxadrla.getAamms()), String.valueOf(ldadsDS.lmms()))) {
				rAuxadrlaFOUND = true;
				rAuxadrlaEOF = false;
			} else {
				rAuxadrlaFOUND = false;
				rAuxadrlaEOF = true;
			}

		}
		// EVAL
		rSh200sfm.setRbname( String.valueOf(rMarket.getMlname().trim()+","+ rMarket.getMfname().trim()));
		// EVAL
		rSh200sfm.setRadd1( String.valueOf(rAuxadrla.getAaadd1()));
		// EVAL
		rSh200sfm.setRadd2( String.valueOf(rAuxadrla.getAaadd2()));
		// EVAL
		rSh200sfm.setRcity( String.valueOf(rAuxadrla.getAacity()));
		// EVAL
		rSh200sfm.setRstate( String.valueOf(rAuxadrla.getAast()));
		// EVAL
		rSh200sfm.setRzipcd( String.valueOf(rAuxadrla.getAazip()));
		// EVAL
		rSh200sfm.setRcustn( String.valueOf(rMarket.getMphone()));
	// ENDIF
	}
	// MOVE
	CDATE = String.valueOf(new Date());
	// EVAL
	rSh200sfm.setRchgdt( Integer.valueOf(String.valueOf(Integer.parseInt(CDATE.substring(0, 4) + CDATE.substring(6, 8)))));
	// EVAL
	rSh200sfm.setRcaldt( Integer.valueOf(String.valueOf(rSh200sfm.getRchgdt())));
	// EVAL
	rSh200sfm.setRcustn( String.valueOf(rMarket.getMphone()));
	// EVAL
	rSh200sfm.setRamdue( Float.valueOf(String.valueOf($ADSCP - rSh200sfm.getRtamt())));
	// EVAL
	rSh200sfm.setRrpmsg( String.valueOf(" "));
	// EVAL
	rSh200sfm.setRcustn( String.valueOf("800-238-2727"));
	// EVAL
	$MDATA = String.valueOf(" ");
	// EVAL
	rSh200sfm.setRtitle( String.valueOf($MDESC));
	// EVAL
	$POS3 = Integer.valueOf(String.valueOf($MDATA.indexOf("$")));
	// EVAL
	$POS4 = Integer.valueOf(String.valueOf($POS3/70));
	// EVAL
	$POS4 = Integer.valueOf(String.valueOf($POS4*70));
	// EVAL
	$POS3 = Integer.valueOf(String.valueOf($POS3-$POS4));
	// EVAL
	$POS4 = Integer.valueOf(String.valueOf($POS4+1));
	// IF STATEMENT
	if ($POS3 > 0) {
		decfmt = new DecimalFormat("       0.  ");
		// EVAL
		$MDATA = $MDATA.substring(0, $POS4-1) + $MDATA.substring($POS4-1, $POS3+$POS4-1) + decfmt.format(rSh200sfm.getRtamt()).trim() + $MDATA.substring($POS3+$POS4-1,  70 - $POS3-1+$POS3+$POS4-1) + $MDATA.substring( 69, $MDATA.length());
	// ENDIF
	}
	// EVAL
	rSh200sfm.setRmsg1( String.valueOf($MDATA.substring(0, 70)));
	// EVAL
	rSh200sfm.setRmsg2( String.valueOf($MDATA.substring(70, 140)));
	// EVAL
	rSh200sfm.setRmsg3( String.valueOf($MDATA.substring(140, 210)));
	// EVAL
	rSh200sfm.setRmsg4( String.valueOf($MDATA.substring(210, 280)));
	// EVAL
	rSh200sfm.setRmsg5( String.valueOf($MDATA.substring(280, 350)));
	// EVAL
	rSh200sfm.setRmsg6( String.valueOf($MDATA.substring(350, 420)));
	// EVAL
	rSh200sfm.setRmsg7( String.valueOf($MDATA.substring(420, 490)));
	//ENDSR
	}
	
//BEGSR
	public static void GENFKEY () {
		calendar = Calendar.getInstance();
		calendar.setTime(FKT);
	// EVAL
	SECS = Integer.valueOf(String.valueOf(calendar.get(Calendar.SECOND)));
	// EVAL
	RANDOM = Integer.valueOf(String.valueOf(SECS / 10));
	// IF STATEMENT
	if (RANDOM == 1 || RANDOM == 0) {
		// EVAL
		FK = Integer.valueOf(String.valueOf(2));
		// ELSEIF STATEMENT
	} else if (RANDOM == 2) {
		// EVAL
		FK = Integer.valueOf(String.valueOf(4));
		// ELSEIF STATEMENT
	} else if (RANDOM == 3) {
		// EVAL
		FK = Integer.valueOf(String.valueOf(5));
		// ELSEIF STATEMENT
	} else if (RANDOM == 4) {
		// EVAL
		FK = Integer.valueOf(String.valueOf(6));
		// ELSEIF STATEMENT
	} else if (RANDOM == 5) {
		// EVAL
		FK = Integer.valueOf(String.valueOf(7));
		// ELSEIF STATEMENT
	} else if (RANDOM >= 6) {
		// EVAL
		FK = Integer.valueOf(String.valueOf(9));
	// ENDSL
	}
		decfmt = new DecimalFormat("Z");
	// EVAL
	FKEY = String.valueOf("F"+ decfmt.format(FK).trim() + "=VERIFY");
	//ENDSR
	}
	
//BEGSR
	public static void MSGWINDSP () {
	// EVAL
	WEROR1 = String.valueOf(" ");
	// EVAL
	WEROR2 = String.valueOf(" ");
	// IF STATEMENT
	if ((($_PROM.compareTo(rSh200sfm.getHbprom()) != 0 || $CBPKG.compareTo(rSh200sfm.getCbpkg()) != 0) && $PROME) || $SLSTPE) {
		//EXSR
		GENFKEY();
		// IF STATEMENT
		if ($PROME) {
			// EVAL
			WEROR1 = String.valueOf(ERR.get(53));
			// EVAL
		// ENDIF
		}
		// IF STATEMENT
		if ($SLSTPE) {
			// EVAL
			WEROR2 = String.valueOf(ERR.get(46));
		// ENDIF
		}
		// EVAL
		indicatorFunc(String.valueOf(FK), false);
		//DOW
		while (indicatorFuncG(String.valueOf(FK)) == false) {
		//ENDDO
		}
		// EVAL
		$_PROM = String.valueOf(rSh200sfm.getHbprom());
		// EVAL
		$CBPKG = String.valueOf(rSh200sfm.getCbpkg());
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void CHK_MQUOTE_FINAL () {
	// EVAL
	// IF STATEMENT
	if (rSh200sfm.getRmultq().compareTo("Y") != 0) {
		//LEAVESR
		return;
	// ENDIF
	}
	// CHAIN SETLL
	try {
		qufdtl.getTransaction().begin();
		qQufdtl = qufdtl.createQuery("select c from Qufdtl c where c.FDMMS = '"+ldadsDS.lmms()+"'", Qufdtl.class);
		rQufdtlList = qQufdtl.getResultList();
		if (rQufdtlList.size() >= 1) {
			rQufdtl = new Qufdtl();
			rQufdtlFOUND = true;
			rQufdtlEOF = false;
		} else {
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
		}
		rQufdtlPOS = -1;
		qufdtl.getTransaction().commit();
	} catch (Exception e) {
		qufdtl.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rQufdtlFOUND = false;
	rQufdtlEOF = true;
	while (rQufdtlPOS < rQufdtlList.size() || rQufdtlFOUND) {
		rQufdtl = rQufdtlList.get(++rQufdtlPOS);
		if (Objects.equals(String.valueOf(rQufdtl.getFdmms()), String.valueOf(ldadsDS.lmms()))) {
			rQufdtlFOUND = true;
			rQufdtlEOF = false;
		} else {
			rQufdtlFOUND = false;
			rQufdtlEOF = true;
		}

	}
	// IF STATEMENT
	if (! rQufdtlFOUND) {
		// EVAL
		// EVAL
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void SAV_MQUOTE_FINAL () {
	// IF STATEMENT
	if (rSh200sfm.getRmultq().compareTo("Y") != 0) {
		//LEAVESR
		return;
	// ENDIF
	}
	// CHAIN SETLL
	try {
		adtmmquot.getTransaction().begin();
		qAdtmmquot = adtmmquot.createQuery("select c from Adtmmquot c where c.MACCTNO = '"+ldadsDS.lmms()+"' and c.MMQPKG = '"+ldadsDS.lpakag()+"' and c.MMQSEQ = '"+rQufdtl.getFdseq()+"'", Adtmmquot.class);
		rAdtmmquotList = qAdtmmquot.getResultList();
		if (rAdtmmquotList.size() >= 1) {
			rAdtmmquot = new Adtmmquot();
			rAdtmmquotFOUND = true;
			rAdtmmquotEOF = false;
		} else {
			rAdtmmquotFOUND = false;
			rAdtmmquotEOF = true;
		}
		rAdtmmquotPOS = -1;
		adtmmquot.getTransaction().commit();
	} catch (Exception e) {
		adtmmquot.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rAdtmmquotFOUND = false;
	rAdtmmquotEOF = true;
	while (rAdtmmquotPOS < rAdtmmquotList.size() || rAdtmmquotFOUND) {
		rAdtmmquot = rAdtmmquotList.get(++rAdtmmquotPOS);
		if (Objects.equals(String.valueOf(rAdtmmquot.getMacctno()), String.valueOf(ldadsDS.lmms())) && Objects.equals(String.valueOf(rAdtmmquot.getMmqpkg()), String.valueOf(ldadsDS.lpakag())) && Objects.equals(String.valueOf(rAdtmmquot.getMmqseq()), String.valueOf(rQufdtl.getFdseq()))) {
			rAdtmmquotFOUND = true;
			rAdtmmquotEOF = false;
		} else {
			rAdtmmquotFOUND = false;
			rAdtmmquotEOF = true;
		}

	}
	// IF STATEMENT
	if (! rAdtmmquotFOUND) {
		// EVAL
		rAdtmmquot.setMacctno(ldadsDS.lmms());
		// EVAL
		rAdtmmquot.setMmqpkg(ldadsDS.lpakag());
		// EVAL
		rAdtmmquot.setMmqseq( Integer.valueOf(String.valueOf(rQufdtl.getFdseq())));
		// EVAL
		rAdtmmquot.setMmultq( String.valueOf(rSh200sfm.getRmultq()));
		// EVAL
		rAdtmmquot.setMuser(ldadsDS.luser());
		// EVAL
		rAdtmmquot.setMdate(new Timestamp(new Date().getTime()));
		// WRITE
		try {
			adtmmquot.getTransaction().begin();
			adtmmquot.persist(rAdtmmquot);
			adtmmquot.getTransaction().commit();
		} catch (Exception e) {
			adtmmquot.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
	// ENDIF
	}
	//ENDSR
	}
	
//BEGSR
	public static void ELECTSR () {
	// EVAL
	$POS1 = Integer.valueOf(String.valueOf(0));
	//DOW
	while (1==1) {
		// EVAL
		$POS1 = Integer.valueOf(String.valueOf($POS1 + 1));
		// EVAL
		$EITEM = String.valueOf($OITM.get($POS1));
		// IF STATEMENT
		if ($EITEM.compareTo(" ") != 0) {
			// CHAIN SETLL
			try {
				itm120v.getTransaction().begin();
				qItm120v = itm120v.createQuery("select c from Itm120v c where c.IEITEM = '"+$EITEM+"'", Itm120v.class);
				rItm120vList = qItm120v.getResultList();
				if (rItm120vList.size() >= 1) {
					rItm120v = new Itm120v();
					rItm120vFOUND = true;
					rItm120vEOF = false;
				} else {
					rItm120vFOUND = false;
					rItm120vEOF = true;
				}
				rItm120vPOS = -1;
				itm120v.getTransaction().commit();
			} catch (Exception e) {
				itm120v.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rItm120vFOUND = false;
			rItm120vEOF = true;
			while (rItm120vPOS < rItm120vList.size() || rItm120vFOUND) {
				rItm120v = rItm120vList.get(++rItm120vPOS);
						if (Objects.equals(String.valueOf(rItm120v.getIeitem()), String.valueOf($EITEM))) {
					rItm120vFOUND = true;
					rItm120vEOF = false;
				} else {
					rItm120vFOUND = false;
					rItm120vEOF = true;
				}

			}
			// IF STATEMENT
			if (rItm120vFOUND) {
				// EVAL
				// CHAIN SETLL
				try {
					itmstf.getTransaction().begin();
					qItmstf = itmstf.createQuery("select c from Itmstf c where c.SITEM = '"+$EITEM+"' and c.SSTATE = '"+rAuxadrla.getAast()+"'", Itmstf.class);
					rItmstfList = qItmstf.getResultList();
					if (rItmstfList.size() >= 1) {
						rItmstf = new Itmstf();
						rItmstfFOUND = true;
						rItmstfEOF = false;
					} else {
						rItmstfFOUND = false;
						rItmstfEOF = true;
					}
					rItmstfPOS = -1;
					itmstf.getTransaction().commit();
				} catch (Exception e) {
					itmstf.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rItmstfFOUND = false;
				rItmstfEOF = true;
				while (rItmstfPOS < rItmstfList.size() || rItmstfFOUND) {
					rItmstf = rItmstfList.get(++rItmstfPOS);
								if (Objects.equals(String.valueOf(rItmstf.getSitem()), String.valueOf($EITEM)) && Objects.equals(String.valueOf(rItmstf.getSstate()), String.valueOf(rAuxadrla.getAast()))) {
						rItmstfFOUND = true;
						rItmstfEOF = false;
					} else {
						rItmstfFOUND = false;
						rItmstfEOF = true;
					}

				}
				// IF STATEMENT
				if (rItmstfFOUND) {
					// EVAL
				// ENDIF
				}
				//DOW
				while (1==1) {
					// EVAL
					$OITEM = String.valueOf($OITM.get($POS11));
					// IF STATEMENT
					if ($OITEM.compareTo(" ") != 0) {
						// CHAIN SETLL
						try {
							itmstef.getTransaction().begin();
							qItmstef = itmstef.createQuery("select c from Itmstef c where c.SOITEM = '"+$EITEM+"' and c.SSTATE = '"+rAuxadrla.getAast()+"' and c.SITEM = '"+$OITEM+"'", Itmstef.class);
							rItmstefList = qItmstef.getResultList();
							if (rItmstefList.size() >= 1) {
								rItmstef = new Itmstef();
								rItmstefFOUND = true;
								rItmstefEOF = false;
							} else {
								rItmstefFOUND = false;
								rItmstefEOF = true;
							}
							rItmstefPOS = -1;
							itmstef.getTransaction().commit();
						} catch (Exception e) {
							itmstef.getTransaction().rollback();
							e.printStackTrace();
						}
						finally{
							emf.close();
						}
						// CHAIN READE
						rItmstefFOUND = false;
						rItmstefEOF = true;
						while (rItmstefPOS < rItmstefList.size() || rItmstefFOUND) {
							rItmstef = rItmstefList.get(++rItmstefPOS);
												if (Objects.equals(String.valueOf(rItmstef.getSoitem()), String.valueOf($EITEM)) && Objects.equals(String.valueOf(rItmstef.getSstate()), String.valueOf(rAuxadrla.getAast())) && Objects.equals(String.valueOf(rItmstef.getSitem()), String.valueOf($OITEM))) {
								rItmstefFOUND = true;
								rItmstefEOF = false;
							} else {
								rItmstefFOUND = false;
								rItmstefEOF = true;
							}

						}
						// IF STATEMENT
						if (rItmstefFOUND) {
							// EVAL
						// ENDIF
						}
					// ELSE
					} else {
						//LEAVE
						break;
					// ENDIF
					}
				//ENDDO
				}
			// ENDIF
			}
		// ELSE
		} else {
			//LEAVE
			break;
		// ENDIF
		}
	//ENDDO
	}
	//ENDSR
	}
	
//BEGSR
	public static void POFFER () {
	// EVAL
	// EVAL
	// CHAIN SETLL
	try {
		slstyp.getTransaction().begin();
		qSlstyp = slstyp.createQuery("select c from Slstyp c where c.SXTYPE = '"+rSh200sfm.getCbst()+"'", Slstyp.class);
		rSlstypList = qSlstyp.getResultList();
		if (rSlstypList.size() >= 1) {
			rSlstyp = new Slstyp();
			rSlstypFOUND = true;
			rSlstypEOF = false;
		} else {
			rSlstypFOUND = false;
			rSlstypEOF = true;
		}
		rSlstypPOS = -1;
		slstyp.getTransaction().commit();
	} catch (Exception e) {
		slstyp.getTransaction().rollback();
		e.printStackTrace();
	}
	finally{
		emf.close();
	}
	// CHAIN READE
	rSlstypFOUND = false;
	rSlstypEOF = true;
	while (rSlstypPOS < rSlstypList.size() || rSlstypFOUND) {
		rSlstyp = rSlstypList.get(++rSlstypPOS);
		if (Objects.equals(String.valueOf(rSlstyp.getSxtype()), String.valueOf(rSh200sfm.getCbst()))) {
			rSlstypFOUND = true;
			rSlstypEOF = false;
		} else {
			rSlstypFOUND = false;
			rSlstypEOF = true;
		}

	}
	// IF STATEMENT
	if ((rSh200sfm.getCbst().compareTo(" ") != 0 && (rSlstypFOUND && rSlstyp.getSxpdis().compareTo("0") != 0 || ! rSlstypFOUND)) || rSh200sfm.getCbst().compareTo(" ") == 0) {
		// EVAL
	// ENDIF
	}
	// IF STATEMENT
	if ($POFFER == true) {
		// EVAL
		$FLPDS = String.valueOf(" ");
		// IF STATEMENT
		if ($FLPDS.compareTo("N") == 0) {
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if ($POFFER == true) {
		// EVAL
		$FLPDS = String.valueOf(" ");
		// IF STATEMENT
		if ($FLPDS.compareTo("N") == 0) {
			// EVAL
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if ($POFFER == true) {
		// EVAL
		$QSRC = String.valueOf(ldadsDS.lqsrc());
		// EVAL
		$GMED = String.valueOf(ldadsDS.lscod());
		// CHAIN SETLL
		try {
			partofl.getTransaction().begin();
			qPartofl = partofl.createQuery("select c from Partofl c where c.PQSRC = '"+$QSRC+"' and c.PGMED = '"+$GMED+"'", Partofl.class);
			rPartoflList = qPartofl.getResultList();
			if (rPartoflList.size() >= 1) {
				rPartofl = new Partofl();
				rPartoflFOUND = true;
				rPartoflEOF = false;
			} else {
				rPartoflFOUND = false;
				rPartoflEOF = true;
			}
			rPartoflPOS = -1;
			partofl.getTransaction().commit();
		} catch (Exception e) {
			partofl.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			emf.close();
		}
		// CHAIN READE
		rPartoflFOUND = false;
		rPartoflEOF = true;
		while (rPartoflPOS < rPartoflList.size() || rPartoflFOUND) {
			rPartofl = rPartoflList.get(++rPartoflPOS);
				if (Objects.equals(String.valueOf(rPartofl.getPqsrc()), String.valueOf($QSRC)) && Objects.equals(String.valueOf(rPartofl.getPgmed()), String.valueOf($GMED))) {
				rPartoflFOUND = true;
				rPartoflEOF = false;
			} else {
				rPartoflFOUND = false;
				rPartoflEOF = true;
			}

		}
		// IF STATEMENT
		if (! rPartoflFOUND) {
			// EVAL
			$QSRC = String.valueOf(ldadsDS.lqsrc());
			// EVAL
			$GMED = String.valueOf(" ");
			// CHAIN SETLL
			try {
				partofl.getTransaction().begin();
				qPartofl = partofl.createQuery("select c from Partofl c where c.PQSRC = '"+$QSRC+"' and c.PGMED = '"+$GMED+"'", Partofl.class);
				rPartoflList = qPartofl.getResultList();
				if (rPartoflList.size() >= 1) {
					rPartofl = new Partofl();
					rPartoflFOUND = true;
					rPartoflEOF = false;
				} else {
					rPartoflFOUND = false;
					rPartoflEOF = true;
				}
				rPartoflPOS = -1;
				partofl.getTransaction().commit();
			} catch (Exception e) {
				partofl.getTransaction().rollback();
				e.printStackTrace();
			}
			finally{
				emf.close();
			}
			// CHAIN READE
			rPartoflFOUND = false;
			rPartoflEOF = true;
			while (rPartoflPOS < rPartoflList.size() || rPartoflFOUND) {
				rPartofl = rPartoflList.get(++rPartoflPOS);
						if (Objects.equals(String.valueOf(rPartofl.getPqsrc()), String.valueOf($QSRC)) && Objects.equals(String.valueOf(rPartofl.getPgmed()), String.valueOf($GMED))) {
					rPartoflFOUND = true;
					rPartoflEOF = false;
				} else {
					rPartoflFOUND = false;
					rPartoflEOF = true;
				}

			}
			// IF STATEMENT
			if (! rPartoflFOUND) {
				// EVAL
				$QSRC = String.valueOf(" ");
				// EVAL
				$GMED = String.valueOf(ldadsDS.lscod());
				// CHAIN SETLL
				try {
					partofl.getTransaction().begin();
					qPartofl = partofl.createQuery("select c from Partofl c where c.PQSRC = '"+$QSRC+"' and c.PGMED = '"+$GMED+"'", Partofl.class);
					rPartoflList = qPartofl.getResultList();
					if (rPartoflList.size() >= 1) {
						rPartofl = new Partofl();
						rPartoflFOUND = true;
						rPartoflEOF = false;
					} else {
						rPartoflFOUND = false;
						rPartoflEOF = true;
					}
					rPartoflPOS = -1;
					partofl.getTransaction().commit();
				} catch (Exception e) {
					partofl.getTransaction().rollback();
					e.printStackTrace();
				}
				finally{
					emf.close();
				}
				// CHAIN READE
				rPartoflFOUND = false;
				rPartoflEOF = true;
				while (rPartoflPOS < rPartoflList.size() || rPartoflFOUND) {
					rPartofl = rPartoflList.get(++rPartoflPOS);
								if (Objects.equals(String.valueOf(rPartofl.getPqsrc()), String.valueOf($QSRC)) && Objects.equals(String.valueOf(rPartofl.getPgmed()), String.valueOf($GMED))) {
						rPartoflFOUND = true;
						rPartoflEOF = false;
					} else {
						rPartoflFOUND = false;
						rPartoflEOF = true;
					}

				}
				// IF STATEMENT
				if (! rPartoflFOUND) {
					// EVAL
				// ENDIF
				}
			// ENDIF
			}
		// ENDIF
		}
	// ENDIF
	}
	// IF STATEMENT
	if ($POFFER == true) {
		// IF STATEMENT
		if (rPartofl.getPoffr().compareTo("N") == 0 && rSh200sfm.getHbprom().compareTo(" ") != 0) {
			// EVAL
			// EVAL
			// ELSEIF STATEMENT
		} else if (rPartofl.getPoffr().compareTo("N") == 0 && rSh200sfm.getHbprom().compareTo(" ") == 0) {
			// EVAL
			// EVAL
			// ELSEIF STATEMENT
		} else if (rPartofl.getPoffr().compareTo("Y") == 0) {
			// EVAL
			// EVAL
		// ENDSL
		}
	// ENDIF
	}
	//ENDSR
	}

	public static void indicatorFunc (String ind, Boolean val) {
		if (ind.indexOf("INKC") >= 0) {INKC = val;}
		if (ind.indexOf("INKD") >= 0) {INKD = val;}
		if (ind.indexOf("INKE") >= 0) {INKE = val;}
		if (ind.indexOf("INKF") >= 0) {INKF = val;}
		if (ind.indexOf("INKG") >= 0) {INKG = val;}
		if (ind.indexOf("INKH") >= 0) {INKH = val;}
		if (ind.indexOf("INKI") >= 0) {INKI = val;}
		if (ind.indexOf("INKJ") >= 0) {INKJ = val;}
		if (ind.indexOf("INKK") >= 0) {INKK = val;}
		if (ind.indexOf("INKL") >= 0) {INKL = val;}
		if (ind.indexOf("INKN") >= 0) {INKN = val;}
		if (ind.indexOf("INKP") >= 0) {INKP = val;}
		if (ind.indexOf("INKQ") >= 0) {INKQ = val;}
		if (ind.indexOf("INKR") >= 0) {INKR = val;}
		if (ind.indexOf("INKS") >= 0) {INKS = val;}
		if (ind.indexOf("INKT") >= 0) {INKT = val;}
		if (ind.indexOf("INKU") >= 0) {INKU = val;}
		if (ind.indexOf("INLR") >= 0) {INLR = val;}
		if (ind.indexOf("IN02") >= 0) {IN02 = val;}
		if (ind.indexOf("IN03") >= 0) {IN03 = val;}
		if (ind.indexOf("IN20") >= 0) {IN20 = val;}
		if (ind.indexOf("IN21") >= 0) {IN21 = val;}
		if (ind.indexOf("IN23") >= 0) {IN23 = val;}
		if (ind.indexOf("IN25") >= 0) {IN25 = val;}
		if (ind.indexOf("IN26") >= 0) {IN26 = val;}
		if (ind.indexOf("IN30") >= 0) {IN30 = val;}
		if (ind.indexOf("IN31") >= 0) {IN31 = val;}
		if (ind.indexOf("IN32") >= 0) {IN32 = val;}
		if (ind.indexOf("IN33") >= 0) {IN33 = val;}
		if (ind.indexOf("IN34") >= 0) {IN34 = val;}
		if (ind.indexOf("IN35") >= 0) {IN35 = val;}
		if (ind.indexOf("IN36") >= 0) {IN36 = val;}
		if (ind.indexOf("IN37") >= 0) {IN37 = val;}
		if (ind.indexOf("IN38") >= 0) {IN38 = val;}
		if (ind.indexOf("IN39") >= 0) {IN39 = val;}
		if (ind.indexOf("IN40") >= 0) {IN40 = val;}
		if (ind.indexOf("IN41") >= 0) {IN41 = val;}
		if (ind.indexOf("IN42") >= 0) {IN42 = val;}
		if (ind.indexOf("IN44") >= 0) {IN44 = val;}
		if (ind.indexOf("IN45") >= 0) {IN45 = val;}
		if (ind.indexOf("IN46") >= 0) {IN46 = val;}
		if (ind.indexOf("IN51") >= 0) {IN51 = val;}
		if (ind.indexOf("IN52") >= 0) {IN52 = val;}
		if (ind.indexOf("IN53") >= 0) {IN53 = val;}
		if (ind.indexOf("IN54") >= 0) {IN54 = val;}
		if (ind.indexOf("IN55") >= 0) {IN55 = val;}
		if (ind.indexOf("IN56") >= 0) {IN56 = val;}
		if (ind.indexOf("IN57") >= 0) {IN57 = val;}
		if (ind.indexOf("IN58") >= 0) {IN58 = val;}
		if (ind.indexOf("IN59") >= 0) {IN59 = val;}
		if (ind.indexOf("IN60") >= 0) {IN60 = val;}
		if (ind.indexOf("IN62") >= 0) {IN62 = val;}
		if (ind.indexOf("IN63") >= 0) {IN63 = val;}
		if (ind.indexOf("IN65") >= 0) {IN65 = val;}
		if (ind.indexOf("IN66") >= 0) {IN66 = val;}
		if (ind.indexOf("IN67") >= 0) {IN67 = val;}
		if (ind.indexOf("IN69") >= 0) {IN69 = val;}
		if (ind.indexOf("IN71") >= 0) {IN71 = val;}
		if (ind.indexOf("IN72") >= 0) {IN72 = val;}
		if (ind.indexOf("IN73") >= 0) {IN73 = val;}
		if (ind.indexOf("IN74") >= 0) {IN74 = val;}
		if (ind.indexOf("IN75") >= 0) {IN75 = val;}
		if (ind.indexOf("IN76") >= 0) {IN76 = val;}
		if (ind.indexOf("IN77") >= 0) {IN77 = val;}
		if (ind.indexOf("IN78") >= 0) {IN78 = val;}
		if (ind.indexOf("IN79") >= 0) {IN79 = val;}
		if (ind.indexOf("IN80") >= 0) {IN80 = val;}
		if (ind.indexOf("IN81") >= 0) {IN81 = val;}
		if (ind.indexOf("IN82") >= 0) {IN82 = val;}
		if (ind.indexOf("IN85") >= 0) {IN85 = val;}
		if (ind.indexOf("IN86") >= 0) {IN86 = val;}
		if (ind.indexOf("IN87") >= 0) {IN87 = val;}
		if (ind.indexOf("IN88") >= 0) {IN88 = val;}
		if (ind.indexOf("IN89") >= 0) {IN89 = val;}
		if (ind.indexOf("IN90") >= 0) {IN90 = val;}
		if (ind.indexOf("IN91") >= 0) {IN91 = val;}
		if (ind.indexOf("IN92") >= 0) {IN92 = val;}
		if (ind.indexOf("IN93") >= 0) {IN93 = val;}
		if (ind.indexOf("IN94") >= 0) {IN94 = val;}
		if (ind.indexOf("IN95") >= 0) {IN95 = val;}
		if (ind.indexOf("IN96") >= 0) {IN96 = val;}
		if (ind.indexOf("IN97") >= 0) {IN97 = val;}
		if (ind.indexOf("IN98") >= 0) {IN98 = val;}
	}
	public static Boolean indicatorFuncG (String ind) {
		 Boolean val = false;
		if (ind.indexOf("INKC") >= 0) {val = INKC;}
		if (ind.indexOf("INKD") >= 0) {val = INKD;}
		if (ind.indexOf("INKE") >= 0) {val = INKE;}
		if (ind.indexOf("INKF") >= 0) {val = INKF;}
		if (ind.indexOf("INKG") >= 0) {val = INKG;}
		if (ind.indexOf("INKH") >= 0) {val = INKH;}
		if (ind.indexOf("INKI") >= 0) {val = INKI;}
		if (ind.indexOf("INKJ") >= 0) {val = INKJ;}
		if (ind.indexOf("INKK") >= 0) {val = INKK;}
		if (ind.indexOf("INKL") >= 0) {val = INKL;}
		if (ind.indexOf("INKN") >= 0) {val = INKN;}
		if (ind.indexOf("INKP") >= 0) {val = INKP;}
		if (ind.indexOf("INKQ") >= 0) {val = INKQ;}
		if (ind.indexOf("INKR") >= 0) {val = INKR;}
		if (ind.indexOf("INKS") >= 0) {val = INKS;}
		if (ind.indexOf("INKT") >= 0) {val = INKT;}
		if (ind.indexOf("INKU") >= 0) {val = INKU;}
		if (ind.indexOf("INLR") >= 0) {val = INLR;}
		if (ind.indexOf("IN02") >= 0) {val = IN02;}
		if (ind.indexOf("IN03") >= 0) {val = IN03;}
		if (ind.indexOf("IN20") >= 0) {val = IN20;}
		if (ind.indexOf("IN21") >= 0) {val = IN21;}
		if (ind.indexOf("IN23") >= 0) {val = IN23;}
		if (ind.indexOf("IN25") >= 0) {val = IN25;}
		if (ind.indexOf("IN26") >= 0) {val = IN26;}
		if (ind.indexOf("IN30") >= 0) {val = IN30;}
		if (ind.indexOf("IN31") >= 0) {val = IN31;}
		if (ind.indexOf("IN32") >= 0) {val = IN32;}
		if (ind.indexOf("IN33") >= 0) {val = IN33;}
		if (ind.indexOf("IN34") >= 0) {val = IN34;}
		if (ind.indexOf("IN35") >= 0) {val = IN35;}
		if (ind.indexOf("IN36") >= 0) {val = IN36;}
		if (ind.indexOf("IN37") >= 0) {val = IN37;}
		if (ind.indexOf("IN38") >= 0) {val = IN38;}
		if (ind.indexOf("IN39") >= 0) {val = IN39;}
		if (ind.indexOf("IN40") >= 0) {val = IN40;}
		if (ind.indexOf("IN41") >= 0) {val = IN41;}
		if (ind.indexOf("IN42") >= 0) {val = IN42;}
		if (ind.indexOf("IN44") >= 0) {val = IN44;}
		if (ind.indexOf("IN45") >= 0) {val = IN45;}
		if (ind.indexOf("IN46") >= 0) {val = IN46;}
		if (ind.indexOf("IN51") >= 0) {val = IN51;}
		if (ind.indexOf("IN52") >= 0) {val = IN52;}
		if (ind.indexOf("IN53") >= 0) {val = IN53;}
		if (ind.indexOf("IN54") >= 0) {val = IN54;}
		if (ind.indexOf("IN55") >= 0) {val = IN55;}
		if (ind.indexOf("IN56") >= 0) {val = IN56;}
		if (ind.indexOf("IN57") >= 0) {val = IN57;}
		if (ind.indexOf("IN58") >= 0) {val = IN58;}
		if (ind.indexOf("IN59") >= 0) {val = IN59;}
		if (ind.indexOf("IN60") >= 0) {val = IN60;}
		if (ind.indexOf("IN62") >= 0) {val = IN62;}
		if (ind.indexOf("IN63") >= 0) {val = IN63;}
		if (ind.indexOf("IN65") >= 0) {val = IN65;}
		if (ind.indexOf("IN66") >= 0) {val = IN66;}
		if (ind.indexOf("IN67") >= 0) {val = IN67;}
		if (ind.indexOf("IN69") >= 0) {val = IN69;}
		if (ind.indexOf("IN71") >= 0) {val = IN71;}
		if (ind.indexOf("IN72") >= 0) {val = IN72;}
		if (ind.indexOf("IN73") >= 0) {val = IN73;}
		if (ind.indexOf("IN74") >= 0) {val = IN74;}
		if (ind.indexOf("IN75") >= 0) {val = IN75;}
		if (ind.indexOf("IN76") >= 0) {val = IN76;}
		if (ind.indexOf("IN77") >= 0) {val = IN77;}
		if (ind.indexOf("IN78") >= 0) {val = IN78;}
		if (ind.indexOf("IN79") >= 0) {val = IN79;}
		if (ind.indexOf("IN80") >= 0) {val = IN80;}
		if (ind.indexOf("IN81") >= 0) {val = IN81;}
		if (ind.indexOf("IN82") >= 0) {val = IN82;}
		if (ind.indexOf("IN85") >= 0) {val = IN85;}
		if (ind.indexOf("IN86") >= 0) {val = IN86;}
		if (ind.indexOf("IN87") >= 0) {val = IN87;}
		if (ind.indexOf("IN88") >= 0) {val = IN88;}
		if (ind.indexOf("IN89") >= 0) {val = IN89;}
		if (ind.indexOf("IN90") >= 0) {val = IN90;}
		if (ind.indexOf("IN91") >= 0) {val = IN91;}
		if (ind.indexOf("IN92") >= 0) {val = IN92;}
		if (ind.indexOf("IN93") >= 0) {val = IN93;}
		if (ind.indexOf("IN94") >= 0) {val = IN94;}
		if (ind.indexOf("IN95") >= 0) {val = IN95;}
		if (ind.indexOf("IN96") >= 0) {val = IN96;}
		if (ind.indexOf("IN97") >= 0) {val = IN97;}
		if (ind.indexOf("IN98") >= 0) {val = IN98;}
		 return val;
	}
	public static class WsdsDS {
		Integer wsidPOS = 0; 	Integer wsidLEN = 10;	Integer wsidEND = 10;
		Integer filPOS = 10; 	Integer filLEN = 1;	Integer filEND = 11;
		Integer colPOS = 11; 	Integer colLEN = 1;	Integer colEND = 12;
		Integer wsdsPOS = 0; 	Integer wsdsLEN = 12;	Integer wsdsEND = 12;
		String base = "            ";
		String wsds () {
			refresh();
			return base.substring(wsdsPOS, wsdsEND);
		}
		void wsds (String wsds) {
			refresh();
			base = base.substring(0, wsdsPOS) + String.format("%-"+wsdsLEN+"s", wsds).substring(0, wsdsLEN) + base.substring(wsdsEND);
		}
		String wsid () {
			refresh();
			return base.substring(wsidPOS, wsidEND);
		}
		void wsid (String wsid) {
			refresh();
			base = base.substring(0, wsidPOS) + String.format("%-"+wsidLEN+"s", wsid).substring(0, wsidLEN) + base.substring(wsidEND);
		}
		String fil () {
			refresh();
			return base.substring(filPOS, filEND);
		}
		void fil (String fil) {
			refresh();
			base = base.substring(0, filPOS) + String.format("%-"+filLEN+"s", fil).substring(0, filLEN) + base.substring(filEND);
		}
		String col () {
			refresh();
			return base.substring(colPOS, colEND);
		}
		void col (String col) {
			refresh();
			base = base.substring(0, colPOS) + String.format("%-"+colLEN+"s", col).substring(0, colLEN) + base.substring(colEND);
		}
		void refresh () {
		}
	}

	public static class BinaryDS {
		Integer linePOS = 0; 	Integer lineLEN = 4;	Integer lineEND = 4;
		Integer linhexPOS = 1; 	Integer linhexLEN = 1;	Integer linhexEND = 2;
		Integer posPOS = 4; 	Integer posLEN = 4;	Integer posEND = 8;
		Integer poshexPOS = 5; 	Integer poshexLEN = 1;	Integer poshexEND = 6;
		Integer binaryPOS = 0; 	Integer binaryLEN = 8;	Integer binaryEND = 8;
		String base = "        ";
		String binary () {
			refresh();
			return base.substring(binaryPOS, binaryEND);
		}
		void binary (String binary) {
			refresh();
			base = base.substring(0, binaryPOS) + String.format("%-"+binaryLEN+"s", binary).substring(0, binaryLEN) + base.substring(binaryEND);
		}
		Integer line () {
			refresh();
			return Integer.parseInt(base.substring(linePOS, lineEND));
		}
		void line (Integer line) {
			refresh();
			base = base.substring(0, linePOS) + String.format("%-"+lineLEN+"s", line).substring(0, lineLEN) + base.substring(lineEND);
		}
		String linhex () {
			refresh();
			return base.substring(linhexPOS, linhexEND);
		}
		void linhex (String linhex) {
			refresh();
			base = base.substring(0, linhexPOS) + String.format("%-"+linhexLEN+"s", linhex).substring(0, linhexLEN) + base.substring(linhexEND);
		}
		Integer pos () {
			refresh();
			return Integer.parseInt(base.substring(posPOS, posEND));
		}
		void pos (Integer pos) {
			refresh();
			base = base.substring(0, posPOS) + String.format("%-"+posLEN+"s", pos).substring(0, posLEN) + base.substring(posEND);
		}
		String poshex () {
			refresh();
			return base.substring(poshexPOS, poshexEND);
		}
		void poshex (String poshex) {
			refresh();
			base = base.substring(0, poshexPOS) + String.format("%-"+poshexLEN+"s", poshex).substring(0, poshexLEN) + base.substring(poshexEND);
		}
		void refresh () {
		}
	}

		public static class PgmnamDS {
		Integer pgmnamPOS = 0; 	Integer pgmnamLEN = 10;	Integer pgmnamEND = 10;
		Integer errmsgPOS = 10; 	Integer errmsgLEN = 80;	Integer errmsgEND = 90;
		Integer filedsPOS = 90; 	Integer filedsLEN = 8;	Integer filedsEND = 98;
		Integer wrkstnPOS = 98; 	Integer wrkstnLEN = 10;	Integer wrkstnEND = 108;
		Integer usernmPOS = 108; 	Integer usernmLEN = 10;	Integer usernmEND = 118;
		String base = "                                                                                                                      ";
		String pgmnam () {
			refresh();
			return base.substring(pgmnamPOS, pgmnamEND);
		}
		void pgmnam (String pgmnam) {
			refresh();
			base = base.substring(0, pgmnamPOS) + String.format("%-"+pgmnamLEN+"s", pgmnam).substring(0, pgmnamLEN) + base.substring(pgmnamEND);
		}
		String errmsg () {
			refresh();
			return base.substring(errmsgPOS, errmsgEND);
		}
		void errmsg (String errmsg) {
			refresh();
			base = base.substring(0, errmsgPOS) + String.format("%-"+errmsgLEN+"s", errmsg).substring(0, errmsgLEN) + base.substring(errmsgEND);
		}
		String fileds () {
			refresh();
			return base.substring(filedsPOS, filedsEND);
		}
		void fileds (String fileds) {
			refresh();
			base = base.substring(0, filedsPOS) + String.format("%-"+filedsLEN+"s", fileds).substring(0, filedsLEN) + base.substring(filedsEND);
		}
		String wrkstn () {
			refresh();
			return base.substring(wrkstnPOS, wrkstnEND);
		}
		void wrkstn (String wrkstn) {
			refresh();
			base = base.substring(0, wrkstnPOS) + String.format("%-"+wrkstnLEN+"s", wrkstn).substring(0, wrkstnLEN) + base.substring(wrkstnEND);
		}
		String usernm () {
			refresh();
			return base.substring(usernmPOS, usernmEND);
		}
		void usernm (String usernm) {
			refresh();
			base = base.substring(0, usernmPOS) + String.format("%-"+usernmLEN+"s", usernm).substring(0, usernmLEN) + base.substring(usernmEND);
		}
		void refresh () {
		}
	}

	public static class SzerrmDS {
		Sh200sfm rSh200sfm;
		Integer msglinPOS = 0; 	Integer msglinLEN = 78;	Integer msglinEND = 78;
		Integer linenoPOS = 5; 	Integer linenoLEN = 4;	Integer linenoEND = 9;
		Integer szerrmPOS = 0; 	Integer szerrmLEN = 78;	Integer szerrmEND = 78;
		String base = "                                                                              ";
		String szerrm (Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			return base.substring(szerrmPOS, szerrmEND);
		}
		void szerrm (String szerrm, Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			base = base.substring(0, szerrmPOS) + String.format("%-"+szerrmLEN+"s", szerrm).substring(0, szerrmLEN) + base.substring(szerrmEND);
			rSh200sfm.setSzerrm(base.substring(szerrmPOS, szerrmEND));
		}
		String msglin () {
			refresh();
			return base.substring(msglinPOS, msglinEND);
		}
		void msglin (String msglin) {
			refresh();
			base = base.substring(0, msglinPOS) + String.format("%-"+msglinLEN+"s", msglin).substring(0, msglinLEN) + base.substring(msglinEND);
		}
		String lineno () {
			refresh();
			return base.substring(linenoPOS, linenoEND);
		}
		void lineno (String lineno) {
			refresh();
			base = base.substring(0, linenoPOS) + String.format("%-"+linenoLEN+"s", lineno).substring(0, linenoLEN) + base.substring(linenoEND);
		}
		void refresh () {
					if (rSh200sfm.getSzerrm() != null) {
				base = base.substring(0, szerrmPOS) + String.format("%-"+szerrmLEN+"s", rSh200sfm.getSzerrm()).subSequence(szerrmPOS, szerrmLEN) + base.substring(szerrmEND);
			} else {
				base = base.substring(0, szerrmPOS) + String.format("%-"+szerrmLEN+"s", " ") + base.substring(szerrmEND);
			}
		}
	}

	public static class LdadsDS {
		Integer lprogPOS = 0; 	Integer lprogLEN = 6;	Integer lprogEND = 6;
		Integer lmmsPOS = 6; 	Integer lmmsLEN = 8;	Integer lmmsEND = 14;
		Integer luidPOS = 14; 	Integer luidLEN = 8;	Integer luidEND = 22;
		Integer luserPOS = 22; 	Integer luserLEN = 8;	Integer luserEND = 30;
		Integer lstypPOS = 30; 	Integer lstypLEN = 2;	Integer lstypEND = 32;
		Integer lcodePOS = 32; 	Integer lcodeLEN = 10;	Integer lcodeEND = 42;
		Integer lcampPOS = 42; 	Integer lcampLEN = 6;	Integer lcampEND = 48;
		Integer ldispPOS = 48; 	Integer ldispLEN = 3;	Integer ldispEND = 51;
		Integer fprogPOS = 51; 	Integer fprogLEN = 1;	Integer fprogEND = 52;
		Integer llevlPOS = 52; 	Integer llevlLEN = 1;	Integer llevlEND = 53;
		Integer lsetPOS = 53; 	Integer lsetLEN = 10;	Integer lsetEND = 63;
		Integer lscrptPOS = 63; 	Integer lscrptLEN = 6;	Integer lscrptEND = 69;
		Integer lscodPOS = 69; 	Integer lscodLEN = 10;	Integer lscodEND = 79;
		Integer lapplPOS = 79; 	Integer lapplLEN = 2;	Integer lapplEND = 81;
		Integer lldsrcPOS = 81; 	Integer lldsrcLEN = 10;	Integer lldsrcEND = 91;
		Integer lfldPOS = 91; 	Integer lfldLEN = 6;	Integer lfldEND = 97;
		Integer lfdescPOS = 97; 	Integer lfdescLEN = 30;	Integer lfdescEND = 127;
		Integer ltypPOS = 127; 	Integer ltypLEN = 1;	Integer ltypEND = 128;
		Integer lvalPOS = 128; 	Integer lvalLEN = 10;	Integer lvalEND = 138;
		Integer linc_POS = 138; 	Integer linc_LEN = 8;	Integer linc_END = 146;
		Integer linctPOS = 146; 	Integer linctLEN = 10;	Integer linctEND = 156;
		Integer lstepPOS = 156; 	Integer lstepLEN = 5;	Integer lstepEND = 161;
		Integer ltaskPOS = 161; 	Integer ltaskLEN = 3;	Integer ltaskEND = 164;
		Integer lprentPOS = 164; 	Integer lprentLEN = 8;	Integer lprentEND = 172;
		Integer lzipPOS = 172; 	Integer lzipLEN = 9;	Integer lzipEND = 181;
		Integer lcatPOS = 181; 	Integer lcatLEN = 3;	Integer lcatEND = 184;
		Integer lstatePOS = 184; 	Integer lstateLEN = 2;	Integer lstateEND = 186;
		Integer lcityPOS = 186; 	Integer lcityLEN = 24;	Integer lcityEND = 210;
		Integer aphonePOS = 210; 	Integer aphoneLEN = 17;	Integer aphoneEND = 227;
		Integer laffPOS = 227; 	Integer laffLEN = 3;	Integer laffEND = 230;
		Integer lcmdkyPOS = 230; 	Integer lcmdkyLEN = 1;	Integer lcmdkyEND = 231;
		Integer lptypePOS = 231; 	Integer lptypeLEN = 3;	Integer lptypeEND = 234;
		Integer lterrPOS = 234; 	Integer lterrLEN = 8;	Integer lterrEND = 242;
		Integer lpromoPOS = 242; 	Integer lpromoLEN = 10;	Integer lpromoEND = 252;
		Integer lrpidPOS = 252; 	Integer lrpidLEN = 8;	Integer lrpidEND = 260;
		Integer lsystpPOS = 260; 	Integer lsystpLEN = 3;	Integer lsystpEND = 263;
		Integer lpakagPOS = 263; 	Integer lpakagLEN = 15;	Integer lpakagEND = 278;
		Integer lwrcdePOS = 278; 	Integer lwrcdeLEN = 3;	Integer lwrcdeEND = 281;
		Integer lwacatPOS = 281; 	Integer lwacatLEN = 3;	Integer lwacatEND = 284;
		Integer lbterrPOS = 284; 	Integer lbterrLEN = 8;	Integer lbterrEND = 292;
		Integer lquseqPOS = 292; 	Integer lquseqLEN = 3;	Integer lquseqEND = 295;
		Integer ltasksPOS = 295; 	Integer ltasksLEN = 3;	Integer ltasksEND = 298;
		Integer lnewacPOS = 298; 	Integer lnewacLEN = 1;	Integer lnewacEND = 299;
		Integer laterrPOS = 299; 	Integer laterrLEN = 8;	Integer laterrEND = 307;
		Integer lproccPOS = 307; 	Integer lproccLEN = 3;	Integer lproccEND = 310;
		Integer lschnoPOS = 310; 	Integer lschnoLEN = 10;	Integer lschnoEND = 320;
		Integer lbtimePOS = 320; 	Integer lbtimeLEN = 4;	Integer lbtimeEND = 324;
		Integer letimePOS = 324; 	Integer letimeLEN = 4;	Integer letimeEND = 328;
		Integer ldtimPOS = 328; 	Integer ldtimLEN = 6;	Integer ldtimEND = 334;
		Integer ltimePOS = 334; 	Integer ltimeLEN = 4;	Integer ltimeEND = 338;
		Integer lduhrPOS = 338; 	Integer lduhrLEN = 3;	Integer lduhrEND = 341;
		Integer ldumnPOS = 341; 	Integer ldumnLEN = 2;	Integer ldumnEND = 343;
		Integer lgavlPOS = 343; 	Integer lgavlLEN = 1;	Integer lgavlEND = 344;
		Integer lddnisPOS = 344; 	Integer lddnisLEN = 10;	Integer lddnisEND = 354;
		Integer ldaniPOS = 354; 	Integer ldaniLEN = 17;	Integer ldaniEND = 371;
		Integer ldmodePOS = 371; 	Integer ldmodeLEN = 3;	Integer ldmodeEND = 374;
		Integer ltmodePOS = 374; 	Integer ltmodeLEN = 3;	Integer ltmodeEND = 377;
		Integer lsubtPOS = 377; 	Integer lsubtLEN = 4;	Integer lsubtEND = 381;
		Integer lsgdPOS = 381; 	Integer lsgdLEN = 1;	Integer lsgdEND = 382;
		Integer lentfPOS = 382; 	Integer lentfLEN = 1;	Integer lentfEND = 383;
		Integer lactenPOS = 383; 	Integer lactenLEN = 1;	Integer lactenEND = 384;
		Integer lentnPOS = 384; 	Integer lentnLEN = 8;	Integer lentnEND = 392;
		Integer lqueuePOS = 392; 	Integer lqueueLEN = 10;	Integer lqueueEND = 402;
		Integer ltypePOS = 402; 	Integer ltypeLEN = 1;	Integer ltypeEND = 403;
		Integer lphonePOS = 403; 	Integer lphoneLEN = 17;	Integer lphoneEND = 420;
		Integer lrtncPOS = 420; 	Integer lrtncLEN = 7;	Integer lrtncEND = 427;
		Integer lwsidPOS = 427; 	Integer lwsidLEN = 10;	Integer lwsidEND = 437;
		Integer lshftPOS = 437; 	Integer lshftLEN = 1;	Integer lshftEND = 438;
		Integer lacctPOS = 438; 	Integer lacctLEN = 20;	Integer lacctEND = 458;
		Integer lsdatPOS = 458; 	Integer lsdatLEN = 8;	Integer lsdatEND = 466;
		Integer ldatePOS = 466; 	Integer ldateLEN = 8;	Integer ldateEND = 474;
		Integer lrcldtPOS = 474; 	Integer lrcldtLEN = 8;	Integer lrcldtEND = 482;
		Integer litemPOS = 482; 	Integer litemLEN = 15;	Integer litemEND = 497;
		Integer lrtypPOS = 497; 	Integer lrtypLEN = 1;	Integer lrtypEND = 498;
		Integer recseqPOS = 498; 	Integer recseqLEN = 8;	Integer recseqEND = 506;
		Integer lcgflgPOS = 506; 	Integer lcgflgLEN = 1;	Integer lcgflgEND = 507;
		Integer ldescPOS = 507; 	Integer ldescLEN = 20;	Integer ldescEND = 527;
		Integer puserPOS = 527; 	Integer puserLEN = 8;	Integer puserEND = 535;
		Integer lrclusPOS = 535; 	Integer lrclusLEN = 8;	Integer lrclusEND = 543;
		Integer lsuspPOS = 543; 	Integer lsuspLEN = 1;	Integer lsuspEND = 544;
		Integer lfuncPOS = 544; 	Integer lfuncLEN = 3;	Integer lfuncEND = 547;
		Integer lmtypPOS = 547; 	Integer lmtypLEN = 1;	Integer lmtypEND = 548;
		Integer lcf01POS = 548; 	Integer lcf01LEN = 1;	Integer lcf01END = 549;
		Integer prdrfPOS = 549; 	Integer prdrfLEN = 8;	Integer prdrfEND = 557;
		Integer lrcltmPOS = 557; 	Integer lrcltmLEN = 4;	Integer lrcltmEND = 561;
		Integer ptaskPOS = 561; 	Integer ptaskLEN = 6;	Integer ptaskEND = 567;
		Integer lqsrcPOS = 567; 	Integer lqsrcLEN = 10;	Integer lqsrcEND = 577;
		Integer lslstpPOS = 577; 	Integer lslstpLEN = 1;	Integer lslstpEND = 578;
		Integer lqucalPOS = 578; 	Integer lqucalLEN = 1;	Integer lqucalEND = 579;
		Integer ldadsPOS = 0; 	Integer ldadsLEN = 579;	Integer ldadsEND = 579;
		String base = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ";
		String ldads () {
			refresh();
			return base.substring(ldadsPOS, ldadsEND);
		}
		void ldads (String ldads) {
			refresh();
			base = base.substring(0, ldadsPOS) + String.format("%-"+ldadsLEN+"s", ldads).substring(0, ldadsLEN) + base.substring(ldadsEND);
		}
		String lprog () {
			refresh();
			return base.substring(lprogPOS, lprogEND);
		}
		void lprog (String lprog) {
			refresh();
			base = base.substring(0, lprogPOS) + String.format("%-"+lprogLEN+"s", lprog).substring(0, lprogLEN) + base.substring(lprogEND);
		}
		String lmms () {
			refresh();
			return base.substring(lmmsPOS, lmmsEND);
		}
		void lmms (String lmms) {
			refresh();
			base = base.substring(0, lmmsPOS) + String.format("%-"+lmmsLEN+"s", lmms).substring(0, lmmsLEN) + base.substring(lmmsEND);
		}
		String luid () {
			refresh();
			return base.substring(luidPOS, luidEND);
		}
		void luid (String luid) {
			refresh();
			base = base.substring(0, luidPOS) + String.format("%-"+luidLEN+"s", luid).substring(0, luidLEN) + base.substring(luidEND);
		}
		String luser () {
			refresh();
			return base.substring(luserPOS, luserEND);
		}
		void luser (String luser) {
			refresh();
			base = base.substring(0, luserPOS) + String.format("%-"+luserLEN+"s", luser).substring(0, luserLEN) + base.substring(luserEND);
		}
		String lstyp () {
			refresh();
			return base.substring(lstypPOS, lstypEND);
		}
		void lstyp (String lstyp) {
			refresh();
			base = base.substring(0, lstypPOS) + String.format("%-"+lstypLEN+"s", lstyp).substring(0, lstypLEN) + base.substring(lstypEND);
		}
		String lcode () {
			refresh();
			return base.substring(lcodePOS, lcodeEND);
		}
		void lcode (String lcode) {
			refresh();
			base = base.substring(0, lcodePOS) + String.format("%-"+lcodeLEN+"s", lcode).substring(0, lcodeLEN) + base.substring(lcodeEND);
		}
		String lcamp () {
			refresh();
			return base.substring(lcampPOS, lcampEND);
		}
		void lcamp (String lcamp) {
			refresh();
			base = base.substring(0, lcampPOS) + String.format("%-"+lcampLEN+"s", lcamp).substring(0, lcampLEN) + base.substring(lcampEND);
		}
		String ldisp () {
			refresh();
			return base.substring(ldispPOS, ldispEND);
		}
		void ldisp (String ldisp) {
			refresh();
			base = base.substring(0, ldispPOS) + String.format("%-"+ldispLEN+"s", ldisp).substring(0, ldispLEN) + base.substring(ldispEND);
		}
		String fprog () {
			refresh();
			return base.substring(fprogPOS, fprogEND);
		}
		void fprog (String fprog) {
			refresh();
			base = base.substring(0, fprogPOS) + String.format("%-"+fprogLEN+"s", fprog).substring(0, fprogLEN) + base.substring(fprogEND);
		}
		String llevl () {
			refresh();
			return base.substring(llevlPOS, llevlEND);
		}
		void llevl (String llevl) {
			refresh();
			base = base.substring(0, llevlPOS) + String.format("%-"+llevlLEN+"s", llevl).substring(0, llevlLEN) + base.substring(llevlEND);
		}
		String lset () {
			refresh();
			return base.substring(lsetPOS, lsetEND);
		}
		void lset (String lset) {
			refresh();
			base = base.substring(0, lsetPOS) + String.format("%-"+lsetLEN+"s", lset).substring(0, lsetLEN) + base.substring(lsetEND);
		}
		String lscrpt () {
			refresh();
			return base.substring(lscrptPOS, lscrptEND);
		}
		void lscrpt (String lscrpt) {
			refresh();
			base = base.substring(0, lscrptPOS) + String.format("%-"+lscrptLEN+"s", lscrpt).substring(0, lscrptLEN) + base.substring(lscrptEND);
		}
		String lscod () {
			refresh();
			return base.substring(lscodPOS, lscodEND);
		}
		void lscod (String lscod) {
			refresh();
			base = base.substring(0, lscodPOS) + String.format("%-"+lscodLEN+"s", lscod).substring(0, lscodLEN) + base.substring(lscodEND);
		}
		String lappl () {
			refresh();
			return base.substring(lapplPOS, lapplEND);
		}
		void lappl (String lappl) {
			refresh();
			base = base.substring(0, lapplPOS) + String.format("%-"+lapplLEN+"s", lappl).substring(0, lapplLEN) + base.substring(lapplEND);
		}
		String lldsrc () {
			refresh();
			return base.substring(lldsrcPOS, lldsrcEND);
		}
		void lldsrc (String lldsrc) {
			refresh();
			base = base.substring(0, lldsrcPOS) + String.format("%-"+lldsrcLEN+"s", lldsrc).substring(0, lldsrcLEN) + base.substring(lldsrcEND);
		}
		String lfld () {
			refresh();
			return base.substring(lfldPOS, lfldEND);
		}
		void lfld (String lfld) {
			refresh();
			base = base.substring(0, lfldPOS) + String.format("%-"+lfldLEN+"s", lfld).substring(0, lfldLEN) + base.substring(lfldEND);
		}
		String lfdesc () {
			refresh();
			return base.substring(lfdescPOS, lfdescEND);
		}
		void lfdesc (String lfdesc) {
			refresh();
			base = base.substring(0, lfdescPOS) + String.format("%-"+lfdescLEN+"s", lfdesc).substring(0, lfdescLEN) + base.substring(lfdescEND);
		}
		String ltyp () {
			refresh();
			return base.substring(ltypPOS, ltypEND);
		}
		void ltyp (String ltyp) {
			refresh();
			base = base.substring(0, ltypPOS) + String.format("%-"+ltypLEN+"s", ltyp).substring(0, ltypLEN) + base.substring(ltypEND);
		}
		String lval () {
			refresh();
			return base.substring(lvalPOS, lvalEND);
		}
		void lval (String lval) {
			refresh();
			base = base.substring(0, lvalPOS) + String.format("%-"+lvalLEN+"s", lval).substring(0, lvalLEN) + base.substring(lvalEND);
		}
		String linc_ () {
			refresh();
			return base.substring(linc_POS, linc_END);
		}
		void linc_ (String linc_) {
			refresh();
			base = base.substring(0, linc_POS) + String.format("%-"+linc_LEN+"s", linc_).substring(0, linc_LEN) + base.substring(linc_END);
		}
		String linct () {
			refresh();
			return base.substring(linctPOS, linctEND);
		}
		void linct (String linct) {
			refresh();
			base = base.substring(0, linctPOS) + String.format("%-"+linctLEN+"s", linct).substring(0, linctLEN) + base.substring(linctEND);
		}
		String lstep () {
			refresh();
			return base.substring(lstepPOS, lstepEND);
		}
		void lstep (String lstep) {
			refresh();
			base = base.substring(0, lstepPOS) + String.format("%-"+lstepLEN+"s", lstep).substring(0, lstepLEN) + base.substring(lstepEND);
		}
		String ltask () {
			refresh();
			return base.substring(ltaskPOS, ltaskEND);
		}
		void ltask (String ltask) {
			refresh();
			base = base.substring(0, ltaskPOS) + String.format("%-"+ltaskLEN+"s", ltask).substring(0, ltaskLEN) + base.substring(ltaskEND);
		}
		String lprent () {
			refresh();
			return base.substring(lprentPOS, lprentEND);
		}
		void lprent (String lprent) {
			refresh();
			base = base.substring(0, lprentPOS) + String.format("%-"+lprentLEN+"s", lprent).substring(0, lprentLEN) + base.substring(lprentEND);
		}
		String lzip () {
			refresh();
			return base.substring(lzipPOS, lzipEND);
		}
		void lzip (String lzip) {
			refresh();
			base = base.substring(0, lzipPOS) + String.format("%-"+lzipLEN+"s", lzip).substring(0, lzipLEN) + base.substring(lzipEND);
		}
		String lcat () {
			refresh();
			return base.substring(lcatPOS, lcatEND);
		}
		void lcat (String lcat) {
			refresh();
			base = base.substring(0, lcatPOS) + String.format("%-"+lcatLEN+"s", lcat).substring(0, lcatLEN) + base.substring(lcatEND);
		}
		String lstate () {
			refresh();
			return base.substring(lstatePOS, lstateEND);
		}
		void lstate (String lstate) {
			refresh();
			base = base.substring(0, lstatePOS) + String.format("%-"+lstateLEN+"s", lstate).substring(0, lstateLEN) + base.substring(lstateEND);
		}
		String lcity () {
			refresh();
			return base.substring(lcityPOS, lcityEND);
		}
		void lcity (String lcity) {
			refresh();
			base = base.substring(0, lcityPOS) + String.format("%-"+lcityLEN+"s", lcity).substring(0, lcityLEN) + base.substring(lcityEND);
		}
		String aphone () {
			refresh();
			return base.substring(aphonePOS, aphoneEND);
		}
		void aphone (String aphone) {
			refresh();
			base = base.substring(0, aphonePOS) + String.format("%-"+aphoneLEN+"s", aphone).substring(0, aphoneLEN) + base.substring(aphoneEND);
		}
		String laff () {
			refresh();
			return base.substring(laffPOS, laffEND);
		}
		void laff (String laff) {
			refresh();
			base = base.substring(0, laffPOS) + String.format("%-"+laffLEN+"s", laff).substring(0, laffLEN) + base.substring(laffEND);
		}
		String lcmdky () {
			refresh();
			return base.substring(lcmdkyPOS, lcmdkyEND);
		}
		void lcmdky (String lcmdky) {
			refresh();
			base = base.substring(0, lcmdkyPOS) + String.format("%-"+lcmdkyLEN+"s", lcmdky).substring(0, lcmdkyLEN) + base.substring(lcmdkyEND);
		}
		String lptype () {
			refresh();
			return base.substring(lptypePOS, lptypeEND);
		}
		void lptype (String lptype) {
			refresh();
			base = base.substring(0, lptypePOS) + String.format("%-"+lptypeLEN+"s", lptype).substring(0, lptypeLEN) + base.substring(lptypeEND);
		}
		String lterr () {
			refresh();
			return base.substring(lterrPOS, lterrEND);
		}
		void lterr (String lterr) {
			refresh();
			base = base.substring(0, lterrPOS) + String.format("%-"+lterrLEN+"s", lterr).substring(0, lterrLEN) + base.substring(lterrEND);
		}
		String lpromo () {
			refresh();
			return base.substring(lpromoPOS, lpromoEND);
		}
		void lpromo (String lpromo) {
			refresh();
			base = base.substring(0, lpromoPOS) + String.format("%-"+lpromoLEN+"s", lpromo).substring(0, lpromoLEN) + base.substring(lpromoEND);
		}
		String lrpid () {
			refresh();
			return base.substring(lrpidPOS, lrpidEND);
		}
		void lrpid (String lrpid) {
			refresh();
			base = base.substring(0, lrpidPOS) + String.format("%-"+lrpidLEN+"s", lrpid).substring(0, lrpidLEN) + base.substring(lrpidEND);
		}
		String lsystp () {
			refresh();
			return base.substring(lsystpPOS, lsystpEND);
		}
		void lsystp (String lsystp) {
			refresh();
			base = base.substring(0, lsystpPOS) + String.format("%-"+lsystpLEN+"s", lsystp).substring(0, lsystpLEN) + base.substring(lsystpEND);
		}
		String lpakag () {
			refresh();
			return base.substring(lpakagPOS, lpakagEND);
		}
		void lpakag (String lpakag) {
			refresh();
			base = base.substring(0, lpakagPOS) + String.format("%-"+lpakagLEN+"s", lpakag).substring(0, lpakagLEN) + base.substring(lpakagEND);
		}
		String lwrcde () {
			refresh();
			return base.substring(lwrcdePOS, lwrcdeEND);
		}
		void lwrcde (String lwrcde) {
			refresh();
			base = base.substring(0, lwrcdePOS) + String.format("%-"+lwrcdeLEN+"s", lwrcde).substring(0, lwrcdeLEN) + base.substring(lwrcdeEND);
		}
		String lwacat () {
			refresh();
			return base.substring(lwacatPOS, lwacatEND);
		}
		void lwacat (String lwacat) {
			refresh();
			base = base.substring(0, lwacatPOS) + String.format("%-"+lwacatLEN+"s", lwacat).substring(0, lwacatLEN) + base.substring(lwacatEND);
		}
		String lbterr () {
			refresh();
			return base.substring(lbterrPOS, lbterrEND);
		}
		void lbterr (String lbterr) {
			refresh();
			base = base.substring(0, lbterrPOS) + String.format("%-"+lbterrLEN+"s", lbterr).substring(0, lbterrLEN) + base.substring(lbterrEND);
		}
		String lquseq () {
			refresh();
			return base.substring(lquseqPOS, lquseqEND);
		}
		void lquseq (String lquseq) {
			refresh();
			base = base.substring(0, lquseqPOS) + String.format("%-"+lquseqLEN+"s", lquseq).substring(0, lquseqLEN) + base.substring(lquseqEND);
		}
		String ltasks () {
			refresh();
			return base.substring(ltasksPOS, ltasksEND);
		}
		void ltasks (String ltasks) {
			refresh();
			base = base.substring(0, ltasksPOS) + String.format("%-"+ltasksLEN+"s", ltasks).substring(0, ltasksLEN) + base.substring(ltasksEND);
		}
		String lnewac () {
			refresh();
			return base.substring(lnewacPOS, lnewacEND);
		}
		void lnewac (String lnewac) {
			refresh();
			base = base.substring(0, lnewacPOS) + String.format("%-"+lnewacLEN+"s", lnewac).substring(0, lnewacLEN) + base.substring(lnewacEND);
		}
		String laterr () {
			refresh();
			return base.substring(laterrPOS, laterrEND);
		}
		void laterr (String laterr) {
			refresh();
			base = base.substring(0, laterrPOS) + String.format("%-"+laterrLEN+"s", laterr).substring(0, laterrLEN) + base.substring(laterrEND);
		}
		String lprocc () {
			refresh();
			return base.substring(lproccPOS, lproccEND);
		}
		void lprocc (String lprocc) {
			refresh();
			base = base.substring(0, lproccPOS) + String.format("%-"+lproccLEN+"s", lprocc).substring(0, lproccLEN) + base.substring(lproccEND);
		}
		String lschno () {
			refresh();
			return base.substring(lschnoPOS, lschnoEND);
		}
		void lschno (String lschno) {
			refresh();
			base = base.substring(0, lschnoPOS) + String.format("%-"+lschnoLEN+"s", lschno).substring(0, lschnoLEN) + base.substring(lschnoEND);
		}
		String lbtime () {
			refresh();
			return base.substring(lbtimePOS, lbtimeEND);
		}
		void lbtime (String lbtime) {
			refresh();
			base = base.substring(0, lbtimePOS) + String.format("%-"+lbtimeLEN+"s", lbtime).substring(0, lbtimeLEN) + base.substring(lbtimeEND);
		}
		String letime () {
			refresh();
			return base.substring(letimePOS, letimeEND);
		}
		void letime (String letime) {
			refresh();
			base = base.substring(0, letimePOS) + String.format("%-"+letimeLEN+"s", letime).substring(0, letimeLEN) + base.substring(letimeEND);
		}
		String ldtim () {
			refresh();
			return base.substring(ldtimPOS, ldtimEND);
		}
		void ldtim (String ldtim) {
			refresh();
			base = base.substring(0, ldtimPOS) + String.format("%-"+ldtimLEN+"s", ldtim).substring(0, ldtimLEN) + base.substring(ldtimEND);
		}
		String ltime () {
			refresh();
			return base.substring(ltimePOS, ltimeEND);
		}
		void ltime (String ltime) {
			refresh();
			base = base.substring(0, ltimePOS) + String.format("%-"+ltimeLEN+"s", ltime).substring(0, ltimeLEN) + base.substring(ltimeEND);
		}
		String lduhr () {
			refresh();
			return base.substring(lduhrPOS, lduhrEND);
		}
		void lduhr (String lduhr) {
			refresh();
			base = base.substring(0, lduhrPOS) + String.format("%-"+lduhrLEN+"s", lduhr).substring(0, lduhrLEN) + base.substring(lduhrEND);
		}
		String ldumn () {
			refresh();
			return base.substring(ldumnPOS, ldumnEND);
		}
		void ldumn (String ldumn) {
			refresh();
			base = base.substring(0, ldumnPOS) + String.format("%-"+ldumnLEN+"s", ldumn).substring(0, ldumnLEN) + base.substring(ldumnEND);
		}
		String lgavl () {
			refresh();
			return base.substring(lgavlPOS, lgavlEND);
		}
		void lgavl (String lgavl) {
			refresh();
			base = base.substring(0, lgavlPOS) + String.format("%-"+lgavlLEN+"s", lgavl).substring(0, lgavlLEN) + base.substring(lgavlEND);
		}
		String lddnis () {
			refresh();
			return base.substring(lddnisPOS, lddnisEND);
		}
		void lddnis (String lddnis) {
			refresh();
			base = base.substring(0, lddnisPOS) + String.format("%-"+lddnisLEN+"s", lddnis).substring(0, lddnisLEN) + base.substring(lddnisEND);
		}
		String ldani () {
			refresh();
			return base.substring(ldaniPOS, ldaniEND);
		}
		void ldani (String ldani) {
			refresh();
			base = base.substring(0, ldaniPOS) + String.format("%-"+ldaniLEN+"s", ldani).substring(0, ldaniLEN) + base.substring(ldaniEND);
		}
		String ldmode () {
			refresh();
			return base.substring(ldmodePOS, ldmodeEND);
		}
		void ldmode (String ldmode) {
			refresh();
			base = base.substring(0, ldmodePOS) + String.format("%-"+ldmodeLEN+"s", ldmode).substring(0, ldmodeLEN) + base.substring(ldmodeEND);
		}
		String ltmode () {
			refresh();
			return base.substring(ltmodePOS, ltmodeEND);
		}
		void ltmode (String ltmode) {
			refresh();
			base = base.substring(0, ltmodePOS) + String.format("%-"+ltmodeLEN+"s", ltmode).substring(0, ltmodeLEN) + base.substring(ltmodeEND);
		}
		String lsubt () {
			refresh();
			return base.substring(lsubtPOS, lsubtEND);
		}
		void lsubt (String lsubt) {
			refresh();
			base = base.substring(0, lsubtPOS) + String.format("%-"+lsubtLEN+"s", lsubt).substring(0, lsubtLEN) + base.substring(lsubtEND);
		}
		String lsgd () {
			refresh();
			return base.substring(lsgdPOS, lsgdEND);
		}
		void lsgd (String lsgd) {
			refresh();
			base = base.substring(0, lsgdPOS) + String.format("%-"+lsgdLEN+"s", lsgd).substring(0, lsgdLEN) + base.substring(lsgdEND);
		}
		String lentf () {
			refresh();
			return base.substring(lentfPOS, lentfEND);
		}
		void lentf (String lentf) {
			refresh();
			base = base.substring(0, lentfPOS) + String.format("%-"+lentfLEN+"s", lentf).substring(0, lentfLEN) + base.substring(lentfEND);
		}
		String lacten () {
			refresh();
			return base.substring(lactenPOS, lactenEND);
		}
		void lacten (String lacten) {
			refresh();
			base = base.substring(0, lactenPOS) + String.format("%-"+lactenLEN+"s", lacten).substring(0, lactenLEN) + base.substring(lactenEND);
		}
		String lentn () {
			refresh();
			return base.substring(lentnPOS, lentnEND);
		}
		void lentn (String lentn) {
			refresh();
			base = base.substring(0, lentnPOS) + String.format("%-"+lentnLEN+"s", lentn).substring(0, lentnLEN) + base.substring(lentnEND);
		}
		String lqueue () {
			refresh();
			return base.substring(lqueuePOS, lqueueEND);
		}
		void lqueue (String lqueue) {
			refresh();
			base = base.substring(0, lqueuePOS) + String.format("%-"+lqueueLEN+"s", lqueue).substring(0, lqueueLEN) + base.substring(lqueueEND);
		}
		String ltype () {
			refresh();
			return base.substring(ltypePOS, ltypeEND);
		}
		void ltype (String ltype) {
			refresh();
			base = base.substring(0, ltypePOS) + String.format("%-"+ltypeLEN+"s", ltype).substring(0, ltypeLEN) + base.substring(ltypeEND);
		}
		String lphone () {
			refresh();
			return base.substring(lphonePOS, lphoneEND);
		}
		void lphone (String lphone) {
			refresh();
			base = base.substring(0, lphonePOS) + String.format("%-"+lphoneLEN+"s", lphone).substring(0, lphoneLEN) + base.substring(lphoneEND);
		}
		String lrtnc () {
			refresh();
			return base.substring(lrtncPOS, lrtncEND);
		}
		void lrtnc (String lrtnc) {
			refresh();
			base = base.substring(0, lrtncPOS) + String.format("%-"+lrtncLEN+"s", lrtnc).substring(0, lrtncLEN) + base.substring(lrtncEND);
		}
		String lwsid () {
			refresh();
			return base.substring(lwsidPOS, lwsidEND);
		}
		void lwsid (String lwsid) {
			refresh();
			base = base.substring(0, lwsidPOS) + String.format("%-"+lwsidLEN+"s", lwsid).substring(0, lwsidLEN) + base.substring(lwsidEND);
		}
		String lshft () {
			refresh();
			return base.substring(lshftPOS, lshftEND);
		}
		void lshft (String lshft) {
			refresh();
			base = base.substring(0, lshftPOS) + String.format("%-"+lshftLEN+"s", lshft).substring(0, lshftLEN) + base.substring(lshftEND);
		}
		String lacct () {
			refresh();
			return base.substring(lacctPOS, lacctEND);
		}
		void lacct (String lacct) {
			refresh();
			base = base.substring(0, lacctPOS) + String.format("%-"+lacctLEN+"s", lacct).substring(0, lacctLEN) + base.substring(lacctEND);
		}
		String lsdat () {
			refresh();
			return base.substring(lsdatPOS, lsdatEND);
		}
		void lsdat (String lsdat) {
			refresh();
			base = base.substring(0, lsdatPOS) + String.format("%-"+lsdatLEN+"s", lsdat).substring(0, lsdatLEN) + base.substring(lsdatEND);
		}
		String ldate () {
			refresh();
			return base.substring(ldatePOS, ldateEND);
		}
		void ldate (String ldate) {
			refresh();
			base = base.substring(0, ldatePOS) + String.format("%-"+ldateLEN+"s", ldate).substring(0, ldateLEN) + base.substring(ldateEND);
		}
		String lrcldt () {
			refresh();
			return base.substring(lrcldtPOS, lrcldtEND);
		}
		void lrcldt (String lrcldt) {
			refresh();
			base = base.substring(0, lrcldtPOS) + String.format("%-"+lrcldtLEN+"s", lrcldt).substring(0, lrcldtLEN) + base.substring(lrcldtEND);
		}
		String litem () {
			refresh();
			return base.substring(litemPOS, litemEND);
		}
		void litem (String litem) {
			refresh();
			base = base.substring(0, litemPOS) + String.format("%-"+litemLEN+"s", litem).substring(0, litemLEN) + base.substring(litemEND);
		}
		String lrtyp () {
			refresh();
			return base.substring(lrtypPOS, lrtypEND);
		}
		void lrtyp (String lrtyp) {
			refresh();
			base = base.substring(0, lrtypPOS) + String.format("%-"+lrtypLEN+"s", lrtyp).substring(0, lrtypLEN) + base.substring(lrtypEND);
		}
		String recseq () {
			refresh();
			return base.substring(recseqPOS, recseqEND);
		}
		void recseq (String recseq) {
			refresh();
			base = base.substring(0, recseqPOS) + String.format("%-"+recseqLEN+"s", recseq).substring(0, recseqLEN) + base.substring(recseqEND);
		}
		String lcgflg () {
			refresh();
			return base.substring(lcgflgPOS, lcgflgEND);
		}
		void lcgflg (String lcgflg) {
			refresh();
			base = base.substring(0, lcgflgPOS) + String.format("%-"+lcgflgLEN+"s", lcgflg).substring(0, lcgflgLEN) + base.substring(lcgflgEND);
		}
		String ldesc () {
			refresh();
			return base.substring(ldescPOS, ldescEND);
		}
		void ldesc (String ldesc) {
			refresh();
			base = base.substring(0, ldescPOS) + String.format("%-"+ldescLEN+"s", ldesc).substring(0, ldescLEN) + base.substring(ldescEND);
		}
		String puser () {
			refresh();
			return base.substring(puserPOS, puserEND);
		}
		void puser (String puser) {
			refresh();
			base = base.substring(0, puserPOS) + String.format("%-"+puserLEN+"s", puser).substring(0, puserLEN) + base.substring(puserEND);
		}
		String lrclus () {
			refresh();
			return base.substring(lrclusPOS, lrclusEND);
		}
		void lrclus (String lrclus) {
			refresh();
			base = base.substring(0, lrclusPOS) + String.format("%-"+lrclusLEN+"s", lrclus).substring(0, lrclusLEN) + base.substring(lrclusEND);
		}
		String lsusp () {
			refresh();
			return base.substring(lsuspPOS, lsuspEND);
		}
		void lsusp (String lsusp) {
			refresh();
			base = base.substring(0, lsuspPOS) + String.format("%-"+lsuspLEN+"s", lsusp).substring(0, lsuspLEN) + base.substring(lsuspEND);
		}
		String lfunc () {
			refresh();
			return base.substring(lfuncPOS, lfuncEND);
		}
		void lfunc (String lfunc) {
			refresh();
			base = base.substring(0, lfuncPOS) + String.format("%-"+lfuncLEN+"s", lfunc).substring(0, lfuncLEN) + base.substring(lfuncEND);
		}
		String lmtyp () {
			refresh();
			return base.substring(lmtypPOS, lmtypEND);
		}
		void lmtyp (String lmtyp) {
			refresh();
			base = base.substring(0, lmtypPOS) + String.format("%-"+lmtypLEN+"s", lmtyp).substring(0, lmtypLEN) + base.substring(lmtypEND);
		}
		String lcf01 () {
			refresh();
			return base.substring(lcf01POS, lcf01END);
		}
		void lcf01 (String lcf01) {
			refresh();
			base = base.substring(0, lcf01POS) + String.format("%-"+lcf01LEN+"s", lcf01).substring(0, lcf01LEN) + base.substring(lcf01END);
		}
		String prdrf () {
			refresh();
			return base.substring(prdrfPOS, prdrfEND);
		}
		void prdrf (String prdrf) {
			refresh();
			base = base.substring(0, prdrfPOS) + String.format("%-"+prdrfLEN+"s", prdrf).substring(0, prdrfLEN) + base.substring(prdrfEND);
		}
		Integer lrcltm () {
			refresh();
			return Integer.parseInt(base.substring(lrcltmPOS, lrcltmEND));
		}
		void lrcltm (Integer lrcltm) {
			refresh();
			base = base.substring(0, lrcltmPOS) + String.format("%-"+lrcltmLEN+"s", lrcltm).substring(0, lrcltmLEN) + base.substring(lrcltmEND);
		}
		String ptask () {
			refresh();
			return base.substring(ptaskPOS, ptaskEND);
		}
		void ptask (String ptask) {
			refresh();
			base = base.substring(0, ptaskPOS) + String.format("%-"+ptaskLEN+"s", ptask).substring(0, ptaskLEN) + base.substring(ptaskEND);
		}
		String lqsrc () {
			refresh();
			return base.substring(lqsrcPOS, lqsrcEND);
		}
		void lqsrc (String lqsrc) {
			refresh();
			base = base.substring(0, lqsrcPOS) + String.format("%-"+lqsrcLEN+"s", lqsrc).substring(0, lqsrcLEN) + base.substring(lqsrcEND);
		}
		String lslstp () {
			refresh();
			return base.substring(lslstpPOS, lslstpEND);
		}
		void lslstp (String lslstp) {
			refresh();
			base = base.substring(0, lslstpPOS) + String.format("%-"+lslstpLEN+"s", lslstp).substring(0, lslstpLEN) + base.substring(lslstpEND);
		}
		String lqucal () {
			refresh();
			return base.substring(lqucalPOS, lqucalEND);
		}
		void lqucal (String lqucal) {
			refresh();
			base = base.substring(0, lqucalPOS) + String.format("%-"+lqucalLEN+"s", lqucal).substring(0, lqucalLEN) + base.substring(lqucalEND);
		}
		void refresh () {
		}
	}

		public static class QuentdDS {
		Integer quentdPOS = 0; 	Integer quentdLEN = 8;	Integer quentdEND = 8;
		Quhdr rQuhdr;
		Integer $qyrPOS = 0; 	Integer $qyrLEN = 4;	Integer $qyrEND = 4;
		Integer $qmmddPOS = 4; 	Integer $qmmddLEN = 4;	Integer $qmmddEND = 8;
		String base = "        ";
		String quentd (Quhdr rquhdr) {
			this.rQuhdr = rquhdr;
			refresh();
			return base.substring(quentdPOS, quentdEND);
		}
		void quentd (String quentd, Quhdr rquhdr) {
			this.rQuhdr = rquhdr;
			refresh();
			base = base.substring(0, quentdPOS) + String.format("%-"+quentdLEN+"s", quentd).substring(0, quentdLEN) + base.substring(quentdEND);
			rQuhdr.setQuentd(base.substring(quentdPOS, quentdEND));
		}
		String $qyr () {
			refresh();
			return base.substring($qyrPOS, $qyrEND);
		}
		void $qyr (String $qyr) {
			refresh();
			base = base.substring(0, $qyrPOS) + String.format("%-"+$qyrLEN+"s", $qyr).substring(0, $qyrLEN) + base.substring($qyrEND);
		}
		String $qmmdd () {
			refresh();
			return base.substring($qmmddPOS, $qmmddEND);
		}
		void $qmmdd (String $qmmdd) {
			refresh();
			base = base.substring(0, $qmmddPOS) + String.format("%-"+$qmmddLEN+"s", $qmmdd).substring(0, $qmmddLEN) + base.substring($qmmddEND);
		}
		void refresh () {
					if (rQuhdr.getQuentd() != null) {
				base = base.substring(0, quentdPOS) + String.format("%-"+quentdLEN+"s", rQuhdr.getQuentd()).subSequence(quentdPOS, quentdLEN) + base.substring(quentdEND);
			} else {
				base = base.substring(0, quentdPOS) + String.format("%-"+quentdLEN+"s", " ") + base.substring(quentdEND);
			}
		}
	}

		public static class MphoneDS {
		Integer mphonePOS = 0; 	Integer mphoneLEN = 17;	Integer mphoneEND = 17;
		Market rMarket;
		Integer $ph1POS = 0; 	Integer $ph1LEN = 3;	Integer $ph1END = 3;
		Integer $ph2POS = 4; 	Integer $ph2LEN = 3;	Integer $ph2END = 7;
		Integer $ph3POS = 8; 	Integer $ph3LEN = 4;	Integer $ph3END = 12;
		Integer $ph4POS = 13; 	Integer $ph4LEN = 4;	Integer $ph4END = 17;
		String base = "                 ";
		String mphone (Market rmarket) {
			this.rMarket = rmarket;
			refresh();
			return base.substring(mphonePOS, mphoneEND);
		}
		void mphone (String mphone, Market rmarket) {
			this.rMarket = rmarket;
			refresh();
			base = base.substring(0, mphonePOS) + String.format("%-"+mphoneLEN+"s", mphone).substring(0, mphoneLEN) + base.substring(mphoneEND);
			rMarket.setMphone(base.substring(mphonePOS, mphoneEND));
		}
		String $ph1 () {
			refresh();
			return base.substring($ph1POS, $ph1END);
		}
		void $ph1 (String $ph1) {
			refresh();
			base = base.substring(0, $ph1POS) + String.format("%-"+$ph1LEN+"s", $ph1).substring(0, $ph1LEN) + base.substring($ph1END);
		}
		String $ph2 () {
			refresh();
			return base.substring($ph2POS, $ph2END);
		}
		void $ph2 (String $ph2) {
			refresh();
			base = base.substring(0, $ph2POS) + String.format("%-"+$ph2LEN+"s", $ph2).substring(0, $ph2LEN) + base.substring($ph2END);
		}
		String $ph3 () {
			refresh();
			return base.substring($ph3POS, $ph3END);
		}
		void $ph3 (String $ph3) {
			refresh();
			base = base.substring(0, $ph3POS) + String.format("%-"+$ph3LEN+"s", $ph3).substring(0, $ph3LEN) + base.substring($ph3END);
		}
		String $ph4 () {
			refresh();
			return base.substring($ph4POS, $ph4END);
		}
		void $ph4 (String $ph4) {
			refresh();
			base = base.substring(0, $ph4POS) + String.format("%-"+$ph4LEN+"s", $ph4).substring(0, $ph4LEN) + base.substring($ph4END);
		}
		void refresh () {
					if (rMarket.getMphone() != null) {
				base = base.substring(0, mphonePOS) + String.format("%-"+mphoneLEN+"s", rMarket.getMphone()).subSequence(mphonePOS, mphoneLEN) + base.substring(mphoneEND);
			} else {
				base = base.substring(0, mphonePOS) + String.format("%-"+mphoneLEN+"s", " ") + base.substring(mphoneEND);
			}
		}
	}

		public static class MkactyDS {
		Integer mkactyPOS = 0; 	Integer mkactyLEN = 3;	Integer mkactyEND = 3;
		Mktadd rMktadd;
		Integer $campPOS = 2; 	Integer $campLEN = 1;	Integer $campEND = 3;
		String base = "   ";
		String mkacty (Mktadd rmktadd) {
			this.rMktadd = rmktadd;
			refresh();
			return base.substring(mkactyPOS, mkactyEND);
		}
		void mkacty (String mkacty, Mktadd rmktadd) {
			this.rMktadd = rmktadd;
			refresh();
			base = base.substring(0, mkactyPOS) + String.format("%-"+mkactyLEN+"s", mkacty).substring(0, mkactyLEN) + base.substring(mkactyEND);
			rMktadd.setMkacty(base.substring(mkactyPOS, mkactyEND));
		}
		String $camp () {
			refresh();
			return base.substring($campPOS, $campEND);
		}
		void $camp (String $camp) {
			refresh();
			base = base.substring(0, $campPOS) + String.format("%-"+$campLEN+"s", $camp).substring(0, $campLEN) + base.substring($campEND);
		}
		void refresh () {
					if (rMktadd.getMkacty() != null) {
				base = base.substring(0, mkactyPOS) + String.format("%-"+mkactyLEN+"s", rMktadd.getMkacty()).subSequence(mkactyPOS, mkactyLEN) + base.substring(mkactyEND);
			} else {
				base = base.substring(0, mkactyPOS) + String.format("%-"+mkactyLEN+"s", " ") + base.substring(mkactyEND);
			}
		}
	}

	public static class ChsparmsDS {
		Integer chspkgPOS = 0; 	Integer chspkgLEN = 15;	Integer chspkgEND = 15;
		Sh200sfm rSh200sfm;
		Integer chswarcPOS = 15; 	Integer chswarcLEN = 3;	Integer chswarcEND = 18;
		Integer chsadscPOS = 18; 	Integer chsadscLEN = 7;	Integer chsadscEND = 25;
		Integer chsanscPOS = 25; 	Integer chsanscLEN = 7;	Integer chsanscEND = 32;
		Integer chsseqPOS = 32; 	Integer chsseqLEN = 3;	Integer chsseqEND = 35;
		Integer chsparmsPOS = 0; 	Integer chsparmsLEN = 35;	Integer chsparmsEND = 35;
		String base = "                                   ";
		String chsparms () {
			refresh();
			return base.substring(chsparmsPOS, chsparmsEND);
		}
		void chsparms (String chsparms) {
			refresh();
			base = base.substring(0, chsparmsPOS) + String.format("%-"+chsparmsLEN+"s", chsparms).substring(0, chsparmsLEN) + base.substring(chsparmsEND);
		}
		String chspkg (Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			return base.substring(chspkgPOS, chspkgEND);
		}
		void chspkg (String chspkg, Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			base = base.substring(0, chspkgPOS) + String.format("%-"+chspkgLEN+"s", chspkg).substring(0, chspkgLEN) + base.substring(chspkgEND);
			rSh200sfm.setChspkg(base.substring(chspkgPOS, chspkgEND));
		}
		String chswarc (Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			return base.substring(chswarcPOS, chswarcEND);
		}
		void chswarc (String chswarc, Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			base = base.substring(0, chswarcPOS) + String.format("%-"+chswarcLEN+"s", chswarc).substring(0, chswarcLEN) + base.substring(chswarcEND);
			rSh200sfm.setChswarc(base.substring(chswarcPOS, chswarcEND));
		}
		float chsadsc (Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			return Float.parseFloat(base.substring(chsadscPOS, chsadscEND));
		}
		void chsadsc (float chsadsc, Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			base = base.substring(0, chsadscPOS) + String.format("%-"+chsadscLEN+"s", chsadsc).substring(0, chsadscLEN) + base.substring(chsadscEND);
			rSh200sfm.setChsadsc(Float.parseFloat(base.substring(chsadscPOS, chsadscEND)));
		}
		float chsansc (Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			return Float.parseFloat(base.substring(chsanscPOS, chsanscEND));
		}
		void chsansc (float chsansc, Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			base = base.substring(0, chsanscPOS) + String.format("%-"+chsanscLEN+"s", chsansc).substring(0, chsanscLEN) + base.substring(chsanscEND);
			rSh200sfm.setChsansc(Float.parseFloat(base.substring(chsanscPOS, chsanscEND)));
		}
		Integer chsseq (Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			return Integer.parseInt(base.substring(chsseqPOS, chsseqEND));
		}
		void chsseq (Integer chsseq, Sh200sfm rsh200sfm) {
			this.rSh200sfm = rsh200sfm;
			refresh();
			base = base.substring(0, chsseqPOS) + String.format("%-"+chsseqLEN+"s", chsseq).substring(0, chsseqLEN) + base.substring(chsseqEND);
			rSh200sfm.setChsseq(Integer.parseInt(base.substring(chsseqPOS, chsseqEND)));
		}
		void refresh () {
					if (rSh200sfm.getChspkg() != null) {
				base = base.substring(0, chspkgPOS) + String.format("%-"+chspkgLEN+"s", rSh200sfm.getChspkg()).subSequence(chspkgPOS, chspkgLEN) + base.substring(chspkgEND);
			} else {
				base = base.substring(0, chspkgPOS) + String.format("%-"+chspkgLEN+"s", " ") + base.substring(chspkgEND);
			}
					if (rSh200sfm.getChswarc() != null) {
				base = base.substring(0, chswarcPOS) + String.format("%-"+chswarcLEN+"s", rSh200sfm.getChswarc()).subSequence(chswarcPOS, chswarcLEN) + base.substring(chswarcEND);
			} else {
				base = base.substring(0, chswarcPOS) + String.format("%-"+chswarcLEN+"s", " ") + base.substring(chswarcEND);
			}
					if (String.valueOf(rSh200sfm.getChsadsc()) != null) {
				base = base.substring(0, chsadscPOS) + String.format("%-"+chsadscLEN+"s", rSh200sfm.getChsadsc()).subSequence(chsadscPOS, chsadscLEN) + base.substring(chsadscEND);
			} else {
				base = base.substring(0, chsadscPOS) + String.format("%-"+chsadscLEN+"s", " ") + base.substring(chsadscEND);
			}
					if (String.valueOf(rSh200sfm.getChsansc()) != null) {
				base = base.substring(0, chsanscPOS) + String.format("%-"+chsanscLEN+"s", rSh200sfm.getChsansc()).subSequence(chsanscPOS, chsanscLEN) + base.substring(chsanscEND);
			} else {
				base = base.substring(0, chsanscPOS) + String.format("%-"+chsanscLEN+"s", " ") + base.substring(chsanscEND);
			}
					if (rSh200sfm.getChsseq() != null) {
				base = base.substring(0, chsseqPOS) + String.format("%-"+chsseqLEN+"s", rSh200sfm.getChsseq()).subSequence(chsseqPOS, chsseqLEN) + base.substring(chsseqEND);
			} else {
				base = base.substring(0, chsseqPOS) + String.format("%-"+chsseqLEN+"s", " ") + base.substring(chsseqEND);
			}
		}
	}

		public static class In2kx8DS {
		Integer in2kx8POS = 0; 	Integer in2kx8LEN = 8;	Integer in2kx8END = 8;
		Integer in2kx6POS = 0; 	Integer in2kx6LEN = 6;	Integer in2kx6END = 6;
		Integer in2kx4POS = 0; 	Integer in2kx4LEN = 4;	Integer in2kx4END = 4;
		Integer in2kp1POS = 0; 	Integer in2kp1LEN = 2;	Integer in2kp1END = 2;
		Integer in2kp2POS = 2; 	Integer in2kp2LEN = 2;	Integer in2kp2END = 4;
		Integer in2kp3POS = 4; 	Integer in2kp3LEN = 2;	Integer in2kp3END = 6;
		Integer in2kp4POS = 6; 	Integer in2kp4LEN = 2;	Integer in2kp4END = 8;
		String base = "        ";
		Integer in2kx8 () {
			refresh();
			return Integer.parseInt(base.substring(in2kx8POS, in2kx8END));
		}
		void in2kx8 (Integer in2kx8) {
			refresh();
			base = base.substring(0, in2kx8POS) + String.format("%-"+in2kx8LEN+"s", in2kx8).substring(0, in2kx8LEN) + base.substring(in2kx8END);
		}
		Integer in2kx6 () {
			refresh();
			return Integer.parseInt(base.substring(in2kx6POS, in2kx6END));
		}
		void in2kx6 (Integer in2kx6) {
			refresh();
			base = base.substring(0, in2kx6POS) + String.format("%-"+in2kx6LEN+"s", in2kx6).substring(0, in2kx6LEN) + base.substring(in2kx6END);
		}
		Integer in2kx4 () {
			refresh();
			return Integer.parseInt(base.substring(in2kx4POS, in2kx4END));
		}
		void in2kx4 (Integer in2kx4) {
			refresh();
			base = base.substring(0, in2kx4POS) + String.format("%-"+in2kx4LEN+"s", in2kx4).substring(0, in2kx4LEN) + base.substring(in2kx4END);
		}
		Integer in2kp1 () {
			refresh();
			return Integer.parseInt(base.substring(in2kp1POS, in2kp1END));
		}
		void in2kp1 (Integer in2kp1) {
			refresh();
			base = base.substring(0, in2kp1POS) + String.format("%-"+in2kp1LEN+"s", in2kp1).substring(0, in2kp1LEN) + base.substring(in2kp1END);
		}
		Integer in2kp2 () {
			refresh();
			return Integer.parseInt(base.substring(in2kp2POS, in2kp2END));
		}
		void in2kp2 (Integer in2kp2) {
			refresh();
			base = base.substring(0, in2kp2POS) + String.format("%-"+in2kp2LEN+"s", in2kp2).substring(0, in2kp2LEN) + base.substring(in2kp2END);
		}
		Integer in2kp3 () {
			refresh();
			return Integer.parseInt(base.substring(in2kp3POS, in2kp3END));
		}
		void in2kp3 (Integer in2kp3) {
			refresh();
			base = base.substring(0, in2kp3POS) + String.format("%-"+in2kp3LEN+"s", in2kp3).substring(0, in2kp3LEN) + base.substring(in2kp3END);
		}
		Integer in2kp4 () {
			refresh();
			return Integer.parseInt(base.substring(in2kp4POS, in2kp4END));
		}
		void in2kp4 (Integer in2kp4) {
			refresh();
			base = base.substring(0, in2kp4POS) + String.format("%-"+in2kp4LEN+"s", in2kp4).substring(0, in2kp4LEN) + base.substring(in2kp4END);
		}
		void refresh () {
		}
	}

	public static String dtlkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qudtllb")) {
				sql = sql + " where c.qdent = '"+rQudtl.getQdent()+"' AND c.qdacct = '"+rQufdtlla.getFdmms()+"' AND c.qdseq = '"+rQufdtlla.getFdseq()+"'";
		}
		return sql;
	}
	public static String $kpdtlKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		return sql;
	}
	public static String akeypermKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pmt002la")) {
				sql = sql + " where c.paacct = '"+rMktadd.getMkmms()+"'";
		}
		return sql;
	}
	public static String $kitmoKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Adtitmo")) {
				sql = sql + " where c.aiterr = '"+rSh200sfm.getCaterr()+"' AND c.aiitem = '"+$ITMDESC+"'";
		}
		return sql;
	}
	public static String $kitmo99KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Adtitmo")) {
				sql = sql + " where c.aiterr = '"+ZTERR+"' AND c.aiitem = '"+$ITMDESC+"'";
		}
		return sql;
	}
	public static String $fdkyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qufdtl")) {
				sql = sql + " where c.fdmms = '"+$FACCT+"' AND c.fdseq = '"+$FSEQ+"'";
		}
		return sql;
	}
	public static String $tskcKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Catskd")) {
				sql = sql + " where c.ctterr = '"+TERR99+"' AND c.ctcamp = '"+ldadsDS.lcamp()+"' AND c.cttskt = '"+$TSKTP+"'";
		}
		return sql;
	}
	public static String taskeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Taskms")) {
				sql = sql + " where c.tsterr = '"+rSchdetli.getSdterr()+"' AND c.tsnumb = '"+rSchdetli.getSdnumb()+"' AND c.tssubt = '"+rSchdetli.getSdsubt()+"'";
		}
		return sql;
	}
	public static String tasky9KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Taskms")) {
				sql = sql + " where c.tsterr = '"+SDTER9+"' AND c.tsnumb = '"+rSchdetli.getSdnumb()+"'";
		}
		return sql;
	}
	public static String quhkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quhdr")) {
				sql = sql + " where c.quent = '"+rSh200sfm.getCaent()+"' AND c.quacct = '"+rSh200sfm.getCaacct()+"'";
		}
		return sql;
	}
	public static String quhky2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quhneg")) {
				sql = sql + " where c.quent = '"+rSh200sfm.getCaent()+"' AND c.quacct = '"+rSh200sfm.getCaacct()+"' AND c.quseq = '"+CBSEQ0+"'";
		}
		return sql;
	}
	public static String quhky3KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quhdr")) {
				sql = sql + " where c.quent = '"+rSh200sfm.getCaent()+"' AND c.quacct = '"+rSh200sfm.getCaacct()+"' AND c.quseq = '"+rSh200sfm.getHaseq()+"'";
		}
		return sql;
	}
	public static String quhky4KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qusrvc")) {
				sql = sql + " where c.qsent = '"+rSh200sfm.getCaent()+"' AND c.qsacct = '"+rSh200sfm.getCaacct()+"' AND c.qsseq = '"+rQufdtl.getFdseq()+"' AND c.qscat = '"+$CONST250+"'";
		}
		return sql;
	}
	public static String quhky5KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qudtl")) {
				sql = sql + " where c.qdent = '"+rQuhdr.getQuent()+"' AND c.qdacct = '"+rQuhdr.getQuacct()+"' AND c.qdseq = '"+rQuhdr.getQuseq()+"'";
		}
		return sql;
	}
	public static String quhkyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quhdr")) {
				sql = sql + " where c.quent = '"+rSh200sfm.getCaent()+"' AND c.quacct = '"+$ACCT+"' AND c.quseq = '"+rQufdtl.getFdseq()+"'";
		}
		return sql;
	}
	public static String quskeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qusrvc")) {
				sql = sql + " where c.qsent = '"+rSh200sfm.getCaent()+"' AND c.qsacct = '"+rSh200sfm.getCaacct()+"' AND c.qsseq = '"+CBSEQ0+"' AND c.qscat = '"+ANC.get(A2)+"'";
		}
		return sql;
	}
	public static String qusky2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		return sql;
	}
	public static String quhex2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quhdre")) {
				sql = sql + " where c.quemms = '"+rQuhdr.getQuacct()+"' AND c.queseq = '"+rQuhdr.getQuseq()+"'";
		}
		return sql;
	}
	public static String qdtlkyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		return sql;
	}
	public static String pakkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakmst")) {
				sql = sql + " where c.pkterr = '"+ZTERR+"' AND c.pkpakg = '"+rSh200sfm.getCbpkg()+"'";
		}
		return sql;
	}
	public static String annkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Annfee")) {
				sql = sql + " where c.anterr = '"+ZTERR+"' AND c.ancat = '"+rZipsrvla.getZssrv()+"'";
		}
		return sql;
	}
	public static String prokeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Promst")) {
				sql = sql + " where c.pmterr = '"+YTERR+"' AND c.pmcode = '"+rMktadd.getMkprom()+"'";
		}
		return sql;
	}
	public static String proky2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Promst")) {
				sql = sql + " where c.pmterr = '"+YTERR+"' AND c.pmcode = '"+S0PROM+"'";
		}
		if (Objects.equals(fileName2, "Proext")) {
				sql = sql + " where c.pmetwn = '"+YTERR+"' AND c.pmepro = '"+S0PROM+"'";
		}
		return sql;
	}
	public static String proky3KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Promst")) {
				sql = sql + " where c.pmterr = '"+YTERR+"' AND c.pmcode = '"+rQuhdr.getQuprom()+"'";
		}
		if (Objects.equals(fileName2, "Proext")) {
				sql = sql + " where c.pmetwn = '"+YTERR+"' AND c.pmepro = '"+rQuhdr.getQuprom()+"'";
		}
		if (Objects.equals(fileName2, "Prointro")) {
				sql = sql + " where c.pmtown = '"+YTERR+"' AND c.pmprcd = '"+rQuhdr.getQuprom()+"'";
		}
		return sql;
	}
	public static String proky4KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pritds")) {
				sql = sql + " where c.prterr = '"+YTERR+"' AND c.prcode = '"+rSh200sfm.getHbprom()+"'";
		}
		return sql;
	}
	public static String proky5KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Promstlb")) {
				sql = sql + " where c.pmterr = '"+YTERR+"' AND c.pmpakg = '"+rSh200sfm.getCbpkg()+"'";
		}
		return sql;
	}
	public static String proky6KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Proext")) {
				sql = sql + " where c.pmetwn = '"+YTERR+"' AND c.pmepro = '"+rPromstlb.getPmcode()+"'";
		}
		if (Objects.equals(fileName2, "Promst")) {
				sql = sql + " where c.pmterr = '"+YTERR+"' AND c.pmcode = '"+rPromstlb.getPmcode()+"'";
		}
		if (Objects.equals(fileName2, "Prointro")) {
				sql = sql + " where c.pmtown = '"+YTERR+"' AND c.pmprcd = '"+rPromstlb.getPmcode()+"'";
		}
		return sql;
	}
	public static String proky7KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Proextn")) {
				sql = sql + " where c.peetwn = '"+YTERR+"' AND c.peepro = '"+rSh200sfm.getHbprom()+"'";
		}
		return sql;
	}
	public static String proky8KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Proext")) {
				sql = sql + " where c.pmetwn = '"+YTERR+"' AND c.pmepro = '"+ldadsDS.lpromo()+"'";
		}
		return sql;
	}
	public static String cpnkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Cpnacflb")) {
				sql = sql + " where c.cmmsno = '"+ldadsDS.lmms()+"' AND c.cpromo = '"+ldadsDS.lpromo()+"'";
		}
		if (Objects.equals(fileName2, "Ofrmntflb")) {
				sql = sql + " where c.oacct_ = '"+ldadsDS.lmms()+"' AND c.opromo = '"+ldadsDS.lpromo()+"'";
		}
		return sql;
	}
	public static String prcky1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakprc")) {
				sql = sql + " where c.ppterr = '"+rProsls.getPterr()+"' AND c.pppakg = '"+rSh200sfm.getCbpkg()+"' AND c.pppcat = '"+rSh200sfm.getCbcat()+"' AND c.ppstdt = '"+$$ADTA+"'";
		}
		return sql;
	}
	public static String prcky2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakprc")) {
				sql = sql + " where c.ppterr = '"+rProsls.getPterr()+"' AND c.pppakg = '"+rSh200sfm.getCbpkg()+"' AND c.pppcat = '"+rSh200sfm.getCbcat()+"'";
		}
		return sql;
	}
	public static String prcky3KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakprc")) {
				sql = sql + " where c.ppterr = '"+rProsls.getPterr()+"' AND c.pppakg = '"+rSh200sfm.getCbpkg()+"' AND c.pppcat = '"+AACAT+"' AND c.ppstdt = '"+$$ADTA+"'";
		}
		return sql;
	}
	public static String prcky4KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakprc")) {
				sql = sql + " where c.ppterr = '"+rProsls.getPterr()+"' AND c.pppakg = '"+rSh200sfm.getCbpkg()+"' AND c.pppcat = '"+AACAT+"'";
		}
		return sql;
	}
	public static String itmky1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qudtlla")) {
				sql = sql + " where c.qdent = '"+rSh200sfm.getCaent()+"' AND c.qdacct = '"+rSh200sfm.getCaacct()+"' AND c.qdseq = '"+rSh200sfm.getHaseq()+"' AND c.qditem = '"+rPakdtlla.getPlitem()+"'";
		}
		return sql;
	}
	public static String qdtlKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qudtlla")) {
				sql = sql + " where c.qdent = '"+rQuhdr.getQuent()+"' AND c.qdacct = '"+rQuhdr.getQuacct()+"' AND c.qdseq = '"+rQuhdr.getQuseq()+"'";
		}
		return sql;
	}
	public static String qdtl2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		return sql;
	}
	public static String idfky1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Itmdef")) {
				sql = sql + " where c.iditem = '"+rSh200sfm.getSbitem()+"' AND c.idterr = '"+rSh200sfm.getCaterr()+"' AND c.idstyp = '"+rPakmst.getPkstyp()+"'";
		}
		return sql;
	}
	public static String idfky9KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Itmdef")) {
				sql = sql + " where c.iditem = '"+rSh200sfm.getSbitem()+"' AND c.idterr = '"+ZZTERR+"' AND c.idstyp = '"+rPakmst.getPkstyp()+"'";
		}
		return sql;
	}
	public static String refkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Refer")) {
				sql = sql + " where c.ecat = '"+WKCAT+"' AND c.ecode = '"+WKCODE+"'";
		}
		return sql;
	}
	public static String vskeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		return sql;
	}
	public static String ctkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Cmptwn")) {
				sql = sql + " where c.ctcamp = '"+ldadsDS.lcamp()+"' AND c.cttown = '"+ldadsDS.laterr()+"'";
		}
		return sql;
	}
	public static String ctkey2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Cmptwn")) {
				sql = sql + " where c.ctcamp = '"+ldadsDS.lcamp()+"' AND c.cttown = '"+T99999999+"'";
		}
		return sql;
	}
	public static String iprky1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Itmprclb")) {
				sql = sql + " where c.ipitem = '"+rSh200sfm.getSbitem()+"' AND c.ipterr = '"+rSh200sfm.getCaterr()+"' AND c.ipstyp = '"+rPakmst.getPkstyp()+"' AND c.ippcat = '"+rSh200sfm.getCbcat()+"'";
		}
		return sql;
	}
	public static String iprky9KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Itmprclb")) {
				sql = sql + " where c.ipitem = '"+rSh200sfm.getSbitem()+"' AND c.ipterr = '"+ZZTERR+"' AND c.ipstyp = '"+rPakmst.getPkstyp()+"' AND c.ippcat = '"+rSh200sfm.getCbcat()+"'";
		}
		return sql;
	}
	public static String qspkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Adtqsp")) {
				sql = sql + " where c.spcode = '"+QSPCODE+"' AND c.splopp = '"+QSPPRICE+"'";
		}
		return sql;
	}
	public static String valkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Valdetla")) {
				sql = sql + " where c.vdacen = '"+rValdetla.getVdacen()+"' AND c.vdmms = '"+rValdetla.getVdmms()+"' AND c.vdset = '"+rValdetla.getVdset()+"' AND c.vdfld = '"+rValdetla.getVdfld()+"'";
		}
		return sql;
	}
	public static String schkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Schdetli")) {
				sql = sql + " where c.sdacct = '"+S0ACCT+"' AND c.sddate = '"+rSchdetli.getSddate()+"'";
		}
		return sql;
	}
	public static String schkey2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Schdetlc")) {
				sql = sql + " where c.sdent = '"+$ENT+"' AND c.sdacct = '"+ldadsDS.lmms()+"'";
		}
		return sql;
	}
	public static String propkgkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Propkg")) {
				sql = sql + " where c.pxterr = '"+YTERR+"' AND c.pxcode = '"+rPromstlb.getPmcode()+"' AND c.pxpakg = '"+rSh200sfm.getCbpkg()+"'";
		}
		return sql;
	}
	public static String procmpkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Procamp")) {
				sql = sql + " where c.pcterr = '"+YTERR+"' AND c.pccode = '"+rPromstlb.getPmcode()+"' AND c.pccamp = '"+ldadsDS.lcamp()+"'";
		}
		return sql;
	}
	public static String pkgkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakmst")) {
				sql = sql + " where c.pkterr = '"+rSh200sfm.getCaterr()+"' AND c.pkpakg = '"+rSh200sfm.getSapkg()+"'";
		}
		return sql;
	}
	public static String pkgkeycorpKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakmst")) {
				sql = sql + " where c.pkterr = '"+T99999999+"' AND c.pkpakg = '"+rSh200sfm.getSapkg()+"'";
		}
		return sql;
	}
	public static String pkgtwnKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Paktwn")) {
				sql = sql + " where c.ptpakg = '"+rSh200sfm.getCbpkg()+"' AND c.ptterr = '"+rSh200sfm.getCaterr()+"'";
		}
		return sql;
	}
	public static String pkgcmpKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakcamp")) {
				sql = sql + " where c.pcpakg = '"+rSh200sfm.getCbpkg()+"' AND c.pccamp = '"+ldadsDS.lcamp()+"'";
		}
		return sql;
	}
	public static String prckey1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quhdr")) {
				sql = sql + " where c.quent = '"+rSh200sfm.getCaent()+"' AND c.quacct = '"+rSh200sfm.getCaacct()+"' AND c.quseq = '"+rQufdtl.getFdseq()+"'";
		}
		return sql;
	}
	public static String prckey2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qufdtl")) {
				sql = sql + " where c.fdmms = '"+rSh200sfm.getCaacct()+"' AND c.fdseq = '"+rSh200sfm.getHaseq()+"'";
		}
		return sql;
	}
	public static String qhkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quhdrlb")) {
				sql = sql + " where c.quacct = '"+$ACCT+"' AND c.qupkg = '"+KPKG+"'";
		}
		return sql;
	}
	public static String locpakkey1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakprc")) {
				sql = sql + " where c.ppterr = '"+ldadsDS.laterr()+"' AND c.pppakg = '"+rSh200sfm.getCbpkg()+"' AND c.pppcat = '"+rSh200sfm.getCbcat()+"' AND c.ppstdt = '"+$$ADTA+"'";
		}
		return sql;
	}
	public static String locpakkey2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pakprc")) {
				sql = sql + " where c.ppterr = '"+ldadsDS.laterr()+"' AND c.pppakg = '"+rSh200sfm.getCbpkg()+"' AND c.pppcat = '"+rSh200sfm.getCbcat()+"'";
		}
		return sql;
	}
	public static String key001KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pkgcombf")) {
				sql = sql + " where c.pkpkg = '"+rSh200sfm.getCbpkg()+"'";
		}
		return sql;
	}
	public static String pslsk2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Prosls")) {
				sql = sql + " where c.pterr = '"+SLSTRR+"' AND c.ppromo = '"+$$PROM+"'";
		}
		return sql;
	}
	public static String pslsk3KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Prosls")) {
				sql = sql + " where c.pterr = '"+SLSTRR+"' AND c.ppromo = '"+$$PROM+"' AND c.pslstp = '"+rSh200sfm.getCbst()+"'";
		}
		return sql;
	}
	public static String pkslsk1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Paksls")) {
				sql = sql + " where c.pterr = '"+SLSTRR+"' AND c.ppakg = '"+rSh200sfm.getCbpkg()+"'";
		}
		return sql;
	}
	public static String pkslsk2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Paksls")) {
				sql = sql + " where c.pterr = '"+SLSTRR+"' AND c.ppakg = '"+rSh200sfm.getCbpkg()+"' AND c.pslstp = '"+rSh200sfm.getCbst()+"'";
		}
		return sql;
	}
	public static String intkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Introffer")) {
				sql = sql + " where c.iomms = '"+ldadsDS.lmms()+"' AND c.ioseq = '"+rQuhdr.getQuseq()+"'";
		}
		return sql;
	}
	public static String uspakgk1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Usrpakgf")) {
				sql = sql + " where c.prterr = '"+WTERR1+"' AND c.prpakg = '"+rSh200sfm.getCbpkg()+"' AND c.prgrpid = '"+rRepmas.getRgrpid()+"'";
		}
		return sql;
	}
	public static String uspakgk2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Usrpakgf")) {
				sql = sql + " where c.prterr = '"+WTERR1+"' AND c.prpakg = '"+rSh200sfm.getCbpkg()+"'";
		}
		return sql;
	}
	public static String prqsrcKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Promst")) {
				sql = sql + " where c.pmterr = '"+QSRTRR+"' AND c.pmcode = '"+$QPROM+"'";
		}
		if (Objects.equals(fileName2, "Proqsrc")) {
				sql = sql + " where c.pterr = '"+QSRTRR+"' AND c.ppromo = '"+$QPROM+"'";
		}
		return sql;
	}
	public static String prqsrc1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Proqsrc")) {
				sql = sql + " where c.pterr = '"+QSRTRR+"' AND c.ppromo = '"+$QPROM+"' AND c.pqssrc = '"+rMktadd.getMkdsr2()+"'";
		}
		return sql;
	}
	public static String itgrkyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Pritdse")) {
				sql = sql + " where c.peterr = '"+rPritds.getPrterr()+"' AND c.pecode = '"+rPritds.getPrcode()+"' AND c.peitem = '"+rPritds.getPritem()+"'";
		}
		return sql;
	}
	public static String propkgky1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Propkg")) {
				sql = sql + " where c.pxterr = '"+rPromstlb.getPmterr()+"' AND c.pxcode = '"+rSh200sfm.getHbprom()+"' AND c.pxpakg = '"+rSh200sfm.getCbpkg()+"'";
		}
		return sql;
	}
	public static String propkgky2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		return sql;
	}
	public static String grpitkKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Usritmf")) {
				sql = sql + " where c.uiusrg = '"+rItusneg.getIuugrp()+"' AND c.uidisc = '"+rItusneg.getIudisc()+"' AND c.uiitem = '"+rSh200sfm.getSbitem()+"'";
		}
		return sql;
	}
	public static String poitkKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Lqgitmf")) {
				sql = sql + " where c.lqqsrc = '"+rPartofl.getPqsrc()+"' AND c.lqgmed = '"+rPartofl.getPgmed()+"' AND c.lqitem = '"+rSh200sfm.getSbitem()+"'";
		}
		return sql;
	}
	public static String perkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Permitlb")) {
				sql = sql + " where c.ptterr = '"+rSh200sfm.getCaterr()+"' AND c.ptfrzp = '"+S9ZIP+"'";
		}
		return sql;
	}
	public static String adt521kyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Adt521lb")) {
				sql = sql + " where c.illnam = '"+rAdt522la.getPslnam()+"' AND c.ilitem = '"+rSh200sfm.getSbitem()+"'";
		}
		return sql;
	}
	public static String ovrkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Itmovr")) {
				sql = sql + " where c.oaflag = '"+OVFLAG+"' AND c.oitmcd = '"+rSh200sfm.getSbitem()+"'";
		}
		return sql;
	}
	public static String ovrky1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Itmovr")) {
				sql = sql + " where c.oaflag = '"+OVFLAG+"' AND c.oitmcd = '"+ITEM+"'";
		}
		return sql;
	}
	public static String hdrkeyKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quhdr")) {
				sql = sql + " where c.quent = '"+rQudtl.getQdent()+"' AND c.quacct = '"+rQufdtlla.getFdmms()+"' AND c.quseq = '"+rQufdtlla.getFdseq()+"'";
		}
		return sql;
	}
	public static String qtripkKL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qutrip")) {
				sql = sql + " where c.tuacct = '"+ldadsDS.lmms()+"' AND c.tuseq = '"+rQufdtl.getFdseq()+"'";
		}
		if (Objects.equals(fileName2, "Quhdre")) {
				sql = sql + " where c.quemms = '"+ldadsDS.lmms()+"' AND c.queseq = '"+rQufdtl.getFdseq()+"'";
		}
		return sql;
	}
	public static String qtrip2KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qutrip")) {
				sql = sql + " where c.tuacct = '"+ldadsDS.lmms()+"' AND c.tuseq = '"+rQufdtl.getFdseq()+"'";
		}
		return sql;
	}
	public static String qtrip3KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Qutrip")) {
				sql = sql + " where c.tuacct = '"+ldadsDS.lmms()+"' AND c.tuseq = '"+rQufdtl.getFdseq()+"' AND c.taflag = '"+$AFLAG+"'";
		}
		return sql;
	}
	public static String qphnd1KL (String fileName2) {
		String sql = "select c from ";

		sql = sql + fileName2 + " c";
		if (Objects.equals(fileName2, "Quphnd")) {
				sql = sql + " where c.puacct = '"+ldadsDS.lmms()+"' AND c.puseq = '"+$QUSEQ+"'";
		}
		return sql;
	}

}