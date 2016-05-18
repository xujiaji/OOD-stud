package com.example.jiana.myapplication.atm;

import android.provider.Contacts;

/** 交易类*/
abstract class Transaction {
    public abstract void Execute();
}

/**
 * Created by jiana on 16-5-5.
 */
public class ATM {



    /** 存款交易类*/
    class DepositTransaction extends Transaction {
        private DepositUI mDepositUI;
        public DepositTransaction(DepositUI mDepositUI) {
            this.mDepositUI = mDepositUI;
        }

        @Override
        public void Execute() {
            //...
            mDepositUI.RequestDepositAmount();
            //...
        }
    }

    /** 取款交易类*/
    class WithdrawalTransaction extends Transaction {
        private WithdrawalUI mWithdrawalUI;
        public WithdrawalTransaction(WithdrawalUI mWithdrawalUI) {
            this.mWithdrawalUI = mWithdrawalUI;
        }
        @Override
        public void Execute() {
            //...
            mWithdrawalUI.RequestWithdrawalAmount();
            //...
        }
    }

    /** 转账交易类*/
    class TransferTransaction extends Transaction {
        private TransferUI mTransferUI;
        public TransferTransaction(TransferUI mTransferUI) {
            this.mTransferUI = mTransferUI;
        }
        @Override
        public void Execute() {
            //...
            mTransferUI.RequestTransferAmount();
            //...
        }
    }



    UI GUI;
    void fun() {
        DepositTransaction mDepositTransaction = new DepositTransaction(GUI);
    }

}

/** 存款UI接口*/
interface DepositUI {
    void RequestDepositAmount();
}

/** 取款UI接口*/
interface WithdrawalUI {
    void RequestWithdrawalAmount();
}

/** 转账UI接口*/
interface TransferUI {
    void RequestTransferAmount();
}

/** UI接口继承所有的交易接口*/
interface UI extends DepositUI, WithdrawalUI, TransferUI{

}


class UIGlobals {
    public static DepositUI mDepositUI;
    public static WithdrawalUI mWithdrawalUI;
    public static TransferUI mTransferUI;
    public UIGlobals(UI lui) {
        UIGlobals.mDepositUI = lui;
        UIGlobals.mWithdrawalUI = lui;
        UIGlobals.mTransferUI = lui;
    }

}

/** 转账交易类*/
class TransferTransaction extends Transaction {
    @Override
    public void Execute() {
        //...
        UIGlobals.mTransferUI.RequestTransferAmount();
        //...
    }
}

/**
 * 使用
 */
class A {

    //初始化UI静态类
    UIGlobals mUIGlobals = new UIGlobals(new UIEntity());

    //调用姿势
    void fun() {
        Transaction mTransaction = new TransferTransaction();
        mTransaction.Execute();
    }
}

/**
 * UI的实现类
 */
class UIEntity implements UI {

    @Override
    public void RequestDepositAmount() {

    }

    @Override
    public void RequestTransferAmount() {

    }

    @Override
    public void RequestWithdrawalAmount() {

    }
}