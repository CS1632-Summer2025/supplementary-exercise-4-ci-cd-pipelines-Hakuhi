package edu.pitt.cs;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*; 

public interface RentACatSubmissionSubmission extends RentACat {
	public static RentACatSubmissionSubmission createInstance(InstanceType type) {
		switch (type) {
			case IMPL:
				return (RentACatSubmissionSubmission) new RentACatImpl();
			case BUGGY:
				return (RentACatSubmissionSubmission) new RentACatBuggy();
			case SOLUTION:
				return (RentACatSubmissionSubmission) new RentACatSolution();
			case MOCK:
			    RentACatSubmissionSubmission mockRentACat = Mockito.mock(RentACatSubmissionSubmission.class);
				    
				when(mockRentACat.listCats()).thenReturn("");
				when(mockRentACat.rentCat(anyInt())).thenReturn(false);
				when(mockRentACat.returnCat(anyInt())).thenReturn(false);
				when(mockRentACat.renameCat(anyInt(), anyString())).thenReturn(false);
                doNothing().when(mockRentACat).addCat(any(CatSubmissionSubmission.class));
    
    return mockRentACat;
			default:
				assert (false);
				return null;
		}
	}

	// WARNING: You are not allowed to change any part of the interface.
	// That means you cannot add any method nor modify any of these methods.

	public boolean returnCat(int id);

	public boolean rentCat(int id);

	public boolean renameCat(int id, String name);

	public String listCats();

	public void addCat(CatSubmissionSubmission c);
}
