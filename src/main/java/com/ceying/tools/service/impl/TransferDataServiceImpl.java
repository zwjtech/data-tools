package com.ceying.tools.service.impl;

import com.ceying.tools.dao.cyp.*;
import com.ceying.tools.dao.scyp.addition.*;
import com.ceying.tools.dao.scyp.biz.*;
import com.ceying.tools.dao.scyp.key.KeyInitRecordMapper;
import com.ceying.tools.dao.scyp.key.KeyInventoryMapper;
import com.ceying.tools.dao.scyp.key.KeyInventoryOpsMapper;
import com.ceying.tools.dao.scyp.key.KeyPurchaseApplyMapper;
import com.ceying.tools.dao.scyp.system.*;
import com.ceying.tools.dao.scyp.tools.DatasourceConfigDao;
import com.ceying.tools.entity.cyp.*;
import com.ceying.tools.entity.scyp.addition.*;
import com.ceying.tools.entity.scyp.biz.*;
import com.ceying.tools.entity.scyp.key.KeyInitRecord;
import com.ceying.tools.entity.scyp.key.KeyInventory;
import com.ceying.tools.entity.scyp.key.KeyInventoryOps;
import com.ceying.tools.entity.scyp.key.KeyPurchaseApply;
import com.ceying.tools.entity.scyp.system.*;
import com.ceying.tools.entity.scyp.tools.DatasourceConfigEntity;
import com.ceying.tools.service.TransferDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author : Meow
 * @date : 2018-6-13
 * @description : TODO
 */
@Service
public class TransferDataServiceImpl implements TransferDataService {
    @Autowired
    private OrganizationMapper organizationMapper;
    @Autowired
    private OrganizationRelationMapper organizationRelationMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserLoginMapper userLoginMapper;
    @Autowired
    private RoleUserMapper roleUserMapper;
    @Autowired
    private SupplierBusinessTypeMapper supplierBusinessTypeMapper;
    @Autowired
    private CypOrganizationMapper cypOrganizationMapper;
    @Autowired
    private CypOrganizationRelationMapper cypOrganizationRelationMapper;
    @Autowired
    private CypUserMapper cypUserMapper;
    @Autowired
    private CypUserLoginMapper cypUserLoginMapper;
    @Autowired
    private CypRoleUserMapper cypRoleUserMapper;
    @Autowired
    private CypSupplierBusinessTypeMapper cypSupplierBusinessTypeMapper;
    @Autowired
    private GasAccountMapper gasAccountMapper;
    @Autowired
    private GasTransActionsMapper gasTransActionsMapper;
    @Autowired
    private CypGasAccountMapper cypGasAccountMapper;
    @Autowired
    private CypGasTransActionsMapper cypGasTransActionsMapper;
    @Autowired
    private CypKeyInitRecordMapper cypKeyInitRecordMapper;
    @Autowired
    private CypKeyInventoryMapper cypKeyInventoryMapper;
    @Autowired
    private CypKeyInventoryOpsMapper cypKeyInventoryOpsMapper;
    @Autowired
    private CypKeyPurchaseApplyMapper cypKeyPurchaseApplyMapper;
    @Autowired
    private KeyInitRecordMapper keyInitRecordMapper;
    @Autowired
    private KeyInventoryMapper keyInventoryMapper;
    @Autowired
    private KeyInventoryOpsMapper keyInventoryOpsMapper;
    @Autowired
    private KeyPurchaseApplyMapper keyPurchaseApplyMapper;
    @Autowired
    private CypAccountsPayableMapper cypAccountsPayableMapper;
    @Autowired
    private AccountsPayableMapper accountsPayableMapper;
    @Autowired
    private CypAccountsPayableQuoteMapper cypAccountsPayableQuoteMapper;
    @Autowired
    private AccountsPayableQuoteMapper accountsPayableQuoteMapper;
    @Autowired
    private CypCoreCompanyQuotaMapper cypCoreCompanyQuotaMapper;
    @Autowired
    private CoreCompanyQuotaMapper coreCompanyQuotaMapper;
    @Autowired
    private CypCoreCompanyQuotaOpsMapper cypCoreCompanyQuotaOpsMapper;
    @Autowired
    private CoreCompanyQuotaOpsMapper coreCompanyQuotaOpsMapper;
    @Autowired
    private CypSupplierAccountsMapper cypSupplierAccountsMapper;
    @Autowired
    private SupplierAccountsMapper supplierAccountsMapper;
    @Autowired
    private CypTaoperationsMapper cypTaoperationsMapper;
    @Autowired
    private TaoperationsMapper taoperationsMapper;
    @Autowired
    private CypTradeAccountsMapper cypTradeAccountsMapper;
    @Autowired
    private TradeAccountsMapper tradeAccountsMapper;
    @Autowired
    private CypTradeBalancesMapper cypTradeBalancesMapper;
    @Autowired
    private TradeBalancesMapper tradeBalancesMapper;
    @Autowired
    private CypTradeTransActionsMapper cypTradeTransActionsMapper;
    @Autowired
    private TradeTransActionsMapper tradeTransActionsMapper;
    @Autowired
    private CypTripartiteAgreementMapper cypTripartiteAgreementMapper;
    @Autowired
    private TripartiteAgreementMapper tripartiteAgreementMapper;
    @Autowired
    private CypTripartiteAgreementTemplateMapper cypTripartiteAgreementTemplateMapper;
    @Autowired
    private TripartiteAgreementTemplateMapper tripartiteAgreementTemplateMapper;
    @Autowired
    private CypBlockChainNodeApplyMapper cypBlockChainNodeApplyMapper;
    @Autowired
    private BlockChainNodeApplyMapper blockChainNodeApplyMapper;
    @Autowired
    private CypBlockChainNodeApplyOpsMapper cypBlockChainNodeApplyOpsMapper;
    @Autowired
    private BlockChainNodeApplyOpsMapper blockChainNodeApplyOpsMapper;
    @Autowired
    private CypOpenInvoiceApplyMapper cypOpenInvoiceApplyMapper;
    @Autowired
    private OpenInvoiceApplyMapper openInvoiceApplyMapper;
    @Autowired
    private CypOpenInvoiceInfoMapper cypOpenInvoiceInfoMapper;
    @Autowired
    private OpenInvoiceInfoMapper openInvoiceInfoMapper;
    @Autowired
    private CypOpenInvoiceQuotaMapper cypOpenInvoiceQuotaMapper;
    @Autowired
    private OpenInvoiceQuotaMapper openInvoiceQuotaMapper;
    @Autowired
    private CypUniqueCodesMapper cypUniqueCodesMapper;
    @Autowired
    private UniqueCodesMapper uniqueCodesMapper;
    @Autowired
    private CypCustomerTemplateMapper cypCustomerTemplateMapper;
    @Autowired
    private CustomerTemplateMapper customerTemplateMapper;
    @Autowired
    private CypOrganizationContactsMapper cypOrganizationContactsMapper;
    @Autowired
    private OrganizationContactsMapper organizationContactsMapper;
    @Autowired
    private SysLogMapper sysLogMapper;
    @Autowired
    private CypLogMapper cypLogMapper;
    @Autowired
    private CypBlobStorageMapper cypBlobStorageMapper;
    @Autowired
    private BlobStorageMapper blobStorageMapper;

    /**
     * @param []
     * @return void
     * @description 迁移数据到system库
     * @author Meow
     * @date 2018-6-13
     */
    @Override
    @Transactional(rollbackFor = Exception.class, transactionManager = "systemTransactionManager")
    public void transferData2System() throws Exception {

        //迁移组织表
        List<CypOrganization> cypOrganizationlist = cypOrganizationMapper.selectAll();
        for (CypOrganization cypOrganization : cypOrganizationlist) {
            Organization organization = new Organization();
            organization.setAddress(cypOrganization.getAddress());
            organization.setAreaid(cypOrganization.getAreaid());
            organization.setCorecompanyrate(cypOrganization.getCorecompanyrate());
            organization.setDimension(cypOrganization.getDimension());
            organization.setExtId(cypOrganization.getExtId());
            organization.setFinancenumber(cypOrganization.getFinancenumber());
            organization.setLegalperson(cypOrganization.getLegalperson());
            organization.setManageId(cypOrganization.getManageId());
            organization.setOrgCate(cypOrganization.getOrgCate());
            organization.setOrgId(cypOrganization.getOrgId());
            if (("3").equals(cypOrganization.getOrgCate())) {
                organization.setOrgCode("2");
            } else {
                organization.setOrgCode(cypOrganization.getOrgCode());
            }
            organization.setOrgLevel(cypOrganization.getOrgLevel());
            organization.setOrgName(cypOrganization.getOrgName());
            organization.setOrgOrder(cypOrganization.getOrgOrder());
            organization.setOrgPath(cypOrganization.getOrgPath());
            organization.setParentId(cypOrganization.getParentId());
            organization.setPlatformsupplierrate(cypOrganization.getPlatformsupplierrate());
            organization.setPositionCode(cypOrganization.getPositionCode());
            organization.setRemark(cypOrganization.getRemark());
            organization.setShortorgname(cypOrganization.getShortorgname());
            organization.setSsoOrgCode(cypOrganization.getSsoOrgCode());
            organization.setSsoParentCode(cypOrganization.getSsoParentCode());
            organization.setStatus("1");
            organization.setTenantId(cypOrganization.getTenantId().toString());
            organizationMapper.insertSelective(organization);
        }

        //迁移组织关系表
        List<CypOrganizationRelation> cypOrganizationRelationList = cypOrganizationRelationMapper.selectAll();
        for (CypOrganizationRelation cypOrganizationRelation : cypOrganizationRelationList) {
            OrganizationRelation organizationRelation = new OrganizationRelation();
            organizationRelation.setCategory(cypOrganizationRelation.getCategory());
            organizationRelation.setCorecompanysupplierrate(cypOrganizationRelation.getCorecompanysupplierrate());
            organizationRelation.setCreatedby(cypOrganizationRelation.getCreatedby());
            organizationRelation.setCreatedon(cypOrganizationRelation.getCreatedon());
            organizationRelation.setDescription(cypOrganizationRelation.getDescription());
            organizationRelation.setExtensiondate(cypOrganizationRelation.getExtensiondate());
            organizationRelation.setIsblack(cypOrganizationRelation.getIsblack());
            organizationRelation.setLastmodifiedby(cypOrganizationRelation.getLastmodifiedby());
            organizationRelation.setLastmodifiedon(cypOrganizationRelation.getLastmodifiedon());
            organizationRelation.setOpporgid(cypOrganizationRelation.getOpporgid());
            organizationRelation.setOrganizationrelationid(cypOrganizationRelation.getOrganizationrelationid());
            organizationRelation.setOurorgid(cypOrganizationRelation.getOurorgid());
            organizationRelation.setPriority(cypOrganizationRelation.getPriority());
            organizationRelation.setRowversion(cypOrganizationRelation.getRowversion());
            organizationRelation.setUrid(cypOrganizationRelation.getUrid());
            organizationRelationMapper.insertSelective(organizationRelation);
        }

        //迁移用户表
        List<CypUser> cypUserList = cypUserMapper.selectAll();
        for (CypUser cypUser : cypUserList) {
            User user = new User();
            user.setcCredentials(cypUser.getcCredentials());
            user.setcIdentityno(cypUser.getcIdentityno());
            user.setcIdentitytype(cypUser.getcIdentitytype());
            user.setCreateDate(intToDate(cypUser.getCreateDate()));
            user.setEmail(cypUser.getEmail());
            user.setExtField_1(cypUser.getExtField_1());
            user.setExtField_2(cypUser.getExtField_2());
            user.setExtField_3(cypUser.getExtField_3());
            user.setExtField_4(cypUser.getExtField_4());
            user.setExtField_5(cypUser.getExtField_5());
            user.setcIdentitytype(cypUser.getcIdentitytype());
            user.setcIdentityno(cypUser.getcIdentityno());
            user.setExtFlag(cypUser.getExtFlag());
            user.setLockStatus(cypUser.getLockStatus());
            user.setMobile(cypUser.getMobile());
            user.setModifyDate(intToDate(cypUser.getModifyDate()));

            user.setOrgId(cypUser.getOrgId());
            user.setPassModifyDate(intToDate(cypUser.getPassModifyDate()));

            user.setRemark(cypUser.getRemark());
            if (cypUser.getTenantId() != null) {
                user.setTenantId(cypUser.getTenantId().toString());
            }
            user.setUserId(cypUser.getUserId());
            String userName = cypUser.getUserName();
            switch (userName) {
                case "核心企业经办":
                    user.setUserName("企业经办");
                    break;
                case "核心企业复核":
                    user.setUserName("企业复核");
                    break;
                case "核心企业审批":
                    user.setUserName("企业审批");
                    break;
                case "供应商经办":
                    user.setUserName("企业经办");
                    break;
                case "供应商复核":
                    user.setUserName("企业复核");
                    break;
                case "供应商审批":
                    user.setUserName("企业审批");
                    break;
                default:
                    user.setUserName(cypUser.getUserName());
                    break;
            }
            user.setUserOrder(cypUser.getUserOrder());
            user.setUserPwd(cypUser.getUserPwd());
            user.setUserStatus(cypUser.getUserStatus());
            user.setUserType(cypUser.getUserType());
            userMapper.insertSelective(user);
        }

        //迁移用户登陆表
        List<CypUserLogin> cypUserLoginList = cypUserLoginMapper.selectAll();
        for (CypUserLogin cypUserLogin : cypUserLoginList) {
            UserLogin userLogin = new UserLogin();
            userLogin.setcCredentials(cypUserLogin.getcCredentials());
            userLogin.setExtField(cypUserLogin.getExtField());
            userLogin.setLastFailDate(intToDate(cypUserLogin.getLastFailDate()));

            userLogin.setLastLoginIp(cypUserLogin.getLastLoginIp());
            userLogin.setLastLoginDate(intToDate(cypUserLogin.getLastLoginDate()));
            userLogin.setLoginFailTimes(cypUserLogin.getLoginFailTimes());
            userLogin.setMobile(cypUserLogin.getMobile());
            userLogin.setOrgId(cypUserLogin.getOrgId());
            userLogin.setTenantCnshortname(cypUserLogin.getTenantCnshortname());
            if (cypUserLogin.getTenantId() != null) {
                userLogin.setTenantId(cypUserLogin.getTenantId().toString());
            }
            userLogin.setTenantShortname(cypUserLogin.getTenantShortname());
            userLogin.setUserId(cypUserLogin.getUserId());
            userLogin.setUserName(cypUserLogin.getUserName());
            userLoginMapper.insertSelective(userLogin);
        }

        //迁移用户权限表
        List<CypRoleUser> cypRoleUserList = cypRoleUserMapper.selectAll();
        for (CypRoleUser cypRoleUser : cypRoleUserList) {
            RoleUser roleUser = new RoleUser();
            roleUser.setRightFlag(cypRoleUser.getRightFlag());
            String roleCode = cypRoleUser.getRoleCode();
            if ("10000301".equals(roleCode)) {
                roleUser.setRoleCode("1000201");
            } else if ("10000302".equals(roleCode)) {
                roleUser.setRoleCode("1000202");
            } else if ("10000303".equals(roleCode)) {
                roleUser.setRoleCode("1000203");
            } else {
                roleUser.setRoleCode(cypRoleUser.getRoleCode());
            }
            if (cypRoleUser.getTenantId() != null) {
                roleUser.setTenantId(cypRoleUser.getTenantId().toString());
            }
            roleUser.setUserCode(cypRoleUser.getUserCode());
            roleUserMapper.insertSelective(roleUser);
        }

        //迁移供应商支持业务类型表
        List<CypSupplierBusinessType> cypSupplierBusinessTypeList = cypSupplierBusinessTypeMapper.selectAll();
        for (CypSupplierBusinessType cypSupplierBusinessType : cypSupplierBusinessTypeList) {
            SupplierBusinessType supplierBusinessType = new SupplierBusinessType();
            supplierBusinessType.setBusinesstype(cypSupplierBusinessType.getBusinesstype());
            supplierBusinessType.setCorecompanysupplierrate(cypSupplierBusinessType.getCorecompanysupplierrate());
            supplierBusinessType.setCreatedby(cypSupplierBusinessType.getCreatedby());
            supplierBusinessType.setCreatedon(cypSupplierBusinessType.getCreatedon());
            supplierBusinessType.setDescription(cypSupplierBusinessType.getDescription());
            supplierBusinessType.setIssupport(cypSupplierBusinessType.getBusinesstype());
            supplierBusinessType.setLastmodifiedby(cypSupplierBusinessType.getLastmodifiedby());
            supplierBusinessType.setLastmodifiedon(cypSupplierBusinessType.getLastmodifiedon());
            supplierBusinessType.setOrganizationrelationid(cypSupplierBusinessType.getOrganizationrelationid());
            supplierBusinessType.setRowversion(cypSupplierBusinessType.getRowversion());
            supplierBusinessType.setUrid(cypSupplierBusinessType.getUrid());
            supplierBusinessTypeMapper.insertSelective(supplierBusinessType);
        }

        //迁移BlobStorage表
        List<CypBlobStorage> cypBlobStorageList = cypBlobStorageMapper.selectAll();
        for (CypBlobStorage cypBlobStorage : cypBlobStorageList) {
            BlobStorage blobStorage = new BlobStorage();
            blobStorage.setbAccessory(cypBlobStorage.getbAccessory());
            blobStorage.setcCatalog(cypBlobStorage.getcCatalog());
            blobStorage.setcCreator(cypBlobStorage.getcCreator());
            blobStorage.setcFileid(cypBlobStorage.getcFileid());
            blobStorage.setcFilename(cypBlobStorage.getcFilename());
            blobStorage.setcIsuse(cypBlobStorage.getcIsuse());
            blobStorage.setcMemo(cypBlobStorage.getcMemo());
            blobStorage.setcSecuritylevel(cypBlobStorage.getcSecuritylevel());
            blobStorage.setcSubkeyid(cypBlobStorage.getcSubkeyid());
            blobStorage.setcType(cypBlobStorage.getcType());
            blobStorage.setdCreatedate(cypBlobStorage.getdCreatedate());
            blobStorage.setlFilesize(cypBlobStorage.getlFilesize());
            blobStorage.setlStorageid(cypBlobStorage.getlStorageid().toString());
            blobStorageMapper.insertSelective(blobStorage);
        }

        //迁移OrganizationContacts表
        List<CypOrganizationContacts> cypOrganizationContactsList = cypOrganizationContactsMapper.selectAll();
        for (CypOrganizationContacts cypOrganizationContacts : cypOrganizationContactsList) {
            OrganizationContacts organizationContacts = new OrganizationContacts();
            organizationContacts.setAddress(cypOrganizationContacts.getAddress());
            organizationContacts.setCellphone(cypOrganizationContacts.getCellphone());
            organizationContacts.setContactcategory(cypOrganizationContacts.getContactcategory());
            organizationContacts.setContactname(cypOrganizationContacts.getContactname());
            organizationContacts.setCreatedby(cypOrganizationContacts.getCreatedby());
            organizationContacts.setCreatedon(cypOrganizationContacts.getCreatedon());
            organizationContacts.setDescription(cypOrganizationContacts.getDescription());
            organizationContacts.setEmail(cypOrganizationContacts.getEmail());
            organizationContacts.setIsactive(cypOrganizationContacts.getIsactive());
            organizationContacts.setLastmodifiedby(cypOrganizationContacts.getLastmodifiedby());
            organizationContacts.setLastmodifiedon(cypOrganizationContacts.getLastmodifiedon());
            organizationContacts.setOrgid(cypOrganizationContacts.getOrgid());
            organizationContacts.setRowversion(cypOrganizationContacts.getRowversion());
            organizationContacts.setTelephone(cypOrganizationContacts.getTelephone());
            organizationContacts.setUrid(cypOrganizationContacts.getUrid());
            organizationContactsMapper.insertSelective(organizationContacts);
        }

        //迁移Log表
        List<CypLog> cypLogList = cypLogMapper.selectAll();
        for (CypLog cypLog : cypLogList) {
            SysLog sysLog = new SysLog();
            sysLog.setAccessDate(intToDate(cypLog.getAccessDate(), cypLog.getAccessTime()));
            sysLog.setHostName(cypLog.getHostName());
            sysLog.setIpAdd(cypLog.getIpAdd());
            sysLog.setLogId(cypLog.getLogId());
            sysLog.setOperContents(cypLog.getOperContents());
            sysLog.setOrgId(cypLog.getOrgId());
            sysLog.setOrgName(cypLog.getOrgName());
            sysLog.setSubTransCode(cypLog.getSubTransCode());
            if (cypLog.getTenantId() != null) {
                sysLog.setTenantId(cypLog.getTenantId().toString());
            }
            sysLog.setTransCode(cypLog.getTransCode());
            sysLog.setUserId(cypLog.getUserId());
            sysLog.setUserName(cypLog.getUserName());
            sysLogMapper.insertSelective(sysLog);
        }

        System.out.println("system库导出成功");
    }

    /**
     * @param []
     * @return void
     * @description 迁移数据到addition库
     * @author Meow
     * @date 2018-6-19
     */
    @Override
    @Transactional(rollbackFor = Exception.class, transactionManager = "additionTransactionManager")
    public void transferData2Addition() {

        //迁移GasAccount表
        List<CypGasAccount> cypGasAccountList = cypGasAccountMapper.selectAll();
        for (CypGasAccount cypGasAccount : cypGasAccountList) {
            GasAccount gasAccount = new GasAccount();
            gasAccount.setBalance(cypGasAccount.getBalance());
            gasAccount.setCreatedby(cypGasAccount.getCreatedby());
            gasAccount.setCreatedon(cypGasAccount.getCreatedon());
            gasAccount.setDescription(cypGasAccount.getDescription());
            gasAccount.setLastmodifiedby(cypGasAccount.getLastmodifiedby());
            gasAccount.setLastmodifiedon(cypGasAccount.getLastmodifiedon());
            gasAccount.setOrgid(cypGasAccount.getOrgid());
            gasAccount.setRowversion(cypGasAccount.getRowversion());
            gasAccount.setUrid(cypGasAccount.getUrid());
            gasAccountMapper.insertSelective(gasAccount);
        }

        //迁移GasTransActions表
        List<CypGasTransActions> cypGasTransActionsList = cypGasTransActionsMapper.selectAll();
        for (CypGasTransActions cypGasTransActions : cypGasTransActionsList) {
            GasTransActions gasTransActions = new GasTransActions();
            gasTransActions.setAmount(cypGasTransActions.getAmount());
            gasTransActions.setBalance(cypGasTransActions.getBalance());
            gasTransActions.setCreatedby(cypGasTransActions.getCreatedby());
            gasTransActions.setCreatedon(cypGasTransActions.getCreatedon());
            gasTransActions.setDescription(cypGasTransActions.getDescription());
            gasTransActions.setLastmodifiedby(cypGasTransActions.getLastmodifiedby());
            gasTransActions.setLastmodifiedon(cypGasTransActions.getLastmodifiedon());
            gasTransActions.setOperateflag(cypGasTransActions.getOperateflag());
            gasTransActions.setOrgid(cypGasTransActions.getOrgid());
            gasTransActions.setRowversion(cypGasTransActions.getRowversion());
            gasTransActions.setUrid(cypGasTransActions.getUrid());
            gasTransActionsMapper.insertSelective(gasTransActions);
        }

        //迁移BlockChainNodeApply表
        List<CypBlockChainNodeApply> cypBlockChainNodeApplyList = cypBlockChainNodeApplyMapper.selectAll();
        for (CypBlockChainNodeApply cypBlockChainNodeApply : cypBlockChainNodeApplyList) {
            BlockChainNodeApply blockChainNodeApply = new BlockChainNodeApply();
            blockChainNodeApply.setAddress(cypBlockChainNodeApply.getAddress());
            blockChainNodeApply.setApplycontent(cypBlockChainNodeApply.getApplycontent());
            blockChainNodeApply.setApplyorgid(cypBlockChainNodeApply.getApplyorgid());
            blockChainNodeApply.setCellphone(cypBlockChainNodeApply.getCellphone());
            blockChainNodeApply.setContactname(cypBlockChainNodeApply.getContactname());
            blockChainNodeApply.setCreatedby(cypBlockChainNodeApply.getCreatedby());
            blockChainNodeApply.setCreatedon(cypBlockChainNodeApply.getCreatedon());
            blockChainNodeApply.setDescription(cypBlockChainNodeApply.getDescription());
            blockChainNodeApply.setEmail(cypBlockChainNodeApply.getEmail());
            blockChainNodeApply.setIsactive(cypBlockChainNodeApply.getIsactive());
            blockChainNodeApply.setLastmodifiedby(cypBlockChainNodeApply.getLastmodifiedby());
            blockChainNodeApply.setLastmodifiedon(cypBlockChainNodeApply.getLastmodifiedon());
            blockChainNodeApply.setLastoperateflag(cypBlockChainNodeApply.getLastoperateflag());
            blockChainNodeApply.setRowversion(cypBlockChainNodeApply.getRowversion());
            blockChainNodeApply.setTelephone(cypBlockChainNodeApply.getTelephone());
            blockChainNodeApply.setUrid(cypBlockChainNodeApply.getUrid());
            blockChainNodeApplyMapper.insertSelective(blockChainNodeApply);
        }

        //迁移BlockChainNodeApplyOps表
        List<CypBlockChainNodeApplyOps> cypBlockChainNodeApplyOpsList = cypBlockChainNodeApplyOpsMapper.selectAll();
        for (CypBlockChainNodeApplyOps cypBlockChainNodeApplyOps : cypBlockChainNodeApplyOpsList) {
            BlockChainNodeApplyOps blockChainNodeApplyOps = new BlockChainNodeApplyOps();
            blockChainNodeApplyOps.setBlockchainnodeapplyid(cypBlockChainNodeApplyOps.getBlockchainnodeapplyid());
            blockChainNodeApplyOps.setDescription(cypBlockChainNodeApplyOps.getDescription());
            blockChainNodeApplyOps.setOperatedate(cypBlockChainNodeApplyOps.getOperatedate());
            blockChainNodeApplyOps.setOperateflag(cypBlockChainNodeApplyOps.getOperateflag());
            blockChainNodeApplyOps.setOperateorgid(cypBlockChainNodeApplyOps.getOperateorgid());
            blockChainNodeApplyOps.setOperator(cypBlockChainNodeApplyOps.getOperator());
            blockChainNodeApplyOps.setSignature(cypBlockChainNodeApplyOps.getSignature());
            blockChainNodeApplyOps.setUrid(cypBlockChainNodeApplyOps.getUrid());
            blockChainNodeApplyOpsMapper.insertSelective(blockChainNodeApplyOps);
        }

        //迁移OpenInvoiceApply表
        List<CypOpenInvoiceApply> cypOpenInvoiceApplyList = cypOpenInvoiceApplyMapper.selectAll();
        for (CypOpenInvoiceApply cypOpenInvoiceApply : cypOpenInvoiceApplyList) {
            OpenInvoiceApply openInvoiceApply = new OpenInvoiceApply();
            openInvoiceApply.setAddress(cypOpenInvoiceApply.getAddress());
            openInvoiceApply.setApplyamount(cypOpenInvoiceApply.getApplyamount());
            openInvoiceApply.setApplydate(cypOpenInvoiceApply.getApplydate());
            openInvoiceApply.setCellphone(cypOpenInvoiceApply.getCellphone());
            openInvoiceApply.setContactsname(cypOpenInvoiceApply.getContactsname());
            openInvoiceApply.setCreatedby(cypOpenInvoiceApply.getCreatedby());
            openInvoiceApply.setCreatedon(cypOpenInvoiceApply.getCreatedon());
            openInvoiceApply.setDescription(cypOpenInvoiceApply.getDescription());
            openInvoiceApply.setLastmodifiedby(cypOpenInvoiceApply.getLastmodifiedby());
            openInvoiceApply.setLastmodifiedon(cypOpenInvoiceApply.getLastmodifiedon());
            openInvoiceApply.setOpeninvoiceinfoid(cypOpenInvoiceApply.getOpeninvoiceinfoid());
            openInvoiceApply.setOpenorgid(cypOpenInvoiceApply.getOpenorgid());
            openInvoiceApply.setOpenstate(cypOpenInvoiceApply.getOpenstate());
            openInvoiceApply.setRowversion(cypOpenInvoiceApply.getRowversion());
            openInvoiceApply.setUrid(cypOpenInvoiceApply.getUrid());
            openInvoiceApplyMapper.insertSelective(openInvoiceApply);
        }

        //迁移OpenInvoiceInfo表
        List<CypOpenInvoiceInfo> cypOpenInvoiceInfoList = cypOpenInvoiceInfoMapper.selectAll();
        for (CypOpenInvoiceInfo cypOpenInvoiceInfo : cypOpenInvoiceInfoList) {
            OpenInvoiceInfo openInvoiceInfo = new OpenInvoiceInfo();
            openInvoiceInfo.setAddress(cypOpenInvoiceInfo.getAddress());
            openInvoiceInfo.setCompanyaccount(cypOpenInvoiceInfo.getCompanyaccount());
            openInvoiceInfo.setCompanybank(cypOpenInvoiceInfo.getCompanybank());
            openInvoiceInfo.setCompanyname(cypOpenInvoiceInfo.getCompanyname());
            openInvoiceInfo.setCreatedby(cypOpenInvoiceInfo.getCreatedby());
            openInvoiceInfo.setCreatedon(cypOpenInvoiceInfo.getCreatedon());
            openInvoiceInfo.setDescription(cypOpenInvoiceInfo.getDescription());
            openInvoiceInfo.setLastmodifiedby(cypOpenInvoiceInfo.getLastmodifiedby());
            openInvoiceInfo.setLastmodifiedon(cypOpenInvoiceInfo.getLastmodifiedon());
            openInvoiceInfo.setOrgid(cypOpenInvoiceInfo.getOrgid());
            openInvoiceInfo.setRowversion(cypOpenInvoiceInfo.getRowversion());
            openInvoiceInfo.setTaxpayernumber(cypOpenInvoiceInfo.getTaxpayernumber());
            openInvoiceInfo.setTelephone(cypOpenInvoiceInfo.getTelephone());
            openInvoiceInfo.setUrid(cypOpenInvoiceInfo.getUrid());
            openInvoiceInfoMapper.insertSelective(openInvoiceInfo);
        }

        //迁移OpenInvoiceQuota表
        List<CypOpenInvoiceQuota> cypOpenInvoiceQuotaList = cypOpenInvoiceQuotaMapper.selectAll();
        for (CypOpenInvoiceQuota cypOpenInvoiceQuota : cypOpenInvoiceQuotaList) {
            OpenInvoiceQuota openInvoiceQuota = new OpenInvoiceQuota();
            openInvoiceQuota.setAmount(cypOpenInvoiceQuota.getAmount());
            openInvoiceQuota.setAvailableamount(cypOpenInvoiceQuota.getAvailableamount());
            openInvoiceQuota.setCreatedby(cypOpenInvoiceQuota.getCreatedby());
            openInvoiceQuota.setCreatedon(cypOpenInvoiceQuota.getCreatedon());
            openInvoiceQuota.setDescription(cypOpenInvoiceQuota.getDescription());
            openInvoiceQuota.setLastmodifiedby(cypOpenInvoiceQuota.getLastmodifiedby());
            openInvoiceQuota.setLastmodifiedon(cypOpenInvoiceQuota.getLastmodifiedon());
            openInvoiceQuota.setOrgid(cypOpenInvoiceQuota.getOrgid());
            openInvoiceQuota.setRowversion(cypOpenInvoiceQuota.getRowversion());
            openInvoiceQuota.setUrid(cypOpenInvoiceQuota.getUrid());
            openInvoiceQuota.setUsedamount(cypOpenInvoiceQuota.getUsedamount());
            openInvoiceQuotaMapper.insertSelective(openInvoiceQuota);
        }

        System.out.println("addition库导出成功");
    }

    /**
     * @param []
     * @return void
     * @description 迁移数据到key库
     * @author Meow
     * @date 2018-6-19
     */
    @Override
    @Transactional(rollbackFor = Exception.class, transactionManager = "keyTransactionManager")
    public void transferData2Key() {

        //迁移KeyInitRecord表
        List<CypKeyInitRecord> cypKeyInitRecordList = cypKeyInitRecordMapper.selectAll();
        for (CypKeyInitRecord cypKeyInitRecord : cypKeyInitRecordList) {
            KeyInitRecord keyInitRecord = new KeyInitRecord();
            keyInitRecord.setApprover(cypKeyInitRecord.getApprover());
            keyInitRecord.setApproverpubkey(cypKeyInitRecord.getApproverpubkey());
            keyInitRecord.setApproverserialno(cypKeyInitRecord.getApproverserialno());
            keyInitRecord.setChecker(cypKeyInitRecord.getChecker());
            keyInitRecord.setCheckerpubkey(cypKeyInitRecord.getCheckerpubkey());
            keyInitRecord.setCheckerserialno(cypKeyInitRecord.getCheckerserialno());
            keyInitRecord.setConfirmation(cypKeyInitRecord.getConfirmation());
            keyInitRecord.setCreatedby(cypKeyInitRecord.getCreatedby());
            keyInitRecord.setCreatedon(cypKeyInitRecord.getCreatedon());
            keyInitRecord.setDescription(cypKeyInitRecord.getDescription());
            keyInitRecord.setHandler(cypKeyInitRecord.getHandler());
            keyInitRecord.setHandlerpubkey(cypKeyInitRecord.getHandlerpubkey());
            keyInitRecord.setHandlerserialno(cypKeyInitRecord.getHandlerserialno());
            keyInitRecord.setIdentno(cypKeyInitRecord.getIdentno());
            keyInitRecord.setInitdate(cypKeyInitRecord.getInitdate());
            keyInitRecord.setLastmodifiedby(cypKeyInitRecord.getLastmodifiedby());
            keyInitRecord.setLastmodifiedon(cypKeyInitRecord.getLastmodifiedon());
//            keyInitRecord.setKeyinitversion(cypKeyInitRecord.g);
            keyInitRecord.setOrgid(cypKeyInitRecord.getOrgid());
            keyInitRecord.setRowversion(cypKeyInitRecord.getRowversion());
            keyInitRecord.setSignature(cypKeyInitRecord.getSignature());
            if (cypKeyInitRecord.getTenantid() != null) {
                keyInitRecord.setTenantid(cypKeyInitRecord.getTenantid().toString());
            }
            keyInitRecord.setTimestamp(cypKeyInitRecord.getTimestamp());
            keyInitRecord.setUrid(cypKeyInitRecord.getUrid());
            keyInitRecord.setWitness(cypKeyInitRecord.getWitness());
            keyInitRecordMapper.insertSelective(keyInitRecord);
        }

        //迁移KeyInventory表
        List<CypKeyInventory> cypKeyInventoryList = cypKeyInventoryMapper.selectAll();
        for (CypKeyInventory cypKeyInventory : cypKeyInventoryList) {
            KeyInventory keyInventory = new KeyInventory();
            keyInventory.setApplyorgid(cypKeyInventory.getApplyorgid());
            keyInventory.setCertsn(cypKeyInventory.getCertsn());
            keyInventory.setCreatedby(cypKeyInventory.getCreatedby());
            keyInventory.setCreatedon(cypKeyInventory.getCreatedon());
            keyInventory.setDeliverydate(cypKeyInventory.getDeliverydate());
            keyInventory.setDescription(cypKeyInventory.getDescription());
            keyInventory.setEnteringdate(cypKeyInventory.getEnteringdate());
            keyInventory.setIsactive(cypKeyInventory.getIsactive());
            keyInventory.setLastmodifiedby(cypKeyInventory.getLastmodifiedby());
            keyInventory.setLastmodifiedon(cypKeyInventory.getLastmodifiedon());
            keyInventory.setLastoperateflag(cypKeyInventory.getLastoperateflag());
            keyInventory.setOwner(cypKeyInventory.getOwner());
            keyInventory.setRowversion(cypKeyInventory.getRowversion());
            keyInventory.setSerialno(cypKeyInventory.getSerialno());
            keyInventory.setSource(cypKeyInventory.getSource());
            keyInventory.setTarget(cypKeyInventory.getTarget());
            if (cypKeyInventory.getTenantid() != null) {
                keyInventory.setTenantid(cypKeyInventory.getTenantid().toString());
            }
            keyInventory.setUrid(cypKeyInventory.getUrid());
            keyInventoryMapper.insertSelective(keyInventory);
        }

        //迁移KeyInventoryOps表
        List<CypKeyInventoryOps> cypKeyInventoryOpsList = cypKeyInventoryOpsMapper.selectAll();
        for (CypKeyInventoryOps cypKeyInventoryOps : cypKeyInventoryOpsList) {
            KeyInventoryOps keyInventoryOps = new KeyInventoryOps();
            keyInventoryOps.setDescription(cypKeyInventoryOps.getDescription());
            keyInventoryOps.setKeyinventoryid(cypKeyInventoryOps.getKeyinventoryid());
            keyInventoryOps.setOperatedate(cypKeyInventoryOps.getOperatedate());
            keyInventoryOps.setOperateflag(cypKeyInventoryOps.getOperateflag());
            keyInventoryOps.setOperateorgid(cypKeyInventoryOps.getOperateorgid());
            keyInventoryOps.setOperator(cypKeyInventoryOps.getOperator());
            keyInventoryOps.setSignature(cypKeyInventoryOps.getSignature());
            keyInventoryOps.setUrid(cypKeyInventoryOps.getUrid());
            keyInventoryOpsMapper.insertSelective(keyInventoryOps);
        }

        //迁移KeyPurchaseApply表
        List<CypKeyPurchaseApply> cypKeyPurchaseApplyList = cypKeyPurchaseApplyMapper.selectAll();
        for (CypKeyPurchaseApply cypKeyPurchaseApply : cypKeyPurchaseApplyList) {
            KeyPurchaseApply keyPurchaseApply = new KeyPurchaseApply();
            keyPurchaseApply.setApplicant(cypKeyPurchaseApply.getApplicant());
            keyPurchaseApply.setApplydate(cypKeyPurchaseApply.getApplydate());
            keyPurchaseApply.setApprovedate(cypKeyPurchaseApply.getApprovedate());
            keyPurchaseApply.setApprover(cypKeyPurchaseApply.getApprover());
            keyPurchaseApply.setCreatedby(cypKeyPurchaseApply.getCreatedby());
            keyPurchaseApply.setCreatedon(cypKeyPurchaseApply.getCreatedon());
            keyPurchaseApply.setDescription(cypKeyPurchaseApply.getDescription());
            keyPurchaseApply.setLastmodifiedby(cypKeyPurchaseApply.getLastmodifiedby());
            keyPurchaseApply.setLastmodifiedon(cypKeyPurchaseApply.getLastmodifiedon());
            keyPurchaseApply.setNumofkey(cypKeyPurchaseApply.getNumofkey());
            keyPurchaseApply.setOperateflag(cypKeyPurchaseApply.getOperateflag());
            keyPurchaseApply.setPackageid(cypKeyPurchaseApply.getPackageid());
            keyPurchaseApply.setReceiptdate(cypKeyPurchaseApply.getReceiptdate());
            keyPurchaseApply.setRecipient(cypKeyPurchaseApply.getRecipient());
            keyPurchaseApply.setRecipientaddress(cypKeyPurchaseApply.getRecipientaddress());
            keyPurchaseApply.setRecipientname(cypKeyPurchaseApply.getRecipientname());
            keyPurchaseApply.setRecipientphone(cypKeyPurchaseApply.getRecipientphone());
            keyPurchaseApply.setRecipientzipcode(cypKeyPurchaseApply.getRecipientzipcode());
            keyPurchaseApply.setRowversion(cypKeyPurchaseApply.getRowversion());
            keyPurchaseApply.setStartnum(cypKeyPurchaseApply.getStartnum());
            if (cypKeyPurchaseApply.getTenantid() != null) {
                keyPurchaseApply.setTenantid(cypKeyPurchaseApply.getTenantid().toString());
            }
            keyPurchaseApply.setUrid(cypKeyPurchaseApply.getUrid());
            keyPurchaseApplyMapper.insertSelective(keyPurchaseApply);
        }
        System.out.println("key库导出成功");
    }

    /**
     * @param []
     * @return void
     * @description 迁移数据到biz库
     * @author Meow
     * @date 2018-6-19
     */
    @Override
    @Transactional(rollbackFor = Exception.class, transactionManager = "bizTransactionManager")
    public void transferData2Biz() {

        //迁移AccountsPayable表
        Example example = new Example(CypAccountsPayable.class);
        Example.Criteria criteria = example.createCriteria();
        List<String> params = new ArrayList<>();
        params.add("100");
        params.add("103");
        params.add("8201");
        params.add("8202");
        params.add("8203");
        params.add("501");
        params.add("203");
        params.add("401");
        params.add("402");
        criteria.orIn("lastoperationflag", params);
        List<CypAccountsPayable> cypAccountsPayableList = cypAccountsPayableMapper.selectByExample(example);
        List<CypAccountsPayable> tempCypAccountsPayableList = new ArrayList<>();
        for (CypAccountsPayable cypAccountsPayable : cypAccountsPayableList) {
            Example example2 = new Example(CypAccountsPayableQuote.class);
            Example.Criteria criteria2 = example2.createCriteria();
            criteria2.andNotEqualTo("lastoperationflag", "303");
            criteria2.andEqualTo("accountspayableid", cypAccountsPayable.getUrid());
            criteria2.andEqualTo("isactive", "1");
            List<CypAccountsPayableQuote> cypAccountsPayableQuoteList = cypAccountsPayableQuoteMapper.selectByExample(example2);
            if (cypAccountsPayableQuoteList != null && cypAccountsPayableQuoteList.size() != 0) {
                continue;
            }
            tempCypAccountsPayableList.add(cypAccountsPayable);
            AccountsPayable accountsPayable = new AccountsPayable();
            accountsPayable.setAmount(cypAccountsPayable.getAmount());
            accountsPayable.setAttribute1(cypAccountsPayable.getAttribute1());
            accountsPayable.setAttribute2(cypAccountsPayable.getAttribute2());
            accountsPayable.setBankid(cypAccountsPayable.getBankid());
            accountsPayable.setBilldate(cypAccountsPayable.getBilldate());
            accountsPayable.setBusinesstype(cypAccountsPayable.getBusinesstype());
            accountsPayable.setContractid(cypAccountsPayable.getContractid());
            accountsPayable.setCorecompanyid(cypAccountsPayable.getCorecompanyid());
            accountsPayable.setCorecompanysupplierrate(cypAccountsPayable.getCorecompanysupplierrate());
            accountsPayable.setCreatedby(cypAccountsPayable.getCreatedby());
            accountsPayable.setCreatedon(cypAccountsPayable.getCreatedon());
            accountsPayable.setDescription(cypAccountsPayable.getDescription());
            accountsPayable.setExpiringdate(cypAccountsPayable.getExpiringdate());
            accountsPayable.setFinancingamount(cypAccountsPayable.getFinancingamount());
            accountsPayable.setFinancingdate(cypAccountsPayable.getFinancingdate());
            accountsPayable.setFreezeamount(cypAccountsPayable.getFreezeamount());
            accountsPayable.setInvoicenumber(cypAccountsPayable.getInvoicenumber());
            accountsPayable.setIsactive(cypAccountsPayable.getIsactive());
            accountsPayable.setIsfirstfinance(cypAccountsPayable.getIsfirstfinance());
            accountsPayable.setLastmodifiedby(cypAccountsPayable.getLastmodifiedby());
            accountsPayable.setLastmodifiedon(cypAccountsPayable.getLastmodifiedon());
            String flag = cypAccountsPayable.getLastoperationflag();
            switch (flag) {
                case "102":
                    accountsPayable.setLastoperationflag("101");
                    break;
                case "103":
                    accountsPayable.setLastoperationflag("102");
                    break;
                case "8102":
                    accountsPayable.setLastoperationflag("103");
                    break;
                case "8103":
                    accountsPayable.setLastoperationflag("103");
                    break;
                case "8101":
                    accountsPayable.setLastoperationflag("104");
                    break;
                case "202":
                    accountsPayable.setLastoperationflag("201");
                    break;
                case "203":
                    accountsPayable.setLastoperationflag("202");
                    break;
                case "8202":
                    accountsPayable.setLastoperationflag("203");
                    break;
                case "8203":
                    accountsPayable.setLastoperationflag("203");
                    break;
                case "8201":
                    accountsPayable.setLastoperationflag("204");
                    break;
                default:
                    accountsPayable.setLastoperationflag(cypAccountsPayable.getLastoperationflag());
                    break;
            }
            accountsPayable.setPayabledate(cypAccountsPayable.getPayabledate());
            accountsPayable.setPayableno(cypAccountsPayable.getPayableno());
            accountsPayable.setRowversion(cypAccountsPayable.getRowversion());
            accountsPayable.setSecuritydeposit(cypAccountsPayable.getSecuritydeposit());
            accountsPayable.setSignaturecontent(cypAccountsPayable.getSignaturecontent());
            accountsPayable.setSuppliercorerate(cypAccountsPayable.getSuppliercorerate());
            accountsPayable.setSupplierid(cypAccountsPayable.getSupplierid());
            accountsPayable.setSupplierrate(cypAccountsPayable.getSupplierrate());
            if (cypAccountsPayable.getTenantid() != null) {
                accountsPayable.setTenantid(cypAccountsPayable.getTenantid().toString());
            }
            accountsPayable.setUrid(cypAccountsPayable.getUrid());
            accountsPayableMapper.insertSelective(accountsPayable);
        }

        //迁移AccountsPayableQuote表
        List<CypAccountsPayableQuote> tempCypAccountsPayableQuoteList = new ArrayList<>();
        for (CypAccountsPayable accountsPayable2 : tempCypAccountsPayableList) {
            CypAccountsPayableQuote cypAccountsPayableQuote = new CypAccountsPayableQuote();
            cypAccountsPayableQuote.setAccountspayableid(accountsPayable2.getUrid());
            tempCypAccountsPayableQuoteList.addAll(cypAccountsPayableQuoteMapper.select(cypAccountsPayableQuote));
        }
        for (CypAccountsPayableQuote cypAccountsPayableQuote : tempCypAccountsPayableQuoteList) {
            AccountsPayableQuote accountsPayableQuote = new AccountsPayableQuote();
            accountsPayableQuote.setAccountspayableid(cypAccountsPayableQuote.getAccountspayableid());
            accountsPayableQuote.setBankid(cypAccountsPayableQuote.getBankid());
            accountsPayableQuote.setCreatedby(cypAccountsPayableQuote.getCreatedby());
            accountsPayableQuote.setCreatedon(cypAccountsPayableQuote.getCreatedon());
            accountsPayableQuote.setDescription(cypAccountsPayableQuote.getDescription());
            accountsPayableQuote.setEstimatereturndate(cypAccountsPayableQuote.getEstimatereturndate());
            accountsPayableQuote.setFinancingamount(cypAccountsPayableQuote.getFinancingamount());
            accountsPayableQuote.setFinancingcost(cypAccountsPayableQuote.getFinancingcost());
            accountsPayableQuote.setFinancingdate(cypAccountsPayableQuote.getFinancingdate());
            accountsPayableQuote.setIsactive(cypAccountsPayableQuote.getIsactive());
            accountsPayableQuote.setIsfirstquote(cypAccountsPayableQuote.getIsfirstquote());
            accountsPayableQuote.setIsrecourse(cypAccountsPayableQuote.getIsrecourse());
            accountsPayableQuote.setLastmodifiedby(cypAccountsPayableQuote.getLastmodifiedby());
            accountsPayableQuote.setLastmodifiedon(cypAccountsPayableQuote.getLastmodifiedon());
            accountsPayableQuote.setLastoperationflag(cypAccountsPayableQuote.getLastoperationflag());
            accountsPayableQuote.setNonrecoursediscount(cypAccountsPayableQuote.getNonrecoursediscount());
            accountsPayableQuote.setNonrecourseinterestrate(cypAccountsPayableQuote.getNonrecourseinterestrate());
            accountsPayableQuote.setRecoursediscount(cypAccountsPayableQuote.getRecoursediscount());
            accountsPayableQuote.setRecourseinterestrate(cypAccountsPayableQuote.getRecourseinterestrate());
            accountsPayableQuote.setRowversion(cypAccountsPayableQuote.getRowversion());
            accountsPayableQuote.setSignaturecontent(cypAccountsPayableQuote.getSignaturecontent());
            accountsPayableQuote.setSupplieraccountid(cypAccountsPayableQuote.getSupplieraccountid());
            accountsPayableQuote.setTatemplateid(cypAccountsPayableQuote.getTatemplateid());
            if (cypAccountsPayableQuote.getTenantid() != null) {
                accountsPayableQuote.setTenantid(cypAccountsPayableQuote.getTenantid().toString());
            }
            accountsPayableQuote.setUrid(cypAccountsPayableQuote.getUrid());
            accountsPayableQuoteMapper.insertSelective(accountsPayableQuote);
        }

        //迁移CoreCompanyQuota表
        List<CypCoreCompanyQuota> cypCoreCompanyQuotaList = cypCoreCompanyQuotaMapper.selectAll();
        for (CypCoreCompanyQuota cypCoreCompanyQuota : cypCoreCompanyQuotaList) {
            CoreCompanyQuota coreCompanyQuota = new CoreCompanyQuota();
            coreCompanyQuota.setAmountlimits(cypCoreCompanyQuota.getAmountlimits());
            coreCompanyQuota.setAvailableamount(cypCoreCompanyQuota.getAvailableamount());
            coreCompanyQuota.setCorecompanyid(cypCoreCompanyQuota.getCorecompanyid());
            coreCompanyQuota.setCreatedby(cypCoreCompanyQuota.getCreatedby());
            coreCompanyQuota.setCreatedon(cypCoreCompanyQuota.getCreatedon());
            coreCompanyQuota.setDescription(cypCoreCompanyQuota.getDescription());
            coreCompanyQuota.setFreezeamount(cypCoreCompanyQuota.getFreezeamount());
            coreCompanyQuota.setLastmodifiedby(cypCoreCompanyQuota.getLastmodifiedby());
            coreCompanyQuota.setLastmodifiedon(cypCoreCompanyQuota.getLastmodifiedon());
            coreCompanyQuota.setRowversion(cypCoreCompanyQuota.getRowversion());
            coreCompanyQuota.setUrid(cypCoreCompanyQuota.getUrid());
            coreCompanyQuotaMapper.insertSelective(coreCompanyQuota);
        }

        //迁移CoreCompanyQuotaOps表
        List<CypCoreCompanyQuotaOps> cypCoreCompanyQuotaOpsList = cypCoreCompanyQuotaOpsMapper.selectAll();
        for (CypCoreCompanyQuotaOps cypCoreCompanyQuotaOps : cypCoreCompanyQuotaOpsList) {
            CoreCompanyQuotaOps coreCompanyQuotaOps = new CoreCompanyQuotaOps();
            coreCompanyQuotaOps.setCorequotaid(cypCoreCompanyQuotaOps.getCorequotaid());
            coreCompanyQuotaOps.setDescription(cypCoreCompanyQuotaOps.getDescription());
            coreCompanyQuotaOps.setOperateamount(cypCoreCompanyQuotaOps.getOperateamount());
            coreCompanyQuotaOps.setOperatedate(cypCoreCompanyQuotaOps.getOperatedate());
            coreCompanyQuotaOps.setOperateflag(cypCoreCompanyQuotaOps.getOperateflag());
            coreCompanyQuotaOps.setOperateorgid(cypCoreCompanyQuotaOps.getOperateorgid());
            coreCompanyQuotaOps.setOperator(cypCoreCompanyQuotaOps.getOperator());
            coreCompanyQuotaOps.setSignature(cypCoreCompanyQuotaOps.getSignature());
            coreCompanyQuotaOps.setUrid(cypCoreCompanyQuotaOps.getUrid());
            coreCompanyQuotaOpsMapper.insertSelective(coreCompanyQuotaOps);
        }

        //迁移SupplierAccounts表
        List<CypSupplierAccounts> cypSupplierAccountsList = cypSupplierAccountsMapper.selectAll();
        for (CypSupplierAccounts cypSupplierAccounts : cypSupplierAccountsList) {
            SupplierAccounts supplierAccounts = new SupplierAccounts();
            supplierAccounts.setAccountname(cypSupplierAccounts.getAccountname());
            supplierAccounts.setAccountnumber(cypSupplierAccounts.getAccountnumber());
            supplierAccounts.setBankid(cypSupplierAccounts.getBankid());
            supplierAccounts.setBanklocationid(cypSupplierAccounts.getBanklocationid());
            supplierAccounts.setBusinesstype(cypSupplierAccounts.getBusinesstype());
            supplierAccounts.setCreatedby(cypSupplierAccounts.getCreatedby());
            supplierAccounts.setCreatedon(cypSupplierAccounts.getCreatedon());
            supplierAccounts.setDescription(cypSupplierAccounts.getDescription());
            supplierAccounts.setIsactive(cypSupplierAccounts.getIsactive());
            supplierAccounts.setLastmodifiedby(cypSupplierAccounts.getLastmodifiedby());
            supplierAccounts.setLastmodifiedon(cypSupplierAccounts.getLastmodifiedon());
            supplierAccounts.setRowversion(cypSupplierAccounts.getRowversion());
            supplierAccounts.setSupplierid(cypSupplierAccounts.getSupplierid());
            supplierAccounts.setUrid(cypSupplierAccounts.getUrid());
            supplierAccountsMapper.insertSelective(supplierAccounts);
        }

        //迁移Taoperations表
        List<CypTaoperations> cypTaoperationsList = cypTaoperationsMapper.selectAll();
        for (CypTaoperations cypTaoperations : cypTaoperationsList) {
            Taoperations taoperations = new Taoperations();
            taoperations.setCreatedby(cypTaoperations.getCreatedby());
            taoperations.setCreatedon(cypTaoperations.getCreatedon());
            taoperations.setLastmodifiedby(cypTaoperations.getLastmodifiedby());
            taoperations.setLastmodifiedon(cypTaoperations.getLastmodifiedon());
            taoperations.setOperateFlag(cypTaoperations.getOperateflag());
            taoperations.setRowversion(cypTaoperations.getRowversion());
            taoperations.setSignature(cypTaoperations.getSignature());
            taoperations.setTripartiteagreementid(cypTaoperations.getTripartiteagreementid());
            taoperations.setUrid(cypTaoperations.getUrid());
            taoperationsMapper.insertSelective(taoperations);
        }

        //迁移TradeAccounts表
        List<CypTradeAccounts> cypTradeAccountsList = cypTradeAccountsMapper.selectAll();
        for (CypTradeAccounts cypTradeAccounts : cypTradeAccountsList) {
            TradeAccounts tradeAccounts = new TradeAccounts();
            tradeAccounts.setAccountcategory(cypTradeAccounts.getAccountcategory());
            tradeAccounts.setAccountname(cypTradeAccounts.getAccountname());
            tradeAccounts.setAccountnumber(cypTradeAccounts.getAccountnumber());
            tradeAccounts.setAccountstate(cypTradeAccounts.getAccountstate());
            tradeAccounts.setAddress(cypTradeAccounts.getAddress());
            tradeAccounts.setCellphone(cypTradeAccounts.getCellphone());
            tradeAccounts.setCertnumber(cypTradeAccounts.getCertnumber());
            tradeAccounts.setCerttype(cypTradeAccounts.getCerttype());
            tradeAccounts.setContactname(cypTradeAccounts.getContactname());
            tradeAccounts.setCreatedby(cypTradeAccounts.getCreatedby());
            tradeAccounts.setCreatedon(cypTradeAccounts.getCreatedon());
            tradeAccounts.setDescription(cypTradeAccounts.getDescription());
            tradeAccounts.setEmail(cypTradeAccounts.getEmail());
            tradeAccounts.setLastmodifiedby(cypTradeAccounts.getLastmodifiedby());
            tradeAccounts.setLastmodifiedon(cypTradeAccounts.getLastmodifiedon());
            tradeAccounts.setOrgid(cypTradeAccounts.getOrgid());
            tradeAccounts.setRowversion(cypTradeAccounts.getRowversion());
            if (cypTradeAccounts.getTenantid() != null) {
                tradeAccounts.setTenantid(cypTradeAccounts.getTenantid().toString());
            }
            tradeAccounts.setUrid(cypTradeAccounts.getUrid());
            tradeAccountsMapper.insertSelective(tradeAccounts);
        }

        //迁移TradeBalances表
        List<CypTradeBalances> cypTradeBalancesList = cypTradeBalancesMapper.selectAll();
        for (CypTradeBalances cypTradeBalances : cypTradeBalancesList) {
            TradeBalances tradeBalances = new TradeBalances();
            tradeBalances.setAvailablebalance(cypTradeBalances.getAvailablebalance());
            tradeBalances.setBalance(cypTradeBalances.getBalance());
            tradeBalances.setClosingbalance(cypTradeBalances.getClosingbalance());
            tradeBalances.setCreatedby(cypTradeBalances.getCreatedby());
            tradeBalances.setCreatedon(cypTradeBalances.getCreatedon());
            tradeBalances.setDescription(cypTradeBalances.getDescription());
            tradeBalances.setLastmodifiedby(cypTradeBalances.getLastmodifiedby());
            tradeBalances.setLastmodifiedon(cypTradeBalances.getLastmodifiedon());
            tradeBalances.setRowversion(cypTradeBalances.getRowversion());
            tradeBalances.setTradeaccountsid(cypTradeBalances.getTradeaccountsid());
            tradeBalances.setUrid(cypTradeBalances.getUrid());
            tradeBalancesMapper.insertSelective(tradeBalances);
        }

        //迁移TradeTransActions表
        List<CypTradeTransActions> cypTradeTransActionsList = cypTradeTransActionsMapper.selectAll();
        for (CypTradeTransActions cypTradeTransActions : cypTradeTransActionsList) {
            TradeTransActions tradeTransActions = new TradeTransActions();
            tradeTransActions.setApprovestate(cypTradeTransActions.getApprovestate());
            tradeTransActions.setBalance(cypTradeTransActions.getBalance());
            tradeTransActions.setBusinessnumber(cypTradeTransActions.getBusinessnumber());
            tradeTransActions.setCreatedby(cypTradeTransActions.getCreatedby());
            tradeTransActions.setCreatedon(cypTradeTransActions.getCreatedon());
            tradeTransActions.setDescription(cypTradeTransActions.getDescription());
            tradeTransActions.setLastmodifiedby(cypTradeTransActions.getLastmodifiedby());
            tradeTransActions.setLastmodifiedon(cypTradeTransActions.getLastmodifiedon());
            tradeTransActions.setLedgeramount(cypTradeTransActions.getLedgeramount());
            tradeTransActions.setOperateflag(cypTradeTransActions.getOperateflag());
            tradeTransActions.setOrdernumber(cypTradeTransActions.getOrdernumber());
            tradeTransActions.setPostdatetime(cypTradeTransActions.getPostdatetime());
            tradeTransActions.setRowversion(cypTradeTransActions.getRowversion());
            tradeTransActions.setTradeaccountsid(cypTradeTransActions.getTradeaccountsid());
            tradeTransActions.setUrid(cypTradeTransActions.getUrid());
            tradeTransActionsMapper.insertSelective(tradeTransActions);
        }

        //迁移TripartiteAgreement表
        List<CypTripartiteAgreement> cypTripartiteAgreementList = cypTripartiteAgreementMapper.selectAll();
        for (CypTripartiteAgreement cypTripartiteAgreement : cypTripartiteAgreementList) {
            TripartiteAgreement tripartiteAgreement = new TripartiteAgreement();
            tripartiteAgreement.setAccountspayableid(cypTripartiteAgreement.getAccountspayableid());
            tripartiteAgreement.setAccountspayablequoteid(cypTripartiteAgreement.getAccountspayablequoteid());
            tripartiteAgreement.setAftersignflag(cypTripartiteAgreement.getAftersignflag());
            tripartiteAgreement.setApprovestate(cypTripartiteAgreement.getApprovestate());
            tripartiteAgreement.setBankid(cypTripartiteAgreement.getBankid());
            tripartiteAgreement.setBanklastoperateflag(cypTripartiteAgreement.getBanklastoperateflag());
            tripartiteAgreement.setBlockchainaddress(cypTripartiteAgreement.getAccountspayableid());
            tripartiteAgreement.setCorecompanyid(cypTripartiteAgreement.getCorecompanyid());
            tripartiteAgreement.setCorecompanyrate(cypTripartiteAgreement.getCorecompanyrate());
            tripartiteAgreement.setCorelastoperateflag(cypTripartiteAgreement.getCorelastoperateflag());
            tripartiteAgreement.setCreatedby(cypTripartiteAgreement.getCreatedby());
            tripartiteAgreement.setCreatedon(cypTripartiteAgreement.getCreatedon());
            tripartiteAgreement.setDescription(cypTripartiteAgreement.getDescription());
            tripartiteAgreement.setEstimatereturndate(cypTripartiteAgreement.getEstimatereturndate());
            tripartiteAgreement.setFinancingamount(cypTripartiteAgreement.getFinancingamount());
            tripartiteAgreement.setFinancingdate(cypTripartiteAgreement.getFinancingdate());
            tripartiteAgreement.setInterestrate(cypTripartiteAgreement.getInterestrate());
            tripartiteAgreement.setIsactive(cypTripartiteAgreement.getIsactive());
            tripartiteAgreement.setIsrecourse(cypTripartiteAgreement.getIsrecourse());
            tripartiteAgreement.setLastmodifiedby(cypTripartiteAgreement.getLastmodifiedby());
            tripartiteAgreement.setLastmodifiedon(cypTripartiteAgreement.getLastmodifiedon());
            tripartiteAgreement.setLendingafterflag(cypTripartiteAgreement.getLendingafterflag());
            tripartiteAgreement.setLendingdate(cypTripartiteAgreement.getLendingdate());
            tripartiteAgreement.setPdfContent(cypTripartiteAgreement.getSignaturecontent());
            tripartiteAgreement.setPdfSign(cypTripartiteAgreement.getSignaturecontent());
            tripartiteAgreement.setReturndate(cypTripartiteAgreement.getReturndate());
            tripartiteAgreement.setRowversion(cypTripartiteAgreement.getRowversion());
            tripartiteAgreement.setSignaturecontent(cypTripartiteAgreement.getSignaturecontent());
            tripartiteAgreement.setSupplastoperateflag(cypTripartiteAgreement.getSupplastoperateflag());
            tripartiteAgreement.setSupplieraccountid(cypTripartiteAgreement.getSupplieraccountid());
            tripartiteAgreement.setSupplierid(cypTripartiteAgreement.getSupplierid());
            tripartiteAgreement.setSupplierrate(cypTripartiteAgreement.getSupplierrate());
            tripartiteAgreement.setTacontractid(cypTripartiteAgreement.getTacontractid());
            tripartiteAgreement.setTatemplateid(cypTripartiteAgreement.getTatemplateid());
            if (cypTripartiteAgreement.getTenantid() != null) {
                tripartiteAgreement.setTenantid(cypTripartiteAgreement.getTenantid().toString());
            }
            tripartiteAgreement.setUrid(cypTripartiteAgreement.getUrid());
            tripartiteAgreementMapper.insertSelective(tripartiteAgreement);
        }

        //迁移TripartiteAgreementTemplate表
        List<CypTripartiteAgreementTemplate> cypTripartiteAgreementTemplateList = cypTripartiteAgreementTemplateMapper.selectAll();
        for (CypTripartiteAgreementTemplate cypTripartiteAgreementTemplate : cypTripartiteAgreementTemplateList) {
            TripartiteAgreementTemplate tripartiteAgreementTemplate = new TripartiteAgreementTemplate();
            tripartiteAgreementTemplate.setBankid(cypTripartiteAgreementTemplate.getBankid());
            tripartiteAgreementTemplate.setBusinesstype(cypTripartiteAgreementTemplate.getBusinesstype());
            tripartiteAgreementTemplate.setCorecompanyid(cypTripartiteAgreementTemplate.getCorecompanyid());
            tripartiteAgreementTemplate.setCreatedby(cypTripartiteAgreementTemplate.getCreatedby());
            tripartiteAgreementTemplate.setCreatedon(cypTripartiteAgreementTemplate.getCreatedon());
            tripartiteAgreementTemplate.setDescription(cypTripartiteAgreementTemplate.getDescription());
            tripartiteAgreementTemplate.setIsactive(cypTripartiteAgreementTemplate.getIsactive());
            tripartiteAgreementTemplate.setLastmodifiedby(cypTripartiteAgreementTemplate.getLastmodifiedby());
            tripartiteAgreementTemplate.setLastmodifiedon(cypTripartiteAgreementTemplate.getLastmodifiedon());
            tripartiteAgreementTemplate.setLastoperateflag(cypTripartiteAgreementTemplate.getLastoperateflag());
            tripartiteAgreementTemplate.setRowversion(cypTripartiteAgreementTemplate.getRowversion());
            tripartiteAgreementTemplate.setTatemplatecode(cypTripartiteAgreementTemplate.getTatemplatecode());
            tripartiteAgreementTemplate.setTatemplateversion(cypTripartiteAgreementTemplate.getTatemplateversion());
            tripartiteAgreementTemplate.setTemplatecontent(cypTripartiteAgreementTemplate.getTemplatecontent());
            if (cypTripartiteAgreementTemplate.getTenantid() != null) {
                tripartiteAgreementTemplate.setTenantid(cypTripartiteAgreementTemplate.getTenantid().toString());
            }
            tripartiteAgreementTemplate.setUrid(cypTripartiteAgreementTemplate.getUrid());
            tripartiteAgreementTemplateMapper.insertSelective(tripartiteAgreementTemplate);
        }

        //迁移CustomerTemplate表
        List<CypCustomerTemplate> cypCustomerTemplateList = cypCustomerTemplateMapper.selectAll();
        for (CypCustomerTemplate cypCustomerTemplate : cypCustomerTemplateList) {
            CustomerTemplate customerTemplate = new CustomerTemplate();
            customerTemplate.setCreatedby(cypCustomerTemplate.getCreatedby());
            customerTemplate.setCreatedon(cypCustomerTemplate.getCreatedon());
            customerTemplate.setDescription(cypCustomerTemplate.getDescription());
            customerTemplate.setIsactive(cypCustomerTemplate.getIsactive());
            customerTemplate.setLastmodifiedby(cypCustomerTemplate.getLastmodifiedby());
            customerTemplate.setLastmodifiedon(cypCustomerTemplate.getLastmodifiedon());
            customerTemplate.setOrgid(cypCustomerTemplate.getOrgid());
            customerTemplate.setRowversion(cypCustomerTemplate.getRowversion());
            customerTemplate.setTemplatecode(cypCustomerTemplate.getTemplatecode());
            customerTemplate.setTemplatecontent(cypCustomerTemplate.getTemplatecontent());
            customerTemplate.setTemplatename(cypCustomerTemplate.getTemplatename());
            customerTemplate.setTemplatetype(cypCustomerTemplate.getTemplatetype());
            customerTemplate.setUrid(cypCustomerTemplate.getUrid());
            customerTemplateMapper.insertSelective(customerTemplate);
        }

        //迁移UniqueCodes表
        List<CypUniqueCodes> cypUniqueCodesList = cypUniqueCodesMapper.selectAll();
        for (CypUniqueCodes cypUniqueCodes : cypUniqueCodesList) {
            UniqueCodes uniqueCodes = new UniqueCodes();
            uniqueCodes.setCreatedby(cypUniqueCodes.getCreatedby());
            uniqueCodes.setCreatedon(cypUniqueCodes.getCreatedon());
            uniqueCodes.setKeyname(cypUniqueCodes.getKeyname());
            uniqueCodes.setKeyvalue(cypUniqueCodes.getKeyvalue());
            uniqueCodes.setLastmodifiedby(cypUniqueCodes.getLastmodifiedby());
            uniqueCodes.setLastmodifiedon(cypUniqueCodes.getLastmodifiedon());
            uniqueCodes.setOrgid(cypUniqueCodes.getOrgid());
            uniqueCodes.setRowversion(cypUniqueCodes.getRowversion());
            uniqueCodesMapper.insertSelective(uniqueCodes);
        }
        System.out.println("biz库导出成功");
    }

    private Date intToDate(Integer dateNumber) throws Exception {
        if (dateNumber == null || dateNumber == 0) {
            return new Date();
        }
        String s = dateNumber.toString();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = format.parse(s);
        return date;
    }

    private Date intToDate(Integer dateNumber, Integer timeNumber) throws Exception {
        if (dateNumber == null || dateNumber == 0) {
            return new Date();
        }
        String s = dateNumber.toString() + timeNumber.toString();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = format.parse(s);
        return date;
    }

}
