package Posix;

public class Node {
	private Role r;
	private int propNr;
	private String value;
	private int previousPsn;
	int voterCount;
	
	ArrayList<char> nodes = new ArryList<char>(); // består av tre verdityper node, prop nr og value
			
	//legg til alle noder i systemet ved initialisering, sett verdier til 0 fordi de ikke har 
	//mottat noen propoal enda
	void addNode(node){
		add.node
		node.propnr = 0;
		node.value = 0;
	}
	
	//en node har mottatt en SQL av bruker og sender ut denne til voters
	void sendProposal(int propNr, int value){ //dette gjør proposer
		send propoalt til alle andre noedene (propnr, value);
	}
	
	//Voters mottar proposal fra proposer. Hvis de ikke ha tidigere mottatt et proposal med høyere
	//proposal number, vil de godta proposal og love å ikke ta imot andre proposal der proposal number 
	//er mindre enn dette proposal number.
	void receiveProposal(int value, int propnr){ // mypropnr er propnr til noden 
		if propnr > mypropnr{
			send løfte om å ikke si ja til propnr > this.propnr
			+ send myPropnr and myValue til proposer;
			myRole = acceptor
			myPropnr = propNr;
			voterCounter++; // teller antall som godtar: verdi holdes av coordinator
		}
		else{
			myRole = learner;
		}
	}
		
	
	//Hvis nok noder sier ja til proposal vil proposer bli leder og endrer sin value basert på svar fra
	//acceptors. Her er det sikkert greit at alle acceptorsene blir lagret i en egen liste sammen med sine
	//propNr og value. slik at etter at alle har sendt kan leader gå gjennom listen med propnr og lete etter 
	//største og sette sin value til verdien koblet mot dette propNr
	void receavePromis(acceptors.propnr,acceptors.value){ // dette gjør leaderen
		if vouterCounter > halvparten
			myRole = leader;
			myvalue = value to max(propnr from acceptors);
			sendAcceptedrequest(myPropnr, myValue);
		else
			forkast proposal;
			myRole = voter;
		
	}
	
	
	//Etter at leder har satt ny value på sitt proposal, mottar acceptorene denne value og skal se om de liker den
	//hvis acceptor har mottat ny proposal i mellomtiden (med da høyere propnr) sender den dette tilbake til lederen
	//lederen må da endre sin value igjen og sende ut accedptRequest på nytt
	void accepted(int value, int propnr){ //dette gjør voterne
		if(propnr > mypropNr){
			myvalue = value;
		}
		else{
			send(toLeaderMyValue&yPropnr);
			receivePromise();
			sendAcceptedRequest(leader.propnr, leader.value)
			accepted(value, propNr);
		}
	}
	
	//lederen sener ut propnr and value to all acceptors
	void sendAcceptedRequest(){
		en sendehjelpemetode
	}
	
	//leder tvinger learners til å oppdatere value if vourtCounter > halvparten
	void forceAcceptedUpdate(){
		
	}
	
	//for at learners også skal oppdateres
	void update(int value){ 
		if mottar en forcAcceptUpdate(value)
			oppdater value();
	}
	
	void becomLeader(node){
		//en node blir leder etter at den har mottatt en SQL fra bruker
	}
	
	//unntakshandling hvis leader node kræsjer midt i en operasjon
	void becomeNewLeader(){
		if gamle leder node kræser underveis i operasjonen
			try{
				velg gamle leder til ny leder (gamle leder restituerer kjapt nok)
			}
			catch{
				velg ny (en av acceptors)
			}
			eventually{
				sett gamle leder til acceptor
			}
	}

	private Role getRole() {
		return r;
	}


	private void setRole(Role r) {
		this.r = r;
	}

}
