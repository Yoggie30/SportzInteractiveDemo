package com.example.sportzinteractivedemo.data.mapper

import com.example.sportzinteractivedemo.data.model.*
import com.example.sportzinteractivedemo.module.home.model.*
import timber.log.Timber

fun assembleMatchDetailResponse(
    response: MatchDetailResponse
): MatchDetailModel {
    val matchDetailModel =MatchDetailModel(
        matchDetail = assembleMatchDetailModel(response.matchdetail),
        nuggets = response.nuggets,
        innings = assembleInningsModel(response.innings),
        teams = assembleTeamsResponse(response.teams),
        notes = assembleNotesModel(response.notes)
    )
    //Timber.e("assembleMatchDetailResponse-->$matchDetailModel")
    return matchDetailModel
}

//Match Detail Model
private fun assembleMatchDetailModel(response: MatchDetailDataResponse?): MatchDetailDataModel? {
    // val container = Gson().fromJson(matchJson.toString(), MatchModel::class.java);
    val matchDetailModel = response?.let {
        MatchDetailDataModel(
            teamHome = response.teamHome,
            teamAway = response.teamAway,
            match = assembleMatchModel(response.match),
            series = assembleSeriesModel(response.series),
            venue = assembleVenueModel(response.venue),
            officials = assembleOfficialsModel(response.officials),
            weather = response.weather,
            tossWonBy = response.tossWonBy,
            status = response.status,
            statusId = response.statusId,
            playerMatch = response.playerMatch,
            result = response.result,
            winningTeam = response.winningTeam,
            winMargin = response.winMargin,
            equation = response.equation
        )
    }
    return matchDetailModel
}

private fun assembleMatchModel(match: MatchResponse): MatchModel {
    return MatchModel(
        liveCoverage = match.liveCoverage,
        id = match.id,
        code = match.code,
        league = match.league,
        number = match.number,
        type = match.type,
        date = match.date,
        time = match.time,
        offset = match.offset,
        dayNight = match.dayNight
    )
}

private fun assembleSeriesModel(series: SeriesResponse): SeriesModel {
    return SeriesModel(
        id = series.id,
        name = series.name,
        status = series.status,
        tour = series.tour,
        tourName = series.tourName
    )
}

private fun assembleVenueModel(venue: VenueResponse): VenueModel {
    return VenueModel(
        id = venue.id,
        name = venue.name
    )
}

private fun assembleOfficialsModel(officials: OfficialsResponse): OfficialsModel {
    return OfficialsModel(
        umpires = officials.umpires,
        referee = officials.referee
    )
}

//NuggetsModel
private fun assembleNuggetsResponse(nuggets: ArrayList<String>): ArrayList<String> {
    val nuggetsList: ArrayList<String> = arrayListOf()
    for (i in 0 until nuggets.size) {
        nuggetsList.add(nuggets[i])
    }
    return nuggetsList
}

//InningsModel
private fun assembleInningsModel(innings: ArrayList<InningsResponse>?): ArrayList<InningsModel> {
    val inningsList: ArrayList<InningsModel> = arrayListOf()

    innings?.map {
        val model = InningsModel(
            number = it.number,
            battingTeam = it.battingTeam,
            total = it.total,
            wickets = it.wickets,
            overs = it.overs,
            runRate = it.runRate,
            byes = it.byes,
            legByes = it.legByes,
            wides = it.wides,
            noBalls = it.noBalls,
            penalty = it.penalty,
            allottedOvers = it.allottedOvers,
            batsmen = assembleBatsmenModel(it.batsmen),
            partnershipCurrent = assemblePartnershipCurrentModel(it.partnershipCurrent),
            bowlers = assembleBowlersModel(it.bowlers),
            fallOfWickets = assembleFallOfWicketsModel(it.fallOfWickets),
            powerPlay = assemblePowerPlayModel(it.powerPlay)
        )
        inningsList.add(model)
    }
    return inningsList
}

private fun assembleBatsmenModel(response: ArrayList<BatsmenResponse>): ArrayList<BatsmenModel> {
    val batmanList: ArrayList<BatsmenModel> = arrayListOf()
    response.map {
        batmanList.add(
            BatsmenModel(
                batsman = it.batsman,
                runs = it.runs,
                balls = it.balls,
                fours = it.fours,
                sixes = it.sixes,
                dots = it.dots,
                strikeRate = it.strikeRate,
                dismissal = it.dismissal,
                howOut = it.howOut,
                bowler = it.bowler,
                fielder = it.fielder
            )
        )
    }

    return batmanList
}

private fun assemblePartnershipCurrentModel(response: PartnershipCurrentResponse): PartnershipCurrentModel {
    return PartnershipCurrentModel(
        runs = response.runs,
        balls = response.balls,
        batsmen = assembleBatsmenCurrentModel(response.batsmen)
    )
}

private fun assembleBatsmenCurrentModel(batsmen: ArrayList<BatsmenCurrentResponse>): ArrayList<BatsmenCurrentModel> {
    val batmanList: ArrayList<BatsmenCurrentModel> = arrayListOf()
    batsmen.map {
        batmanList.add(
            BatsmenCurrentModel(
                batsman = it.batsman,
                runs = it.runs,
                balls = it.balls
            )
        )
    }
    return batmanList
}

private fun assembleBowlersModel(response: ArrayList<BowlersResponse>): ArrayList<BowlersModel> {
    val bowlersList: ArrayList<BowlersModel> = arrayListOf()

    response.map {
        bowlersList.add(
            BowlersModel(
                bowler = it.bowler,
                overs = it.overs,
                maidens = it.maidens,
                runs = it.runs,
                wickets = it.wickets,
                economyRate = it.economyRate,
                noBalls = it.noBalls,
                wides = it.wides,
                dots = it.dots
            )
        )
    }

    return bowlersList
}

private fun assembleFallOfWicketsModel(response: ArrayList<FallOfWicketsResponse>): ArrayList<FallOfWicketsModel> {
    val list: ArrayList<FallOfWicketsModel> = arrayListOf()

    response.map {
        list.add(
            FallOfWicketsModel(
                batsman = it.batsman,
                score = it.score,
                overs = it.overs
            )
        )
    }

    return list
}

private fun assemblePowerPlayModel(response: PowerPlayResponse): PowerPlayModel {
    return PowerPlayModel(
        PP1 = response.PP1,
        PP2 = response.PP2
    )
}

//TeamsModel
private fun assembleTeamsResponse(teams: Map<String, TeamsResponse>): HashMap<String, TeamsModel> {
    val teamHashMap: HashMap<String, TeamsModel> = hashMapOf()
    teams.map {
        val teamModel = assembleTeamsModelData(it.value)
        teamHashMap.put(it.key, teamModel)
    }
    return teamHashMap
}

private fun assembleTeamsModelData(teamsResponse: TeamsResponse): TeamsModel {
    val playersHashMap = assemblePlayerResponse(teamsResponse.players)
    return TeamsModel(
        nameFull = teamsResponse.nameFull,
        nameShort = teamsResponse.nameShort,
        players = playersHashMap
    )
}

private fun assemblePlayerResponse(playersResponse: Map<String, PlayersResponse>): HashMap<String, PlayersModel> {
    val playerHashMap: HashMap<String, PlayersModel> = hashMapOf()
    playersResponse.map {
        val playersModel = assemblePlayerData(it.value)
        playerHashMap.put(it.key, playersModel)
    }
    return playerHashMap
}

private fun assemblePlayerData(player: PlayersResponse): PlayersModel {
    return PlayersModel(
        position = player.position,
        nameFull = player.position,
        IsCaptain = player.IsCaptain,
        isKeeper = player.isKeeper,
        batting = assembleBattingModelData(player.batting),
        bowling = assembleBowlingModelData(player.bowling)
    )
}

private fun assembleBattingModelData(battingResponse: BattingResponse): BattingModel {
    return BattingModel(
        style = battingResponse.style,
        average = battingResponse.average,
        strikeRate = battingResponse.strikeRate,
        runs = battingResponse.runs
    )
}

private fun assembleBowlingModelData(bowlingResponse: BowlingResponse): BowlingModel {
    return BowlingModel(
        style = bowlingResponse.style,
        average = bowlingResponse.average,
        economyRate = bowlingResponse.economyRate,
        wickets = bowlingResponse.wickets
    )
}

//NotesModel
private fun assembleNotesModel(notes: Map<String, ArrayList<String>>): HashMap<String, ArrayList<String>> {
    val notesHashMap: HashMap<String, ArrayList<String>> = hashMapOf()
    notes.map {
        notesHashMap.put(it.key, it.value)
    }
    return notesHashMap
}






