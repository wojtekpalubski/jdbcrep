package pl.asseco.ksi.rosu2eessi.svc;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.asseco.ksi.rosu2eessi.data.Wniosek;

@Log
@Service
public class Przesypywacz {
    @Autowired
    RosuSvc rosuSvc;

    public void przesyp(){
        Wniosek w=rosuSvc.pobierzWniosek(1L);
        System.out.println(w.toString());
    }
}
