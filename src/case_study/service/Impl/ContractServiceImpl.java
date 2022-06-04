package case_study.service.Impl;

import case_study.models.contract.Contract;
import case_study.service.ContractService;
import ss12_map_tree.bai_tap.product_mvc.util.ReadAndWrite;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();

    @Override
    public void display() {
        List<String[]> list = ReadAndWrite.readToFile("src/case_study/data/contract.csv");
        contractList.clear();
        for (String[] item : list) {
            Contract contract;
            contract = new Contract(item[0],item[1],item[2],item[3],item[4]);
            contractList.add(contract);
        }

        for (Contract item : contractList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }
}
